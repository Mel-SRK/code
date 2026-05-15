#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <windows.h>
#include <timeapi.h>
#include <ctype.h>

#include <array>
#include <vector>
#include <string>
#include <unordered_map>
#include <stdexcept>
#include <cstdint>
#include <cctype>

// ========================================
//  2x2x2 魔方加密（来自 mofang.cpp 的加密逻辑）
//  说明：对每个 8 字节块执行：按动作加数(mod256) + 角块置换；最后 Base64 输出
// ========================================
namespace g3 {

    using Perm8 = std::array<uint8_t, 8>;

    struct MoveSpec {
        Perm8 perm;                 // old_index -> new_index
        std::array<uint8_t, 8> add;  // 加密时在 old 位置加多少（mod 256）
    };

    // ---------- Base64(仅加密用到 encode) ----------
    static const char* ahr2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    static std::string fafe2(const std::vector<uint8_t>& data) {
        std::string out;
        out.reserve(((data.size() + 2) / 3) * 4);

        size_t i = 0;
        while (i + 3 <= data.size()) {
            uint32_t n = (uint32_t(data[i]) << 16) | (uint32_t(data[i + 1]) << 8) | uint32_t(data[i + 2]);
            out.push_back(ahr2[(n >> 18) & 63]);
            out.push_back(ahr2[(n >> 12) & 63]);
            out.push_back(ahr2[(n >> 6) & 63]);
            out.push_back(ahr2[n & 63]);
            i += 3;
        }

        size_t rem = data.size() - i;
        if (rem == 1) {
            uint32_t n = (uint32_t(data[i]) << 16);
            out.push_back(ahr2[(n >> 18) & 63]);
            out.push_back(ahr2[(n >> 12) & 63]);
            out.push_back('=');
            out.push_back('=');
        }
        else if (rem == 2) {
            uint32_t n = (uint32_t(data[i]) << 16) | (uint32_t(data[i + 1]) << 8);
            out.push_back(ahr2[(n >> 18) & 63]);
            out.push_back(ahr2[(n >> 12) & 63]);
            out.push_back(ahr2[(n >> 6) & 63]);
            out.push_back('=');
        }

        return out;
    }

    // ---------- PKCS#7 padding (block=8) ----------
    static std::vector<uint8_t> pkcs7_pad(const std::vector<uint8_t>& data, size_t block = 8) {
        if (block == 0) throw std::runtime_error("block size must be > 0");
        size_t pad = block - (data.size() % block);
        if (pad == 0) pad = block;

        std::vector<uint8_t> out = data;
        out.insert(out.end(), pad, uint8_t(pad));
        return out;
    }

    // ---------- 置换/反置换与加减 ----------
    static Perm8 invert_perm(const Perm8& p_old_to_new) {
        Perm8 inv{};
        for (uint8_t old = 0; old < 8; ++old) {
            uint8_t nw = p_old_to_new[old];
            inv[nw] = old;
        }
        return inv;
    }

    static std::array<uint8_t, 8> hsg32(const std::array<uint8_t, 8>& block, const Perm8& p_old_to_new) {
        std::array<uint8_t, 8> out{};
        for (uint8_t old = 0; old < 8; ++old) {
            out[p_old_to_new[old]] = block[old];
        }
        return out;
    }

    static inline uint8_t h3a(uint8_t v, uint8_t a) {
        return uint8_t((uint16_t(v) + uint16_t(a)) & 0xFF);
    }

    // 一步加密：先加，再置换
    static std::array<uint8_t, 8> bbb4532(const std::array<uint8_t, 8>& block, const MoveSpec& ms) {
        std::array<uint8_t, 8> tmp{};
        for (int i = 0; i < 8; ++i) tmp[i] = h3a(block[i], ms.add[i]);
        return hsg32(tmp, ms.perm);
    }

    static std::array<uint8_t, 8> knw345(const std::vector<int>& idxs, uint8_t k) {
        std::array<uint8_t, 8> a{};
        for (int id : idxs) a[id] = k;
        return a;
    }

    // 动作表（与 mofang.cpp 保持一致）
    static std::unordered_map<std::string, MoveSpec> vs35z() {
        std::unordered_map<std::string, MoveSpec> mv;

        mv["R"].perm = Perm8{ 0,5,2,1,4,7,6,3 };
        mv["L"].perm = Perm8{ 2,1,6,3,0,5,4,7 };
        mv["U"].perm = Perm8{ 0,1,6,2,4,5,7,3 };
        mv["D"].perm = Perm8{ 1,5,2,3,0,4,6,7 };
        mv["F"].perm = Perm8{ 0,1,2,3,6,4,7,5 };
        mv["B"].perm = Perm8{ 1,3,0,2,4,5,6,7 };

        mv["R"].add = knw345({ 1,3,5,7 }, 1);
        mv["L"].add = knw345({ 0,2,4,6 }, 2);
        mv["U"].add = knw345({ 2,3,6,7 }, 3);
        mv["D"].add = knw345({ 0,1,4,5 }, 4);
        mv["F"].add = knw345({ 4,5,6,7 }, 5);
        mv["B"].add = knw345({ 0,1,2,3 }, 6);

        mv["R'"].perm = invert_perm(mv["R"].perm); mv["R'"].add = knw345({ 1,3,5,7 }, 7);
        mv["L'"].perm = invert_perm(mv["L"].perm); mv["L'"].add = knw345({ 0,2,4,6 }, 8);
        mv["U'"].perm = invert_perm(mv["U"].perm); mv["U'"].add = knw345({ 2,3,6,7 }, 9);
        mv["D'"].perm = invert_perm(mv["D"].perm); mv["D'"].add = knw345({ 0,1,4,5 }, 10);
        mv["F'"].perm = invert_perm(mv["F"].perm); mv["F'"].add = knw345({ 4,5,6,7 }, 11);
        mv["B'"].perm = invert_perm(mv["B"].perm); mv["B'"].add = knw345({ 0,1,2,3 }, 12);

        return mv;
    }

    static std::vector<std::string> kxe465(const std::string& key) {
        std::vector<std::string> toks;
        std::string cur;
        for (char ch : key) {
            if (std::isspace(static_cast<unsigned char>(ch))) {
                if (!cur.empty()) { toks.push_back(cur); cur.clear(); }
            }
            else {
                cur.push_back(ch);
            }
        }
        if (!cur.empty()) toks.push_back(cur);
        return toks;
    }

    static std::string n6x3(std::string s) {
        for (char& c : s) c = char(std::toupper(static_cast<unsigned char>(c)));
        return s;
    }

    // 把 "R2" 展开为 "R","R"
    static std::vector<std::string> g6k2(
        const std::string& key,
        const std::unordered_map<std::string, MoveSpec>& moves
    ) {
        std::vector<std::string> seq;
        for (auto tok : kxe465(key)) {
            tok = n6x3(tok);

            int times = 1;
            if (!tok.empty() && tok.back() == '2') {
                times = 2;
                tok.pop_back();
            }

            if (moves.find(tok) == moves.end()) {
                throw std::runtime_error("Unknown move token");
            }
            for (int i = 0; i < times; ++i) seq.push_back(tok);
        }
        return seq;
    }

    static std::string k1c7(const std::string& plaintext_utf8, const std::string& key) {
        static const std::unordered_map<std::string, MoveSpec> moves = vs35z();
        std::vector<uint8_t> data(plaintext_utf8.begin(), plaintext_utf8.end());
        data = pkcs7_pad(data, 8);

        auto seq = g6k2(key, moves);

        std::vector<uint8_t> out;
        out.reserve(data.size());

        for (size_t i = 0; i < data.size(); i += 8) {
            std::array<uint8_t, 8> block{};
            for (int j = 0; j < 8; ++j) block[j] = data[i + j];

            for (const auto& m : seq) {
                block = bbb4532(block, moves.at(m));
            }

            for (int j = 0; j < 8; ++j) out.push_back(block[j]);
        }

        return fafe2(out);
    }

} // namespace mofang_cipher

// ========================================
//         全局常量 & 宏定义
// ========================================

#define INITIAL_TIME_SECONDS 10
#define TIME_BONUS_PER_STAGE 10

#define PASSWORD1_MAX_LEN 64
#define PASSWORD2_MAX_LEN 64
#define PASSWORD3_MAX_LEN 64

#define MAZE_WIDTH  4
#define MAZE_HEIGHT 4

// ========================================
//       结构体定义
// ========================================
typedef struct {
    int seconds;
    HANDLE timer_thread;
    volatile bool exploded;
    CRITICAL_SECTION lock;

    // 轻量计时完整性：用 tick 校验是否被极端篡改
    DWORD tick_start;
    volatile LONG tick_guard;
} BombTimer;

// ========================================
//       全局状态：关卡依赖数据
// ========================================
static int g_a[5] = { 2,3,4,5,6 };
static int g_e[5] = { 14,9,16,25,48 };

static unsigned char g_maze[MAZE_WIDTH * MAZE_HEIGHT] = { 0 };
static bool g_maze_inited = false;

static uint32_t g_stage1_hash = 0; // 用于派生后续

// ========================================
//       函数声明
// ========================================
void b5s5(void);
void n55k1(const char* type);

void l3x7(BombTimer* timer, int initial_seconds);
void n4b8(BombTimer* timer);
void x4n7(BombTimer* timer);
void k7sa4(BombTimer* timer, int delta);
DWORD WINAPI b5k8(LPVOID arg);
void b6j7(BombTimer* timer);

bool v4j8(void);
bool d6b8(void);
bool j8j7(void);
void a5a3(void);

bool sg6j(const char* input);
bool d5n7(const char* input);
bool s6m8(const char* input);

void n6s3(unsigned char* maze_out);

void n7l5(int stage, BombTimer* timer, int time_bonus);
void d4n6(char* buffer, size_t size);
void h5b5(const char* pw1, const char* pw2, const char* pw3);

// ========================================
//       小工具：hash / key 解码 / 派生逻辑
// ========================================
static uint32_t fnv1a32(const char* s) {
    uint32_t h = 0x811C9DC5u;
    while (*s) {
        h ^= (uint8_t)(*s);
        h *= 0x01000193u;
        ++s;
    }
    return h;
}

static std::string h5m77(const uint8_t* enc, size_t n, uint8_t k) {
    std::string out;
    out.resize(n);
    for (size_t i = 0; i < n; ++i) out[i] = char(enc[i] ^ k);
    return out;
}
static uint32_t d4bb6(uint32_t* st) {
    // 常见 LCG 参数
    *st = (*st * 1664525u + 1013904223u);
    return *st;
}
// 目标解固定为 31337；但把系数/目标值由第一关派生，从而三关绑定
static void d4n7(uint32_t h) {
    // 基础系数
    const int base_a[5] = { 2, 3, 4, 5, 6 };

    // 用hash派生系数的微调量
    for (int i = 0; i < 5; ++i) {
        int delta = (int)((h >> (i * 6)) & 0x3);  // 0..3
        g_a[i] = base_a[i] + delta;
    }

    // 用hash派生第二关的解（4个两位数+个位数）
    uint32_t seed = h ^ 0x12345678u;
    uint32_t state = seed;
    int x[5];

    for (int i = 0; i < 5; ++i) {
        d4bb6(&state);
        // 生成10-99的两位数
        if (i != 0)
        {
            x[i] = 10 + (int)(state % 90);
        }
        else if (i == 0)
        {
            x[i] = (int)(state % 10);
        }

    }

    // 根据动态生成的解计算目标值
    g_e[0] = g_a[0] * x[0] + x[1] + x[4];  // e1 = a1*x1 + x2 + x5
    g_e[1] = x[0] + g_a[1] * x[1] + x[2];  // e2 = x1 + a2*x2 + x3
    g_e[2] = x[1] + g_a[2] * x[2] + x[3];  // e3 = x2 + a3*x3 + x4
    g_e[3] = x[2] + g_a[3] * x[3] + x[4];  // e4 = x3 + a4*x4 + x5
    g_e[4] = x[0] + x[3] + g_a[4] * x[4];  // e5 = x1 + x4 + a5*x5
}

// 根据 seed 生成 4x4 迷宫，保证从 (0,0) 到 (3,3) 至少有一条路
static void b5k8(uint32_t seed) {
    memset(g_maze, 0, sizeof(g_maze));

    auto idx = [](int x, int y) { return y * MAZE_WIDTH + x; };

    uint32_t st = seed ^ 0x9E3779B9u;
    int x = 0, y = 0;
    g_maze[idx(x, y)] = 1;

    // 先 carve 一条保证路径：随机偏向右/下推进，直到到达终点
    while (!(x == 3 && y == 3)) {
        uint32_t r = d4bb6(&st);
        bool canR = (x < 3);
        bool canD = (y < 3);

        int move = 0;
        if (canR && canD) {
            move = (r & 1) ? 1 : 2; // 1=R,2=D
        }
        else if (canR) {
            move = 1;
        }
        else {
            move = 2;
        }

        if (move == 1) x++;
        else y++;

        g_maze[idx(x, y)] = 1;
    }

    // 再随机打开一些格子，增加分支
    for (int k = 0; k < 16; ++k) {
        uint32_t r = d4bb6(&st);
        int p = (int)(r % 16);
        // 保留起点终点
        if (p == idx(0, 0) || p == idx(3, 3)) continue;

        // 约 0% 概率打开
        if ((r % 100) < -0.1) g_maze[p] = 1;
    }

    g_maze_inited = true;
}

// 轻量计时完整性检查：用于“随手关掉倒计时”的成本提高一点点（不追求硬核反篡改）
static bool nn5s4(BombTimer* timer) {
    if (!timer) return true;

    DWORD now = GetTickCount();
    DWORD elapsed_ms = now - timer->tick_start;
    int expected_floor = (int)(elapsed_ms / 1000);

    // seconds 理论上应接近 initial - elapsed + bonus；允许较大误差（避免误杀卡顿）
    EnterCriticalSection(&timer->lock);
    int s = timer->seconds;
    LeaveCriticalSection(&timer->lock);

    // 如果时间“倒着跑”得太离谱（比如秒数长期不减且 elapsed 很大），判定异常
    if (expected_floor > 30 && s > INITIAL_TIME_SECONDS + 3 * TIME_BONUS_PER_STAGE + 5) {
        return false;
    }

    // guard：防止把 tick_guard 直接清掉（仍然是轻量）
    if (timer->tick_guard != (LONG)(timer->tick_start ^ 0x13579BDFu)) return false;

    return true;
}

// ========================================
//            主函数入口
// ========================================
int main(void) {
    BombTimer timer;
    char password1[PASSWORD1_MAX_LEN] = { 0 };
    char password2[PASSWORD2_MAX_LEN] = { 0 };
    char password3[PASSWORD3_MAX_LEN] = { 0 };

    b5s5();

    l3x7(&timer, INITIAL_TIME_SECONDS);
    n4b8(&timer);

    /*----------------------------------------
     * 第一关：字符串变换验证
     *----------------------------------------*/
    if (!v4j8()) {
        printf("检测到调试器！\n");
        b6j7(&timer);
    }

    printf("\n进行拆除，输入密码：");
    d4n6(password1, sizeof(password1));

    if (!sg6j(password1)) {
        printf("\n 密码错误！\n");
        b6j7(&timer);
    }

    // 第一关通过后，派生第二关参数（绑定三关）
    d4n7(g_stage1_hash);

    k7sa4(&timer, TIME_BONUS_PER_STAGE);
    n7l5(1, &timer, TIME_BONUS_PER_STAGE);

    /*----------------------------------------
     * 第二关：线性方程组验证（参数由第一关派生）
     *----------------------------------------*/
    if (!d6b8()) {
        printf("检测到异常延时！\n");
        b6j7(&timer);
    }
    if (!nn5s4(&timer)) {
        printf("检测到计时异常！\n");
        b6j7(&timer);
    }

    printf("怎么还有一层!");
    printf("\n进行第二次拆除，输入第二段密码：");
    d4n6(password2, sizeof(password2));

    if (!d5n7(password2)) {
        printf("\n 密码错误！\n");
        b6j7(&timer);
    }

    // 第二关通过后，用第二关解派生迷宫 seed（绑定第三关）
    {
        uint32_t seed = (uint32_t)atoi(password2);
        seed ^= (g_stage1_hash * 0x9E3779B1u);
        b5k8(seed);
    }

    k7sa4(&timer, TIME_BONUS_PER_STAGE);
    n7l5(2, &timer, TIME_BONUS_PER_STAGE);

    /*----------------------------------------
     * 第三关：迷宫路径验证（迷宫由第二关派生）
     *----------------------------------------*/
    a5a3();
    if (!nn5s4(&timer)) {
        printf("检测到计时异常！\n");
        b6j7(&timer);
    }

    printf("怎么还有一层!");
    printf("\n进行第三次拆除，输入第三段密码：");
    d4n6(password3, sizeof(password3));

    if (!s6m8(password3)) {
        printf("\n 路径错误！\n");
        b6j7(&timer);
    }

    k7sa4(&timer, TIME_BONUS_PER_STAGE);
    n7l5(3, &timer, TIME_BONUS_PER_STAGE);

    /*----------------------------------------
     * 成功
     *----------------------------------------*/
    timer.exploded = true;
    x4n7(&timer);

    {
        unsigned int s[] = { 0x63637573,0x0A737365 }; // "succ" "ess\n"
        fwrite(s, 1, 8, stdout);
    }
    n55k1("success");

    h5b5(password1, password2, password3);
    return 0;
}

// ========================================
//       函数实现（Windows 版）
// ========================================
void b5s5(void) {
    printf("警告！检测到炸弹装置！\n");
    printf("还有%d 秒的时间...\n", INITIAL_TIME_SECONDS);
}

void n55k1(const char* type) {
    if (strcmp(type, "explosion") == 0) {
        printf("\n BOOM!\n");
    }
    else if (strcmp(type, "success") == 0) {
    }
}

void l3x7(BombTimer* timer, int initial_seconds) {
    timer->seconds = initial_seconds;
    timer->exploded = false;
    InitializeCriticalSection(&timer->lock);

    timer->tick_start = GetTickCount();
    timer->tick_guard = (LONG)(timer->tick_start ^ 0x13579BDFu);
}

void n4b8(BombTimer* timer) {
    timer->timer_thread = CreateThread(NULL, 0, b5k8, timer, 0, NULL);
}

void x4n7(BombTimer* timer) {
    timer->exploded = true;
    WaitForSingleObject(timer->timer_thread, INFINITE);
    CloseHandle(timer->timer_thread);
    DeleteCriticalSection(&timer->lock);
}

void k7sa4(BombTimer* timer, int delta) {
    EnterCriticalSection(&timer->lock);
    timer->seconds += delta;
    LeaveCriticalSection(&timer->lock);
}

DWORD WINAPI b5k8(LPVOID arg) {
    BombTimer* timer = (BombTimer*)arg;

    while (!timer->exploded) {
        EnterCriticalSection(&timer->lock);
        int s = timer->seconds;
        LeaveCriticalSection(&timer->lock);

        if (s <= 0) break;

        Sleep(1000);

        EnterCriticalSection(&timer->lock);
        timer->seconds--;
        LeaveCriticalSection(&timer->lock);
    }

    if (!timer->exploded) {
        b6j7(timer);
    }
    return 0;
}

void b6j7(BombTimer* timer) {
    if (timer) {
        timer->exploded = true;
    }
    printf("\n BOOM! 炸弹爆炸了！\n");
    n55k1("explosion");
    exit(0);
}

bool v4j8(void) {
    if (IsDebuggerPresent()) return false;
    return true;
}

bool d6b8(void) {
    DWORD start = GetTickCount();
    Sleep(100);
    DWORD end = GetTickCount();
    if ((end - start) > 200) return false;
    return true;
}

bool j8j7(void) {
    return true;
}

void a5a3(void) {
    if (!j8j7()) {
        printf("检测到断点！\n");
        b6j7(NULL);
    }
}

/*----------------------------------------
 * 第一关：不再明文存 expected cipher；改为 hash 对比
 *  - key 做 XOR 编码
 *  - expected 只存“hash^mask”
 *----------------------------------------*/
bool sg6j(const char* input) {
    // 仍然限制 8 字符（你也可以把这一条去掉/放宽）
    if (input == NULL) return false;
    size_t n = strlen(input);
    if (n != 8) return false;

    for (size_t i = 0; i < n; ++i) {
        unsigned char c = (unsigned char)input[i];
        if (c < 0x21 || c > 0x7E) return false;
    }

    // key: "R U F R' D2" 经过 XOR(0x5A) 编码，避免明文出现
    static const uint8_t enc_key[] = {
        (uint8_t)('R' ^ 0x5A), (uint8_t)(' ' ^ 0x5A), (uint8_t)('U' ^ 0x5A), (uint8_t)(' ' ^ 0x5A),
        (uint8_t)('F' ^ 0x5A), (uint8_t)(' ' ^ 0x5A), (uint8_t)('R' ^ 0x5A), (uint8_t)('\'' ^ 0x5A),
        (uint8_t)(' ' ^ 0x5A), (uint8_t)('D' ^ 0x5A), (uint8_t)('2' ^ 0x5A)
    };

    // 期望值：FNV1a(cipher_string) ^ mask
    // 这里的常量对应你之前设置的正确明文（不在二进制里直接出现 expected cipher）
    static const uint32_t MASK = 0xA5A5A5A5u;
    static const uint32_t EXPECT_OBF = 0xCB040F00u; // generated for stage1=CGKKIURA

    try {
        std::string key = h5m77(enc_key, sizeof(enc_key), 0x5A);
        std::string cipher = g3::k1c7(std::string(input), key);
        uint32_t h = fnv1a32(cipher.c_str());

        // 保存下来用于派生下一关
        g_stage1_hash = h;

        return ((h ^ MASK) == EXPECT_OBF);
    }
    catch (...) {
        return false;
    }
}

/*----------------------------------------
 * 第二关：系数/目标由第一关派生（derive_stage2_params_from_stage1）
 *----------------------------------------*/
bool d5n7(const char* input) {
    if (input == NULL) return false;
    if (strlen(input) != 9) return false;

    int x[9];
    for (int i = 0; i < 9; i++) {
        if (!isdigit((unsigned char)input[i])) return false;
        x[i] = input[i] - '0';
    }

    int x1 = x[0], x2 = x[1] * 10 + x[2], x3 = x[3] * 10 + x[4],
        x4 = x[5] * 10 + x[6], x5 = x[7] * 10 + x[8];

    int e1 = g_a[0] * x1 + x2 + x5;
    int e2 = x1 + g_a[1] * x2 + x3;
    int e3 = x2 + g_a[2] * x3 + x4;
    int e4 = x3 + g_a[3] * x4 + x5;
    int e5 = x1 + x4 + g_a[4] * x5;

    if (e1 == g_e[0] && e2 == g_e[1] && e3 == g_e[2] && e4 == g_e[3] && e5 == g_e[4]) {
        return true;
    }
    return false;
}

/*----------------------------------------
 * 第三关：迷宫由第二关 seed 生成（generate_maze_from_seed）
 *----------------------------------------*/
void n6s3(unsigned char* maze_out) {
    if (!g_maze_inited) {
        // 如果有人跳过第二关直接来第三关，给一个默认 seed（仍然可跑）
        b5k8(0xC0FFEEu);
    }
    memcpy(maze_out, g_maze, sizeof(g_maze));
}

bool s6m8(const char* input) {
    if (input == NULL) return false;

    unsigned char maze[MAZE_WIDTH * MAZE_HEIGHT];
    n6s3(maze);

    int x = 0, y = 0;

    for (size_t i = 0; i < strlen(input); i++) {
        char c = input[i];
        switch (c) {
        case 'L': x--; break;
        case 'R': x++; break;
        case 'U': y--; break;
        case 'D': y++; break;
        default:
            return false;
        }

        if (x < 0 || x >= MAZE_WIDTH || y < 0 || y >= MAZE_HEIGHT)
            return false;

        if (maze[y * MAZE_WIDTH + x] == 0)
            return false;
    }

    return (x == 3 && y == 3);
}

void n7l5(int stage, BombTimer* timer, int time_bonus) {
    printf("引线 %c 已拆除\n", 'A' + stage - 1);
}

void d4n6(char* buffer, size_t size) {
    if (!fgets(buffer, (int)size, stdin)) {
        b6j7(NULL);
    }
    size_t len = strlen(buffer);
    if (len > 0 && buffer[len - 1] == '\n') {
        buffer[len - 1] = '\0';
    }
}

void h5b5(const char* pw1, const char* pw2, const char* pw3) {
    // enc[i] = "Flag: ISCC{"[i] ^ 0x5A  （不可打印，strings/反编译不易直接还原为明文字符串）
    static const unsigned char enc[11] = {
        0x1C,0x36,0x3B,0x3D,0x60,0x7A,0x13,0x09,0x19,0x19,0x21
    };

    for (int i = 0; i < 11; ++i) putchar((int)(enc[i] ^ 0x5A));
    fputs(pw1 ? pw1 : "", stdout);
    fputs(pw2 ? pw2 : "", stdout);
    fputs(pw3 ? pw3 : "", stdout);
    putchar('}');
    putchar('\n');
}
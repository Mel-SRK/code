package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bw implements oj, r9, ny, qd0 {
    public final /* synthetic */ int d;
    public static final b8 e = new b8(-1.0f, -1.0f);
    public static final b8 f = new b8(0.0f, -1.0f);
    public static final b8 g = new b8(1.0f, -1.0f);
    public static final b8 h = new b8(-1.0f, 0.0f);
    public static final b8 i = new b8(0.0f, 0.0f);
    public static final b8 j = new b8(1.0f, 0.0f);
    public static final b8 k = new b8(-1.0f, 1.0f);
    public static final b8 l = new b8(0.0f, 1.0f);
    public static final b8 m = new b8(1.0f, 1.0f);
    public static final a8 n = new a8(-1.0f);
    public static final a8 o = new a8(0.0f);
    public static final z7 p = new z7(-1.0f);
    public static final z7 q = new z7(0.0f);
    public static final bw r = new bw(1);
    public static final i2 s = new i2();
    public static final bw t = new bw(3);
    public static final /* synthetic */ bw u = new bw(4);
    public static final /* synthetic */ bw v = new bw(5);
    public static final bw w = new bw(6);
    public static final bw x = new bw(7);
    public static final e20 y = e20.d;
    public static final fm z = new fm(1.0f, 1.0f);
    public static final bw aa = new bw(8);
    public static final bw ab = new bw(9);
    public static final /* synthetic */ bw ac = new bw(10);
    public static final /* synthetic */ bw ad = new bw(11);
    public static final /* synthetic */ bw ae = new bw(12);
    public static final /* synthetic */ bw af = new bw(13);
    public static final /* synthetic */ bw ag = new bw(14);
    public static final bw ah = new bw(15);
    public static final bw ai = new bw(16);
    public static final bw aj = new bw(17);
    public static final bw ak = new bw(18);
    public static final /* synthetic */ bw al = new bw(19);
    public static final bw am = new bw(20);
    public static final bw an = new bw(21);
    public static final bw ao = new bw(22);
    public static final bw ap = new bw(23);
    public static final wc aq = new wc(21);
    public static final wc ar = new wc(22);
    public static final wc as = new wc(23);
    public static final wc at = new wc(24);
    public static final bw au = new bw(25);
    public static final wc av = new wc(28);
    public static final wc aw = new wc(29);
    public static final bw ax = new bw(28);
    public static final g11 ay = new g11();

    public /* synthetic */ bw(int i2) {
        this.d = i2;
    }

    @Override // defpackage.ny
    public void a(u20 u20Var) {
        u20Var.a();
    }

    @Override // defpackage.r9
    public em b() {
        return z;
    }

    @Override // defpackage.r9
    public long c() {
        return 9205357640488583168L;
    }

    @Override // defpackage.qd0
    public boolean d() {
        return false;
    }

    @Override // defpackage.qd0
    public long e(long j2, int i2, l1 l1Var) {
        l1Var.getClass();
        rn0 rn0Var = (rn0) l1Var.f;
        return new xa0(rn0.a(rn0Var, rn0Var.h, j2, rn0Var.g)).a;
    }

    @Override // defpackage.qd0
    public j70 f() {
        return g70.a;
    }

    @Override // defpackage.qd0
    public Object g(long j2, qn0 qn0Var, ji jiVar) {
        qn0 qn0Var2 = new qn0(qn0Var.k, jiVar);
        qn0Var2.j = j2;
        wz0 wz0Var = wz0.a;
        Object objO = qn0Var2.o(wz0Var);
        return objO == yj.d ? objO : wz0Var;
    }

    @Override // defpackage.r9
    public e20 getLayoutDirection() {
        return y;
    }

    public boolean h(Object obj, Object obj2) {
        switch (this.d) {
            case 16:
                return false;
            case 20:
                return obj == obj2;
            default:
                return f00.h(obj, obj2);
        }
    }

    public String toString() {
        switch (this.d) {
            case 16:
                return "NeverEqualPolicy";
            case 20:
                return "ReferentialEqualityPolicy";
            case 25:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }
}

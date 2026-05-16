package defpackage;

import com.example.gnd.MainActivity;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yv0 extends x10 implements cv {
    public static final yv0 aa;
    public static final yv0 ab;
    public static final yv0 ac;
    public static final yv0 ad;
    public static final yv0 f;
    public static final yv0 g;
    public static final yv0 h;
    public static final yv0 i;
    public static final yv0 j;
    public static final yv0 k;
    public static final yv0 l;
    public static final yv0 m;
    public static final yv0 n;
    public static final yv0 o;
    public static final yv0 p;
    public static final yv0 q;
    public static final yv0 r;
    public static final yv0 s;
    public static final yv0 t;
    public static final yv0 u;
    public static final yv0 v;
    public static final yv0 w;
    public static final yv0 x;
    public static final yv0 y;
    public static final yv0 z;
    public final /* synthetic */ int e;

    static {
        int i2 = 1;
        f = new yv0(i2, 0);
        g = new yv0(i2, 1);
        h = new yv0(i2, 2);
        i = new yv0(i2, 3);
        j = new yv0(i2, 4);
        k = new yv0(i2, 5);
        l = new yv0(i2, 6);
        m = new yv0(i2, 7);
        n = new yv0(i2, 8);
        o = new yv0(i2, 9);
        p = new yv0(i2, 10);
        q = new yv0(i2, 11);
        r = new yv0(i2, 12);
        s = new yv0(i2, 13);
        t = new yv0(i2, 14);
        u = new yv0(i2, 15);
        v = new yv0(i2, 16);
        w = new yv0(i2, 17);
        x = new yv0(i2, 18);
        y = new yv0(i2, 19);
        z = new yv0(i2, 20);
        aa = new yv0(i2, 21);
        ab = new yv0(i2, 22);
        ac = new yv0(i2, 23);
        ad = new yv0(i2, 24);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv0(int i2, Object obj) {
        super(1);
        this.e = i2;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                wc0 wc0Var = ((Boolean) obj2).booleanValue() ? wc0.d : wc0.e;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new zv0(wc0Var, ((Float) obj3).floatValue());
            case 1:
                return wz0.a;
            case 2:
                return wz0.a;
            case 3:
                int i2 = ((dy) obj).a;
                return wz0.a;
            case 4:
                return wz0.a;
            case 5:
                int i3 = ((dy) obj).a;
                return wz0.a;
            case 6:
                ((pu) obj).a();
                return wz0.a;
            case 7:
                long j2 = ((on) obj).a;
                return new t5(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case MainActivity.$stable /* 8 */:
                t5 t5Var = (t5) obj;
                return new on((((long) Float.floatToRawIntBits(t5Var.a)) << 32) | (((long) Float.floatToRawIntBits(t5Var.b)) & 4294967295L));
            case 9:
                return new s5(((mn) obj).d);
            case 10:
                return new mn(((s5) obj).a);
            case 11:
                return new s5(((Number) obj).floatValue());
            case 12:
                return Float.valueOf(((s5) obj).a);
            case 13:
                long j3 = ((pz) obj).a;
                return new t5((int) (j3 >> 32), (int) (j3 & 4294967295L));
            case 14:
                t5 t5Var2 = (t5) obj;
                return new pz(t1.b(Math.round(t5Var2.a), Math.round(t5Var2.b)));
            case 15:
                long j4 = ((wz) obj).a;
                return new t5((int) (j4 >> 32), (int) (j4 & 4294967295L));
            case 16:
                t5 t5Var3 = (t5) obj;
                int iRound = Math.round(t5Var3.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(t5Var3.b);
                return new wz(e00.f(iRound, iRound2 >= 0 ? iRound2 : 0));
            case 17:
                return new s5(((Number) obj).intValue());
            case 18:
                return Integer.valueOf((int) ((s5) obj).a);
            case 19:
                long j5 = ((xa0) obj).a;
                return new t5(xa0.d(j5), xa0.e(j5));
            case 20:
                t5 t5Var4 = (t5) obj;
                return new xa0(d41.h(t5Var4.a, t5Var4.b));
            case 21:
                ri0 ri0Var = (ri0) obj;
                return new v5(ri0Var.a, ri0Var.b, ri0Var.c, ri0Var.d);
            case 22:
                v5 v5Var = (v5) obj;
                return new ri0(v5Var.a, v5Var.b, v5Var.c, v5Var.d);
            case 23:
                long j6 = ((pq0) obj).a;
                return new t5(pq0.d(j6), pq0.b(j6));
            case 24:
                t5 t5Var5 = (t5) obj;
                return new pq0(lI.a(t5Var5.a, t5Var5.b));
            case 25:
                return Boolean.valueOf(((gt) obj).O0(7));
            case 26:
                ((lg0) obj).getClass();
                return Boolean.TRUE;
            default:
                bp0.b((po0) obj);
                return wz0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv0(int i2, int i3) {
        super(i2);
        this.e = i3;
    }
}

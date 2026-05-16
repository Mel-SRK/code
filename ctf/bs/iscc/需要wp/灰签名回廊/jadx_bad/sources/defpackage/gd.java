package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gd {
    public static final float[] a;
    public static final float[] b;
    public static final hy0 c;
    public static final hy0 d;
    public static final bk0 e;
    public static final bk0 f;
    public static final bk0 g;
    public static final bk0 h;
    public static final bk0 i;
    public static final bk0 j;
    public static final bk0 k;
    public static final bk0 l;
    public static final bk0 m;
    public static final bk0 n;
    public static final bk0 o;
    public static final bk0 p;
    public static final bk0 q;
    public static final bk0 r;
    public static final w10 s;
    public static final w10 t;
    public static final bk0 u;
    public static final bk0 v;
    public static final bk0 w;
    public static final cb0 x;
    public static final dd[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        hy0 hy0Var = new hy0(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        hy0 hy0Var2 = new hy0(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        hy0 hy0Var3 = new hy0(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = hy0Var3;
        hy0 hy0Var4 = new hy0(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = hy0Var4;
        a21 a21Var = i60.i;
        bk0 bk0Var = new bk0("sRGB IEC61966-2.1", fArr, a21Var, hy0Var, 0);
        e = bk0Var;
        bk0 bk0Var2 = new bk0("sRGB IEC61966-2.1 (Linear)", fArr, a21Var, 1.0d, 0.0f, 1.0f, 1);
        f = bk0Var2;
        bk0 bk0Var3 = new bk0("scRGB-nl IEC 61966-2-2:2003", fArr, a21Var, null, new wc(1), new wc(2), -0.799f, 2.399f, hy0Var, 2);
        g = bk0Var3;
        bk0 bk0Var4 = new bk0("scRGB IEC 61966-2-2:2003", fArr, a21Var, 1.0d, -0.5f, 7.499f, 3);
        h = bk0Var4;
        bk0 bk0Var5 = new bk0("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, a21Var, new hy0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = bk0Var5;
        bk0 bk0Var6 = new bk0("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, a21Var, new hy0(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = bk0Var6;
        bk0 bk0Var7 = new bk0("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new a21(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = bk0Var7;
        bk0 bk0Var8 = new bk0("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, a21Var, hy0Var, 7);
        l = bk0Var8;
        bk0 bk0Var9 = new bk0("NTSC (1953)", fArr2, i60.f, new hy0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = bk0Var9;
        bk0 bk0Var10 = new bk0("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, a21Var, new hy0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = bk0Var10;
        bk0 bk0Var11 = new bk0("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, a21Var, 2.2d, 0.0f, 1.0f, 10);
        o = bk0Var11;
        bk0 bk0Var12 = new bk0("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, i60.g, new hy0(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = bk0Var12;
        a21 a21Var2 = i60.h;
        bk0 bk0Var13 = new bk0("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, a21Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = bk0Var13;
        bk0 bk0Var14 = new bk0("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, a21Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = bk0Var14;
        w10 w10Var = new w10(14, 1, uc.b, "Generic XYZ");
        s = w10Var;
        long j2 = uc.c;
        w10 w10Var2 = new w10(15, 0, j2, "Generic L*a*b*");
        t = w10Var2;
        bk0 bk0Var15 = new bk0("None", fArr, a21Var, hy0Var2, 16);
        u = bk0Var15;
        bk0 bk0Var16 = new bk0("Hybrid Log Gamma encoding", fArr3, a21Var, null, new wc(3), new wc(4), 0.0f, 1.0f, hy0Var3, 17);
        v = bk0Var16;
        bk0 bk0Var17 = new bk0("Perceptual Quantizer encoding", fArr3, a21Var, null, new wc(5), new wc(6), 0.0f, 1.0f, hy0Var4, 18);
        w = bk0Var17;
        cb0 cb0Var = new cb0("Oklab", j2, 19);
        x = cb0Var;
        y = new dd[]{bk0Var, bk0Var2, bk0Var3, bk0Var4, bk0Var5, bk0Var6, bk0Var7, bk0Var8, bk0Var9, bk0Var10, bk0Var11, bk0Var12, bk0Var13, bk0Var14, w10Var, w10Var2, bk0Var15, bk0Var16, bk0Var17, cb0Var};
    }

    public static double a(hy0 hy0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = hy0Var.b;
        double d6 = hy0Var.c;
        double d7 = hy0Var.d;
        double d8 = hy0Var.e;
        double d9 = hy0Var.f;
        double d10 = d5 * d4;
        return (hy0Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(hy0 hy0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / hy0Var.b;
        double d5 = 1.0d / hy0Var.c;
        double d6 = 1.0d / hy0Var.d;
        double d7 = hy0Var.e;
        double d8 = hy0Var.f;
        double d9 = (d2 * d3) / (hy0Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(hy0 hy0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = hy0Var.b;
        double d6 = hy0Var.d;
        double dPow = (Math.pow(d4, d6) * hy0Var.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * hy0Var.f) + hy0Var.e), hy0Var.g) * d3;
    }

    public static double d(hy0 hy0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -hy0Var.b;
        double d6 = hy0Var.e;
        double d7 = 1.0d / hy0Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-hy0Var.f)) + hy0Var.c), 1.0d / hy0Var.d) * d3;
    }
}

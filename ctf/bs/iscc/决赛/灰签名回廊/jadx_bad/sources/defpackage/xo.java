package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface xo extends em {
    static /* synthetic */ void ab(xo xoVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = bh(xoVar.c(), 0L);
        }
        xoVar.ah(j, 0L, j2, (i & 64) != 0 ? 3 : 0);
    }

    static void ac(u20 u20Var, i9 i9Var, long j, long j2, long j3, yo yoVar, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        long jBh = (i & 4) != 0 ? bh(u20Var.d.c(), j4) : j2;
        yo yoVar2 = (i & 32) != 0 ? ir.a : yoVar;
        ra raVar = u20Var.d;
        int i2 = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        raVar.d.c.j(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (jBh >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jBh & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), raVar.d(i9Var, yoVar2, 1.0f, null, 3));
    }

    static /* synthetic */ void ar(xo xoVar, t3 t3Var, i9 i9Var, gt0 gt0Var, int i) {
        yo yoVar = gt0Var;
        if ((i & 8) != 0) {
            yoVar = ir.a;
        }
        xoVar.g(t3Var, i9Var, 1.0f, yoVar, (i & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void at(xo xoVar, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = xoVar.an();
        }
        xoVar.q(f, j, j2);
    }

    static long bh(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    o6 aa();

    void ah(long j, long j2, long j3, int i);

    default long an() {
        return lI.i(aa().r());
    }

    void ao(t3 t3Var, long j, yo yoVar);

    default long c() {
        return aa().r();
    }

    void g(t3 t3Var, i9 i9Var, float f, yo yoVar, int i);

    void q(float f, long j, long j2);

    void u(long j, long j2, long j3, long j4);
}

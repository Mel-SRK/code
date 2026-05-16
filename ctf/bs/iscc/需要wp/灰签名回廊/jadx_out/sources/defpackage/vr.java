package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vr implements ur {
    public final float a;
    public final ds0 b;

    public vr(float f, float f2, float f3) {
        this.a = f3;
        ds0 ds0Var = new ds0();
        ds0Var.a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        ds0Var.b = dSqrt;
        ds0Var.g = 1.0f;
        if (f < 0.0f) {
            wc.n("Damping ratio must be non-negative");
            throw null;
        }
        ds0Var.g = f;
        ds0Var.c = false;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            wc.n("Spring stiffness constant must be positive.");
            throw null;
        }
        ds0Var.b = Math.sqrt(f2);
        ds0Var.c = false;
        this.b = ds0Var;
    }

    @Override // defpackage.ur
    public final float b(long j, float f, float f2, float f3) {
        ds0 ds0Var = this.b;
        ds0Var.a = f2;
        return Float.intBitsToFloat((int) (ds0Var.a(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.ur
    public final float c(long j, float f, float f2, float f3) {
        ds0 ds0Var = this.b;
        ds0Var.a = f2;
        return Float.intBitsToFloat((int) (ds0Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025f  */
    @Override // defpackage.ur
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(float r37, float r38, float r39) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr.d(float, float, float):long");
    }

    @Override // defpackage.ur
    public final float e(float f, float f2, float f3) {
        return 0.0f;
    }
}

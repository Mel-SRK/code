package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wr implements ur {
    public final int a;
    public final int b;
    public final ep c;
    public final long d;
    public final long e;

    public wr(int i, int i2, ep epVar) {
        this.a = i;
        this.b = i2;
        this.c = epVar;
        this.d = ((long) i) * 1000000;
        this.e = ((long) i2) * 1000000;
    }

    @Override // defpackage.ur
    public final float b(long j, float f, float f2, float f3) {
        float fU = this.a == 0 ? 1.0f : i60.u(j - this.e, 0L, this.d) / this.d;
        if (fU < 0.0f) {
            fU = 0.0f;
        }
        float fA = this.c.a(fU <= 1.0f ? fU : 1.0f);
        zy0 zy0Var = k01.a;
        return (f2 * fA) + ((1 - fA) * f);
    }

    @Override // defpackage.ur
    public final float c(long j, float f, float f2, float f3) {
        long jU = i60.u(j - this.e, 0L, this.d);
        if (jU < 0) {
            return 0.0f;
        }
        if (jU == 0) {
            return f3;
        }
        return (b(jU, f, f2, f3) - b(jU - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.ur
    public final long d(float f, float f2, float f3) {
        return ((long) (this.b + this.a)) * 1000000;
    }
}

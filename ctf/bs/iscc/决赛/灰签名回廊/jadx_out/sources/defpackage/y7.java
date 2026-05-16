package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y7 implements bx {
    public final float a;

    public y7(float f) {
        this.a = f;
    }

    @Override // defpackage.bx
    public final long a(long j, long j2, e20 e20Var) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        float f = 1;
        float f2 = (this.a + f) * (((int) (j3 >> 32)) / 2.0f);
        return (((long) Math.round((f - 1.0f) * (((int) (j3 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f2)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7) && Float.compare(this.a, ((y7) obj).a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}

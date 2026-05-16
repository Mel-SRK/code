package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b8 implements bx {
    public final float a;
    public final float b;

    public b8(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.bx
    public final long a(long j, long j2, e20 e20Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        e20 e20Var2 = e20.d;
        float f3 = this.a;
        if (e20Var != e20Var2) {
            f3 *= -1;
        }
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        return (((long) Math.round((f4 + this.b) * f2)) & 4294967295L) | (((long) Math.round(f5)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        return Float.compare(this.a, b8Var.a) == 0 && Float.compare(this.b, b8Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ')';
    }
}

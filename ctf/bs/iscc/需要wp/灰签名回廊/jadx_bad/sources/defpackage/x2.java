package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x2 {
    public final float a;
    public final float b;

    public x2(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return Float.compare(this.a, x2Var.a) == 0 && Float.compare(this.b, x2Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FlingResult(distanceCoefficient=" + this.a + ", velocityCoefficient=" + this.b + ')';
    }
}

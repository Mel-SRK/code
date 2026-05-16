package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ow0 {
    public static final ow0 c = new ow0(1.0f, 0.0f);
    public final float a;
    public final float b;

    public ow0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow0)) {
            return false;
        }
        ow0 ow0Var = (ow0) obj;
        return this.a == ow0Var.a && this.b == ow0Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.a + ", skewX=" + this.b + ')';
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gt0 extends yo {
    public final float a;

    public gt0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gt0) {
            return this.a == ((gt0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return n5.c(0, n5.c(0, n5.b(4.0f, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "Stroke(width=" + this.a + ", miter=4.0, cap=" + ((Object) "Butt") + ", join=" + ((Object) "Miter") + ", pathEffect=null)";
    }
}

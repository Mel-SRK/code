package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ck0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ck0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck0)) {
            return false;
        }
        ck0 ck0Var = (ck0) obj;
        return this.a == ck0Var.a && this.b == ck0Var.b && this.c == ck0Var.c && this.d == ck0Var.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + n5.b(this.c, n5.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=" + this.a + ", focusedAlpha=" + this.b + ", hoveredAlpha=" + this.c + ", pressedAlpha=" + this.d + ')';
    }
}

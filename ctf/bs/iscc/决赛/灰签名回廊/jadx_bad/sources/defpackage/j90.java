package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j90 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public j90(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j90.class == obj.getClass()) {
            j90 j90Var = (j90) obj;
            return this.c == j90Var.c && this.d == j90Var.d && this.b == j90Var.b && this.a == j90Var.a && this.e == j90Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + n5.c(this.a, n5.b(this.b, n5.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}

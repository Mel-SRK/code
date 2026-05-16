package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yn0 {
    public final xn0 a;
    public final xn0 b;
    public final boolean c;

    public yn0(xn0 xn0Var, xn0 xn0Var2, boolean z) {
        this.a = xn0Var;
        this.b = xn0Var2;
        this.c = z;
    }

    public static yn0 a(yn0 yn0Var, xn0 xn0Var, xn0 xn0Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            xn0Var = yn0Var.a;
        }
        if ((i & 2) != 0) {
            xn0Var2 = yn0Var.b;
        }
        yn0Var.getClass();
        return new yn0(xn0Var, xn0Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn0)) {
            return false;
        }
        yn0 yn0Var = (yn0) obj;
        return f00.h(this.a, yn0Var.a) && f00.h(this.b, yn0Var.b) && this.c == yn0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}

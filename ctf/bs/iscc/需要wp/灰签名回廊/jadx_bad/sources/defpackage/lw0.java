package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lw0 {
    public final b6 a;
    public final long b;
    public final hx0 c;

    public lw0(b6 b6Var, long j, hx0 hx0Var) {
        this.a = b6Var;
        this.b = wo0.e(j, b6Var.e.length());
        this.c = hx0Var != null ? new hx0(wo0.e(hx0Var.a, b6Var.e.length())) : null;
    }

    public static lw0 a(lw0 lw0Var, b6 b6Var, long j, int i) {
        if ((i & 1) != 0) {
            b6Var = lw0Var.a;
        }
        if ((i & 2) != 0) {
            j = lw0Var.b;
        }
        hx0 hx0Var = (i & 4) != 0 ? lw0Var.c : null;
        lw0Var.getClass();
        return new lw0(b6Var, j, hx0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw0)) {
            return false;
        }
        lw0 lw0Var = (lw0) obj;
        return hx0.a(this.b, lw0Var.b) && f00.h(this.c, lw0Var.c) && f00.h(this.a, lw0Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = hx0.c;
        int iD = n5.d(iHashCode, 31, this.b);
        hx0 hx0Var = this.c;
        return iD + (hx0Var != null ? Long.hashCode(hx0Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) hx0.g(this.b)) + ", composition=" + this.c + ')';
    }

    public lw0(String str, long j, int i) {
        this(new b6((i & 1) != 0 ? "" : str), (i & 2) != 0 ? hx0.b : j, (hx0) null);
    }
}

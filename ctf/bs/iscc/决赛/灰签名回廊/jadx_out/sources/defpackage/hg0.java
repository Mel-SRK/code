package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hg0 {
    public final cg0 a;
    public final xf0 b;

    public hg0(cg0 cg0Var, xf0 xf0Var) {
        this.a = cg0Var;
        this.b = xf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg0)) {
            return false;
        }
        hg0 hg0Var = (hg0) obj;
        return f00.h(this.b, hg0Var.b) && f00.h(this.a, hg0Var.a);
    }

    public final int hashCode() {
        cg0 cg0Var = this.a;
        int iHashCode = (cg0Var != null ? cg0Var.hashCode() : 0) * 31;
        xf0 xf0Var = this.b;
        return iHashCode + (xf0Var != null ? xf0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}

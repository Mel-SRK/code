package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pw0 {
    public static final pw0 c = new pw0(bo0.j(0), bo0.j(0));
    public final long a;
    public final long b;

    public pw0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw0)) {
            return false;
        }
        pw0 pw0Var = (pw0) obj;
        return qx0.a(this.a, pw0Var.a) && qx0.a(this.b, pw0Var.b);
    }

    public final int hashCode() {
        rx0[] rx0VarArr = qx0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) qx0.d(this.a)) + ", restLine=" + ((Object) qx0.d(this.b)) + ')';
    }
}

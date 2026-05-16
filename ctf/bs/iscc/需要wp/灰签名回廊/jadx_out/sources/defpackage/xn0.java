package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xn0 {
    public final oj0 a;
    public final int b;
    public final long c;

    public xn0(oj0 oj0Var, int i, long j) {
        this.a = oj0Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn0)) {
            return false;
        }
        xn0 xn0Var = (xn0) obj;
        return this.a == xn0Var.a && this.b == xn0Var.b && this.c == xn0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + n5.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
    }
}

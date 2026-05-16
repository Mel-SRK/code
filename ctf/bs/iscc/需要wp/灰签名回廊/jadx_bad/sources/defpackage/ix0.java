package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ix0 {
    public final long a;
    public final long b;

    public ix0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix0)) {
            return false;
        }
        ix0 ix0Var = (ix0) obj;
        return qc.c(this.a, ix0Var.a) && qc.c(this.b, ix0Var.b);
    }

    public final int hashCode() {
        int i = qc.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        n5.k(this.a, sb, ", selectionBackgroundColor=");
        sb.append((Object) qc.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}

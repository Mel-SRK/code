package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rh {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public rh(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rh)) {
            return false;
        }
        rh rhVar = (rh) obj;
        return qc.c(this.a, rhVar.a) && qc.c(this.b, rhVar.b) && qc.c(this.c, rhVar.c) && qc.c(this.d, rhVar.d) && qc.c(this.e, rhVar.e);
    }

    public final int hashCode() {
        int i = qc.h;
        return Long.hashCode(this.e) + n5.d(n5.d(n5.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        n5.k(this.a, sb, ", textColor=");
        n5.k(this.b, sb, ", iconColor=");
        n5.k(this.c, sb, ", disabledTextColor=");
        n5.k(this.d, sb, ", disabledIconColor=");
        sb.append((Object) qc.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}

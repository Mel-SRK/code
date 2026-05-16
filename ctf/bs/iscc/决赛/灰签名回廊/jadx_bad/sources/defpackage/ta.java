package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ta {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ta(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ta)) {
            return false;
        }
        ta taVar = (ta) obj;
        return qc.c(this.a, taVar.a) && qc.c(this.b, taVar.b) && qc.c(this.c, taVar.c) && qc.c(this.d, taVar.d);
    }

    public final int hashCode() {
        int i = qc.h;
        return Long.hashCode(this.d) + n5.d(n5.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}

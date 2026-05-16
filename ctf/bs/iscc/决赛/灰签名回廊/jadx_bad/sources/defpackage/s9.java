package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s9 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public s9(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj;
        return qc.c(this.a, s9Var.a) && qc.c(this.b, s9Var.b) && qc.c(this.c, s9Var.c) && qc.c(this.d, s9Var.d);
    }

    public final int hashCode() {
        int i = qc.h;
        return Long.hashCode(this.d) + n5.d(n5.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}

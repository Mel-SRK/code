package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class is0 implements q5 {
    public final q5 a;
    public final long b;

    public is0(nr nrVar, long j) {
        this.a = nrVar;
        this.b = j;
    }

    @Override // defpackage.q5
    public final l01 a(zy0 zy0Var) {
        return new js0(this.a.a(zy0Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof is0)) {
            return false;
        }
        is0 is0Var = (is0) obj;
        return is0Var.b == this.b && f00.h(is0Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}

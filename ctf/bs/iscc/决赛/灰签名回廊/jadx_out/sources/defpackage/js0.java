package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class js0 implements l01 {
    public final l01 a;
    public final long b;

    public js0(l01 l01Var, long j) {
        this.a = l01Var;
        this.b = j;
    }

    @Override // defpackage.l01
    public final boolean a() {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof js0)) {
            return false;
        }
        js0 js0Var = (js0) obj;
        return js0Var.b == this.b && f00.h(js0Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.l01
    public final w5 i(long j, w5 w5Var, w5 w5Var2, w5 w5Var3) {
        long j2 = this.b;
        return j < j2 ? w5Var3 : this.a.i(j - j2, w5Var, w5Var2, w5Var3);
    }

    @Override // defpackage.l01
    public final w5 k(long j, w5 w5Var, w5 w5Var2, w5 w5Var3) {
        long j2 = this.b;
        return j < j2 ? w5Var : this.a.k(j - j2, w5Var, w5Var2, w5Var3);
    }

    @Override // defpackage.l01
    public final long n(w5 w5Var, w5 w5Var2, w5 w5Var3) {
        return this.a.n(w5Var, w5Var2, w5Var3) + this.b;
    }
}

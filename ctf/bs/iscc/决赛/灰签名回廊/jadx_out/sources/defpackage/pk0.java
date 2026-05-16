package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pk0 implements qy {
    public final boolean a;
    public final long b;

    public pk0(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    @Override // defpackage.qy
    public final ql b(g80 g80Var) {
        return new vl(g80Var, this.a, new tl(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk0)) {
            return false;
        }
        pk0 pk0Var = (pk0) obj;
        if (this.a == pk0Var.a && mn.a(Float.NaN, Float.NaN)) {
            return qc.c(this.b, pk0Var.b);
        }
        return false;
    }

    public final int hashCode() {
        int iB = n5.b(Float.NaN, Boolean.hashCode(this.a) * 31, 961);
        int i = qc.h;
        return Long.hashCode(this.b) + iB;
    }
}

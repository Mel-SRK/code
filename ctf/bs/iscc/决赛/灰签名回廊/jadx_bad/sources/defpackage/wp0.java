package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wp0 implements op {
    public final int a;
    public final int b;

    public wp0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.op
    public final void a(pp ppVar) {
        int iT = i60.t(this.a, 0, ppVar.a.b());
        int iT2 = i60.t(this.b, 0, ppVar.a.b());
        if (iT < iT2) {
            ppVar.f(iT, iT2);
        } else {
            ppVar.f(iT2, iT);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp0)) {
            return false;
        }
        wp0 wp0Var = (wp0) obj;
        return this.a == wp0Var.a && this.b == wp0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return n5.h(sb, this.b, ')');
    }
}

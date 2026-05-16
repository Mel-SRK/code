package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class up0 implements op {
    public final int a;
    public final int b;

    public up0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.op
    public final void a(pp ppVar) {
        boolean z = ppVar.d != -1;
        oe0 oe0Var = ppVar.a;
        if (z) {
            ppVar.d = -1;
            ppVar.e = -1;
        }
        int iT = i60.t(this.a, 0, oe0Var.b());
        int iT2 = i60.t(this.b, 0, oe0Var.b());
        if (iT != iT2) {
            if (iT < iT2) {
                ppVar.e(iT, iT2);
            } else {
                ppVar.e(iT2, iT);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up0)) {
            return false;
        }
        up0 up0Var = (up0) obj;
        return this.a == up0Var.a && this.b == up0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return n5.h(sb, this.b, ')');
    }
}

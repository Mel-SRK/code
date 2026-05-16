package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jv0 implements vc, pv {
    public final /* synthetic */ w40 a;

    public jv0(w40 w40Var) {
        this.a = w40Var;
    }

    @Override // defpackage.vc
    public final long a() {
        return ((qc) this.a.get()).a;
    }

    @Override // defpackage.pv
    public final ov b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vc) || !(obj instanceof pv)) {
            return false;
        }
        return this.a.equals(((pv) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c30 extends i70 implements kg, xv {
    public k3 r;
    public h30 s;
    public cw0 t;
    public final me0 u = bo0.m(null);

    public c30(k3 k3Var, h30 h30Var, cw0 cw0Var) {
        this.r = k3Var;
        this.s = h30Var;
        this.t = cw0Var;
    }

    @Override // defpackage.i70
    public final void bm() {
        k3 k3Var = this.r;
        if (k3Var.a == null) {
            k3Var.a = this;
        } else {
            wc.q("Expected textInputModifierNode to be null");
        }
    }

    @Override // defpackage.i70
    public final void bn() {
        this.r.k(this);
    }

    @Override // defpackage.xv
    public final void t(fa0 fa0Var) {
        this.u.setValue(fa0Var);
    }
}

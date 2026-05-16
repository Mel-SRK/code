package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nt extends i70 implements sy0, xv {
    public static final n31 t = new n31(16);
    public boolean r;
    public fa0 s;

    @Override // defpackage.i70
    public final boolean bj() {
        return false;
    }

    public final ot bu() {
        if (!this.q) {
            return null;
        }
        sy0 sy0VarF = lI.f(this, ot.s);
        if (sy0VarF instanceof ot) {
            return (ot) sy0VarF;
        }
        return null;
    }

    @Override // defpackage.sy0
    public final Object p() {
        return t;
    }

    @Override // defpackage.xv
    public final void t(fa0 fa0Var) {
        ot otVarBu;
        this.s = fa0Var;
        if (this.r) {
            if (!fa0Var.D().q) {
                ot otVarBu2 = bu();
                if (otVarBu2 != null) {
                    otVarBu2.bu(null);
                    return;
                }
                return;
            }
            fa0 fa0Var2 = this.s;
            if (fa0Var2 == null || !fa0Var2.D().q || (otVarBu = bu()) == null) {
                return;
            }
            otVarBu.bu(this.s);
        }
    }
}

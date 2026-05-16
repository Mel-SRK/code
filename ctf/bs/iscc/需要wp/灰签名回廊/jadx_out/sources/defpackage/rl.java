package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rl extends i70 {
    public final int r = ga0.e(this);
    public i70 s;

    @Override // defpackage.i70
    public final void bk() {
        super.bk();
        for (i70 i70Var = this.s; i70Var != null; i70Var = i70Var.i) {
            i70Var.bt(this.k);
            if (!i70Var.q) {
                i70Var.bk();
            }
        }
    }

    @Override // defpackage.i70
    public final void bl() {
        for (i70 i70Var = this.s; i70Var != null; i70Var = i70Var.i) {
            i70Var.bl();
        }
        super.bl();
    }

    @Override // defpackage.i70
    public final void bp() {
        super.bp();
        for (i70 i70Var = this.s; i70Var != null; i70Var = i70Var.i) {
            i70Var.bp();
        }
    }

    @Override // defpackage.i70
    public final void bq() {
        for (i70 i70Var = this.s; i70Var != null; i70Var = i70Var.i) {
            i70Var.bq();
        }
        super.bq();
    }

    @Override // defpackage.i70
    public final void br() {
        super.br();
        for (i70 i70Var = this.s; i70Var != null; i70Var = i70Var.i) {
            i70Var.br();
        }
    }

    @Override // defpackage.i70
    public final void bs(i70 i70Var) {
        this.d = i70Var;
        for (i70 i70Var2 = this.s; i70Var2 != null; i70Var2 = i70Var2.i) {
            i70Var2.bs(i70Var);
        }
    }

    @Override // defpackage.i70
    public final void bt(fa0 fa0Var) {
        this.k = fa0Var;
        for (i70 i70Var = this.s; i70Var != null; i70Var = i70Var.i) {
            i70Var.bt(fa0Var);
        }
    }

    public final void bu(ql qlVar) {
        i70 i70Var = ((i70) qlVar).d;
        if (i70Var != qlVar) {
            i70 i70Var2 = qlVar instanceof i70 ? (i70) qlVar : null;
            i70 i70Var3 = i70Var2 != null ? i70Var2.h : null;
            if (i70Var == this.d && f00.h(i70Var3, this)) {
                return;
            }
            wc.q("Cannot delegate to an already delegated node");
            return;
        }
        if (i70Var.q) {
            sy.b("Cannot delegate to an already attached node");
        }
        i70Var.bs(this.d);
        int i = this.f;
        int iF = ga0.f(i70Var);
        i70Var.f = iF;
        int i2 = this.f;
        int i3 = iF & 2;
        if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof l20)) {
            sy.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + i70Var);
        }
        i70Var.i = this.s;
        this.s = i70Var;
        i70Var.h = this;
        bw(iF | this.f, false);
        if (this.q) {
            if (i3 == 0 || (i & 2) != 0) {
                bt(this.k);
            } else {
                da0 da0Var = pk.ay(this).ag;
                this.d.bt(null);
                da0Var.l();
            }
            i70Var.bk();
            i70Var.bq();
            if (!i70Var.q) {
                sy.b("autoInvalidateInsertedNode called on unattached node");
            }
            ga0.a(i70Var, -1, 1);
        }
    }

    public final void bv(ql qlVar) {
        i70 i70Var = null;
        for (i70 i70Var2 = this.s; i70Var2 != null; i70Var2 = i70Var2.i) {
            if (i70Var2 == qlVar) {
                boolean z = i70Var2.q;
                if (z) {
                    l80 l80Var = ga0.a;
                    if (!z) {
                        sy.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    ga0.a(i70Var2, -1, 2);
                    i70Var2.br();
                    i70Var2.bl();
                }
                i70Var2.bs(i70Var2);
                i70Var2.g = 0;
                i70 i70Var3 = i70Var2.i;
                if (i70Var == null) {
                    this.s = i70Var3;
                } else {
                    i70Var.i = i70Var3;
                }
                i70Var2.i = null;
                i70Var2.h = null;
                int i = this.f;
                int iF = ga0.f(this);
                bw(iF, true);
                if (this.q && (i & 2) != 0 && (iF & 2) == 0) {
                    da0 da0Var = pk.ay(this).ag;
                    this.d.bt(null);
                    da0Var.l();
                    return;
                }
                return;
            }
            i70Var = i70Var2;
        }
        wc.f(qlVar, "Could not find delegate: ");
    }

    public final void bw(int i, boolean z) {
        i70 i70Var;
        int i2 = this.f;
        this.f = i;
        if (i2 != i) {
            i70 i70Var2 = this.d;
            if (i70Var2 == this) {
                this.g = i;
            }
            if (this.q) {
                i70 i70Var3 = this;
                while (i70Var3 != null) {
                    i |= i70Var3.f;
                    i70Var3.f = i;
                    if (i70Var3 == i70Var2) {
                        break;
                    } else {
                        i70Var3 = i70Var3.h;
                    }
                }
                if (z && i70Var3 == i70Var2) {
                    i = ga0.f(i70Var2);
                    i70Var2.f = i;
                }
                int i3 = i | ((i70Var3 == null || (i70Var = i70Var3.i) == null) ? 0 : i70Var.g);
                while (i70Var3 != null) {
                    i3 |= i70Var3.f;
                    i70Var3.g = i3;
                    i70Var3 = i70Var3.h;
                }
            }
        }
    }
}

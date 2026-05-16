package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lt extends rl implements ms, so0, xv, zs {
    public et t;
    public final kt u;
    public final mt v;
    public final nt w;

    public lt(g80 g80Var) {
        kt ktVar = new kt();
        ktVar.r = g80Var;
        bu(ktVar);
        this.u = ktVar;
        mt mtVar = new mt();
        bu(mtVar);
        this.v = mtVar;
        nt ntVar = new nt();
        bu(ntVar);
        this.w = ntVar;
        bu(new gt(new ft(1, m00.a, m00.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 0, 0), 3));
    }

    @Override // defpackage.so0
    public final void ag(po0 po0Var) {
        et etVar = this.t;
        boolean z = false;
        if (etVar != null && etVar.a()) {
            z = true;
        }
        i10[] i10VarArr = bp0.a;
        cp0 cp0Var = zo0.k;
        i10 i10Var = bp0.a[4];
        po0Var.d(cp0Var, Boolean.valueOf(z));
        po0Var.d(oo0.u, new ah(null, new b(9, this)));
    }

    @Override // defpackage.ms
    public final void am(et etVar) {
        ot otVarBu;
        if (f00.h(this.t, etVar)) {
            return;
        }
        boolean zA = etVar.a();
        ji jiVar = null;
        if (zA) {
            i60.an(bi(), null, new sk(this, jiVar, 1), 3);
        }
        if (this.q) {
            q6.j(this);
        }
        kt ktVar = this.u;
        g80 g80Var = ktVar.r;
        if (g80Var != null) {
            ps psVar = ktVar.s;
            if (zA) {
                if (psVar != null) {
                    ktVar.bu(g80Var, new qs(psVar));
                    ktVar.s = null;
                }
                ps psVar2 = new ps();
                ktVar.bu(g80Var, psVar2);
                ktVar.s = psVar2;
            } else if (psVar != null) {
                ktVar.bu(g80Var, new qs(psVar));
                ktVar.s = null;
            }
        }
        nt ntVar = this.w;
        if (zA != ntVar.r) {
            if (zA) {
                fa0 fa0Var = ntVar.s;
                if (fa0Var != null && fa0Var.D().q && (otVarBu = ntVar.bu()) != null) {
                    otVarBu.bu(ntVar.s);
                }
            } else {
                ot otVarBu2 = ntVar.bu();
                if (otVarBu2 != null) {
                    otVarBu2.bu(null);
                }
            }
            ntVar.r = zA;
        }
        mt mtVar = this.v;
        if (zA) {
            mtVar.getClass();
            xi0 xi0Var = new xi0();
            az0.z(mtVar, new s0(8, xi0Var, mtVar));
            if (xi0Var.d != null) {
                wc.c();
                return;
            }
        }
        mtVar.getClass();
        this.t = etVar;
    }

    @Override // defpackage.i70
    public final boolean bj() {
        return false;
    }

    public final void bx(g80 g80Var) {
        ps psVar;
        kt ktVar = this.u;
        if (f00.h(ktVar.r, g80Var)) {
            return;
        }
        g80 g80Var2 = ktVar.r;
        if (g80Var2 != null && (psVar = ktVar.s) != null) {
            g80Var2.b(new qs(psVar));
        }
        ktVar.s = null;
        ktVar.r = g80Var;
    }

    @Override // defpackage.xv
    public final void t(fa0 fa0Var) {
        this.w.t(fa0Var);
    }
}

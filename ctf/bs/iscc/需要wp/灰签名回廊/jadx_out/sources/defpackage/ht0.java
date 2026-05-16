package defpackage;

import androidx.compose.foundation.text.handwriting.a;

/* JADX INFO: loaded from: classes.dex */
public final class ht0 extends rl implements l20, sg0, ms {
    public pu t;
    public boolean u;
    public final zt0 v;

    public ht0(pu puVar) {
        this.t = puVar;
        c cVar = new c(this, null, 19);
        ig0 ig0Var = vt0.a;
        zt0 zt0Var = new zt0(null, null, wt0.a);
        zt0Var.t = cVar;
        bu(zt0Var);
        this.v = zt0Var;
    }

    @Override // defpackage.sg0
    public final void ad(ig0 ig0Var, jg0 jg0Var, long j) {
        this.v.ad(ig0Var, jg0Var, j);
    }

    @Override // defpackage.ms
    public final void am(et etVar) {
        this.u = etVar.a();
    }

    @Override // defpackage.sg0
    public final void aw() {
        this.v.aw();
    }

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        int iAi = r60Var.ai(a.a);
        int iAi2 = r60Var.ai(a.b);
        int i = iAi2 * 2;
        int i2 = iAi * 2;
        lf0 lf0VarE = k60Var.e(eh.i(i, i2, j));
        int i3 = lf0VarE.e - i2;
        return r60Var.av(lf0VarE.d - i, i3, sq.d, new e70(lf0VarE, iAi2, iAi));
    }
}

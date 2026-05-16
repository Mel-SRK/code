package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bw0 implements fv0 {
    public final /* synthetic */ cw0 a;
    public final /* synthetic */ boolean b;

    public bw0(cw0 cw0Var, boolean z) {
        this.a = cw0Var;
        this.b = z;
    }

    @Override // defpackage.fv0
    public final void a() {
        cw0 cw0Var = this.a;
        cw0Var.o.setValue(null);
        cw0Var.p.setValue(null);
        cw0Var.p(true);
    }

    @Override // defpackage.fv0
    public final void b() {
        cw0 cw0Var = this.a;
        cw0Var.o.setValue(null);
        cw0Var.p.setValue(null);
        cw0Var.p(true);
    }

    @Override // defpackage.fv0
    public final void d() {
        ax0 ax0VarD;
        boolean z = this.b;
        vw vwVar = z ? vw.e : vw.f;
        cw0 cw0Var = this.a;
        cw0Var.o.setValue(vwVar);
        long jI = cw0Var.i(z);
        float f = io0.a;
        long jH = d41.h(xa0.d(jI), xa0.e(jI) - 1.0f);
        h30 h30Var = cw0Var.d;
        if (h30Var == null || (ax0VarD = h30Var.d()) == null) {
            return;
        }
        long jE = ax0VarD.e(jH);
        cw0Var.l = jE;
        cw0Var.p.setValue(new xa0(jE));
        cw0Var.n = 0L;
        cw0Var.q = -1;
        h30 h30Var2 = cw0Var.d;
        if (h30Var2 != null) {
            h30Var2.q.setValue(Boolean.TRUE);
        }
        cw0Var.p(false);
    }

    @Override // defpackage.fv0
    public final void e(long j) {
        cw0 cw0Var = this.a;
        long jG = xa0.g(cw0Var.n, j);
        cw0Var.n = jG;
        cw0Var.p.setValue(new xa0(xa0.g(cw0Var.l, jG)));
        lw0 lw0VarJ = cw0Var.j();
        xa0 xa0VarG = cw0Var.g();
        xa0VarG.getClass();
        cw0.a(cw0Var, lw0VarJ, xa0VarG.a, false, this.b, bw.at, true);
        cw0Var.p(false);
    }

    @Override // defpackage.fv0
    public final void onCancel() {
    }

    @Override // defpackage.fv0
    public final void c(long j) {
    }
}

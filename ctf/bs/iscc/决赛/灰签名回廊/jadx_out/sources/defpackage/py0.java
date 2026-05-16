package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class py0 extends v80 {
    public final v80 o;
    public final boolean p;
    public final boolean q;
    public cv r;
    public cv s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public py0(v80 v80Var, cv cvVar, cv cvVar2, boolean z, boolean z2) {
        cv cvVarI;
        cv cvVarY;
        dr0 dr0Var = fr0.a;
        super(0L, cr0.h, fr0.l(cvVar, (v80Var == null || (cvVarY = v80Var.e()) == null) ? fr0.j.e : cvVarY, z), fr0.b(cvVar2, (v80Var == null || (cvVarI = v80Var.i()) == null) ? fr0.j.f : cvVarI));
        this.o = v80Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = go0.e();
    }

    @Override // defpackage.v80
    public final void ab(r80 r80Var) {
        go0.m();
        throw null;
    }

    @Override // defpackage.v80
    public final v80 ac(cv cvVar, cv cvVar2) {
        cv cvVarL = fr0.l(cvVar, this.r, true);
        cv cvVarB = fr0.b(cvVar2, this.s);
        return !this.p ? new py0(ad().ac(null, cvVarB), cvVarL, cvVarB, false, true) : ad().ac(cvVarL, cvVarB);
    }

    public final v80 ad() {
        v80 v80Var = this.o;
        return v80Var == null ? fr0.j : v80Var;
    }

    @Override // defpackage.v80, defpackage.xq0
    public final void c() {
        v80 v80Var;
        this.c = true;
        if (!this.q || (v80Var = this.o) == null) {
            return;
        }
        v80Var.c();
    }

    @Override // defpackage.xq0
    public final cr0 d() {
        return ad().d();
    }

    @Override // defpackage.v80, defpackage.xq0
    public final cv e() {
        return this.r;
    }

    @Override // defpackage.v80, defpackage.xq0
    public final boolean f() {
        return ad().f();
    }

    @Override // defpackage.xq0
    public final long g() {
        return ad().g();
    }

    @Override // defpackage.v80, defpackage.xq0
    public final int h() {
        return ad().h();
    }

    @Override // defpackage.v80, defpackage.xq0
    public final cv i() {
        return this.s;
    }

    @Override // defpackage.v80, defpackage.xq0
    public final void k() {
        go0.m();
        throw null;
    }

    @Override // defpackage.v80, defpackage.xq0
    public final void l() {
        go0.m();
        throw null;
    }

    @Override // defpackage.v80, defpackage.xq0
    public final void m() {
        ad().m();
    }

    @Override // defpackage.v80, defpackage.xq0
    public final void n(ts0 ts0Var) {
        ad().n(ts0Var);
    }

    @Override // defpackage.xq0
    public final void r(cr0 cr0Var) {
        go0.m();
        throw null;
    }

    @Override // defpackage.xq0
    public final void s(long j) {
        go0.m();
        throw null;
    }

    @Override // defpackage.v80, defpackage.xq0
    public final void t(int i) {
        ad().t(i);
    }

    @Override // defpackage.v80, defpackage.xq0
    public final xq0 u(cv cvVar) {
        cv cvVarL = fr0.l(cvVar, this.r, true);
        return !this.p ? fr0.h(ad().u(null), cvVarL, true) : ad().u(cvVarL);
    }

    @Override // defpackage.v80
    public final wo0 w() {
        return ad().w();
    }

    @Override // defpackage.v80
    public final r80 x() {
        return ad().x();
    }

    @Override // defpackage.v80
    /* JADX INFO: renamed from: y */
    public final cv e() {
        return this.r;
    }
}

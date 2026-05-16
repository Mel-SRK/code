package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qy0 extends xq0 {
    public final xq0 e;
    public final boolean f;
    public final boolean g;
    public cv h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy0(xq0 xq0Var, cv cvVar, boolean z, boolean z2) {
        cv cvVarE;
        super(0L, cr0.h);
        dr0 dr0Var = fr0.a;
        this.e = xq0Var;
        this.f = z;
        this.g = z2;
        this.h = fr0.l(cvVar, (xq0Var == null || (cvVarE = xq0Var.e()) == null) ? fr0.j.e : cvVarE, z);
        this.i = go0.e();
    }

    @Override // defpackage.xq0
    public final void c() {
        xq0 xq0Var;
        this.c = true;
        if (!this.g || (xq0Var = this.e) == null) {
            return;
        }
        xq0Var.c();
    }

    @Override // defpackage.xq0
    public final cr0 d() {
        return v().d();
    }

    @Override // defpackage.xq0
    public final cv e() {
        return this.h;
    }

    @Override // defpackage.xq0
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.xq0
    public final long g() {
        return v().g();
    }

    @Override // defpackage.xq0
    public final cv i() {
        return null;
    }

    @Override // defpackage.xq0
    public final void k() {
        go0.m();
        throw null;
    }

    @Override // defpackage.xq0
    public final void l() {
        go0.m();
        throw null;
    }

    @Override // defpackage.xq0
    public final void m() {
        v().m();
    }

    @Override // defpackage.xq0
    public final void n(ts0 ts0Var) {
        v().n(ts0Var);
    }

    @Override // defpackage.xq0
    public final xq0 u(cv cvVar) {
        cv cvVarL = fr0.l(cvVar, this.h, true);
        return !this.f ? fr0.h(v().u(null), cvVarL, true) : v().u(cvVarL);
    }

    public final xq0 v() {
        xq0 xq0Var = this.e;
        return xq0Var == null ? fr0.j : xq0Var;
    }
}

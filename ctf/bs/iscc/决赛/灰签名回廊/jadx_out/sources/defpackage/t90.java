package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t90 extends xq0 {
    public final cv e;
    public final xq0 f;

    public t90(long j, cr0 cr0Var, cv cvVar, xq0 xq0Var) {
        super(j, cr0Var);
        this.e = cvVar;
        this.f = xq0Var;
        xq0Var.k();
    }

    @Override // defpackage.xq0
    public final void c() {
        xq0 xq0Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != xq0Var.g()) {
            a();
        }
        xq0Var.l();
        this.c = true;
        synchronized (fr0.c) {
            o();
        }
    }

    @Override // defpackage.xq0
    public final cv e() {
        return this.e;
    }

    @Override // defpackage.xq0
    public final boolean f() {
        return true;
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
    public final void n(ts0 ts0Var) {
        dr0 dr0Var = fr0.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.xq0
    public final xq0 u(cv cvVar) {
        return new t90(this.b, this.a, fr0.l(cvVar, this.e, true), this.f);
    }

    @Override // defpackage.xq0
    public final void m() {
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ei0 extends xq0 {
    public final cv e;
    public int f;

    public ei0(long j, cr0 cr0Var, cv cvVar) {
        super(j, cr0Var);
        this.e = cvVar;
        this.f = 1;
    }

    @Override // defpackage.xq0
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // defpackage.xq0
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.xq0
    public final void n(ts0 ts0Var) {
        dr0 dr0Var = fr0.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.xq0
    public final xq0 u(cv cvVar) {
        fr0.d(this);
        return new t90(this.b, this.a, fr0.l(cvVar, this.e, true), this);
    }

    @Override // defpackage.xq0
    public final void m() {
    }
}

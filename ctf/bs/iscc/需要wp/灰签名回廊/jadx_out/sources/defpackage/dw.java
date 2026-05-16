package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dw extends v80 {
    @Override // defpackage.v80
    public final v80 ac(cv cvVar, cv cvVar2) {
        return (v80) ((xq0) fr0.f(new h(8, new zv(0, cvVar, cvVar2))));
    }

    @Override // defpackage.v80, defpackage.xq0
    public final void c() {
        synchronized (fr0.c) {
            o();
        }
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
        fr0.a();
    }

    @Override // defpackage.v80, defpackage.xq0
    public final xq0 u(cv cvVar) {
        return (ei0) ((xq0) fr0.f(new h(8, new cw(cvVar, 0))));
    }

    @Override // defpackage.v80
    public final wo0 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}

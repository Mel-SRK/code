package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class z10 implements bj0, rj {
    public final pj d;
    public final gv e;
    public final ii f;
    public hs0 g;

    public z10(pj pjVar, gv gvVar) {
        this.d = pjVar;
        this.e = gvVar;
        this.f = i60.c(pjVar.j(pjVar.k(gg.e) != null ? this : pq.d));
    }

    @Override // defpackage.bj0
    public final void c() {
        hs0 hs0Var = this.g;
        if (hs0Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            hs0Var.a(cancellationException);
        }
        this.g = i60.an(this.f, null, this.e, 3);
    }

    @Override // defpackage.bj0
    public final void d() {
        hs0 hs0Var = this.g;
        if (hs0Var != null) {
            hs0Var.ac(new nu(1));
        }
        this.g = null;
    }

    @Override // defpackage.bj0
    public final void e() {
        hs0 hs0Var = this.g;
        if (hs0Var != null) {
            hs0Var.ac(new nu(1));
        }
        this.g = null;
    }

    @Override // defpackage.nj
    public final oj getKey() {
        return bw.v;
    }

    @Override // defpackage.pj
    public final pj j(pj pjVar) {
        return pk.an(this, pjVar);
    }

    @Override // defpackage.pj
    public final nj k(oj ojVar) {
        return pk.ab(this, ojVar);
    }

    @Override // defpackage.rj
    public final void p(pj pjVar, Throwable th) throws Throwable {
        gg ggVar = (gg) pjVar.k(gg.e);
        if (ggVar != null) {
            f00.aj(th, new fg(0, ggVar, this));
        }
        rj rjVar = (rj) this.d.k(bw.v);
        if (rjVar == null) {
            throw th;
        }
        rjVar.p(pjVar, th);
    }

    @Override // defpackage.pj
    public final Object r(gv gvVar, Object obj) {
        return gvVar.f(obj, this);
    }

    @Override // defpackage.pj
    public final pj v(oj ojVar) {
        return pk.am(this, ojVar);
    }
}

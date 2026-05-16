package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fj0 implements xj, bj0 {
    public static final na g = new na(0);
    public final pj d;
    public final fj0 e = this;
    public volatile pj f;

    public fj0(pj pjVar) {
        this.d = pjVar;
    }

    public final void a() {
        synchronized (this.e) {
            try {
                pj pjVar = this.f;
                if (pjVar == null) {
                    this.f = g;
                } else {
                    nu nuVar = new nu(0);
                    t00 t00Var = (t00) pjVar.k(bw.ae);
                    if (t00Var != null) {
                        t00Var.a(nuVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bj0
    public final void d() {
        a();
    }

    @Override // defpackage.bj0
    public final void e() {
        a();
    }

    @Override // defpackage.xj
    public final pj f() {
        pj pjVarJ;
        pj pjVar = this.f;
        if (pjVar == null || pjVar == g) {
            gg ggVar = (gg) this.d.k(gg.e);
            pj ej0Var = ggVar != null ? new ej0(ggVar, this) : pq.d;
            synchronized (this.e) {
                try {
                    pj pjVar2 = this.f;
                    if (pjVar2 == null) {
                        pj pjVar3 = this.d;
                        pjVarJ = pjVar3.j(new v00((t00) pjVar3.k(bw.ae))).j(pq.d).j(ej0Var);
                    } else if (pjVar2 == g) {
                        pj pjVar4 = this.d;
                        v00 v00Var = new v00((t00) pjVar4.k(bw.ae));
                        v00Var.ab(new nu(0));
                        pjVarJ = pjVar4.j(v00Var).j(pq.d).j(ej0Var);
                    } else {
                        pjVarJ = pjVar2;
                    }
                    this.f = pjVarJ;
                } catch (Throwable th) {
                    throw th;
                }
            }
            pjVar = pjVarJ;
        }
        pjVar.getClass();
        return pjVar;
    }

    @Override // defpackage.bj0
    public final void c() {
    }
}

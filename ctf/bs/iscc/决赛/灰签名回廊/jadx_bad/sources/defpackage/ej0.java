package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ej0 extends m implements rj {
    public final /* synthetic */ gg e;
    public final /* synthetic */ fj0 f;

    /* JADX WARN: Illegal instructions before constructor call */
    public ej0(gg ggVar, fj0 fj0Var) {
        bw bwVar = bw.v;
        this.e = ggVar;
        this.f = fj0Var;
        super(bwVar);
    }

    @Override // defpackage.rj
    public final void p(pj pjVar, Throwable th) throws Throwable {
        gg ggVar = this.e;
        fj0 fj0Var = this.f;
        f00.aj(th, new fg(0, ggVar, fj0Var));
        rj rjVar = (rj) fj0Var.d.k(bw.v);
        if (rjVar == null) {
            throw th;
        }
        rjVar.p(pjVar, th);
    }
}

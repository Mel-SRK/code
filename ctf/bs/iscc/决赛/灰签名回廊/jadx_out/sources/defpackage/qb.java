package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qb extends w00 implements pb {
    public final a10 h;

    public qb(a10 a10Var) {
        this.h = a10Var;
    }

    @Override // defpackage.pb
    public final boolean c(Throwable th) {
        return j().af(th);
    }

    @Override // defpackage.w00
    public final boolean k() {
        return true;
    }

    @Override // defpackage.w00
    public final void l(Throwable th) {
        this.h.ab(j());
    }
}

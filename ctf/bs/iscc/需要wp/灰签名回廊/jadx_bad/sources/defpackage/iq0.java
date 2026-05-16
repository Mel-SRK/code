package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iq0 extends ag {
    public long a;
    public la b;

    @Override // defpackage.ag
    public final boolean a(af afVar) {
        hq0 hq0Var = (hq0) afVar;
        if (this.a >= 0) {
            return false;
        }
        long j = hq0Var.l;
        if (j < hq0Var.m) {
            hq0Var.m = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.ag
    public final ji[] b(af afVar) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((hq0) afVar).v(j);
    }
}

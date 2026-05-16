package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fq0 implements en {
    public final hq0 d;
    public final long e;
    public final Object f;
    public final la g;

    public fq0(hq0 hq0Var, long j, Object obj, la laVar) {
        this.d = hq0Var;
        this.e = j;
        this.f = obj;
        this.g = laVar;
    }

    @Override // defpackage.en
    public final void a() {
        hq0 hq0Var = this.d;
        synchronized (hq0Var) {
            if (this.e < hq0Var.o()) {
                return;
            }
            Object[] objArr = hq0Var.k;
            objArr.getClass();
            long j = this.e;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            pk.n(objArr, j, pk.g);
            hq0Var.j();
        }
    }
}

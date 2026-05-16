package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ss0 extends vs0 {
    public w c;
    public int d;
    public int e;

    public ss0(long j, w wVar) {
        super(j);
        this.c = wVar;
    }

    @Override // defpackage.vs0
    public final void a(vs0 vs0Var) {
        synchronized (e00.v) {
            vs0Var.getClass();
            this.c = ((ss0) vs0Var).c;
            this.d = ((ss0) vs0Var).d;
            this.e = ((ss0) vs0Var).e;
        }
    }

    @Override // defpackage.vs0
    public final vs0 b(long j) {
        return new ss0(j, this.c);
    }
}

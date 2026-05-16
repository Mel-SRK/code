package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hr0 extends vs0 {
    public int c;

    public hr0(long j, int i) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.vs0
    public final void a(vs0 vs0Var) {
        vs0Var.getClass();
        this.c = ((hr0) vs0Var).c;
    }

    @Override // defpackage.vs0
    public final vs0 b(long j) {
        return new hr0(j, this.c);
    }
}

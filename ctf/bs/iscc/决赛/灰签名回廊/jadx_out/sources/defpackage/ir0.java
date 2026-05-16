package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ir0 extends vs0 {
    public long c;

    public ir0(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.vs0
    public final void a(vs0 vs0Var) {
        vs0Var.getClass();
        this.c = ((ir0) vs0Var).c;
    }

    @Override // defpackage.vs0
    public final vs0 b(long j) {
        return new ir0(j, this.c);
    }
}

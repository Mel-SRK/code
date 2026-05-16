package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gr0 extends vs0 {
    public float c;

    public gr0(long j, float f) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.vs0
    public final void a(vs0 vs0Var) {
        vs0Var.getClass();
        this.c = ((gr0) vs0Var).c;
    }

    @Override // defpackage.vs0
    public final vs0 b(long j) {
        return new gr0(j, this.c);
    }
}

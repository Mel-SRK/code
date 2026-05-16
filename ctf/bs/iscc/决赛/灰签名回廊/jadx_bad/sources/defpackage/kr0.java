package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kr0 extends vs0 {
    public Object c;

    public kr0(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.vs0
    public final void a(vs0 vs0Var) {
        vs0Var.getClass();
        this.c = ((kr0) vs0Var).c;
    }

    @Override // defpackage.vs0
    public final vs0 b(long j) {
        return new kr0(fr0.k().g(), this.c);
    }
}

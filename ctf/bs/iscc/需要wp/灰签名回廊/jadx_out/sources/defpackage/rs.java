package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rs {
    public final us a;
    public final b1 b;
    public final r80 c;
    public final r80 d;
    public boolean e;

    public rs(us usVar, b1 b1Var) {
        this.a = usVar;
        this.b = b1Var;
        int i = nm0.a;
        this.c = new r80();
        this.d = new r80();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        r0 r0Var = new r0(0, this, rs.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 1);
        m80 m80Var = this.b.bu;
        if (m80Var.f(r0Var) < 0) {
            m80Var.a(r0Var);
        }
        this.e = true;
    }
}

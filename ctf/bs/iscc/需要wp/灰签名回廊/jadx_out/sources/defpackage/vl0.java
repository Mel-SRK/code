package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vl0 implements s30, AutoCloseable {
    public final String d;
    public final ul0 e;
    public boolean f;

    public vl0(String str, ul0 ul0Var) {
        this.d = str;
        this.e = ul0Var;
    }

    @Override // defpackage.s30
    public final void d(u30 u30Var, n30 n30Var) {
        if (n30Var == n30.ON_DESTROY) {
            this.f = false;
            u30Var.getLifecycle().b(this);
        }
    }

    public final void e(p30 p30Var, bm0 bm0Var) {
        bm0Var.getClass();
        p30Var.getClass();
        if (this.f) {
            wc.q("Already attached to lifecycleOwner");
            return;
        }
        this.f = true;
        p30Var.a(this);
        bm0Var.b(this.d, (fe) this.e.a.e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}

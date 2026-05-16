package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class m90 {
    public k90 a;
    public boolean b;

    public final void a() {
        k90 k90Var = this.a;
        if (k90Var == null) {
            wc.q("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            k90Var.b(this, null);
        }
        n90 n90Var = k90Var.b;
        gb0 gb0Var = k90Var.a;
        n90Var.getClass();
        if (equals(n90Var.f) && -1 == n90Var.e) {
            n90Var.b();
            n90Var.e = 0;
            n90Var.f = null;
            ((ib0) gb0Var.d).a.run();
            ps0 ps0Var = n90Var.a;
            o90 o90Var = o90.k;
            ps0Var.getClass();
            ps0Var.h(null, o90Var);
        }
        this.b = false;
    }

    public void b() {
    }
}

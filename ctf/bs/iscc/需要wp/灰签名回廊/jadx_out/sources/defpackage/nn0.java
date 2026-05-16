package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nn0 implements um0 {
    public final /* synthetic */ rn0 a;
    public final /* synthetic */ pn0 b;

    public nn0(rn0 rn0Var, pn0 pn0Var) {
        this.a = rn0Var;
        this.b = pn0Var;
    }

    @Override // defpackage.um0
    public final float a(float f) {
        rn0 rn0Var = this.a;
        long jD = rn0Var.d(rn0Var.g(f));
        rn0 rn0Var2 = this.b.a;
        rn0Var2.g = 2;
        qd0 qd0Var = rn0Var2.b;
        return rn0Var.c(rn0Var.f((qd0Var == null || !(rn0Var2.a.c() || rn0Var2.a.a())) ? rn0.a(rn0Var2, rn0Var2.h, jD, 2) : qd0Var.e(jD, rn0Var2.g, rn0Var2.j)));
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q7 extends i70 implements wo, va0 {
    public long r;
    public aq0 s;
    public long t;
    public e20 u;
    public bd0 v;
    public aq0 w;

    @Override // defpackage.va0
    public final void af() {
        this.t = 9205357640488583168L;
        this.u = null;
        this.v = null;
        this.w = null;
        t1.ae(this);
    }

    @Override // defpackage.wo
    public final void d(u20 u20Var) {
        u20 u20Var2;
        ra raVar = u20Var.d;
        if (this.s != f00.i) {
            u20Var2 = u20Var;
            xi0 xi0Var = new xi0();
            if (pq0.a(raVar.c(), this.t) && u20Var2.getLayoutDirection() == this.u && f00.h(this.w, this.s)) {
                bd0 bd0Var = this.v;
                bd0Var.getClass();
                xi0Var.d = bd0Var;
            } else {
                az0.z(this, new p7(xi0Var, this, u20Var2, 0));
            }
            this.v = (bd0) xi0Var.d;
            this.t = raVar.c();
            this.u = u20Var2.getLayoutDirection();
            this.w = this.s;
            Object obj = xi0Var.d;
            obj.getClass();
            bd0 bd0Var2 = (bd0) obj;
            if (!qc.c(this.r, qc.g)) {
                m10.s(u20Var2, bd0Var2, this.r);
            }
        } else if (qc.c(this.r, qc.g)) {
            u20Var2 = u20Var;
        } else {
            u20Var2 = u20Var;
            xo.ab(u20Var2, this.r, 0L, 126);
        }
        u20Var2.a();
    }
}

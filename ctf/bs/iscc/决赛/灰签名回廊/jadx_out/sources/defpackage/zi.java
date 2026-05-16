package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zi extends x10 implements cv {
    public final /* synthetic */ h30 e;
    public final /* synthetic */ ys f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ cw0 h;
    public final /* synthetic */ ab0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(h30 h30Var, ys ysVar, boolean z, cw0 cw0Var, ab0 ab0Var) {
        super(1);
        this.e = h30Var;
        this.f = ysVar;
        this.g = z;
        this.h = cw0Var;
        this.i = ab0Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        long j = ((xa0) obj).a;
        h30 h30Var = this.e;
        if (h30Var.b()) {
            sr0 sr0Var = h30Var.c;
            if (sr0Var != null) {
                ((sl) sr0Var).b();
            }
        } else {
            ys ysVar = this.f;
            ysVar.getClass();
            ysVar.a(new yv0(1, 25));
        }
        if (h30Var.b() && this.g) {
            if (h30Var.a() != xw.e) {
                ax0 ax0VarD = h30Var.d();
                if (ax0VarD != null) {
                    f1 f1Var = h30Var.d;
                    wi wiVar = h30Var.t;
                    int iB = this.i.b(ax0VarD.b(j, true));
                    wiVar.g(lw0.a((lw0) f1Var.e, null, wo0.b(iB, iB), 5));
                    if (h30Var.a.a.e.length() > 0) {
                        h30Var.k.setValue(xw.f);
                    }
                }
            } else {
                this.h.e(new xa0(j));
            }
        }
        return wz0.a;
    }
}

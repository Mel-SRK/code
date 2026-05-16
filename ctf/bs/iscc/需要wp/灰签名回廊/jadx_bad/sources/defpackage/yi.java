package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yi extends x10 implements cv {
    public final /* synthetic */ h30 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ b21 g;
    public final /* synthetic */ cw0 h;
    public final /* synthetic */ lw0 i;
    public final /* synthetic */ ab0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(h30 h30Var, boolean z, b21 b21Var, cw0 cw0Var, lw0 lw0Var, ab0 ab0Var) {
        super(1);
        this.e = h30Var;
        this.f = z;
        this.g = b21Var;
        this.h = cw0Var;
        this.i = lw0Var;
        this.j = ab0Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        uw0 uw0Var;
        d20 d20Var;
        d20 d20Var2;
        d20 d20Var3 = (d20) obj;
        h30 h30Var = this.e;
        me0 me0Var = h30Var.o;
        h30Var.h = d20Var3;
        ax0 ax0VarD = h30Var.d();
        if (ax0VarD != null) {
            ax0VarD.b = d20Var3;
        }
        if (this.f) {
            xw xwVarA = h30Var.a();
            xw xwVar = xw.e;
            lw0 lw0Var = this.i;
            cw0 cw0Var = this.h;
            if (xwVarA == xwVar) {
                if (((Boolean) h30Var.l.getValue()).booleanValue() && ((Boolean) ((b30) this.g).a.getValue()).booleanValue()) {
                    cw0Var.o();
                } else {
                    cw0Var.k();
                }
                h30Var.m.setValue(Boolean.valueOf(lI.l(cw0Var, true)));
                h30Var.n.setValue(Boolean.valueOf(lI.l(cw0Var, false)));
                me0Var.setValue(Boolean.valueOf(hx0.b(lw0Var.b)));
            } else if (h30Var.a() == xw.f) {
                me0Var.setValue(Boolean.valueOf(lI.l(cw0Var, true)));
            }
            ab0 ab0Var = this.j;
            az0.y(h30Var, lw0Var, ab0Var);
            ax0 ax0VarD2 = h30Var.d();
            if (ax0VarD2 != null && (uw0Var = h30Var.e) != null && h30Var.b() && (d20Var = ax0VarD2.b) != null && d20Var.af() && (d20Var2 = ax0VarD2.c) != null) {
                zw0 zw0Var = ax0VarD2.a;
                l1 l1Var = new l1(28, d20Var);
                ri0 ri0VarP = lI.p(d20Var);
                ri0 ri0VarAk = d20Var.ak(d20Var2, false);
                if (f00.h((uw0) uw0Var.a.b.get(), uw0Var)) {
                    uw0Var.b.f(lw0Var, ab0Var, zw0Var, l1Var, ri0VarP, ri0VarAk);
                }
            }
        }
        return wz0.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gj extends x10 implements pu {
    public final /* synthetic */ h30 e;
    public final /* synthetic */ ys f;
    public final /* synthetic */ ey g;
    public final /* synthetic */ k3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(h30 h30Var, ys ysVar, ey eyVar, k3 k3Var) {
        super(0);
        this.e = h30Var;
        this.f = ysVar;
        this.g = eyVar;
        this.h = k3Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        u80 u80VarI;
        if (!this.e.b()) {
            ys ysVar = this.f;
            ysVar.getClass();
            ysVar.a(new yv0(1, 25));
        }
        int i = this.g.d;
        if (i != 7 && i != 8 && (u80VarI = this.h.i()) != null) {
            ((hq0) u80VarI).q(wz0.a);
        }
        return Boolean.TRUE;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p50 extends x10 implements pu {
    public final /* synthetic */ q50 e;
    public final /* synthetic */ b1 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p50(q50 q50Var, b1 b1Var, long j) {
        super(0);
        this.e = q50Var;
        this.f = b1Var;
        this.g = j;
    }

    @Override // defpackage.pu
    public final Object a() {
        l50 l50VarB;
        v20 v20Var = this.e.i;
        kf0 placementScope = null;
        if (t1.ai(v20Var.a) || v20Var.b) {
            fa0 fa0Var = v20Var.a().t;
            if (fa0Var != null) {
                placementScope = fa0Var.o;
            }
        } else {
            fa0 fa0Var2 = v20Var.a().t;
            if (fa0Var2 != null && (l50VarB = fa0Var2.B()) != null) {
                placementScope = l50VarB.o;
            }
        }
        if (placementScope == null) {
            placementScope = this.f.getPlacementScope();
        }
        l50 l50VarB2 = v20Var.a().B();
        l50VarB2.getClass();
        kf0.i(placementScope, l50VarB2, this.g);
        return wz0.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ul extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ vl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ul(vl vlVar, int i) {
        super(0);
        this.e = i;
        this.f = vlVar;
    }

    @Override // defpackage.pu
    public final Object a() {
        int i = this.e;
        vl vlVar = this.f;
        switch (i) {
            case 0:
                return m10.e;
            default:
                ik0 ik0Var = (ik0) i60.ab(vlVar, mk0.b);
                ok0 ok0Var = vlVar.x;
                if (ik0Var == null) {
                    if (ok0Var != null) {
                        vlVar.bv(ok0Var);
                    }
                } else if (ok0Var == null) {
                    int i2 = 0;
                    tl tlVar = new tl(i2, vlVar);
                    ul ulVar = new ul(vlVar, i2);
                    g80 g80Var = vlVar.t;
                    boolean z = vlVar.u;
                    float f = vlVar.v;
                    yy0 yy0Var = nk0.a;
                    ok0 qdVar = rk0.a ? new qd(g80Var, z, f, tlVar, ulVar) : new i4(g80Var, z, f, tlVar, ulVar);
                    vlVar.bu(qdVar);
                    vlVar.x = qdVar;
                }
                return wz0.a;
        }
    }
}

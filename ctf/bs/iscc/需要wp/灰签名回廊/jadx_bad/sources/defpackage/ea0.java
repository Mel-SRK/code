package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ea0 extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ fa0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea0(fa0 fa0Var, int i) {
        super(0);
        this.e = i;
        this.f = fa0Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        switch (this.e) {
            case 0:
                fa0 fa0Var = this.f;
                oa oaVar = fa0Var.ah;
                oaVar.getClass();
                fa0Var.lI(oaVar, fa0Var.ag);
                break;
            default:
                fa0 fa0Var2 = this.f.t;
                if (fa0Var2 != null) {
                    fa0Var2.K();
                }
                break;
        }
        return wz0.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cj extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ cw0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj(cw0 cw0Var, int i) {
        super(0);
        this.e = i;
        this.f = cw0Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        switch (this.e) {
            case 0:
                this.f.l();
                break;
            case 1:
                this.f.f(true);
                break;
            case 2:
                this.f.b(true);
                break;
            case 3:
                this.f.d();
                break;
            case 4:
                cw0 cw0Var = this.f;
                cw0Var.b(true);
                cw0Var.k();
                break;
            case 5:
                cw0 cw0Var2 = this.f;
                cw0Var2.d();
                cw0Var2.k();
                break;
            case 6:
                cw0 cw0Var3 = this.f;
                cw0Var3.l();
                cw0Var3.k();
                break;
            default:
                this.f.m();
                break;
        }
        return wz0.a;
    }
}

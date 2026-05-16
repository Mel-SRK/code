package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fw0 extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ zh f;
    public final /* synthetic */ cw0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fw0(zh zhVar, cw0 cw0Var, int i) {
        super(0);
        this.e = i;
        this.f = zhVar;
        this.g = cw0Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        switch (this.e) {
            case 0:
                this.g.d();
                this.f.a.setValue(wh.a);
                break;
            case 1:
                this.g.b(false);
                this.f.a.setValue(wh.a);
                break;
            case 2:
                this.g.l();
                this.f.a.setValue(wh.a);
                break;
            default:
                this.g.m();
                this.f.a.setValue(wh.a);
                break;
        }
        return wz0.a;
    }
}

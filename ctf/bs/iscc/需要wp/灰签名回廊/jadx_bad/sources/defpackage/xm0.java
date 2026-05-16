package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xm0 extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ ym0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xm0(ym0 ym0Var, int i) {
        super(0);
        this.e = i;
        this.f = ym0Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(this.f.a.g() > 0);
            default:
                ym0 ym0Var = this.f;
                return Boolean.valueOf(ym0Var.a.g() < ym0Var.d.g());
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c50 extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ fv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c50(fv0 fv0Var, int i) {
        super(0);
        this.e = i;
        this.f = fv0Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        switch (this.e) {
            case 0:
                this.f.a();
                break;
            default:
                this.f.onCancel();
                break;
        }
        return wz0.a;
    }
}

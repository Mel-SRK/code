package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ko0 extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ ms0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko0(ms0 ms0Var, int i) {
        super(0);
        this.e = i;
        this.f = ms0Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        int i = this.e;
        ms0 ms0Var = this.f;
        switch (i) {
            case 0:
                return new xa0(((xa0) ms0Var.getValue()).a);
            case 1:
                t5 t5Var = mo0.a;
                return new xa0(((xa0) ms0Var.getValue()).a);
            case 2:
                return Boolean.valueOf(((Number) ms0Var.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) ms0Var.getValue()).floatValue() > 0.0f);
        }
    }
}

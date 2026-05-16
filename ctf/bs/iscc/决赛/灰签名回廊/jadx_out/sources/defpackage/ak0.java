package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ak0 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ bk0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak0(bk0 bk0Var, int i) {
        super(1);
        this.e = i;
        this.f = bk0Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f.n.b(i60.r(dDoubleValue, r10.e, r10.f)));
            default:
                return Double.valueOf(i60.r(this.f.k.b(((Number) obj).doubleValue()), r10.e, r10.f));
        }
    }
}

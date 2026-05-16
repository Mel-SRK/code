package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ts extends x10 implements cv {
    public final /* synthetic */ xi0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts(xi0 xi0Var, int i) {
        super(1);
        this.e = xi0Var;
        this.f = i;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((gt) obj).O0(this.f));
        this.e.d = boolValueOf;
        return boolValueOf;
    }
}

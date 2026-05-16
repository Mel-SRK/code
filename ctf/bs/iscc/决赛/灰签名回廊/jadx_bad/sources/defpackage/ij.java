package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ij extends x10 implements gv {
    public final /* synthetic */ cw0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(cw0 cw0Var, boolean z, int i) {
        super(2);
        this.e = cw0Var;
        this.f = z;
        this.g = i;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iAr = d41.ar(this.g | 1);
        az0.g(this.e, this.f, (vf) obj, iAr);
        return wz0.a;
    }
}

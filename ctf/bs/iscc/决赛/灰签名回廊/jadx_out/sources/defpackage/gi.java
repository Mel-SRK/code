package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gi extends x10 implements gv {
    public final /* synthetic */ cw0 e;
    public final /* synthetic */ te f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(cw0 cw0Var, te teVar, int i) {
        super(2);
        this.e = cw0Var;
        this.f = teVar;
        this.g = i;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iAr = d41.ar(this.g | 1);
        i60.b(this.e, this.f, (vf) obj, iAr);
        return wz0.a;
    }
}

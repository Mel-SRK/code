package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l2 extends x10 implements gv {
    public final /* synthetic */ bb0 e;
    public final /* synthetic */ j70 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(bb0 bb0Var, j70 j70Var, long j, int i) {
        super(2);
        this.e = bb0Var;
        this.f = j70Var;
        this.g = j;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iAr = d41.ar(1);
        q2.a(this.e, this.f, this.g, (vf) obj, iAr);
        return wz0.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n4 extends x10 implements gv {
    public final /* synthetic */ bb0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ oj0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ long i;
    public final /* synthetic */ j70 j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(bb0 bb0Var, boolean z, oj0 oj0Var, boolean z2, long j, j70 j70Var, int i) {
        super(2);
        this.e = bb0Var;
        this.f = z;
        this.g = oj0Var;
        this.h = z2;
        this.i = j;
        this.j = j70Var;
        this.k = i;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        pk.g(this.e, this.f, this.g, this.h, this.i, this.j, (vf) obj, d41.ar(this.k | 1));
        return wz0.a;
    }
}

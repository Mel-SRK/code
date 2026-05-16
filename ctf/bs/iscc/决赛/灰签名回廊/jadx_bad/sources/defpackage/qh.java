package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qh extends x10 implements gv {
    public final /* synthetic */ zh e;
    public final /* synthetic */ pu f;
    public final /* synthetic */ a2 g;
    public final /* synthetic */ j70 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ te j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(zh zhVar, pu puVar, a2 a2Var, j70 j70Var, boolean z, te teVar, int i) {
        super(2);
        this.e = zhVar;
        this.f = puVar;
        this.g = a2Var;
        this.h = j70Var;
        this.i = z;
        this.j = teVar;
        this.k = i;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        e00.c(this.e, this.f, this.g, this.h, this.i, this.j, (vf) obj, d41.ar(this.k | 1));
        return wz0.a;
    }
}

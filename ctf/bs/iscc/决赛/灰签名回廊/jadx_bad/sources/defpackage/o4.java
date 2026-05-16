package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o4 extends x10 implements cv {
    public final /* synthetic */ bb0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(bb0 bb0Var, boolean z, boolean z2) {
        super(1);
        this.e = bb0Var;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        po0 po0Var = (po0) obj;
        long jA = this.e.a();
        po0Var.d(io0.c, new ho0(this.f ? vw.e : vw.f, jA, this.g ? 1 : 3, d41.ad(jA)));
        return wz0.a;
    }
}

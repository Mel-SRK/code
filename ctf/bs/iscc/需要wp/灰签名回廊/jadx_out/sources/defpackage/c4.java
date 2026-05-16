package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c4 extends x10 implements gv {
    public final /* synthetic */ bh0 e;
    public final /* synthetic */ pu f;
    public final /* synthetic */ ch0 g;
    public final /* synthetic */ te h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(bh0 bh0Var, pu puVar, ch0 ch0Var, te teVar, int i, int i2) {
        super(2);
        this.e = bh0Var;
        this.f = puVar;
        this.g = ch0Var;
        this.h = teVar;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        g4.a(this.e, this.f, this.g, this.h, (vf) obj, d41.ar(this.i | 1), this.j);
        return wz0.a;
    }
}

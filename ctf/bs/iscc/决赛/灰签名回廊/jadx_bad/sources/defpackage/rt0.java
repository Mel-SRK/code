package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rt0 extends x10 implements cv {
    public final /* synthetic */ xi0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ m5 g;
    public final /* synthetic */ w5 h;
    public final /* synthetic */ r5 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ cv k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt0(xi0 xi0Var, Object obj, m5 m5Var, w5 w5Var, r5 r5Var, float f, cv cvVar) {
        super(1);
        this.e = xi0Var;
        this.f = obj;
        this.g = m5Var;
        this.h = w5Var;
        this.i = r5Var;
        this.j = f;
        this.k = cvVar;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        m5 m5Var = this.g;
        p5 p5Var = new p5(this.f, m5Var.d(), this.h, jLongValue, m5Var.e(), jLongValue, new qt0(this.i, 0));
        lI.e(p5Var, jLongValue, this.j, this.g, this.i, this.k);
        this.e.d = p5Var;
        return wz0.a;
    }
}

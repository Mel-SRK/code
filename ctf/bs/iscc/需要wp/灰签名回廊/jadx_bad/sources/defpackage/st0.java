package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class st0 extends x10 implements cv {
    public final /* synthetic */ xi0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ m5 g;
    public final /* synthetic */ r5 h;
    public final /* synthetic */ cv i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st0(xi0 xi0Var, float f, m5 m5Var, r5 r5Var, cv cvVar) {
        super(1);
        this.e = xi0Var;
        this.f = f;
        this.g = m5Var;
        this.h = r5Var;
        this.i = cvVar;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.e.d;
        obj2.getClass();
        lI.e((p5) obj2, jLongValue, this.f, this.g, this.h, this.i);
        return wz0.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m2 extends x10 implements gv {
    public final /* synthetic */ j70 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(j70 j70Var, int i, int i2) {
        super(2);
        this.e = j70Var;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iAr = d41.ar(this.f | 1);
        int i = this.g;
        q2.b(this.e, (vf) obj, iAr, i);
        return wz0.a;
    }
}

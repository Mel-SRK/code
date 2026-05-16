package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x7 extends x10 implements gv {
    public final /* synthetic */ String e;
    public final /* synthetic */ j70 f;
    public final /* synthetic */ nx0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(String str, j70 j70Var, nx0 nx0Var, int i, boolean z, int i2, int i3, int i4, int i5) {
        super(2);
        this.e = str;
        this.f = j70Var;
        this.g = nx0Var;
        this.h = i;
        this.i = z;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = i5;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        d41.f(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (vf) obj, d41.ar(this.l | 1), this.m);
        return wz0.a;
    }
}

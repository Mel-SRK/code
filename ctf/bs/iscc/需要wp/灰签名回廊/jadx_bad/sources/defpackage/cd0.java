package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cd0 extends x10 implements gv {
    public final /* synthetic */ ed0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ g80 g;
    public final /* synthetic */ j70 h;
    public final /* synthetic */ gv0 i;
    public final /* synthetic */ aq0 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd0(ed0 ed0Var, boolean z, g80 g80Var, j70 j70Var, gv0 gv0Var, aq0 aq0Var, float f, float f2, int i, int i2) {
        super(2);
        this.e = ed0Var;
        this.f = z;
        this.g = g80Var;
        this.h = j70Var;
        this.i = gv0Var;
        this.j = aq0Var;
        this.k = f;
        this.l = f2;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.e.a(this.f, this.g, this.h, this.i, this.j, this.k, this.l, (vf) obj, d41.ar(this.m | 1), this.n);
        return wz0.a;
    }
}

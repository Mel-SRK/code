package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class md0 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ lf0 g;
    public final /* synthetic */ lf0 h;
    public final /* synthetic */ lf0 i;
    public final /* synthetic */ lf0 j;
    public final /* synthetic */ lf0 k;
    public final /* synthetic */ lf0 l;
    public final /* synthetic */ lf0 m;
    public final /* synthetic */ lf0 n;
    public final /* synthetic */ lf0 o;
    public final /* synthetic */ nd0 p;
    public final /* synthetic */ r60 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md0(int i, int i2, lf0 lf0Var, lf0 lf0Var2, lf0 lf0Var3, lf0 lf0Var4, lf0 lf0Var5, lf0 lf0Var6, lf0 lf0Var7, lf0 lf0Var8, lf0 lf0Var9, nd0 nd0Var, r60 r60Var) {
        super(1);
        this.e = i;
        this.f = i2;
        this.g = lf0Var;
        this.h = lf0Var2;
        this.i = lf0Var3;
        this.j = lf0Var4;
        this.k = lf0Var5;
        this.l = lf0Var6;
        this.m = lf0Var7;
        this.n = lf0Var8;
        this.o = lf0Var9;
        this.p = nd0Var;
        this.q = r60Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        float f;
        int iRound;
        kf0 kf0Var = (kf0) obj;
        nd0 nd0Var = this.p;
        float f2 = nd0Var.c;
        boolean z = nd0Var.b;
        r60 r60Var = this.q;
        float fB = r60Var.b();
        e20 layoutDirection = r60Var.getLayoutDirection();
        wd0 wd0Var = nd0Var.d;
        float f3 = ld0.a;
        kf0.i(kf0Var, this.n, 0L);
        float f4 = qv0.b;
        lf0 lf0Var = this.o;
        int i = this.e - (lf0Var != null ? lf0Var.e : 0);
        int iAx = i60.ax(wd0Var.b * fB);
        int iAx2 = i60.ax((layoutDirection == e20.d ? wd0Var.a(layoutDirection) : wd0Var.b(layoutDirection)) * fB);
        float f5 = qv0.c * fB;
        lf0 lf0Var2 = this.g;
        if (lf0Var2 != null) {
            kf0.j(kf0Var, lf0Var2, 0, Math.round((1 + 0.0f) * ((i - lf0Var2.e) / 2.0f)));
        }
        lf0 lf0Var3 = this.l;
        if (lf0Var3 != null) {
            if (z) {
                f = 2.0f;
                iRound = Math.round((1 + 0.0f) * ((i - lf0Var3.e) / 2.0f));
            } else {
                f = 2.0f;
                iRound = iAx;
            }
            kf0.j(kf0Var, lf0Var3, i60.ax(lf0Var2 == null ? 0.0f : (1 - f2) * (lf0Var2.d - f5)) + iAx2, m10.aj(f2, iRound, -(lf0Var3.e / 2)));
        } else {
            f = 2.0f;
        }
        lf0 lf0Var4 = this.i;
        if (lf0Var4 != null) {
            kf0.j(kf0Var, lf0Var4, lf0Var2 != null ? lf0Var2.d : 0, ld0.e(z, i, iAx, lf0Var3, lf0Var4));
        }
        int i2 = (lf0Var2 != null ? lf0Var2.d : 0) + (lf0Var4 != null ? lf0Var4.d : 0);
        lf0 lf0Var5 = this.k;
        kf0.j(kf0Var, lf0Var5, i2, ld0.e(z, i, iAx, lf0Var3, lf0Var5));
        lf0 lf0Var6 = this.m;
        if (lf0Var6 != null) {
            kf0.j(kf0Var, lf0Var6, i2, ld0.e(z, i, iAx, lf0Var3, lf0Var6));
        }
        int i3 = this.f;
        lf0 lf0Var7 = this.h;
        lf0 lf0Var8 = this.j;
        if (lf0Var8 != null) {
            kf0.j(kf0Var, lf0Var8, (i3 - (lf0Var7 != null ? lf0Var7.d : 0)) - lf0Var8.d, ld0.e(z, i, iAx, lf0Var3, lf0Var8));
        }
        if (lf0Var7 != null) {
            kf0.j(kf0Var, lf0Var7, i3 - lf0Var7.d, Math.round((1 + 0.0f) * ((i - lf0Var7.e) / f)));
        }
        if (lf0Var != null) {
            kf0.j(kf0Var, lf0Var, 0, i);
        }
        return wz0.a;
    }
}

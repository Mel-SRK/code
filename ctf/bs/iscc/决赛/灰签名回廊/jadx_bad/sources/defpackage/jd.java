package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jd extends x10 implements cv {
    public final /* synthetic */ lf0[] e;
    public final /* synthetic */ kd f;
    public final /* synthetic */ int g;
    public final /* synthetic */ r60 h;
    public final /* synthetic */ int[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(lf0[] lf0VarArr, kd kdVar, int i, r60 r60Var, int[] iArr) {
        super(1);
        this.e = lf0VarArr;
        this.f = kdVar;
        this.g = i;
        this.h = r60Var;
        this.i = iArr;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        kf0 kf0Var = (kf0) obj;
        lf0[] lf0VarArr = this.e;
        int length = lf0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            lf0 lf0Var = lf0VarArr[i];
            int i3 = i2 + 1;
            lf0Var.getClass();
            lf0Var.j();
            e20 layoutDirection = this.h.getLayoutDirection();
            float f = (this.g - lf0Var.d) / 2.0f;
            float f2 = this.f.b.a;
            if (layoutDirection != e20.d) {
                f2 *= -1;
            }
            kf0.h(kf0Var, lf0Var, Math.round((1 + f2) * f), this.i[i2]);
            i++;
            i2 = i3;
        }
        return wz0.a;
    }
}

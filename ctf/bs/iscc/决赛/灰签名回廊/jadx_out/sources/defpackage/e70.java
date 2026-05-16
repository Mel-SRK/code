package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e70 extends x10 implements cv {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ lf0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e70(int i, lf0 lf0Var, int i2) {
        super(1);
        this.g = i;
        this.f = lf0Var;
        this.h = i2;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                kf0.h((kf0) obj, this.f, i60.ax((this.g - r0.d) / 2.0f), i60.ax((this.h - r0.e) / 2.0f));
                break;
            default:
                kf0.h((kf0) obj, this.f, -this.g, -this.h);
                break;
        }
        return wz0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e70(lf0 lf0Var, int i, int i2) {
        super(1);
        this.f = lf0Var;
        this.g = i;
        this.h = i2;
    }
}

package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n8 extends x10 implements cv {
    public final /* synthetic */ lf0 e;
    public final /* synthetic */ k60 f;
    public final /* synthetic */ r60 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ p8 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(lf0 lf0Var, k60 k60Var, r60 r60Var, int i, int i2, p8 p8Var) {
        super(1);
        this.e = lf0Var;
        this.f = k60Var;
        this.g = r60Var;
        this.h = i;
        this.i = i2;
        this.j = p8Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        e20 layoutDirection = this.g.getLayoutDirection();
        b8 b8Var = this.j.a;
        HashMap map = m8.a;
        this.f.j();
        lf0 lf0Var = this.e;
        kf0.i((kf0) obj, lf0Var, b8Var.a(e00.f(lf0Var.d, lf0Var.e), e00.f(this.h, this.i), layoutDirection));
        return wz0.a;
    }
}

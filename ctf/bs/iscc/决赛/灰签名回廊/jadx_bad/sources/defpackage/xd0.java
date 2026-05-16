package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xd0 extends i70 implements l20 {
    public wd0 r;

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        float f = 0;
        if (Float.compare(this.r.a(r60Var.getLayoutDirection()), f) < 0 || Float.compare(this.r.b, f) < 0 || Float.compare(this.r.b(r60Var.getLayoutDirection()), f) < 0 || Float.compare(this.r.d, f) < 0) {
            wc.n("Padding must be non-negative");
            return null;
        }
        int iAi = r60Var.ai(this.r.b(r60Var.getLayoutDirection())) + r60Var.ai(this.r.a(r60Var.getLayoutDirection()));
        int iAi2 = r60Var.ai(this.r.d) + r60Var.ai(this.r.b);
        lf0 lf0VarE = k60Var.e(eh.i(-iAi, -iAi2, j));
        return r60Var.av(eh.g(j, lf0VarE.d + iAi), eh.f(j, lf0VarE.e + iAi2), sq.d, new g5(lf0VarE, r60Var, this, 7));
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vd0 extends i70 implements l20 {
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        int iAi = r60Var.ai(this.t) + r60Var.ai(this.r);
        int iAi2 = r60Var.ai(this.u) + r60Var.ai(this.s);
        lf0 lf0VarE = k60Var.e(eh.i(-iAi, -iAi2, j));
        return r60Var.av(eh.g(j, lf0VarE.d + iAi), eh.f(j, lf0VarE.e + iAi2), sq.d, new g5(this, lf0VarE, r60Var, 6));
    }
}

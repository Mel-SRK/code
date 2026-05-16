package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jr extends i70 implements l20 {
    public int r;
    public float s;

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        int iJ;
        int iH;
        int iG;
        int iT;
        if (!dh.d(j) || this.r == 1) {
            iJ = dh.j(j);
            iH = dh.h(j);
        } else {
            iJ = i60.t(Math.round(dh.h(j) * this.s), dh.j(j), dh.h(j));
            iH = iJ;
        }
        if (!dh.c(j) || this.r == 2) {
            int i = dh.i(j);
            iG = dh.g(j);
            iT = i;
        } else {
            iT = i60.t(Math.round(dh.g(j) * this.s), dh.i(j), dh.g(j));
            iG = iT;
        }
        lf0 lf0VarE = k60Var.e(eh.a(iJ, iH, iT, iG));
        return r60Var.av(lf0VarE.d, lf0VarE.e, sq.d, new d4(lf0VarE, 1));
    }
}

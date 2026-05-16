package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qq0 extends i70 implements l20 {
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;

    @Override // defpackage.l20
    public final int aj(j50 j50Var, k60 k60Var, int i) {
        long jBu = bu(j50Var);
        return dh.f(jBu) ? dh.h(jBu) : eh.g(jBu, k60Var.ap(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long bu(r60 r60Var) {
        int iAi;
        int iAi2;
        int iAi3;
        int i = 0;
        if (mn.a(this.t, Float.NaN)) {
            iAi = Integer.MAX_VALUE;
        } else {
            iAi = r60Var.ai(this.t);
            if (iAi < 0) {
                iAi = 0;
            }
        }
        if (mn.a(this.u, Float.NaN)) {
            iAi2 = Integer.MAX_VALUE;
        } else {
            iAi2 = r60Var.ai(this.u);
            if (iAi2 < 0) {
                iAi2 = 0;
            }
        }
        if (mn.a(this.r, Float.NaN)) {
            iAi3 = 0;
        } else {
            iAi3 = r60Var.ai(this.r);
            if (iAi3 > iAi) {
                iAi3 = iAi;
            }
            if (iAi3 < 0) {
                iAi3 = 0;
            }
            if (iAi3 == Integer.MAX_VALUE) {
            }
        }
        if (!mn.a(this.s, Float.NaN)) {
            int iAi4 = r60Var.ai(this.s);
            if (iAi4 > iAi2) {
                iAi4 = iAi2;
            }
            if (iAi4 < 0) {
                iAi4 = 0;
            }
            if (iAi4 != Integer.MAX_VALUE) {
                i = iAi4;
            }
        }
        return eh.a(iAi3, iAi, i, iAi2);
    }

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jBu = bu(r60Var);
        if (this.v) {
            jA = eh.e(j, jBu);
        } else {
            if (mn.a(this.r, Float.NaN)) {
                iJ = dh.j(j);
                int iH2 = dh.h(jBu);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = dh.j(jBu);
            }
            if (mn.a(this.t, Float.NaN)) {
                iH = dh.h(j);
                int iJ2 = dh.j(jBu);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = dh.h(jBu);
            }
            if (mn.a(this.s, Float.NaN)) {
                i = dh.i(j);
                int iG2 = dh.g(jBu);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = dh.i(jBu);
            }
            if (mn.a(this.u, Float.NaN)) {
                iG = dh.g(j);
                int i2 = dh.i(jBu);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = dh.g(jBu);
            }
            jA = eh.a(iJ, iH, i, iG);
        }
        lf0 lf0VarE = k60Var.e(jA);
        return r60Var.av(lf0VarE.d, lf0VarE.e, sq.d, new d4(lf0VarE, 5));
    }

    @Override // defpackage.l20
    public final int f(j50 j50Var, k60 k60Var, int i) {
        long jBu = bu(j50Var);
        return dh.f(jBu) ? dh.h(jBu) : eh.g(jBu, k60Var.aw(i));
    }

    @Override // defpackage.l20
    public final int n(j50 j50Var, k60 k60Var, int i) {
        long jBu = bu(j50Var);
        return dh.e(jBu) ? dh.g(jBu) : eh.f(jBu, k60Var.f(i));
    }

    @Override // defpackage.l20
    public final int z(j50 j50Var, k60 k60Var, int i) {
        long jBu = bu(j50Var);
        return dh.e(jBu) ? dh.g(jBu) : eh.f(jBu, k60Var.ax(i));
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d01 extends i70 implements l20 {
    public float r;
    public float s;

    @Override // defpackage.l20
    public final int aj(j50 j50Var, k60 k60Var, int i) {
        int iAp = k60Var.ap(i);
        int iAi = !mn.a(this.r, Float.NaN) ? j50Var.ai(this.r) : 0;
        return iAp < iAi ? iAi : iAp;
    }

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        int iJ;
        int i = 0;
        if (mn.a(this.r, Float.NaN) || dh.j(j) != 0) {
            iJ = dh.j(j);
        } else {
            iJ = r60Var.ai(this.r);
            int iH = dh.h(j);
            if (iJ > iH) {
                iJ = iH;
            }
            if (iJ < 0) {
                iJ = 0;
            }
        }
        int iH2 = dh.h(j);
        if (mn.a(this.s, Float.NaN) || dh.i(j) != 0) {
            i = dh.i(j);
        } else {
            int iAi = r60Var.ai(this.s);
            int iG = dh.g(j);
            if (iAi > iG) {
                iAi = iG;
            }
            if (iAi >= 0) {
                i = iAi;
            }
        }
        lf0 lf0VarE = k60Var.e(eh.a(iJ, iH2, i, dh.g(j)));
        return r60Var.av(lf0VarE.d, lf0VarE.e, sq.d, new d4(lf0VarE, 8));
    }

    @Override // defpackage.l20
    public final int f(j50 j50Var, k60 k60Var, int i) {
        int iAw = k60Var.aw(i);
        int iAi = !mn.a(this.r, Float.NaN) ? j50Var.ai(this.r) : 0;
        return iAw < iAi ? iAi : iAw;
    }

    @Override // defpackage.l20
    public final int n(j50 j50Var, k60 k60Var, int i) {
        int iF = k60Var.f(i);
        int iAi = !mn.a(this.s, Float.NaN) ? j50Var.ai(this.s) : 0;
        return iF < iAi ? iAi : iF;
    }

    @Override // defpackage.l20
    public final int z(j50 j50Var, k60 k60Var, int i) {
        int iAx = k60Var.ax(i);
        int iAi = !mn.a(this.s, Float.NaN) ? j50Var.ai(this.s) : 0;
        return iAx < iAi ? iAi : iAx;
    }
}

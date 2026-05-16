package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d00 extends i70 implements l20 {
    public int r;
    public boolean s;

    @Override // defpackage.l20
    public final int aj(j50 j50Var, k60 k60Var, int i) {
        return this.r == 1 ? k60Var.ap(i) : k60Var.aw(i);
    }

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        int iAp = this.r == 1 ? k60Var.ap(dh.g(j)) : k60Var.aw(dh.g(j));
        if (iAp < 0) {
            iAp = 0;
        }
        if (iAp < 0) {
            uy.a("width must be >= 0");
        }
        long jH = eh.h(iAp, iAp, 0, Integer.MAX_VALUE);
        if (this.s) {
            jH = eh.e(j, jH);
        }
        lf0 lf0VarE = k60Var.e(jH);
        return r60Var.av(lf0VarE.d, lf0VarE.e, sq.d, new d4(lf0VarE, 2));
    }

    @Override // defpackage.l20
    public final int f(j50 j50Var, k60 k60Var, int i) {
        return this.r == 1 ? k60Var.ap(i) : k60Var.aw(i);
    }

    @Override // defpackage.l20
    public final int n(j50 j50Var, k60 k60Var, int i) {
        return k60Var.f(i);
    }

    @Override // defpackage.l20
    public final int z(j50 j50Var, k60 k60Var, int i) {
        return k60Var.ax(i);
    }
}

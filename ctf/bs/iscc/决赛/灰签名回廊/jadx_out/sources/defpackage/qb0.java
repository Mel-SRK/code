package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qb0 extends tc0 {
    public static final qb0 c = new qb0(0, 2, 1);

    @Override // defpackage.tc0
    public final void a(tv tvVar, p6 p6Var, vq0 vq0Var, da0 da0Var, uc0 uc0Var) {
        Il il = (Il) tvVar.d(0);
        Object objD = tvVar.d(1);
        if (objD instanceof cj0) {
            cj0 cj0Var = (cj0) objD;
            da0Var.c.b(cj0Var);
            ((r80) da0Var.g).a(cj0Var);
        }
        if (vq0Var.n != 0) {
            xf.c("Can only append a slot if not current inserting");
        }
        int i = vq0Var.i;
        int i2 = vq0Var.j;
        int iC = vq0Var.c(il);
        int iG = vq0Var.g(vq0Var.b, vq0Var.q(iC + 1));
        vq0Var.i = iG;
        vq0Var.j = iG;
        vq0Var.v(1, iC);
        if (i >= iG) {
            i++;
            i2++;
        }
        vq0Var.c[iG] = objD;
        vq0Var.i = i;
        vq0Var.j = i2;
    }
}

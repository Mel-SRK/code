package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ub0 extends tc0 {
    public static final ub0 c = new ub0(0, 2, 1);

    @Override // defpackage.tc0
    public final void a(tv tvVar, p6 p6Var, vq0 vq0Var, da0 da0Var, uc0 uc0Var) {
        int i;
        uz uzVar = (uz) tvVar.d(0);
        int iC = vq0Var.c((Il) tvVar.d(1));
        if (vq0Var.t >= iC) {
            xf.c("Check failed");
        }
        pk.ap(vq0Var, p6Var, iC);
        int i2 = vq0Var.t;
        int iAc = vq0Var.v;
        while (iAc >= 0 && !vq0Var.w(iAc)) {
            iAc = vq0Var.ac(vq0Var.b, iAc);
        }
        int iS = iAc + 1;
        int iAj = 0;
        while (iS < i2) {
            if (vq0Var.t(i2, iS)) {
                if (vq0Var.w(iS)) {
                    iAj = 0;
                }
                iS++;
            } else {
                iAj += vq0Var.w(iS) ? 1 : vq0Var.b[(vq0Var.q(iS) * 5) + 1] & 67108863;
                iS += vq0Var.s(iS);
            }
        }
        while (true) {
            i = vq0Var.t;
            if (i >= iC) {
                break;
            }
            if (vq0Var.t(iC, i)) {
                int i3 = vq0Var.t;
                if (i3 < vq0Var.u && (vq0Var.b[(vq0Var.q(i3) * 5) + 1] & 1073741824) != 0) {
                    p6Var.c(vq0Var.ab(vq0Var.t));
                    iAj = 0;
                }
                vq0Var.an();
            } else {
                iAj += vq0Var.aj();
            }
        }
        if (i != iC) {
            xf.c("Check failed");
        }
        uzVar.a = iAj;
    }
}

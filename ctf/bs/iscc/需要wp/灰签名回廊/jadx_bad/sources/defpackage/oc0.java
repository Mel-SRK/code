package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oc0 extends tc0 {
    public static final oc0 c = new oc0(1, 0, 2);

    @Override // defpackage.tc0
    public final void a(tv tvVar, p6 p6Var, vq0 vq0Var, da0 da0Var, uc0 uc0Var) {
        int iC = tvVar.c(0);
        int i = vq0Var.v;
        int iAl = vq0Var.al(vq0Var.b, vq0Var.q(i));
        int iG = vq0Var.g(vq0Var.b, vq0Var.q(i + 1));
        for (int iMax = Math.max(iAl, iG - iC); iMax < iG; iMax++) {
            Object obj = vq0Var.c[vq0Var.h(iMax)];
            if (obj instanceof cj0) {
                da0Var.g((cj0) obj);
            } else if (obj instanceof hi0) {
                ((hi0) obj).c();
            }
        }
        if (iC <= 0) {
            xf.c("Check failed");
        }
        int i2 = vq0Var.v;
        int iAl2 = vq0Var.al(vq0Var.b, vq0Var.q(i2));
        int iG2 = vq0Var.g(vq0Var.b, vq0Var.q(i2 + 1)) - iC;
        if (iG2 < iAl2) {
            xf.c("Check failed");
        }
        vq0Var.ah(iG2, iC, i2);
        int i3 = vq0Var.i;
        if (i3 >= iAl2) {
            vq0Var.i = i3 - iC;
        }
    }
}

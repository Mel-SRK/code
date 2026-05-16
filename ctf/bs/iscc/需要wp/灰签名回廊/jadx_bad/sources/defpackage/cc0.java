package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cc0 extends tc0 {
    public static final cc0 d;
    public static final cc0 e;
    public static final cc0 f;
    public static final cc0 g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new cc0(i, 2, 0);
        int i2 = 1;
        e = new cc0(i2, i2, 1);
        f = new cc0(i, 2, 2);
        int i3 = 1;
        g = new cc0(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc0(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.tc0
    public final void a(tv tvVar, p6 p6Var, vq0 vq0Var, da0 da0Var, uc0 uc0Var) {
        switch (this.c) {
            case 0:
                Object objA = ((pu) tvVar.d(0)).a();
                Il il = (Il) tvVar.d(1);
                int iC = tvVar.c(0);
                il.getClass();
                vq0Var.as(vq0Var.c(il), objA);
                p6Var.e(iC, objA);
                p6Var.c(objA);
                break;
            case 1:
                Il il2 = (Il) tvVar.d(0);
                int iC2 = tvVar.c(0);
                p6Var.m();
                il2.getClass();
                p6Var.b(iC2, vq0Var.ab(vq0Var.c(il2)));
                break;
            case 2:
                Object objD = tvVar.d(0);
                Il il3 = (Il) tvVar.d(1);
                int iC3 = tvVar.c(0);
                if (objD instanceof cj0) {
                    cj0 cj0Var = (cj0) objD;
                    da0Var.c.b(cj0Var);
                    ((r80) da0Var.g).a(cj0Var);
                }
                Object objAi = vq0Var.ai(vq0Var.c(il3), iC3, objD);
                if (objAi instanceof cj0) {
                    da0Var.g((cj0) objAi);
                } else if (objAi instanceof hi0) {
                    ((hi0) objAi).c();
                }
                break;
            default:
                Object objD2 = tvVar.d(0);
                int iC4 = tvVar.c(0);
                if (objD2 instanceof cj0) {
                    cj0 cj0Var2 = (cj0) objD2;
                    da0Var.c.b(cj0Var2);
                    ((r80) da0Var.g).a(cj0Var2);
                }
                Object objAi2 = vq0Var.ai(vq0Var.t, iC4, objD2);
                if (objAi2 instanceof cj0) {
                    da0Var.g((cj0) objAi2);
                } else if (objAi2 instanceof hi0) {
                    ((hi0) objAi2).c();
                }
                break;
        }
    }

    @Override // defpackage.tc0
    public Il b(tv tvVar) {
        switch (this.c) {
            case 0:
                return (Il) tvVar.d(1);
            case 1:
                return (Il) tvVar.d(0);
            default:
                return super.b(tvVar);
        }
    }
}

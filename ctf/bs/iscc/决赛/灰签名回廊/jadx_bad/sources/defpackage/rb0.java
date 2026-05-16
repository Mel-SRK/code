package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rb0 extends tc0 {
    public static final rb0 c = new rb0(0, 2, 1);

    @Override // defpackage.tc0
    public final void a(tv tvVar, p6 p6Var, vq0 vq0Var, da0 da0Var, uc0 uc0Var) {
        uz uzVar = (uz) tvVar.d(1);
        int i = uzVar != null ? uzVar.a : 0;
        wa waVar = (wa) tvVar.d(0);
        if (i > 0) {
            p6Var = new ya0(p6Var, i);
        }
        waVar.an(p6Var, vq0Var, da0Var, uc0Var != null ? new f1(13, uc0Var, vq0Var) : null);
    }
}

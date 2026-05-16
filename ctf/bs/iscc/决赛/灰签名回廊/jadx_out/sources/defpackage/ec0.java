package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ec0 extends tc0 {
    public static final ec0 c = new ec0(0, 3, 1);

    @Override // defpackage.tc0
    public final void a(tv tvVar, p6 p6Var, vq0 vq0Var, da0 da0Var, uc0 uc0Var) {
        f1 f1Var;
        sq0 sq0Var = (sq0) tvVar.d(1);
        Il il = (Il) tvVar.d(0);
        pr prVar = (pr) tvVar.d(2);
        vq0 vq0VarD = sq0Var.d();
        if (uc0Var != null) {
            try {
                f1Var = new f1(13, uc0Var, vq0Var);
            } catch (Throwable th) {
                vq0VarD.e(false);
                throw th;
            }
        } else {
            f1Var = null;
        }
        if (!prVar.l.ap()) {
            xf.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        prVar.k.ao(p6Var, vq0VarD, da0Var, f1Var);
        vq0VarD.e(true);
        vq0Var.d();
        il.getClass();
        vq0Var.y(sq0Var, sq0Var.a(il));
        vq0Var.k();
    }
}

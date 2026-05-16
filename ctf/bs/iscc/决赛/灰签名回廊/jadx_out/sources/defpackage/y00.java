package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y00 extends w00 {
    public final a10 h;
    public final z00 i;
    public final qb j;
    public final Object k;

    public y00(a10 a10Var, z00 z00Var, qb qbVar, Object obj) {
        this.h = a10Var;
        this.i = z00Var;
        this.j = qbVar;
        this.k = obj;
    }

    @Override // defpackage.w00
    public final boolean k() {
        return false;
    }

    @Override // defpackage.w00
    public final void l(Throwable th) {
        qb qbVar = this.j;
        qb qbVarAu = a10.au(qbVar);
        a10 a10Var = this.h;
        z00 z00Var = this.i;
        Object obj = this.k;
        if (qbVarAu == null || !a10Var.bd(z00Var, qbVarAu, obj)) {
            z00Var.d.e(new o40(2), 2);
            qb qbVarAu2 = a10.au(qbVar);
            if (qbVarAu2 == null || !a10Var.bd(z00Var, qbVarAu2, obj)) {
                a10Var.z(a10Var.ai(z00Var, obj));
            }
        }
    }
}

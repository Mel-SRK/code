package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class en0 {
    public final rn0 a;
    public boolean b;

    public en0(rn0 rn0Var, boolean z) {
        this.a = rn0Var;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, ki kiVar) {
        dn0 dn0Var;
        long jD;
        if (kiVar instanceof dn0) {
            dn0Var = (dn0) kiVar;
            int i = dn0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                dn0Var.j = i - Integer.MIN_VALUE;
            } else {
                dn0Var = new dn0(this, kiVar);
            }
        }
        Object objB = dn0Var.h;
        int i2 = dn0Var.j;
        if (i2 == 0) {
            i60.az(objB);
            if (!this.b) {
                jD = 0;
                return new o01(jD);
            }
            dn0Var.g = j2;
            dn0Var.j = 1;
            objB = this.a.b(j2, dn0Var);
            yj yjVar = yj.d;
            if (objB == yjVar) {
                return yjVar;
            }
        } else {
            if (i2 != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = dn0Var.g;
            i60.az(objB);
        }
        jD = o01.d(j2, ((o01) objB).a);
        return new o01(jD);
    }
}

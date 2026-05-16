package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ax0 {
    public final zw0 a;
    public d20 b = null;
    public d20 c;

    public ax0(zw0 zw0Var, d20 d20Var) {
        this.a = zw0Var;
        this.c = d20Var;
    }

    public final long a(long j) {
        ri0 ri0VarAk;
        d20 d20Var = this.b;
        ri0 ri0Var = ri0.e;
        if (d20Var != null) {
            if (d20Var.af()) {
                d20 d20Var2 = this.c;
                ri0VarAk = d20Var2 != null ? d20Var2.ak(d20Var, true) : null;
            } else {
                ri0VarAk = ri0Var;
            }
            if (ri0VarAk != null) {
                ri0Var = ri0VarAk;
            }
        }
        float fD = xa0.d(j);
        float fD2 = ri0Var.a;
        if (fD >= fD2) {
            float fD3 = xa0.d(j);
            fD2 = ri0Var.c;
            if (fD3 <= fD2) {
                fD2 = xa0.d(j);
            }
        }
        float fE = xa0.e(j);
        float fE2 = ri0Var.b;
        if (fE >= fE2) {
            float fE3 = xa0.e(j);
            fE2 = ri0Var.d;
            if (fE3 <= fE2) {
                fE2 = xa0.e(j);
            }
        }
        return d41.h(fD2, fE2);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.e(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fE = xa0.e(jD);
        zw0 zw0Var = this.a;
        int iC = zw0Var.b.c(fE);
        return xa0.d(jD) >= zw0Var.f(iC) && xa0.d(jD) <= zw0Var.g(iC);
    }

    public final long d(long j) {
        d20 d20Var;
        d20 d20Var2 = this.b;
        if (d20Var2 == null) {
            return j;
        }
        if (!d20Var2.af()) {
            d20Var2 = null;
        }
        if (d20Var2 == null || (d20Var = this.c) == null) {
            return j;
        }
        d20 d20Var3 = d20Var.af() ? d20Var : null;
        return d20Var3 == null ? j : d20Var2.z(d20Var3, j);
    }

    public final long e(long j) {
        d20 d20Var;
        d20 d20Var2 = this.b;
        if (d20Var2 == null) {
            return j;
        }
        if (!d20Var2.af()) {
            d20Var2 = null;
        }
        if (d20Var2 == null || (d20Var = this.c) == null) {
            return j;
        }
        d20 d20Var3 = d20Var.af() ? d20Var : null;
        return d20Var3 == null ? j : d20Var3.z(d20Var2, j);
    }
}

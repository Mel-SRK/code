package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p8 implements p60 {
    public final b8 a;
    public final boolean b;

    public p8(b8 b8Var, boolean z) {
        this.a = b8Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        return this.a.equals(p8Var.a) && this.b == p8Var.b;
    }

    @Override // defpackage.p60
    public final q60 g(r60 r60Var, List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        sq sqVar = sq.d;
        if (zIsEmpty) {
            return r60Var.av(dh.j(j), dh.i(j), sqVar, q0.r);
        }
        long jA = this.b ? j : dh.a(j, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            k60 k60Var = (k60) list.get(0);
            k60Var.j();
            lf0 lf0VarE = k60Var.e(jA);
            int iMax = Math.max(dh.j(j), lf0VarE.d);
            int iMax2 = Math.max(dh.i(j), lf0VarE.e);
            return r60Var.av(iMax, iMax2, sqVar, new n8(lf0VarE, k60Var, r60Var, iMax, iMax2, this));
        }
        lf0[] lf0VarArr = new lf0[list.size()];
        vi0 vi0Var = new vi0();
        vi0Var.d = dh.j(j);
        vi0 vi0Var2 = new vi0();
        vi0Var2.d = dh.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            k60 k60Var2 = (k60) list.get(i);
            k60Var2.j();
            lf0 lf0VarE2 = k60Var2.e(jA);
            lf0VarArr[i] = lf0VarE2;
            vi0Var.d = Math.max(vi0Var.d, lf0VarE2.d);
            vi0Var2.d = Math.max(vi0Var2.d, lf0VarE2.e);
        }
        return r60Var.av(vi0Var.d, vi0Var2.d, sqVar, new o8(lf0VarArr, list, r60Var, vi0Var, vi0Var2, this));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}

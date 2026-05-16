package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class el0 implements p60, bl0 {
    public final s6 a;
    public final a8 b;

    public el0(s6 s6Var, a8 a8Var) {
        this.a = s6Var;
        this.b = a8Var;
    }

    @Override // defpackage.bl0
    public final q60 a(lf0[] lf0VarArr, r60 r60Var, int[] iArr, int i, int i2) {
        return r60Var.av(i, i2, sq.d, new ux(lf0VarArr, this, i2, iArr));
    }

    @Override // defpackage.p60
    public final int b(a00 a00Var, List list, int i) {
        int iAi = a00Var.ai(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iAi, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            k60 k60Var = (k60) list.get(i2);
            float fAd = t1.ad(t1.ac(k60Var));
            if (fAd == 0.0f) {
                int iMin2 = Math.min(k60Var.aw(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, k60Var.f(iMin2));
            } else if (fAd > 0.0f) {
                f += fAd;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            k60 k60Var2 = (k60) list.get(i3);
            float fAd2 = t1.ad(t1.ac(k60Var2));
            if (fAd2 > 0.0f) {
                iMax = Math.max(iMax, k60Var2.f(iRound != Integer.MAX_VALUE ? Math.round(iRound * fAd2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.bl0
    public final void c(int i, r60 r60Var, int[] iArr, int[] iArr2) {
        this.a.c(r60Var, i, iArr, r60Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.p60
    public final int d(a00 a00Var, List list, int i) {
        int iAi = a00Var.ai(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            k60 k60Var = (k60) list.get(i3);
            float fAd = t1.ad(t1.ac(k60Var));
            int iAw = k60Var.aw(i);
            if (fAd == 0.0f) {
                i2 += iAw;
            } else if (fAd > 0.0f) {
                f += fAd;
                iMax = Math.max(iMax, Math.round(iAw / fAd));
            }
        }
        return ((list.size() - 1) * iAi) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.bl0
    public final long e(int i, int i2, int i3, boolean z) {
        return !z ? eh.a(i, i2, 0, i3) : t1.q(i, i2, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el0)) {
            return false;
        }
        el0 el0Var = (el0) obj;
        return f00.h(this.a, el0Var.a) && f00.h(this.b, el0Var.b);
    }

    @Override // defpackage.bl0
    public final int f(lf0 lf0Var) {
        return lf0Var.e;
    }

    @Override // defpackage.p60
    public final q60 g(r60 r60Var, List list, long j) {
        return pk.al(this, dh.j(j), dh.i(j), dh.h(j), dh.g(j), r60Var.ai(this.a.a()), r60Var, list, new lf0[list.size()], list.size());
    }

    @Override // defpackage.p60
    public final int h(a00 a00Var, List list, int i) {
        int iAi = a00Var.ai(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iAi, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            k60 k60Var = (k60) list.get(i2);
            float fAd = t1.ad(t1.ac(k60Var));
            if (fAd == 0.0f) {
                int iMin2 = Math.min(k60Var.aw(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, k60Var.ax(iMin2));
            } else if (fAd > 0.0f) {
                f += fAd;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            k60 k60Var2 = (k60) list.get(i3);
            float fAd2 = t1.ad(t1.ac(k60Var2));
            if (fAd2 > 0.0f) {
                iMax = Math.max(iMax, k60Var2.ax(iRound != Integer.MAX_VALUE ? Math.round(iRound * fAd2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.bl0
    public final int i(lf0 lf0Var) {
        return lf0Var.d;
    }

    @Override // defpackage.p60
    public final int j(a00 a00Var, List list, int i) {
        int iAi = a00Var.ai(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            k60 k60Var = (k60) list.get(i3);
            float fAd = t1.ad(t1.ac(k60Var));
            int iAp = k60Var.ap(i);
            if (fAd == 0.0f) {
                i2 += iAp;
            } else if (fAd > 0.0f) {
                f += fAd;
                iMax = Math.max(iMax, Math.round(iAp / fAd));
            }
        }
        return ((list.size() - 1) * iAi) + Math.round(iMax * f) + i2;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}

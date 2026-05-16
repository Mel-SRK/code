package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kd implements p60, bl0 {
    public final v6 a;
    public final z7 b;

    public kd(v6 v6Var, z7 z7Var) {
        this.a = v6Var;
        this.b = z7Var;
    }

    @Override // defpackage.bl0
    public final q60 a(lf0[] lf0VarArr, r60 r60Var, int[] iArr, int i, int i2) {
        return r60Var.av(i2, i, sq.d, new jd(lf0VarArr, this, i2, r60Var, iArr));
    }

    @Override // defpackage.p60
    public final int b(a00 a00Var, List list, int i) {
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
            int iF = k60Var.f(i);
            if (fAd == 0.0f) {
                i2 += iF;
            } else if (fAd > 0.0f) {
                f += fAd;
                iMax = Math.max(iMax, Math.round(iF / fAd));
            }
        }
        return ((list.size() - 1) * iAi) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.bl0
    public final void c(int i, r60 r60Var, int[] iArr, int[] iArr2) {
        this.a.b(i, r60Var, iArr, iArr2);
    }

    @Override // defpackage.p60
    public final int d(a00 a00Var, List list, int i) {
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
                int iMin2 = Math.min(k60Var.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, k60Var.aw(iMin2));
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
                iMax = Math.max(iMax, k60Var2.aw(iRound != Integer.MAX_VALUE ? Math.round(iRound * fAd2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.bl0
    public final long e(int i, int i2, int i3, boolean z) {
        return !z ? eh.a(0, i3, i, i2) : t1.p(0, i3, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd)) {
            return false;
        }
        kd kdVar = (kd) obj;
        return f00.h(this.a, kdVar.a) && this.b.equals(kdVar.b);
    }

    @Override // defpackage.bl0
    public final int f(lf0 lf0Var) {
        return lf0Var.d;
    }

    @Override // defpackage.p60
    public final q60 g(r60 r60Var, List list, long j) {
        return pk.al(this, dh.i(j), dh.j(j), dh.g(j), dh.h(j), r60Var.ai(this.a.a()), r60Var, list, new lf0[list.size()], list.size());
    }

    @Override // defpackage.p60
    public final int h(a00 a00Var, List list, int i) {
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
            int iAx = k60Var.ax(i);
            if (fAd == 0.0f) {
                i2 += iAx;
            } else if (fAd > 0.0f) {
                f += fAd;
                iMax = Math.max(iMax, Math.round(iAx / fAd));
            }
        }
        return ((list.size() - 1) * iAi) + Math.round(iMax * f) + i2;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.bl0
    public final int i(lf0 lf0Var) {
        return lf0Var.e;
    }

    @Override // defpackage.p60
    public final int j(a00 a00Var, List list, int i) {
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
                int iMin2 = Math.min(k60Var.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, k60Var.ap(iMin2));
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
                iMax = Math.max(iMax, k60Var2.ap(iRound != Integer.MAX_VALUE ? Math.round(iRound * fAd2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tv0 {
    public final b6 a;
    public final long b;
    public final zw0 c;
    public final ab0 d;
    public final gx0 e;
    public long f;
    public final b6 g;
    public final lw0 h;
    public final ax0 i;

    public tv0(lw0 lw0Var, ab0 ab0Var, ax0 ax0Var, gx0 gx0Var) {
        b6 b6Var = lw0Var.a;
        long j = lw0Var.b;
        zw0 zw0Var = ax0Var != null ? ax0Var.a : null;
        this.a = b6Var;
        this.b = j;
        this.c = zw0Var;
        this.d = ab0Var;
        this.e = gx0Var;
        this.f = j;
        this.g = b6Var;
        this.h = lw0Var;
        this.i = ax0Var;
    }

    public final List a(cv cvVar) {
        if (!hx0.b(this.f)) {
            return f00.z(new pd("", 0), new wp0(hx0.e(this.f), hx0.e(this.f)));
        }
        op opVar = (op) cvVar.g(this);
        if (opVar != null) {
            return f00.y(opVar);
        }
        return null;
    }

    public final Integer b() {
        zw0 zw0Var = this.c;
        if (zw0Var == null) {
            return null;
        }
        int iD = hx0.d(this.f);
        ab0 ab0Var = this.d;
        return Integer.valueOf(ab0Var.b(zw0Var.d(zw0Var.e(ab0Var.d(iD)), true)));
    }

    public final Integer c() {
        int length;
        zw0 zw0Var = this.c;
        if (zw0Var == null) {
            return null;
        }
        int iP = p();
        while (true) {
            b6 b6Var = this.a;
            if (iP < b6Var.e.length()) {
                int length2 = this.g.e.length() - 1;
                if (iP <= length2) {
                    length2 = iP;
                }
                long jK = zw0Var.k(length2);
                int i = hx0.c;
                int i2 = (int) (jK & 4294967295L);
                if (i2 > iP) {
                    length = this.d.b(i2);
                    break;
                }
                iP++;
            } else {
                length = b6Var.e.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int iB;
        zw0 zw0Var = this.c;
        if (zw0Var == null) {
            return null;
        }
        int iP = p();
        while (true) {
            if (iP <= 0) {
                iB = 0;
                break;
            }
            int length = this.g.e.length() - 1;
            if (iP <= length) {
                length = iP;
            }
            long jK = zw0Var.k(length);
            int i = hx0.c;
            int i2 = (int) (jK >> 32);
            if (i2 < iP) {
                iB = this.d.b(i2);
                break;
            }
            iP--;
        }
        return Integer.valueOf(iB);
    }

    public final boolean e() {
        zw0 zw0Var = this.c;
        return (zw0Var != null ? zw0Var.i(p()) : null) != oj0.e;
    }

    public final int f(zw0 zw0Var, int i) {
        int iP = p();
        gx0 gx0Var = this.e;
        if (gx0Var.a == null) {
            gx0Var.a = Float.valueOf(zw0Var.c(iP).a);
        }
        int iE = zw0Var.e(iP);
        y70 y70Var = zw0Var.b;
        int i2 = iE + i;
        if (i2 < 0) {
            return 0;
        }
        if (i2 >= y70Var.f) {
            return this.g.e.length();
        }
        float fB = y70Var.b(i2) - 1;
        Float f = gx0Var.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((e() && fFloatValue >= zw0Var.g(i2)) || (!e() && fFloatValue <= zw0Var.f(i2))) {
            return zw0Var.d(i2, true);
        }
        return this.d.b(y70Var.e(d41.h(f.floatValue(), fB)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(ax0 ax0Var, int i) {
        ri0 ri0VarAk;
        d20 d20Var = ax0Var.b;
        zw0 zw0Var = ax0Var.a;
        if (d20Var == null) {
            ri0VarAk = ri0.e;
        } else {
            d20 d20Var2 = ax0Var.c;
            ri0VarAk = d20Var2 != null ? d20Var2.ak(d20Var, true) : null;
            if (ri0VarAk == null) {
            }
        }
        long j = this.h.b;
        int i2 = hx0.c;
        int i3 = (int) (j & 4294967295L);
        ab0 ab0Var = this.d;
        ri0 ri0VarC = zw0Var.c(ab0Var.d(i3));
        return ab0Var.b(zw0Var.b.e(d41.h(ri0VarC.a, (pq0.b(ri0VarAk.b()) * i) + ri0VarC.b)));
    }

    public final void h() {
        gx0 gx0Var = this.e;
        gx0Var.a = null;
        b6 b6Var = this.g;
        if (b6Var.e.length() > 0) {
            if (e()) {
                gx0Var.a = null;
                if (b6Var.e.length() > 0) {
                    String str = b6Var.e;
                    long j = this.f;
                    int i = hx0.c;
                    int iG = go0.g(str, (int) (j & 4294967295L));
                    if (iG != -1) {
                        o(iG, iG);
                        return;
                    }
                    return;
                }
                return;
            }
            gx0Var.a = null;
            if (b6Var.e.length() > 0) {
                String str2 = b6Var.e;
                long j2 = this.f;
                int i2 = hx0.c;
                int iF = go0.f(str2, (int) (j2 & 4294967295L));
                if (iF != -1) {
                    o(iF, iF);
                }
            }
        }
    }

    public final void i() {
        this.e.a = null;
        b6 b6Var = this.g;
        String str = b6Var.e;
        String str2 = b6Var.e;
        if (str.length() > 0) {
            int iG = bo0.g(str2, hx0.d(this.f));
            if (iG == hx0.d(this.f) && iG != str2.length()) {
                iG = bo0.g(str2, iG + 1);
            }
            o(iG, iG);
        }
    }

    public final void j() {
        this.e.a = null;
        b6 b6Var = this.g;
        String str = b6Var.e;
        String str2 = b6Var.e;
        if (str.length() > 0) {
            int iH = bo0.h(str2, hx0.e(this.f));
            if (iH == hx0.e(this.f) && iH != 0) {
                iH = bo0.h(str2, iH - 1);
            }
            o(iH, iH);
        }
    }

    public final void k() {
        gx0 gx0Var = this.e;
        gx0Var.a = null;
        b6 b6Var = this.g;
        if (b6Var.e.length() > 0) {
            if (e()) {
                gx0Var.a = null;
                if (b6Var.e.length() > 0) {
                    String str = b6Var.e;
                    long j = this.f;
                    int i = hx0.c;
                    int iF = go0.f(str, (int) (j & 4294967295L));
                    if (iF != -1) {
                        o(iF, iF);
                        return;
                    }
                    return;
                }
                return;
            }
            gx0Var.a = null;
            if (b6Var.e.length() > 0) {
                String str2 = b6Var.e;
                long j2 = this.f;
                int i2 = hx0.c;
                int iG = go0.g(str2, (int) (j2 & 4294967295L));
                if (iG != -1) {
                    o(iG, iG);
                }
            }
        }
    }

    public final void l() {
        Integer numB;
        this.e.a = null;
        if (this.g.e.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        o(iIntValue, iIntValue);
    }

    public final void m() {
        Integer numValueOf = null;
        this.e.a = null;
        if (this.g.e.length() > 0) {
            zw0 zw0Var = this.c;
            if (zw0Var != null) {
                int iE = hx0.e(this.f);
                ab0 ab0Var = this.d;
                numValueOf = Integer.valueOf(ab0Var.b(zw0Var.h(zw0Var.e(ab0Var.d(iE)))));
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                o(iIntValue, iIntValue);
            }
        }
    }

    public final void n() {
        if (this.g.e.length() > 0) {
            int i = hx0.c;
            this.f = wo0.b((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void o(int i, int i2) {
        this.f = wo0.b(i, i2);
    }

    public final int p() {
        long j = this.f;
        int i = hx0.c;
        return this.d.d((int) (j & 4294967295L));
    }
}

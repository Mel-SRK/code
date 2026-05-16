package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bo0 implements h11 {
    public static final yn0 a(nq0 nq0Var, bw bwVar) {
        int iA = nq0Var.a();
        tv tvVar = nq0Var.c;
        boolean z = iA == 1;
        return new yn0(c(tvVar, z, true, bwVar), c(tvVar, z, false, bwVar), z);
    }

    public static final xn0 b(nq0 nq0Var, tv tvVar, xn0 xn0Var) {
        int i = tvVar.c;
        int i2 = tvVar.b;
        boolean z = nq0Var.a;
        int i3 = z ? i2 : i;
        zw0 zw0Var = (zw0) tvVar.e;
        int i4 = tvVar.d;
        x20 x20VarAc = e00.ac(new ao0(tvVar, i3));
        x20 x20VarAc2 = e00.ac(new zn0(tvVar, i3, z ? i : i2, nq0Var, x20VarAc));
        if (1 != xn0Var.c) {
            return (xn0) ((c01) x20VarAc2).getValue();
        }
        if (i3 == i4) {
            return xn0Var;
        }
        if (((Number) ((c01) x20VarAc).getValue()).intValue() != zw0Var.e(i4)) {
            return (xn0) ((c01) x20VarAc2).getValue();
        }
        int i5 = xn0Var.b;
        long jK = zw0Var.k(i5);
        if (i4 != -1) {
            if (i3 != i4) {
                if (!((i2 >= i && i2 > i) ^ z)) {
                }
            }
            return tvVar.a(i3);
        }
        int i6 = hx0.c;
        return (i5 == ((int) (jK >> 32)) || i5 == ((int) (4294967295L & jK))) ? (xn0) ((c01) x20VarAc2).getValue() : tvVar.a(i3);
    }

    public static final xn0 c(tv tvVar, boolean z, boolean z2, bw bwVar) {
        long jB;
        long j;
        int i = z2 ? tvVar.b : tvVar.c;
        switch (bwVar.d) {
            case 22:
                String str = ((zw0) tvVar.e).a.a.e;
                jB = wo0.b(h(str, i), g(str, i));
                break;
            default:
                jB = ((zw0) tvVar.e).k(i);
                break;
        }
        if (z ^ z2) {
            int i2 = hx0.c;
            j = jB >> 32;
        } else {
            int i3 = hx0.c;
            j = 4294967295L & jB;
        }
        return tvVar.a((int) j);
    }

    public static final xn0 d(xn0 xn0Var, tv tvVar, int i) {
        return new xn0(((zw0) tvVar.e).a(i), i, xn0Var.c);
    }

    public static final a90 e() {
        o6 o6Var = lr0.b;
        a90 a90Var = (a90) o6Var.n();
        if (a90Var != null) {
            return a90Var;
        }
        a90 a90Var2 = new a90(new tf[0]);
        o6Var.x(a90Var2);
        return a90Var2;
    }

    public static final km f(pu puVar) {
        o6 o6Var = lr0.a;
        return new km(puVar, null);
    }

    public static final int g(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int h(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final long i(double d) {
        return o(4294967296L, (float) d);
    }

    public static final long j(int i) {
        return o(4294967296L, i);
    }

    public static boolean k(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static op0 l(gv gvVar) {
        op0 op0Var = new op0();
        op0Var.f = f00.p(op0Var, op0Var, gvVar);
        return op0Var;
    }

    public static me0 m(Object obj) {
        return new me0(obj, bw.au);
    }

    public static void n(lw0 lw0Var, dv0 dv0Var, zw0 zw0Var, d20 d20Var, uw0 uw0Var, boolean z, ab0 ab0Var) {
        if (z) {
            int iD = ab0Var.d(hx0.d(lw0Var.b));
            ri0 ri0VarB = iD < zw0Var.a.a.e.length() ? zw0Var.b(iD) : iD != 0 ? zw0Var.b(iD - 1) : new ri0(0.0f, 0.0f, 1.0f, (int) (kv0.a(dv0Var.b, dv0Var.g, dv0Var.h, kv0.a, 1) & 4294967295L));
            float f = ri0VarB.b;
            float f2 = ri0VarB.a;
            long jAm = d20Var.am(d41.h(f2, f));
            ri0 ri0VarH = e00.h(d41.h(xa0.d(jAm), xa0.e(jAm)), lI.a(ri0VarB.c - f2, ri0VarB.d - f));
            if (f00.h((uw0) uw0Var.a.b.get(), uw0Var)) {
                uw0Var.b.h(ri0VarH);
            }
        }
    }

    public static final long o(long j, float f) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        rx0[] rx0VarArr = qx0.b;
        return jFloatToRawIntBits;
    }

    public static final w80 p(Object obj, vf vfVar) {
        Object objAk = vfVar.ak();
        if (objAk == nf.a) {
            objAk = m(obj);
            vfVar.be(objAk);
        }
        w80 w80Var = (w80) objAk;
        w80Var.setValue(obj);
        return w80Var;
    }

    public static final Object q(pm0 pm0Var, pm0 pm0Var2, gv gvVar) throws Throwable {
        Object wdVar;
        Object objAt;
        try {
            az0.p(2, gvVar);
            wdVar = gvVar.f(pm0Var2, pm0Var);
        } catch (Throwable th) {
            wdVar = new wd(th, false);
        }
        yj yjVar = yj.d;
        if (wdVar == yjVar || (objAt = pm0Var.at(wdVar)) == az0.e) {
            return yjVar;
        }
        if (objAt instanceof wd) {
            throw ((wd) objAt).a;
        }
        return az0.ap(objAt);
    }
}

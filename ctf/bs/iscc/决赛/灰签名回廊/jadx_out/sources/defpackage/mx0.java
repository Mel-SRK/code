package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mx0 extends i70 implements l20, wo, so0 {
    public lx0 aa;
    public kx0 ab;
    public String r;
    public nx0 s;
    public qt t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public Map y;
    public fe0 z;

    @Override // defpackage.so0
    public final void ag(po0 po0Var) {
        lx0 lx0Var = this.aa;
        if (lx0Var == null) {
            lx0Var = new lx0(this, 0);
            this.aa = lx0Var;
        }
        b6 b6Var = new b6(this.r, null, 6);
        i10[] i10VarArr = bp0.a;
        po0Var.d(zo0.z, f00.y(b6Var));
        kx0 kx0Var = this.ab;
        if (kx0Var != null) {
            boolean z = kx0Var.c;
            cp0 cp0Var = zo0.ab;
            i10[] i10VarArr2 = bp0.a;
            i10 i10Var = i10VarArr2[16];
            po0Var.d(cp0Var, Boolean.valueOf(z));
            b6 b6Var2 = new b6(kx0Var.b, null, 6);
            cp0 cp0Var2 = zo0.aa;
            i10 i10Var2 = i10VarArr2[15];
            po0Var.d(cp0Var2, b6Var2);
        }
        po0Var.d(oo0.j, new ah(null, new lx0(this, 1)));
        po0Var.d(oo0.k, new ah(null, new lx0(this, 2)));
        po0Var.d(oo0.l, new ah(null, new b(20, this)));
        bp0.a(po0Var, lx0Var);
    }

    @Override // defpackage.l20
    public final int aj(j50 j50Var, k60 k60Var, int i) {
        return wo0.d(bv(j50Var).e(j50Var.getLayoutDirection()).a());
    }

    public final fe0 bu() {
        if (this.z == null) {
            this.z = new fe0(this.r, this.s, this.t, this.u, this.v, this.w, this.x);
        }
        fe0 fe0Var = this.z;
        fe0Var.getClass();
        return fe0Var;
    }

    public final fe0 bv(em emVar) {
        fe0 fe0Var;
        kx0 kx0Var = this.ab;
        if (kx0Var != null && kx0Var.c && (fe0Var = kx0Var.d) != null) {
            fe0Var.d(emVar);
            return fe0Var;
        }
        fe0 fe0VarBu = bu();
        fe0VarBu.d(emVar);
        return fe0VarBu;
    }

    @Override // defpackage.wo
    public final void d(u20 u20Var) {
        if (this.q) {
            fe0 fe0VarBv = bv(u20Var);
            o3 o3Var = fe0VarBv.j;
            if (o3Var == null) {
                StringBuilder sb = new StringBuilder("no paragraph (layoutCache=");
                sb.append(this.z);
                kx0 kx0Var = this.ab;
                sb.append(", textSubstitution=");
                sb.append(kx0Var);
                sb.append(')');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            oa oaVarO = u20Var.d.e.o();
            boolean z = fe0VarBv.k;
            if (z) {
                long j = fe0VarBv.l;
                oaVarO.l();
                oaVarO.e(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                yr0 yr0Var = this.s.a;
                bv0 bv0Var = yr0Var.m;
                if (bv0Var == null) {
                    bv0Var = bv0.b;
                }
                bv0 bv0Var2 = bv0Var;
                yp0 yp0Var = yr0Var.n;
                if (yp0Var == null) {
                    yp0Var = yp0.d;
                }
                yp0 yp0Var2 = yp0Var;
                yo yoVar = yr0Var.p;
                if (yoVar == null) {
                    yoVar = ir.a;
                }
                yo yoVar2 = yoVar;
                i9 i9VarC = yr0Var.a.c();
                if (i9VarC != null) {
                    o3Var.g(oaVarO, i9VarC, this.s.a.a.a(), yp0Var2, bv0Var2, yoVar2);
                } else {
                    long jB = qc.g;
                    if (jB == 16) {
                        jB = this.s.b() != 16 ? this.s.b() : qc.b;
                    }
                    o3Var.f(oaVarO, jB, yp0Var2, bv0Var2, yoVar2);
                }
                if (z) {
                    oaVarO.i();
                }
            } catch (Throwable th) {
                if (z) {
                    oaVarO.i();
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        long jA;
        boolean z;
        ee0 ee0Var;
        int i;
        fe0 fe0VarBv = bv(r60Var);
        e20 layoutDirection = r60Var.getLayoutDirection();
        if (fe0VarBv.g > 1) {
            c70 c70Var = fe0VarBv.m;
            nx0 nx0Var = fe0VarBv.b;
            em emVar = fe0VarBv.i;
            emVar.getClass();
            c70 c70VarW = d41.w(c70Var, layoutDirection, nx0Var, emVar, fe0VarBv.c);
            fe0VarBv.m = c70VarW;
            int i2 = fe0VarBv.g;
            float f = c70VarW.g;
            float f2 = c70VarW.f;
            if (Float.isNaN(f) || Float.isNaN(f2)) {
                float fB = az0.e(d70.a, c70VarW.e, eh.b(0, 0, 15), c70VarW.c, c70VarW.d, 1, 96).b();
                float fB2 = az0.e(d70.b, c70VarW.e, eh.b(0, 0, 15), c70VarW.c, c70VarW.d, 2, 96).b() - fB;
                c70VarW.g = fB;
                c70VarW.f = fB2;
                f2 = fB2;
                f = fB;
            }
            if (i2 != 1) {
                int iRound = Math.round((f2 * (i2 - 1)) + f);
                i = iRound >= 0 ? iRound : 0;
                int iG = dh.g(j);
                if (i > iG) {
                    i = iG;
                }
            } else {
                i = dh.i(j);
            }
            jA = eh.a(dh.j(j), dh.h(j), i, dh.g(j));
        } else {
            jA = j;
        }
        o3 o3Var = fe0VarBv.j;
        if (o3Var == null || (ee0Var = fe0VarBv.n) == null || ee0Var.b() || layoutDirection != fe0VarBv.o || (!dh.b(jA, fe0VarBv.p) && (dh.h(jA) != dh.h(fe0VarBv.p) || dh.g(jA) < o3Var.b() || o3Var.d.d))) {
            o3 o3VarB = fe0VarBv.b(jA, layoutDirection);
            fe0VarBv.p = jA;
            long jD = eh.d(jA, e00.f(wo0.d(o3VarB.d()), wo0.d(o3VarB.b())));
            fe0VarBv.l = jD;
            fe0VarBv.k = fe0VarBv.d != 3 && (((float) ((int) (jD >> 32))) < o3VarB.d() || ((float) ((int) (jD & 4294967295L))) < o3VarB.b());
            fe0VarBv.j = o3VarB;
            z = true;
        } else {
            if (!dh.b(jA, fe0VarBv.p)) {
                o3 o3Var2 = fe0VarBv.j;
                o3Var2.getClass();
                long jD2 = eh.d(jA, e00.f(wo0.d(Math.min(o3Var2.a.i.c(), o3Var2.d())), wo0.d(o3Var2.b())));
                fe0VarBv.l = jD2;
                fe0VarBv.k = fe0VarBv.d != 3 && (((float) ((int) (jD2 >> 32))) < o3Var2.d() || ((float) ((int) (jD2 & 4294967295L))) < o3Var2.b());
                fe0VarBv.p = jA;
            }
            z = false;
        }
        ee0 ee0Var2 = fe0VarBv.n;
        if (ee0Var2 != null) {
            ee0Var2.b();
        }
        o3 o3Var3 = fe0VarBv.j;
        o3Var3.getClass();
        xw0 xw0Var = o3Var3.d;
        long j2 = fe0VarBv.l;
        if (z) {
            pk.aw(this, 2).K();
            Map linkedHashMap = this.y;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            linkedHashMap.put(O1.a, Integer.valueOf(Math.round(xw0Var.d(0))));
            linkedHashMap.put(O1.b, Integer.valueOf(Math.round(xw0Var.d(xw0Var.g - 1))));
            this.y = linkedHashMap;
        }
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (j2 & 4294967295L);
        lf0 lf0VarE = k60Var.e(t1.q(i3, i3, i4, i4));
        Map map = this.y;
        map.getClass();
        return r60Var.av(i3, i4, map, new d4(lf0VarE, 7));
    }

    @Override // defpackage.l20
    public final int f(j50 j50Var, k60 k60Var, int i) {
        return wo0.d(bv(j50Var).e(j50Var.getLayoutDirection()).c());
    }

    @Override // defpackage.l20
    public final int n(j50 j50Var, k60 k60Var, int i) {
        return bv(j50Var).a(i, j50Var.getLayoutDirection());
    }

    @Override // defpackage.l20
    public final int z(j50 j50Var, k60 k60Var, int i) {
        return bv(j50Var).a(i, j50Var.getLayoutDirection());
    }
}

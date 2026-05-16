package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ld0 {
    public static final float a = 4;
    public static final long b;

    static {
        long j = cz0.l;
        rx0[] rx0VarArr = qx0.b;
        long j2 = 1095216660480L & j;
        if (j2 == 0) {
            uy.a("Cannot perform operation for Unspecified type.");
        }
        b = bo0.o(j2, qx0.c(j) / 2);
    }

    public static final void a(String str, cv cvVar, j70 j70Var, boolean z, nx0 nx0Var, gv gvVar, g11 g11Var, t10 t10Var, s10 s10Var, boolean z2, int i, int i2, aq0 aq0Var, gv0 gv0Var, vf vfVar, int i3) {
        nx0 nx0Var2;
        int i4;
        int i5;
        s10 s10Var2;
        aq0 aq0Var2;
        gv0 gv0Var2;
        boolean z3;
        int i6;
        gv0 gv0Var3;
        boolean z4;
        g11 g11Var2;
        nx0 nx0Var3;
        s10 s10Var3;
        int i7;
        int i8;
        aq0 aq0Var3;
        vfVar.aw(-1922450045);
        if (((i3 | (vfVar.f(str) ? 4 : 2) | 918645760) & 306783379) == 306783378 && vfVar.z()) {
            vfVar.aq();
            z4 = z;
            nx0Var3 = nx0Var;
            g11Var2 = g11Var;
            s10Var3 = s10Var;
            i7 = i;
            i8 = i2;
            aq0Var3 = aq0Var;
            gv0Var3 = gv0Var;
        } else {
            vfVar.as();
            if ((i3 & 1) == 0 || vfVar.x()) {
                nx0Var2 = (nx0) vfVar.j(ww0.a);
                g11 g11Var3 = bw.ay;
                int i9 = z2 ? 1 : Integer.MAX_VALUE;
                ed0 ed0Var = ed0.a;
                aq0 aq0VarA = eq0.a(3, vfVar);
                zc zcVar = (zc) vfVar.j(cd.a);
                gv0 gv0Var4 = zcVar.am;
                vfVar.av(1540400102);
                if (gv0Var4 == null) {
                    long jD = cd.d(zcVar, 18);
                    long jD2 = cd.d(zcVar, 18);
                    i4 = i9;
                    long jB = qc.b(cd.d(zcVar, 18), 0.38f);
                    long jD3 = cd.d(zcVar, 18);
                    long j = qc.f;
                    g11Var = g11Var3;
                    gv0 gv0Var5 = new gv0(jD, jD2, jB, jD3, j, j, j, j, cd.d(zcVar, 26), cd.d(zcVar, 2), (ix0) vfVar.j(jx0.a), cd.d(zcVar, 26), cd.d(zcVar, 24), qc.b(cd.d(zcVar, 18), 0.12f), cd.d(zcVar, 2), cd.d(zcVar, 19), cd.d(zcVar, 19), qc.b(cd.d(zcVar, 18), 0.38f), cd.d(zcVar, 19), cd.d(zcVar, 19), cd.d(zcVar, 19), qc.b(cd.d(zcVar, 18), 0.38f), cd.d(zcVar, 2), cd.d(zcVar, 26), cd.d(zcVar, 19), qc.b(cd.d(zcVar, 18), 0.38f), cd.d(zcVar, 2), cd.d(zcVar, 19), cd.d(zcVar, 19), qc.b(cd.d(zcVar, 18), 0.38f), cd.d(zcVar, 19), cd.d(zcVar, 19), cd.d(zcVar, 19), qc.b(cd.d(zcVar, 18), 0.38f), cd.d(zcVar, 2), cd.d(zcVar, 19), cd.d(zcVar, 19), qc.b(cd.d(zcVar, 19), 0.38f), cd.d(zcVar, 19), cd.d(zcVar, 19), cd.d(zcVar, 19), qc.b(cd.d(zcVar, 19), 0.38f), cd.d(zcVar, 19));
                    zcVar.am = gv0Var5;
                    gv0Var4 = gv0Var5;
                } else {
                    g11Var = g11Var3;
                    i4 = i9;
                }
                vfVar.q(false);
                i5 = i4;
                s10Var2 = s10.a;
                aq0Var2 = aq0VarA;
                gv0Var2 = gv0Var4;
                z3 = true;
                i6 = 1;
            } else {
                vfVar.aq();
                z3 = z;
                nx0Var2 = nx0Var;
                s10Var2 = s10Var;
                i5 = i;
                i6 = i2;
                aq0Var2 = aq0Var;
                gv0Var2 = gv0Var;
            }
            g11 g11Var4 = g11Var;
            vfVar.r();
            vfVar.av(30062948);
            Object objAk = vfVar.ak();
            if (objAk == nf.a) {
                objAk = new g80();
                vfVar.be(objAk);
            }
            g80 g80Var = (g80) objAk;
            boolean z5 = false;
            vfVar.q(false);
            vfVar.av(30069058);
            long jB2 = nx0Var2.b();
            if (jB2 == 16) {
                jB2 = !z3 ? gv0Var2.c : ((Boolean) i60.v(g80Var, vfVar, 0).getValue()).booleanValue() ? gv0Var2.a : gv0Var2.b;
                z5 = false;
            }
            long j2 = jB2;
            vfVar.q(z5);
            az0.a(jx0.a.a(gv0Var2.k), t1.aq(-1886965181, new hd0(j70Var, gvVar, (em) vfVar.j(og.h), gv0Var2, str, cvVar, z3, nx0Var2.d(new nx0(j2, 0L, null, 0L, 0, 0L, 16777214)), t10Var, s10Var2, z2, i5, i6, g11Var4, g80Var, aq0Var2), vfVar), vfVar, 56);
            gv0Var3 = gv0Var2;
            z4 = z3;
            g11Var2 = g11Var4;
            nx0Var3 = nx0Var2;
            s10Var3 = s10Var2;
            i7 = i5;
            i8 = i6;
            aq0Var3 = aq0Var2;
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new id0(str, cvVar, j70Var, z4, nx0Var3, gvVar, g11Var2, t10Var, s10Var3, z2, i7, i8, aq0Var3, gv0Var3, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    public static final void b(gv gvVar, hv hvVar, gv gvVar2, gv gvVar3, gv gvVar4, gv gvVar5, gv gvVar6, boolean z, float f, cv cvVar, te teVar, gv gvVar7, wd0 wd0Var, vf vfVar, int i, int i2) {
        int i3;
        int i4;
        wd0 wd0Var2;
        b8 b8Var;
        gv gvVar8;
        int i5;
        float f2;
        b8 b8Var2;
        gv gvVar9;
        gv gvVar10;
        gv gvVar11;
        float f3;
        gv gvVar12;
        boolean z2;
        b8 b8Var3 = bw.i;
        b8 b8Var4 = bw.e;
        vfVar.aw(1408290209);
        int i6 = i & 6;
        g70 g70Var = g70.a;
        if (i6 == 0) {
            i3 = i | (vfVar.f(g70Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= vfVar.h(gvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= vfVar.h(hvVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= vfVar.h(gvVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= vfVar.h(gvVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= vfVar.h(gvVar4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= vfVar.h(gvVar5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= vfVar.h(gvVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= vfVar.g(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= vfVar.c(f) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (vfVar.h(cvVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= vfVar.h(teVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= vfVar.h(gvVar7) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            wd0Var2 = wd0Var;
            i4 |= vfVar.f(wd0Var2) ? 2048 : 1024;
        } else {
            wd0Var2 = wd0Var;
        }
        int i7 = i4;
        if ((i3 & 306783379) == 306783378 && (i7 & 1171) == 1170 && vfVar.z()) {
            vfVar.aq();
            gvVar11 = gvVar2;
            gvVar12 = gvVar7;
            gvVar10 = gvVar;
            f3 = f;
        } else {
            boolean z3 = ((i7 & 14) == 4) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | ((i7 & 7168) == 2048);
            Object objAk = vfVar.ak();
            if (z3 || objAk == nf.a) {
                objAk = new nd0(cvVar, z, f, wd0Var2);
                vfVar.be(objAk);
            }
            nd0 nd0Var = (nd0) objAk;
            e20 e20Var = (e20) vfVar.j(og.n);
            int iHashCode = Long.hashCode(vfVar.ar);
            a aVarL = vfVar.l();
            j70 j70VarAn = m10.an(vfVar, g70Var);
            kf.b.getClass();
            ng ngVar = jf.b;
            vfVar.ax();
            if (vfVar.aq) {
                vfVar.k(ngVar);
            } else {
                vfVar.bh();
            }
            w6 w6Var = jf.e;
            jo0.h(vfVar, w6Var, nd0Var);
            w6 w6Var2 = jf.d;
            jo0.h(vfVar, w6Var2, aVarL);
            w6 w6Var3 = jf.f;
            if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode))) {
                n5.j(iHashCode, vfVar, iHashCode, w6Var3);
            }
            w6 w6Var4 = jf.c;
            jo0.h(vfVar, w6Var4, j70VarAn);
            teVar.f(vfVar, Integer.valueOf((i7 >> 3) & 14));
            vfVar.av(250370369);
            if (gvVar3 != null) {
                j70 j70VarC = androidx.compose.ui.layout.a.c(g70Var, "Leading").c(qv0.i);
                b8Var = b8Var3;
                p60 p60VarD = m8.d(b8Var, false);
                int iHashCode2 = Long.hashCode(vfVar.ar);
                a aVarL2 = vfVar.l();
                j70 j70VarAn2 = m10.an(vfVar, j70VarC);
                vfVar.ax();
                if (vfVar.aq) {
                    vfVar.k(ngVar);
                } else {
                    vfVar.bh();
                }
                jo0.h(vfVar, w6Var, p60VarD);
                jo0.h(vfVar, w6Var2, aVarL2);
                if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode2))) {
                    n5.j(iHashCode2, vfVar, iHashCode2, w6Var3);
                }
                jo0.h(vfVar, w6Var4, j70VarAn2);
                gvVar3.f(vfVar, Integer.valueOf((i3 >> 12) & 14));
                vfVar.q(true);
            } else {
                b8Var = b8Var3;
            }
            boolean z4 = false;
            vfVar.q(false);
            vfVar.av(250379492);
            if (gvVar4 != null) {
                j70 j70VarC2 = androidx.compose.ui.layout.a.c(g70Var, "Trailing").c(qv0.i);
                p60 p60VarD2 = m8.d(b8Var, false);
                int iHashCode3 = Long.hashCode(vfVar.ar);
                a aVarL3 = vfVar.l();
                j70 j70VarAn3 = m10.an(vfVar, j70VarC2);
                vfVar.ax();
                if (vfVar.aq) {
                    vfVar.k(ngVar);
                } else {
                    vfVar.bh();
                }
                jo0.h(vfVar, w6Var, p60VarD2);
                jo0.h(vfVar, w6Var2, aVarL3);
                if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode3))) {
                    n5.j(iHashCode3, vfVar, iHashCode3, w6Var3);
                }
                jo0.h(vfVar, w6Var4, j70VarAn3);
                gvVar8 = gvVar4;
                gvVar8.f(vfVar, Integer.valueOf((i3 >> 15) & 14));
                vfVar.q(true);
                z4 = false;
            } else {
                gvVar8 = gvVar4;
            }
            vfVar.q(z4);
            e20 e20Var2 = e20.d;
            float fA = e20Var == e20Var2 ? wd0Var2.a(e20Var) : wd0Var2.b(e20Var);
            float fB = e20Var == e20Var2 ? wd0Var2.b(e20Var) : wd0Var2.a(e20Var);
            if (gvVar3 != null) {
                fA -= qv0.c;
                i5 = 0;
                float f4 = 0;
                if (fA < f4) {
                    fA = f4;
                }
            } else {
                i5 = 0;
            }
            if (gvVar8 != null) {
                fB -= qv0.c;
                float f5 = i5;
                if (fB < f5) {
                    fB = f5;
                }
            }
            vfVar.av(250410106);
            if (gvVar5 != null) {
                j70 j70VarE = androidx.compose.foundation.layout.a.e(b.g(b.c(androidx.compose.ui.layout.a.c(g70Var, "Prefix"), qv0.f, Float.NaN)), fA, 0.0f, qv0.e, 10);
                b8Var2 = b8Var4;
                p60 p60VarD3 = m8.d(b8Var2, false);
                f2 = fA;
                int iHashCode4 = Long.hashCode(vfVar.ar);
                a aVarL4 = vfVar.l();
                j70 j70VarAn4 = m10.an(vfVar, j70VarE);
                vfVar.ax();
                if (vfVar.aq) {
                    vfVar.k(ngVar);
                } else {
                    vfVar.bh();
                }
                jo0.h(vfVar, w6Var, p60VarD3);
                jo0.h(vfVar, w6Var2, aVarL4);
                if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode4))) {
                    n5.j(iHashCode4, vfVar, iHashCode4, w6Var3);
                }
                jo0.h(vfVar, w6Var4, j70VarAn4);
                gvVar5.f(vfVar, Integer.valueOf((i3 >> 18) & 14));
                vfVar.q(true);
            } else {
                f2 = fA;
                b8Var2 = b8Var4;
            }
            ?? r4 = 0;
            vfVar.q(false);
            vfVar.av(250422072);
            if (gvVar6 != null) {
                j70 j70VarE2 = androidx.compose.foundation.layout.a.e(b.g(b.c(androidx.compose.ui.layout.a.c(g70Var, "Suffix"), qv0.f, Float.NaN)), qv0.e, 0.0f, fB, 10);
                p60 p60VarD4 = m8.d(b8Var2, false);
                int iHashCode5 = Long.hashCode(vfVar.ar);
                a aVarL5 = vfVar.l();
                j70 j70VarAn5 = m10.an(vfVar, j70VarE2);
                vfVar.ax();
                if (vfVar.aq) {
                    vfVar.k(ngVar);
                } else {
                    vfVar.bh();
                }
                jo0.h(vfVar, w6Var, p60VarD4);
                jo0.h(vfVar, w6Var2, aVarL5);
                if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode5))) {
                    n5.j(iHashCode5, vfVar, iHashCode5, w6Var3);
                }
                jo0.h(vfVar, w6Var4, j70VarAn5);
                gvVar9 = gvVar6;
                gvVar9.f(vfVar, Integer.valueOf((i3 >> 21) & 14));
                vfVar.q(true);
                r4 = 0;
            } else {
                gvVar9 = gvVar6;
            }
            vfVar.q(r4);
            float f6 = qv0.f;
            j70 j70VarG = b.g(b.c(g70Var, f6, Float.NaN));
            float f7 = gvVar5 == null ? f2 : (float) r4;
            if (gvVar9 != null) {
                fB = (float) r4;
            }
            j70 j70VarE3 = androidx.compose.foundation.layout.a.e(j70VarG, f7, 0.0f, fB, 10);
            vfVar.av(250444361);
            if (hvVar != null) {
                hvVar.c(androidx.compose.ui.layout.a.c(g70Var, "Hint").c(j70VarE3), vfVar, Integer.valueOf((i3 >> 3) & 112));
            }
            vfVar.q(false);
            j70 j70VarC3 = androidx.compose.ui.layout.a.c(g70Var, "TextField").c(j70VarE3);
            p60 p60VarD5 = m8.d(b8Var2, true);
            int iHashCode6 = Long.hashCode(vfVar.ar);
            a aVarL6 = vfVar.l();
            j70 j70VarAn6 = m10.an(vfVar, j70VarC3);
            vfVar.ax();
            if (vfVar.aq) {
                vfVar.k(ngVar);
            } else {
                vfVar.bh();
            }
            jo0.h(vfVar, w6Var, p60VarD5);
            jo0.h(vfVar, w6Var2, aVarL6);
            if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode6))) {
                n5.j(iHashCode6, vfVar, iHashCode6, w6Var3);
            }
            jo0.h(vfVar, w6Var4, j70VarAn6);
            gvVar10 = gvVar;
            gvVar10.f(vfVar, Integer.valueOf((i3 >> 3) & 14));
            vfVar.q(true);
            vfVar.av(250455481);
            if (gvVar2 != null) {
                f3 = f;
                j70 j70VarC4 = androidx.compose.ui.layout.a.c(b.g(b.c(g70Var, m10.ai(f6, qv0.g, f3), Float.NaN)), "Label");
                p60 p60VarD6 = m8.d(b8Var2, false);
                int iHashCode7 = Long.hashCode(vfVar.ar);
                a aVarL7 = vfVar.l();
                j70 j70VarAn7 = m10.an(vfVar, j70VarC4);
                vfVar.ax();
                if (vfVar.aq) {
                    vfVar.k(ngVar);
                } else {
                    vfVar.bh();
                }
                jo0.h(vfVar, w6Var, p60VarD6);
                jo0.h(vfVar, w6Var2, aVarL7);
                if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode7))) {
                    n5.j(iHashCode7, vfVar, iHashCode7, w6Var3);
                }
                jo0.h(vfVar, w6Var4, j70VarAn7);
                gvVar11 = gvVar2;
                gvVar11.f(vfVar, Integer.valueOf((i3 >> 9) & 14));
                vfVar.q(true);
            } else {
                gvVar11 = gvVar2;
                f3 = f;
            }
            vfVar.q(false);
            vfVar.av(250473414);
            if (gvVar7 != null) {
                j70 j70VarG2 = b.g(b.c(androidx.compose.ui.layout.a.c(g70Var, "Supporting"), qv0.h, Float.NaN));
                float f8 = qv0.b;
                j70 j70VarB = androidx.compose.foundation.layout.a.b(j70VarG2, new wd0(f8, qv0.d, f8, 0));
                p60 p60VarD7 = m8.d(b8Var2, false);
                int iHashCode8 = Long.hashCode(vfVar.ar);
                a aVarL8 = vfVar.l();
                j70 j70VarAn8 = m10.an(vfVar, j70VarB);
                vfVar.ax();
                if (vfVar.aq) {
                    vfVar.k(ngVar);
                } else {
                    vfVar.bh();
                }
                jo0.h(vfVar, w6Var, p60VarD7);
                jo0.h(vfVar, w6Var2, aVarL8);
                if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode8))) {
                    n5.j(iHashCode8, vfVar, iHashCode8, w6Var3);
                }
                jo0.h(vfVar, w6Var4, j70VarAn8);
                gvVar12 = gvVar7;
                gvVar12.f(vfVar, Integer.valueOf((i7 >> 6) & 14));
                z2 = true;
                vfVar.q(true);
            } else {
                gvVar12 = gvVar7;
                z2 = true;
            }
            vfVar.q(false);
            vfVar.q(z2);
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new jd0(gvVar10, hvVar, gvVar11, gvVar3, gvVar4, gvVar5, gvVar6, z, f3, cvVar, teVar, gvVar12, wd0Var2, i, i2);
        }
    }

    public static final int c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, wd0 wd0Var) {
        int[] iArr = {i7, i3, i4, m10.aj(f, i6, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        float f3 = wd0Var.b * f2;
        return Math.max(dh.i(j), Math.max(i, Math.max(i2, i60.ax(m10.ai(f3, Math.max(f3, i6 / 2.0f), f) + i5 + (wd0Var.d * f2)))) + i8);
    }

    public static final int d(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, float f2, wd0 wd0Var) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, m10.aj(f, i6, 0))) + i + i2;
        e20 e20Var = e20.d;
        return Math.max(iMax, Math.max(i60.ax((i6 + ((wd0Var.b(e20Var) + wd0Var.a(e20Var)) * f2)) * f), dh.j(j)));
    }

    public static final int e(boolean z, int i, int i2, lf0 lf0Var, lf0 lf0Var2) {
        if (z) {
            i2 = Math.round((1 + 0.0f) * ((i - lf0Var2.e) / 2.0f));
        }
        float f = qv0.b;
        return Math.max(i2, (lf0Var != null ? lf0Var.e : 0) / 2);
    }
}

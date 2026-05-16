package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class fa0 extends j50 implements k60, d20, sd0 {
    public static final uj0 am;
    public static final a20 an;
    public static final float[] ao;
    public static final n31 ap;
    public static final n31 aq;
    public q60 aa;
    public l80 ab;
    public float ad;
    public p80 ae;
    public a20 af;
    public jw ag;
    public oa ah;
    public y1 ai;
    public boolean ak;
    public rd0 al;
    public final s20 r;
    public fa0 s;
    public fa0 t;
    public boolean u;
    public boolean v;
    public cv w;
    public em x;
    public e20 y;
    public float z = 0.8f;
    public long ac = 0;
    public final ea0 aj = new ea0(this, 1);

    static {
        uj0 uj0Var = new uj0();
        uj0Var.e = 1.0f;
        uj0Var.f = 1.0f;
        uj0Var.g = 1.0f;
        long j = mw.a;
        uj0Var.i = j;
        uj0Var.j = j;
        uj0Var.k = 8.0f;
        uj0Var.l = iy0.a;
        uj0Var.m = f00.i;
        uj0Var.o = 9205357640488583168L;
        uj0Var.p = new fm(1.0f, 1.0f);
        uj0Var.q = e20.d;
        uj0Var.r = 3;
        am = uj0Var;
        an = new a20();
        ao = j60.a();
        ap = new n31(26);
        aq = new n31(27);
    }

    public fa0(s20 s20Var) {
        this.r = s20Var;
        this.x = s20Var.z;
        this.y = s20Var.aa;
    }

    public static fa0 X(d20 d20Var) {
        fa0 fa0Var;
        m50 m50Var = d20Var instanceof m50 ? (m50) d20Var : null;
        if (m50Var != null && (fa0Var = m50Var.d.r) != null) {
            return fa0Var;
        }
        d20Var.getClass();
        return (fa0) d20Var;
    }

    public final long A(long j) {
        long j2 = this.ac;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32);
        rd0 rd0Var = this.al;
        if (rd0Var == null) {
            return jFloatToRawIntBits;
        }
        lw lwVar = (lw) rd0Var;
        float[] fArrA = lwVar.a();
        if (fArrA == null) {
            return 9187343241974906880L;
        }
        return lwVar.v ? jFloatToRawIntBits : j60.b(jFloatToRawIntBits, fArrA);
    }

    public abstract l50 B();

    public final long C() {
        return this.x.aq(this.r.ab.g());
    }

    public abstract i70 D();

    public final i70 E(int i) {
        boolean zG = ga0.g(i);
        i70 i70VarD = D();
        if (!zG && (i70VarD = i70VarD.h) == null) {
            return null;
        }
        for (i70 i70VarF = F(zG); i70VarF != null && (i70VarF.g & i) != 0; i70VarF = i70VarF.i) {
            if ((i70VarF.f & i) != 0) {
                return i70VarF;
            }
            if (i70VarF == i70VarD) {
                return null;
            }
        }
        return null;
    }

    public final i70 F(boolean z) {
        i70 i70VarD;
        da0 da0Var = this.r.ag;
        if (((fa0) da0Var.h) == this) {
            return (i70) da0Var.j;
        }
        fa0 fa0Var = this.t;
        if (!z) {
            if (fa0Var != null) {
                return fa0Var.D();
            }
            return null;
        }
        if (fa0Var == null || (i70VarD = fa0Var.D()) == null) {
            return null;
        }
        return i70VarD.i;
    }

    public final void G(i70 i70Var, n31 n31Var, long j, px pxVar, int i, boolean z) {
        if (i70Var == null) {
            J(n31Var, j, pxVar, i, z);
            return;
        }
        int i2 = pxVar.f;
        m80 m80Var = pxVar.d;
        pxVar.b(i2 + 1, m80Var.b);
        pxVar.f++;
        m80Var.a(i70Var);
        pxVar.e.a(e00.d(-1.0f, z, false));
        G(i60.h(i70Var, n31Var.f()), n31Var, j, pxVar, i, z);
        pxVar.f = i2;
    }

    public final void H(i70 i70Var, n31 n31Var, long j, px pxVar, int i, boolean z, float f) {
        if (i70Var == null) {
            J(n31Var, j, pxVar, i, z);
            return;
        }
        int i2 = pxVar.f;
        m80 m80Var = pxVar.d;
        pxVar.b(i2 + 1, m80Var.b);
        pxVar.f++;
        m80Var.a(i70Var);
        pxVar.e.a(e00.d(f, z, false));
        R(i60.h(i70Var, n31Var.f()), n31Var, j, pxVar, i, z, f, true);
        pxVar.f = i2;
    }

    public final void I(n31 n31Var, long j, px pxVar, int i, boolean z) {
        boolean z2;
        boolean z3;
        i70 i70VarE = E(n31Var.f());
        if (!e0(j)) {
            if (i == 1) {
                float fI1 = I1(j, C());
                if ((Float.floatToRawIntBits(fI1) & Integer.MAX_VALUE) < 2139095040) {
                    if (pxVar.f != pxVar.d.b - 1) {
                        if (m10.o(pxVar.a(), e00.d(fI1, false, false)) <= 0) {
                            return;
                        }
                    }
                    H(i70VarE, n31Var, j, pxVar, i, false, fI1);
                    return;
                }
                return;
            }
            return;
        }
        if (i70VarE == null) {
            J(n31Var, j, pxVar, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < az() && fIntBitsToFloat2 < ay()) {
            G(i70VarE, n31Var, j, pxVar, i, z);
            return;
        }
        float fI12 = i == 1 ? I1(j, C()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fI12) & Integer.MAX_VALUE) < 2139095040) {
            if (pxVar.f != pxVar.d.b - 1) {
                z2 = z;
                if (m10.o(pxVar.a(), e00.d(fI12, z2, false)) > 0) {
                }
                R(i70VarE, n31Var, j, pxVar, i, z2, fI12, z3);
            }
            z2 = z;
            z3 = true;
            R(i70VarE, n31Var, j, pxVar, i, z2, fI12, z3);
        }
        z2 = z;
        z3 = false;
        R(i70VarE, n31Var, j, pxVar, i, z2, fI12, z3);
    }

    public final float I1(long j, long j2) {
        if (az() >= Float.intBitsToFloat((int) (j2 >> 32)) && ay() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jL1 = l1(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL1 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - az());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - ay()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void Il(oa oaVar, jw jwVar) {
        boolean z;
        Canvas canvas;
        boolean z2;
        boolean z3;
        float f;
        rd0 rd0Var = this.al;
        if (rd0Var == null) {
            long j = this.ac;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            oaVar.f(f2, f3);
            lI(oaVar, jwVar);
            oaVar.f(-f2, -f3);
            return;
        }
        lw lwVar = (lw) rd0Var;
        ra raVar = lwVar.p;
        lwVar.g();
        lwVar.w = lwVar.d.a.ag() > 0.0f;
        o6 o6Var = raVar.e;
        o6 o6Var2 = raVar.e;
        o6Var.y(oaVar);
        o6Var.b = jwVar;
        jw jwVar2 = lwVar.d;
        oa oaVarO = o6Var2.o();
        jw jwVar3 = (jw) o6Var2.b;
        kw kwVar = jwVar2.a;
        if (jwVar2.s) {
            return;
        }
        jwVar2.a();
        if (!kwVar.ah()) {
            try {
                jwVar2.a.w(jwVar2.b, jwVar2.c, jwVar2, jwVar2.e);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = kwVar.ag() > 0.0f;
        if (z4) {
            oaVarO.p();
        }
        Canvas canvasA = f0.a(oaVarO);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j2 = jwVar2.t;
            float f4 = (int) (j2 >> 32);
            float f5 = (int) (j2 & 4294967295L);
            long j3 = jwVar2.u;
            float f6 = ((int) (j3 >> 32)) + f4;
            float f7 = f5 + ((int) (j3 & 4294967295L));
            float fA = kwVar.a();
            c8 c8VarX = kwVar.x();
            int iAk = kwVar.ak();
            if (fA < 1.0f || iAk != 3 || c8VarX != null || kwVar.u() == 1) {
                l3 l3VarC = jwVar2.p;
                if (l3VarC == null) {
                    l3VarC = t1.c();
                    jwVar2.p = l3VarC;
                }
                l3VarC.c(fA);
                l3VarC.d(iAk);
                l3VarC.f(c8VarX);
                f = f4;
                canvasA.saveLayer(f, f5, f6, f7, l3VarC.a);
            } else {
                canvasA.save();
                f = f4;
            }
            canvasA.translate(f, f5);
            canvasA.concat(kwVar.ac());
        }
        boolean z5 = !zIsHardwareAccelerated && jwVar2.w;
        if (z5) {
            oaVarO.l();
            bd0 bd0VarD = jwVar2.d();
            if (bd0VarD instanceof zc0) {
                oa.k(oaVarO, ((zc0) bd0VarD).a);
            } else if (bd0VarD instanceof ad0) {
                t3 t3VarA = jwVar2.m;
                if (t3VarA != null) {
                    t3VarA.a.rewind();
                } else {
                    t3VarA = u3.a();
                    jwVar2.m = t3VarA;
                }
                t3.a(t3VarA, ((ad0) bd0VarD).a);
                oaVarO.q(t3VarA);
            } else {
                if (!(bd0VarD instanceof yc0)) {
                    wc.l();
                    return;
                }
                oaVarO.q(((yc0) bd0VarD).a);
            }
        }
        if (jwVar3 != null) {
            b3 b3Var = jwVar3.r;
            if (!b3Var.a) {
                vy.a("Only add dependencies during a tracking");
            }
            r80 r80Var = (r80) b3Var.d;
            if (r80Var != null) {
                r80Var.a(jwVar2);
            } else if (((jw) b3Var.b) != null) {
                int i = nm0.a;
                r80 r80Var2 = new r80();
                jw jwVar4 = (jw) b3Var.b;
                jwVar4.getClass();
                r80Var2.a(jwVar4);
                r80Var2.a(jwVar2);
                b3Var.d = r80Var2;
                b3Var.b = null;
            } else {
                b3Var.b = jwVar2;
            }
            r80 r80Var3 = (r80) b3Var.e;
            if (r80Var3 != null) {
                z3 = !r80Var3.k(jwVar2);
            } else if (((jw) b3Var.c) != jwVar2) {
                z3 = true;
            } else {
                b3Var.c = null;
                z3 = false;
            }
            if (z3) {
                jwVar2.q++;
            }
        }
        if (((e0) oaVarO).a.isHardwareAccelerated()) {
            z = z4;
            canvas = canvasA;
            z2 = z5;
            kwVar.s(oaVarO);
        } else {
            ra raVar2 = jwVar2.o;
            if (raVar2 == null) {
                raVar2 = new ra();
                jwVar2.o = raVar2;
            }
            o6 o6Var3 = raVar2.e;
            em emVar = jwVar2.b;
            e20 e20Var = jwVar2.c;
            long jAn = e00.an(jwVar2.u);
            qa qaVar = ((ra) o6Var3.c).d;
            em emVar2 = qaVar.a;
            e20 e20Var2 = qaVar.b;
            oa oaVarO2 = o6Var3.o();
            canvas = canvasA;
            z2 = z5;
            long jR = o6Var3.r();
            z = z4;
            jw jwVar5 = (jw) o6Var3.b;
            o6Var3.z(emVar);
            o6Var3.aa(e20Var);
            o6Var3.y(oaVarO);
            o6Var3.ab(jAn);
            o6Var3.b = jwVar2;
            oaVarO.l();
            try {
                jwVar2.c(raVar2);
            } finally {
                oaVarO.i();
                o6Var3.z(emVar2);
                o6Var3.aa(e20Var2);
                o6Var3.y(oaVarO2);
                o6Var3.ab(jR);
                o6Var3.b = jwVar5;
            }
        }
        if (z2) {
            oaVarO.i();
        }
        if (z) {
            oaVarO.n();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public void J(n31 n31Var, long j, px pxVar, int i, boolean z) {
        fa0 fa0Var = this.s;
        if (fa0Var != null) {
            fa0Var.I(n31Var, fa0Var.A(j), pxVar, i, z);
        }
    }

    public final void K() {
        rd0 rd0Var = this.al;
        if (rd0Var != null) {
            ((lw) rd0Var).c();
            return;
        }
        fa0 fa0Var = this.t;
        if (fa0Var != null) {
            fa0Var.K();
        }
    }

    public final boolean L() {
        if (this.al != null && this.z <= 0.0f) {
            return true;
        }
        fa0 fa0Var = this.t;
        if (fa0Var != null) {
            return fa0Var.L();
        }
        return false;
    }

    public final long M(d20 d20Var, long j) {
        if (d20Var instanceof m50) {
            m50 m50Var = (m50) d20Var;
            m50Var.d.r.N();
            return m50Var.b(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        fa0 fa0VarX = X(d20Var);
        fa0VarX.N();
        fa0 fa0VarOo = Oo(fa0VarX);
        while (fa0VarX != fa0VarOo) {
            j = fa0VarX.Y(j);
            fa0VarX = fa0VarX.t;
            fa0VarX.getClass();
        }
        return O1(fa0VarOo, j);
    }

    public final void N() {
        this.r.ah.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [i70] */
    /* JADX WARN: Type inference failed for: r7v7, types: [i70] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [a90] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void O() {
        i70 i70VarD;
        boolean zG = ga0.g(128);
        i70 i70VarF = F(zG);
        if (i70VarF == null || (i70VarF.d.g & 128) == 0) {
            return;
        }
        xq0 xq0Var = (xq0) fr0.b.n();
        cv cvVarE = xq0Var != null ? xq0Var.e() : null;
        xq0 xq0VarN = q6.n(xq0Var);
        try {
            if (!zG) {
                i70VarD = D().h;
                if (i70VarD == null) {
                }
            }
            i70VarD = D();
            for (i70 i70VarF2 = F(zG); i70VarF2 != null; i70VarF2 = i70VarF2.i) {
                if ((i70VarF2.g & 128) == 0) {
                    break;
                }
                if ((i70VarF2.f & 128) != 0) {
                    ?? M = i70VarF2;
                    ?? a90Var = 0;
                    while (M != 0) {
                        if (M instanceof b20) {
                            ((b20) M).s(this.f);
                        } else if ((M.f & 128) != 0 && (M instanceof rl)) {
                            i70 i70Var = ((rl) M).s;
                            int i = 0;
                            M = M;
                            a90Var = a90Var;
                            while (i70Var != null) {
                                if ((i70Var.f & 128) != 0) {
                                    i++;
                                    a90Var = a90Var;
                                    if (i == 1) {
                                        M = i70Var;
                                    } else {
                                        if (a90Var == 0) {
                                            a90Var = new a90(new i70[16]);
                                        }
                                        if (M != 0) {
                                            a90Var.b(M);
                                            M = 0;
                                        }
                                        a90Var.b(i70Var);
                                    }
                                }
                                i70Var = i70Var.i;
                                M = M;
                                a90Var = a90Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M = pk.m(a90Var);
                    }
                }
                if (i70VarF2 == i70VarD) {
                    break;
                }
            }
        } finally {
            q6.q(xq0Var, xq0VarN, cvVarE);
        }
    }

    public final void O0(fa0 fa0Var, p80 p80Var, boolean z) {
        if (fa0Var == this) {
            return;
        }
        fa0 fa0Var2 = this.t;
        if (fa0Var2 != null) {
            fa0Var2.O0(fa0Var, p80Var, z);
        }
        long j = this.ac;
        float f = (int) (j >> 32);
        p80Var.a -= f;
        p80Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        p80Var.b -= f2;
        p80Var.d -= f2;
        rd0 rd0Var = this.al;
        if (rd0Var != null) {
            lw lwVar = (lw) rd0Var;
            float[] fArrA = lwVar.a();
            if (!lwVar.v) {
                if (fArrA == null) {
                    p80Var.a = 0.0f;
                    p80Var.b = 0.0f;
                    p80Var.c = 0.0f;
                    p80Var.d = 0.0f;
                } else {
                    j60.c(fArrA, p80Var);
                }
            }
            if (this.v && z) {
                long j2 = this.f;
                p80Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long O1(fa0 fa0Var, long j) {
        if (fa0Var == this) {
            return j;
        }
        fa0 fa0Var2 = this.t;
        return (fa0Var2 == null || f00.h(fa0Var, fa0Var2)) ? A(j) : A(fa0Var2.O1(fa0Var, j));
    }

    public final fa0 Oo(fa0 fa0Var) {
        s20 s20VarQ = fa0Var.r;
        s20 s20Var = this.r;
        if (s20VarQ == s20Var) {
            i70 i70VarD = fa0Var.D();
            i70 i70VarD2 = D();
            if (!i70VarD2.d.q) {
                sy.b("visitLocalAncestors called on an unattached node");
            }
            for (i70 i70Var = i70VarD2.d.h; i70Var != null; i70Var = i70Var.h) {
                if ((i70Var.f & 2) != 0 && i70Var == i70VarD) {
                    return fa0Var;
                }
            }
            return this;
        }
        while (s20VarQ.q > s20Var.q) {
            s20VarQ = s20VarQ.q();
            s20VarQ.getClass();
        }
        s20 s20VarQ2 = s20Var;
        while (s20VarQ2.q > s20VarQ.q) {
            s20VarQ2 = s20VarQ2.q();
            s20VarQ2.getClass();
        }
        while (s20VarQ != s20VarQ2) {
            s20VarQ = s20VarQ.q();
            s20VarQ2 = s20VarQ2.q();
            if (s20VarQ == null || s20VarQ2 == null) {
                wc.n("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (s20VarQ2 != s20Var) {
            if (s20VarQ != fa0Var.r) {
                return (yy) s20VarQ.ag.g;
            }
            return fa0Var;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [i70] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a90] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void P() {
        boolean zG = ga0.g(128);
        i70 i70VarD = D();
        if (!zG && (i70VarD = i70VarD.h) == null) {
            return;
        }
        for (i70 i70VarF = F(zG); i70VarF != null && (i70VarF.g & 128) != 0; i70VarF = i70VarF.i) {
            if ((i70VarF.f & 128) != 0) {
                ?? M = i70VarF;
                ?? a90Var = 0;
                while (M != 0) {
                    if (M instanceof b20) {
                        ((b20) M).o(this);
                    } else if ((M.f & 128) != 0 && (M instanceof rl)) {
                        i70 i70Var = ((rl) M).s;
                        int i = 0;
                        M = M;
                        a90Var = a90Var;
                        while (i70Var != null) {
                            if ((i70Var.f & 128) != 0) {
                                i++;
                                a90Var = a90Var;
                                if (i == 1) {
                                    M = i70Var;
                                } else {
                                    if (a90Var == 0) {
                                        a90Var = new a90(new i70[16]);
                                    }
                                    if (M != 0) {
                                        a90Var.b(M);
                                        M = 0;
                                    }
                                    a90Var.b(i70Var);
                                }
                            }
                            i70Var = i70Var.i;
                            M = M;
                            a90Var = a90Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M = pk.m(a90Var);
                }
            }
            if (i70VarF == i70VarD) {
                return;
            }
        }
    }

    public final void Q() {
        this.u = true;
        this.aj.a();
        V();
        if (pz.a(this.ac, 0L)) {
            return;
        }
        this.r.ai();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b2 A[PHI: r9
      0x01b2: PHI (r9v5 ??) = (r9v1 ??), (r9v1 ??), (r9v7 ??) binds: [B:51:0x0179, B:53:0x017d, B:67:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [i70] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [i70] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [a90] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [a90] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v7, types: [i70] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5, types: [a90] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [a90] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(defpackage.i70 r22, defpackage.n31 r23, long r24, defpackage.px r26, int r27, boolean r28, float r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa0.R(i70, n31, long, px, int, boolean, float, boolean):void");
    }

    public abstract void S(oa oaVar, jw jwVar);

    public final void T(long j, float f, cv cvVar) {
        c0(cvVar, false);
        boolean zA = pz.a(this.ac, j);
        s20 s20Var = this.r;
        if (!zA) {
            t1.as(s20Var).ai(-4.0f);
            this.ac = j;
            s20Var.ah.o.bk();
            rd0 rd0Var = this.al;
            if (rd0Var != null) {
                ((lw) rd0Var).d(j);
            } else {
                fa0 fa0Var = this.t;
                if (fa0Var != null) {
                    fa0Var.K();
                }
            }
            s20Var.ai();
            j50.bv(this);
            b1 b1Var = s20Var.p;
            if (b1Var != null) {
                b1Var.v(s20Var);
            }
        }
        this.ad = f;
        if (!this.n) {
            bl(br());
        }
        if (this == ((fa0) s20Var.ag.h)) {
            t1.as(s20Var).getRectManager().g(s20Var, !s20Var.ah.o.n);
        }
    }

    public final void U(p80 p80Var, boolean z, boolean z2) {
        rd0 rd0Var = this.al;
        if (rd0Var != null) {
            if (this.v) {
                if (z2) {
                    long jC = C();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jC >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jC & 4294967295L)) / 2.0f;
                    long j = this.f;
                    p80Var.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z) {
                    long j2 = this.f;
                    p80Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (p80Var.b()) {
                    return;
                }
            }
            lw lwVar = (lw) rd0Var;
            float[] fArrB = lwVar.b();
            if (!lwVar.v) {
                if (fArrB == null) {
                    p80Var.a = 0.0f;
                    p80Var.b = 0.0f;
                    p80Var.c = 0.0f;
                    p80Var.d = 0.0f;
                } else {
                    j60.c(fArrB, p80Var);
                }
            }
        }
        long j3 = this.ac;
        float f = (int) (j3 >> 32);
        p80Var.a += f;
        p80Var.c += f;
        float f2 = (int) (j3 & 4294967295L);
        p80Var.b += f2;
        p80Var.d += f2;
    }

    public final void V() {
        if (this.al != null) {
            c0(null, false);
            this.r.ao(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [i70] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [a90] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [a90] */
    public final void W(q60 q60Var) {
        fa0 fa0Var;
        q60 q60Var2 = this.aa;
        if (q60Var != q60Var2) {
            this.aa = q60Var;
            s20 s20Var = this.r;
            int i = 0;
            if (q60Var2 == null || q60Var.e() != q60Var2.e() || q60Var.c() != q60Var2.c()) {
                int iE = q60Var.e();
                int iC = q60Var.c();
                rd0 rd0Var = this.al;
                if (rd0Var != null) {
                    ((lw) rd0Var).e((((long) iE) << 32) | (((long) iC) & 4294967295L));
                } else if (s20Var.af() && (fa0Var = this.t) != null) {
                    fa0Var.K();
                }
                bd((((long) iC) & 4294967295L) | (((long) iE) << 32));
                if (this.w != null) {
                    d0(false);
                }
                boolean zG = ga0.g(4);
                i70 i70VarD = D();
                if (zG || (i70VarD = i70VarD.h) != null) {
                    for (i70 i70VarF = F(zG); i70VarF != null && (i70VarF.g & 4) != 0; i70VarF = i70VarF.i) {
                        if ((i70VarF.f & 4) != 0) {
                            ?? M = i70VarF;
                            ?? a90Var = 0;
                            while (M != 0) {
                                if (M instanceof wo) {
                                    ((wo) M).bc();
                                } else if ((M.f & 4) != 0 && (M instanceof rl)) {
                                    i70 i70Var = ((rl) M).s;
                                    int i2 = 0;
                                    M = M;
                                    a90Var = a90Var;
                                    while (i70Var != null) {
                                        if ((i70Var.f & 4) != 0) {
                                            i2++;
                                            a90Var = a90Var;
                                            if (i2 == 1) {
                                                M = i70Var;
                                            } else {
                                                if (a90Var == 0) {
                                                    a90Var = new a90(new i70[16]);
                                                }
                                                if (M != 0) {
                                                    a90Var.b(M);
                                                    M = 0;
                                                }
                                                a90Var.b(i70Var);
                                            }
                                        }
                                        i70Var = i70Var.i;
                                        M = M;
                                        a90Var = a90Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M = pk.m(a90Var);
                            }
                        }
                        if (i70VarF == i70VarD) {
                            break;
                        }
                    }
                }
                b1 b1Var = s20Var.p;
                if (b1Var != null) {
                    b1Var.v(s20Var);
                }
            }
            l80 l80Var = this.ab;
            if ((l80Var == null || l80Var.e == 0) && q60Var.a().isEmpty()) {
                return;
            }
            l80 l80Var2 = this.ab;
            Map mapA = q60Var.a();
            if (l80Var2 != null && l80Var2.e == mapA.size()) {
                Object[] objArr = l80Var2.b;
                int[] iArr = l80Var2.c;
                long[] jArr = l80Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapA.get((qx) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            s20Var.ah.o.z.f();
            l80 l80Var3 = this.ab;
            if (l80Var3 == null) {
                l80 l80Var4 = sa0.a;
                l80Var3 = new l80();
                this.ab = l80Var3;
            }
            l80Var3.a();
            for (Map.Entry entry : q60Var.a().entrySet()) {
                l80Var3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final long Y(long j) {
        rd0 rd0Var = this.al;
        if (rd0Var != null) {
            lw lwVar = (lw) rd0Var;
            float[] fArrB = lwVar.b();
            if (!lwVar.v) {
                j = j60.b(j, fArrB);
            }
        }
        long j2 = this.ac;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final ri0 Z() {
        if (D().q) {
            d20 d20VarAd = i60.ad(this);
            p80 p80Var = this.ae;
            if (p80Var == null) {
                p80Var = new p80();
                this.ae = p80Var;
            }
            long jL1 = l1(C());
            int i = (int) (jL1 >> 32);
            p80Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (jL1 & 4294967295L);
            p80Var.b = -Float.intBitsToFloat(i2);
            p80Var.c = Float.intBitsToFloat(i) + az();
            p80Var.d = Float.intBitsToFloat(i2) + ay();
            fa0 fa0Var = this;
            while (fa0Var != d20VarAd) {
                fa0Var.U(p80Var, false, true);
                if (!p80Var.b()) {
                    fa0Var = fa0Var.t;
                    fa0Var.getClass();
                }
            }
            return new ri0(p80Var.a, p80Var.b, p80Var.c, p80Var.d);
        }
        return ri0.e;
    }

    public final void a0(fa0 fa0Var, float[] fArr) {
        float[] fArrA;
        if (f00.h(fa0Var, this)) {
            return;
        }
        fa0 fa0Var2 = this.t;
        fa0Var2.getClass();
        fa0Var2.a0(fa0Var, fArr);
        if (!pz.a(this.ac, 0L)) {
            float[] fArr2 = ao;
            j60.d(fArr2);
            long j = this.ac;
            j60.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            j60.e(fArr, fArr2);
        }
        rd0 rd0Var = this.al;
        if (rd0Var == null || (fArrA = ((lw) rd0Var).a()) == null) {
            return;
        }
        j60.e(fArr, fArrA);
    }

    @Override // defpackage.d20
    public final long ad(long j) {
        if (!D().q) {
            sy.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return M(i60.ad(this), t1.as(this.r).ad(j));
    }

    @Override // defpackage.d20
    public final boolean af() {
        return D().q;
    }

    @Override // defpackage.d20
    public final void ag(float[] fArr) {
        b1 b1VarAs = t1.as(this.r);
        fa0 fa0VarX = X(i60.ad(this));
        b0(fa0VarX, fArr);
        if (b1VarAs instanceof b1) {
            b1VarAs.r(fArr);
            return;
        }
        long jD = fa0VarX.d(0L);
        if ((9223372034707292159L & jD) != 9205357640488583168L) {
            j60.f(fArr, Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (jD & 4294967295L)));
        }
    }

    @Override // defpackage.d20
    public final void aj(d20 d20Var, float[] fArr) {
        fa0 fa0VarX = X(d20Var);
        fa0VarX.N();
        fa0 fa0VarOo = Oo(fa0VarX);
        j60.d(fArr);
        fa0VarX.b0(fa0VarOo, fArr);
        a0(fa0VarOo, fArr);
    }

    @Override // defpackage.d20
    public final ri0 ak(d20 d20Var, boolean z) {
        if (!D().q) {
            sy.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!d20Var.af()) {
            sy.b("LayoutCoordinates " + d20Var + " is not attached!");
        }
        fa0 fa0VarX = X(d20Var);
        fa0VarX.N();
        fa0 fa0VarOo = Oo(fa0VarX);
        p80 p80Var = this.ae;
        if (p80Var == null) {
            p80Var = new p80();
            this.ae = p80Var;
        }
        p80Var.a = 0.0f;
        p80Var.b = 0.0f;
        p80Var.c = (int) (d20Var.al() >> 32);
        p80Var.d = (int) (d20Var.al() & 4294967295L);
        while (fa0VarX != fa0VarOo) {
            fa0VarX.U(p80Var, z, false);
            if (p80Var.b()) {
                return ri0.e;
            }
            fa0VarX = fa0VarX.t;
            fa0VarX.getClass();
        }
        O0(fa0VarOo, p80Var, z);
        return new ri0(p80Var.a, p80Var.b, p80Var.c, p80Var.d);
    }

    @Override // defpackage.d20
    public final long al() {
        return this.f;
    }

    @Override // defpackage.d20
    public final long am(long j) {
        if (!D().q) {
            sy.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        N();
        for (fa0 fa0Var = this; fa0Var != null; fa0Var = fa0Var.t) {
            j = fa0Var.Y(j);
        }
        return j;
    }

    @Override // defpackage.em
    public final float b() {
        return this.r.z.b();
    }

    public final void b0(fa0 fa0Var, float[] fArr) {
        fa0 fa0Var2 = this;
        while (!fa0Var2.equals(fa0Var)) {
            rd0 rd0Var = fa0Var2.al;
            if (rd0Var != null) {
                j60.e(fArr, ((lw) rd0Var).b());
            }
            if (!pz.a(fa0Var2.ac, 0L)) {
                float[] fArr2 = ao;
                j60.d(fArr2);
                j60.f(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                j60.e(fArr, fArr2);
            }
            fa0Var2 = fa0Var2.t;
            fa0Var2.getClass();
        }
    }

    @Override // defpackage.j50
    public final j50 bn() {
        return this.s;
    }

    @Override // defpackage.j50
    public final boolean bp() {
        return this.aa != null;
    }

    @Override // defpackage.j50
    public final s20 bq() {
        return this.r;
    }

    @Override // defpackage.j50
    public final q60 br() {
        q60 q60Var = this.aa;
        if (q60Var != null) {
            return q60Var;
        }
        wc.q("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.j50
    public final j50 bs() {
        return this.t;
    }

    @Override // defpackage.j50
    public final long bt() {
        return this.ac;
    }

    @Override // defpackage.j50
    public final void bz() {
        bc(this.ac, this.ad, this.w);
    }

    public final void c0(cv cvVar, boolean z) {
        b1 b1Var;
        a90 a90Var;
        Reference referencePoll;
        y1 y1Var;
        a90 a90Var2;
        Reference referencePoll2;
        Object obj;
        s20 s20Var = this.r;
        boolean z2 = (!z && this.w == cvVar && f00.h(this.x, s20Var.z) && this.y == s20Var.aa) ? false : true;
        this.x = s20Var.z;
        this.y = s20Var.aa;
        boolean zAe = s20Var.ae();
        ea0 ea0Var = this.aj;
        if (!zAe || cvVar == null) {
            this.w = null;
            rd0 rd0Var = this.al;
            if (rd0Var != null) {
                lw lwVar = (lw) rd0Var;
                if (!i60.am(lwVar.b())) {
                    s20Var.ai();
                }
                lwVar.g = null;
                lwVar.h = null;
                lwVar.j = true;
                lwVar.f(false);
                iw iwVar = lwVar.e;
                if (iwVar != null) {
                    iwVar.a(lwVar.d);
                    b1 b1Var2 = lwVar.f;
                    f1 f1Var = b1Var2.bt;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) f1Var.f;
                        a90Var = (a90) f1Var.e;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            a90Var.i(referencePoll);
                        }
                    } while (referencePoll != null);
                    a90Var.b(new WeakReference(lwVar, (ReferenceQueue) f1Var.f));
                    b1Var2.aa.remove(lwVar);
                }
                s20Var.aj = true;
                ea0Var.a();
                if (D().q && s20Var.af() && (b1Var = s20Var.p) != null) {
                    b1Var.v(s20Var);
                }
            }
            this.al = null;
            this.ak = false;
            return;
        }
        this.w = cvVar;
        if (this.al != null) {
            if (z2 && d0(true)) {
                s20Var.ai();
                t1.as(s20Var).getRectManager().f(s20Var);
                return;
            }
            return;
        }
        b1 b1VarAs = t1.as(s20Var);
        y1 y1Var2 = this.ai;
        if (y1Var2 == null) {
            y1 y1Var3 = new y1(7, this, new ea0(this, 0));
            this.ai = y1Var3;
            y1Var = y1Var3;
        } else {
            y1Var = y1Var2;
        }
        f1 f1Var2 = b1VarAs.bt;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) f1Var2.f;
            a90Var2 = (a90) f1Var2.e;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                a90Var2.i(referencePoll2);
            }
        } while (referencePoll2 != null);
        while (true) {
            int i = a90Var2.f;
            if (i == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) a90Var2.j(i - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        rd0 lwVar2 = (rd0) obj;
        if (lwVar2 != null) {
            lw lwVar3 = (lw) lwVar2;
            iw iwVar2 = lwVar3.e;
            if (iwVar2 == null) {
                throw n5.f("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!lwVar3.d.s) {
                sy.a("layer should have been released before reuse");
            }
            lwVar3.d = iwVar2.b();
            lwVar3.j = false;
            lwVar3.g = y1Var;
            lwVar3.h = ea0Var;
            lwVar3.t = false;
            lwVar3.u = false;
            lwVar3.v = true;
            j60.d(lwVar3.k);
            float[] fArr = lwVar3.l;
            if (fArr != null) {
                j60.d(fArr);
            }
            lwVar3.r = iy0.a;
            lwVar3.w = false;
            long j = Integer.MAX_VALUE;
            lwVar3.i = (j & 4294967295L) | (j << 32);
            lwVar3.s = null;
            lwVar3.q = 0;
        } else {
            lwVar2 = new lw(b1VarAs.getGraphicsContext().b(), b1VarAs.getGraphicsContext(), b1VarAs, y1Var, ea0Var);
        }
        lw lwVar4 = (lw) lwVar2;
        lwVar4.e(this.f);
        lwVar4.d(this.ac);
        this.al = lwVar2;
        d0(true);
        s20Var.aj = true;
        ea0Var.a();
    }

    @Override // defpackage.d20
    public final long d(long j) {
        if (!D().q) {
            sy.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return t1.as(this.r).s(am(j));
    }

    public final boolean d0(boolean z) {
        long j;
        char c;
        long j2;
        s20 s20Var;
        boolean z2;
        b1 b1Var;
        pu puVar;
        pu puVar2;
        rd0 rd0Var = this.al;
        cv cvVar = this.w;
        if (rd0Var == null) {
            if (cvVar == null) {
                return false;
            }
            sy.b("null layer with a non-null layerBlock");
            return false;
        }
        if (cvVar == null) {
            throw n5.f("updateLayerParameters requires a non-null layerBlock");
        }
        uj0 uj0Var = am;
        if (uj0Var.e != 1.0f) {
            uj0Var.d |= 1;
            uj0Var.e = 1.0f;
        }
        if (uj0Var.f != 1.0f) {
            uj0Var.d |= 2;
            uj0Var.f = 1.0f;
        }
        uj0Var.a(1.0f);
        uj0Var.e(0.0f);
        long j3 = mw.a;
        uj0Var.d(j3);
        uj0Var.h(j3);
        if (uj0Var.k != 8.0f) {
            uj0Var.d |= 2048;
            uj0Var.k = 8.0f;
        }
        long j4 = iy0.a;
        if (uj0Var.l != j4) {
            uj0Var.d |= 4096;
            uj0Var.l = j4;
        }
        uj0Var.f(f00.i);
        if (uj0Var.n) {
            uj0Var.d |= 16384;
            uj0Var.n = false;
        }
        if (uj0Var.r != 3) {
            uj0Var.d |= 524288;
            uj0Var.r = 3;
        }
        uj0Var.o = 9205357640488583168L;
        uj0Var.s = null;
        uj0Var.d = 0;
        s20 s20Var2 = this.r;
        uj0Var.p = s20Var2.z;
        uj0Var.q = s20Var2.aa;
        uj0Var.o = e00.an(this.f);
        t1.as(s20Var2).getSnapshotObserver().a(this, f50.i, new b(16, cvVar));
        a20 a20Var = this.af;
        if (a20Var == null) {
            a20Var = new a20();
            this.af = a20Var;
        }
        a20 a20Var2 = an;
        a20Var2.getClass();
        a20Var2.a = a20Var.a;
        a20Var2.b = a20Var.b;
        a20Var2.c = a20Var.c;
        a20Var2.d = a20Var.d;
        float f = uj0Var.e;
        a20Var.a = f;
        a20Var.b = uj0Var.f;
        a20Var.c = uj0Var.k;
        long j5 = uj0Var.l;
        a20Var.d = j5;
        lw lwVar = (lw) rd0Var;
        b1 b1Var2 = lwVar.f;
        int i = uj0Var.d | lwVar.q;
        lwVar.o = uj0Var.q;
        lwVar.n = uj0Var.p;
        int i2 = i & 4096;
        if (i2 != 0) {
            lwVar.r = j5;
        }
        if ((i & 1) != 0) {
            kw kwVar = lwVar.d.a;
            if (kwVar.d() != f) {
                kwVar.m(f);
            }
        }
        if ((i & 2) != 0) {
            jw jwVar = lwVar.d;
            float f2 = uj0Var.f;
            kw kwVar2 = jwVar.a;
            if (kwVar2.ai() != f2) {
                kwVar2.ab(f2);
            }
        }
        if ((i & 4) != 0) {
            jw jwVar2 = lwVar.d;
            float f3 = uj0Var.g;
            kw kwVar3 = jwVar2.a;
            if (kwVar3.a() != f3) {
                kwVar3.c(f3);
            }
        }
        if ((i & 8) != 0) {
            kw kwVar4 = lwVar.d.a;
            if (kwVar4.q() != 0.0f) {
                kwVar4.r();
            }
        }
        if ((i & 16) != 0) {
            kw kwVar5 = lwVar.d.a;
            if (kwVar5.f() != 0.0f) {
                kwVar5.g();
            }
        }
        if ((i & 32) != 0) {
            jw jwVar3 = lwVar.d;
            float f4 = uj0Var.h;
            kw kwVar6 = jwVar3.a;
            if (kwVar6.ag() != f4) {
                kwVar6.e(f4);
                jwVar3.g = true;
                jwVar3.a();
            }
            if (uj0Var.h > 0.0f && !lwVar.w && (puVar2 = lwVar.h) != null) {
                puVar2.a();
            }
        }
        if ((i & 64) != 0) {
            jw jwVar4 = lwVar.d;
            long j6 = uj0Var.i;
            kw kwVar7 = jwVar4.a;
            j = j4;
            if (!qc.c(j6, kwVar7.am())) {
                kwVar7.j(j6);
            }
        } else {
            j = j4;
        }
        if ((i & 128) != 0) {
            jw jwVar5 = lwVar.d;
            long j7 = uj0Var.j;
            kw kwVar8 = jwVar5.a;
            if (!qc.c(j7, kwVar8.i())) {
                kwVar8.aa(j7);
            }
        }
        if ((i & 1024) != 0) {
            kw kwVar9 = lwVar.d.a;
            if (kwVar9.aj() != 0.0f) {
                kwVar9.z();
            }
        }
        if ((i & 256) != 0) {
            kw kwVar10 = lwVar.d.a;
            if (kwVar10.v() != 0.0f) {
                kwVar10.b();
            }
        }
        if ((i & 512) != 0) {
            kw kwVar11 = lwVar.d.a;
            if (kwVar11.ae() != 0.0f) {
                kwVar11.h();
            }
        }
        if ((i & 2048) != 0) {
            jw jwVar6 = lwVar.d;
            float f5 = uj0Var.k;
            kw kwVar12 = jwVar6.a;
            if (kwVar12.o() != f5) {
                kwVar12.af(f5);
            }
        }
        if (i2 != 0) {
            long j8 = lwVar.r;
            boolean z3 = j8 == j;
            jw jwVar7 = lwVar.d;
            if (z3) {
                c = ' ';
                j2 = 4294967295L;
                if (!xa0.b(jwVar7.v, 9205357640488583168L)) {
                    jwVar7.v = 9205357640488583168L;
                    jwVar7.a.al(9205357640488583168L);
                }
            } else {
                c = ' ';
                j2 = 4294967295L;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lwVar.r & 4294967295L)) * ((int) (lwVar.i & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 >> 32)) * ((int) (lwVar.i >> 32)))) << 32);
                if (!xa0.b(jwVar7.v, jFloatToRawIntBits)) {
                    jwVar7.v = jFloatToRawIntBits;
                    jwVar7.a.al(jFloatToRawIntBits);
                }
            }
        } else {
            c = ' ';
            j2 = 4294967295L;
        }
        if ((i & 16384) != 0) {
            jw jwVar8 = lwVar.d;
            boolean z4 = uj0Var.n;
            if (jwVar8.w != z4) {
                jwVar8.w = z4;
                jwVar8.g = true;
                jwVar8.a();
            }
        }
        if ((131072 & i) != 0) {
            kw kwVar13 = lwVar.d.a;
        }
        if ((262144 & i) != 0) {
            kw kwVar14 = lwVar.d.a;
            if (!f00.h(kwVar14.x(), null)) {
                kwVar14.l();
            }
        }
        if ((i & 524288) != 0) {
            jw jwVar9 = lwVar.d;
            int i3 = uj0Var.r;
            kw kwVar15 = jwVar9.a;
            if (kwVar15.ak() != i3) {
                kwVar15.n(i3);
            }
        }
        if ((32768 & i) != 0) {
            kw kwVar16 = lwVar.d.a;
            if (kwVar16.u() != 0) {
                kwVar16.y(0);
            }
        }
        if ((i & 7963) != 0) {
            lwVar.t = true;
            lwVar.u = true;
        }
        if (f00.h(lwVar.s, uj0Var.s)) {
            s20Var = s20Var2;
            z2 = false;
        } else {
            bd0 bd0Var = uj0Var.s;
            lwVar.s = bd0Var;
            if (bd0Var == null) {
                s20Var = s20Var2;
            } else {
                jw jwVar10 = lwVar.d;
                if (bd0Var instanceof zc0) {
                    ri0 ri0Var = ((zc0) bd0Var).a;
                    float f6 = ri0Var.a;
                    float f7 = ri0Var.b;
                    char c2 = c;
                    jwVar10.f(0.0f, (((long) Float.floatToRawIntBits(f6)) << c2) | (((long) Float.floatToRawIntBits(f7)) & j2), (((long) Float.floatToRawIntBits(ri0Var.c - f6)) << c2) | (((long) Float.floatToRawIntBits(ri0Var.d - f7)) & j2));
                } else {
                    char c3 = c;
                    if (bd0Var instanceof yc0) {
                        t3 t3Var = ((yc0) bd0Var).a;
                        jwVar10.k = null;
                        jwVar10.i = 9205357640488583168L;
                        jwVar10.h = 0L;
                        jwVar10.j = 0.0f;
                        jwVar10.g = true;
                        jwVar10.n = false;
                        jwVar10.l = t3Var;
                        jwVar10.a();
                    } else {
                        if (!(bd0Var instanceof ad0)) {
                            wc.l();
                            return false;
                        }
                        ad0 ad0Var = (ad0) bd0Var;
                        t3 t3Var2 = ad0Var.b;
                        if (t3Var2 != null) {
                            jwVar10.k = null;
                            s20Var = s20Var2;
                            jwVar10.i = 9205357640488583168L;
                            jwVar10.h = 0L;
                            jwVar10.j = 0.0f;
                            jwVar10.g = true;
                            jwVar10.n = false;
                            jwVar10.l = t3Var2;
                            jwVar10.a();
                        } else {
                            s20Var = s20Var2;
                            yk0 yk0Var = ad0Var.a;
                            float f8 = yk0Var.b;
                            float f9 = yk0Var.a;
                            jwVar10.f(Float.intBitsToFloat((int) (yk0Var.h >> c3)), (((long) Float.floatToRawIntBits(f9)) << c3) | (((long) Float.floatToRawIntBits(f8)) & j2), (((long) Float.floatToRawIntBits(yk0Var.c - f9)) << c3) | (((long) Float.floatToRawIntBits(yk0Var.d - f8)) & j2));
                        }
                        if ((bd0Var instanceof yc0) && Build.VERSION.SDK_INT < 33 && (puVar = lwVar.h) != null) {
                            puVar.a();
                        }
                    }
                }
                s20Var = s20Var2;
                if (bd0Var instanceof yc0) {
                    puVar.a();
                }
            }
            z2 = true;
        }
        lwVar.q = uj0Var.d;
        if (i != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                ViewParent parent = b1Var2.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(b1Var2, b1Var2);
                }
            } else {
                b1Var2.invalidate();
            }
            if (b1Var2.i) {
                b1Var2.ai(0.0f);
            }
        }
        boolean z5 = this.v;
        boolean z6 = uj0Var.n;
        this.v = z6;
        this.z = uj0Var.g;
        boolean z7 = a20Var2.a == a20Var.a && a20Var2.b == a20Var.b && a20Var2.c == a20Var.c && a20Var2.d == a20Var.d;
        boolean z8 = !z7;
        if (z && ((!z7 || z5 != z6) && (b1Var = s20Var.p) != null)) {
            b1Var.v(s20Var);
        }
        return z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e0(long r26) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa0.e0(long):boolean");
    }

    @Override // defpackage.a00
    public final e20 getLayoutDirection() {
        return this.r.aa;
    }

    @Override // defpackage.d20
    public final long h(long j) {
        if (!D().q) {
            sy.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        d20 d20VarAd = i60.ad(this);
        b1 b1VarAs = t1.as(this.r);
        b1VarAs.z();
        return M(d20VarAd, xa0.f(j60.b(j, b1VarAs.av), d20VarAd.am(0L)));
    }

    @Override // defpackage.d20
    public final long i(long j) {
        long jAm = am(j);
        b1 b1VarAs = t1.as(this.r);
        b1VarAs.z();
        return j60.b(jAm, b1VarAs.au);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [i70] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [i70] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a90] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // defpackage.lf0, defpackage.k60
    public final Object j() {
        s20 s20Var = this.r;
        if (!s20Var.ag.h(64)) {
            return null;
        }
        D();
        Object objBb = null;
        for (i70 i70Var = (hu0) s20Var.ag.i; i70Var != null; i70Var = i70Var.h) {
            if ((i70Var.f & 64) != 0) {
                ?? M = i70Var;
                ?? a90Var = 0;
                while (M != 0) {
                    if (M instanceof ne0) {
                        objBb = ((ne0) M).bb(objBb);
                    } else if ((M.f & 64) != 0 && (M instanceof rl)) {
                        i70 i70Var2 = ((rl) M).s;
                        int i = 0;
                        M = M;
                        a90Var = a90Var;
                        while (i70Var2 != null) {
                            if ((i70Var2.f & 64) != 0) {
                                i++;
                                a90Var = a90Var;
                                if (i == 1) {
                                    M = i70Var2;
                                } else {
                                    if (a90Var == 0) {
                                        a90Var = new a90(new i70[16]);
                                    }
                                    if (M != 0) {
                                        a90Var.b(M);
                                        M = 0;
                                    }
                                    a90Var.b(i70Var2);
                                }
                            }
                            i70Var2 = i70Var2.i;
                            M = M;
                            a90Var = a90Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M = pk.m(a90Var);
                }
            }
        }
        return objBb;
    }

    @Override // defpackage.em
    public final float k() {
        return this.r.z.k();
    }

    @Override // defpackage.d20
    public final d20 l() {
        if (!D().q) {
            sy.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        N();
        return ((fa0) this.r.ag.h).t;
    }

    public final long l1(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - az();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ay();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void lI(oa oaVar, jw jwVar) {
        oa oaVar2;
        jw jwVar2;
        i70 i70VarE = E(4);
        if (i70VarE == null) {
            S(oaVar, jwVar);
            return;
        }
        s20 s20Var = this.r;
        s20Var.getClass();
        u20 sharedDrawScope = t1.as(s20Var).getSharedDrawScope();
        long jAn = e00.an(this.f);
        sharedDrawScope.getClass();
        a90 a90Var = null;
        while (i70VarE != null) {
            if (i70VarE instanceof wo) {
                oaVar2 = oaVar;
                jwVar2 = jwVar;
                sharedDrawScope.d(oaVar2, jAn, this, (wo) i70VarE, jwVar2);
            } else {
                oaVar2 = oaVar;
                jwVar2 = jwVar;
                if ((i70VarE.f & 4) != 0 && (i70VarE instanceof rl)) {
                    int i = 0;
                    for (i70 i70Var = ((rl) i70VarE).s; i70Var != null; i70Var = i70Var.i) {
                        if ((i70Var.f & 4) != 0) {
                            i++;
                            if (i == 1) {
                                i70VarE = i70Var;
                            } else {
                                if (a90Var == null) {
                                    a90Var = new a90(new i70[16]);
                                }
                                if (i70VarE != null) {
                                    a90Var.b(i70VarE);
                                    i70VarE = null;
                                }
                                a90Var.b(i70Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                oaVar = oaVar2;
                jwVar = jwVar2;
            }
            i70VarE = pk.m(a90Var);
            oaVar = oaVar2;
            jwVar = jwVar2;
        }
    }

    public abstract void oO();

    @Override // defpackage.sd0
    public final boolean y() {
        return (this.al == null || this.u || !this.r.ae()) ? false : true;
    }

    @Override // defpackage.d20
    public final long z(d20 d20Var, long j) {
        return M(d20Var, j);
    }

    @Override // defpackage.j50
    public final d20 bo() {
        return this;
    }
}

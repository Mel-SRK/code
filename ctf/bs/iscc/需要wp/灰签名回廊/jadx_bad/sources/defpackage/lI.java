package defpackage;

import android.view.View;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.example.gnd.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class lI {
    public static final long a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void b(boolean z, oj0 oj0Var, cw0 cw0Var, vf vfVar, int i) {
        int i2;
        vfVar.aw(-1344558920);
        if ((i & 6) == 0) {
            i2 = (vfVar.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vfVar.f(oj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vfVar.h(cw0Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && vfVar.z()) {
            vfVar.aq();
        } else {
            int i3 = i2 & 14;
            boolean zF = (i3 == 4) | vfVar.f(cw0Var);
            Object objAk = vfVar.ak();
            n31 n31Var = nf.a;
            if (zF || objAk == n31Var) {
                objAk = new bw0(cw0Var, z);
                vfVar.be(objAk);
            }
            fv0 fv0Var = (fv0) objAk;
            boolean zH = vfVar.h(cw0Var) | (i3 == 4);
            Object objAk2 = vfVar.ak();
            if (zH || objAk2 == n31Var) {
                objAk2 = new dw0(cw0Var, z);
                vfVar.be(objAk2);
            }
            bb0 bb0Var = (bb0) objAk2;
            boolean zF2 = hx0.f(cw0Var.j().b);
            boolean zH2 = vfVar.h(fv0Var);
            Object objAk3 = vfVar.ak();
            if (zH2 || objAk3 == n31Var) {
                objAk3 = new c(fv0Var, null, 20);
                vfVar.be(objAk3);
            }
            pk.g(bb0Var, z, oj0Var, zF2, 0L, g70.a.c(new SuspendPointerInputElement(fv0Var, null, new ut0((gv) objAk3), 6)), vfVar, (i2 << 3) & 1008);
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new p4(z, oj0Var, cw0Var, i);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(3:13|77|14)(2:18|19))(8:21|(10:73|23|24|81|25|26|69|27|(1:30)|50)(7:39|75|40|41|79|42|(6:44|45|71|46|47|48)(2:55|56))|34|59|(1:62)|63|(1:67)|68)|31|79|42|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011b, code lost:
    
        if (d(r3, r5, r8) == r11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0124, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0125, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9 A[Catch: CancellationException -> 0x0124, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x0124, blocks: (B:42:0x00d4, B:44:0x00e9), top: B:79:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x011b -> B:31:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(r5 r5Var, m5 m5Var, long j, cv cvVar, ki kiVar) {
        pt0 pt0Var;
        r5 r5Var2;
        xi0 xi0Var;
        r5 r5Var3;
        cv cvVar2;
        xi0 xi0Var2;
        xi0 xi0Var3;
        p5 p5Var;
        p5 p5Var2;
        Object obj;
        cv cvVar3;
        xi0 xi0Var4;
        m5 m5Var2;
        r5 r5Var4;
        m5 m5Var3 = m5Var;
        if (kiVar instanceof pt0) {
            pt0Var = (pt0) kiVar;
            int i = pt0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                pt0Var.l = i - Integer.MIN_VALUE;
            } else {
                pt0Var = new pt0(kiVar);
            }
        }
        pt0 pt0Var2 = pt0Var;
        pj pjVar = pt0Var2.e;
        Object obj2 = pt0Var2.k;
        int i2 = pt0Var2.l;
        yj yjVar = yj.d;
        if (i2 == 0) {
            i60.az(obj2);
            Object objB = m5Var3.b(0L);
            w5 w5VarF = m5Var3.f(0L);
            xi0 xi0Var5 = new xi0();
            if (j == Long.MIN_VALUE) {
                try {
                    pjVar.getClass();
                    r5Var2 = r5Var;
                } catch (CancellationException e) {
                    e = e;
                    r5Var2 = r5Var;
                }
                try {
                    rt0 rt0Var = new rt0(xi0Var5, objB, m5Var3, w5VarF, r5Var2, j(pjVar), cvVar);
                    xi0Var = xi0Var5;
                    try {
                        pt0Var2.g = r5Var2;
                        pt0Var2.h = m5Var3;
                        pt0Var2.i = cvVar;
                        pt0Var2.j = xi0Var;
                        pt0Var2.l = 1;
                        if (d(m5Var3, rt0Var, pt0Var2) != yjVar) {
                            r5Var3 = r5Var2;
                            cvVar2 = cvVar;
                            xi0Var2 = xi0Var;
                        }
                        return yjVar;
                    } catch (CancellationException e2) {
                        e = e2;
                        r5Var3 = r5Var2;
                        xi0Var2 = xi0Var;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    xi0Var = xi0Var5;
                    r5Var3 = r5Var2;
                    xi0Var2 = xi0Var;
                    p5Var = (p5) xi0Var2.d;
                    if (p5Var != null) {
                    }
                    p5Var2 = (p5) xi0Var2.d;
                    if (p5Var2 != null) {
                        r5Var3.i = false;
                    }
                    throw e;
                }
            } else {
                xi0Var = xi0Var5;
                try {
                    p5 p5Var3 = new p5(objB, m5Var3.d(), w5VarF, j, m5Var3.e(), j, new qt0(r5Var, 1));
                    pjVar.getClass();
                    e(p5Var3, j, j(pjVar), m5Var3, r5Var, cvVar);
                    xi0Var.d = p5Var3;
                    r5Var3 = r5Var;
                    m5Var3 = m5Var;
                    cvVar2 = cvVar;
                    xi0Var3 = xi0Var;
                    obj = xi0Var3.d;
                    obj.getClass();
                    if (((Boolean) ((p5) obj).i.getValue()).booleanValue()) {
                        return wz0.a;
                    }
                    try {
                        pj pjVar2 = pt0Var2.e;
                        pjVar2.getClass();
                        st0 st0Var = new st0(xi0Var4, j(pjVar2), m5Var2, r5Var4, cvVar3);
                        xi0Var2 = xi0Var4;
                        m5Var3 = m5Var2;
                        r5Var3 = r5Var4;
                        cvVar2 = cvVar3;
                        pt0Var2.g = r5Var3;
                        pt0Var2.h = m5Var3;
                        pt0Var2.i = cvVar2;
                        pt0Var2.j = xi0Var2;
                        pt0Var2.l = 2;
                    } catch (CancellationException e4) {
                        e = e4;
                        xi0Var2 = xi0Var4;
                        r5Var3 = r5Var4;
                    }
                    cvVar3 = cvVar2;
                    xi0Var4 = xi0Var3;
                    m5Var2 = m5Var3;
                    r5Var4 = r5Var3;
                } catch (CancellationException e5) {
                    e = e5;
                    r5Var3 = r5Var;
                    xi0Var2 = xi0Var;
                }
            }
            xi0Var2 = xi0Var;
            p5Var = (p5) xi0Var2.d;
            if (p5Var != null) {
                p5Var.i.setValue(Boolean.FALSE);
            }
            p5Var2 = (p5) xi0Var2.d;
            if (p5Var2 != null && p5Var2.g == r5Var3.g) {
                r5Var3.i = false;
            }
            throw e;
        }
        if (i2 != 1 && i2 != 2) {
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xi0Var2 = pt0Var2.j;
        cvVar2 = pt0Var2.i;
        m5Var3 = pt0Var2.h;
        r5Var3 = pt0Var2.g;
        try {
            i60.az(obj2);
        } catch (CancellationException e6) {
            e = e6;
        }
        xi0Var3 = xi0Var2;
        obj = xi0Var3.d;
        obj.getClass();
        if (((Boolean) ((p5) obj).i.getValue()).booleanValue()) {
        }
    }

    public static final Object d(m5 m5Var, cv cvVar, pt0 pt0Var) {
        pj pjVar = pt0Var.e;
        if (!m5Var.a()) {
            l1 l1Var = new l1(cvVar);
            pjVar.getClass();
            return pk.ai(pjVar).m(l1Var, pt0Var);
        }
        pjVar.getClass();
        if (pjVar.k(bw.ad) == null) {
            pjVar.getClass();
            return pk.ai(pjVar).m(cvVar, pt0Var);
        }
        wc.c();
        return null;
    }

    public static final void e(p5 p5Var, long j, float f, m5 m5Var, r5 r5Var, cv cvVar) {
        long jC = f == 0.0f ? m5Var.c() : (long) ((j - p5Var.c) / f);
        p5Var.g = j;
        p5Var.e.setValue(m5Var.b(jC));
        p5Var.f = m5Var.f(jC);
        if (m5Var.g(jC)) {
            p5Var.h = p5Var.g;
            p5Var.i.setValue(Boolean.FALSE);
        }
        o(p5Var, r5Var);
        cvVar.g(p5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [i70] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [i70] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [a90] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final sy0 f(ql qlVar, Object obj) {
        da0 da0Var;
        i70 i70Var = (i70) qlVar;
        if (!i70Var.d.q) {
            sy.b("visitAncestors called on an unattached node");
        }
        i70 i70Var2 = i70Var.d.h;
        s20 s20VarAy = pk.ay(qlVar);
        while (s20VarAy != null) {
            if ((((i70) s20VarAy.ag.j).g & 262144) != 0) {
                while (i70Var2 != null) {
                    if ((i70Var2.f & 262144) != 0) {
                        ?? M = i70Var2;
                        ?? a90Var = 0;
                        while (M != 0) {
                            if (M instanceof sy0) {
                                sy0 sy0Var = (sy0) M;
                                if (obj.equals(sy0Var.p())) {
                                    return sy0Var;
                                }
                            } else if ((M.f & 262144) != 0 && (M instanceof rl)) {
                                i70 i70Var3 = ((rl) M).s;
                                int i = 0;
                                M = M;
                                a90Var = a90Var;
                                while (i70Var3 != null) {
                                    if ((i70Var3.f & 262144) != 0) {
                                        i++;
                                        a90Var = a90Var;
                                        if (i == 1) {
                                            M = i70Var3;
                                        } else {
                                            if (a90Var == 0) {
                                                a90Var = new a90(new i70[16]);
                                            }
                                            if (M != 0) {
                                                a90Var.b(M);
                                                M = 0;
                                            }
                                            a90Var.b(i70Var3);
                                        }
                                    }
                                    i70Var3 = i70Var3.i;
                                    M = M;
                                    a90Var = a90Var;
                                }
                                if (i == 1) {
                                }
                            }
                            M = pk.m(a90Var);
                        }
                    }
                    i70Var2 = i70Var2.h;
                }
            }
            s20VarAy = s20VarAy.q();
            i70Var2 = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, ql, sy0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [i70] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [i70] */
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
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final sy0 g(sy0 sy0Var) {
        da0 da0Var;
        i70 i70Var = (i70) sy0Var;
        if (!i70Var.d.q) {
            sy.b("visitAncestors called on an unattached node");
        }
        i70 i70Var2 = i70Var.d.h;
        s20 s20VarAy = pk.ay(sy0Var);
        while (s20VarAy != null) {
            if ((((i70) s20VarAy.ag.j).g & 262144) != 0) {
                while (i70Var2 != null) {
                    if ((i70Var2.f & 262144) != 0) {
                        ?? M = i70Var2;
                        ?? a90Var = 0;
                        while (M != 0) {
                            if (M instanceof sy0) {
                                sy0 sy0Var2 = (sy0) M;
                                if (f00.h(sy0Var.p(), sy0Var2.p()) && sy0Var.getClass() == sy0Var2.getClass()) {
                                    return sy0Var2;
                                }
                            } else if ((M.f & 262144) != 0 && (M instanceof rl)) {
                                i70 i70Var3 = ((rl) M).s;
                                int i = 0;
                                M = M;
                                a90Var = a90Var;
                                while (i70Var3 != null) {
                                    if ((i70Var3.f & 262144) != 0) {
                                        i++;
                                        a90Var = a90Var;
                                        if (i == 1) {
                                            M = i70Var3;
                                        } else {
                                            if (a90Var == 0) {
                                                a90Var = new a90(new i70[16]);
                                            }
                                            if (M != 0) {
                                                a90Var.b(M);
                                                M = 0;
                                            }
                                            a90Var.b(i70Var3);
                                        }
                                    }
                                    i70Var3 = i70Var3.i;
                                    M = M;
                                    a90Var = a90Var;
                                }
                                if (i == 1) {
                                }
                            }
                            M = pk.m(a90Var);
                        }
                    }
                    i70Var2 = i70Var2.h;
                }
            }
            s20VarAy = s20VarAy.q();
            i70Var2 = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
        }
        return null;
    }

    public static final em0 h(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            em0 em0Var = tag instanceof em0 ? (em0) tag : null;
            if (em0Var != null) {
                return em0Var;
            }
            Object objH = go0.h(view);
            view = objH instanceof View ? (View) objH : null;
        }
        return null;
    }

    public static final long i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final float j(pj pjVar) {
        p70 p70Var = (p70) pjVar.k(bw.ag);
        float fW = p70Var != null ? p70Var.w() : 1.0f;
        if (fW >= 0.0f) {
            return fW;
        }
        eh0.b("negative scale factor");
        return fW;
    }

    public static final int k(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean l(cw0 cw0Var, boolean z) {
        d20 d20VarC;
        h30 h30Var = cw0Var.d;
        if (h30Var == null || (d20VarC = h30Var.c()) == null) {
            return false;
        }
        ri0 ri0VarP = p(d20VarC);
        long jI = cw0Var.i(z);
        float f = ri0VarP.a;
        float f2 = ri0VarP.c;
        float fD = xa0.d(jI);
        if (f > fD || fD > f2) {
            return false;
        }
        float f3 = ri0VarP.b;
        float f4 = ri0VarP.d;
        float fE = xa0.e(jI);
        return f3 <= fE && fE <= f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, ql, sy0] */
    /* JADX WARN: Type inference failed for: r12v0, types: [cv] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [i70] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [i70] */
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
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void m(sy0 sy0Var, cv cvVar) {
        da0 da0Var;
        i70 i70Var = (i70) sy0Var;
        if (!i70Var.d.q) {
            sy.b("visitAncestors called on an unattached node");
        }
        i70 i70Var2 = i70Var.d.h;
        s20 s20VarAy = pk.ay(sy0Var);
        while (s20VarAy != null) {
            if ((((i70) s20VarAy.ag.j).g & 262144) != 0) {
                while (i70Var2 != null) {
                    if ((i70Var2.f & 262144) != 0) {
                        ?? M = i70Var2;
                        ?? a90Var = 0;
                        while (M != 0) {
                            boolean zBooleanValue = true;
                            if (M instanceof sy0) {
                                sy0 sy0Var2 = (sy0) M;
                                if (f00.h(sy0Var.p(), sy0Var2.p()) && sy0Var.getClass() == sy0Var2.getClass()) {
                                    zBooleanValue = ((Boolean) cvVar.g(sy0Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((M.f & 262144) != 0) && (M instanceof rl)) {
                                    i70 i70Var3 = ((rl) M).s;
                                    int i = 0;
                                    M = M;
                                    a90Var = a90Var;
                                    while (i70Var3 != null) {
                                        if ((i70Var3.f & 262144) != 0) {
                                            i++;
                                            a90Var = a90Var;
                                            if (i == 1) {
                                                M = i70Var3;
                                            } else {
                                                if (a90Var == 0) {
                                                    a90Var = new a90(new i70[16]);
                                                }
                                                if (M != 0) {
                                                    a90Var.b(M);
                                                    M = 0;
                                                }
                                                a90Var.b(i70Var3);
                                            }
                                        }
                                        i70Var3 = i70Var3.i;
                                        M = M;
                                        a90Var = a90Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            M = pk.m(a90Var);
                        }
                    }
                    i70Var2 = i70Var2.h;
                }
            }
            s20VarAy = s20VarAy.q();
            i70Var2 = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, sy0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [cv] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [i70] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [i70] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [a90] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [a90] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void n(sy0 sy0Var, cv cvVar) {
        i70 i70Var = (i70) sy0Var;
        if (!i70Var.d.q) {
            sy.b("visitSubtreeIf called on an unattached node");
        }
        a90 a90Var = new a90(new i70[16]);
        i70 i70Var2 = i70Var.d;
        i70 i70Var3 = i70Var2.i;
        if (i70Var3 == null) {
            pk.j(a90Var, i70Var2);
        } else {
            a90Var.b(i70Var3);
        }
        while (true) {
            int i = a90Var.f;
            if (i == 0) {
                return;
            }
            i70 i70Var4 = (i70) a90Var.j(i - 1);
            if ((i70Var4.g & 262144) != 0) {
                for (i70 i70Var5 = i70Var4; i70Var5 != null; i70Var5 = i70Var5.i) {
                    if ((i70Var5.f & 262144) != 0) {
                        ?? M = i70Var5;
                        ?? a90Var2 = 0;
                        while (M != 0) {
                            if (M instanceof sy0) {
                                sy0 sy0Var2 = (sy0) M;
                                ry0 ry0Var = (f00.h(sy0Var.p(), sy0Var2.p()) && sy0Var.getClass() == sy0Var2.getClass()) ? (ry0) cvVar.g(sy0Var2) : ry0.d;
                                if (ry0Var == ry0.f) {
                                    return;
                                }
                                if (ry0Var == ry0.e) {
                                    break;
                                }
                            } else if ((M.f & 262144) != 0 && (M instanceof rl)) {
                                i70 i70Var6 = ((rl) M).s;
                                int i2 = 0;
                                M = M;
                                a90Var2 = a90Var2;
                                while (i70Var6 != null) {
                                    if ((i70Var6.f & 262144) != 0) {
                                        i2++;
                                        a90Var2 = a90Var2;
                                        if (i2 == 1) {
                                            M = i70Var6;
                                        } else {
                                            if (a90Var2 == 0) {
                                                a90Var2 = new a90(new i70[16]);
                                            }
                                            if (M != 0) {
                                                a90Var2.b(M);
                                                M = 0;
                                            }
                                            a90Var2.b(i70Var6);
                                        }
                                    }
                                    i70Var6 = i70Var6.i;
                                    M = M;
                                    a90Var2 = a90Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M = pk.m(a90Var2);
                        }
                    }
                }
            }
            pk.j(a90Var, i70Var4);
        }
    }

    public static final void o(p5 p5Var, r5 r5Var) {
        r5Var.e.setValue(p5Var.e.getValue());
        w5 w5Var = r5Var.f;
        w5 w5Var2 = p5Var.f;
        int iB = w5Var.b();
        for (int i = 0; i < iB; i++) {
            w5Var.e(w5Var2.a(i), i);
        }
        r5Var.h = p5Var.h;
        r5Var.g = p5Var.g;
        r5Var.i = ((Boolean) p5Var.i.getValue()).booleanValue();
    }

    public static final ri0 p(d20 d20Var) {
        ri0 ri0VarN = i60.n(d20Var);
        float f = ri0VarN.a;
        long jH = d20Var.h((((long) Float.floatToRawIntBits(ri0VarN.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        long jH2 = d20Var.h((((long) Float.floatToRawIntBits(ri0VarN.c)) << 32) | (((long) Float.floatToRawIntBits(ri0VarN.d)) & 4294967295L));
        return new ri0(Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH & 4294967295L)), Float.intBitsToFloat((int) (jH2 >> 32)), Float.intBitsToFloat((int) (jH2 & 4294967295L)));
    }
}

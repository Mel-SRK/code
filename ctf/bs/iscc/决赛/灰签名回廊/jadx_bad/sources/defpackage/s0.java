package defpackage;

import android.view.KeyEvent;
import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i, Object obj, Object obj2) {
        super(0);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [i70] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [i70] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [a90] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [a90] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // defpackage.pu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        uo0 uo0Var;
        s20 s20Var;
        long jH;
        long j;
        ax0 ax0VarD;
        h30 h30Var;
        b6 b6Var;
        int i = this.e;
        int i2 = 1;
        wz0 wz0Var = wz0.a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            case 1:
                k1 k1Var = (k1) obj;
                tm0 tm0Var = (tm0) obj2;
                qm0 qm0Var = tm0Var.h;
                qm0 qm0Var2 = tm0Var.i;
                Float f = tm0Var.f;
                Float f2 = tm0Var.g;
                float fFloatValue = (qm0Var == null || f == null) ? 0.0f : ((Number) qm0Var.a.a()).floatValue() - f.floatValue();
                float fFloatValue2 = (qm0Var2 == null || f2 == null) ? 0.0f : ((Number) qm0Var2.a.a()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iS = k1Var.s(tm0Var.d);
                    xo0 xo0Var = (xo0) k1Var.l().b(k1Var.n);
                    if (xo0Var != null) {
                        try {
                            ba baVar = k1Var.p;
                            if (baVar != null) {
                                baVar.a.setBoundsInScreen(k1Var.c(xo0Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    xo0 xo0Var2 = (xo0) k1Var.l().b(k1Var.o);
                    if (xo0Var2 != null) {
                        try {
                            ba baVar2 = k1Var.q;
                            if (baVar2 != null) {
                                baVar2.a.setBoundsInScreen(k1Var.c(xo0Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    k1Var.d.invalidate();
                    xo0 xo0Var3 = (xo0) k1Var.l().b(iS);
                    if (xo0Var3 != null && (uo0Var = xo0Var3.a) != null && (s20Var = uo0Var.c) != null) {
                        if (qm0Var != null) {
                            k1Var.s.g(iS, qm0Var);
                        }
                        if (qm0Var2 != null) {
                            k1Var.t.g(iS, qm0Var2);
                        }
                        k1Var.o(s20Var);
                    }
                }
                if (qm0Var != null) {
                    tm0Var.f = (Float) qm0Var.a.a();
                }
                if (qm0Var2 != null) {
                    tm0Var.g = (Float) qm0Var2.a.a();
                }
                return wz0Var;
            case 2:
                ((ya) obj2).u(obj);
                return wz0Var;
            case 3:
                lw0 lw0Var = (lw0) obj2;
                w80 w80Var = (w80) obj;
                if (!hx0.a(lw0Var.b, ((lw0) w80Var.getValue()).b) || !f00.h(lw0Var.c, ((lw0) w80Var.getValue()).c)) {
                    w80Var.setValue(lw0Var);
                }
                return wz0Var;
            case 4:
                ((x9) obj2).t.g((y9) obj);
                return wz0Var;
            case 5:
                ((h30) obj2).u.g(new dy(((ey) obj).e));
                return Boolean.TRUE;
            case 6:
                h30 h30Var2 = (h30) obj2;
                ys ysVar = (ys) obj;
                if (h30Var2.b()) {
                    sr0 sr0Var = h30Var2.c;
                    if (sr0Var != null) {
                        ((sl) sr0Var).b();
                    }
                } else {
                    ysVar.getClass();
                    ysVar.a(new yv0(i2, 25));
                }
                return Boolean.TRUE;
            case 7:
                ((xi0) obj2).d = ((gt) obj).bv();
                return wz0Var;
            case MainActivity.$stable /* 8 */:
                ((xi0) obj2).d = i60.ab((mt) obj, jf0.a);
                return wz0Var;
            case 9:
                ((mx) obj2).d((i70) obj);
                return wz0Var;
            case 10:
                da0 da0Var = ((s20) obj2).ag;
                xi0 xi0Var = (xi0) obj;
                if ((((i70) da0Var.j).g & 8) != 0) {
                    for (i70 i70Var = (hu0) da0Var.i; i70Var != null; i70Var = i70Var.h) {
                        if ((i70Var.f & 8) != 0) {
                            ?? M = i70Var;
                            ?? a90Var = 0;
                            while (M != 0) {
                                if (M instanceof so0) {
                                    so0 so0Var = (so0) M;
                                    if (so0Var.ax()) {
                                        po0 po0Var = new po0();
                                        xi0Var.d = po0Var;
                                        po0Var.g = true;
                                    }
                                    if (so0Var.az()) {
                                        ((po0) xi0Var.d).f = true;
                                    }
                                    so0Var.ag((po0) xi0Var.d);
                                } else if ((M.f & 8) != 0 && (M instanceof rl)) {
                                    i70 i70Var2 = ((rl) M).s;
                                    int i3 = 0;
                                    M = M;
                                    a90Var = a90Var;
                                    while (i70Var2 != null) {
                                        if ((i70Var2.f & 8) != 0) {
                                            i3++;
                                            a90Var = a90Var;
                                            if (i3 == 1) {
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
                                    if (i3 == 1) {
                                    }
                                }
                                M = pk.m(a90Var);
                            }
                        }
                    }
                }
                return wz0Var;
            case 11:
                q50 q50Var = (q50) obj2;
                v20 v20Var = q50Var.i;
                v20Var.g = 0;
                a90 a90VarU = v20Var.a.u();
                Object[] objArr = a90VarU.d;
                int i4 = a90VarU.f;
                for (int i5 = 0; i5 < i4; i5++) {
                    q50 q50Var2 = ((s20) objArr[i5]).ah.p;
                    q50Var2.getClass();
                    q50Var2.k = q50Var2.l;
                    q50Var2.l = Integer.MAX_VALUE;
                    if (q50Var2.m == q20.e) {
                        q50Var2.m = q20.f;
                    }
                }
                s20 s20Var2 = v20Var.a;
                s20 s20Var3 = v20Var.a;
                a90 a90VarU2 = s20Var2.u();
                Object[] objArr2 = a90VarU2.d;
                int i6 = a90VarU2.f;
                for (int i7 = 0; i7 < i6; i7++) {
                    q50 q50Var3 = ((s20) objArr2[i7]).ah.p;
                    q50Var3.getClass();
                    q50Var3.t.getClass();
                }
                xy xyVar = q50Var.p().as;
                if (xyVar != null) {
                    boolean z = xyVar.n;
                    x80 x80Var = (x80) s20Var3.k();
                    int i8 = x80Var.d.f;
                    for (int i9 = 0; i9 < i8; i9++) {
                        l50 l50VarB = ((fa0) ((s20) x80Var.get(i9)).ag.h).B();
                        if (l50VarB != null) {
                            l50VarB.n = z;
                        }
                    }
                }
                ((l50) obj).br().b();
                if (q50Var.p().as != null) {
                    x80 x80Var2 = (x80) s20Var3.k();
                    int i10 = x80Var2.d.f;
                    for (int i11 = 0; i11 < i10; i11++) {
                        l50 l50VarB2 = ((fa0) ((s20) x80Var2.get(i11)).ag.h).B();
                        if (l50VarB2 != null) {
                            l50VarB2.n = false;
                        }
                    }
                }
                a90 a90VarU3 = s20Var3.u();
                Object[] objArr3 = a90VarU3.d;
                int i12 = a90VarU3.f;
                for (int i13 = 0; i13 < i12; i13++) {
                    q50 q50Var4 = ((s20) objArr3[i13]).ah.p;
                    q50Var4.getClass();
                    int i14 = q50Var4.k;
                    int i15 = q50Var4.l;
                    if (i14 != i15 && i15 == Integer.MAX_VALUE) {
                        q50Var4.bi(true);
                    }
                }
                a90 a90VarU4 = s20Var3.u();
                Object[] objArr4 = a90VarU4.d;
                int i16 = a90VarU4.f;
                for (int i17 = 0; i17 < i16; i17++) {
                    q50 q50Var5 = ((s20) objArr4[i17]).ah.p;
                    q50Var5.getClass();
                    t20 t20Var = q50Var5.t;
                    t20Var.getClass();
                    t20Var.c = false;
                }
                return wz0Var;
            case 12:
                ri0 ri0Var = (ri0) obj2;
                if (ri0Var != null) {
                    return ri0Var;
                }
                fa0 fa0Var = (fa0) obj;
                if (!fa0Var.D().q) {
                    fa0Var = null;
                }
                if (fa0Var != null) {
                    return e00.h(0L, e00.an(fa0Var.f));
                }
                return null;
            default:
                cw0 cw0Var = (cw0) obj2;
                long j2 = ((wz) ((w80) obj).getValue()).a;
                xa0 xa0VarG = cw0Var.g();
                if (xa0VarG != null) {
                    long j3 = xa0VarG.a;
                    h30 h30Var3 = cw0Var.d;
                    b6 b6Var2 = h30Var3 != null ? h30Var3.a.a : null;
                    if (b6Var2 == null || b6Var2.e.length() == 0) {
                        jH = 9205357640488583168L;
                    } else {
                        vw vwVar = (vw) cw0Var.o.getValue();
                        int i18 = vwVar == null ? -1 : ew0.a[vwVar.ordinal()];
                        if (i18 != -1) {
                            if (i18 == 1 || i18 == 2) {
                                long j4 = cw0Var.j().b;
                                int i19 = hx0.c;
                                j = j4 >> 32;
                            } else {
                                if (i18 != 3) {
                                    wc.l();
                                    return null;
                                }
                                long j5 = cw0Var.j().b;
                                int i20 = hx0.c;
                                j = j5 & 4294967295L;
                            }
                            int i21 = (int) j;
                            h30 h30Var4 = cw0Var.d;
                            if (h30Var4 != null && (ax0VarD = h30Var4.d()) != null && (h30Var = cw0Var.d) != null && (b6Var = h30Var.a.a) != null) {
                                int iT = i60.t(cw0Var.b.d(i21), 0, b6Var.e.length());
                                float fD = xa0.d(ax0VarD.d(j3));
                                zw0 zw0Var = ax0VarD.a;
                                int iE = zw0Var.e(iT);
                                y70 y70Var = zw0Var.b;
                                float f3 = zw0Var.f(iE);
                                float fG = zw0Var.g(iE);
                                float fS = i60.s(fD, Math.min(f3, fG), Math.max(f3, fG));
                                if (wz.a(j2, 0L) || Math.abs(fD - fS) <= ((int) (j2 >> 32)) / 2) {
                                    float fD2 = y70Var.d(iE);
                                    jH = d41.h(fS, ((y70Var.b(iE) - fD2) / 2) + fD2);
                                }
                            }
                        }
                    }
                }
                return new xa0(jH);
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class g5 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g5(gt gtVar, us usVar, cv cvVar) {
        super(1);
        this.e = 5;
        this.f = gtVar;
        this.g = usVar;
        this.h = (x10) cvVar;
    }

    /* JADX WARN: Type inference failed for: r0v86, types: [cv, x10] */
    /* JADX WARN: Type inference failed for: r15v3, types: [pu, x10] */
    @Override // defpackage.cv
    public final Object g(Object obj) {
        boolean zBooleanValue;
        switch (this.e) {
            case 0:
                p5 p5Var = (p5) obj;
                j5 j5Var = (j5) this.f;
                lI.o(p5Var, j5Var.c);
                me0 me0Var = p5Var.e;
                Object objA = j5.a(j5Var, me0Var.getValue());
                if (!f00.h(objA, me0Var.getValue())) {
                    j5Var.c.e.setValue(objA);
                    ((r5) this.g).e.setValue(objA);
                    p5Var.i.setValue(Boolean.FALSE);
                    p5Var.d.a();
                    ((ti0) this.h).d = true;
                }
                return wz0.a;
            case 1:
                lw0 lw0Var = (lw0) obj;
                ((w80) this.g).setValue(lw0Var);
                w80 w80Var = (w80) this.h;
                boolean zH = f00.h((String) w80Var.getValue(), lw0Var.a.e);
                b6 b6Var = lw0Var.a;
                w80Var.setValue(b6Var.e);
                if (!zH) {
                    ((cv) this.f).g(b6Var.e);
                }
                return wz0.a;
            case 2:
                float fFloatValue = ((Number) obj).floatValue();
                lh lhVar = (lh) this.f;
                float f = lhVar.t ? 1.0f : -1.0f;
                rn0 rn0Var = lhVar.s;
                pn0 pn0Var = (pn0) this.h;
                long jD = rn0Var.d(rn0Var.g(f * fFloatValue));
                rn0 rn0Var2 = pn0Var.a;
                float f2 = rn0Var.f(rn0Var.d(rn0.a(rn0Var2, rn0Var2.h, jD, 1))) * f;
                if (Math.abs(f2) < Math.abs(fFloatValue)) {
                    t00 t00Var = (t00) this.g;
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + f2 + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    t00Var.a(cancellationException);
                }
                return wz0.a;
            case 3:
                xo xoVar = (xo) obj;
                h30 h30Var = (h30) this.f;
                ax0 ax0VarD = h30Var.d();
                if (ax0VarD != null) {
                    long j = ((lw0) this.g).b;
                    ab0 ab0Var = (ab0) this.h;
                    oa oaVarO = xoVar.aa().o();
                    long j2 = ((hx0) h30Var.x.getValue()).a;
                    long j3 = ((hx0) h30Var.y.getValue()).a;
                    zw0 zw0Var = ax0VarD.a;
                    y70 y70Var = zw0Var.b;
                    yw0 yw0Var = zw0Var.a;
                    l3 l3Var = h30Var.v;
                    long j4 = h30Var.w;
                    if (!hx0.b(j2)) {
                        l3Var.e(j4);
                        int iD = ab0Var.d(hx0.e(j2));
                        int iD2 = ab0Var.d(hx0.d(j2));
                        if (iD != iD2) {
                            oaVarO.g(zw0Var.j(iD, iD2), l3Var);
                        }
                    } else if (!hx0.b(j3)) {
                        long jB = yw0Var.b.b();
                        qc qcVar = new qc(jB);
                        if (jB == 16) {
                            qcVar = null;
                        }
                        long j5 = qcVar != null ? qcVar.a : qc.b;
                        l3Var.e(qc.b(j5, qc.d(j5) * 0.2f));
                        int iD3 = ab0Var.d(hx0.e(j3));
                        int iD4 = ab0Var.d(hx0.d(j3));
                        if (iD3 != iD4) {
                            oaVarO.g(zw0Var.j(iD3, iD4), l3Var);
                        }
                    } else if (!hx0.b(j)) {
                        l3Var.e(j4);
                        int iD5 = ab0Var.d(hx0.e(j));
                        int iD6 = ab0Var.d(hx0.d(j));
                        if (iD5 != iD6) {
                            oaVarO.g(zw0Var.j(iD5, iD6), l3Var);
                        }
                    }
                    long j6 = zw0Var.c;
                    float f3 = (int) (j6 >> 32);
                    y70 y70Var2 = zw0Var.b;
                    boolean z = ((f3 > y70Var2.d ? 1 : (f3 == y70Var2.d ? 0 : -1)) < 0 || y70Var2.c || (((float) ((int) (j6 & 4294967295L))) > y70Var2.e ? 1 : (((float) ((int) (j6 & 4294967295L))) == y70Var2.e ? 0 : -1)) < 0) && yw0Var.f != 3;
                    if (z) {
                        long j7 = zw0Var.c;
                        ri0 ri0VarH = e00.h(0L, (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32));
                        oaVarO.l();
                        oa.k(oaVarO, ri0VarH);
                    }
                    yr0 yr0Var = yw0Var.b.a;
                    bv0 bv0Var = yr0Var.m;
                    nw0 nw0Var = yr0Var.a;
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
                    try {
                        i9 i9VarC = nw0Var.c();
                        mw0 mw0Var = mw0.a;
                        if (i9VarC != null) {
                            y70.g(y70Var, oaVarO, i9VarC, nw0Var != mw0Var ? nw0Var.a() : 1.0f, yp0Var2, bv0Var2, yoVar2);
                        } else {
                            long jB2 = nw0Var != mw0Var ? nw0Var.b() : qc.b;
                            oaVarO.l();
                            ArrayList arrayList = y70Var.h;
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                ce0 ce0Var = (ce0) arrayList.get(i);
                                ce0Var.a.f(oaVarO, jB2, yp0Var2, bv0Var2, yoVar2);
                                oaVarO.f(0.0f, ce0Var.a.b());
                            }
                            oaVarO.i();
                        }
                        if (z) {
                            oaVarO.i();
                        }
                    } finally {
                    }
                }
                return wz0.a;
            case 4:
                sy0 sy0Var = (sy0) obj;
                sn snVar = (sn) sy0Var;
                if (!((s2) pk.az((sn) this.g).getDragAndDropManager()).b.contains(snVar) || !az0.i(snVar, d41.z((bu) this.h))) {
                    return ry0.d;
                }
                ((xi0) this.f).d = sy0Var;
                return ry0.f;
            case 5:
                gt gtVar = (gt) obj;
                if (f00.h(gtVar, (gt) this.f)) {
                    zBooleanValue = false;
                } else {
                    if (f00.h(gtVar, ((us) this.g).c)) {
                        wc.q("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((x10) this.h).g(gtVar)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 6:
                kf0 kf0Var = (kf0) obj;
                r60 r60Var = (r60) this.h;
                vd0 vd0Var = (vd0) this.f;
                boolean z2 = vd0Var.v;
                lf0 lf0Var = (lf0) this.g;
                float f4 = vd0Var.r;
                if (z2) {
                    kf0.j(kf0Var, lf0Var, r60Var.ai(f4), r60Var.ai(vd0Var.s));
                } else {
                    kf0.h(kf0Var, lf0Var, r60Var.ai(f4), r60Var.ai(vd0Var.s));
                }
                return wz0.a;
            case 7:
                lf0 lf0Var2 = (lf0) this.f;
                r60 r60Var2 = (r60) this.g;
                xd0 xd0Var = (xd0) this.h;
                kf0.h((kf0) obj, lf0Var2, r60Var2.ai(xd0Var.r.a(r60Var2.getLayoutDirection())), r60Var2.ai(xd0Var.r.b));
                return wz0.a;
            default:
                f1 f1Var = (f1) this.f;
                cv cvVar = (cv) this.g;
                uw0 uw0Var = (uw0) ((xi0) this.h).d;
                lw0 lw0VarN = f1Var.n((List) obj);
                if (uw0Var != null) {
                    uw0Var.a(null, lw0VarN);
                }
                cvVar.g(lw0VarN);
                return wz0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}

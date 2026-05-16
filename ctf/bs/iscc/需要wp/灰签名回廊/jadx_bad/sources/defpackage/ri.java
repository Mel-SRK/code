package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ri implements p60 {
    public final /* synthetic */ h30 a;
    public final /* synthetic */ cv b;
    public final /* synthetic */ lw0 c;
    public final /* synthetic */ ab0 d;
    public final /* synthetic */ em e;
    public final /* synthetic */ int f;

    public ri(h30 h30Var, cv cvVar, lw0 lw0Var, ab0 ab0Var, em emVar, int i) {
        this.a = h30Var;
        this.b = cvVar;
        this.c = lw0Var;
        this.d = ab0Var;
        this.e = emVar;
        this.f = i;
    }

    @Override // defpackage.p60
    public final int d(a00 a00Var, List list, int i) {
        h30 h30Var = this.a;
        h30Var.a.a(a00Var.getLayoutDirection());
        g20 g20Var = h30Var.a.j;
        if (g20Var != null) {
            return wo0.d(g20Var.c());
        }
        wc.q("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0245 A[LOOP:0: B:92:0x0243->B:93:0x0245, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025a  */
    @Override // defpackage.p60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q60 g(r60 r60Var, List list, long j) {
        long j2;
        h30 h30Var;
        zw0 zw0Var;
        zw0 zw0Var2;
        ax0 ax0Var;
        int i;
        zw0 zw0Var3;
        ri riVar;
        h30 h30Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        int iJ;
        int iH;
        g20 g20Var;
        h30 h30Var3 = this.a;
        xq0 xq0Var = (xq0) fr0.b.n();
        cv cvVarE = xq0Var != null ? xq0Var.e() : null;
        xq0 xq0VarN = q6.n(xq0Var);
        try {
            ax0 ax0VarD = h30Var3.d();
            zw0 zw0Var4 = ax0VarD != null ? ax0VarD.a : null;
            dv0 dv0Var = h30Var3.a;
            e20 layoutDirection = r60Var.getLayoutDirection();
            int i6 = dv0Var.f;
            boolean z = dv0Var.e;
            int i7 = dv0Var.c;
            if (zw0Var4 != null) {
                y70 y70Var = zw0Var4.b;
                yw0 yw0Var = zw0Var4.a;
                b6 b6Var = dv0Var.a;
                nx0 nx0Var = dv0Var.b;
                List list2 = dv0Var.i;
                em emVar = dv0Var.g;
                qt qtVar = dv0Var.h;
                zw0 zw0Var5 = zw0Var4;
                if (y70Var.a.b()) {
                    j2 = j;
                    h30Var = h30Var3;
                } else {
                    b6 b6Var2 = yw0Var.a;
                    h30Var = h30Var3;
                    long j3 = yw0Var.j;
                    if (f00.h(b6Var2, b6Var) && yw0Var.b.c(nx0Var) && f00.h(yw0Var.c, list2) && yw0Var.d == i7 && yw0Var.e == z && yw0Var.f == i6 && f00.h(yw0Var.g, emVar) && yw0Var.h == layoutDirection && f00.h(yw0Var.i, qtVar) && dh.j(j) == dh.j(j3)) {
                        if ((!z && i6 != 2) || (dh.h(j) == dh.h(j3) && dh.g(j) == dh.g(j3))) {
                            i = 2;
                            zw0Var3 = new zw0(new yw0(yw0Var.a, dv0Var.b, yw0Var.c, yw0Var.d, yw0Var.e, yw0Var.f, yw0Var.g, yw0Var.h, yw0Var.i, j), y70Var, eh.d(j, e00.f(wo0.d(y70Var.d), wo0.d(y70Var.e))));
                            zw0Var2 = zw0Var5;
                            ax0Var = ax0VarD;
                            long j4 = zw0Var3.c;
                            Integer numValueOf = Integer.valueOf((int) (j4 >> 32));
                            Integer numValueOf2 = Integer.valueOf((int) (j4 & 4294967295L));
                            int iIntValue = numValueOf.intValue();
                            int iIntValue2 = numValueOf2.intValue();
                            if (f00.h(zw0Var2, zw0Var3)) {
                            }
                            h30Var2.g.setValue(new mn(riVar.e.be(riVar.f == 1 ? wo0.d(zw0Var3.b.b(i2)) : i2)));
                            ae0[] ae0VarArr = {new ae0(O1.a, Integer.valueOf(Math.round(zw0Var3.d))), new ae0(O1.b, Integer.valueOf(Math.round(zw0Var3.e)))};
                            LinkedHashMap linkedHashMap = new LinkedHashMap(f00.aa(i));
                            i4 = i;
                            while (i3 < i4) {
                            }
                            return r60Var.av(iIntValue, iIntValue2, linkedHashMap, q0.x);
                        }
                        j2 = j;
                        i5 = 2;
                        zw0Var = zw0Var5;
                        dv0Var.a(layoutDirection);
                        iJ = dh.j(j2);
                        iH = ((z || i6 == i5) && dh.d(j2)) ? dh.h(j2) : Integer.MAX_VALUE;
                        int i8 = (z || i6 != i5) ? i7 : 1;
                        if (iJ != iH) {
                            g20 g20Var2 = dv0Var.j;
                            if (g20Var2 == null) {
                                wc.q("layoutIntrinsics must be called first");
                                return null;
                            }
                            iH = i60.t(wo0.d(g20Var2.c()), iJ, iH);
                        }
                        g20Var = dv0Var.j;
                        if (g20Var != null) {
                            wc.q("layoutIntrinsics must be called first");
                            return null;
                        }
                        y70 y70Var2 = new y70(g20Var, t1.q(0, iH, 0, dh.g(j2)), i8, i6 == i5);
                        i = i5;
                        zw0Var2 = zw0Var;
                        ax0Var = ax0VarD;
                        zw0Var3 = new zw0(new yw0(dv0Var.a, dv0Var.b, dv0Var.i, dv0Var.c, dv0Var.e, dv0Var.f, dv0Var.g, layoutDirection, dv0Var.h, j2), y70Var2, eh.d(j2, e00.f(wo0.d(y70Var2.d), wo0.d(y70Var2.e))));
                        long j42 = zw0Var3.c;
                        Integer numValueOf3 = Integer.valueOf((int) (j42 >> 32));
                        Integer numValueOf22 = Integer.valueOf((int) (j42 & 4294967295L));
                        int iIntValue3 = numValueOf3.intValue();
                        int iIntValue22 = numValueOf22.intValue();
                        if (f00.h(zw0Var2, zw0Var3)) {
                            riVar = this;
                            h30Var2 = h30Var;
                            i2 = 0;
                        } else {
                            h30Var2 = h30Var;
                            h30Var2.i.setValue(new ax0(zw0Var3, ax0Var != null ? ax0Var.c : null));
                            i2 = 0;
                            h30Var2.p = false;
                            riVar = this;
                            riVar.b.g(zw0Var3);
                            az0.y(h30Var2, riVar.c, riVar.d);
                        }
                        h30Var2.g.setValue(new mn(riVar.e.be(riVar.f == 1 ? wo0.d(zw0Var3.b.b(i2)) : i2)));
                        ae0[] ae0VarArr2 = {new ae0(O1.a, Integer.valueOf(Math.round(zw0Var3.d))), new ae0(O1.b, Integer.valueOf(Math.round(zw0Var3.e)))};
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(f00.aa(i));
                        i4 = i;
                        for (i3 = i2; i3 < i4; i3++) {
                            ae0 ae0Var = ae0VarArr2[i3];
                            linkedHashMap2.put(ae0Var.d, ae0Var.e);
                        }
                        return r60Var.av(iIntValue3, iIntValue22, linkedHashMap2, q0.x);
                    }
                    j2 = j;
                }
                zw0Var = zw0Var5;
            } else {
                j2 = j;
                h30Var = h30Var3;
                zw0Var = zw0Var4;
            }
            i5 = 2;
            dv0Var.a(layoutDirection);
            iJ = dh.j(j2);
            if (z) {
                if (z) {
                }
            } else if (z) {
                if (iJ != iH) {
                }
                g20Var = dv0Var.j;
                if (g20Var != null) {
                }
            }
            long j422 = zw0Var3.c;
            Integer numValueOf32 = Integer.valueOf((int) (j422 >> 32));
            Integer numValueOf222 = Integer.valueOf((int) (j422 & 4294967295L));
            int iIntValue32 = numValueOf32.intValue();
            int iIntValue222 = numValueOf222.intValue();
            if (f00.h(zw0Var2, zw0Var3)) {
            }
            h30Var2.g.setValue(new mn(riVar.e.be(riVar.f == 1 ? wo0.d(zw0Var3.b.b(i2)) : i2)));
            ae0[] ae0VarArr22 = {new ae0(O1.a, Integer.valueOf(Math.round(zw0Var3.d))), new ae0(O1.b, Integer.valueOf(Math.round(zw0Var3.e)))};
            LinkedHashMap linkedHashMap22 = new LinkedHashMap(f00.aa(i));
            i4 = i;
            while (i3 < i4) {
            }
            return r60Var.av(iIntValue32, iIntValue222, linkedHashMap22, q0.x);
        } finally {
            q6.q(xq0Var, xq0VarN, cvVarE);
        }
    }
}

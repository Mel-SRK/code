package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.Base64;
import android.util.LongSparseArray;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.example.gnd.security.SecureValidator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e00 {
    public static final o6 m;
    public static o6 n;
    public static final s5 a = new s5(Float.POSITIVE_INFINITY);
    public static final t5 b = new t5(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final u5 c = new u5(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final v5 d = new v5(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final s5 e = new s5(Float.NEGATIVE_INFINITY);
    public static final t5 f = new t5(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final u5 g = new u5(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final v5 h = new v5(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final int[] i = new int[0];
    public static final long[] j = new long[0];
    public static final Object[] k = new Object[0];
    public static final fy l = new fy(false);
    public static final byte[] o = {48, 49, 53, 0};
    public static final byte[] p = {48, 49, 48, 0};
    public static final byte[] q = {48, 48, 57, 0};
    public static final byte[] r = {48, 48, 53, 0};
    public static final byte[] s = {48, 48, 49, 0};
    public static final byte[] t = {48, 48, 49, 0};
    public static final byte[] u = {48, 48, 50, 0};
    public static final Object v = new Object();
    public static final yf0 w = new yf0(23);

    static {
        Object obj = null;
        m = new o6(obj, obj, obj);
    }

    public static j5 a() {
        return new j5(Float.valueOf(0.0f), k01.a, Float.valueOf(0.01f), 8);
    }

    public static final ss0 aa(pr0 pr0Var) {
        ss0 ss0Var = pr0Var.d;
        ss0Var.getClass();
        return (ss0) fr0.t(ss0Var, pr0Var);
    }

    public static final int ab(pr0 pr0Var) {
        ss0 ss0Var = pr0Var.d;
        ss0Var.getClass();
        return ((ss0) fr0.i(ss0Var)).e;
    }

    public static x20 ac(pu puVar) {
        bw bwVar = bw.ax;
        c01 c01Var = new c01();
        c01Var.d = puVar;
        c01Var.e = bwVar;
        return c01Var;
    }

    public static au0 ad(pu puVar) {
        puVar.getClass();
        return new au0(puVar);
    }

    public static final boolean ae(pr0 pr0Var, cv cvVar) {
        int i2;
        w wVar;
        Object objG;
        xq0 xq0VarK;
        boolean zL;
        do {
            synchronized (v) {
                ss0 ss0Var = pr0Var.d;
                ss0Var.getClass();
                ss0 ss0Var2 = (ss0) fr0.i(ss0Var);
                i2 = ss0Var2.d;
                wVar = ss0Var2.c;
            }
            wVar.getClass();
            gf0 gf0VarE = wVar.e();
            objG = cvVar.g(gf0VarE);
            w wVarC = gf0VarE.c();
            if (f00.h(wVarC, wVar)) {
                break;
            }
            ss0 ss0Var3 = pr0Var.d;
            ss0Var3.getClass();
            synchronized (fr0.c) {
                xq0VarK = fr0.k();
                zL = l((ss0) fr0.w(ss0Var3, pr0Var, xq0VarK), i2, wVarC, true);
            }
            fr0.n(xq0VarK, pr0Var);
        } while (!zL);
        return ((Boolean) objG).booleanValue();
    }

    public static List af(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final View ag(ql qlVar) {
        if (!((i70) qlVar).d.q) {
            sy.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return t1.as(pk.ay(qlVar));
    }

    public static final void ah(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255));
    }

    public static final void ai(uo0 uo0Var, ba baVar) {
        Object objG = uo0Var.k().d.g(zo0.f);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            wc.c();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = uo0Var.k().d.g(zo0.e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listJ = uo0.j(4, uo0Var);
            int size = listJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                uo0 uo0Var2 = (uo0) listJ.get(i2);
                if (uo0Var2.k().d.c(zo0.ag)) {
                    arrayList.add(uo0Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zP = p(arrayList);
        baVar.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zP ? 1 : arrayList.size(), zP ? arrayList.size() : 1, false, 0));
    }

    public static final void aj(vc0 vc0Var, int i2, Object obj) {
        vc0Var.o[(vc0Var.p - vc0Var.k[vc0Var.l - 1].b) + i2] = obj;
    }

    public static final void ak(vc0 vc0Var, int i2, Object obj, int i3, Object obj2) {
        int i4 = vc0Var.p - vc0Var.k[vc0Var.l - 1].b;
        Object[] objArr = vc0Var.o;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    public static final fi0 am(bu buVar, ii iiVar, ls0 ls0Var, Float f2) {
        ya.a.getClass();
        xa xaVar = xa.a;
        f1 f1Var = new f1(18, buVar, pq.d);
        ps0 ps0VarE = i60.e(f2);
        pj pjVar = (pj) f1Var.f;
        yr yrVar = (yr) f1Var.e;
        ck ckVar = ls0Var.equals(kq0.a) ? ck.d : ck.g;
        j3 j3Var = new j3(ls0Var, yrVar, ps0VarE, f2, null, 5);
        pj pjVarZ = z(iiVar.f(), pjVar, true);
        kl klVar = wm.a;
        if (pjVarZ != klVar && pjVarZ.k(bw.u) == null) {
            pjVarZ = pjVarZ.j(klVar);
        }
        l y20Var = ckVar == ck.e ? new y20(pjVarZ, j3Var) : new hs0(pjVarZ, true);
        y20Var.bg(ckVar, y20Var, j3Var);
        return new fi0(ps0VarE);
    }

    public static final long an(long j2) {
        return (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [di0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList ao(rq0 rq0Var, int i2, Integer num) {
        ?? di0Var = new di0(rq0Var);
        int iQ = rq0Var.q(i2);
        Il ilA = rq0Var.a(i2);
        while (i2 >= 0) {
            di0Var.b(rq0Var.a.f(i2), num);
            if (iQ >= 0) {
                Il il = ilA;
                ilA = rq0Var.a(iQ);
                i2 = iQ;
                iQ = rq0Var.q(iQ);
                num = il;
            } else {
                i2 = iQ;
                num = ilA;
            }
        }
        return di0Var.a;
    }

    public static final uz0 ap(ji jiVar, pj pjVar, Object obj) {
        uz0 uz0Var = null;
        if ((jiVar instanceof zj) && pjVar.k(na.f) != null) {
            zj zjVarD = (zj) jiVar;
            while (true) {
                if ((zjVarD instanceof tm) || (zjVarD = zjVarD.d()) == null) {
                    break;
                }
                if (zjVarD instanceof uz0) {
                    uz0Var = (uz0) zjVarD;
                    break;
                }
            }
            if (uz0Var != null) {
                uz0Var.bi(pjVar, obj);
            }
        }
        return uz0Var;
    }

    public static final int aq(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static final void b(zh zhVar, pu puVar, j70 j70Var, a2 a2Var, vf vfVar, int i2) {
        int i3;
        vfVar.aw(645832757);
        if ((i2 & 6) == 0) {
            i3 = (vfVar.f(zhVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vfVar.h(puVar) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= vfVar.h(a2Var) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && vfVar.z()) {
            vfVar.aq();
        } else {
            yh yhVar = (yh) zhVar.a.getValue();
            if (!(yhVar instanceof xh)) {
                hi0 hi0VarS = vfVar.s();
                if (hi0VarS != null) {
                    hi0VarS.d = new j4(zhVar, puVar, a2Var, i2);
                    return;
                }
                return;
            }
            boolean zF = vfVar.f(yhVar);
            Object objAk = vfVar.ak();
            if (zF || objAk == nf.a) {
                objAk = new th(t1.au(((xh) yhVar).a));
                vfVar.be(objAk);
            }
            fi.c((th) objAk, puVar, a2Var, vfVar, i4 & 8176);
            j70Var = g70.a;
        }
        j70 j70Var2 = j70Var;
        hi0 hi0VarS2 = vfVar.s();
        if (hi0VarS2 != null) {
            hi0VarS2.d = new ph(zhVar, puVar, j70Var2, a2Var, i2);
        }
    }

    public static final void c(zh zhVar, pu puVar, a2 a2Var, j70 j70Var, boolean z, te teVar, vf vfVar, int i2) {
        int i3;
        a2 a2Var2;
        j70 j70Var2;
        vfVar.aw(-84584070);
        if ((i2 & 6) == 0) {
            i3 = (vfVar.f(zhVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vfVar.h(puVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            a2Var2 = a2Var;
            i3 |= vfVar.h(a2Var2) ? 256 : 128;
        } else {
            a2Var2 = a2Var;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= vfVar.g(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= vfVar.h(teVar) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && vfVar.z()) {
            vfVar.aq();
            j70Var2 = j70Var;
        } else {
            j70Var2 = g70.a;
            j70 j70VarC = z ? j70Var2.c(new SuspendPointerInputElement(bw.t, null, new ut0(new c(zhVar, null, 10)), 6)) : j70Var2;
            p60 p60VarD = m8.d(bw.e, true);
            int iHashCode = Long.hashCode(vfVar.ar);
            a aVarL = vfVar.l();
            j70 j70VarAn = m10.an(vfVar, j70VarC);
            kf.b.getClass();
            ng ngVar = jf.b;
            vfVar.ax();
            if (vfVar.aq) {
                vfVar.k(ngVar);
            } else {
                vfVar.bh();
            }
            jo0.h(vfVar, jf.e, p60VarD);
            jo0.h(vfVar, jf.d, aVarL);
            w6 w6Var = jf.f;
            if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode))) {
                n5.j(iHashCode, vfVar, iHashCode, w6Var);
            }
            jo0.h(vfVar, jf.c, j70VarAn);
            teVar.f(vfVar, Integer.valueOf((i4 >> 15) & 14));
            b(zhVar, puVar, null, a2Var2, vfVar, (i4 & 126) | ((i4 << 3) & 7168));
            vfVar.q(true);
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new qh(zhVar, puVar, a2Var, j70Var2, z, teVar, i2);
        }
    }

    public static final long d(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    public static final void e(int i2, vf vfVar) {
        w80 w80Var;
        final w80 w80Var2;
        final w80 w80Var3;
        boolean z;
        boolean z2;
        xs0 xs0Var;
        long j2;
        vf vfVar2 = vfVar;
        vfVar2.aw(1414091467);
        if (vfVar2.an(i2 & 1, i2 != 0)) {
            Object objAk = vfVar2.ak();
            n31 n31Var = nf.a;
            if (objAk == n31Var) {
                objAk = bo0.m("");
                vfVar2.be(objAk);
            }
            w80 w80Var4 = (w80) objAk;
            Object objAk2 = vfVar2.ak();
            if (objAk2 == n31Var) {
                objAk2 = bo0.m("");
                vfVar2.be(objAk2);
            }
            w80 w80Var5 = (w80) objAk2;
            Object objAk3 = vfVar2.ak();
            if (objAk3 == n31Var) {
                objAk3 = bo0.m(Boolean.FALSE);
                vfVar2.be(objAk3);
            }
            w80 w80Var6 = (w80) objAk3;
            final Context context = (Context) vfVar2.j(d2.b);
            float f2 = 24;
            j70 j70VarC = androidx.compose.foundation.layout.a.c(b.b, f2);
            kd kdVarA = id.a(x6.c, bw.q, vfVar2, 54);
            int iHashCode = Long.hashCode(vfVar2.ar);
            a aVarL = vfVar2.l();
            j70 j70VarAn = m10.an(vfVar2, j70VarC);
            kf.b.getClass();
            ng ngVar = jf.b;
            vfVar2.ax();
            if (vfVar2.aq) {
                vfVar2.k(ngVar);
            } else {
                vfVar2.bh();
            }
            jo0.h(vfVar2, jf.e, kdVarA);
            jo0.h(vfVar2, jf.d, aVarL);
            w6 w6Var = jf.f;
            if (vfVar2.aq || !f00.h(vfVar2.ak(), Integer.valueOf(iHashCode))) {
                n5.j(iHashCode, vfVar2, iHashCode, w6Var);
            }
            jo0.h(vfVar2, jf.c, j70VarAn);
            long j3 = bo0.j(28);
            xs0 xs0Var2 = cd.a;
            ww0.b("SecureVault Challenge", null, ((zc) vfVar2.j(xs0Var2)).a, j3, 0L, 0L, 0, false, 0, 0, null, vfVar, 3078, 131058);
            g70 g70Var = g70.a;
            qo0.a(vfVar, b.b(g70Var, 16));
            ww0.b("Can you crack the vault?", null, ((zc) vfVar.j(xs0Var2)).f, bo0.j(16), 0L, 0L, 0, false, 0, 0, null, vfVar, 3078, 131058);
            vfVar2 = vfVar;
            qo0.a(vfVar2, b.b(g70Var, 32));
            String str = (String) w80Var4.getValue();
            FillElement fillElement = b.a;
            t10 t10Var = new t10(123);
            Object objAk4 = vfVar2.ak();
            if (objAk4 == n31Var) {
                w80Var = w80Var4;
                objAk4 = new h(4, w80Var);
                vfVar2.be(objAk4);
            } else {
                w80Var = w80Var4;
            }
            final w80 w80Var7 = w80Var;
            ld0.a(str, (cv) objAk4, fillElement, false, null, d41.d, null, t10Var, null, true, 0, 0, null, null, vfVar2, 1573296);
            qo0.a(vfVar2, b.b(g70Var, f2));
            boolean zH = vfVar2.h(context);
            Object objAk5 = vfVar2.ak();
            if (zH || objAk5 == n31Var) {
                w80Var2 = w80Var5;
                w80Var3 = w80Var6;
                objAk5 = new pu() { // from class: w50
                    @Override // defpackage.pu
                    public final Object a() {
                        boolean zC = new SecureValidator(context).c((String) w80Var7.getValue());
                        w80Var3.setValue(Boolean.valueOf(zC));
                        w80Var2.setValue(zC ? "✓ Congratulations! Flag is correct!" : "✗ Wrong flag. Try harder!");
                        return wz0.a;
                    }
                };
                vfVar2.be(objAk5);
            } else {
                w80Var2 = w80Var5;
                w80Var3 = w80Var6;
            }
            d41.g((pu) objAk5, b.b(fillElement, 56), false, null, null, null, null, vfVar2, 805306416);
            qo0.a(vfVar2, b.b(g70Var, f2));
            if (((String) w80Var2.getValue()).length() > 0) {
                vfVar2.av(-778884801);
                if (((Boolean) w80Var3.getValue()).booleanValue()) {
                    vfVar2.av(-856404271);
                    xs0Var = xs0Var2;
                    j2 = ((zc) vfVar2.j(xs0Var)).c;
                    vfVar2.q(false);
                } else {
                    xs0Var = xs0Var2;
                    vfVar2.av(-856401265);
                    j2 = ((zc) vfVar2.j(xs0Var)).y;
                    vfVar2.q(false);
                }
                long jB = cd.b(j2, vfVar2);
                long j4 = qc.g;
                long jB2 = qc.b(jB, 0.38f);
                zc zcVar = (zc) vfVar2.j(xs0Var);
                ta taVar = zcVar.al;
                if (taVar == null) {
                    float f3 = lr.a;
                    taVar = new ta(cd.d(zcVar, 39), cd.a(zcVar, cd.d(zcVar, 39)), m10.q(qc.b(cd.d(zcVar, lr.c), lr.e), cd.d(zcVar, 39)), qc.b(cd.a(zcVar, cd.d(zcVar, 39)), 0.38f));
                    zcVar.al = taVar;
                }
                if (j2 == 16) {
                    j2 = taVar.a;
                }
                long j5 = j2;
                if (jB == 16) {
                    jB = taVar.b;
                }
                long j6 = jB;
                if (j4 == 16) {
                    j4 = taVar.c;
                }
                long j7 = j4;
                if (jB2 == 16) {
                    jB2 = taVar.d;
                }
                z2 = true;
                f00.a(null, null, new ta(j5, j6, j7, jB2), null, t1.aq(493140366, new ka(1 == true ? 1 : 0, w80Var2), vfVar2), vfVar2, 196608);
                z = false;
            } else {
                z = false;
                z2 = true;
                vfVar2.av(-782228895);
            }
            vfVar2.q(z);
            vfVar2.q(z2);
        } else {
            vfVar2.aq();
        }
        hi0 hi0VarS = vfVar2.s();
        if (hi0VarS != null) {
            hi0VarS.d = new md(i2);
        }
    }

    public static final long f(int i2, int i3) {
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static final long g(int i2) {
        long j2 = (((long) i2) << 32) | (((long) 0) & 4294967295L);
        int i3 = k10.p;
        return j2;
    }

    public static final ri0 h(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new ri0(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float i(defpackage.kf0 r6, boolean r7, defpackage.tx[] r8, float r9) {
        /*
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.d(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e00.i(kf0, boolean, tx[], float):float");
    }

    public static final void j(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static final boolean l(ss0 ss0Var, int i2, w wVar, boolean z) {
        boolean z2;
        synchronized (v) {
            try {
                int i3 = ss0Var.d;
                if (i3 == i2) {
                    ss0Var.c = wVar;
                    z2 = true;
                    if (z) {
                        ss0Var.e++;
                    }
                    ss0Var.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final int m(int[] iArr, int i2, int i3) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int n(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [di0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [Il] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List o(vq0 vq0Var, Integer num, int i2, Integer num2) {
        int iAc;
        m80 m80Var;
        if (vq0Var.w || vq0Var.o() == 0) {
            return rq.d;
        }
        ?? di0Var = new di0(vq0Var);
        if (num2 != null) {
            iAc = num2.intValue();
        } else {
            iAc = vq0Var.v;
            if (iAc < 0) {
                iAc = vq0Var.ac(vq0Var.b, i2);
            }
        }
        if (num == 0) {
            int iAl = vq0Var.i - vq0Var.al(vq0Var.b, vq0Var.q(i2));
            e80 e80Var = vq0Var.s;
            num = Integer.valueOf(iAl + ((e80Var == null || (m80Var = (m80) e80Var.b(i2)) == null) ? 0 : m80Var.b));
        }
        while (i2 >= 0) {
            di0Var.b(vq0Var.am(i2), num);
            num = vq0Var.b(i2);
            if (iAc >= 0) {
                int i3 = iAc;
                iAc = vq0Var.ac(vq0Var.b, iAc);
                i2 = i3;
            } else {
                i2 = iAc;
            }
        }
        return di0Var.a;
    }

    public static final boolean p(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = rq.d;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    uo0 uo0Var = (uo0) obj2;
                    uo0 uo0Var2 = (uo0) obj;
                    arrayList2.add(new xa0((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (uo0Var2.g().a() >> 32)) - Float.intBitsToFloat((int) (uo0Var.g().a() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (uo0Var2.g().a() & 4294967295L)) - Float.intBitsToFloat((int) (uo0Var.g().a() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((xa0) kc.ar(list)).a;
            } else {
                if (list.isEmpty()) {
                    p40.b("Empty collection can't be reduced.");
                }
                Object objAr = kc.ar(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objAr = new xa0(xa0.g(((xa0) objAr).a, ((xa0) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((xa0) objAr).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final yr r(yr yrVar) {
        return ((yrVar instanceof ns0) || (yrVar instanceof jn)) ? yrVar : new jn(yrVar);
    }

    public static void s(h2 h2Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        xo0 xo0Var;
        uo0 uo0Var;
        cv cvVar;
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            long jKeyAt = longSparseArray.keyAt(i2);
            ViewTranslationResponse viewTranslationResponseL = i0.l(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseL != null && (value = viewTranslationResponseL.getValue("android:text")) != null && (text = value.getText()) != null && (xo0Var = (xo0) h2Var.g().b((int) jKeyAt)) != null && (uo0Var = xo0Var.a) != null) {
                Object objG = uo0Var.d.d.g(oo0.j);
                if (objG == null) {
                    objG = null;
                }
                ah ahVar = (ah) objG;
                if (ahVar != null && (cvVar = (cv) ahVar.b) != null) {
                }
            }
        }
    }

    public static final int t(int i2, List list) {
        int i3;
        int i4 = ((ce0) kc.aw(list)).c;
        if (i2 > ((ce0) kc.aw(list)).c) {
            ty.a("Index " + i2 + " should be less or equal than last line's end " + i4);
        }
        int size = list.size() - 1;
        int i5 = 0;
        while (true) {
            if (i5 > size) {
                i3 = -(i5 + 1);
                break;
            }
            i3 = (i5 + size) >>> 1;
            ce0 ce0Var = (ce0) list.get(i3);
            byte b2 = ce0Var.b > i2 ? (byte) 1 : ce0Var.c <= i2 ? (byte) -1 : (byte) 0;
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            return i3;
        }
        ty.a("Found paragraph index " + i3 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i2 + ", paragraphs=[" + p40.a(list, null, new c6(3), 31) + ']');
        return i3;
    }

    public static final int u(int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            ce0 ce0Var = (ce0) arrayList.get(i4);
            byte b2 = ce0Var.d > i2 ? (byte) 1 : ce0Var.e <= i2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i3 = i4 + 1;
            } else {
                if (b2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int v(ArrayList arrayList, float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((ce0) kc.aw(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ce0 ce0Var = (ce0) arrayList.get(i3);
            byte b2 = ce0Var.f > f2 ? (byte) 1 : ce0Var.g <= f2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void w(ArrayList arrayList, long j2, cv cvVar) {
        int size = arrayList.size();
        for (int iT = t(hx0.e(j2), arrayList); iT < size; iT++) {
            ce0 ce0Var = (ce0) arrayList.get(iT);
            if (ce0Var.b >= hx0.d(j2)) {
                return;
            }
            if (ce0Var.b != ce0Var.c) {
                cvVar.g(ce0Var);
            }
        }
    }

    public static final Integer x(rq0 rq0Var, cg cgVar, int i2, int i3) {
        Integer numX;
        int[] iArr = rq0Var.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (rq0Var.j(i2) && rq0Var.i(i2) == 206 && f00.h(rq0Var.p(iArr, i2), xf.e)) {
                Object objH = rq0Var.h(i2, 0);
                rf rfVar = objH instanceof rf ? (rf) objH : null;
                if (rfVar != null && rfVar.d.equals(cgVar)) {
                    return Integer.valueOf(i2);
                }
            }
            if (rq0Var.d(i2) && (numX = x(rq0Var, cgVar, i2 + 1, i4)) != null) {
                return Integer.valueOf(numX.intValue());
            }
            i2 = i4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [gv] */
    /* JADX WARN: Type inference failed for: r5v0, types: [yr] */
    /* JADX WARN: Type inference failed for: r6v0, types: [gv] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(defpackage.yr r5, defpackage.gv r6, defpackage.ki r7) {
        /*
            jq r0 = defpackage.m10.d
            boolean r1 = r7 instanceof defpackage.is
            if (r1 == 0) goto L15
            r1 = r7
            is r1 = (defpackage.is) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.k = r2
            goto L1a
        L15:
            is r1 = new is
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.j
            int r2 = r1.k
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            in r5 = r1.i
            xi0 r6 = r1.h
            tt0 r1 = r1.g
            gv r1 = (defpackage.gv) r1
            defpackage.i60.az(r7)     // Catch: defpackage.a -> L2f
            goto L67
        L2f:
            r7 = move-exception
            goto L63
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r5)
            r5 = 0
            return r5
        L38:
            defpackage.i60.az(r7)
            xi0 r7 = new xi0
            r7.<init>()
            r7.d = r0
            in r2 = new in
            r2.<init>(r6, r7)
            r4 = r6
            tt0 r4 = (defpackage.tt0) r4     // Catch: defpackage.a -> L5e
            r1.g = r4     // Catch: defpackage.a -> L5e
            r1.h = r7     // Catch: defpackage.a -> L5e
            r1.i = r2     // Catch: defpackage.a -> L5e
            r1.k = r3     // Catch: defpackage.a -> L5e
            java.lang.Object r5 = r5.b(r2, r1)     // Catch: defpackage.a -> L5e
            yj r1 = defpackage.yj.d
            if (r5 != r1) goto L5b
            return r1
        L5b:
            r1 = r6
            r6 = r7
            goto L67
        L5e:
            r5 = move-exception
            r1 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L63:
            java.lang.Object r2 = r7.d
            if (r2 != r5) goto L80
        L67:
            java.lang.Object r5 = r6.d
            if (r5 == r0) goto L6c
            return r5
        L6c:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L80:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e00.y(yr, gv, ki):java.lang.Object");
    }

    public static final pj z(pj pjVar, pj pjVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) pjVar.r(new md(8, (byte) 0), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pjVar2.r(new md(8, (byte) 0), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return pjVar.j(pjVar2);
        }
        md mdVar = new md(6, (byte) 0);
        pq pqVar = pq.d;
        pj pjVar3 = (pj) pjVar.r(mdVar, pqVar);
        Object objR = pjVar2;
        if (zBooleanValue2) {
            objR = pjVar2.r(new md(7, (byte) 0), pqVar);
        }
        return pjVar3.j((pj) objR);
    }

    public abstract void al(eu0 eu0Var, eu0 eu0Var2, Window window, View view, boolean z, boolean z2);

    public void k(Window window) {
    }
}

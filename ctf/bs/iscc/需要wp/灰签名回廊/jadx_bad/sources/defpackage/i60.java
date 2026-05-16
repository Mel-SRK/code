package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.a;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class i60 implements vn0 {
    public static final jb d = new jb();
    public static final ht e = new ht(7);
    public static final a21 f = new a21(0.31006f, 0.31616f);
    public static final a21 g = new a21(0.34567f, 0.3585f);
    public static final a21 h = new a21(0.32168f, 0.33767f);
    public static final a21 i = new a21(0.31271f, 0.32902f);
    public static final float[] j = {0.964212f, 1.0f, 0.825188f};
    public static final StackTraceElement[] k = new StackTraceElement[0];
    public static final yf0 l = new yf0(10);
    public static final yf0 m = new yf0(11);
    public static final yf0 n = new yf0(12);
    public static final jq o;
    public static final jq p;

    static {
        int i2 = 1;
        o = new jq("NONE", i2);
        p = new jq("PENDING", i2);
    }

    public static o9 a(int i2, int i3, m9 m9Var) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        m9 m9Var2 = m9.d;
        if (i4 != 0) {
            m9Var = m9Var2;
        }
        if (i2 == -2) {
            if (m9Var != m9Var2) {
                return new vg(1, m9Var);
            }
            ya.a.getClass();
            return new o9(xa.b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? m9Var == m9Var2 ? new o9(i2) : new vg(i2, m9Var) : new o9(Integer.MAX_VALUE) : m9Var == m9Var2 ? new o9(0) : new vg(1, m9Var);
        }
        if (m9Var == m9Var2) {
            return new vg(1, m9.e);
        }
        wc.n("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final sj0 aa(Throwable th) {
        th.getClass();
        return new sj0(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object ab(kg kgVar, ai0 ai0Var) {
        if (!((i70) kgVar).d.q) {
            sy.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        a aVar = (a) pk.ay(kgVar).ac;
        aVar.getClass();
        return d41.aj(aVar, ai0Var);
    }

    public static final void ac(pj pjVar) {
        t00 t00Var = (t00) pjVar.k(bw.ae);
        if (t00Var != null && !t00Var.b()) {
            throw t00Var.q();
        }
    }

    public static final d20 ad(d20 d20Var) {
        d20 d20Var2;
        d20 d20VarL = d20Var.l();
        while (true) {
            d20 d20Var3 = d20VarL;
            d20Var2 = d20Var;
            d20Var = d20Var3;
            if (d20Var == null) {
                break;
            }
            d20VarL = d20Var.l();
        }
        fa0 fa0Var = d20Var2 instanceof fa0 ? (fa0) d20Var2 : null;
        if (fa0Var == null) {
            return d20Var2;
        }
        fa0 fa0Var2 = fa0Var.t;
        while (true) {
            fa0 fa0Var3 = fa0Var2;
            fa0 fa0Var4 = fa0Var;
            fa0Var = fa0Var3;
            if (fa0Var == null) {
                return fa0Var4;
            }
            fa0Var2 = fa0Var.t;
        }
    }

    public static final Rect ae(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        int i4 = i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i4 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i4 < i3) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i4, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i4, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    metricAffectingSpanArr.getClass();
                    int i5 = 0;
                    while (true) {
                        if (!(i5 < metricAffectingSpanArr.length)) {
                            break;
                        }
                        int i6 = i5 + 1;
                        try {
                            MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i5];
                            if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                                metricAffectingSpan.updateMeasureState(textPaint2);
                            }
                            i5 = i6;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            throw new NoSuchElementException(e2.getMessage());
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i4, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i4, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i4 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i4, i3, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i4, i3, rect3);
        return rect3;
    }

    public static final t00 af(pj pjVar) {
        t00 t00Var = (t00) pjVar.k(bw.ae);
        if (t00Var != null) {
            return t00Var;
        }
        wc.f(pjVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:8:0x002d, B:10:0x0044, B:16:0x0061, B:19:0x0067, B:20:0x0079, B:26:0x008e, B:28:0x009b, B:22:0x0080, B:24:0x0087, B:11:0x004d, B:13:0x0053, B:14:0x005b), top: B:34:0x002d, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final yl0 ag(u11 u11Var) {
        o11 yl0Var;
        boolean zIsInstance;
        o11 o11VarA;
        o11 o11Var;
        wl0 wl0Var = new wl0();
        fk defaultViewModelCreationExtras = u11Var instanceof jx ? ((jx) u11Var).getDefaultViewModelCreationExtras() : ek.b;
        defaultViewModelCreationExtras.getClass();
        t11 viewModelStore = u11Var.getViewModelStore();
        viewModelStore.getClass();
        yf0 yf0Var = new yf0(16);
        sb sbVarA = yi0.a(yl0.class);
        synchronized (yf0Var) {
            try {
                yl0Var = (o11) viewModelStore.a.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                Class clsY = sbVarA.a;
                Map map = sb.b;
                map.getClass();
                Integer num = (Integer) map.get(clsY);
                if (num != null) {
                    zIsInstance = az0.w(num.intValue(), yl0Var);
                } else {
                    if (clsY.isPrimitive()) {
                        clsY = d41.y(yi0.a(clsY));
                    }
                    zIsInstance = clsY.isInstance(yl0Var);
                }
                if (zIsInstance) {
                    yl0Var.getClass();
                } else {
                    LinkedHashMap linkedHashMap = defaultViewModelCreationExtras.a;
                    linkedHashMap.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(linkedHashMap);
                    linkedHashMap2.put(e00.w, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        try {
                            yl0Var = new yl0();
                        } catch (AbstractMethodError unused) {
                            o11VarA = wl0Var.a(sbVarA.a);
                            yl0Var = o11VarA;
                            yl0Var.getClass();
                            o11Var = (o11) viewModelStore.a.put("androidx.lifecycle.internal.SavedStateHandlesVM", yl0Var);
                            if (o11Var != null) {
                            }
                            return (yl0) yl0Var;
                        }
                    } catch (AbstractMethodError unused2) {
                        o11VarA = wl0Var.a(sbVarA.a);
                        yl0Var = o11VarA;
                        yl0Var.getClass();
                        o11Var = (o11) viewModelStore.a.put("androidx.lifecycle.internal.SavedStateHandlesVM", yl0Var);
                        if (o11Var != null) {
                        }
                        return (yl0) yl0Var;
                    }
                    yl0Var.getClass();
                    o11Var = (o11) viewModelStore.a.put("androidx.lifecycle.internal.SavedStateHandlesVM", yl0Var);
                    if (o11Var != null) {
                        o11Var.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (yl0) yl0Var;
    }

    public static final int ah(g7 g7Var, Object obj, int i2) {
        int i3 = g7Var.f;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iM = e00.m(g7Var.d, i3, i2);
            if (iM < 0 || f00.h(obj, g7Var.e[iM])) {
                return iM;
            }
            int i4 = iM + 1;
            while (i4 < i3 && g7Var.d[i4] == i2) {
                if (f00.h(obj, g7Var.e[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iM - 1; i5 >= 0 && g7Var.d[i5] == i2; i5--) {
                if (f00.h(obj, g7Var.e[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final float[] ai(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final en aj(t00 t00Var, boolean z, w00 w00Var) {
        if (t00Var instanceof a10) {
            return ((a10) t00Var).aq(z, w00Var);
        }
        return t00Var.g(w00Var.k(), z, new ft(1, w00Var, w00.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 1));
    }

    public static final boolean ak(pj pjVar) {
        t00 t00Var = (t00) pjVar.k(bw.ae);
        if (t00Var != null) {
            return t00Var.b();
        }
        return true;
    }

    public static final boolean al(xj xjVar) {
        t00 t00Var = (t00) xjVar.f().k(bw.ae);
        if (t00Var != null) {
            return t00Var.b();
        }
        return true;
    }

    public static final boolean am(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static hs0 an(xj xjVar, pj pjVar, gv gvVar, int i2) {
        if ((i2 & 1) != 0) {
            pjVar = pq.d;
        }
        ck ckVar = (i2 & 2) != 0 ? ck.d : ck.g;
        pj pjVarZ = e00.z(xjVar.f(), pjVar, true);
        kl klVar = wm.a;
        if (pjVarZ != klVar && pjVarZ.k(bw.u) == null) {
            pjVarZ = pjVarZ.j(klVar);
        }
        hs0 y20Var = ckVar == ck.e ? new y20(pjVarZ, gvVar) : new hs0(pjVarZ, true);
        y20Var.bg(ckVar, y20Var, gvVar);
        return y20Var;
    }

    public static final float[] ao(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] ap(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final Object at(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final boolean av(q80 q80Var, Object obj, Object obj2) {
        Object objG = q80Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof r80)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            q80Var.j(obj);
            return true;
        }
        r80 r80Var = (r80) objG;
        boolean zK = r80Var.k(obj2);
        if (zK && r80Var.g()) {
            q80Var.j(obj);
        }
        return zK;
    }

    public static final void aw(q80 q80Var, Object obj) {
        boolean zG;
        long[] jArr = q80Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj2 = q80Var.b[i5];
                        Object obj3 = q80Var.c[i5];
                        if (obj3 instanceof r80) {
                            r80 r80Var = (r80) obj3;
                            r80Var.k(obj);
                            zG = r80Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            q80Var.k(i5);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public static int ax(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        wc.n("Cannot round NaN value.");
        return 0;
    }

    public static qz ay(sz szVar) {
        szVar.getClass();
        return new qz(szVar.d, szVar.e, szVar.f > 0 ? 2 : -2);
    }

    public static final void az(Object obj) {
        if (obj instanceof sj0) {
            throw ((sj0) obj).d;
        }
    }

    public static final void b(cw0 cw0Var, te teVar, vf vfVar, int i2) {
        int i3;
        te teVar2;
        vf vfVar2;
        vfVar.aw(-1985516685);
        if ((i2 & 6) == 0) {
            i3 = (vfVar.h(cw0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vfVar.h(teVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && vfVar.z()) {
            vfVar.aq();
            teVar2 = teVar;
            vfVar2 = vfVar;
        } else {
            Object objAk = vfVar.ak();
            n31 n31Var = nf.a;
            if (objAk == n31Var) {
                objAk = new zh();
                vfVar.be(objAk);
            }
            zh zhVar = (zh) objAk;
            Object objAk2 = vfVar.ak();
            if (objAk2 == n31Var) {
                objAk2 = new b(5, zhVar);
                vfVar.be(objAk2);
            }
            teVar2 = teVar;
            vfVar2 = vfVar;
            e00.c(zhVar, (pu) objAk2, new a2(24, cw0Var, zhVar), null, cw0Var.h(), teVar2, vfVar2, ((i3 << 12) & 458752) | 54);
        }
        hi0 hi0VarS = vfVar2.s();
        if (hi0VarS != null) {
            hi0VarS.d = new gi(cw0Var, teVar2, i2);
        }
    }

    public static final Bitmap.Config ba(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i3 = Build.VERSION.SDK_INT;
        return (i3 < 26 || i2 != 3) ? (i3 < 26 || i2 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static sz bb(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new sz(i2, i3 - 1, 1);
        }
        sz szVar = sz.g;
        return sz.g;
    }

    public static final Object bc(pj pjVar, gv gvVar, tt0 tt0Var) throws Throwable {
        pj pjVar2 = tt0Var.e;
        pjVar2.getClass();
        pj pjVarJ = !((Boolean) pjVar.r(new md(8, (byte) 0), Boolean.FALSE)).booleanValue() ? pjVar2.j(pjVar) : e00.z(pjVar2, pjVar, false);
        ac(pjVarJ);
        if (pjVarJ == pjVar2) {
            pm0 pm0Var = new pm0(tt0Var, pjVarJ);
            return bo0.q(pm0Var, pm0Var, gvVar);
        }
        bw bwVar = bw.u;
        if (f00.h(pjVarJ.k(bwVar), pjVar2.k(bwVar))) {
            uz0 uz0Var = new uz0(pjVarJ, tt0Var);
            pj pjVar3 = uz0Var.f;
            Object objAw = t1.aw(pjVar3, null);
            try {
                return bo0.q(uz0Var, uz0Var, gvVar);
            } finally {
                t1.at(pjVar3, objAw);
            }
        }
        tm tmVar = new tm(tt0Var, pjVarJ);
        try {
            az0.ad(f00.x(f00.p(tmVar, tmVar, gvVar)), wz0.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = tm.h;
            do {
                int i2 = atomicIntegerFieldUpdater.get(tmVar);
                if (i2 != 0) {
                    if (i2 != 2) {
                        wc.q("Already suspended");
                        return null;
                    }
                    Object objAp = az0.ap(a10.d.get(tmVar));
                    if (objAp instanceof wd) {
                        throw ((wd) objAp).a;
                    }
                    return objAp;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(tmVar, 0, 1));
            return yj.d;
        } catch (Throwable th) {
            tmVar.h(new sj0(th));
            throw th;
        }
    }

    public static final ii c(pj pjVar) {
        if (pjVar.k(bw.ae) == null) {
            pjVar = pjVar.j(new v00(null));
        }
        return new ii(pjVar);
    }

    public static final long d(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final ps0 e(Object obj) {
        if (obj == null) {
            obj = m10.d;
        }
        return new ps0(obj);
    }

    public static final i70 h(ql qlVar, int i2) {
        i70 i70Var = ((i70) qlVar).d.i;
        if (i70Var == null || (i70Var.g & i2) == 0) {
            return null;
        }
        while (i70Var != null) {
            int i3 = i70Var.f;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i2) != 0) {
                return i70Var;
            }
            i70Var = i70Var.i;
        }
        return null;
    }

    public static dd i(dd ddVar) {
        if (uc.a(ddVar.b, uc.a)) {
            bk0 bk0Var = (bk0) ddVar;
            a21 a21Var = bk0Var.d;
            a21 a21Var2 = g;
            if (!w(a21Var, a21Var2)) {
                return new bk0(bk0Var.a, bk0Var.h, a21Var2, ao(q((float[]) bu.f.e, a21Var.a(), a21Var2.a()), bk0Var.i), bk0Var.k, bk0Var.n, bk0Var.e, bk0Var.f, bk0Var.g, -1);
            }
        }
        return ddVar;
    }

    public static final void l(q80 q80Var, Object obj, Object obj2) {
        int iF = q80Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : q80Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof r80) {
                ((r80) obj3).a(obj2);
            } else if (obj3 != obj2) {
                r80 r80Var = new r80();
                r80Var.a(obj3);
                r80Var.a(obj2);
                obj2 = r80Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            q80Var.c[iF] = obj2;
            return;
        }
        int i2 = ~iF;
        q80Var.b[i2] = obj;
        q80Var.c[i2] = obj2;
    }

    public static final ri0 m(d20 d20Var) {
        d20 d20VarL = d20Var.l();
        return d20VarL != null ? d20VarL.ak(d20Var, true) : new ri0(0.0f, 0.0f, (int) (d20Var.al() >> 32), (int) (d20Var.al() & 4294967295L));
    }

    public static final ri0 n(d20 d20Var) {
        d20 d20VarAd = ad(d20Var);
        float fAl = (int) (d20VarAd.al() >> 32);
        float fAl2 = (int) (d20VarAd.al() & 4294967295L);
        ri0 ri0VarAk = d20VarAd.ak(d20Var, true);
        float f2 = ri0VarAk.a;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > fAl) {
            f2 = fAl;
        }
        float f3 = ri0VarAk.b;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > fAl2) {
            f3 = fAl2;
        }
        float f4 = ri0VarAk.c;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 <= fAl) {
            fAl = f4;
        }
        float f5 = ri0VarAk.d;
        float f6 = f5 >= 0.0f ? f5 : 0.0f;
        if (f6 <= fAl2) {
            fAl2 = f6;
        }
        if (f2 == fAl || f3 == fAl2) {
            return ri0.e;
        }
        long jI = d20VarAd.i((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jI2 = d20VarAd.i((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fAl)) << 32));
        long jI3 = d20VarAd.i((((long) Float.floatToRawIntBits(fAl)) << 32) | (((long) Float.floatToRawIntBits(fAl2)) & 4294967295L));
        long jI4 = d20VarAd.i((((long) Float.floatToRawIntBits(fAl2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jI4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jI3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jI & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jI2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jI4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jI3 & 4294967295L));
        return new ri0(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final void o(xj xjVar, CancellationException cancellationException) {
        t00 t00Var = (t00) xjVar.f().k(bw.ae);
        if (t00Var != null) {
            t00Var.a(cancellationException);
        } else {
            wc.f(xjVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final void p(int i2) {
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i2).toString());
    }

    public static final float[] q(float[] fArr, float[] fArr2, float[] fArr3) {
        ap(fArr, fArr2);
        ap(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrAi = ai(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return ao(fArrAi, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static double r(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float s(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static int t(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static long u(long j2, long j3, long j4) {
        if (j3 <= j4) {
            return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j4 + " is less than minimum " + j3 + '.');
    }

    public static final w80 v(g80 g80Var, vf vfVar, int i2) {
        Object objAk = vfVar.ak();
        n31 n31Var = nf.a;
        if (objAk == n31Var) {
            objAk = bo0.m(Boolean.FALSE);
            vfVar.be(objAk);
        }
        w80 w80Var = (w80) objAk;
        boolean z = (((i2 & 14) ^ 6) > 4 && vfVar.f(g80Var)) || (i2 & 6) == 4;
        Object objAk2 = vfVar.ak();
        if (z || objAk2 == n31Var) {
            objAk2 = new c(g80Var, w80Var, null, 14);
            vfVar.be(objAk2);
        }
        pk.d(vfVar, (gv) objAk2, g80Var);
        return w80Var;
    }

    public static final boolean w(a21 a21Var, a21 a21Var2) {
        if (a21Var == a21Var2) {
            return true;
        }
        return Math.abs(a21Var.a - a21Var2.a) < 0.001f && Math.abs(a21Var.b - a21Var2.b) < 0.001f;
    }

    public static q80 x() {
        long[] jArr = mm0.a;
        return new q80();
    }

    public static final Object y(gv gvVar, ji jiVar) {
        pm0 pm0Var = new pm0(jiVar, jiVar.e());
        return bo0.q(pm0Var, pm0Var, gvVar);
    }

    public static final yg z(dd ddVar, dd ddVar2) {
        if (ddVar == ddVar2) {
            return new wg(ddVar, ddVar, 1);
        }
        long j2 = ddVar.b;
        long j3 = uc.a;
        return (uc.a(j2, j3) && uc.a(ddVar2.b, j3)) ? new xg((bk0) ddVar, (bk0) ddVar2) : new yg(ddVar, ddVar2, 0);
    }

    public abstract int aq(int i2);

    public abstract void ar(Throwable th);

    public abstract void as(a0 a0Var);

    public abstract int au(int i2);

    @Override // defpackage.vn0
    public int f(int i2) {
        return au(i2);
    }

    @Override // defpackage.vn0
    public int g(int i2) {
        return aq(i2);
    }

    @Override // defpackage.vn0
    public int j(int i2) {
        int iAq = aq(i2);
        if (iAq == -1 || aq(iAq) == -1) {
            return -1;
        }
        return iAq;
    }

    @Override // defpackage.vn0
    public int k(int i2) {
        int iAu = au(i2);
        if (iAu == -1 || au(iAu) == -1) {
            return -1;
        }
        return iAu;
    }
}

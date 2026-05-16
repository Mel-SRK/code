package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.a;
import com.example.gnd.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends a {
    public static final d80 aq;
    public boolean aa;
    public g1 ab;
    public e80 ac;
    public final f80 ad;
    public final c80 ae;
    public final c80 af;
    public final String ag;
    public final String ah;
    public final o6 ai;
    public final e80 aj;
    public vo0 ak;
    public boolean al;
    public final c80 am;
    public final m0 an;
    public final ArrayList ao;
    public final j1 ap;
    public final b1 d;
    public int e = Integer.MIN_VALUE;
    public final j1 f;
    public final AccessibilityManager g;
    public long h;
    public final c1 i;
    public final d1 j;
    public List k;
    public final Handler l;
    public final f1 m;
    public int n;
    public int o;
    public ba p;
    public ba q;
    public boolean r;
    public final e80 s;
    public final e80 t;
    public final bs0 u;
    public final bs0 v;
    public int w;
    public Integer x;
    public final g7 y;
    public final o9 z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i = mz.a;
        d80 d80Var = new d80(32);
        int i2 = d80Var.b;
        if (i2 < 0) {
            wc.g("");
            return;
        }
        int i3 = i2 + 32;
        d80Var.b(i3);
        int[] iArr2 = d80Var.a;
        int i4 = d80Var.b;
        if (i2 != i4) {
            h7.as(iArr2, iArr2, i3, i2, i4);
        }
        h7.av(iArr, iArr2, i2, 0, 12);
        d80Var.b += 32;
        aq = d80Var;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [c1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [d1] */
    public k1(b1 b1Var) {
        this.d = b1Var;
        int i = 0;
        this.f = new j1(this, i);
        Object systemService = b1Var.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: c1
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                k1 k1Var = this.a;
                k1Var.k = z ? k1Var.g.getEnabledAccessibilityServiceList(-1) : rq.d;
            }
        };
        this.j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: d1
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                k1 k1Var = this.a;
                k1Var.k = k1Var.g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.l = new Handler(Looper.getMainLooper());
        this.m = new f1(this);
        this.n = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.s = new e80();
        this.t = new e80();
        this.u = new bs0();
        this.v = new bs0();
        this.w = -1;
        this.y = new g7();
        int i2 = 1;
        this.z = i60.a(1, 6, null);
        this.aa = true;
        e80 e80Var = oz.a;
        e80Var.getClass();
        this.ac = e80Var;
        this.ad = new f80();
        this.ae = new c80();
        this.af = new c80();
        this.ag = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ah = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.ai = new o6(11);
        this.aj = new e80();
        this.ak = new vo0(b1Var.getSemanticsOwner().a(), e80Var);
        int i3 = lz.a;
        this.am = new c80();
        b1Var.addOnAttachStateChangeListener(new e1(i, this));
        this.an = new m0(i2, this);
        this.ao = new ArrayList();
        this.ap = new j1(this, i2);
    }

    public static Rect ad(bd0 bd0Var) {
        if (!(bd0Var instanceof zc0) && !(bd0Var instanceof ad0)) {
            return null;
        }
        ri0 ri0VarA = bd0Var.a();
        return new Rect((int) ri0VarA.a, (int) ri0VarA.b, (int) ri0VarA.c, (int) ri0VarA.d);
    }

    public static float[] ae(bd0 bd0Var) {
        if (!(bd0Var instanceof ad0)) {
            return null;
        }
        yk0 yk0Var = ((ad0) bd0Var).a;
        long j = yk0Var.h;
        long j2 = yk0Var.g;
        long j3 = yk0Var.f;
        long j4 = yk0Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region af(bd0 bd0Var) {
        if (!(bd0Var instanceof yc0)) {
            return null;
        }
        yc0 yc0Var = (yc0) bd0Var;
        ri0 ri0VarA = yc0Var.a();
        Region region = new Region(new Rect((int) ri0VarA.a, (int) ri0VarA.b, (int) ri0VarA.c, (int) ri0VarA.d));
        Region region2 = new Region();
        t3 t3Var = yc0Var.a;
        if (!(t3Var instanceof t3)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(t3Var.a, region);
        return region2;
    }

    public static CharSequence ag(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String m(uo0 uo0Var) {
        b6 b6Var;
        if (uo0Var != null) {
            po0 po0Var = uo0Var.d;
            q80 q80Var = po0Var.d;
            cp0 cp0Var = zo0.a;
            if (q80Var.c(cp0Var)) {
                return p40.a((List) po0Var.b(cp0Var), ",", null, 62);
            }
            cp0 cp0Var2 = zo0.ad;
            if (q80Var.c(cp0Var2)) {
                Object objG = q80Var.g(cp0Var2);
                if (objG == null) {
                    objG = null;
                }
                b6 b6Var2 = (b6) objG;
                if (b6Var2 != null) {
                    return b6Var2.e;
                }
            } else {
                Object objG2 = q80Var.g(zo0.z);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (b6Var = (b6) kc.as(list)) != null) {
                    return b6Var.e;
                }
            }
        }
        return null;
    }

    public static final boolean p(qm0 qm0Var, float f) {
        vm0 vm0Var = qm0Var.a;
        if (f >= 0.0f || ((Number) vm0Var.a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) vm0Var.a()).floatValue() < ((Number) qm0Var.b.a()).floatValue();
        }
        return true;
    }

    public static final boolean q(qm0 qm0Var) {
        vm0 vm0Var = qm0Var.a;
        if (((Number) vm0Var.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) vm0Var.a()).floatValue();
        ((Number) qm0Var.b.a()).floatValue();
        return false;
    }

    public static final boolean r(qm0 qm0Var) {
        vm0 vm0Var = qm0Var.a;
        if (((Number) vm0Var.a()).floatValue() < ((Number) qm0Var.b.a()).floatValue()) {
            return true;
        }
        ((Number) vm0Var.a()).floatValue();
        return false;
    }

    public static /* synthetic */ void w(k1 k1Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        k1Var.v(i, i2, num, null);
    }

    @Override // androidx.core.view.a
    public final f1 a(View view) {
        return this.m;
    }

    public final void aa(s20 s20Var, f80 f80Var) {
        po0 po0VarS;
        if (s20Var.ae() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(s20Var)) {
            s20 s20Var2 = null;
            if (!s20Var.ag.h(8)) {
                s20Var = s20Var.q();
                while (true) {
                    if (s20Var == null) {
                        s20Var = null;
                        break;
                    } else if (s20Var.ag.h(8)) {
                        break;
                    } else {
                        s20Var = s20Var.q();
                    }
                }
            }
            if (s20Var == null || (po0VarS = s20Var.s()) == null) {
                return;
            }
            if (!po0VarS.f) {
                s20 s20VarQ = s20Var.q();
                while (true) {
                    if (s20VarQ != null) {
                        po0 po0VarS2 = s20VarQ.s();
                        if (po0VarS2 != null && po0VarS2.f) {
                            s20Var2 = s20VarQ;
                            break;
                        }
                        s20VarQ = s20VarQ.q();
                    } else {
                        break;
                    }
                }
                if (s20Var2 != null) {
                    s20Var = s20Var2;
                }
            }
            int i = s20Var.e;
            if (f80Var.a(i)) {
                w(this, s(i), 2048, 1, 8);
            }
        }
    }

    public final void ab(s20 s20Var) {
        if (s20Var.ae() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(s20Var)) {
            int i = s20Var.e;
            qm0 qm0Var = (qm0) this.s.b(i);
            qm0 qm0Var2 = (qm0) this.t.b(i);
            if (qm0Var == null && qm0Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventG = g(i, 4096);
            if (qm0Var != null) {
                accessibilityEventG.setScrollX((int) ((Number) qm0Var.a.a()).floatValue());
                accessibilityEventG.setMaxScrollX((int) ((Number) qm0Var.b.a()).floatValue());
            }
            if (qm0Var2 != null) {
                accessibilityEventG.setScrollY((int) ((Number) qm0Var2.a.a()).floatValue());
                accessibilityEventG.setMaxScrollY((int) ((Number) qm0Var2.b.a()).floatValue());
            }
            u(accessibilityEventG);
        }
    }

    public final boolean ac(uo0 uo0Var, int i, int i2, boolean z) {
        String strM;
        po0 po0Var = uo0Var.d;
        int i3 = uo0Var.g;
        cp0 cp0Var = oo0.h;
        if (po0Var.d.c(cp0Var) && pk.k(uo0Var)) {
            hv hvVar = (hv) ((ah) uo0Var.d.b(cp0Var)).b;
            if (hvVar != null) {
                return ((Boolean) hvVar.c(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.w) && (strM = m(uo0Var)) != null) {
            if (i < 0 || i != i2 || i2 > strM.length()) {
                i = -1;
            }
            this.w = i;
            boolean z2 = strM.length() > 0;
            u(i(s(i3), z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(strM.length()) : null, strM));
            y(i3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ah() {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1.ah():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, ba baVar, String str, Bundle bundle) {
        uo0 uo0Var;
        Region regionAf;
        float[] fArrAe;
        Rect rectAd;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i2;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo2 = baVar.a;
        xo0 xo0Var = (xo0) l().b(i);
        if (xo0Var == null || (uo0Var = xo0Var.a) == null) {
            return;
        }
        po0 po0Var = uo0Var.d;
        q80 q80Var = po0Var.d;
        String strM = m(uo0Var);
        if (f00.h(str, this.ag)) {
            int iD = this.ae.d(i);
            if (iD != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (f00.h(str, this.ah)) {
            int iD2 = this.af.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        fa0 fa0Var = null;
        if (q80Var.c(oo0.a) && bundle != null && f00.h(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 > 0 && i3 >= 0) {
                if (i3 < (strM != null ? strM.length() : Integer.MAX_VALUE)) {
                    zw0 zw0VarG = wn0.g(po0Var);
                    if (zw0VarG == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i3 + i5;
                        if (i6 >= zw0VarG.a.a.e.length()) {
                            arrayList.add(fa0Var);
                            accessibilityNodeInfo = accessibilityNodeInfo2;
                            i2 = i4;
                        } else {
                            ri0 ri0VarB = zw0VarG.b(i6);
                            fa0 fa0VarD = uo0Var.d();
                            long jAm = 0;
                            if (fa0VarD != null) {
                                if (!fa0VarD.D().q) {
                                    fa0VarD = fa0Var;
                                }
                                if (fa0VarD != null) {
                                    jAm = fa0VarD.am(0L);
                                }
                            }
                            ri0 ri0VarG = ri0VarB.g(jAm);
                            ri0 ri0VarG2 = uo0Var.g();
                            ri0 ri0VarC = ri0VarG.e(ri0VarG2) ? ri0VarG.c(ri0VarG2) : fa0Var;
                            if (ri0VarC != 0) {
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ri0VarC.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(ri0VarC.a)) << 32);
                                b1 b1Var = this.d;
                                long jS = b1Var.s(jFloatToRawIntBits);
                                long jS2 = b1Var.s((((long) Float.floatToRawIntBits(ri0VarC.c)) << 32) | (((long) Float.floatToRawIntBits(ri0VarC.d)) & 4294967295L));
                                int i7 = (int) (jS >> 32);
                                int i8 = (int) (jS2 >> 32);
                                accessibilityNodeInfo = accessibilityNodeInfo2;
                                i2 = i4;
                                int i9 = (int) (jS & 4294967295L);
                                int i10 = (int) (jS2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)));
                            } else {
                                accessibilityNodeInfo = accessibilityNodeInfo2;
                                i2 = i4;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i5++;
                        i4 = i2;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        fa0Var = null;
                    }
                    accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        cp0 cp0Var = zo0.x;
        if (q80Var.c(cp0Var) && bundle != null && f00.h(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = q80Var.g(cp0Var);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (f00.h(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo2.getExtras().putInt(str, uo0Var.g);
            return;
        }
        if (f00.h(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = q80Var.g(zo0.am);
            aq0 aq0Var = (aq0) (objG2 == null ? null : objG2);
            if (aq0Var != null) {
                bd0 bd0VarH = h(aq0Var, uo0Var);
                if (bd0VarH instanceof zc0) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", ad(bd0VarH));
                    return;
                } else if (bd0VarH instanceof ad0) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", ad(bd0VarH));
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", ae(bd0VarH));
                    return;
                } else if (!(bd0VarH instanceof yc0)) {
                    wc.l();
                    return;
                } else {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", af(bd0VarH));
                    return;
                }
            }
            return;
        }
        if (f00.h(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = q80Var.g(zo0.am);
            aq0 aq0Var2 = (aq0) (objG3 == null ? null : objG3);
            if (aq0Var2 == null || (rectAd = ad(h(aq0Var2, uo0Var))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectAd);
            return;
        }
        if (f00.h(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = q80Var.g(zo0.am);
            aq0 aq0Var3 = (aq0) (objG4 == null ? null : objG4);
            if (aq0Var3 == null || (fArrAe = ae(h(aq0Var3, uo0Var))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrAe);
            return;
        }
        if (f00.h(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = q80Var.g(zo0.am);
            aq0 aq0Var4 = (aq0) (objG5 == null ? null : objG5);
            if (aq0Var4 == null || (regionAf = af(h(aq0Var4, uo0Var))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionAf);
        }
    }

    public final Rect c(xo0 xo0Var) {
        tz tzVar = xo0Var.b;
        float f = tzVar.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(tzVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        b1 b1Var = this.d;
        long jS = b1Var.s(jFloatToRawIntBits);
        long jS2 = b1Var.s((((long) Float.floatToRawIntBits(tzVar.c)) << 32) | (((long) Float.floatToRawIntBits(tzVar.d)) & 4294967295L));
        int i = (int) (jS >> 32);
        int i2 = (int) (jS2 >> 32);
        int i3 = (int) (jS & 4294967295L);
        int i4 = (int) (jS2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
    
        if (defpackage.t1.l(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0085, B:35:0x0094, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:55:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ec -> B:50:0x00ef). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ki r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1.d(ki):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(boolean r23, int r24, long r25) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1.e(boolean, int, long):boolean");
    }

    public final void f() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (n()) {
                t(this.d.getSemanticsOwner().a(), this.ak);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                z(l());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    ah();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent g(int i, int i2) {
        xo0 xo0Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        b1 b1Var = this.d;
        accessibilityEventObtain.setPackageName(b1Var.getContext().getPackageName());
        accessibilityEventObtain.setSource(b1Var, i);
        if (n() && (xo0Var = (xo0) l().b(i)) != null) {
            uo0 uo0Var = xo0Var.a;
            accessibilityEventObtain.setPassword(uo0Var.d.d.c(zo0.ai));
            Object objG = uo0Var.d.d.g(zo0.n);
            if (objG == null) {
                objG = null;
            }
            boolean zH = f00.h(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                ak.f(accessibilityEventObtain, zH);
            }
        }
        return accessibilityEventObtain;
    }

    public final bd0 h(aq0 aq0Var, uo0 uo0Var) {
        fa0 fa0VarD = uo0Var.d();
        return aq0Var.a(e00.an(fa0VarD != null ? fa0VarD.f : 0L), uo0Var.c.aa, this.d.getDensity());
    }

    public final AccessibilityEvent i(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventG = g(i, 8192);
        if (num != null) {
            accessibilityEventG.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventG.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventG.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventG.getText().add(charSequence);
        }
        return accessibilityEventG;
    }

    public final int j(uo0 uo0Var) {
        po0 po0Var = uo0Var.d;
        if (!po0Var.d.c(zo0.a)) {
            cp0 cp0Var = zo0.ae;
            if (po0Var.d.c(cp0Var)) {
                return (int) (((hx0) po0Var.b(cp0Var)).a & 4294967295L);
            }
        }
        return this.w;
    }

    public final int k(uo0 uo0Var) {
        po0 po0Var = uo0Var.d;
        if (!po0Var.d.c(zo0.a)) {
            cp0 cp0Var = zo0.ae;
            if (po0Var.d.c(cp0Var)) {
                return (int) (((hx0) po0Var.b(cp0Var)).a >> 32);
            }
        }
        return this.w;
    }

    public final nz l() {
        if (this.aa) {
            this.aa = false;
            b1 b1Var = this.d;
            this.ac = t1.v(b1Var.getSemanticsOwner());
            if (n()) {
                e80 e80Var = this.ac;
                Resources resources = b1Var.getContext().getResources();
                c80 c80Var = this.ae;
                c80Var.a();
                c80 c80Var2 = this.af;
                c80Var2.a();
                xo0 xo0Var = (xo0) e80Var.b(-1);
                uo0 uo0Var = xo0Var != null ? xo0Var.a : null;
                uo0Var.getClass();
                ArrayList arrayListB = fp0.b(uo0Var, new l1(1, e80Var), new l1(2, resources), f00.y(uo0Var));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((uo0) arrayListB.get(i - 1)).g;
                        int i3 = ((uo0) arrayListB.get(i)).g;
                        c80Var.f(i2, i3);
                        c80Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.ac;
    }

    public final boolean n() {
        return this.g.isEnabled() && !this.k.isEmpty();
    }

    public final void o(s20 s20Var) {
        if (this.y.add(s20Var)) {
            this.z.u(wz0.a);
        }
    }

    public final int s(int i) {
        if (i == this.d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.uo0 r20, defpackage.vo0 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = defpackage.vz.a
            f80 r3 = new f80
            r3.<init>()
            r4 = 4
            java.util.List r5 = defpackage.uo0.j(r4, r1)
            s20 r6 = r1.c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            uo0 r10 = (defpackage.uo0) r10
            nz r11 = r0.l()
            int r10 = r10.g
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L3d
            f80 r11 = r2.b
            boolean r11 = r11.b(r10)
            if (r11 != 0) goto L3a
            r0.o(r6)
            return
        L3a:
            r3.a(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            f80 r2 = r2.b
            int[] r5 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.b(r15)
            if (r15 != 0) goto L80
            r0.o(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = defpackage.uo0.j(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            uo0 r3 = (defpackage.uo0) r3
            e80 r4 = r0.aj
            int r5 = r3.g
            java.lang.Object r4 = r4.b(r5)
            vo0 r4 = (defpackage.vo0) r4
            if (r4 == 0) goto Lb6
            nz r5 = r0.l()
            int r6 = r3.g
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lb6
            r0.t(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1.t(uo0, vo0):void");
    }

    public final boolean u(AccessibilityEvent accessibilityEvent) {
        if (!n()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.r = true;
        }
        try {
            return ((Boolean) this.f.g(accessibilityEvent)).booleanValue();
        } finally {
            this.r = false;
        }
    }

    public final boolean v(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !n()) {
            return false;
        }
        AccessibilityEvent accessibilityEventG = g(i, i2);
        if (num != null) {
            accessibilityEventG.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventG.setContentDescription(p40.a(list, ",", null, 62));
        }
        return u(accessibilityEventG);
    }

    public final void x(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventG = g(s(i), 32);
        accessibilityEventG.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventG.getText().add(str);
        }
        u(accessibilityEventG);
    }

    public final void y(int i) {
        g1 g1Var = this.ab;
        if (g1Var != null) {
            uo0 uo0Var = g1Var.a;
            if (i != uo0Var.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - g1Var.f <= 1000) {
                AccessibilityEvent accessibilityEventG = g(s(uo0Var.g), 131072);
                accessibilityEventG.setFromIndex(g1Var.d);
                accessibilityEventG.setToIndex(g1Var.e);
                accessibilityEventG.setAction(g1Var.b);
                accessibilityEventG.setMovementGranularity(g1Var.c);
                accessibilityEventG.getText().add(m(uo0Var));
                u(accessibilityEventG);
            }
        }
        this.ab = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.nz r58) {
        /*
            Method dump skipped, instruction units count: 1497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1.z(nz):void");
    }
}

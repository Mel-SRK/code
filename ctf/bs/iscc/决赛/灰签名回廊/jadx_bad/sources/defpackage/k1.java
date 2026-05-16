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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

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
    */
    public final void ah() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int iNumberOfTrailingZeros;
        char c2;
        f80 f80Var = new f80();
        f80 f80Var2 = this.ad;
        int[] iArr = f80Var2.b;
        long[] jArr3 = f80Var2.a;
        int length = jArr3.length - 2;
        e80 e80Var = this.aj;
        int i3 = 8;
        if (length >= 0) {
            int i4 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i4];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j5 & 255) < 128) {
                            int i7 = iArr[(i4 << 3) + i6];
                            c2 = c3;
                            xo0 xo0Var = (xo0) l().b(i7);
                            uo0 uo0Var = xo0Var != null ? xo0Var.a : null;
                            if (uo0Var != null) {
                                if (!uo0Var.d.d.c(zo0.d)) {
                                    f80Var.a(i7);
                                    vo0 vo0Var = (vo0) e80Var.b(i7);
                                    if (vo0Var != null) {
                                        Object objG = vo0Var.a.d.g(zo0.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    x(i7, 32, obj);
                                }
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i6++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = f80Var.b;
        long[] jArr4 = f80Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j6 = jArr4[i8];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j6 & j2) < j) {
                            int i11 = iArr2[(i8 << 3) + i10];
                            int iHashCode = Integer.hashCode(i11) * (-862048943);
                            int i12 = iHashCode ^ (iHashCode << 16);
                            int i13 = i12 & 127;
                            int i14 = f80Var2.c;
                            int i15 = (i12 >>> 7) & i14;
                            i = i3;
                            int i16 = 0;
                            while (true) {
                                long[] jArr5 = f80Var2.a;
                                int i17 = i15 >> 3;
                                jArr2 = jArr4;
                                int i18 = (i15 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i17] >>> i18) | ((jArr5[i17 + 1] << (64 - i18)) & ((-i18) >> 63));
                                int i19 = i14;
                                long j8 = (((long) i13) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j9) >> 3)) & i19;
                                    int i20 = i19;
                                    if (f80Var2.b[iNumberOfTrailingZeros] == i11) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i19 = i20;
                                }
                                i16 += 8;
                                i15 = (i15 + i16) & i2;
                                jArr4 = jArr2;
                                i14 = i2;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                f80Var2.f(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i3;
                        }
                        j6 = j4 >> i;
                        i10++;
                        i3 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i9 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                jArr4 = jArr;
                i3 = 8;
            }
        }
        e80Var.c();
        nz nzVarL = l();
        int[] iArr3 = nzVarL.b;
        Object[] objArr = nzVarL.c;
        long[] jArr6 = nzVarL.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            uo0 uo0Var2 = ((xo0) objArr[i25]).a;
                            po0 po0Var = uo0Var2.d;
                            cp0 cp0Var = zo0.d;
                            if (po0Var.d.c(cp0Var) && f80Var2.a(i26)) {
                                x(i26, 16, (String) uo0Var2.d.b(cp0Var));
                            }
                            e80Var.g(i26, new vo0(uo0Var2, l()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.ak = new vo0(this.d.getSemanticsOwner().a(), l());
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
    */
    public final Object d(ki kiVar) throws Throwable {
        h1 h1Var;
        g7 g7Var;
        f80 f80Var;
        n9 n9Var;
        f80 f80Var2;
        n9 n9Var2;
        int i;
        long j;
        Object objB;
        if (kiVar instanceof h1) {
            h1Var = (h1) kiVar;
            int i2 = h1Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h1Var.k = i2 - Integer.MIN_VALUE;
            } else {
                h1Var = new h1(this, kiVar);
            }
        }
        Object obj = h1Var.i;
        int i3 = h1Var.k;
        g7 g7Var2 = this.y;
        yj yjVar = yj.d;
        try {
            if (i3 == 0) {
                i60.az(obj);
                f80Var = new f80();
                o9 o9Var = this.z;
                o9Var.getClass();
                n9Var = new n9(o9Var);
                h1Var.g = f80Var;
                h1Var.h = n9Var;
                h1Var.k = 1;
                objB = n9Var.b(h1Var);
                if (objB != yjVar) {
                }
            } else if (i3 == 1) {
                n9Var2 = h1Var.h;
                f80Var2 = h1Var.g;
                i60.az(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i3 != 2) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n9Var2 = h1Var.h;
                f80Var2 = h1Var.g;
                i60.az(obj);
                char c = 2;
                g7Var = g7Var2;
                f80Var = f80Var2;
                g7Var2 = g7Var;
                n9Var = n9Var2;
                h1Var.g = f80Var;
                h1Var.h = n9Var;
                h1Var.k = 1;
                objB = n9Var.b(h1Var);
                if (objB != yjVar) {
                    return yjVar;
                }
                n9 n9Var3 = n9Var;
                f80Var2 = f80Var;
                obj = objB;
                n9Var2 = n9Var3;
                if (((Boolean) obj).booleanValue()) {
                    g7Var2.clear();
                    return wz0.a;
                }
                n9Var2.c();
                if (n()) {
                    int i4 = g7Var2.f;
                    for (int i5 = 0; i5 < i4; i5++) {
                        s20 s20Var = (s20) g7Var2.e[i5];
                        aa(s20Var, f80Var2);
                        ab(s20Var);
                    }
                    f80Var2.d = 0;
                    long[] jArr = f80Var2.a;
                    if (jArr != mm0.a) {
                        try {
                            h7.az(jArr);
                            long[] jArr2 = f80Var2.a;
                            i = f80Var2.c;
                            int i6 = i >> 3;
                            jArr2[i6] = ((~j) & jArr2[i6]) | j;
                        } catch (Throwable th) {
                            th = th;
                            g7Var.clear();
                            throw th;
                        }
                        j = 255 << ((i & 7) << 3);
                        g7Var = g7Var2;
                    } else {
                        g7Var = g7Var2;
                    }
                    f80Var2.e = mm0.a(f80Var2.c) - f80Var2.d;
                    if (!this.al) {
                        this.al = true;
                        this.l.post(this.an);
                    }
                } else {
                    g7Var = g7Var2;
                }
                g7Var.clear();
                this.s.c();
                this.t.c();
                long j2 = this.h;
                h1Var.g = f80Var2;
                h1Var.h = n9Var2;
                c = 2;
                h1Var.k = 2;
            }
        } catch (Throwable th2) {
            th = th2;
            g7Var = g7Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(boolean z, int i, long j) {
        cp0 cp0Var;
        int i2;
        if (!f00.h(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        nz nzVarL = l();
        if (xa0.b(j, 9205357640488583168L) || (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z) {
            cp0Var = zo0.u;
        } else {
            if (z) {
                wc.l();
                return false;
            }
            cp0Var = zo0.t;
        }
        Object[] objArr = nzVarL.c;
        long[] jArr = nzVarL.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j2) < 128) {
                        xo0 xo0Var = (xo0) objArr[(i3 << 3) + i6];
                        tz tzVar = xo0Var.b;
                        float f = tzVar.a;
                        i2 = i4;
                        float f2 = tzVar.b;
                        float f3 = tzVar.c;
                        float f4 = tzVar.d;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                        if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                            Object objG = xo0Var.a.d.d.g(cp0Var);
                            if (objG == null) {
                                objG = null;
                            }
                            qm0 qm0Var = (qm0) objG;
                            if (qm0Var != null) {
                                vm0 vm0Var = qm0Var.a;
                                if (i < 0) {
                                    if (((Number) vm0Var.a()).floatValue() > 0.0f) {
                                        z2 = true;
                                    }
                                } else if (((Number) vm0Var.a()).floatValue() < ((Number) qm0Var.b.a()).floatValue()) {
                                }
                            }
                        }
                    } else {
                        i2 = i4;
                    }
                    j2 >>= i2;
                    i6++;
                    i4 = i2;
                }
                if (i5 != i4) {
                    return z2;
                }
            }
            if (i3 == length) {
                return z2;
            }
            i3++;
        }
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
    */
    public final void t(uo0 uo0Var, vo0 vo0Var) {
        int[] iArr = vz.a;
        f80 f80Var = new f80();
        List listJ = uo0.j(4, uo0Var);
        s20 s20Var = uo0Var.c;
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            uo0 uo0Var2 = (uo0) listJ.get(i);
            nz nzVarL = l();
            int i2 = uo0Var2.g;
            if (nzVarL.a(i2)) {
                if (!vo0Var.b.b(i2)) {
                    o(s20Var);
                    return;
                }
                f80Var.a(i2);
            }
        }
        f80 f80Var2 = vo0Var.b;
        int[] iArr2 = f80Var2.b;
        long[] jArr = f80Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !f80Var.b(iArr2[(i3 << 3) + i5])) {
                            o(s20Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listJ2 = uo0.j(4, uo0Var);
        int size2 = listJ2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            uo0 uo0Var3 = (uo0) listJ2.get(i6);
            vo0 vo0Var2 = (vo0) this.aj.b(uo0Var3.g);
            if (vo0Var2 != null && l().a(uo0Var3.g)) {
                t(uo0Var3, vo0Var2);
            }
        }
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
    */
    public final void z(nz nzVar) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i2;
        int i3;
        Integer num2;
        po0 po0Var;
        uo0 uo0Var;
        int i4;
        boolean z;
        q80 q80Var;
        int i5;
        int i6;
        po0 po0Var2;
        ArrayList arrayList3;
        int i7;
        long j;
        int i8;
        Integer num3;
        int i9;
        q80 q80Var2;
        int i10;
        int i11;
        uo0 uo0Var2;
        tm0 tm0Var;
        boolean z2;
        tm0 tm0Var2;
        boolean z3;
        ov ovVar;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        Integer num4;
        AccessibilityEvent accessibilityEventI;
        Integer num5;
        nz nzVar2 = nzVar;
        ArrayList arrayList4 = this.ao;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = nzVar2.b;
        long[] jArr3 = nzVar2.a;
        int i16 = 2;
        int length = jArr3.length - 2;
        int i17 = 0;
        Integer num6 = 0;
        if (length < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            long j2 = jArr3[i18];
            int i19 = i16;
            int i20 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i21 = 8;
                int i22 = 8 - ((~(i18 - i20)) >>> 31);
                long j3 = j2;
                int i23 = i17;
                while (i23 < i22) {
                    if ((j3 & 255) < 128) {
                        int i24 = iArr3[(i18 << 3) + i23];
                        vo0 vo0Var = (vo0) this.aj.b(i24);
                        if (vo0Var == null) {
                            i = i23;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i2 = i21;
                            i3 = i22;
                            num2 = num6;
                        } else {
                            po0 po0Var3 = vo0Var.a;
                            q80 q80Var3 = po0Var3.d;
                            xo0 xo0Var = (xo0) nzVar2.b(i24);
                            uo0 uo0Var3 = xo0Var != null ? xo0Var.a : null;
                            if (uo0Var3 == null) {
                                throw n5.f("no value for specified key");
                            }
                            int i25 = i21;
                            int i26 = uo0Var3.g;
                            po0 po0Var4 = uo0Var3.d;
                            iArr2 = iArr3;
                            q80 q80Var4 = po0Var4.d;
                            jArr2 = jArr3;
                            Object[] objArr = q80Var4.b;
                            Object[] objArr2 = q80Var4.c;
                            long[] jArr4 = q80Var4.a;
                            i = i23;
                            int length2 = jArr4.length - 2;
                            boolean z4 = true;
                            if (length2 >= 0) {
                                i3 = i22;
                                uo0 uo0Var4 = uo0Var3;
                                int i27 = 0;
                                z = false;
                                while (true) {
                                    long j4 = jArr4[i27];
                                    int i28 = i27;
                                    int i29 = i26;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i30 = 8 - ((~(i28 - length2)) >>> 31);
                                        int i31 = 0;
                                        while (i31 < i30) {
                                            if ((j4 & 255) < 128) {
                                                int i32 = (i28 << 3) + i31;
                                                Object obj = objArr[i32];
                                                int i33 = length2;
                                                Object obj2 = objArr2[i32];
                                                po0Var2 = po0Var3;
                                                cp0 cp0Var = (cp0) obj;
                                                i7 = i31;
                                                cp0 cp0Var2 = zo0.t;
                                                if (f00.h(cp0Var, cp0Var2)) {
                                                    j = j4;
                                                } else {
                                                    j = j4;
                                                    if (!f00.h(cp0Var, zo0.u)) {
                                                        z2 = false;
                                                    }
                                                    if (z2) {
                                                        cp0 cp0Var3 = zo0.d;
                                                        if (f00.h(cp0Var, cp0Var3)) {
                                                            obj2.getClass();
                                                            String str2 = (String) obj2;
                                                            if (q80Var3.c(cp0Var3)) {
                                                                x(i24, i25, str2);
                                                            }
                                                        } else if (f00.h(cp0Var, zo0.b) || f00.h(cp0Var, zo0.ah)) {
                                                            num3 = num6;
                                                            q80Var2 = q80Var3;
                                                            arrayList3 = arrayList5;
                                                            i10 = i29;
                                                            i9 = i24;
                                                            uo0Var2 = uo0Var4;
                                                            i11 = i33;
                                                            i8 = 8;
                                                            w(this, s(i9), 2048, 64, 8);
                                                            w(this, s(i9), 2048, num3, 8);
                                                        } else {
                                                            if (f00.h(cp0Var, zo0.c)) {
                                                                i8 = 8;
                                                                w(this, s(i24), 2048, 64, 8);
                                                                w(this, s(i24), 2048, num6, 8);
                                                                num3 = num6;
                                                            } else if (f00.h(cp0Var, zo0.ag)) {
                                                                Object objG = q80Var4.g(zo0.w);
                                                                if (objG == null) {
                                                                    objG = null;
                                                                }
                                                                w(this, s(i24), 2048, 64, 8);
                                                                w(this, s(i24), 2048, num6, 8);
                                                                num3 = num6;
                                                                i8 = 8;
                                                            } else if (f00.h(cp0Var, zo0.a)) {
                                                                int iS = s(i24);
                                                                obj2.getClass();
                                                                v(iS, 2048, 4, (List) obj2);
                                                            } else {
                                                                cp0 cp0Var4 = zo0.ad;
                                                                String str3 = "";
                                                                if (!f00.h(cp0Var, cp0Var4)) {
                                                                    Integer num7 = num6;
                                                                    q80Var2 = q80Var3;
                                                                    arrayList3 = arrayList5;
                                                                    i9 = i24;
                                                                    cp0 cp0Var5 = zo0.ae;
                                                                    if (f00.h(cp0Var, cp0Var5)) {
                                                                        Object objG2 = q80Var4.g(cp0Var4);
                                                                        if (objG2 == null) {
                                                                            objG2 = null;
                                                                        }
                                                                        b6 b6Var = (b6) objG2;
                                                                        if (b6Var != null && (str = b6Var.e) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j5 = ((hx0) po0Var4.b(cp0Var5)).a;
                                                                        num3 = num7;
                                                                        u(i(s(i9), Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) (j5 & 4294967295L)), Integer.valueOf(str3.length()), ag(str3)));
                                                                        i10 = i29;
                                                                        y(i10);
                                                                        uo0Var2 = uo0Var4;
                                                                        i11 = i33;
                                                                    } else {
                                                                        i10 = i29;
                                                                        i11 = i33;
                                                                        num3 = num7;
                                                                        if (f00.h(cp0Var, cp0Var2) || f00.h(cp0Var, zo0.u)) {
                                                                            uo0 uo0Var5 = uo0Var4;
                                                                            o(uo0Var5.c);
                                                                            int size = arrayList4.size();
                                                                            int i34 = 0;
                                                                            while (true) {
                                                                                if (i34 >= size) {
                                                                                    uo0Var2 = uo0Var5;
                                                                                    tm0Var2 = null;
                                                                                    break;
                                                                                }
                                                                                uo0Var2 = uo0Var5;
                                                                                if (((tm0) arrayList4.get(i34)).d == i9) {
                                                                                    tm0Var2 = (tm0) arrayList4.get(i34);
                                                                                    break;
                                                                                } else {
                                                                                    i34++;
                                                                                    uo0Var5 = uo0Var2;
                                                                                }
                                                                            }
                                                                            tm0Var2.getClass();
                                                                            Object objG3 = q80Var4.g(cp0Var2);
                                                                            if (objG3 == null) {
                                                                                objG3 = null;
                                                                            }
                                                                            tm0Var2.h = (qm0) objG3;
                                                                            Object objG4 = q80Var4.g(zo0.u);
                                                                            if (objG4 == null) {
                                                                                objG4 = null;
                                                                            }
                                                                            tm0Var2.i = (qm0) objG4;
                                                                            if (tm0Var2.e.contains(tm0Var2)) {
                                                                                this.d.getSnapshotObserver().a(tm0Var2, this.ap, new s0(1, tm0Var2, this));
                                                                            }
                                                                        } else if (f00.h(cp0Var, zo0.k)) {
                                                                            obj2.getClass();
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i12 = 8;
                                                                                u(g(s(i10), 8));
                                                                            } else {
                                                                                i12 = 8;
                                                                            }
                                                                            w(this, s(i10), 2048, num3, i12);
                                                                            i8 = i12;
                                                                        } else {
                                                                            cp0 cp0Var6 = oo0.v;
                                                                            if (f00.h(cp0Var, cp0Var6)) {
                                                                                List list = (List) po0Var4.b(cp0Var6);
                                                                                Object objG5 = q80Var2.g(cp0Var6);
                                                                                if (objG5 == null) {
                                                                                    objG5 = null;
                                                                                }
                                                                                List list2 = (List) objG5;
                                                                                if (list2 != null) {
                                                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                    if (list.size() > 0) {
                                                                                        list.get(0).getClass();
                                                                                        wc.c();
                                                                                        return;
                                                                                    }
                                                                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                    if (list2.size() > 0) {
                                                                                        list2.get(0).getClass();
                                                                                        wc.c();
                                                                                        return;
                                                                                    }
                                                                                    z = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                                                                } else if (!list.isEmpty()) {
                                                                                    z = true;
                                                                                }
                                                                                uo0Var2 = uo0Var4;
                                                                            } else if (obj2 instanceof ah) {
                                                                                ah ahVar = (ah) obj2;
                                                                                Object objG6 = q80Var2.g(cp0Var);
                                                                                if (objG6 == null) {
                                                                                    objG6 = null;
                                                                                }
                                                                                if (ahVar != objG6) {
                                                                                    if (objG6 instanceof ah) {
                                                                                        String str4 = ahVar.a;
                                                                                        ah ahVar2 = (ah) objG6;
                                                                                        ov ovVar2 = ahVar2.b;
                                                                                        z3 = f00.h(str4, ahVar2.a) && ((ovVar = ahVar.b) != null || ovVar2 == null) && (ovVar == null || ovVar2 != null);
                                                                                        if (!z3) {
                                                                                            z = false;
                                                                                        }
                                                                                        uo0Var2 = uo0Var4;
                                                                                    }
                                                                                    if (!z3) {
                                                                                    }
                                                                                    uo0Var2 = uo0Var4;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    i8 = 8;
                                                                } else if (q80Var4.c(oo0.i)) {
                                                                    Object objG7 = q80Var3.g(cp0Var4);
                                                                    if (objG7 == null) {
                                                                        objG7 = null;
                                                                    }
                                                                    b6 b6Var2 = (b6) objG7;
                                                                    if (b6Var2 == null) {
                                                                        b6Var2 = "";
                                                                    }
                                                                    Object objG8 = q80Var4.g(cp0Var4);
                                                                    if (objG8 == null) {
                                                                        objG8 = null;
                                                                    }
                                                                    CharSequence charSequence = (b6) objG8;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    CharSequence charSequenceAg = ag(charSequence);
                                                                    int length3 = b6Var2.length();
                                                                    int length4 = charSequence.length();
                                                                    Integer num8 = num6;
                                                                    int i35 = length3 > length4 ? length4 : length3;
                                                                    arrayList3 = arrayList5;
                                                                    int i36 = 0;
                                                                    while (true) {
                                                                        i13 = i35;
                                                                        if (i36 >= i35) {
                                                                            i14 = length3;
                                                                            break;
                                                                        }
                                                                        i14 = length3;
                                                                        if (b6Var2.charAt(i36) != charSequence.charAt(i36)) {
                                                                            break;
                                                                        }
                                                                        i36++;
                                                                        i35 = i13;
                                                                        length3 = i14;
                                                                    }
                                                                    int i37 = 0;
                                                                    while (true) {
                                                                        if (i37 >= i13 - i36) {
                                                                            i15 = i37;
                                                                            break;
                                                                        }
                                                                        i15 = i37;
                                                                        if (b6Var2.charAt((i14 - 1) - i37) != charSequence.charAt((length4 - 1) - i15)) {
                                                                            break;
                                                                        } else {
                                                                            i37 = i15 + 1;
                                                                        }
                                                                    }
                                                                    int i38 = (i14 - i15) - i36;
                                                                    int i39 = (length4 - i15) - i36;
                                                                    cp0 cp0Var7 = zo0.ai;
                                                                    boolean zC = q80Var3.c(cp0Var7);
                                                                    boolean zC2 = q80Var4.c(cp0Var7);
                                                                    boolean zC3 = q80Var3.c(zo0.ad);
                                                                    boolean z5 = zC3 && !zC && zC2;
                                                                    boolean z6 = zC3 && zC && !zC2;
                                                                    if (z5 || z6) {
                                                                        int iS2 = s(i24);
                                                                        Integer numValueOf = Integer.valueOf(length4);
                                                                        i9 = i24;
                                                                        q80Var2 = q80Var3;
                                                                        num4 = num8;
                                                                        accessibilityEventI = i(iS2, num4, num8, numValueOf, charSequenceAg);
                                                                    } else {
                                                                        accessibilityEventI = g(s(i24), 16);
                                                                        accessibilityEventI.setFromIndex(i36);
                                                                        accessibilityEventI.setRemovedCount(i38);
                                                                        accessibilityEventI.setAddedCount(i39);
                                                                        accessibilityEventI.setBeforeText(b6Var2);
                                                                        accessibilityEventI.getText().add(charSequenceAg);
                                                                        i9 = i24;
                                                                        q80Var2 = q80Var3;
                                                                        num4 = num8;
                                                                    }
                                                                    accessibilityEventI.setClassName("android.widget.EditText");
                                                                    u(accessibilityEventI);
                                                                    if (z5 || z6) {
                                                                        num5 = num4;
                                                                        long j6 = ((hx0) po0Var4.b(zo0.ae)).a;
                                                                        accessibilityEventI.setFromIndex((int) (j6 >> 32));
                                                                        accessibilityEventI.setToIndex((int) (j6 & 4294967295L));
                                                                        u(accessibilityEventI);
                                                                    } else {
                                                                        num5 = num4;
                                                                    }
                                                                    i10 = i29;
                                                                    i11 = i33;
                                                                    num3 = num5;
                                                                    i8 = 8;
                                                                } else {
                                                                    Integer num9 = num6;
                                                                    q80Var2 = q80Var3;
                                                                    arrayList3 = arrayList5;
                                                                    i9 = i24;
                                                                    i8 = 8;
                                                                    w(this, s(i9), 2048, Integer.valueOf(i19), 8);
                                                                    i10 = i29;
                                                                    i11 = i33;
                                                                    num3 = num9;
                                                                }
                                                            }
                                                            q80Var2 = q80Var3;
                                                            arrayList3 = arrayList5;
                                                            i10 = i29;
                                                            i9 = i24;
                                                            uo0Var2 = uo0Var4;
                                                            i11 = i33;
                                                        }
                                                        num3 = num6;
                                                        q80Var2 = q80Var3;
                                                        arrayList3 = arrayList5;
                                                        i10 = i29;
                                                        i8 = 8;
                                                        i9 = i24;
                                                        uo0Var2 = uo0Var4;
                                                        i11 = i33;
                                                    } else {
                                                        Object objG9 = q80Var3.g(cp0Var);
                                                        if (objG9 == null) {
                                                            objG9 = null;
                                                        }
                                                        if (f00.h(obj2, objG9)) {
                                                            num3 = num6;
                                                            q80Var2 = q80Var3;
                                                            arrayList3 = arrayList5;
                                                            i8 = i25;
                                                        }
                                                        i10 = i29;
                                                        i9 = i24;
                                                        uo0Var2 = uo0Var4;
                                                        i11 = i33;
                                                    }
                                                    long j7 = j >> i8;
                                                    i25 = i8;
                                                    uo0Var4 = uo0Var2;
                                                    i31 = i7 + 1;
                                                    i29 = i10;
                                                    length2 = i11;
                                                    i24 = i9;
                                                    num6 = num3;
                                                    arrayList5 = arrayList3;
                                                    q80Var3 = q80Var2;
                                                    j4 = j7;
                                                    po0Var3 = po0Var2;
                                                }
                                                int size2 = arrayList5.size();
                                                int i40 = 0;
                                                while (true) {
                                                    if (i40 >= size2) {
                                                        tm0Var = null;
                                                        break;
                                                    }
                                                    int i41 = size2;
                                                    if (((tm0) arrayList5.get(i40)).d == i24) {
                                                        tm0Var = (tm0) arrayList5.get(i40);
                                                        break;
                                                    } else {
                                                        i40++;
                                                        size2 = i41;
                                                    }
                                                }
                                                if (tm0Var != null) {
                                                    z2 = false;
                                                } else {
                                                    tm0Var = new tm0(i24, arrayList4);
                                                    z2 = true;
                                                }
                                                arrayList4.add(tm0Var);
                                                if (z2) {
                                                }
                                                long j72 = j >> i8;
                                                i25 = i8;
                                                uo0Var4 = uo0Var2;
                                                i31 = i7 + 1;
                                                i29 = i10;
                                                length2 = i11;
                                                i24 = i9;
                                                num6 = num3;
                                                arrayList5 = arrayList3;
                                                q80Var3 = q80Var2;
                                                j4 = j72;
                                                po0Var3 = po0Var2;
                                            } else {
                                                po0Var2 = po0Var3;
                                                arrayList3 = arrayList5;
                                                i7 = i31;
                                                j = j4;
                                                i8 = i25;
                                                num3 = num6;
                                                i9 = i24;
                                                q80Var2 = q80Var3;
                                                i10 = i29;
                                                i11 = length2;
                                            }
                                            uo0Var2 = uo0Var4;
                                            long j722 = j >> i8;
                                            i25 = i8;
                                            uo0Var4 = uo0Var2;
                                            i31 = i7 + 1;
                                            i29 = i10;
                                            length2 = i11;
                                            i24 = i9;
                                            num6 = num3;
                                            arrayList5 = arrayList3;
                                            q80Var3 = q80Var2;
                                            j4 = j722;
                                            po0Var3 = po0Var2;
                                        }
                                        num2 = num6;
                                        po0Var = po0Var3;
                                        q80Var = q80Var3;
                                        arrayList2 = arrayList5;
                                        i5 = i29;
                                        i4 = i24;
                                        uo0Var = uo0Var4;
                                        i6 = length2;
                                        if (i30 != i25) {
                                            break;
                                        }
                                    } else {
                                        num2 = num6;
                                        po0Var = po0Var3;
                                        q80Var = q80Var3;
                                        arrayList2 = arrayList5;
                                        i5 = i29;
                                        i4 = i24;
                                        uo0Var = uo0Var4;
                                        i6 = length2;
                                    }
                                    if (i28 == i6) {
                                        break;
                                    }
                                    i27 = i28 + 1;
                                    i26 = i5;
                                    length2 = i6;
                                    i24 = i4;
                                    num6 = num2;
                                    q80Var3 = q80Var;
                                    uo0Var4 = uo0Var;
                                    po0Var3 = po0Var;
                                    arrayList5 = arrayList2;
                                    i25 = 8;
                                }
                            } else {
                                po0Var = po0Var3;
                                arrayList2 = arrayList5;
                                i3 = i22;
                                uo0Var = uo0Var3;
                                num2 = num6;
                                i4 = i24;
                                z = false;
                            }
                            if (!z) {
                                Iterator it = po0Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z4 = false;
                                        break;
                                    } else {
                                        if (!uo0Var.k().d.c((cp0) ((Map.Entry) it.next()).getKey())) {
                                            break;
                                        }
                                    }
                                }
                                z = z4;
                            }
                            if (z) {
                                i2 = 8;
                                w(this, s(i4), 2048, num2, 8);
                            } else {
                                i2 = 8;
                            }
                        }
                    }
                    j3 >>= i2;
                    i23 = i + 1;
                    nzVar2 = nzVar;
                    i21 = i2;
                    num6 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i22 = i3;
                    arrayList5 = arrayList2;
                }
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i42 = i21;
                int i43 = i22;
                num = num6;
                if (i43 != i42) {
                    return;
                }
            } else {
                num = num6;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
            }
            if (i18 == i20) {
                return;
            }
            i18++;
            nzVar2 = nzVar;
            num6 = num;
            i16 = i19;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            i17 = 0;
            length = i20;
        }
    }
}

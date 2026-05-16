package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.foundation.layout.b;
import com.example.gnd.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class pk {
    public static final jq b;
    public static final jq g;
    public static Method i = null;
    public static Method j = null;
    public static boolean k = false;
    public static boolean l = false;
    public static Method m;
    public static final ji[] a = new ji[0];
    public static final dn c = new dn();
    public static final Object d = new Object();
    public static final byte[] e = {112, 114, 111, 0};
    public static final byte[] f = {112, 114, 109, 0};
    public static final h01 h = new h01(0, 0);

    static {
        int i2 = 1;
        b = new jq("CLOSED", i2);
        g = new jq("NO_VALUE", i2);
    }

    public static final j2 a(String str) {
        Set setSingleton = Collections.singleton(str);
        setSingleton.getClass();
        return new j2(setSingleton);
    }

    public static String aa(String str, String str2, byte[] bArr) {
        byte[] bArr2 = e00.r;
        byte[] bArr3 = e00.s;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static nj ab(nj njVar, oj ojVar) {
        ojVar.getClass();
        if (f00.h(njVar.getKey(), ojVar)) {
            return njVar;
        }
        return null;
    }

    public static final String[] ac(nh nhVar) {
        nhVar.getClass();
        return (String[]) ((j2) nhVar).b.toArray(new String[0]);
    }

    public static final int ad(vf vfVar) {
        vfVar.getClass();
        return Long.hashCode(vfVar.ar);
    }

    public static final String ae(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final boolean af(uo0 uo0Var) {
        Object objG = uo0Var.d.d.g(zo0.ah);
        if (objG == null) {
            objG = null;
        }
        by0 by0Var = (by0) objG;
        q80 q80Var = uo0Var.d.d;
        Object objG2 = q80Var.g(zo0.w);
        if (objG2 == null) {
            objG2 = null;
        }
        boolean z = by0Var != null;
        Object objG3 = q80Var.g(zo0.ag);
        if (((Boolean) (objG3 != null ? objG3 : null)) != null) {
            return true;
        }
        return z;
    }

    public static final String ag(uo0 uo0Var, Resources resources) {
        int iOrdinal;
        po0 po0Var = uo0Var.d;
        po0 po0Var2 = uo0Var.d;
        Object objG = po0Var.d.g(zo0.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        q80 q80Var = po0Var2.d;
        Object objG2 = q80Var.g(zo0.ah);
        if (objG2 == null) {
            objG2 = null;
        }
        by0 by0Var = (by0) objG2;
        Object objG3 = q80Var.g(zo0.w);
        if (objG3 == null) {
            objG3 = null;
        }
        if (by0Var != null && (iOrdinal = by0Var.ordinal()) != 0 && iOrdinal != 1) {
            if (iOrdinal != 2) {
                wc.l();
                return null;
            }
            if (objG == null) {
                objG = resources.getString(R.string.indeterminate);
            }
        }
        Object objG4 = q80Var.g(zo0.ag);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (objG == null) {
                objG = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objG5 = q80Var.g(zo0.c);
        if (objG5 == null) {
            objG5 = null;
        }
        vh0 vh0Var = (vh0) objG5;
        if (vh0Var != null) {
            if (vh0Var != vh0.b) {
                if (objG == null) {
                    objG = resources.getString(R.string.template_percent, 0);
                }
            } else if (objG == null) {
                objG = resources.getString(R.string.in_progress);
            }
        }
        cp0 cp0Var = zo0.ad;
        if (q80Var.c(cp0Var)) {
            q80 q80Var2 = new uo0(uo0Var.a, true, uo0Var.c, po0Var2).k().d;
            Object objG6 = q80Var2.g(zo0.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = q80Var2.g(zo0.z);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = q80Var2.g(cp0Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final b6 ah(uo0 uo0Var) {
        Object objG = uo0Var.d.d.g(zo0.ad);
        if (objG == null) {
            objG = null;
        }
        b6 b6Var = (b6) objG;
        Object objG2 = uo0Var.d.d.g(zo0.z);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return b6Var == null ? list != null ? (b6) kc.as(list) : null : b6Var;
    }

    public static final o70 ai(pj pjVar) {
        o70 o70Var = (o70) pjVar.k(bw.af);
        if (o70Var != null) {
            return o70Var;
        }
        wc.q("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final l50 aj(l50 l50Var) {
        s20 s20Var = l50Var.r.r;
        while (true) {
            s20 s20VarQ = s20Var.q();
            s20 s20Var2 = null;
            if ((s20VarQ != null ? s20VarQ.j : null) == null) {
                l50 l50VarB = ((fa0) s20Var.ag.h).B();
                l50VarB.getClass();
                return l50VarB;
            }
            s20 s20VarQ2 = s20Var.q();
            if (s20VarQ2 != null) {
                s20Var2 = s20VarQ2.j;
            }
            s20Var2.getClass();
            s20 s20VarQ3 = s20Var.q();
            s20VarQ3.getClass();
            s20Var = s20VarQ3.j;
            s20Var.getClass();
        }
    }

    public static final void ak(vf vfVar, gv gvVar) {
        gvVar.getClass();
        az0.p(2, gvVar);
        gvVar.f(vfVar, 1);
    }

    public static q60 al(bl0 bl0Var, int i2, int i3, int i4, int i5, int i6, r60 r60Var, List list, lf0[] lf0VarArr, int i7) throws Throwable {
        int[] iArr;
        float f2;
        String str;
        long j2;
        int i8;
        int i9;
        int iT;
        int i10;
        String str2;
        int i11;
        int i12;
        int i13;
        float f3;
        boolean z;
        float f4;
        int i14;
        int i15;
        List list2 = list;
        int i16 = i7;
        long j3 = i6;
        int[] iArr2 = new int[i16];
        float f5 = 0.0f;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int iMin = 0;
        int iMax = 0;
        while (i17 < i16) {
            k60 k60Var = (k60) list2.get(i17);
            float fAd = t1.ad(t1.ac(k60Var));
            if (fAd > 0.0f) {
                f5 += fAd;
                i18++;
                i14 = i17;
            } else {
                int i20 = i4 - i19;
                lf0 lf0VarE = lf0VarArr[i17];
                if (lf0VarE == null) {
                    i14 = i17;
                    f4 = f5;
                    i15 = i20;
                    lf0VarE = k60Var.e(bl0Var.e(0, i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i20 < 0 ? 0 : i20, i5, false));
                } else {
                    f4 = f5;
                    i14 = i17;
                    i15 = i20;
                }
                lf0 lf0Var = lf0VarE;
                int i21 = bl0Var.i(lf0Var);
                int iF = bl0Var.f(lf0Var);
                iArr2[i14] = i21;
                int i22 = i15 - i21;
                if (i22 < 0) {
                    i22 = 0;
                }
                iMin = Math.min(i6, i22);
                i19 += i21 + iMin;
                iMax = Math.max(iMax, iF);
                lf0VarArr[i14] = lf0Var;
                f5 = f4;
            }
            i17 = i14 + 1;
        }
        float f6 = f5;
        int i23 = iMax;
        if (i18 != 0) {
            int i24 = i4 != Integer.MAX_VALUE ? i4 : i2;
            long j4 = ((long) (i18 - 1)) * j3;
            iArr = iArr2;
            long j5 = ((long) (i24 - i19)) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f7 = j5 / f6;
            long jRound = j5;
            int i25 = 0;
            while (true) {
                f2 = f7;
                str = "fixedSpace ";
                j2 = j5;
                if (i25 >= i16) {
                    break;
                }
                int i26 = i25;
                float fAd2 = t1.ad(t1.ac((k60) list2.get(i25)));
                float f8 = f2 * fAd2;
                try {
                    jRound -= (long) Math.round(f8);
                    i25 = i26 + 1;
                    list2 = list;
                    f7 = f2;
                    j5 = j2;
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i4 + "mainAxisMin " + i2 + "targetSpace " + i24 + "arrangementSpacingPx " + j3 + "weightChildrenCount " + i18 + "fixedSpace " + i19 + "arrangementSpacingTotal " + j4 + "remainingToTarget " + j2 + "totalWeight " + f6 + "weightUnitSpace " + f2 + "itemWeight " + fAd2 + "weightedSize " + f8).initCause(e2);
                }
            }
            int i27 = i23;
            int i28 = 0;
            int i29 = 0;
            while (true) {
                long j6 = j2;
                if (i29 >= i16) {
                    i8 = i19;
                    i9 = 0;
                    i23 = i27;
                    iT = i60.t((int) (((long) i28) + j4), 0, i4 - i8);
                    break;
                }
                if (lf0VarArr[i29] == null) {
                    i10 = i29;
                    k60 k60Var2 = (k60) list.get(i29);
                    cl0 cl0VarAc = t1.ac(k60Var2);
                    i11 = i19;
                    float fAd3 = t1.ad(cl0VarAc);
                    if (fAd3 <= 0.0f) {
                        wc.q("All weights <= 0 should have placeables");
                        return null;
                    }
                    int iSignum = Long.signum(jRound);
                    str2 = str;
                    int i30 = i18;
                    jRound -= (long) iSignum;
                    float f9 = f2 * fAd3;
                    int iMax2 = Math.max(0, Math.round(f9) + iSignum);
                    if (cl0VarAc != null) {
                        try {
                            z = cl0VarAc.b;
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            f3 = f9;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i4 + "mainAxisMin " + i2 + "targetSpace " + i24 + "arrangementSpacingPx " + j3 + "weightChildrenCount " + i30 + str2 + i11 + "arrangementSpacingTotal " + j4 + "remainingToTarget " + j6 + "totalWeight " + f6 + "weightUnitSpace " + f2 + "weight " + fAd3 + "weightedSize " + f3 + "crossAxisDesiredSize nullremainderUnit " + iSignum + "childMainAxisSize " + iMax2).initCause(e);
                        }
                    } else {
                        z = true;
                    }
                    f3 = f9;
                    try {
                        lf0 lf0VarE2 = k60Var2.e(bl0Var.e((!z || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i5, true));
                        int i31 = bl0Var.i(lf0VarE2);
                        int iF2 = bl0Var.f(lf0VarE2);
                        iArr[i10] = i31;
                        i13 = i28 + i31;
                        int iMax3 = Math.max(i27, iF2);
                        lf0VarArr[i10] = lf0VarE2;
                        i27 = iMax3;
                        i12 = i30;
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i4 + "mainAxisMin " + i2 + "targetSpace " + i24 + "arrangementSpacingPx " + j3 + "weightChildrenCount " + i30 + str2 + i11 + "arrangementSpacingTotal " + j4 + "remainingToTarget " + j6 + "totalWeight " + f6 + "weightUnitSpace " + f2 + "weight " + fAd3 + "weightedSize " + f3 + "crossAxisDesiredSize nullremainderUnit " + iSignum + "childMainAxisSize " + iMax2).initCause(e);
                    }
                } else {
                    i10 = i29;
                    str2 = str;
                    i11 = i19;
                    i12 = i18;
                    i13 = i28;
                }
                j2 = j6;
                i29 = i10 + 1;
                i28 = i13;
                i18 = i12;
                i19 = i11;
                str = str2;
                i16 = i7;
            }
        } else {
            iArr = iArr2;
            i8 = i19 - iMin;
            i9 = 0;
            iT = 0;
        }
        int i32 = i8 + iT;
        if (i32 < 0) {
            i32 = i9;
        }
        int iMax4 = Math.max(i32, i2);
        int iMax5 = Math.max(i23, Math.max(i3, i9));
        int[] iArr3 = new int[i7];
        for (int i33 = i9; i33 < i7; i33++) {
            iArr3[i33] = i9;
        }
        bl0Var.c(iMax4, r60Var, iArr, iArr3);
        return bl0Var.a(lf0VarArr, r60Var, iArr3, iMax4, iMax5);
    }

    public static pj am(nj njVar, oj ojVar) {
        ojVar.getClass();
        return f00.h(njVar.getKey(), ojVar) ? pq.d : njVar;
    }

    public static pj an(nj njVar, pj pjVar) {
        pjVar.getClass();
        return pjVar == pq.d ? njVar : (pj) pjVar.r(new md(5, (byte) 0), njVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150 A[PHI: r20 r21 r22 r23 r24 r25 r26 r27 r28
      0x0150: PHI (r20v6 i2) = (r20v5 i2), (r20v7 i2) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r21v6 boolean) = (r21v5 boolean), (r21v7 boolean) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r22v7 by0) = (r22v6 by0), (r22v8 by0) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r23v6 nh) = (r23v5 nh), (r23v7 nh) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r24v6 java.lang.Boolean) = (r24v5 java.lang.Boolean), (r24v7 java.lang.Boolean) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r25v6 sk0) = (r25v5 sk0), (r25v7 sk0) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r26v6 boolean) = (r26v5 boolean), (r26v7 boolean) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r27v6 java.lang.Integer) = (r27v5 java.lang.Integer), (r27v7 java.lang.Integer) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r28v8 b6) = (r28v7 b6), (r28v9 b6) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ao(ViewStructure viewStructure, s20 s20Var, AutofillId autofillId, String str, si0 si0Var) {
        int i2;
        long j2;
        long j3;
        char c2;
        long j4;
        by0 by0Var;
        b6 b6Var;
        i2 i2Var;
        boolean z;
        nh nhVar;
        Boolean bool;
        sk0 sk0Var;
        boolean z2;
        Integer num;
        Integer num2;
        List list;
        boolean z3;
        String[] strArrAc;
        String[] strArrAc2;
        q80 q80Var;
        int i3;
        int i4;
        q80 q80Var2;
        by0 by0Var2;
        b6 b6Var2;
        Integer num3 = 1;
        cp0 cp0Var = zo0.a;
        cp0 cp0Var2 = oo0.a;
        po0 po0VarS = s20Var.s();
        int i5 = 8;
        if (po0VarS == null || (q80Var2 = po0VarS.d) == null) {
            i2 = 2;
            j2 = 128;
            j3 = 255;
            c2 = 7;
            j4 = -9187201950435737472L;
            by0Var = null;
            b6Var = null;
            i2Var = null;
            z = false;
            nhVar = null;
            bool = null;
            sk0Var = null;
            z2 = false;
            num = null;
        } else {
            j2 = 128;
            Object[] objArr = q80Var2.b;
            Object[] objArr2 = q80Var2.c;
            long[] jArr = q80Var2.a;
            j3 = 255;
            int length = jArr.length - 2;
            i2 = 2;
            if (length >= 0) {
                int i6 = 0;
                i2Var = null;
                z = false;
                by0Var2 = null;
                nhVar = null;
                bool = null;
                sk0Var = null;
                z2 = false;
                num = null;
                b6Var2 = null;
                c2 = 7;
                while (true) {
                    long j5 = jArr[i6];
                    j4 = -9187201950435737472L;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                Object obj = objArr[i9];
                                Object obj2 = objArr2[i9];
                                cp0 cp0Var3 = (cp0) obj;
                                if (f00.h(cp0Var3, zo0.r)) {
                                    obj2.getClass();
                                    i2Var = (i2) obj2;
                                } else if (f00.h(cp0Var3, zo0.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) kc.as((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (f00.h(cp0Var3, zo0.q)) {
                                    obj2.getClass();
                                    nhVar = (nh) obj2;
                                } else if (f00.h(cp0Var3, zo0.ad)) {
                                    obj2.getClass();
                                    b6Var2 = (b6) obj2;
                                } else if (f00.h(cp0Var3, zo0.k)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (f00.h(cp0Var3, zo0.al)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (f00.h(cp0Var3, zo0.ai)) {
                                    z2 = true;
                                } else if (f00.h(cp0Var3, zo0.w)) {
                                    obj2.getClass();
                                    sk0Var = (sk0) obj2;
                                } else if (f00.h(cp0Var3, zo0.ag)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (f00.h(cp0Var3, zo0.ah)) {
                                    obj2.getClass();
                                    by0Var2 = (by0) obj2;
                                } else if (f00.h(cp0Var3, oo0.b)) {
                                    viewStructure.setClickable(true);
                                } else if (f00.h(cp0Var3, oo0.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (f00.h(cp0Var3, oo0.u)) {
                                    viewStructure.setFocusable(true);
                                } else if (f00.h(cp0Var3, oo0.i)) {
                                    z = true;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        } else if (i6 == length) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            } else {
                c2 = 7;
                j4 = -9187201950435737472L;
                i2Var = null;
                z = false;
                by0Var2 = null;
                nhVar = null;
                bool = null;
                sk0Var = null;
                z2 = false;
                num = null;
                b6Var2 = null;
            }
            by0Var = by0Var2;
            b6Var = b6Var2;
        }
        po0 po0VarS2 = s20Var.s();
        if (po0VarS2 != null && po0VarS2.f && !po0VarS2.g) {
            po0VarS2 = po0VarS2.a();
            m80 m80Var = new m80(((x80) s20Var.k()).d.f);
            m80Var.b(s20Var.k());
            while (m80Var.h()) {
                s20 s20Var2 = (s20) m80Var.j(m80Var.b - 1);
                po0 po0VarS3 = s20Var2.s();
                if (po0VarS3 != null && !po0VarS3.f) {
                    po0VarS2.c(po0VarS3);
                    if (!po0VarS3.g) {
                        m80Var.b(s20Var2.k());
                    }
                }
            }
        }
        if (po0VarS2 == null || (q80Var = po0VarS2.d) == null) {
            num2 = num3;
            list = null;
        } else {
            Object[] objArr3 = q80Var.b;
            Object[] objArr4 = q80Var.c;
            long[] jArr2 = q80Var.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                list = null;
                while (true) {
                    long j6 = jArr2[i10];
                    num2 = num3;
                    if ((((~j6) << c2) & j6 & j4) != j4) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj3 = objArr3[i13];
                                Object obj4 = objArr4[i13];
                                cp0 cp0Var4 = (cp0) obj3;
                                i4 = i5;
                                if (f00.h(cp0Var4, zo0.i)) {
                                    viewStructure.setEnabled(false);
                                } else if (f00.h(cp0Var4, zo0.z)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                i4 = i5;
                            }
                            j6 >>= i4;
                            i12++;
                            i5 = i4;
                        }
                        i3 = i5;
                        if (i11 != i3) {
                            break;
                        }
                    } else {
                        i3 = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i3;
                    num3 = num2;
                }
            }
        }
        Integer numValueOf = Integer.valueOf(s20Var.e);
        if (s20Var.q() == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        Integer numValueOf2 = (i2Var == null && !z) ? by0Var != null ? Integer.valueOf(i2) : null : num2;
        if (numValueOf2 != null) {
            viewStructure.setAutofillType(numValueOf2.intValue());
        }
        if (nhVar != null && (strArrAc2 = ac(nhVar)) != null) {
            viewStructure.setAutofillHints(strArrAc2);
        }
        si0Var.a.b(s20Var.e, new wg0(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (by0Var != null) {
            z3 = true;
            viewStructure.setCheckable(true);
            viewStructure.setChecked(by0Var == by0.d);
        } else {
            z3 = true;
            if (bool != null) {
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
        }
        nh.a.getClass();
        String[] strArrAc3 = ac(mh.b);
        strArrAc3.getClass();
        if (strArrAc3.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        boolean z4 = (z2 || ((nhVar == null || (strArrAc = ac(nhVar)) == null || h7.bb(strArrAc, strArrAc3[0]) < 0) ? false : z3)) ? z3 : false;
        if (z4) {
            viewStructure.setDataIsSensitive(true);
        }
        viewStructure.setVisibility(((fa0) s20Var.ag.h).L() ? 4 : 0);
        if (list != null) {
            int size = list.size();
            String str2 = "";
            for (int i14 = 0; i14 < size; i14++) {
                str2 = str2 + ((b6) list.get(i14)).e + '\n';
            }
            viewStructure.setText(str2);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((x80) s20Var.k()).isEmpty() && sk0Var != null) {
            viewStructure.setClassName("android.widget.Button");
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28 && num != null) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (b6Var != null) {
                viewStructure.setAutofillValue(AutofillValue.forText(b6Var.e));
            }
            if (z4) {
                viewStructure.setInputType(129);
            }
        }
    }

    public static final void ap(vq0 vq0Var, p6 p6Var, int i2) {
        while (true) {
            int i3 = vq0Var.v;
            if (i2 > i3 && i2 < vq0Var.u) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            vq0Var.ak();
            if (vq0Var.w(vq0Var.v)) {
                p6Var.m();
            }
            vq0Var.j();
        }
    }

    public static int[] aq(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iAm = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iAm += (int) d41.am(byteArrayInputStream, 2);
            iArr[i3] = iAm;
        }
        return iArr;
    }

    public static nm[] ar(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, nm[] nmVarArr) throws IOException {
        byte[] bArr3 = e00.t;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, e00.u)) {
                wc.q("Unsupported meta version");
                return null;
            }
            int iAm = (int) d41.am(fileInputStream, 2);
            byte[] bArrAl = d41.al(fileInputStream, (int) d41.am(fileInputStream, 4), (int) d41.am(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                wc.q("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrAl);
            try {
                nm[] nmVarArrAt = at(byteArrayInputStream, bArr2, iAm, nmVarArr);
                byteArrayInputStream.close();
                return nmVarArrAt;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(e00.o, bArr2)) {
            wc.q("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            wc.q("Unsupported meta version");
            return null;
        }
        int iAm2 = (int) d41.am(fileInputStream, 1);
        byte[] bArrAl2 = d41.al(fileInputStream, (int) d41.am(fileInputStream, 4), (int) d41.am(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            wc.q("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrAl2);
        try {
            nm[] nmVarArrAs = as(byteArrayInputStream2, iAm2, nmVarArr);
            byteArrayInputStream2.close();
            return nmVarArrAs;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static nm[] as(ByteArrayInputStream byteArrayInputStream, int i2, nm[] nmVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new nm[0];
        }
        if (i2 != nmVarArr.length) {
            wc.q("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iAm = (int) d41.am(byteArrayInputStream, 2);
            iArr[i3] = (int) d41.am(byteArrayInputStream, 2);
            strArr[i3] = new String(d41.ak(byteArrayInputStream, iAm), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            nm nmVar = nmVarArr[i4];
            if (!nmVar.b.equals(strArr[i4])) {
                wc.q("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            nmVar.e = i5;
            nmVar.h = aq(byteArrayInputStream, i5);
        }
        return nmVarArr;
    }

    public static nm[] at(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, nm[] nmVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new nm[0];
        }
        if (i2 != nmVarArr.length) {
            wc.q("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            d41.am(byteArrayInputStream, 2);
            String str = new String(d41.ak(byteArrayInputStream, (int) d41.am(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jAm = d41.am(byteArrayInputStream, 4);
            int iAm = (int) d41.am(byteArrayInputStream, 2);
            nm nmVar = null;
            if (nmVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= nmVarArr.length) {
                        break;
                    }
                    if (nmVarArr[i4].b.equals(strSubstring)) {
                        nmVar = nmVarArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (nmVar == null) {
                wc.q("Missing profile key: ".concat(str));
                return null;
            }
            nmVar.d = jAm;
            int[] iArrAq = aq(byteArrayInputStream, iAm);
            if (Arrays.equals(bArr, e00.s)) {
                nmVar.e = iAm;
                nmVar.h = iArrAq;
            }
        }
        return nmVarArr;
    }

    public static nm[] au(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, e00.p)) {
            wc.q("Unsupported version");
            return null;
        }
        int iAm = (int) d41.am(fileInputStream, 1);
        byte[] bArrAl = d41.al(fileInputStream, (int) d41.am(fileInputStream, 4), (int) d41.am(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            wc.q("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrAl);
        try {
            nm[] nmVarArrAv = av(byteArrayInputStream, str, iAm);
            byteArrayInputStream.close();
            return nmVarArrAv;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static nm[] av(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new nm[0];
        }
        nm[] nmVarArr = new nm[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iAm = (int) d41.am(byteArrayInputStream, 2);
            int iAm2 = (int) d41.am(byteArrayInputStream, 2);
            nmVarArr[i4] = new nm(str, new String(d41.ak(byteArrayInputStream, iAm), StandardCharsets.UTF_8), d41.am(byteArrayInputStream, 4), iAm2, (int) d41.am(byteArrayInputStream, 4), (int) d41.am(byteArrayInputStream, 4), new int[iAm2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            nm nmVar = nmVarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = nmVar.f;
            int i7 = nmVar.g;
            TreeMap treeMap = nmVar.i;
            int i8 = iAvailable - i6;
            int iAm3 = i3;
            while (byteArrayInputStream.available() > i8) {
                iAm3 += (int) d41.am(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iAm3), 1);
                int iAm4 = (int) d41.am(byteArrayInputStream, 2);
                while (iAm4 > 0) {
                    d41.am(byteArrayInputStream, 2);
                    int iAm5 = (int) d41.am(byteArrayInputStream, 1);
                    if (iAm5 != 6 && iAm5 != 7) {
                        while (iAm5 > 0) {
                            d41.am(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iAm6 = (int) d41.am(byteArrayInputStream, 1); iAm6 > 0; iAm6--) {
                                d41.am(byteArrayInputStream, 2);
                            }
                            iAm5--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iAm4--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                wc.q("Read too much data during profile line parse");
                return null;
            }
            nmVar.h = aq(byteArrayInputStream, nmVar.e);
            BitSet bitSetValueOf = BitSet.valueOf(d41.ak(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return nmVarArr;
    }

    public static final fa0 aw(ql qlVar, int i2) {
        fa0 fa0Var = ((i70) qlVar).d.k;
        fa0Var.getClass();
        if (fa0Var.D() != qlVar || !ga0.g(i2)) {
            return fa0Var;
        }
        fa0 fa0Var2 = fa0Var.s;
        fa0Var2.getClass();
        return fa0Var2;
    }

    public static final fa0 ax(ql qlVar) {
        if (!((i70) qlVar).d.q) {
            sy.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        fa0 fa0VarAw = aw(qlVar, 2);
        if (!fa0VarAw.D().q) {
            sy.b("LayoutCoordinates is not attached.");
        }
        return fa0VarAw;
    }

    public static final s20 ay(ql qlVar) {
        fa0 fa0Var = ((i70) qlVar).d.k;
        if (fa0Var != null) {
            return fa0Var.r;
        }
        throw n5.f("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final b1 az(ql qlVar) {
        b1 b1Var = ay(qlVar).p;
        if (b1Var != null) {
            return b1Var;
        }
        throw n5.f("This node does not have an owner.");
    }

    public static final void b(Object obj, cv cvVar, vf vfVar) {
        boolean zF = vfVar.f(obj);
        Object objAk = vfVar.ak();
        if (zF || objAk == nf.a) {
            objAk = new zm(cvVar);
            vfVar.be(objAk);
        }
    }

    public static final tz ba(ri0 ri0Var) {
        return new tz(Math.round(ri0Var.a), Math.round(ri0Var.b), Math.round(ri0Var.c), Math.round(ri0Var.d));
    }

    public static final void bb(gt gtVar) {
        i70 i70Var;
        da0 da0Var;
        if (!gtVar.d.q) {
            sy.b("visitAncestors called on an unattached node");
        }
        i70 i70Var2 = gtVar.d.h;
        s20 s20VarAy = ay(gtVar);
        loop0: while (true) {
            i70Var = null;
            if (s20VarAy == null) {
                break;
            }
            if ((((i70) s20VarAy.ag.j).g & 1024) != 0) {
                while (i70Var2 != null) {
                    if ((i70Var2.f & 1024) != 0) {
                        i70 i70VarM = i70Var2;
                        a90 a90Var = null;
                        while (i70VarM != null) {
                            if (i70VarM instanceof gt) {
                                i70Var = i70VarM;
                                break loop0;
                            }
                            if ((i70VarM.f & 1024) != 0 && (i70VarM instanceof rl)) {
                                int i2 = 0;
                                for (i70 i70Var3 = ((rl) i70VarM).s; i70Var3 != null; i70Var3 = i70Var3.i) {
                                    if ((i70Var3.f & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            i70VarM = i70Var3;
                                        } else {
                                            if (a90Var == null) {
                                                a90Var = new a90(new i70[16]);
                                            }
                                            if (i70VarM != null) {
                                                a90Var.b(i70VarM);
                                                i70VarM = null;
                                            }
                                            a90Var.b(i70Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            i70VarM = m(a90Var);
                        }
                    }
                    i70Var2 = i70Var2.h;
                }
            }
            s20VarAy = s20VarAy.q();
            i70Var2 = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
        }
        gt gtVar2 = (gt) i70Var;
        if (gtVar2 == null) {
            gtVar.bw();
        } else {
            gtVar2.bw();
            gtVar.bw();
        }
    }

    public static final long bc(long j2, float f2) {
        double d2 = f2;
        int i2 = 0;
        if (!(d2 < 1.0E-4d) && !(d2 > 99.9999d)) {
            w10 w10Var = gd.t;
            long jA = qc.a(j2, w10Var);
            return qc.a(m10.a(f2, qc.g(jA), qc.e(jA), 1.0f, w10Var), gd.e);
        }
        float f3 = 100;
        float f4 = 16;
        float f5 = 116;
        float f6 = (f2 + f4) / f5;
        float f7 = f6 * f6 * f6;
        if (f7 <= 0.008856452f) {
            f7 = ((f5 * f6) - f4) / 903.2963f;
        }
        double d3 = (f7 * f3) / f3;
        double dPow = (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
        if (Double.isNaN(dPow)) {
            wc.n("Cannot round NaN value.");
            return 0L;
        }
        int iRound = dPow > 2.147483647E9d ? Integer.MAX_VALUE : dPow < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(dPow);
        if (iRound >= 0) {
            i2 = 255;
            if (iRound <= 255) {
                i2 = iRound;
            }
        }
        return m10.d(i2, i2, i2);
    }

    public static final Rect bd(tz tzVar) {
        return new Rect(tzVar.a, tzVar.b, tzVar.c, tzVar.d);
    }

    public static final Rect be(ri0 ri0Var) {
        return new Rect((int) ri0Var.a, (int) ri0Var.b, (int) ri0Var.c, (int) ri0Var.d);
    }

    public static final RectF bf(ri0 ri0Var) {
        return new RectF(ri0Var.a, ri0Var.b, ri0Var.c, ri0Var.d);
    }

    public static final ri0 bg(Rect rect) {
        return new ri0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final ri0 bh(RectF rectF) {
        return new ri0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final String bi(ji jiVar) {
        Object sj0Var;
        if (jiVar instanceof sm) {
            return ((sm) jiVar).toString();
        }
        try {
            sj0Var = jiVar + '@' + ae(jiVar);
        } catch (Throwable th) {
            sj0Var = new sj0(th);
        }
        if (tj0.a(sj0Var) != null) {
            sj0Var = jiVar.getClass().getName() + '@' + ae(jiVar);
        }
        return (String) sj0Var;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean bj(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, nm[] nmVarArr) throws IOException {
        long j2;
        int length;
        byte[] bArr2 = e00.s;
        byte[] bArr3 = e00.r;
        byte[] bArr4 = e00.o;
        int i2 = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                d41.au(byteArrayOutputStream2, nmVarArr.length);
                int i3 = 2;
                int i4 = 2;
                for (nm nmVar : nmVarArr) {
                    d41.at(byteArrayOutputStream2, nmVar.c, 4);
                    d41.at(byteArrayOutputStream2, nmVar.d, 4);
                    d41.at(byteArrayOutputStream2, nmVar.g, 4);
                    String strAa = aa(nmVar.a, nmVar.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strAa.getBytes(charset).length;
                    d41.au(byteArrayOutputStream2, length2);
                    i4 = i4 + 14 + length2;
                    byteArrayOutputStream2.write(strAa.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i4 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
                }
                c41 c41Var = new c41(1, byteArray, false);
                byteArrayOutputStream2.close();
                arrayList.add(c41Var);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i5 = 0;
                int i6 = 0;
                while (i5 < nmVarArr.length) {
                    try {
                        nm nmVar2 = nmVarArr[i5];
                        d41.au(byteArrayOutputStream3, i5);
                        d41.au(byteArrayOutputStream3, nmVar2.e);
                        i6 = i6 + 4 + (nmVar2.e * i3);
                        int[] iArr = nmVar2.h;
                        int length3 = iArr.length;
                        int i7 = i2;
                        int i8 = i3;
                        int i9 = i7;
                        while (i9 < length3) {
                            int i10 = iArr[i9];
                            d41.au(byteArrayOutputStream3, i10 - i7);
                            i9++;
                            i7 = i10;
                        }
                        i5++;
                        i3 = i8;
                        i2 = 0;
                    } catch (Throwable th) {
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i6 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
                }
                c41 c41Var2 = new c41(3, byteArray2, true);
                byteArrayOutputStream3.close();
                arrayList.add(c41Var2);
                byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i11 = 0;
                int i12 = 0;
                while (i11 < nmVarArr.length) {
                    try {
                        nm nmVar3 = nmVarArr[i11];
                        Iterator it = nmVar3.i.entrySet().iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            bp(byteArrayOutputStream4, iIntValue, nmVar3);
                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            byteArrayOutputStream4 = new ByteArrayOutputStream();
                            try {
                                bq(byteArrayOutputStream4, nmVar3);
                                byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                d41.au(byteArrayOutputStream3, i11);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i13 = i12 + 6;
                                int i14 = i11;
                                d41.at(byteArrayOutputStream3, length4, 4);
                                d41.au(byteArrayOutputStream3, iIntValue);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i12 = i13 + length4;
                                i11 = i14 + 1;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                        try {
                            byteArrayOutputStream3.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                if (i12 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
                }
                c41 c41Var3 = new c41(4, byteArray5, true);
                byteArrayOutputStream3.close();
                arrayList.add(c41Var3);
                long j3 = 4;
                long size = j3 + j3 + 4 + ((long) (arrayList.size() * 16));
                d41.at(byteArrayOutputStream, arrayList.size(), 4);
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    c41 c41Var4 = (c41) arrayList.get(i15);
                    int i16 = c41Var4.a;
                    byte[] bArr5 = c41Var4.b;
                    if (i16 == 1) {
                        j2 = 0;
                    } else if (i16 == 2) {
                        j2 = 1;
                    } else if (i16 == 3) {
                        j2 = 2;
                    } else if (i16 == 4) {
                        j2 = 3;
                    } else {
                        if (i16 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                    d41.at(byteArrayOutputStream, j2, 4);
                    d41.at(byteArrayOutputStream, size, 4);
                    if (c41Var4.c) {
                        long length5 = bArr5.length;
                        byte[] bArrR = d41.r(bArr5);
                        arrayList2.add(bArrR);
                        d41.at(byteArrayOutputStream, bArrR.length, 4);
                        d41.at(byteArrayOutputStream, length5, 4);
                        length = bArrR.length;
                    } else {
                        arrayList2.add(bArr5);
                        d41.at(byteArrayOutputStream, bArr5.length, 4);
                        d41.at(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += (long) length;
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else {
            byte[] bArr6 = e00.p;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrR2 = r(nmVarArr, bArr6);
                d41.at(byteArrayOutputStream, nmVarArr.length, 1);
                d41.at(byteArrayOutputStream, bArrR2.length, 4);
                byte[] bArrR3 = d41.r(bArrR2);
                d41.at(byteArrayOutputStream, bArrR3.length, 4);
                byteArrayOutputStream.write(bArrR3);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                d41.at(byteArrayOutputStream, nmVarArr.length, 1);
                for (nm nmVar4 : nmVarArr) {
                    int size2 = nmVar4.i.size() * 4;
                    String strAa2 = aa(nmVar4.a, nmVar4.b, bArr3);
                    Charset charset2 = StandardCharsets.UTF_8;
                    d41.au(byteArrayOutputStream, strAa2.getBytes(charset2).length);
                    d41.au(byteArrayOutputStream, nmVar4.h.length);
                    d41.at(byteArrayOutputStream, size2, 4);
                    d41.at(byteArrayOutputStream, nmVar4.c, 4);
                    byteArrayOutputStream.write(strAa2.getBytes(charset2));
                    Iterator it2 = nmVar4.i.keySet().iterator();
                    while (it2.hasNext()) {
                        d41.au(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        d41.au(byteArrayOutputStream, 0);
                    }
                    for (int i18 : nmVar4.h) {
                        d41.au(byteArrayOutputStream, i18);
                    }
                }
            } else {
                byte[] bArr7 = e00.q;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] bArrR4 = r(nmVarArr, bArr7);
                    d41.at(byteArrayOutputStream, nmVarArr.length, 1);
                    d41.at(byteArrayOutputStream, bArrR4.length, 4);
                    byte[] bArrR5 = d41.r(bArrR4);
                    d41.at(byteArrayOutputStream, bArrR5.length, 4);
                    byteArrayOutputStream.write(bArrR5);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                d41.au(byteArrayOutputStream, nmVarArr.length);
                for (nm nmVar5 : nmVarArr) {
                    String str = nmVar5.a;
                    TreeMap treeMap = nmVar5.i;
                    String strAa3 = aa(str, nmVar5.b, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    d41.au(byteArrayOutputStream, strAa3.getBytes(charset3).length);
                    d41.au(byteArrayOutputStream, treeMap.size());
                    d41.au(byteArrayOutputStream, nmVar5.h.length);
                    d41.at(byteArrayOutputStream, nmVar5.c, 4);
                    byteArrayOutputStream.write(strAa3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        d41.au(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i19 : nmVar5.h) {
                        d41.au(byteArrayOutputStream, i19);
                    }
                }
            }
        }
        return true;
    }

    public static final void bk(int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            if (i2 > i3) {
                throw new IllegalArgumentException(n5.g("minLines ", i2, " must be less than or equal to maxLines ", i3).toString());
            }
            return;
        }
        throw new IllegalArgumentException(("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero").toString());
    }

    public static final void bl(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > i3) {
            StringBuilder sb = new StringBuilder("OffsetMapping.originalToTransformed returned invalid mapping: ");
            sb.append(i4);
            sb.append(" -> ");
            sb.append(i2);
            sb.append(" is not in range of transformed text [0, ");
            throw new IllegalStateException(n5.h(sb, i3, ']').toString());
        }
    }

    public static final void bm(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > i3) {
            StringBuilder sb = new StringBuilder("OffsetMapping.transformedToOriginal returned invalid mapping: ");
            sb.append(i4);
            sb.append(" -> ");
            sb.append(i2);
            sb.append(" is not in range of original text [0, ");
            throw new IllegalStateException(n5.h(sb, i3, ']').toString());
        }
    }

    public static void bn(ByteArrayOutputStream byteArrayOutputStream, nm nmVar) throws IOException {
        bq(byteArrayOutputStream, nmVar);
        int i2 = nmVar.g;
        int[] iArr = nmVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            d41.au(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : nmVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void bo(ByteArrayOutputStream byteArrayOutputStream, nm nmVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        d41.au(byteArrayOutputStream, str.getBytes(charset).length);
        d41.au(byteArrayOutputStream, nmVar.e);
        d41.at(byteArrayOutputStream, nmVar.f, 4);
        d41.at(byteArrayOutputStream, nmVar.c, 4);
        d41.at(byteArrayOutputStream, nmVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void bp(ByteArrayOutputStream byteArrayOutputStream, int i2, nm nmVar) throws IOException {
        int i3 = nmVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : nmVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void bq(ByteArrayOutputStream byteArrayOutputStream, nm nmVar) {
        int i2 = 0;
        for (Map.Entry entry : nmVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                d41.au(byteArrayOutputStream, iIntValue - i2);
                d41.au(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static final void c(bb0 bb0Var, bx bxVar, te teVar, vf vfVar, int i2) {
        int i3;
        vfVar.aw(476043083);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? vfVar.f(bb0Var) : vfVar.h(bb0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vfVar.f(bxVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vfVar.h(teVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && vfVar.z()) {
            vfVar.aq();
        } else {
            boolean z = true;
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !vfVar.f(bb0Var))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objAk = vfVar.ak();
            if (z3 || objAk == nf.a) {
                objAk = new ww(bxVar, bb0Var);
                vfVar.be(objAk);
            }
            g4.a((ww) objAk, null, new ch0(false, tn0.d, false), teVar, vfVar, ((i3 << 3) & 7168) | 384, 2);
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new j4(bb0Var, bxVar, teVar, i2, 0);
        }
    }

    public static final void d(vf vfVar, gv gvVar, Object obj) {
        pj pjVar = vfVar.ap;
        boolean zF = vfVar.f(obj);
        Object objAk = vfVar.ak();
        if (zF || objAk == nf.a) {
            objAk = new z10(pjVar, gvVar);
            vfVar.be(objAk);
        }
    }

    public static final void e(Object obj, Object obj2, gv gvVar, vf vfVar) {
        pj pjVar = vfVar.ap;
        boolean zF = vfVar.f(obj) | vfVar.f(obj2);
        Object objAk = vfVar.ak();
        if (zF || objAk == nf.a) {
            objAk = new z10(pjVar, gvVar);
            vfVar.be(objAk);
        }
    }

    public static hq0 f(int i2, m9 m9Var) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        int i4 = (i2 & 2) == 0 ? 16 : 0;
        if (i3 <= 0 && i4 <= 0 && m9Var != m9.d) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + m9Var).toString());
        }
        int i5 = i4 + i3;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new hq0(i3, i5, m9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(bb0 bb0Var, boolean z, oj0 oj0Var, boolean z2, long j2, j70 j70Var, vf vfVar, int i2) {
        int i3;
        int i4;
        long j3;
        boolean z3;
        long j4;
        bb0 bb0Var2 = bb0Var;
        vfVar.aw(-843755800);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? vfVar.f(bb0Var2) : vfVar.h(bb0Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vfVar.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vfVar.f(oj0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vfVar.g(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= vfVar.f(j70Var) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && vfVar.z()) {
            vfVar.aq();
            j4 = j2;
        } else {
            vfVar.as();
            if ((i2 & 1) == 0 || vfVar.x()) {
                i4 = i3 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                vfVar.aq();
                i4 = i3 & (-57345);
                j3 = j2;
            }
            vfVar.r();
            oj0 oj0Var2 = oj0.e;
            oj0 oj0Var3 = oj0.d;
            if (z) {
                float f2 = io0.a;
                z3 = (oj0Var == oj0Var3 && !z2) || (oj0Var == oj0Var2 && z2);
            } else {
                float f3 = io0.a;
                if (!((oj0Var == oj0Var3 && !z2) || (oj0Var == oj0Var2 && z2))) {
                }
            }
            y7 y7Var = z3 ? t1.b : t1.a;
            int i5 = i4 & 14;
            boolean zG = (i5 == 4 || ((i4 & 8) != 0 && vfVar.h(bb0Var2))) | ((i4 & 112) == 32) | vfVar.g(z3);
            Object objAk = vfVar.ak();
            if (zG || objAk == nf.a) {
                objAk = new o4(bb0Var2, z, z3);
                vfVar.be(objAk);
            }
            j70 j70VarA = ro0.a(j70Var, (cv) objAk);
            long j5 = j3;
            bb0Var2 = bb0Var;
            c(bb0Var2, y7Var, t1.aq(280174801, new m4((i11) vfVar.j(og.s), j5, z3, j70VarA, bb0Var), vfVar), vfVar, i5 | 384);
            j4 = j5;
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new n4(bb0Var2, z, oj0Var, z2, j4, j70Var, i2);
        }
    }

    public static final void h(j70 j70Var, pu puVar, boolean z, vf vfVar, int i2) {
        int i3;
        vfVar.aw(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (vfVar.f(j70Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (((i3 | (vfVar.h(puVar) ? 32 : 16) | (vfVar.g(z) ? 256 : 128)) & 147) == 146 && vfVar.z()) {
            vfVar.aq();
        } else {
            qo0.a(vfVar, m10.p(b.e(j70Var, io0.a, io0.b), new s4(puVar, z)));
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new p4(j70Var, puVar, z, i2);
        }
    }

    public static final void i(pu puVar, vf vfVar) {
        vc0 vc0Var = vfVar.al.b.k;
        vc0Var.ar(lc0.c);
        e00.aj(vc0Var, 0, puVar);
    }

    public static final void j(a90 a90Var, i70 i70Var) {
        a90 a90VarU = ay(i70Var).u();
        int i2 = a90VarU.f - 1;
        Object[] objArr = a90VarU.d;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                a90Var.b((i70) ((s20) objArr[i2]).ag.j);
                i2--;
            }
        }
    }

    public static final boolean k(uo0 uo0Var) {
        po0 po0VarK = uo0Var.k();
        return !po0VarK.d.c(zo0.i);
    }

    public static final boolean l(uo0 uo0Var, Resources resources) {
        boolean z;
        Object objG = uo0Var.d.d.g(zo0.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        boolean z2 = ((list != null ? (String) kc.as(list) : null) == null && ah(uo0Var) == null && ag(uo0Var, resources) == null && !af(uo0Var)) ? false : true;
        if (!t1.ag(uo0Var)) {
            if (!uo0Var.d.f) {
                if (!uo0Var.e && uo0.j(4, uo0Var).isEmpty()) {
                    s20 s20VarQ = uo0Var.c.q();
                    while (true) {
                        z = true;
                        if (s20VarQ == null) {
                            s20VarQ = null;
                            break;
                        }
                        po0 po0VarS = s20VarQ.s();
                        if (po0VarS != null && po0VarS.f) {
                            break;
                        }
                        s20VarQ = s20VarQ.q();
                    }
                    if (s20VarQ != null) {
                    }
                    if (z || !z2) {
                    }
                }
                z = false;
                if (z) {
                }
            }
            return true;
        }
        return false;
    }

    public static final i70 m(a90 a90Var) {
        int i2;
        if (a90Var == null || (i2 = a90Var.f) == 0) {
            return null;
        }
        return (i70) a90Var.j(i2 - 1);
    }

    public static final void n(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final l20 o(i70 i70Var) {
        if ((i70Var.f & 2) != 0) {
            if (i70Var instanceof l20) {
                return (l20) i70Var;
            }
            if (i70Var instanceof rl) {
                i70 i70Var2 = ((rl) i70Var).s;
                while (i70Var2 != 0) {
                    if (i70Var2 instanceof l20) {
                        return (l20) i70Var2;
                    }
                    i70Var2 = (!(i70Var2 instanceof rl) || (i70Var2.f & 2) == 0) ? i70Var2.i : ((rl) i70Var2).s;
                }
            }
        }
        return null;
    }

    public static final void p(Closeable closeable, Throwable th) {
        try {
            closeable.close();
        } catch (Throwable th2) {
            t1.g(th, th2);
        }
    }

    public static final xj q(vf vfVar) {
        return new fj0(vfVar.ap);
    }

    public static byte[] r(nm[] nmVarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (nm nmVar : nmVarArr) {
            length += ((((nmVar.g * 2) + 7) & (-8)) / 8) + (nmVar.e * 2) + aa(nmVar.a, nmVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + nmVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, e00.q)) {
            int length2 = nmVarArr.length;
            while (i2 < length2) {
                nm nmVar2 = nmVarArr[i2];
                bo(byteArrayOutputStream, nmVar2, aa(nmVar2.a, nmVar2.b, bArr));
                bn(byteArrayOutputStream, nmVar2);
                i2++;
            }
        } else {
            for (nm nmVar3 : nmVarArr) {
                bo(byteArrayOutputStream, nmVar3, aa(nmVar3.a, nmVar3.b, bArr));
            }
            int length3 = nmVarArr.length;
            while (i2 < length3) {
                bn(byteArrayOutputStream, nmVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final rt s(Context context) {
        n31 n31Var = new n31(2);
        context.getApplicationContext();
        return new rt(n31Var, new z2(Build.VERSION.SDK_INT >= 31 ? ju.a.a(context) : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final c3 t(y9 y9Var, float f2) {
        int iCeil = ((int) Math.ceil(f2)) * 2;
        c3 c3VarC = az0.n;
        e0 e0Var = az0.o;
        ra raVar = az0.p;
        if (c3VarC != null) {
            Bitmap bitmap = c3VarC.a;
            if (e0Var == null || iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                c3VarC = f00.c(iCeil, iCeil, 1);
                az0.n = c3VarC;
                Canvas canvas = f0.a;
                e0Var = new e0();
                e0Var.a = new Canvas(c3VarC.a);
                az0.o = e0Var;
            }
        }
        c3 c3Var = c3VarC;
        e0 e0Var2 = e0Var;
        Bitmap bitmap2 = c3Var.a;
        if (raVar == null) {
            raVar = new ra();
            az0.p = raVar;
        }
        ra raVar2 = raVar;
        qa qaVar = raVar2.d;
        e20 layoutDirection = y9Var.d.getLayoutDirection();
        long jA = lI.a(bitmap2.getWidth(), bitmap2.getHeight());
        em emVar = qaVar.a;
        e20 e20Var = qaVar.b;
        oa oaVar = qaVar.c;
        long j2 = qaVar.d;
        qaVar.a = y9Var;
        qaVar.b = layoutDirection;
        qaVar.c = e0Var2;
        qaVar.d = jA;
        e0Var2.l();
        xo.ab(raVar2, qc.b, raVar2.c(), 58);
        xo.ab(raVar2, m10.c(4278190080L), lI.a(f2, f2), 120);
        xo.at(raVar2, m10.c(4278190080L), f2, d41.h(f2, f2), 120);
        e0Var2.i();
        qaVar.a = emVar;
        qaVar.b = e20Var;
        qaVar.c = oaVar;
        qaVar.d = j2;
        return c3Var;
    }

    public static boolean u(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        int i2 = f11.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = e11.d;
            e11 e11Var = (e11) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (e11Var == null) {
                e11Var = new e11();
                e11Var.a = null;
                e11Var.b = null;
                e11Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, e11Var);
            }
            WeakReference weakReference2 = e11Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                e11Var.c = new WeakReference(keyEvent);
                if (e11Var.b == null) {
                    e11Var.b = new SparseArray();
                }
                SparseArray sparseArray = e11Var.b;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    wc.c();
                    return false;
                }
            }
        }
        return false;
    }

    public static final cy0 v(Context context) {
        yc ycVar = yc.a;
        ycVar.a(context, android.R.color.system_neutral1_0);
        ycVar.a(context, android.R.color.system_neutral1_10);
        bc(ycVar.a(context, android.R.color.system_neutral1_600), 98.0f);
        bc(ycVar.a(context, android.R.color.system_neutral1_600), 96.0f);
        ycVar.a(context, android.R.color.system_neutral1_50);
        bc(ycVar.a(context, android.R.color.system_neutral1_600), 94.0f);
        bc(ycVar.a(context, android.R.color.system_neutral1_600), 92.0f);
        ycVar.a(context, android.R.color.system_neutral1_100);
        bc(ycVar.a(context, android.R.color.system_neutral1_600), 87.0f);
        ycVar.a(context, android.R.color.system_neutral1_200);
        ycVar.a(context, android.R.color.system_neutral1_300);
        ycVar.a(context, android.R.color.system_neutral1_400);
        ycVar.a(context, android.R.color.system_neutral1_500);
        ycVar.a(context, android.R.color.system_neutral1_600);
        ycVar.a(context, android.R.color.system_neutral1_700);
        bc(ycVar.a(context, android.R.color.system_neutral1_600), 24.0f);
        bc(ycVar.a(context, android.R.color.system_neutral1_600), 22.0f);
        ycVar.a(context, android.R.color.system_neutral1_800);
        bc(ycVar.a(context, android.R.color.system_neutral1_600), 17.0f);
        bc(ycVar.a(context, android.R.color.system_neutral1_600), 12.0f);
        ycVar.a(context, android.R.color.system_neutral1_900);
        bc(ycVar.a(context, android.R.color.system_neutral1_600), 6.0f);
        bc(ycVar.a(context, android.R.color.system_neutral1_600), 4.0f);
        ycVar.a(context, android.R.color.system_neutral1_1000);
        long jA = ycVar.a(context, android.R.color.system_neutral2_0);
        ycVar.a(context, android.R.color.system_neutral2_10);
        long jBc = bc(ycVar.a(context, android.R.color.system_neutral2_600), 98.0f);
        long jBc2 = bc(ycVar.a(context, android.R.color.system_neutral2_600), 96.0f);
        long jA2 = ycVar.a(context, android.R.color.system_neutral2_50);
        long jBc3 = bc(ycVar.a(context, android.R.color.system_neutral2_600), 94.0f);
        long jBc4 = bc(ycVar.a(context, android.R.color.system_neutral2_600), 92.0f);
        long jA3 = ycVar.a(context, android.R.color.system_neutral2_100);
        long jBc5 = bc(ycVar.a(context, android.R.color.system_neutral2_600), 87.0f);
        long jA4 = ycVar.a(context, android.R.color.system_neutral2_200);
        ycVar.a(context, android.R.color.system_neutral2_300);
        long jA5 = ycVar.a(context, android.R.color.system_neutral2_400);
        long jA6 = ycVar.a(context, android.R.color.system_neutral2_500);
        ycVar.a(context, android.R.color.system_neutral2_600);
        long jA7 = ycVar.a(context, android.R.color.system_neutral2_700);
        long jBc6 = bc(ycVar.a(context, android.R.color.system_neutral2_600), 24.0f);
        long jBc7 = bc(ycVar.a(context, android.R.color.system_neutral2_600), 22.0f);
        long jA8 = ycVar.a(context, android.R.color.system_neutral2_800);
        long jBc8 = bc(ycVar.a(context, android.R.color.system_neutral2_600), 17.0f);
        long jBc9 = bc(ycVar.a(context, android.R.color.system_neutral2_600), 12.0f);
        long jA9 = ycVar.a(context, android.R.color.system_neutral2_900);
        long jBc10 = bc(ycVar.a(context, android.R.color.system_neutral2_600), 6.0f);
        long jBc11 = bc(ycVar.a(context, android.R.color.system_neutral2_600), 4.0f);
        long jA10 = ycVar.a(context, android.R.color.system_neutral2_1000);
        long jA11 = ycVar.a(context, android.R.color.system_accent1_0);
        ycVar.a(context, android.R.color.system_accent1_10);
        ycVar.a(context, android.R.color.system_accent1_50);
        long jA12 = ycVar.a(context, android.R.color.system_accent1_100);
        long jA13 = ycVar.a(context, android.R.color.system_accent1_200);
        ycVar.a(context, android.R.color.system_accent1_300);
        ycVar.a(context, android.R.color.system_accent1_400);
        ycVar.a(context, android.R.color.system_accent1_500);
        long jA14 = ycVar.a(context, android.R.color.system_accent1_600);
        long jA15 = ycVar.a(context, android.R.color.system_accent1_700);
        long jA16 = ycVar.a(context, android.R.color.system_accent1_800);
        long jA17 = ycVar.a(context, android.R.color.system_accent1_900);
        ycVar.a(context, android.R.color.system_accent1_1000);
        long jA18 = ycVar.a(context, android.R.color.system_accent2_0);
        ycVar.a(context, android.R.color.system_accent2_10);
        ycVar.a(context, android.R.color.system_accent2_50);
        long jA19 = ycVar.a(context, android.R.color.system_accent2_100);
        long jA20 = ycVar.a(context, android.R.color.system_accent2_200);
        ycVar.a(context, android.R.color.system_accent2_300);
        ycVar.a(context, android.R.color.system_accent2_400);
        ycVar.a(context, android.R.color.system_accent2_500);
        long jA21 = ycVar.a(context, android.R.color.system_accent2_600);
        long jA22 = ycVar.a(context, android.R.color.system_accent2_700);
        long jA23 = ycVar.a(context, android.R.color.system_accent2_800);
        long jA24 = ycVar.a(context, android.R.color.system_accent2_900);
        ycVar.a(context, android.R.color.system_accent2_1000);
        long jA25 = ycVar.a(context, android.R.color.system_accent3_0);
        ycVar.a(context, android.R.color.system_accent3_10);
        ycVar.a(context, android.R.color.system_accent3_50);
        long jA26 = ycVar.a(context, android.R.color.system_accent3_100);
        long jA27 = ycVar.a(context, android.R.color.system_accent3_200);
        ycVar.a(context, android.R.color.system_accent3_300);
        ycVar.a(context, android.R.color.system_accent3_400);
        ycVar.a(context, android.R.color.system_accent3_500);
        long jA28 = ycVar.a(context, android.R.color.system_accent3_600);
        long jA29 = ycVar.a(context, android.R.color.system_accent3_700);
        long jA30 = ycVar.a(context, android.R.color.system_accent3_800);
        long jA31 = ycVar.a(context, android.R.color.system_accent3_900);
        ycVar.a(context, android.R.color.system_accent3_1000);
        return new cy0(jA, jBc, jBc2, jA2, jBc3, jBc4, jA3, jBc5, jA4, jA5, jA6, jA7, jBc6, jBc7, jA8, jBc8, jBc9, jA9, jBc10, jBc11, jA10, jA11, jA12, jA13, jA14, jA15, jA16, jA17, jA18, jA19, jA20, jA21, jA22, jA23, jA24, jA25, jA26, jA27, jA28, jA29, jA30, jA31);
    }

    public static void w(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!k) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    i = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    j = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    i = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    j = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = i;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = j;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            k = true;
        }
        if (z) {
            try {
                Method method4 = i;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = j) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final jy0 x(g11 g11Var, b6 b6Var) {
        g11Var.getClass();
        int length = b6Var.e.length();
        int length2 = b6Var.e.length();
        int iMin = Math.min(length, 100);
        for (int i2 = 0; i2 < iMin; i2++) {
            bl(i2, length2, i2);
        }
        bl(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i3 = 0; i3 < iMin2; i3++) {
            bm(i3, length, i3);
        }
        bm(length2, length, length2);
        return new jy0(b6Var, new h01(b6Var.e.length(), b6Var.e.length()));
    }

    public static final long y(long j2, boolean z, int i2, float f2) {
        int iH = ((z || i2 == 2) && dh.d(j2)) ? dh.h(j2) : Integer.MAX_VALUE;
        if (dh.j(j2) != iH) {
            iH = i60.t(wo0.d(f2), dh.j(j2), iH);
        }
        return t1.q(0, iH, 0, dh.g(j2));
    }

    public static final Object z(un0 un0Var, long j2, gv gvVar) {
        while (true) {
            if (un0Var.c >= j2 && !un0Var.c()) {
                return un0Var;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ug.a;
            Object obj = atomicReferenceFieldUpdater.get(un0Var);
            jq jqVar = b;
            if (obj == jqVar) {
                return jqVar;
            }
            un0 un0Var2 = (un0) ((ug) obj);
            if (un0Var2 == null) {
                un0Var2 = (un0) gvVar.f(Long.valueOf(un0Var.c + 1), un0Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(un0Var, null, un0Var2)) {
                    if (atomicReferenceFieldUpdater.get(un0Var) != null) {
                        break;
                    }
                }
                if (un0Var.c()) {
                    un0Var.d();
                }
            }
            un0Var = un0Var2;
        }
    }
}

package defpackage;

import android.view.View;
import androidx.compose.runtime.internal.a;
import com.example.gnd.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class qo0 {
    public static final void a(vf vfVar, j70 j70Var) {
        f4 f4Var = f4.f;
        int iAd = pk.ad(vfVar);
        j70 j70VarAn = m10.an(vfVar, j70Var);
        a aVarL = vfVar.l();
        kf.b.getClass();
        ng ngVar = jf.b;
        vfVar.ax();
        if (vfVar.aq) {
            vfVar.k(ngVar);
        } else {
            vfVar.bh();
        }
        jo0.h(vfVar, jf.e, f4Var);
        jo0.h(vfVar, jf.d, aVarL);
        jo0.h(vfVar, jf.c, j70VarAn);
        w6 w6Var = jf.f;
        if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iAd))) {
            n5.j(iAd, vfVar, iAd, w6Var);
        }
        vfVar.q(true);
    }

    public static final Object[] b(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        h7.aw(objArr, objArr2, 0, i, 6);
        h7.au(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        h7.aw(objArr, objArr2, 0, i, 6);
        h7.au(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] d(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        h7.aw(objArr, objArr2, 0, i, 6);
        h7.au(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final u11 f(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            u11 u11Var = tag instanceof u11 ? (u11) tag : null;
            if (u11Var != null) {
                return u11Var;
            }
            Object objH = go0.h(view);
            view = objH instanceof View ? (View) objH : null;
        }
        return null;
    }

    public static final Object g(po0 po0Var, cp0 cp0Var) {
        Object objG = po0Var.d.g(cp0Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final b6 h(lw0 lw0Var) {
        b6 b6Var = lw0Var.a;
        long j = lw0Var.b;
        b6Var.getClass();
        return b6Var.subSequence(hx0.e(j), hx0.d(j));
    }

    public static final b6 i(lw0 lw0Var, int i) {
        b6 b6Var = lw0Var.a;
        long j = lw0Var.b;
        return b6Var.subSequence(hx0.d(j), Math.min(hx0.d(j) + i, lw0Var.a.e.length()));
    }

    public static final b6 j(lw0 lw0Var, int i) {
        b6 b6Var = lw0Var.a;
        long j = lw0Var.b;
        return b6Var.subSequence(Math.max(0, hx0.e(j) - i), hx0.e(j));
    }

    public static final int k(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static List l(vq0 vq0Var, int i, vq0 vq0Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int i2;
        int i3;
        int iS = vq0Var.s(i);
        int i4 = i + iS;
        int iF = vq0Var.f(i);
        int iF2 = vq0Var.f(i4);
        int i5 = iF2 - iF;
        boolean z5 = i >= 0 && (vq0Var.b[(vq0Var.q(i) * 5) + 1] & 201326592) != 0;
        vq0Var2.u(iS);
        vq0Var2.v(i5, vq0Var2.t);
        if (vq0Var.g < i4) {
            vq0Var.z(i4);
        }
        if (vq0Var.k < iF2) {
            vq0Var.aa(iF2, i4);
        }
        int[] iArr = vq0Var2.b;
        int i6 = vq0Var2.t;
        int i7 = i6 * 5;
        h7.as(vq0Var.b, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = vq0Var2.c;
        int i8 = vq0Var2.i;
        System.arraycopy(vq0Var.c, iF, objArr, i8, i5);
        int i9 = vq0Var2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + iS;
        int iG = i8 - vq0Var2.g(iArr, i6);
        int i12 = vq0Var2.m;
        int i13 = vq0Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int iG2 = vq0Var2.g(iArr, i15) + iG;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = vq0Var2.k;
            }
            iArr2[(i15 * 5) + 4] = vq0.i(iG2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        vq0Var2.m = i14;
        int iA = uq0.a(vq0Var.d, i, vq0Var.o());
        int iA2 = uq0.a(vq0Var.d, i4, vq0Var.o());
        if (iA < iA2) {
            ArrayList arrayList = vq0Var.d;
            ArrayList arrayList2 = new ArrayList(iA2 - iA);
            for (int i17 = iA; i17 < iA2; i17++) {
                Il il = (Il) arrayList.get(i17);
                il.a += i10;
                arrayList2.add(il);
            }
            vq0Var2.d.addAll(uq0.a(vq0Var2.d, vq0Var2.t, vq0Var2.o()), arrayList2);
            arrayList.subList(iA, iA2).clear();
            list = arrayList2;
        } else {
            list = rq.d;
        }
        if (!list.isEmpty()) {
            HashMap map = vq0Var.e;
            HashMap map2 = vq0Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = vq0Var2.v;
        vq0Var2.am(i9);
        int iAc = vq0Var.ac(vq0Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iAc >= 0;
            if (z7) {
                vq0Var.an();
                vq0Var.a(iAc - vq0Var.t);
                vq0Var.an();
            }
            vq0Var.a(i - vq0Var.t);
            boolean zAf = vq0Var.af();
            if (z7) {
                vq0Var.ak();
                vq0Var.j();
                vq0Var.ak();
                vq0Var.j();
            }
            z4 = zAf;
        } else {
            boolean zAg = vq0Var.ag(i, iS);
            vq0Var.ah(iF, i5, i - 1);
            z4 = zAg;
        }
        if (z4) {
            xf.c("Unexpectedly removed anchors");
        }
        int i20 = vq0Var2.o;
        int i21 = iArr3[i7 + 1];
        vq0Var2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            vq0Var2.t = i11;
            vq0Var2.i = i8 + i5;
        }
        if (z6) {
            vq0Var2.ar(i9);
        }
        return list;
    }

    public static final long m(String str, long j, long j2, long j3) {
        String property;
        boolean z;
        String str2;
        Long lValueOf;
        int i = gu0.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        az0.s(10);
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
            break;
        }
        int i2 = 0;
        char cCharAt = property.charAt(0);
        long j4 = -9223372036854775807L;
        if (f00.m(cCharAt, 48) < 0) {
            z = true;
            if (length != 1) {
                if (cCharAt == '+') {
                    z = false;
                    i2 = 1;
                } else if (cCharAt == '-') {
                    j4 = Long.MIN_VALUE;
                    i2 = 1;
                }
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        z = false;
        long j5 = 0;
        long j6 = -256204778801521550L;
        while (i2 < length) {
            int iDigit = Character.digit((int) property.charAt(i2), 10);
            if (iDigit >= 0) {
                if (j5 >= j6) {
                    str2 = property;
                } else if (j6 == -256204778801521550L) {
                    str2 = property;
                    j6 = j4 / ((long) 10);
                    if (j5 < j6) {
                    }
                    lValueOf = null;
                    break;
                }
                long j7 = j5 * ((long) 10);
                long j8 = iDigit;
                if (j7 < j4 + j8) {
                    lValueOf = null;
                    break;
                }
                j5 = j7 - j8;
                i2++;
                property = str2;
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        str2 = property;
        lValueOf = z ? Long.valueOf(j5) : Long.valueOf(-j5);
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int n(int i, int i2, String str) {
        return (int) m(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}

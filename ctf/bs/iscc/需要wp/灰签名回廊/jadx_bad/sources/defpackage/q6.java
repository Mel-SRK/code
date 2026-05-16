package defpackage;

import android.graphics.RectF;
import android.os.Build;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.Window;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class q6 {
    public static volatile q6 b;
    public final Object a;

    public q6(int i) {
        switch (i) {
            case 1:
                this.a = new Object();
                Executors.newFixedThreadPool(4, new ol());
                break;
            default:
                this.a = new q6(1);
                break;
        }
    }

    public static final long a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final boolean b(ri0 ri0Var, ri0 ri0Var2, ri0 ri0Var3, int i) {
        float f;
        float f2;
        boolean zC = c(i, ri0Var3, ri0Var);
        float f3 = ri0Var3.b;
        float f4 = ri0Var3.d;
        float f5 = ri0Var3.a;
        float f6 = ri0Var3.c;
        float f7 = ri0Var.d;
        float f8 = ri0Var.b;
        float f9 = ri0Var.c;
        float f10 = ri0Var.a;
        if (zC || !c(i, ri0Var2, ri0Var)) {
            return false;
        }
        if (i == 3) {
            if (f10 < f6) {
                return true;
            }
        } else if (i == 4) {
            if (f9 > f5) {
                return true;
            }
        } else if (i == 5) {
            if (f8 < f4) {
                return true;
            }
        } else {
            if (i != 6) {
                wc.q("This function should only be used for 2-D focus search");
                return false;
            }
            if (f7 > f3) {
                return true;
            }
        }
        if (i == 3 || i == 4) {
            return true;
        }
        if (i == 3) {
            f = f10 - ri0Var2.c;
        } else if (i == 4) {
            f = ri0Var2.a - f9;
        } else if (i == 5) {
            f = f8 - ri0Var2.d;
        } else {
            if (i != 6) {
                wc.q("This function should only be used for 2-D focus search");
                return false;
            }
            f = ri0Var2.b - f7;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (i == 3) {
            f2 = f10 - f5;
        } else if (i == 4) {
            f2 = f6 - f9;
        } else if (i == 5) {
            f2 = f8 - f3;
        } else {
            if (i != 6) {
                wc.q("This function should only be used for 2-D focus search");
                return false;
            }
            f2 = f4 - f7;
        }
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        return f < f2;
    }

    public static final boolean c(int i, ri0 ri0Var, ri0 ri0Var2) {
        if (i == 3 || i == 4) {
            return ri0Var.d > ri0Var2.b && ri0Var.b < ri0Var2.d;
        }
        if (i == 5 || i == 6) {
            return ri0Var.c > ri0Var2.a && ri0Var.a < ri0Var2.c;
        }
        wc.q("This function should only be used for 2-D focus search");
        return false;
    }

    public static final void d(gt gtVar, a90 a90Var) {
        if (!gtVar.d.q) {
            sy.b("visitChildren called on an unattached node");
        }
        a90 a90Var2 = new a90(new i70[16]);
        i70 i70Var = gtVar.d;
        i70 i70Var2 = i70Var.i;
        if (i70Var2 == null) {
            pk.j(a90Var2, i70Var);
        } else {
            a90Var2.b(i70Var2);
        }
        while (true) {
            int i = a90Var2.f;
            if (i == 0) {
                return;
            }
            i70 i70VarM = (i70) a90Var2.j(i - 1);
            if ((i70VarM.g & 1024) == 0) {
                pk.j(a90Var2, i70VarM);
            } else {
                while (true) {
                    if (i70VarM == null) {
                        break;
                    }
                    if ((i70VarM.f & 1024) != 0) {
                        a90 a90Var3 = null;
                        while (i70VarM != null) {
                            if (i70VarM instanceof gt) {
                                gt gtVar2 = (gt) i70VarM;
                                if (gtVar2.q && !pk.ay(gtVar2).ao) {
                                    if (gtVar2.bv().a) {
                                        a90Var.b(gtVar2);
                                    } else {
                                        d(gtVar2, a90Var);
                                    }
                                }
                            } else if ((i70VarM.f & 1024) != 0 && (i70VarM instanceof rl)) {
                                int i2 = 0;
                                for (i70 i70Var3 = ((rl) i70VarM).s; i70Var3 != null; i70Var3 = i70Var3.i) {
                                    if ((i70Var3.f & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            i70VarM = i70Var3;
                                        } else {
                                            if (a90Var3 == null) {
                                                a90Var3 = new a90(new i70[16]);
                                            }
                                            if (i70VarM != null) {
                                                a90Var3.b(i70VarM);
                                                i70VarM = null;
                                            }
                                            a90Var3.b(i70Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            i70VarM = pk.m(a90Var3);
                        }
                    } else {
                        i70VarM = i70VarM.i;
                    }
                }
            }
        }
    }

    public static final gt e(a90 a90Var, ri0 ri0Var, int i) {
        ri0 ri0VarF;
        if (i == 3) {
            ri0VarF = ri0Var.f((ri0Var.c - ri0Var.a) + 1, 0.0f);
        } else if (i == 4) {
            ri0VarF = ri0Var.f(-((ri0Var.c - ri0Var.a) + 1), 0.0f);
        } else if (i == 5) {
            ri0VarF = ri0Var.f(0.0f, (ri0Var.d - ri0Var.b) + 1);
        } else {
            if (i != 6) {
                wc.q("This function should only be used for 2-D focus search");
                return null;
            }
            ri0VarF = ri0Var.f(0.0f, -((ri0Var.d - ri0Var.b) + 1));
        }
        Object[] objArr = a90Var.d;
        int i2 = a90Var.f;
        gt gtVar = null;
        for (int i3 = 0; i3 < i2; i3++) {
            gt gtVar2 = (gt) objArr[i3];
            if (t1.af(gtVar2)) {
                ri0 ri0VarR = t1.r(gtVar2);
                if (k(ri0VarR, ri0VarF, ri0Var, i)) {
                    gtVar = gtVar2;
                    ri0VarF = ri0VarR;
                }
            }
        }
        return gtVar;
    }

    public static final boolean f(gt gtVar, int i, cv cvVar) {
        ri0 ri0Var;
        a90 a90Var = new a90(new gt[16]);
        d(gtVar, a90Var);
        int i2 = a90Var.f;
        if (i2 <= 1) {
            gt gtVar2 = (gt) (i2 == 0 ? null : a90Var.d[0]);
            if (gtVar2 != null) {
                return ((Boolean) cvVar.g(gtVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                ri0 ri0VarR = t1.r(gtVar);
                float f = ri0VarR.a;
                float f2 = ri0VarR.b;
                ri0Var = new ri0(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    wc.q("This function should only be used for 2-D focus search");
                    return false;
                }
                ri0 ri0VarR2 = t1.r(gtVar);
                float f3 = ri0VarR2.c;
                float f4 = ri0VarR2.d;
                ri0Var = new ri0(f3, f4, f3, f4);
            }
            gt gtVarE = e(a90Var, ri0Var, i);
            if (gtVarE != null) {
                return ((Boolean) cvVar.g(gtVarE)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean g(int i, g5 g5Var, gt gtVar, ri0 ri0Var) {
        if (r(i, g5Var, gtVar, ri0Var)) {
            return true;
        }
        gt gtVar2 = ((us) pk.az(gtVar).getFocusOwner()).h;
        pk.bb(gtVar);
        return false;
    }

    public static final float h(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x025e A[EDGE_INSN: B:203:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a], EDGE_INSN: B:204:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int i(xw0 xw0Var, Layout layout, g20 g20Var, int i, RectF rectF, vn0 vn0Var, n3 n3Var, boolean z) {
        f20[] f20VarArr;
        f20[] f20VarArr2;
        int i2;
        int iG;
        int i3;
        int i4;
        int iF;
        Bidi bidiCreateLineBidi;
        boolean z2;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = xw0Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int iF2 = xw0Var.f(i);
        if (i5 < (iF2 - lineStart2) * 2) {
            ty.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        rx rxVar = new rx(xw0Var);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iF2) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !zIsRtlCharAt) {
                fA = rxVar.a(lineStart2, z3, z3, true);
                fA3 = rxVar.a(lineStart2 + 1, true, true, true);
                z2 = z4;
            } else if (z4 && zIsRtlCharAt) {
                z2 = z4;
                fA3 = rxVar.a(lineStart2, false, false, false);
                fA = rxVar.a(lineStart2 + 1, true, true, false);
            } else {
                z2 = z4;
                if (zIsRtlCharAt) {
                    fA2 = rxVar.a(lineStart2, false, false, true);
                    fA = rxVar.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = rxVar.a(lineStart2, false, false, false);
                    fA2 = rxVar.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i6] = fA;
            fArr[i6 + 1] = fA3;
            i6 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = (Layout) g20Var.b;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iG2 = g20Var.g(lineStart3, false);
        int iH = g20Var.h(iG2);
        int i7 = lineStart3 - iH;
        int i8 = lineEnd2 - iH;
        Bidi bidiD = g20Var.d(iG2);
        if (bidiD == null || (bidiCreateLineBidi = bidiD.createLineBidi(i7, i8)) == null) {
            f20VarArr = new f20[]{new f20(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            f20VarArr = new f20[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                f20VarArr[i9] = new f20(bidiCreateLineBidi.getRunStart(i9) + lineStart3, bidiCreateLineBidi.getRunLimit(i9) + lineStart3, bidiCreateLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        qz szVar = z ? new sz(0, f20VarArr.length - 1, 1) : new qz(f20VarArr.length - 1, 0, -1);
        int i11 = szVar.d;
        int i12 = szVar.e;
        int i13 = szVar.f;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            f20 f20Var = f20VarArr[i11];
            boolean z5 = f20Var.c;
            int iJ = f20Var.a;
            int iK = f20Var.b;
            float f = z5 ? fArr[((iK - 1) - lineStart) * 2] : fArr[(iJ - lineStart) * 2];
            float fH = z5 ? h(iJ, lineStart, fArr) : h(iK - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                f20VarArr2 = f20VarArr;
                if (fH >= f2) {
                    float f3 = rectF.right;
                    if (f > f3) {
                        iK = -1;
                        iJ = iK;
                    } else {
                        if ((z5 || f3 < fH) && (!z5 || f2 > f)) {
                            int i15 = iK;
                            int i16 = iJ;
                            while (i15 - i16 > 1) {
                                int i17 = (i15 + i16) / 2;
                                float f4 = fArr[(i17 - lineStart) * 2];
                                int i18 = i15;
                                if ((z5 || f4 <= rectF.right) && (!z5 || f4 >= rectF.left)) {
                                    i15 = i18;
                                    i16 = i17;
                                } else {
                                    i15 = i17;
                                }
                            }
                            i2 = z5 ? i15 : i16;
                        } else {
                            i2 = iK - 1;
                        }
                        int iF3 = vn0Var.f(i2 + 1);
                        if (iF3 != -1 && (iG = vn0Var.g(iF3)) > iJ) {
                            if (iF3 < iJ) {
                                iF3 = iJ;
                            }
                            if (iG <= iK) {
                                iK = iG;
                            }
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iF4 = iF3;
                            while (true) {
                                rectF2.left = z5 ? fArr[((iK - 1) - lineStart) * 2] : fArr[(iF4 - lineStart) * 2];
                                rectF2.right = z5 ? h(iF4, lineStart, fArr) : h(iK - 1, lineStart, fArr);
                                if (((Boolean) n3Var.f(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iK = vn0Var.k(iK);
                                if (iK == -1 || iK <= iJ) {
                                    break;
                                }
                                iF4 = vn0Var.f(iK);
                                if (iF4 < iJ) {
                                    iF4 = iJ;
                                }
                            }
                            iK = -1;
                            iJ = iK;
                        }
                    }
                }
            } else if (fH >= f2) {
                float f5 = rectF.right;
                if (f > f5) {
                    f20VarArr2 = f20VarArr;
                    iJ = -1;
                } else {
                    if ((z5 || f2 > f) && (!z5 || f5 < fH)) {
                        int i19 = iK;
                        int i20 = iJ;
                        while (true) {
                            i3 = i19;
                            if (i19 - i20 <= 1) {
                                break;
                            }
                            int i21 = (i3 + i20) / 2;
                            float f6 = fArr[(i21 - lineStart) * 2];
                            if ((z5 || f6 <= rectF.left) && (!z5 || f6 >= rectF.right)) {
                                i19 = i3;
                                i20 = i21;
                            } else {
                                i19 = i21;
                            }
                        }
                        i4 = z5 ? i3 : i20;
                    } else {
                        i4 = iJ;
                    }
                    int iG3 = vn0Var.g(i4);
                    if (iG3 != -1 && (iF = vn0Var.f(iG3)) < iK) {
                        if (iF >= iJ) {
                            iJ = iF;
                        }
                        if (iG3 > iK) {
                            iG3 = iK;
                        }
                        f20VarArr2 = f20VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iG4 = iG3;
                        while (true) {
                            rectF3.left = z5 ? fArr[((iG4 - 1) - lineStart) * 2] : fArr[(iJ - lineStart) * 2];
                            rectF3.right = z5 ? h(iJ, lineStart, fArr) : h(iG4 - 1, lineStart, fArr);
                            if (((Boolean) n3Var.f(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iJ = vn0Var.j(iJ);
                            if (iJ == -1 || iJ >= iK) {
                                break;
                            }
                            iG4 = vn0Var.g(iJ);
                            if (iG4 > iK) {
                                iG4 = iK;
                            }
                        }
                    }
                    iJ = -1;
                }
            }
            if (iJ >= 0) {
                return iJ;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            f20VarArr = f20VarArr2;
        }
    }

    public static final void j(so0 so0Var) {
        pk.ay(so0Var).ac();
    }

    public static final boolean k(ri0 ri0Var, ri0 ri0Var2, ri0 ri0Var3, int i) {
        if (!l(i, ri0Var, ri0Var3)) {
            return false;
        }
        if (l(i, ri0Var2, ri0Var3) && !b(ri0Var3, ri0Var, ri0Var2, i)) {
            return !b(ri0Var3, ri0Var2, ri0Var, i) && m(i, ri0Var3, ri0Var) < m(i, ri0Var3, ri0Var2);
        }
        return true;
    }

    public static final boolean l(int i, ri0 ri0Var, ri0 ri0Var2) {
        float f = ri0Var.b;
        float f2 = ri0Var.d;
        float f3 = ri0Var.a;
        float f4 = ri0Var.c;
        if (i == 3) {
            float f5 = ri0Var2.c;
            float f6 = ri0Var2.a;
            return (f5 > f4 || f6 >= f4) && f6 > f3;
        }
        if (i == 4) {
            float f7 = ri0Var2.a;
            float f8 = ri0Var2.c;
            return (f7 < f3 || f8 <= f3) && f8 < f4;
        }
        if (i == 5) {
            float f9 = ri0Var2.d;
            float f10 = ri0Var2.b;
            return (f9 > f2 || f10 >= f2) && f10 > f;
        }
        if (i != 6) {
            wc.q("This function should only be used for 2-D focus search");
            return false;
        }
        float f11 = ri0Var2.b;
        float f12 = ri0Var2.d;
        return (f11 < f || f12 <= f) && f12 < f2;
    }

    public static final long m(int i, ri0 ri0Var, ri0 ri0Var2) {
        float f;
        float f2;
        float f3 = ri0Var2.b;
        float f4 = ri0Var2.d;
        float f5 = ri0Var2.a;
        float f6 = ri0Var2.c;
        if (i == 3) {
            f = ri0Var.a - f6;
        } else if (i == 4) {
            f = f5 - ri0Var.c;
        } else if (i == 5) {
            f = ri0Var.b - f4;
        } else {
            if (i != 6) {
                wc.q("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = f3 - ri0Var.d;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        long j = (long) f;
        if (i == 3 || i == 4) {
            float f7 = ri0Var.b;
            float f8 = 2;
            f2 = (((ri0Var.d - f7) / f8) + f7) - (((f4 - f3) / f8) + f3);
        } else {
            if (i != 5 && i != 6) {
                wc.q("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f9 = ri0Var.a;
            float f10 = 2;
            f2 = (((ri0Var.c - f9) / f10) + f9) - (((f6 - f5) / f10) + f5);
        }
        long j2 = (long) f2;
        return (j2 * j2) + (((long) 13) * j * j);
    }

    public static xq0 n(xq0 xq0Var) {
        if (xq0Var instanceof py0) {
            py0 py0Var = (py0) xq0Var;
            if (py0Var.t == go0.e()) {
                py0Var.r = null;
                return xq0Var;
            }
        }
        if (xq0Var instanceof qy0) {
            qy0 qy0Var = (qy0) xq0Var;
            if (qy0Var.i == go0.e()) {
                qy0Var.h = null;
                return xq0Var;
            }
        }
        xq0 xq0VarH = fr0.h(xq0Var, null, false);
        xq0VarH.j();
        return xq0VarH;
    }

    public static Object o(cv cvVar, pu puVar) {
        xq0 py0Var;
        if (cvVar == null) {
            return puVar.a();
        }
        xq0 xq0Var = (xq0) fr0.b.n();
        if (xq0Var instanceof py0) {
            py0 py0Var2 = (py0) xq0Var;
            if (py0Var2.t == go0.e()) {
                cv cvVar2 = py0Var2.r;
                cv cvVar3 = py0Var2.s;
                try {
                    ((py0) xq0Var).r = fr0.l(cvVar, cvVar2, true);
                    ((py0) xq0Var).s = cvVar3;
                    return puVar.a();
                } finally {
                    py0Var2.r = cvVar2;
                    py0Var2.s = cvVar3;
                }
            }
        }
        if (xq0Var == null || (xq0Var instanceof v80)) {
            py0Var = new py0(xq0Var instanceof v80 ? (v80) xq0Var : null, cvVar, null, true, false);
        } else {
            if (cvVar == null) {
                return puVar.a();
            }
            py0Var = xq0Var.u(cvVar);
        }
        try {
            xq0 xq0VarJ = py0Var.j();
            try {
                Object objA = puVar.a();
                xq0.q(xq0VarJ);
                py0Var.c();
                return objA;
            } catch (Throwable th) {
                xq0.q(xq0VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            py0Var.c();
            throw th2;
        }
    }

    public static final float p(long j, float f, em emVar) {
        float fC;
        long jB = qx0.b(j);
        if (rx0.a(jB, 4294967296L)) {
            if (emVar.k() <= 1.05d) {
                return emVar.au(j);
            }
            fC = qx0.c(j) / qx0.c(emVar.ba(f));
        } else {
            if (!rx0.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = qx0.c(j);
        }
        return fC * f;
    }

    public static void q(xq0 xq0Var, xq0 xq0Var2, cv cvVar) {
        if (xq0Var != xq0Var2) {
            xq0Var2.getClass();
            xq0.q(xq0Var);
            xq0Var2.c();
        } else if (xq0Var instanceof py0) {
            ((py0) xq0Var).r = cvVar;
        } else if (xq0Var instanceof qy0) {
            ((qy0) xq0Var).h = cvVar;
        } else {
            wc.f(xq0Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static final boolean r(int i, g5 g5Var, gt gtVar, ri0 ri0Var) {
        gt gtVarE;
        a90 a90Var = new a90(new gt[16]);
        if (!gtVar.d.q) {
            sy.b("visitChildren called on an unattached node");
        }
        a90 a90Var2 = new a90(new i70[16]);
        i70 i70Var = gtVar.d;
        i70 i70Var2 = i70Var.i;
        if (i70Var2 == null) {
            pk.j(a90Var2, i70Var);
        } else {
            a90Var2.b(i70Var2);
        }
        while (true) {
            int i2 = a90Var2.f;
            if (i2 == 0) {
                break;
            }
            i70 i70VarM = (i70) a90Var2.j(i2 - 1);
            if ((i70VarM.g & 1024) == 0) {
                pk.j(a90Var2, i70VarM);
            } else {
                while (true) {
                    if (i70VarM == null) {
                        break;
                    }
                    if ((i70VarM.f & 1024) != 0) {
                        a90 a90Var3 = null;
                        while (i70VarM != null) {
                            if (i70VarM instanceof gt) {
                                gt gtVar2 = (gt) i70VarM;
                                if (gtVar2.q) {
                                    a90Var.b(gtVar2);
                                }
                            } else if ((i70VarM.f & 1024) != 0 && (i70VarM instanceof rl)) {
                                int i3 = 0;
                                for (i70 i70Var3 = ((rl) i70VarM).s; i70Var3 != null; i70Var3 = i70Var3.i) {
                                    if ((i70Var3.f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            i70VarM = i70Var3;
                                        } else {
                                            if (a90Var3 == null) {
                                                a90Var3 = new a90(new i70[16]);
                                            }
                                            if (i70VarM != null) {
                                                a90Var3.b(i70VarM);
                                                i70VarM = null;
                                            }
                                            a90Var3.b(i70Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            i70VarM = pk.m(a90Var3);
                        }
                    } else {
                        i70VarM = i70VarM.i;
                    }
                }
            }
        }
        while (a90Var.f != 0 && (gtVarE = e(a90Var, ri0Var, i)) != null) {
            if (gtVarE.bv().a) {
                return ((Boolean) g5Var.g(gtVarE)).booleanValue();
            }
            if (g(i, g5Var, gtVarE, ri0Var)) {
                return true;
            }
            a90Var.i(gtVarE);
        }
        return false;
    }

    public static final void s(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(m10.av(j)), i, i2, 33);
        }
    }

    public static void t(Window window) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            ax.d(window);
        } else if (i >= 30) {
            ax.c(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }

    public static final void u(Spannable spannable, long j, em emVar, int i, int i2) {
        long jB = qx0.b(j);
        if (rx0.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(i60.ax(emVar.au(j)), false), i, i2, 33);
        } else if (rx0.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(qx0.c(j)), i, i2, 33);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public static final void v(Spannable spannable, t40 t40Var, int i, int i2) {
        if (t40Var != null) {
            ArrayList arrayList = new ArrayList(lc.an(t40Var));
            Iterator it = t40Var.d.iterator();
            while (it.hasNext()) {
                arrayList.add(((s40) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final Boolean w(int i, g5 g5Var, gt gtVar, ri0 ri0Var) {
        int iOrdinal = gtVar.bx().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                gt gtVarU = t1.u(gtVar);
                if (gtVarU == null) {
                    wc.q("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = gtVarU.bx().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolW = w(i, g5Var, gtVarU, ri0Var);
                        if (!f00.h(boolW, Boolean.FALSE)) {
                            return boolW;
                        }
                        if (ri0Var == null) {
                            if (gtVarU.bx() != et.e) {
                                wc.q("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            gt gtVarO = t1.o(gtVarU);
                            if (gtVarO == null) {
                                wc.q("ActiveParent must have a focusedChild");
                                return null;
                            }
                            ri0Var = t1.r(gtVarO);
                        }
                        return Boolean.valueOf(g(i, g5Var, gtVar, ri0Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            wc.l();
                            return null;
                        }
                        wc.q("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (ri0Var == null) {
                    ri0Var = t1.r(gtVarU);
                }
                return Boolean.valueOf(g(i, g5Var, gtVar, ri0Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return gtVar.bv().a ? (Boolean) g5Var.g(gtVar) : ri0Var == null ? Boolean.valueOf(f(gtVar, i, g5Var)) : Boolean.valueOf(r(i, g5Var, gtVar, ri0Var));
                }
                wc.l();
                return null;
            }
        }
        return Boolean.valueOf(f(gtVar, i, g5Var));
    }
}

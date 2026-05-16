package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spanned;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class wo0 {
    public wo0() {
        new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final uo0 a(s20 s20Var, boolean z) {
        i70 i70Var = (i70) s20Var.ag.j;
        Object obj = null;
        if ((i70Var.g & 8) != 0) {
            loop0: while (true) {
                if (i70Var == null) {
                    break;
                }
                if ((i70Var.f & 8) != 0) {
                    i70 i70VarM = i70Var;
                    a90 a90Var = null;
                    while (i70VarM != null) {
                        if (i70VarM instanceof so0) {
                            obj = i70VarM;
                            break loop0;
                        }
                        if ((i70VarM.f & 8) != 0 && (i70VarM instanceof rl)) {
                            int i = 0;
                            for (i70 i70Var2 = ((rl) i70VarM).s; i70Var2 != null; i70Var2 = i70Var2.i) {
                                if ((i70Var2.f & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        i70VarM = i70Var2;
                                    } else {
                                        if (a90Var == null) {
                                            a90Var = new a90(new i70[16]);
                                        }
                                        if (i70VarM != null) {
                                            a90Var.b(i70VarM);
                                            i70VarM = null;
                                        }
                                        a90Var.b(i70Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        i70VarM = pk.m(a90Var);
                    }
                    if ((i70Var.g & 8) != 0) {
                        break;
                    }
                    i70Var = i70Var.i;
                } else if ((i70Var.g & 8) != 0) {
                }
            }
        }
        obj.getClass();
        i70 i70Var3 = ((i70) ((so0) obj)).d;
        po0 po0VarS = s20Var.s();
        if (po0VarS == null) {
            po0VarS = new po0();
        }
        return new uo0(i70Var3, z, s20Var, po0VarS);
    }

    public static final long b(int i, int i2) {
        if (i < 0 || i2 < 0) {
            ty.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = hx0.c;
        return j;
    }

    public static final void c(r01 r01Var, pg0 pg0Var) {
        q01 q01Var = r01Var.b;
        q01 q01Var2 = r01Var.a;
        boolean zK = d41.k(pg0Var);
        long j = pg0Var.b;
        long j2 = 0;
        if (zK) {
            mk[] mkVarArr = q01Var2.c;
            Arrays.fill(mkVarArr, 0, mkVarArr.length, (Object) null);
            q01Var2.d = 0;
            mk[] mkVarArr2 = q01Var.c;
            Arrays.fill(mkVarArr2, 0, mkVarArr2.length, (Object) null);
            q01Var.d = 0;
            r01Var.c = 0L;
        }
        if (!d41.m(pg0Var)) {
            List list = pg0Var.k;
            if (list == null) {
                list = rq.d;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                lx lxVar = (lx) list.get(i);
                long j3 = lxVar.a;
                long jG = xa0.g(lxVar.c, j2);
                q01Var2.a(j3, Float.intBitsToFloat((int) (jG >> 32)));
                q01Var.a(j3, Float.intBitsToFloat((int) (jG & 4294967295L)));
                i++;
                j2 = 0;
            }
            long jG2 = xa0.g(pg0Var.l, 0L);
            q01Var2.a(j, Float.intBitsToFloat((int) (jG2 >> 32)));
            q01Var.a(j, Float.intBitsToFloat((int) (jG2 & 4294967295L)));
        }
        if (d41.m(pg0Var) && j - r01Var.c > 40) {
            mk[] mkVarArr3 = q01Var2.c;
            Arrays.fill(mkVarArr3, 0, mkVarArr3.length, (Object) null);
            q01Var2.d = 0;
            mk[] mkVarArr4 = q01Var.c;
            Arrays.fill(mkVarArr4, 0, mkVarArr4.length, (Object) null);
            q01Var.d = 0;
            r01Var.c = 0L;
        }
        r01Var.c = j;
    }

    public static final int d(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final long e(long j, int i) {
        int i2 = hx0.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : b(i4, i);
    }

    public static final float g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static ku h(ku[] kuVarArr) {
        ku kuVar = null;
        int i = Integer.MAX_VALUE;
        for (ku kuVar2 : kuVarArr) {
            int iAbs = (Math.abs(kuVar2.c - 400) * 2) + (kuVar2.d ? 1 : 0);
            if (kuVar == null || i > iAbs) {
                kuVar = kuVar2;
                i = iAbs;
            }
        }
        return kuVar;
    }

    public static final boolean i(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static int j(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        wc.h("type needs to be >= FIRST and <= LAST, type=", i);
        return 0;
    }

    public static final void k(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            sy.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fG = g(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fG);
                }
            }
            float fSqrt = (float) Math.sqrt(g(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : g(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fG2 = g(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fG2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fG2 / fArr11[i14];
        }
    }

    public abstract Typeface f(Context context, ku[] kuVarArr);
}

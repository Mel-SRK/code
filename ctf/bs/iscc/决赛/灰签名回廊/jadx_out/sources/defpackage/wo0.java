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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.uo0 a(defpackage.s20 r8, boolean r9) {
        /*
            da0 r0 = r8.ag
            java.lang.Object r0 = r0.j
            i70 r0 = (defpackage.i70) r0
            int r1 = r0.g
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L66
        Ld:
            if (r0 == 0) goto L66
            int r1 = r0.f
            r1 = r1 & 8
            if (r1 == 0) goto L5d
            r1 = r0
            r3 = r2
        L17:
            if (r1 == 0) goto L5d
            boolean r4 = r1 instanceof defpackage.so0
            if (r4 == 0) goto L1f
            r2 = r1
            goto L66
        L1f:
            int r4 = r1.f
            r4 = r4 & 8
            if (r4 == 0) goto L58
            boolean r4 = r1 instanceof defpackage.rl
            if (r4 == 0) goto L58
            r4 = r1
            rl r4 = (defpackage.rl) r4
            i70 r4 = r4.s
            r5 = 0
        L2f:
            r6 = 1
            if (r4 == 0) goto L55
            int r7 = r4.f
            r7 = r7 & 8
            if (r7 == 0) goto L52
            int r5 = r5 + 1
            if (r5 != r6) goto L3e
            r1 = r4
            goto L52
        L3e:
            if (r3 != 0) goto L49
            a90 r3 = new a90
            r6 = 16
            i70[] r6 = new defpackage.i70[r6]
            r3.<init>(r6)
        L49:
            if (r1 == 0) goto L4f
            r3.b(r1)
            r1 = r2
        L4f:
            r3.b(r4)
        L52:
            i70 r4 = r4.i
            goto L2f
        L55:
            if (r5 != r6) goto L58
            goto L17
        L58:
            i70 r1 = defpackage.pk.m(r3)
            goto L17
        L5d:
            int r1 = r0.g
            r1 = r1 & 8
            if (r1 == 0) goto L66
            i70 r0 = r0.i
            goto Ld
        L66:
            r2.getClass()
            so0 r2 = (defpackage.so0) r2
            i70 r2 = (defpackage.i70) r2
            i70 r0 = r2.d
            po0 r1 = r8.s()
            if (r1 != 0) goto L7a
            po0 r1 = new po0
            r1.<init>()
        L7a:
            uo0 r2 = new uo0
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo0.a(s20, boolean):uo0");
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

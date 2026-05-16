package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class si0 {
    public final cc a;
    public final zx0 b;
    public final m80 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public bs g;
    public long h;
    public final b i;
    public final p80 j;

    public si0() {
        cc ccVar = new cc();
        ccVar.b = new long[192];
        ccVar.c = new long[192];
        this.a = ccVar;
        this.b = new zx0();
        this.c = new m80();
        this.h = -1L;
        this.i = new b(18, this);
        this.j = new p80();
    }

    public static long a(fa0 fa0Var, long j) {
        float[] fArrB;
        int iD;
        rd0 rd0Var = fa0Var.al;
        if (rd0Var == null || (iD = f00.d((fArrB = ((lw) rd0Var).b()))) == 3) {
            return j;
        }
        if ((iD & 2) == 0) {
            return 9223372034707292159L;
        }
        return t1.au(j60.b((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), fArrB));
    }

    public static long h(s20 s20Var) {
        da0 da0Var = s20Var.ag;
        fa0 fa0Var = (fa0) da0Var.h;
        long jC = 0;
        for (fa0 fa0Var2 = (yy) da0Var.g; fa0Var2 != null && fa0Var2 != fa0Var; fa0Var2 = fa0Var2.t) {
            long jA = a(fa0Var2, jC);
            if (pz.a(jA, 9223372034707292159L)) {
                return 9223372034707292159L;
            }
            jC = pz.c(jA, fa0Var2.ac);
        }
        return jC;
    }

    public static void i(s20 s20Var) {
        long jH;
        fa0 fa0Var = (fa0) s20Var.ag.h;
        long jA = a(fa0Var, 0L);
        long jC = 9223372034707292159L;
        if (!f00.f(jA)) {
            s20Var.f = 9223372034707292159L;
            return;
        }
        long jC2 = pz.c(jA, fa0Var.ac);
        s20 s20VarQ = s20Var.q();
        if (s20VarQ != null) {
            if (!f00.f(s20VarQ.f)) {
                i(s20VarQ);
            }
            long j = s20VarQ.f;
            if (f00.f(j)) {
                if (s20VarQ.i) {
                    jH = h(s20VarQ);
                    s20VarQ.h = jH;
                    s20VarQ.i = false;
                } else {
                    jH = s20VarQ.h;
                }
                if (f00.f(jH)) {
                    jC = pz.c(pz.c(j, jH), jC2);
                }
            }
        } else {
            jC = jC2;
        }
        s20Var.f = jC;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        long j;
        long j2;
        long j3;
        Handler handler = bt.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.d;
        boolean z3 = z2 || this.e;
        cc ccVar = this.a;
        zx0 zx0Var = this.b;
        if (z2) {
            this.d = false;
            m80 m80Var = this.c;
            j = 128;
            Object[] objArr = m80Var.a;
            int i = m80Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((pu) objArr[i2]).a();
            }
            long[] jArr = (long[]) ccVar.b;
            int i3 = ccVar.a;
            j2 = 255;
            for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
                long j4 = jArr[i4 + 2];
                if ((((int) (j4 >> 61)) & 1) != 0) {
                    long j5 = jArr[i4];
                    long j6 = jArr[i4 + 1];
                    if (zx0Var.a.b(((int) j4) & 67108863) != null) {
                        wc.c();
                        return;
                    }
                }
            }
            j3 = -9187201950435737472L;
            e80 e80Var = zx0Var.a;
            Object[] objArr2 = e80Var.c;
            long[] jArr2 = e80Var.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j7 = jArr2[i5];
                    z = z3;
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j7 & 255) < 128 && objArr2[(i5 << 3) + i7] != null) {
                                wc.c();
                                return;
                            }
                            j7 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        z3 = z;
                    }
                }
            } else {
                z = z3;
            }
            long[] jArr3 = (long[]) ccVar.b;
            int i8 = ccVar.a;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-2305843009213693953L);
            }
        } else {
            z = z3;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        if (this.e) {
            this.e = false;
            e80 e80Var2 = zx0Var.a;
            Object[] objArr3 = e80Var2.c;
            long[] jArr4 = e80Var2.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i11 = 0;
                while (true) {
                    long j8 = jArr4[i11];
                    if ((((~j8) << 7) & j8 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((j8 & j2) < j && objArr3[(i11 << 3) + i13] != null) {
                                wc.c();
                                return;
                            }
                            j8 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 == length2) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        if (z) {
            zx0Var.getClass();
        }
        if (this.f) {
            this.f = false;
            long[] jArr5 = (long[]) ccVar.b;
            int i14 = ccVar.a;
            long[] jArr6 = (long[]) ccVar.c;
            int i15 = 0;
            for (int i16 = 0; i16 < jArr5.length - 2 && i15 < jArr6.length - 2 && i16 < i14; i16 += 3) {
                int i17 = i16 + 2;
                if (jArr5[i17] != 2305843009213693951L) {
                    jArr6[i15] = jArr5[i16];
                    jArr6[i15 + 1] = jArr5[i16 + 1];
                    jArr6[i15 + 2] = jArr5[i17];
                    i15 += 3;
                }
            }
            ccVar.a = i15;
            ccVar.b = jArr6;
            ccVar.c = jArr5;
        }
        if (zx0Var.b > jCurrentTimeMillis) {
            return;
        }
        e80 e80Var3 = zx0Var.a;
        Object[] objArr4 = e80Var3.c;
        long[] jArr7 = e80Var3.a;
        int length3 = jArr7.length - 2;
        if (length3 >= 0) {
            int i18 = 0;
            while (true) {
                long j9 = jArr7[i18];
                if ((((~j9) << 7) & j9 & j3) != j3) {
                    int i19 = 8 - ((~(i18 - length3)) >>> 31);
                    for (int i20 = 0; i20 < i19; i20++) {
                        if ((j9 & j2) < j && objArr4[(i18 << 3) + i20] != null) {
                            wc.c();
                            return;
                        }
                        j9 >>= 8;
                    }
                    if (i19 != 8) {
                        break;
                    } else if (i18 == length3) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
        }
        zx0Var.b = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(s20 s20Var, boolean z) {
        char c;
        boolean z2;
        da0 da0Var = s20Var.ag;
        fa0 fa0Var = (fa0) da0Var.h;
        o60 o60Var = s20Var.ah.o;
        int iAz = o60Var.az();
        float fAy = o60Var.ay();
        p80 p80Var = this.j;
        p80Var.a = 0.0f;
        p80Var.b = 0.0f;
        p80Var.c = iAz;
        p80Var.d = fAy;
        while (true) {
            c = ' ';
            if (fa0Var == null) {
                break;
            }
            rd0 rd0Var = fa0Var.al;
            if (rd0Var != null) {
                float[] fArrB = ((lw) rd0Var).b();
                if (!i60.am(fArrB)) {
                    j60.c(fArrB, p80Var);
                }
            }
            long j = fa0Var.ac;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
            p80Var.a += fIntBitsToFloat;
            p80Var.b += fIntBitsToFloat2;
            p80Var.c += fIntBitsToFloat;
            p80Var.d += fIntBitsToFloat2;
            fa0Var = fa0Var.t;
        }
        int i = (int) p80Var.a;
        int i2 = (int) p80Var.b;
        int i3 = (int) p80Var.c;
        int i4 = (int) p80Var.d;
        int i5 = s20Var.e;
        cc ccVar = this.a;
        if (z) {
            cc ccVar2 = ccVar;
            z2 = true;
            s20 s20VarQ = s20Var.q();
            ccVar2.a(i5, i, i2, i3, i4, s20VarQ == null ? s20VarQ.e : -1, da0Var.h(1024), da0Var.h(16));
        } else {
            int i6 = i5 & 67108863;
            long[] jArr = (long[]) ccVar.b;
            int i7 = ccVar.a;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                char c2 = c;
                cc ccVar3 = ccVar;
                long j2 = jArr[i9];
                z2 = true;
                if ((((int) j2) & 67108863) == i6) {
                    jArr[i8] = (((long) i) << c2) | (((long) i2) & 4294967295L);
                    jArr[i8 + 1] = (((long) i3) << c2) | (((long) i4) & 4294967295L);
                    jArr[i9] = 2305843009213693952L | j2;
                    break;
                } else {
                    i8 += 3;
                    c = c2;
                    ccVar = ccVar3;
                }
            }
            cc ccVar22 = ccVar;
            z2 = true;
            s20 s20VarQ2 = s20Var.q();
            ccVar22.a(i5, i, i2, i3, i4, s20VarQ2 == null ? s20VarQ2.e : -1, da0Var.h(1024), da0Var.h(16));
        }
        this.d = z2;
    }

    public final void d(s20 s20Var) {
        a90 a90VarU = s20Var.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            s20 s20Var2 = (s20) objArr[i2];
            c(s20Var2, false);
            d(s20Var2);
        }
    }

    public final void e(s20 s20Var) {
        this.d = true;
        int i = s20Var.e & 67108863;
        cc ccVar = this.a;
        long[] jArr = (long[]) ccVar.b;
        int i2 = ccVar.a;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
            i3 += 3;
        }
        bs bsVar = this.g;
        boolean z = bsVar != null;
        long j2 = this.b.b;
        if (j2 >= 0 || !z) {
            if (this.h == j2 && z) {
                return;
            }
            if (bsVar != null) {
                Handler handler = bt.a;
                bt.a.removeCallbacks(bsVar);
            }
            Handler handler2 = bt.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j2, ((long) 16) + jCurrentTimeMillis);
            this.h = jMax;
            bs bsVar2 = new bs(this.i, 0);
            bt.a.postDelayed(bsVar2, jMax - jCurrentTimeMillis);
            this.g = bsVar2;
        }
    }

    public final void f(s20 s20Var) {
        long jH = h(s20Var);
        if (!f00.f(jH)) {
            d(s20Var);
            return;
        }
        s20Var.h = jH;
        s20Var.i = false;
        a90 a90VarU = s20Var.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            g((s20) objArr[i2], false);
        }
        e(s20Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(s20 s20Var, boolean z) {
        long j;
        char c;
        o60 o60Var = s20Var.ah.o;
        int iAz = o60Var.az();
        int iAy = o60Var.ay();
        long j2 = s20Var.f;
        long j3 = s20Var.g;
        int i = (int) (j3 >> 32);
        int i2 = (int) (j3 & 4294967295L);
        i(s20Var);
        long j4 = s20Var.f;
        if (!f00.f(j4)) {
            c(s20Var, z);
            return;
        }
        s20Var.g = (((long) iAy) & 4294967295L) | (((long) iAz) << 32);
        int i3 = (int) (j4 >> 32);
        int i4 = (int) (j4 & 4294967295L);
        int i5 = i3 + iAz;
        int i6 = i4 + iAy;
        if (!z && pz.a(j4, j2) && i == iAz && i2 == iAy) {
            return;
        }
        int i7 = s20Var.e;
        da0 da0Var = s20Var.ag;
        cc ccVar = this.a;
        if (z) {
            s20 s20VarQ = s20Var.q();
            ccVar.a(i7, i3, i4, i5, i6, s20VarQ == null ? s20VarQ.e : -1, da0Var.h(1024), da0Var.h(16));
        } else {
            int i8 = i7 & 67108863;
            long[] jArr = (long[]) ccVar.b;
            int i9 = ccVar.a;
            int i10 = 0;
            while (i10 < jArr.length - 2 && i10 < i9) {
                int i11 = i10 + 2;
                int i12 = i10;
                long j5 = jArr[i11];
                if ((((int) j5) & 67108863) == i8) {
                    long j6 = jArr[i12];
                    jArr[i12] = (((long) i3) << 32) | (((long) i4) & 4294967295L);
                    jArr[i12 + 1] = (((long) i5) << 32) | (((long) i6) & 4294967295L);
                    long j7 = 2305843009213693952L;
                    jArr[i11] = j5 | 2305843009213693952L;
                    int i13 = i3 - ((int) (j6 >> 32));
                    int i14 = i4 - ((int) j6);
                    if ((i13 != 0) | (i14 != 0)) {
                        long j8 = -4503599560261633L;
                        char c2 = 26;
                        long[] jArr2 = (long[]) ccVar.b;
                        long[] jArr3 = (long[]) ccVar.c;
                        int i15 = ccVar.a / 3;
                        jArr3[0] = (j5 & (-4503599560261633L)) | (((long) ((i12 + 3) & 67108863)) << 26);
                        int i16 = 1;
                        while (i16 > 0) {
                            i16--;
                            long j9 = jArr3[i16];
                            int i17 = ((int) j9) & 67108863;
                            char c3 = c2;
                            long j10 = j8;
                            int i18 = ((int) (j9 >> c3)) & 67108863;
                            char c4 = '4';
                            int i19 = (int) (j9 >> 52);
                            char c5 = 511;
                            int i20 = i19 & 511;
                            int i21 = i20 == 511 ? i15 : i20 + i18;
                            if (i18 < 0) {
                                break;
                            }
                            while (i18 < jArr2.length - 2 && i18 < i21) {
                                int i22 = i18 + 2;
                                long j11 = jArr2[i22];
                                char c6 = c4;
                                int i23 = i21;
                                if ((((int) (j11 >> c3)) & 67108863) == i17) {
                                    long j12 = jArr2[i18];
                                    int i24 = i18 + 1;
                                    j = j7;
                                    long j13 = jArr2[i24];
                                    jArr2[i18] = (((long) (((int) j12) + i14)) & 4294967295L) | (((long) (((int) (j12 >> 32)) + i13)) << 32);
                                    jArr2[i24] = (((long) (((int) j13) + i14)) & 4294967295L) | (((long) (((int) (j13 >> 32)) + i13)) << 32);
                                    jArr2[i22] = j11 | j;
                                    c = 511;
                                    if ((((int) (j11 >> c6)) & 511) > 0) {
                                        jArr3[i16] = (((long) ((i18 + 3) & 67108863)) << c3) | (j11 & j10);
                                        i16++;
                                    }
                                } else {
                                    j = j7;
                                    c = c5;
                                }
                                i18 += 3;
                                c5 = c;
                                c4 = c6;
                                i21 = i23;
                                j7 = j;
                            }
                            c2 = c3;
                            j8 = j10;
                            j7 = j7;
                        }
                    }
                } else {
                    i10 = i12 + 3;
                }
            }
            s20 s20VarQ2 = s20Var.q();
            ccVar.a(i7, i3, i4, i5, i6, s20VarQ2 == null ? s20VarQ2.e : -1, da0Var.h(1024), da0Var.h(16));
        }
        this.d = true;
    }

    public final void j(s20 s20Var) {
        int i = s20Var.e & 67108863;
        cc ccVar = this.a;
        long[] jArr = (long[]) ccVar.b;
        int i2 = ccVar.a;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
            i3 += 3;
        }
        this.d = true;
        this.f = true;
    }
}

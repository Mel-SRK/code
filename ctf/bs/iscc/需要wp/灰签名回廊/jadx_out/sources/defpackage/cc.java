package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cc {
    public int a;
    public Object b;
    public Object c;

    public void a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        long[] jArr = (long[]) this.b;
        int i7 = this.a;
        int i8 = i7 + 3;
        this.a = i8;
        int length = jArr.length;
        if (length <= i8) {
            int iMax = Math.max(length * 2, i8);
            this.b = Arrays.copyOf(jArr, iMax);
            this.c = Arrays.copyOf((long[]) this.c, iMax);
        }
        long[] jArr2 = (long[]) this.b;
        jArr2[i7] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i7 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i9 = i6 & 67108863;
        jArr2[i7 + 2] = ((z2 ? 1L : 0L) << 63) | ((z ? 1L : 0L) << 62) | (((long) 1) << 61) | (((long) 0) << 52) | (((long) i9) << 26) | ((long) (i & 67108863));
        if (i6 < 0) {
            return;
        }
        for (int i10 = i7 - 3; i10 >= 0; i10 -= 3) {
            int i11 = i10 + 2;
            long j = jArr2[i11];
            if ((((int) j) & 67108863) == i9) {
                jArr2[i11] = (j & (-2301339409586323457L)) | (((long) ((i7 - i10) & 511)) << 52);
                return;
            }
        }
    }

    public void b(int i, iv ivVar) {
        int i2 = i & 67108863;
        long[] jArr = (long[]) this.b;
        int i3 = this.a;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 67108863) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                ivVar.j(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t6 implements s6, v6 {
    public final float d;
    public final float e;

    public t6(float f) {
        this.d = f;
        this.e = f;
    }

    @Override // defpackage.s6, defpackage.v6
    public final float a() {
        return this.e;
    }

    @Override // defpackage.v6
    public final void b(int i, r60 r60Var, int[] iArr, int[] iArr2) {
        c(r60Var, i, iArr, e20.d, iArr2);
    }

    @Override // defpackage.s6
    public final void c(r60 r60Var, int i, int[] iArr, e20 e20Var, int[] iArr2) {
        int i2;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iAi = r60Var.ai(this.d);
        boolean z = e20Var == e20.e;
        n31 n31Var = x6.a;
        if (z) {
            i2 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i3 = iArr[length];
                int iMin2 = Math.min(i2, i - i3);
                iArr2[length] = iMin2;
                iMin = Math.min(iAi, (i - iMin2) - i3);
                i2 = iArr2[length] + i3 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i4 = 0;
            i2 = 0;
            iMin = 0;
            int i5 = 0;
            while (i4 < length2) {
                int i6 = iArr[i4];
                int iMin3 = Math.min(i2, i - i6);
                iArr2[i5] = iMin3;
                int iMin4 = Math.min(iAi, (i - iMin3) - i6);
                int i7 = iArr2[i5] + i6 + iMin4;
                i4++;
                iMin = iMin4;
                i2 = i7;
                i5++;
            }
        }
        if (i2 - iMin < i) {
            int iRound = Math.round((1 + (e20Var != e20.d ? (-1.0f) * (-1) : -1.0f)) * ((i - r5) / 2.0f));
            int length3 = iArr2.length;
            for (int i8 = 0; i8 < length3; i8++) {
                iArr2[i8] = iArr2[i8] + iRound;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6) || !mn.a(this.d, ((t6) obj).d)) {
            return false;
        }
        Object obj2 = w6.f;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return w6.f.hashCode() + n5.e(Float.hashCode(this.d) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) mn.b(this.d)) + ", " + w6.f + ')';
    }
}

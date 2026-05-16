package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bs0 implements Cloneable {
    public /* synthetic */ int[] d;
    public /* synthetic */ Object[] e;
    public /* synthetic */ int f;

    public bs0() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.d = new int[i4];
        this.e = new Object[i4];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bs0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        bs0 bs0Var = (bs0) objClone;
        bs0Var.d = (int[]) this.d.clone();
        bs0Var.e = (Object[]) this.e.clone();
        return bs0Var;
    }

    public final Object b(int i) {
        Object obj;
        int iM = e00.m(this.d, this.f, i);
        if (iM < 0 || (obj = this.e[iM]) == m10.f) {
            return null;
        }
        return obj;
    }

    public final void c(int i, Object obj) {
        int iM = e00.m(this.d, this.f, i);
        if (iM >= 0) {
            this.e[iM] = obj;
            return;
        }
        int i2 = ~iM;
        int i3 = this.f;
        if (i2 < i3) {
            Object[] objArr = this.e;
            if (objArr[i2] == m10.f) {
                this.d[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.d.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.d = Arrays.copyOf(this.d, i7);
            this.e = Arrays.copyOf(this.e, i7);
        }
        int i8 = this.f;
        if (i8 - i2 != 0) {
            int[] iArr = this.d;
            int i9 = i2 + 1;
            h7.as(iArr, iArr, i9, i2, i8);
            Object[] objArr2 = this.e;
            h7.au(objArr2, objArr2, i9, i2, this.f);
        }
        this.d[i2] = i;
        this.e[i2] = obj;
        this.f++;
    }

    public final Object d(int i) {
        Object[] objArr = this.e;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.f;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.d[i3]);
            sb.append('=');
            Object objD = d(i3);
            if (objD != this) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

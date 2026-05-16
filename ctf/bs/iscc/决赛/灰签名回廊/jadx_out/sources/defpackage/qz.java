package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class qz implements Iterable, d10 {
    public final int d;
    public final int e;
    public final int f;

    public qz(int i, int i2, int i3) {
        if (i3 == 0) {
            wc.n("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            wc.n("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.d = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                wc.n("Step is zero.");
                throw null;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.e = i2;
        this.f = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qz)) {
            return false;
        }
        if (isEmpty() && ((qz) obj).isEmpty()) {
            return true;
        }
        qz qzVar = (qz) obj;
        return this.d == qzVar.d && this.e == qzVar.e && this.f == qzVar.f;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.d * 31) + this.e) * 31) + this.f;
    }

    public boolean isEmpty() {
        int i = this.e;
        int i2 = this.f;
        int i3 = this.d;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new rz(this.d, this.e, this.f);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.e;
        int i2 = this.f;
        int i3 = this.d;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}

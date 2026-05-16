package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hf0 extends s {
    public final Object[] f;
    public final ty0 g;

    public hf0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.f = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.g = new ty0(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            wc.p();
            return null;
        }
        ty0 ty0Var = this.g;
        if (ty0Var.hasNext()) {
            this.d++;
            return ty0Var.next();
        }
        int i = this.d;
        this.d = i + 1;
        return this.f[i - ty0Var.e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            wc.p();
            return null;
        }
        int i = this.d;
        ty0 ty0Var = this.g;
        int i2 = ty0Var.e;
        if (i <= i2) {
            this.d = i - 1;
            return ty0Var.previous();
        }
        int i3 = i - 1;
        this.d = i3;
        return this.f[i3 - i2];
    }
}

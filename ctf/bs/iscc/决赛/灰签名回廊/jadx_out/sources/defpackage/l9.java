package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l9 extends s {
    public final /* synthetic */ int f = 1;
    public final Object g;

    public l9(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.g = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f) {
            case 0:
                if (!hasNext()) {
                    wc.p();
                } else {
                    Object[] objArr = (Object[]) this.g;
                    int i = this.d;
                    this.d = i + 1;
                }
                break;
            default:
                if (!hasNext()) {
                    wc.p();
                } else {
                    this.d++;
                }
                break;
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f) {
            case 0:
                if (!hasPrevious()) {
                    wc.p();
                } else {
                    Object[] objArr = (Object[]) this.g;
                    int i = this.d - 1;
                    this.d = i;
                }
                break;
            default:
                if (!hasPrevious()) {
                    wc.p();
                } else {
                    this.d--;
                }
                break;
        }
        return null;
    }

    public l9(int i, Object obj) {
        super(i, 1);
        this.g = obj;
    }
}

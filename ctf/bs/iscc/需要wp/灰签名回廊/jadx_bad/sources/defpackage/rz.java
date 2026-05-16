package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rz implements Iterator, d10 {
    public final int d;
    public final int e;
    public boolean f;
    public int g;

    public rz(int i, int i2, int i3) {
        this.d = i3;
        this.e = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f = z;
        this.g = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.g;
        if (i != this.e) {
            this.g = this.d + i;
            return i;
        }
        if (this.f) {
            this.f = false;
            return i;
        }
        wc.p();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

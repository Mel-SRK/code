package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class p extends o implements ListIterator {
    public final /* synthetic */ r g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, int i) {
        super(rVar);
        this.g = rVar;
        int iA = rVar.a();
        if (i < 0 || i > iA) {
            wc.g(n5.g("index: ", i, ", size: ", iA));
            throw null;
        }
        this.e = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            wc.p();
            return null;
        }
        int i = this.e - 1;
        this.e = i;
        return this.g.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

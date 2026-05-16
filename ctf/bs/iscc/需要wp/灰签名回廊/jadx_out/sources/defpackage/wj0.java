package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class wj0 extends r {
    public final List d;

    public wj0(List list) {
        list.getClass();
        this.d = list;
    }

    @Override // defpackage.i
    public final int a() {
        return this.d.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= f00.v(this)) {
            return this.d.get(f00.v(this) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new sz(0, f00.v(this), 1) + "].");
    }

    @Override // defpackage.r, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new vj0(this, 0);
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator() {
        return new vj0(this, 0);
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator(int i) {
        return new vj0(this, i);
    }
}

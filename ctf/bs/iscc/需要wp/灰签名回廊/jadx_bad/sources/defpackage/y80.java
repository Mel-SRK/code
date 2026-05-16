package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class y80 implements List, e10 {
    public final Object d;
    public final int e;
    public int f;

    public y80(List list, int i, int i2) {
        this.d = list;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.d.add(i + this.e, obj);
        this.f++;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.d.addAll(i + this.e, collection);
        int size = collection.size();
        this.f += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f - 1;
        int i2 = this.e;
        if (i2 <= i) {
            while (true) {
                this.d.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.f = i2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f;
        for (int i2 = this.e; i2 < i; i2++) {
            if (f00.h(this.d.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i) {
        b90.a(i, this);
        return this.d.get(i + this.e);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f;
        int i2 = this.e;
        for (int i3 = i2; i3 < i; i3++) {
            if (f00.h(this.d.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f == this.e;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new z80(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f - 1;
        int i2 = this.e;
        if (i2 > i) {
            return -1;
        }
        while (!f00.h(this.d.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new z80(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f;
        for (int i2 = this.e; i2 < i; i2++) {
            ?? r2 = this.d;
            if (f00.h(r2.get(i2), obj)) {
                r2.remove(i2);
                this.f--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.f;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f;
        int i2 = i - 1;
        int i3 = this.e;
        if (i3 <= i2) {
            while (true) {
                ?? r3 = this.d;
                if (!collection.contains(r3.get(i2))) {
                    r3.remove(i2);
                    this.f--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b90.a(i, this);
        return this.d.set(i + this.e, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f - this.e;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b90.b(this, i, i2);
        return new y80(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return az0.ak(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return az0.al(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new z80(i, this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f;
        this.f = i + 1;
        this.d.add(i, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.d.addAll(this.f, collection);
        int size = collection.size();
        this.f += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i) {
        b90.a(i, this);
        this.f--;
        return this.d.remove(i + this.e);
    }
}

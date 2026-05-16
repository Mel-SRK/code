package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class x80 implements List, e10 {
    public final a90 d;

    public x80(a90 a90Var) {
        this.d = a90Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.d.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        a90 a90Var = this.d;
        return a90Var.e(a90Var.f, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.d.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.d.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b90.a(i, this);
        return this.d.d[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a90 a90Var = this.d;
        Object[] objArr = a90Var.d;
        int i = a90Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (f00.h(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.f == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new z80(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a90 a90Var = this.d;
        Object[] objArr = a90Var.d;
        for (int i = a90Var.f - 1; i >= 0; i--) {
            if (f00.h(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new z80(0, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b90.a(i, this);
        return this.d.j(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        a90 a90Var = this.d;
        int i = a90Var.f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a90Var.i(it.next());
        }
        return i != a90Var.f;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        a90 a90Var = this.d;
        int i = a90Var.f;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(a90Var.d[i2])) {
                a90Var.j(i2);
            }
        }
        return i != a90Var.f;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b90.a(i, this);
        Object[] objArr = this.d.d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d.f;
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
    public final void add(int i, Object obj) {
        this.d.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new z80(i, this);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.d.e(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.d.i(obj);
    }
}

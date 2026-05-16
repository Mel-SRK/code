package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class m40 extends t implements RandomAccess, Serializable {
    public Object[] d;
    public final int e;
    public int f;
    public final m40 g;
    public final n40 h;

    public m40(Object[] objArr, int i, int i2, m40 m40Var, n40 n40Var) {
        objArr.getClass();
        n40Var.getClass();
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.g = m40Var;
        this.h = n40Var;
        ((AbstractList) this).modCount = ((AbstractList) n40Var).modCount;
    }

    @Override // defpackage.t
    public final int a() {
        f();
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i2 = this.f;
        if (i < 0 || i > i2) {
            wc.g(n5.g("index: ", i, ", size: ", i2));
        } else {
            e(this.e + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        f();
        int i2 = this.f;
        if (i < 0 || i > i2) {
            wc.g(n5.g("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        d(this.e + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.t
    public final Object b(int i) {
        g();
        f();
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            return h(this.e + i);
        }
        wc.g(n5.g("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.e, this.f);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        n40 n40Var = this.h;
        m40 m40Var = this.g;
        if (m40Var != null) {
            m40Var.d(i, collection, i2);
        } else {
            n40 n40Var2 = n40.g;
            n40Var.d(i, collection, i2);
        }
        this.d = n40Var.d;
        this.f += i2;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        n40 n40Var = this.h;
        m40 m40Var = this.g;
        if (m40Var != null) {
            m40Var.e(i, obj);
        } else {
            n40 n40Var2 = n40.g;
            n40Var.e(i, obj);
        }
        this.d = n40Var.d;
        this.f++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.d;
            int i = this.f;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (f00.h(objArr[this.e + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (((AbstractList) this.h).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.h.f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            return this.d[this.e + i];
        }
        wc.g(n5.g("index: ", i, ", size: ", i2));
        return null;
    }

    public final Object h(int i) {
        Object objH;
        ((AbstractList) this).modCount++;
        m40 m40Var = this.g;
        if (m40Var != null) {
            objH = m40Var.h(i);
        } else {
            n40 n40Var = n40.g;
            objH = this.h.h(i);
        }
        this.f--;
        return objH;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.d;
        int i = this.f;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.e + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        m40 m40Var = this.g;
        if (m40Var != null) {
            m40Var.i(i, i2);
        } else {
            n40 n40Var = n40.g;
            this.h.i(i, i2);
        }
        this.f -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.f; i++) {
            if (f00.h(this.d[this.e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i2, Collection collection, boolean z) {
        int iJ;
        m40 m40Var = this.g;
        if (m40Var != null) {
            iJ = m40Var.j(i, i2, collection, z);
        } else {
            n40 n40Var = n40.g;
            iJ = this.h.j(i, i2, collection, z);
        }
        if (iJ > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f -= iJ;
        return iJ;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.f - 1; i >= 0; i--) {
            if (f00.h(this.d[this.e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i2 = this.f;
        if (i >= 0 && i <= i2) {
            return new nx(this, i);
        }
        wc.g(n5.g("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return j(this.e, this.f, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return j(this.e, this.f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i2 = this.f;
        if (i < 0 || i >= i2) {
            wc.g(n5.g("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.d;
        int i3 = this.e;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        f00.l(i, i2, this.f);
        return new m40(this.d, this.e + i, i2 - i, this, this.h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        f();
        int length = objArr.length;
        int i = this.f;
        Object[] objArr2 = this.d;
        int i2 = this.e;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        h7.au(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.f;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return az0.l(this.d, this.e, this.f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.e + this.f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.d;
        int i = this.f;
        int i2 = this.e;
        return h7.ax(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        f();
        int size = collection.size();
        d(this.e + this.f, collection, size);
        return size > 0;
    }
}

package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e7 implements Collection {
    public final /* synthetic */ f7 d;

    public e7(f7 f7Var) {
        this.d = f7Var;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b7(this.d, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        f7 f7Var = this.d;
        int iA = f7Var.a(obj);
        if (iA < 0) {
            return false;
        }
        f7Var.f(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        f7 f7Var = this.d;
        int i = f7Var.f;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(f7Var.h(i2))) {
                f7Var.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        f7 f7Var = this.d;
        int i = f7Var.f;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(f7Var.h(i2))) {
                f7Var.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.d.f;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f7 f7Var = this.d;
        int i = f7Var.f;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = f7Var.h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        f7 f7Var = this.d;
        int i = f7Var.f;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = f7Var.h(i2);
        }
        return objArr;
    }
}

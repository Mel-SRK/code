package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class jt0 implements List, e10 {
    public final pr0 d;
    public final int e;
    public int f;
    public int g;

    public jt0(pr0 pr0Var, int i, int i2) {
        this.d = pr0Var;
        this.e = i;
        this.f = e00.ab(pr0Var);
        this.g = i2 - i;
    }

    public final void a() {
        if (e00.ab(this.d) != this.f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.e + this.g;
        pr0 pr0Var = this.d;
        pr0Var.add(i, obj);
        this.g++;
        this.f = e00.ab(pr0Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.e;
        pr0 pr0Var = this.d;
        boolean zAddAll = pr0Var.addAll(i2, collection);
        if (zAddAll) {
            this.g = collection.size() + this.g;
            this.f = e00.ab(pr0Var);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.g > 0) {
            a();
            int i = this.g;
            int i2 = this.e;
            pr0 pr0Var = this.d;
            pr0Var.d(i2, i + i2);
            this.g = 0;
            this.f = e00.ab(pr0Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        e00.j(i, this.g);
        return this.d.get(this.e + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        a();
        int i = this.g;
        int i2 = this.e;
        Iterator it = i60.bb(i2, i + i2).iterator();
        do {
            rz rzVar = (rz) it;
            if (!rzVar.f) {
                return -1;
            }
            iNextInt = rzVar.nextInt();
        } while (!f00.h(obj, this.d.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.g;
        int i2 = this.e;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (f00.h(obj, this.d.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        vi0 vi0Var = new vi0();
        vi0Var.d = i - 1;
        return new vj0(vi0Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.e + i;
        pr0 pr0Var = this.d;
        Object objRemove = pr0Var.remove(i2);
        this.g--;
        this.f = e00.ab(pr0Var);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        w wVar;
        xq0 xq0VarK;
        boolean zL;
        a();
        pr0 pr0Var = this.d;
        int i2 = this.e;
        int i3 = this.g + i2;
        int size = pr0Var.size();
        do {
            synchronized (e00.v) {
                ss0 ss0Var = pr0Var.d;
                ss0Var.getClass();
                ss0 ss0Var2 = (ss0) fr0.i(ss0Var);
                i = ss0Var2.d;
                wVar = ss0Var2.c;
            }
            wVar.getClass();
            gf0 gf0VarE = wVar.e();
            gf0VarE.subList(i2, i3).retainAll(collection);
            w wVarC = gf0VarE.c();
            if (f00.h(wVarC, wVar)) {
                break;
            }
            ss0 ss0Var3 = pr0Var.d;
            ss0Var3.getClass();
            synchronized (fr0.c) {
                xq0VarK = fr0.k();
                zL = e00.l((ss0) fr0.w(ss0Var3, pr0Var, xq0VarK), i, wVarC, true);
            }
            fr0.n(xq0VarK, pr0Var);
        } while (!zL);
        int size2 = size - pr0Var.size();
        if (size2 > 0) {
            this.f = e00.ab(this.d);
            this.g -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        e00.j(i, this.g);
        a();
        int i2 = i + this.e;
        pr0 pr0Var = this.d;
        Object obj2 = pr0Var.set(i2, obj);
        this.f = e00.ab(pr0Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.g;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.g) {
            dh0.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.e;
        return new jt0(this.d, i + i3, i2 + i3);
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
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.e + i;
        pr0 pr0Var = this.d;
        pr0Var.add(i2, obj);
        this.g++;
        this.f = e00.ab(pr0Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.g, collection);
    }
}

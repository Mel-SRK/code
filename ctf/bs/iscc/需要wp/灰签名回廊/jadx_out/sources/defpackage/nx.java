package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class nx implements ListIterator, d10 {
    public final /* synthetic */ int d;
    public int e;
    public int f;
    public int g;
    public final Object h;

    public nx(pr0 pr0Var, int i) {
        this.d = 3;
        this.h = pr0Var;
        this.e = i - 1;
        this.f = -1;
        this.g = e00.ab(pr0Var);
    }

    public void a() {
        if (((AbstractList) ((m40) this.h).h).modCount != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                m40 m40Var = (m40) this.h;
                int i = this.e;
                this.e = i + 1;
                m40Var.add(i, obj);
                this.f = -1;
                this.g = ((AbstractList) m40Var).modCount;
                return;
            case 2:
                b();
                n40 n40Var = (n40) this.h;
                int i2 = this.e;
                this.e = i2 + 1;
                n40Var.add(i2, obj);
                this.f = -1;
                this.g = ((AbstractList) n40Var).modCount;
                return;
            default:
                c();
                pr0 pr0Var = (pr0) this.h;
                pr0Var.add(this.e + 1, obj);
                this.f = -1;
                this.e++;
                this.g = e00.ab(pr0Var);
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((n40) this.h)).modCount != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (e00.ab((pr0) this.h) != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                return this.e < this.g;
            case 1:
                return this.e < ((m40) this.h).f;
            case 2:
                return this.e < ((n40) this.h).e;
            default:
                return this.e < ((pr0) this.h).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.d) {
            case 0:
                if (this.e > this.f) {
                }
                break;
            case 1:
                if (this.e > 0) {
                }
                break;
            case 2:
                if (this.e > 0) {
                }
                break;
            default:
                if (this.e >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                m80 m80Var = ((px) this.h).d;
                int i = this.e;
                this.e = i + 1;
                Object objE = m80Var.e(i);
                objE.getClass();
                return (i70) objE;
            case 1:
                a();
                int i2 = this.e;
                m40 m40Var = (m40) this.h;
                if (i2 >= m40Var.f) {
                    wc.p();
                    return null;
                }
                this.e = i2 + 1;
                this.f = i2;
                return m40Var.d[m40Var.e + i2];
            case 2:
                b();
                int i3 = this.e;
                n40 n40Var = (n40) this.h;
                if (i3 >= n40Var.e) {
                    wc.p();
                    return null;
                }
                this.e = i3 + 1;
                this.f = i3;
                return n40Var.d[i3];
            default:
                c();
                int i4 = this.e + 1;
                this.f = i4;
                pr0 pr0Var = (pr0) this.h;
                e00.j(i4, pr0Var.size());
                Object obj = pr0Var.get(i4);
                this.e = i4;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.d) {
            case 0:
                return this.e - this.f;
            case 1:
                return this.e;
            case 2:
                return this.e;
            default:
                return this.e + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.d) {
            case 0:
                m80 m80Var = ((px) this.h).d;
                int i = this.e - 1;
                this.e = i;
                Object objE = m80Var.e(i);
                objE.getClass();
                return (i70) objE;
            case 1:
                a();
                int i2 = this.e;
                if (i2 <= 0) {
                    wc.p();
                    return null;
                }
                int i3 = i2 - 1;
                this.e = i3;
                this.f = i3;
                m40 m40Var = (m40) this.h;
                return m40Var.d[m40Var.e + i3];
            case 2:
                b();
                int i4 = this.e;
                if (i4 <= 0) {
                    wc.p();
                    return null;
                }
                int i5 = i4 - 1;
                this.e = i5;
                this.f = i5;
                return ((n40) this.h).d[i5];
            default:
                c();
                int i6 = this.e;
                pr0 pr0Var = (pr0) this.h;
                e00.j(i6, pr0Var.size());
                int i7 = this.e;
                this.f = i7;
                this.e--;
                return pr0Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.d) {
            case 0:
                i = this.e - this.f;
                break;
            case 1:
                i = this.e;
                break;
            case 2:
                i = this.e;
                break;
            default:
                return this.e;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                m40 m40Var = (m40) this.h;
                a();
                int i = this.f;
                if (i == -1) {
                    wc.q("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                m40Var.b(i);
                this.e = this.f;
                this.f = -1;
                this.g = ((AbstractList) m40Var).modCount;
                return;
            case 2:
                n40 n40Var = (n40) this.h;
                b();
                int i2 = this.f;
                if (i2 == -1) {
                    wc.q("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                n40Var.b(i2);
                this.e = this.f;
                this.f = -1;
                this.g = ((AbstractList) n40Var).modCount;
                return;
            default:
                c();
                pr0 pr0Var = (pr0) this.h;
                pr0Var.remove(this.f);
                this.e--;
                this.f = -1;
                this.g = e00.ab(pr0Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i = this.f;
                if (i != -1) {
                    ((m40) this.h).set(i, obj);
                    return;
                } else {
                    wc.q("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i2 = this.f;
                if (i2 != -1) {
                    ((n40) this.h).set(i2, obj);
                    return;
                } else {
                    wc.q("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                pr0 pr0Var = (pr0) this.h;
                c();
                int i3 = this.f;
                if (i3 < 0) {
                    wc.q("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    pr0Var.set(i3, obj);
                    this.g = e00.ab(pr0Var);
                    return;
                }
        }
    }

    public nx(n40 n40Var, int i) {
        this.d = 2;
        this.h = n40Var;
        this.e = i;
        this.f = -1;
        this.g = ((AbstractList) n40Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nx(px pxVar, int i, int i2) {
        this(pxVar, (i2 & 1) != 0 ? 0 : i, 0, pxVar.d.b);
        this.d = 0;
    }

    public nx(px pxVar, int i, int i2, int i3) {
        this.d = 0;
        this.h = pxVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public nx(m40 m40Var, int i) {
        this.d = 1;
        this.h = m40Var;
        this.e = i;
        this.f = -1;
        this.g = ((AbstractList) m40Var).modCount;
    }
}

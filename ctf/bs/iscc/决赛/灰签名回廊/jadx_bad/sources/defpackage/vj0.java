package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class vj0 implements ListIterator, d10 {
    public final /* synthetic */ int d = 1;
    public final Object e;
    public final /* synthetic */ Object f;

    public vj0(wj0 wj0Var, int i) {
        this.f = wj0Var;
        List list = wj0Var.d;
        if (i >= 0 && i <= wj0Var.a()) {
            this.e = list.listIterator(wj0Var.a() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new sz(0, wj0Var.a(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                return ((ListIterator) this.e).hasPrevious();
            default:
                return ((vi0) this.e).d < ((jt0) this.f).g - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.d) {
            case 0:
                return ((ListIterator) this.e).hasNext();
            default:
                return ((vi0) this.e).d >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                return ((ListIterator) this.e).previous();
            default:
                vi0 vi0Var = (vi0) this.e;
                int i = vi0Var.d + 1;
                jt0 jt0Var = (jt0) this.f;
                e00.j(i, jt0Var.g);
                vi0Var.d = i;
                return jt0Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.d) {
            case 0:
                wj0 wj0Var = (wj0) this.f;
                return (wj0Var.size() - 1) - ((ListIterator) this.e).previousIndex();
            default:
                return ((vi0) this.e).d + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.d) {
            case 0:
                return ((ListIterator) this.e).next();
            default:
                vi0 vi0Var = (vi0) this.e;
                int i = vi0Var.d;
                jt0 jt0Var = (jt0) this.f;
                e00.j(i, jt0Var.g);
                vi0Var.d = i - 1;
                return jt0Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.d) {
            case 0:
                wj0 wj0Var = (wj0) this.f;
                return (wj0Var.size() - 1) - ((ListIterator) this.e).nextIndex();
            default:
                return ((vi0) this.e).d;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public vj0(vi0 vi0Var, jt0 jt0Var) {
        this.e = vi0Var;
        this.f = jt0Var;
    }
}

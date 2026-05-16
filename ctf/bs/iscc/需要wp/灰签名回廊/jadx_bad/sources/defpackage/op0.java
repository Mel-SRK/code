package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class op0 implements Iterator, ji, d10 {
    public int d;
    public Object e;
    public ji f;

    public final RuntimeException a() {
        int i = this.d;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.d);
    }

    public final void b(Object obj, rj0 rj0Var) {
        this.e = obj;
        this.d = 3;
        this.f = rj0Var;
    }

    @Override // defpackage.ji
    public final pj e() {
        return pq.d;
    }

    @Override // defpackage.ji
    public final void h(Object obj) {
        i60.az(obj);
        this.d = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.d;
            if (i != 0) {
                break;
            }
            this.d = 5;
            ji jiVar = this.f;
            jiVar.getClass();
            this.f = null;
            jiVar.h(wz0.a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            wc.p();
            return null;
        }
        if (i == 2) {
            this.d = 1;
            throw null;
        }
        if (i != 3) {
            throw a();
        }
        this.d = 0;
        Object obj = this.e;
        this.e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

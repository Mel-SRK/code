package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class tw implements Iterator, d10 {
    public final /* synthetic */ int d = 0;
    public final sq0 e;
    public final int f;
    public int g;
    public int h;

    public tw(sq0 sq0Var, int i, int i2) {
        this.e = sq0Var;
        this.f = i2;
        this.g = i;
        this.h = sq0Var.k;
        if (sq0Var.j) {
            uq0.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                return this.g < this.f;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                sq0 sq0Var = this.e;
                int i = sq0Var.k;
                int i2 = this.h;
                if (i != i2) {
                    uq0.e();
                }
                int i3 = this.g;
                this.g = sq0Var.d[(i3 * 5) + 3] + i3;
                return new tq0(sq0Var, i3, i2);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public tw(sq0 sq0Var, int i, uw uwVar, lI lIVar) {
        this.e = sq0Var;
        this.f = i;
        this.g = sq0Var.k;
    }
}

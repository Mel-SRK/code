package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b7 implements Iterator, d10 {
    public int d;
    public int e;
    public boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b7(f7 f7Var, int i) {
        this(f7Var.f);
        this.g = i;
        switch (i) {
            case 1:
                this.h = f7Var;
                this(f7Var.f);
                break;
            default:
                this.h = f7Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            wc.p();
            return null;
        }
        int i = this.e;
        switch (this.g) {
            case 0:
                objE = ((f7) this.h).e(i);
                break;
            case 1:
                objE = ((f7) this.h).h(i);
                break;
            default:
                objE = ((g7) this.h).e[i];
                break;
        }
        this.e++;
        this.f = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f) {
            wc.q("Call next() before removing an element.");
            return;
        }
        int i = this.e - 1;
        this.e = i;
        switch (this.g) {
            case 0:
                ((f7) this.h).f(i);
                break;
            case 1:
                ((f7) this.h).f(i);
                break;
            default:
                ((g7) this.h).a(i);
                break;
        }
        this.d--;
        this.f = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b7(g7 g7Var) {
        this(g7Var.f);
        this.g = 2;
        this.h = g7Var;
    }

    public b7(int i) {
        this.d = i;
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a60 {
    public int d;
    public int e;
    public int f;
    public Object g;

    public a60() {
        if (yf0.e == null) {
            yf0.e = new yf0(21);
        }
    }

    public int a(int i) {
        if (i < this.f) {
            return ((ByteBuffer) this.g).getShort(this.e + i);
        }
        return 0;
    }

    public void b() {
        if (((b60) this.g).k != this.f) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i = this.d;
            b60 b60Var = (b60) this.g;
            if (i >= b60Var.i || b60Var.f[i] >= 0) {
                return;
            } else {
                this.d = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.d < ((b60) this.g).i;
    }

    public void remove() {
        b60 b60Var = (b60) this.g;
        b();
        if (this.e == -1) {
            wc.q("Call next() before removing element from the iterator.");
            return;
        }
        b60Var.b();
        b60Var.j(this.e);
        this.e = -1;
        this.f = b60Var.k;
    }
}

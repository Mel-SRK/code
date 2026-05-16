package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class we0 implements Iterator, d10 {
    public final vy0[] d;
    public int e;
    public boolean f = true;

    public we0(uy0 uy0Var, vy0[] vy0VarArr) {
        this.d = vy0VarArr;
        vy0VarArr[0].a(uy0Var.d, Integer.bitCount(uy0Var.a) * 2, 0);
        this.e = 0;
        a();
    }

    public final void a() {
        int i = this.e;
        vy0[] vy0VarArr = this.d;
        vy0 vy0Var = vy0VarArr[i];
        if (vy0Var.f < vy0Var.e) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                vy0 vy0Var2 = vy0VarArr[i];
                int i2 = vy0Var2.f;
                Object[] objArr = vy0Var2.d;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    vy0Var2.f = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.e = iB;
                return;
            }
            if (i > 0) {
                vy0 vy0Var3 = vy0VarArr[i - 1];
                int i3 = vy0Var3.f;
                int length2 = vy0Var3.d.length;
                vy0Var3.f = i3 + 1;
            }
            vy0VarArr[i].a(uy0.e.d, 0, 0);
            i--;
        }
        this.f = false;
    }

    public final int b(int i) {
        vy0[] vy0VarArr = this.d;
        vy0 vy0Var = vy0VarArr[i];
        int i2 = vy0Var.f;
        if (i2 < vy0Var.e) {
            return i;
        }
        Object[] objArr = vy0Var.d;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        uy0 uy0Var = (uy0) obj;
        if (i == 6) {
            vy0 vy0Var2 = vy0VarArr[i + 1];
            Object[] objArr2 = uy0Var.d;
            vy0Var2.a(objArr2, objArr2.length, 0);
        } else {
            vy0VarArr[i + 1].a(uy0Var.d, Integer.bitCount(uy0Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f) {
            wc.p();
            return null;
        }
        Object next = this.d[this.e].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

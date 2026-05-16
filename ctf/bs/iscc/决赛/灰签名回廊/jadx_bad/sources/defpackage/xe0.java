package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public class xe0 extends we0 {
    public final ue0 g;
    public Object h;
    public boolean i;
    public int j;

    public xe0(ue0 ue0Var, vy0[] vy0VarArr) {
        super(ue0Var.e, vy0VarArr);
        this.g = ue0Var;
        this.j = ue0Var.g;
    }

    public final void c(int i, uy0 uy0Var, Object obj, int i2) {
        int i3 = i2 * 5;
        vy0[] vy0VarArr = this.d;
        if (i3 <= 30) {
            int iK = 1 << qo0.k(i, i3);
            if (uy0Var.h(iK)) {
                vy0VarArr[i2].a(uy0Var.d, Integer.bitCount(uy0Var.a) * 2, uy0Var.f(iK));
                this.e = i2;
                return;
            } else {
                int iT = uy0Var.t(iK);
                uy0 uy0VarS = uy0Var.s(iT);
                vy0VarArr[i2].a(uy0Var.d, Integer.bitCount(uy0Var.a) * 2, iT);
                c(i, uy0VarS, obj, i2 + 1);
                return;
            }
        }
        vy0 vy0Var = vy0VarArr[i2];
        Object[] objArr = uy0Var.d;
        vy0Var.a(objArr, objArr.length, 0);
        while (true) {
            vy0 vy0Var2 = vy0VarArr[i2];
            if (f00.h(vy0Var2.d[vy0Var2.f], obj)) {
                this.e = i2;
                return;
            } else {
                vy0VarArr[i2].f += 2;
            }
        }
    }

    @Override // defpackage.we0, java.util.Iterator
    public final Object next() {
        if (this.g.g != this.j) {
            throw new ConcurrentModificationException();
        }
        if (!this.f) {
            wc.p();
            return null;
        }
        vy0 vy0Var = this.d[this.e];
        this.h = vy0Var.d[vy0Var.f];
        this.i = true;
        return super.next();
    }

    @Override // defpackage.we0, java.util.Iterator
    public final void remove() {
        if (!this.i) {
            throw new IllegalStateException();
        }
        boolean z = this.f;
        ue0 ue0Var = this.g;
        if (!z) {
            az0.o(ue0Var).remove(this.h);
        } else {
            if (!z) {
                wc.p();
                return;
            }
            vy0 vy0Var = this.d[this.e];
            Object obj = vy0Var.d[vy0Var.f];
            az0.o(ue0Var).remove(this.h);
            c(obj != null ? obj.hashCode() : 0, ue0Var.e, obj, 0);
        }
        this.h = null;
        this.i = false;
        this.j = ue0Var.g;
    }
}

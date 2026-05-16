package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y50 extends a60 implements Iterator, d10 {
    public final /* synthetic */ int h;

    public y50(b60 b60Var, int i) {
        this.h = i;
        b60Var.getClass();
        this.g = b60Var;
        this.e = -1;
        this.f = b60Var.k;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                b();
                int i = this.d;
                b60 b60Var = (b60) this.g;
                if (i >= b60Var.i) {
                    wc.p();
                } else {
                    this.d = i + 1;
                    this.e = i;
                    z50 z50Var = new z50(b60Var, i);
                    c();
                }
                break;
            case 1:
                b();
                int i2 = this.d;
                b60 b60Var2 = (b60) this.g;
                if (i2 >= b60Var2.i) {
                    wc.p();
                } else {
                    this.d = i2 + 1;
                    this.e = i2;
                    Object obj = b60Var2.d[i2];
                    c();
                }
                break;
            default:
                b();
                int i3 = this.d;
                b60 b60Var3 = (b60) this.g;
                if (i3 >= b60Var3.i) {
                    wc.p();
                } else {
                    this.d = i3 + 1;
                    this.e = i3;
                    Object[] objArr = b60Var3.e;
                    objArr.getClass();
                    Object obj2 = objArr[this.e];
                    c();
                }
                break;
        }
        return null;
    }
}

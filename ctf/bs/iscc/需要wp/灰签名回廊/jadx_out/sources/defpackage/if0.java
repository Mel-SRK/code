package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public final class if0 extends s {
    public final gf0 f;
    public int g;
    public ty0 h;
    public int i;

    public if0(gf0 gf0Var, int i) {
        super(i, gf0Var.k);
        this.f = gf0Var;
        this.g = gf0Var.e();
        this.i = -1;
        b();
    }

    public final void a() {
        if (this.g != this.f.e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.s, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.d;
        gf0 gf0Var = this.f;
        gf0Var.add(i, obj);
        this.d++;
        this.e = gf0Var.a();
        this.g = gf0Var.e();
        this.i = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        gf0 gf0Var = this.f;
        Object[] objArr = gf0Var.i;
        if (objArr == null) {
            this.h = null;
            return;
        }
        int i = (gf0Var.k - 1) & (-32);
        int i2 = this.d;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (gf0Var.g / 5) + 1;
        ty0 ty0Var = this.h;
        if (ty0Var == null) {
            this.h = new ty0(objArr, i2, i, i3);
            return;
        }
        ty0Var.d = i2;
        ty0Var.e = i;
        ty0Var.f = i3;
        if (ty0Var.g.length < i3) {
            ty0Var.g = new Object[i3];
        }
        ty0Var.g[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        ty0Var.h = r6;
        ty0Var.b(i2 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            wc.p();
            return null;
        }
        int i = this.d;
        this.i = i;
        ty0 ty0Var = this.h;
        gf0 gf0Var = this.f;
        if (ty0Var == null) {
            Object[] objArr = gf0Var.j;
            this.d = i + 1;
            return objArr[i];
        }
        if (ty0Var.hasNext()) {
            this.d++;
            return ty0Var.next();
        }
        Object[] objArr2 = gf0Var.j;
        int i2 = this.d;
        this.d = i2 + 1;
        return objArr2[i2 - ty0Var.e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            wc.p();
            return null;
        }
        int i = this.d;
        this.i = i - 1;
        ty0 ty0Var = this.h;
        gf0 gf0Var = this.f;
        if (ty0Var == null) {
            Object[] objArr = gf0Var.j;
            int i2 = i - 1;
            this.d = i2;
            return objArr[i2];
        }
        int i3 = ty0Var.e;
        if (i <= i3) {
            this.d = i - 1;
            return ty0Var.previous();
        }
        Object[] objArr2 = gf0Var.j;
        int i4 = i - 1;
        this.d = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.s, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.i;
        if (i == -1) {
            throw new IllegalStateException();
        }
        gf0 gf0Var = this.f;
        gf0Var.b(i);
        int i2 = this.i;
        if (i2 < this.d) {
            this.d = i2;
        }
        this.e = gf0Var.a();
        this.g = gf0Var.e();
        this.i = -1;
        b();
    }

    @Override // defpackage.s, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.i;
        if (i == -1) {
            throw new IllegalStateException();
        }
        gf0 gf0Var = this.f;
        gf0Var.set(i, obj);
        this.g = gf0Var.e();
        b();
    }
}

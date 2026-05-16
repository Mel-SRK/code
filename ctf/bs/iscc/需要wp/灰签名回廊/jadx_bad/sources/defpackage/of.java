package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class of {
    public final vf a;
    public wa b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final xz d = new xz();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public of(vf vfVar, wa waVar) {
        this.a = vfVar;
        this.b = waVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            vc0 vc0Var = this.b.k;
            vc0Var.ar(rc0.c);
            vc0Var.m[vc0Var.n - vc0Var.k[vc0Var.l - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        wa waVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        waVar.getClass();
        if (size != 0) {
            vc0 vc0Var2 = waVar.k;
            vc0Var2.ar(vb0.c);
            e00.aj(vc0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                vc0 vc0Var = this.b.k;
                vc0Var.ar(jc0.c);
                int i3 = vc0Var.n - vc0Var.k[vc0Var.l - 1].a;
                int[] iArr = vc0Var.m;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                vc0 vc0Var2 = this.b.k;
                vc0Var2.ar(gc0.c);
                int i6 = vc0Var2.n - vc0Var2.k[vc0Var2.l - 1].a;
                int[] iArr2 = vc0Var2.m;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        rq0 rq0Var = this.a.af;
        int i = z ? rq0Var.i : rq0Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            xf.c("Tried to seek backward");
        }
        if (i2 > 0) {
            vc0 vc0Var = this.b.k;
            vc0Var.ar(pb0.c);
            vc0Var.m[vc0Var.n - vc0Var.k[vc0Var.l - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                xf.c("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}

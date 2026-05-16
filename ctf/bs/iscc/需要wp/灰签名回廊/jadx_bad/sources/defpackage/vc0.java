package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vc0 extends f00 {
    public int l;
    public int n;
    public int p;
    public tc0[] k = new tc0[16];
    public int[] m = new int[16];
    public Object[] o = new Object[16];

    public final void an() {
        this.l = 0;
        this.n = 0;
        Arrays.fill(this.o, 0, this.p, (Object) null);
        this.p = 0;
    }

    public final void ao(p6 p6Var, vq0 vq0Var, da0 da0Var, uc0 uc0Var) {
        if (aq()) {
            tv tvVar = new tv(this);
            vc0 vc0Var = (vc0) tvVar.e;
            while (true) {
                tc0 tc0Var = vc0Var.k[tvVar.b];
                Il ilB = tc0Var.b(tvVar);
                p6 p6Var2 = p6Var;
                vq0 vq0Var2 = vq0Var;
                da0 da0Var2 = da0Var;
                uc0 uc0Var2 = uc0Var;
                try {
                    tc0Var.a(tvVar, p6Var2, vq0Var2, da0Var2, uc0Var2);
                    int i = tvVar.b;
                    int i2 = vc0Var.l;
                    if (i < i2) {
                        tc0 tc0Var2 = vc0Var.k[i];
                        tvVar.c += tc0Var2.a;
                        tvVar.d += tc0Var2.b;
                        int i3 = i + 1;
                        tvVar.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        p6Var = p6Var2;
                        vq0Var = vq0Var2;
                        da0Var = da0Var2;
                        uc0Var = uc0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        an();
    }

    public final boolean ap() {
        return this.l == 0;
    }

    public final boolean aq() {
        return this.l != 0;
    }

    public final void ar(tc0 tc0Var) {
        int i = this.l;
        tc0[] tc0VarArr = this.k;
        if (i == tc0VarArr.length) {
            tc0[] tc0VarArr2 = new tc0[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(tc0VarArr, 0, tc0VarArr2, 0, i);
            this.k = tc0VarArr2;
        }
        int i2 = this.n;
        int i3 = tc0Var.a;
        int i4 = tc0Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.m;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            h7.as(iArr, iArr2, 0, 0, length);
            this.m = iArr2;
        }
        int i7 = this.p + i4;
        Object[] objArr = this.o;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.o = objArr2;
        }
        tc0[] tc0VarArr3 = this.k;
        int i9 = this.l;
        this.l = i9 + 1;
        tc0VarArr3[i9] = tc0Var;
        this.n += tc0Var.a;
        this.p += i4;
    }
}

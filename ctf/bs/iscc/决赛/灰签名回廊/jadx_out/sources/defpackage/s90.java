package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s90 extends v80 {
    public final v80 o;
    public boolean p;

    public s90(long j, cr0 cr0Var, cv cvVar, cv cvVar2, v80 v80Var) {
        super(j, cr0Var, cvVar, cvVar2);
        this.o = v80Var;
        v80Var.k();
    }

    @Override // defpackage.v80, defpackage.xq0
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.v80
    public final wo0 w() throws Throwable {
        s90 s90Var;
        v80 v80Var = this.o;
        if (v80Var.m || v80Var.c) {
            return new yq0();
        }
        r80 r80Var = this.h;
        long j = this.b;
        HashMap mapC = r80Var != null ? fr0.c(v80Var.g(), this, this.o.d()) : null;
        Object obj = fr0.c;
        synchronized (obj) {
            try {
                fr0.d(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (r80Var == null || r80Var.d == 0) {
                    s90Var = this;
                    a();
                } else {
                    s90Var = this;
                    wo0 wo0VarZ = s90Var.z(this.o.g(), r80Var, mapC, this.o.d());
                    if (!wo0VarZ.equals(zq0.a)) {
                        return wo0VarZ;
                    }
                    r80 r80VarX = s90Var.o.x();
                    if (r80VarX != null) {
                        r80VarX.i(r80Var);
                    } else {
                        s90Var.o.ab(r80Var);
                        s90Var.h = null;
                    }
                }
                if (f00.n(s90Var.o.g(), j) < 0) {
                    s90Var.o.v();
                }
                v80 v80Var2 = s90Var.o;
                v80Var2.r(v80Var2.d().b(j).a(s90Var.j));
                s90Var.o.aa(j);
                v80 v80Var3 = s90Var.o;
                int i = s90Var.d;
                s90Var.d = -1;
                if (i >= 0) {
                    int[] iArr = v80Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    v80Var3.k = iArrCopyOf;
                } else {
                    v80Var3.getClass();
                }
                v80 v80Var4 = s90Var.o;
                cr0 cr0Var = s90Var.j;
                v80Var4.getClass();
                synchronized (obj) {
                    v80Var4.j = v80Var4.j.d(cr0Var);
                    v80 v80Var5 = s90Var.o;
                    int[] iArr2 = s90Var.k;
                    v80Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = v80Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        v80Var5.k = iArr2;
                    }
                }
                s90Var.m = true;
                if (!s90Var.p) {
                    s90Var.p = true;
                    s90Var.o.l();
                }
                return zq0.a;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}

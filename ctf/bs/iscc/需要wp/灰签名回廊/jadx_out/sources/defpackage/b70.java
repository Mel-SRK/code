package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class b70 {
    public final SparseArray a;
    public kz0 b;

    public b70(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(kz0 kz0Var, int i, int i2) {
        int iA = kz0Var.a(i);
        SparseArray sparseArray = this.a;
        b70 b70Var = sparseArray == null ? null : (b70) sparseArray.get(iA);
        if (b70Var == null) {
            b70Var = new b70(1);
            sparseArray.put(kz0Var.a(i), b70Var);
        }
        if (i2 > i) {
            b70Var.a(kz0Var, i + 1, i2);
        } else {
            b70Var.b = kz0Var;
        }
    }
}

package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class df0 extends i {
    public final ve0 d;

    public df0(ve0 ve0Var) {
        this.d = ve0Var;
    }

    @Override // defpackage.i
    public final int a() {
        ve0 ve0Var = this.d;
        ve0Var.getClass();
        return ve0Var.e;
    }

    @Override // defpackage.i, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        uy0 uy0Var = this.d.d;
        vy0[] vy0VarArr = new vy0[8];
        for (int i = 0; i < 8; i++) {
            vy0VarArr[i] = new wy0(2);
        }
        return new cf0(uy0Var, vy0VarArr);
    }
}

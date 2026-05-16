package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ze0 implements Iterator, d10 {
    public final xe0 d;

    public ze0(ue0 ue0Var) {
        vy0[] vy0VarArr = new vy0[8];
        for (int i = 0; i < 8; i++) {
            vy0VarArr[i] = new xy0(this);
        }
        this.d = new xe0(ue0Var, vy0VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (Map.Entry) this.d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
    }
}

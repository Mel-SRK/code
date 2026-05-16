package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class tq0 implements Iterable, d10 {
    public final sq0 d;
    public final int e;
    public final int f;

    public tq0(sq0 sq0Var, int i, int i2) {
        this.d = sq0Var;
        this.e = i;
        this.f = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        sq0 sq0Var = this.d;
        if (sq0Var.k != this.f) {
            uq0.e();
        }
        int i = this.e;
        sq0Var.f(i);
        return new tw(sq0Var, i + 1, sq0Var.d[(i * 5) + 3] + i);
    }
}

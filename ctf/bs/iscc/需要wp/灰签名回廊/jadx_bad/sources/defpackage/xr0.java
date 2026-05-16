package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xr0 implements Iterable, d10 {
    public final sq0 d;
    public final int e;
    public final lI f;

    public xr0(sq0 sq0Var, int i, uw uwVar, lI lIVar) {
        this.d = sq0Var;
        this.e = i;
        this.f = lIVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new tw(this.d, this.e, null, this.f);
    }
}

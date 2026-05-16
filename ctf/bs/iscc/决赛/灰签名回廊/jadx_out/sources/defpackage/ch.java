package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ch implements np0 {
    public final AtomicReference a;

    public ch(np0 np0Var) {
        this.a = new AtomicReference(np0Var);
    }

    @Override // defpackage.np0
    public final Iterator iterator() {
        np0 np0Var = (np0) this.a.getAndSet(null);
        if (np0Var != null) {
            return np0Var.iterator();
        }
        wc.q("This sequence can be consumed only once.");
        return null;
    }
}

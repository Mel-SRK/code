package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class qs0 extends ag {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.ag
    public final boolean a(af afVar) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(i60.o);
        return true;
    }

    @Override // defpackage.ag
    public final ji[] b(af afVar) {
        this.a.set(null);
        return pk.a;
    }
}

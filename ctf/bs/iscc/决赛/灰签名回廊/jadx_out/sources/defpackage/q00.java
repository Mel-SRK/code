package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class q00 extends w00 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(q00.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final ft h;

    public q00(ft ftVar) {
        this.h = ftVar;
    }

    @Override // defpackage.w00
    public final boolean k() {
        return true;
    }

    @Override // defpackage.w00
    public final void l(Throwable th) {
        if (i.compareAndSet(this, 0, 1)) {
            this.h.g(th);
        }
    }
}

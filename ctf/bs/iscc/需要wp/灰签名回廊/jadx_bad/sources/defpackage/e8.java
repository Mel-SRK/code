package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class e8 extends l {
    public final Thread g;
    public final cr h;

    public e8(pj pjVar, Thread thread, cr crVar) {
        super(pjVar, true);
        this.g = thread;
        this.h = crVar;
    }

    @Override // defpackage.a10
    public final void z(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.g;
        if (f00.h(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}

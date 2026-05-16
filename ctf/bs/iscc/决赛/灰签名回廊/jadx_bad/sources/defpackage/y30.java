package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public final class y30 extends a implements pl {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(y30.class, "runningWorkers$volatile");
    public final /* synthetic */ pl f;
    public final a g;
    public final int h;
    public final x40 i;
    public final Object j;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public y30(a aVar, int i) {
        pl plVar = aVar instanceof pl ? (pl) aVar : null;
        this.f = plVar == null ? wk.a : plVar;
        this.g = aVar;
        this.h = i;
        this.i = new x40();
        this.j = new Object();
    }

    @Override // defpackage.pl
    public final void c(long j, la laVar) {
        this.f.c(j, laVar);
    }

    @Override // kotlinx.coroutines.a
    public final void d(pj pjVar, Runnable runnable) {
        boolean z;
        Runnable runnableH;
        this.i.a(runnable);
        if (k.get(this) < this.h) {
            synchronized (this.j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
                if (atomicIntegerFieldUpdater.get(this) >= this.h) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (runnableH = h()) == null) {
                return;
            }
            this.g.d(this, new zw(this, runnableH));
        }
    }

    public final Runnable h() {
        while (true) {
            Runnable runnable = (Runnable) this.i.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.i.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.g);
        sb.append(".limitedParallelism(");
        return n5.h(sb, this.h, ')');
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class aa extends m10 {
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;

    public aa(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.g = atomicReferenceFieldUpdater;
        this.h = atomicReferenceFieldUpdater2;
        this.i = atomicReferenceFieldUpdater3;
        this.j = atomicReferenceFieldUpdater4;
        this.k = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.m10
    public final void ao(ac acVar, ac acVar2) {
        this.h.lazySet(acVar, acVar2);
    }

    @Override // defpackage.m10
    public final void ap(ac acVar, Thread thread) {
        this.g.lazySet(acVar, thread);
    }

    @Override // defpackage.m10
    public final boolean l(ad adVar, z zVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(adVar, zVar, z.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(adVar) == zVar);
        return false;
    }

    @Override // defpackage.m10
    public final boolean m(ad adVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.k;
            if (atomicReferenceFieldUpdater.compareAndSet(adVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(adVar) == obj);
        return false;
    }

    @Override // defpackage.m10
    public final boolean n(ad adVar, ac acVar, ac acVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(adVar, acVar, acVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(adVar) == acVar);
        return false;
    }
}

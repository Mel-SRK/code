package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ll0 implements ji, zj {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(ll0.class, Object.class, "result");
    public final ji d;
    private volatile Object result;

    public ll0(ji jiVar) {
        yj yjVar = yj.d;
        this.d = jiVar;
        this.result = yjVar;
    }

    @Override // defpackage.zj
    public final zj d() {
        ji jiVar = this.d;
        if (jiVar instanceof zj) {
            return (zj) jiVar;
        }
        return null;
    }

    @Override // defpackage.ji
    public final pj e() {
        return this.d.e();
    }

    @Override // defpackage.ji
    public final void h(Object obj) {
        while (true) {
            Object obj2 = this.result;
            yj yjVar = yj.e;
            if (obj2 == yjVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, yjVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != yjVar) {
                        break;
                    }
                }
                return;
            }
            yj yjVar2 = yj.d;
            if (obj2 != yjVar2) {
                wc.q("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e;
            yj yjVar3 = yj.f;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, yjVar2, yjVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != yjVar2) {
                    break;
                }
            }
            this.d.h(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.d;
    }
}

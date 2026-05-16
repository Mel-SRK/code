package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class i90 extends ip0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(i90.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = f00.h;

    public final Object c(ki kiVar) {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ip0.f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                wz0 wz0Var = wz0.a;
                if (i2 <= 0) {
                    la laVarZ = t1.z(f00.x(kiVar));
                    try {
                        a(new h90(this, laVarZ));
                        Object objS = laVarZ.s();
                        yj yjVar = yj.d;
                        if (objS != yjVar) {
                            objS = wz0Var;
                        }
                        return objS == yjVar ? objS : wz0Var;
                    } catch (Throwable th) {
                        laVarZ.ab();
                        throw th;
                    }
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    g.set(this, null);
                    return wz0Var;
                }
            }
        }
    }

    public final void d(Object obj) {
        while (Math.max(ip0.f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            jq jqVar = f00.h;
            if (obj2 != jqVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, jqVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        wc.q("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(pk.ae(this));
        sb.append("[isLocked=");
        sb.append(Math.max(ip0.f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(g.get(this));
        sb.append(']');
        return sb.toString();
    }
}

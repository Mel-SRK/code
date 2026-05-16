package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class ip0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ip0.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(ip0.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(ip0.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(ip0.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(ip0.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final ka a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public ip0() {
        kp0 kp0Var = new kp0(0L, null, 2);
        this.head$volatile = kp0Var;
        this.tail$volatile = kp0Var;
        this._availablePermits$volatile = 1;
        this.a = new ka(3, this);
    }

    public final void a(h90 h90Var) {
        Object objZ;
        kp0 kp0Var;
        la laVar = h90Var.d;
        i90 i90Var = h90Var.e;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                wz0 wz0Var = wz0.a;
                if (andDecrement > 0) {
                    i90.g.set(i90Var, null);
                    laVar.ad(wz0Var, laVar.f, new ka(0, new h(5, i90Var, h90Var)));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                kp0 kp0Var2 = (kp0) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                gp0 gp0Var = gp0.l;
                long j = andIncrement / ((long) jp0.f);
                while (true) {
                    objZ = pk.z(kp0Var2, j, gp0Var);
                    if (!wn0.h(objZ)) {
                        un0 un0VarE = wn0.e(objZ);
                        while (true) {
                            un0 un0Var = (un0) atomicReferenceFieldUpdater.get(this);
                            kp0Var = kp0Var2;
                            if (un0Var.c >= un0VarE.c) {
                                break;
                            }
                            if (!un0VarE.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, un0Var, un0VarE)) {
                                if (atomicReferenceFieldUpdater.get(this) != un0Var) {
                                    if (un0VarE.e()) {
                                        un0VarE.d();
                                    }
                                    kp0Var2 = kp0Var;
                                }
                            }
                            if (un0Var.e()) {
                                un0Var.d();
                            }
                        }
                    } else {
                        break;
                    }
                    kp0Var2 = kp0Var;
                }
                kp0 kp0Var3 = (kp0) wn0.e(objZ);
                AtomicReferenceArray atomicReferenceArray = kp0Var3.e;
                int i = (int) (andIncrement % ((long) jp0.f));
                while (!atomicReferenceArray.compareAndSet(i, null, h90Var)) {
                    if (atomicReferenceArray.get(i) != null) {
                        jq jqVar = jp0.b;
                        jq jqVar2 = jp0.c;
                        while (!atomicReferenceArray.compareAndSet(i, jqVar, jqVar2)) {
                            if (atomicReferenceArray.get(i) != jqVar) {
                                break;
                            }
                        }
                        i90.g.set(i90Var, null);
                        laVar.ad(wz0Var, laVar.f, new ka(0, new h(5, i90Var, h90Var)));
                        return;
                    }
                }
                h90Var.a(kp0Var3, i);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        int i;
        Object objZ;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z = true;
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            kp0 kp0Var = (kp0) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = c.getAndIncrement(this);
            long j = andIncrement2 / ((long) jp0.f);
            hp0 hp0Var = hp0.l;
            while (true) {
                objZ = pk.z(kp0Var, j, hp0Var);
                if (!wn0.h(objZ)) {
                    un0 un0VarE = wn0.e(objZ);
                    while (true) {
                        un0 un0Var = (un0) atomicReferenceFieldUpdater.get(this);
                        if (un0Var.c >= un0VarE.c) {
                            break;
                        }
                        if (!un0VarE.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, un0Var, un0VarE)) {
                            if (atomicReferenceFieldUpdater.get(this) != un0Var) {
                                if (un0VarE.e()) {
                                    un0VarE.d();
                                }
                            }
                        }
                        if (un0Var.e()) {
                            un0Var.d();
                        }
                    }
                } else {
                    break;
                }
            }
            kp0 kp0Var2 = (kp0) wn0.e(objZ);
            AtomicReferenceArray atomicReferenceArray = kp0Var2.e;
            kp0Var2.a();
            boolean z2 = false;
            if (kp0Var2.c <= j) {
                int i2 = (int) (andIncrement2 % ((long) jp0.f));
                Object andSet = atomicReferenceArray.getAndSet(i2, jp0.b);
                if (andSet == null) {
                    int i3 = jp0.a;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            jq jqVar = jp0.b;
                            jq jqVar2 = jp0.d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i2, jqVar, jqVar2)) {
                                    z2 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i2) != jqVar) {
                                    break;
                                }
                            }
                            z = true ^ z2;
                        } else if (atomicReferenceArray.get(i2) == jp0.c) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else if (andSet != jp0.e) {
                    if (!(andSet instanceof ja)) {
                        wc.f(andSet, "unexpected: ");
                        return;
                    }
                    ja jaVar = (ja) andSet;
                    jq jqVarL = jaVar.l(wz0.a, this.a);
                    if (jqVarL != null) {
                        jaVar.y(jqVarL);
                    } else {
                        z = false;
                    }
                }
            }
        } while (!z);
    }
}

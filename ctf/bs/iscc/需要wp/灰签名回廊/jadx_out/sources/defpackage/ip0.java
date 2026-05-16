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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ip0.b():void");
    }
}

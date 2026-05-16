package kotlinx.coroutines;

import defpackage.cr;
import defpackage.dr;
import defpackage.er;
import defpackage.f00;
import defpackage.fr;
import defpackage.ga;
import defpackage.jq;
import defpackage.la;
import defpackage.pj;
import defpackage.pl;
import defpackage.ux0;
import defpackage.wc;
import defpackage.wx0;
import defpackage.z40;
import defpackage.z6;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends cr implements pl {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public abstract Thread aa();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ab() {
        z6 z6Var = this.h;
        if (z6Var != null ? z6Var.isEmpty() : true) {
            fr frVar = (fr) k.get(this);
            if (frVar == null) {
                Object obj = j.get(this);
                if (obj != null) {
                    if (obj instanceof z40) {
                        long j2 = z40.f.get((z40) obj);
                        return ((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30));
                    }
                    if (obj == f00.g) {
                    }
                }
                return true;
            }
            if (wx0.b.get(frVar) == 0) {
            }
        }
        return false;
    }

    public void ac(long j2, er erVar) {
        b.m.ad(j2, erVar);
    }

    public final void ad(long j2, er erVar) {
        int iB;
        Thread threadAa;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        if (l.get(this) != 0) {
            iB = 1;
        } else {
            fr frVar = (fr) atomicReferenceFieldUpdater.get(this);
            if (frVar == null) {
                fr frVar2 = new fr();
                frVar2.c = j2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, frVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                frVar = (fr) obj;
            }
            iB = erVar.b(j2, frVar, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                ac(j2, erVar);
                return;
            } else {
                if (iB == 2) {
                    return;
                }
                wc.q("unexpected result");
                return;
            }
        }
        fr frVar3 = (fr) atomicReferenceFieldUpdater.get(this);
        if (frVar3 != null) {
            synchronized (frVar3) {
                er[] erVarArr = frVar3.a;
                erVar = erVarArr != null ? erVarArr[0] : null;
            }
        }
        if (erVar != erVar || Thread.currentThread() == (threadAa = aa())) {
            return;
        }
        LockSupport.unpark(threadAa);
    }

    @Override // defpackage.pl
    public final void c(long j2, la laVar) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            dr drVar = new dr(this, j3 + jNanoTime, laVar);
            ad(jNanoTime, drVar);
            laVar.w(new ga(1, drVar));
        }
    }

    @Override // kotlinx.coroutines.a
    public final void d(pj pjVar, Runnable runnable) {
        u(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // defpackage.cr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o() {
        Runnable runnable;
        er erVar;
        jq jqVar = f00.g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        if (!s()) {
            y();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof z40)) {
                    if (obj != jqVar) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                z40 z40Var = (z40) obj;
                Object objD = z40Var.d();
                if (objD != z40.g) {
                    runnable = (Runnable) objD;
                    break;
                }
                z40 z40VarC = z40Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z40VarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            z6 z6Var = this.h;
            if (((z6Var == null || z6Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof z40) {
                        long j2 = z40.f.get((z40) obj2);
                        if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == jqVar) {
                        return Long.MAX_VALUE;
                    }
                }
                fr frVar = (fr) k.get(this);
                if (frVar != null) {
                    synchronized (frVar) {
                        er[] erVarArr = frVar.a;
                        erVar = erVarArr != null ? erVarArr[0] : null;
                    }
                    if (erVar != null) {
                        long jNanoTime = erVar.d - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // defpackage.cr
    public void shutdown() {
        er erVarB;
        ux0.a.set(null);
        l.set(this, 1);
        jq jqVar = f00.g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof z40)) {
                    if (obj != jqVar) {
                        z40 z40Var = new z40(8, true);
                        z40Var.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z40Var)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((z40) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, jqVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (o() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            fr frVar = (fr) k.get(this);
            if (frVar == null) {
                return;
            }
            synchronized (frVar) {
                erVarB = wx0.b.get(frVar) > 0 ? frVar.b(0) : null;
            }
            if (erVarB == null) {
                return;
            } else {
                ac(jNanoTime, erVarB);
            }
        }
    }

    public void u(Runnable runnable) {
        y();
        if (!z(runnable)) {
            b.m.u(runnable);
            return;
        }
        Thread threadAa = aa();
        if (Thread.currentThread() != threadAa) {
            LockSupport.unpark(threadAa);
        }
    }

    public final void y() {
        er erVarB;
        fr frVar = (fr) k.get(this);
        if (frVar == null || wx0.b.get(frVar) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (frVar) {
                try {
                    er[] erVarArr = frVar.a;
                    er erVar = erVarArr != null ? erVarArr[0] : null;
                    if (erVar != null) {
                        erVarB = ((jNanoTime - erVar.d) > 0L ? 1 : ((jNanoTime - erVar.d) == 0L ? 0 : -1)) >= 0 ? z(erVar) : false ? frVar.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (erVarB != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (l.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof z40)) {
                        if (obj != f00.g) {
                            z40 z40Var = new z40(8, true);
                            z40Var.a((Runnable) obj);
                            z40Var.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z40Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    z40 z40Var2 = (z40) obj;
                    int iA = z40Var2.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        z40 z40VarC = z40Var2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z40VarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA == 2) {
                        break;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}

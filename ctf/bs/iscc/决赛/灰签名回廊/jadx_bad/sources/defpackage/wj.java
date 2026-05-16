package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class wj implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(wj.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(wj.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(wj.class, "_isTerminated$volatile");
    public static final jq n = new jq("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int d;
    public final int e;
    public final long f;
    public final String g;
    public final yv h;
    public final yv i;
    public final mj0 j;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public wj(int i, int i2, long j, String str) {
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = str;
        if (i < 1) {
            wc.i("Core pool size ", i, " should be at least 1");
            throw null;
        }
        if (i2 < i) {
            throw new IllegalArgumentException(n5.g("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        if (i2 > 2097150) {
            wc.i("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.h = new yv();
        this.i = new yv();
        this.j = new mj0((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void c(wj wjVar, Runnable runnable, int i) {
        wjVar.b(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.j) {
            try {
                if (m.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = l;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.d) {
                    return 0;
                }
                if (i >= this.e) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.j.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                uj ujVar = new uj(this, i3);
                this.j.c(i3, ujVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                ujVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z, boolean z2) {
        uu0 vu0Var;
        vj vjVar;
        wu0.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof uu0) {
            vu0Var = (uu0) runnable;
            vu0Var.d = jNanoTime;
            vu0Var.e = z;
        } else {
            vu0Var = new vu0(runnable, jNanoTime, z);
        }
        boolean z3 = vu0Var.e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        uj ujVar = threadCurrentThread instanceof uj ? (uj) threadCurrentThread : null;
        if (ujVar == null || !ujVar.k.equals(this)) {
            ujVar = null;
        }
        if (ujVar != null && (vjVar = ujVar.f) != vj.h && (vu0Var.e || vjVar != vj.e)) {
            ujVar.j = true;
            v31 v31Var = ujVar.d;
            if (z2) {
                vu0Var = v31Var.a(vu0Var);
            } else {
                v31Var.getClass();
                uu0 uu0Var = (uu0) v31.b.getAndSet(v31Var, vu0Var);
                vu0Var = uu0Var == null ? null : v31Var.a(uu0Var);
            }
        }
        if (vu0Var != null) {
            if (!(vu0Var.e ? this.i.a(vu0Var) : this.h.a(vu0Var))) {
                throw new RejectedExecutionException(this.g + " was terminated");
            }
        }
        boolean z4 = z2 && ujVar != null;
        if (z3) {
            if (z4 || f() || e(jAddAndGet)) {
                return;
            }
            f();
            return;
        }
        if (z4 || f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i;
        uu0 uu0VarA;
        if (m.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            uj ujVar = threadCurrentThread instanceof uj ? (uj) threadCurrentThread : null;
            if (ujVar == null || !ujVar.k.equals(this)) {
                ujVar = null;
            }
            synchronized (this.j) {
                i = (int) (l.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.j.b(i2);
                    objB.getClass();
                    uj ujVar2 = (uj) objB;
                    if (ujVar2 != ujVar) {
                        while (ujVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(ujVar2);
                            ujVar2.join(10000L);
                        }
                        v31 v31Var = ujVar2.d;
                        yv yvVar = this.i;
                        v31Var.getClass();
                        uu0 uu0Var = (uu0) v31.b.getAndSet(v31Var, null);
                        if (uu0Var != null) {
                            yvVar.a(uu0Var);
                        }
                        while (true) {
                            uu0 uu0VarB = v31Var.b();
                            if (uu0VarB == null) {
                                break;
                            } else {
                                yvVar.a(uu0VarB);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.i.b();
            this.h.b();
            while (true) {
                if (ujVar == null) {
                    uu0VarA = (uu0) this.h.d();
                    if (uu0VarA == null && (uu0VarA = (uu0) this.i.d()) == null) {
                        break;
                    }
                } else {
                    uu0VarA = ujVar.a(true);
                    if (uu0VarA == null) {
                    }
                }
                try {
                    uu0VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (ujVar != null) {
                ujVar.h(vj.h);
            }
            k.set(this, 0L);
            l.set(this, 0L);
        }
    }

    public final void d(uj ujVar, int i, int i2) {
        while (true) {
            long j = k.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = ujVar.c();
                    while (true) {
                        if (objC == n) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        uj ujVar2 = (uj) objC;
                        int iB = ujVar2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = ujVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (k.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.d;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f() {
        jq jqVar;
        int iB;
        while (true) {
            long j = k.get(this);
            uj ujVar = (uj) this.j.b((int) (2097151 & j));
            if (ujVar == null) {
                ujVar = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = ujVar.c();
                while (true) {
                    jqVar = n;
                    if (objC == jqVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    uj ujVar2 = (uj) objC;
                    iB = ujVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = ujVar2.c();
                }
                if (iB >= 0) {
                    if (k.compareAndSet(this, j, ((long) iB) | j2)) {
                        ujVar.g(jqVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (ujVar == null) {
                return false;
            }
            if (uj.l.compareAndSet(ujVar, -1, 0)) {
                LockSupport.unpark(ujVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        mj0 mj0Var = this.j;
        int iA = mj0Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            uj ujVar = (uj) mj0Var.b(i6);
            if (ujVar != null) {
                v31 v31Var = ujVar.d;
                v31Var.getClass();
                int i7 = v31.b.get(v31Var) != null ? (v31.c.get(v31Var) - v31.d.get(v31Var)) + 1 : v31.c.get(v31Var) - v31.d.get(v31Var);
                int iOrdinal = ujVar.f.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        wc.l();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.g);
        sb4.append('@');
        sb4.append(pk.ae(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.d;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.h.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.i.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class uj extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(uj.class, "workerCtl$volatile");
    public final v31 d;
    public final xi0 e;
    public vj f;
    public long g;
    public long h;
    public int i;
    private volatile int indexInArray;
    public boolean j;
    public final /* synthetic */ wj k;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public uj(wj wjVar, int i) {
        this.k = wjVar;
        setDaemon(true);
        setContextClassLoader(wj.class.getClassLoader());
        this.d = new v31();
        this.e = new xi0();
        this.f = vj.g;
        this.nextParkedWorker = wj.n;
        int iNanoTime = (int) System.nanoTime();
        this.i = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = defpackage.v31.d.get(r9);
        r0 = defpackage.v31.c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (defpackage.v31.e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r9.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uu0 a(boolean z) {
        uu0 uu0VarE;
        uu0 uu0VarE2;
        long j;
        vj vjVar = this.f;
        wj wjVar = this.k;
        uu0 uu0Var = null;
        v31 v31Var = this.d;
        vj vjVar2 = vj.d;
        if (vjVar != vjVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = wj.l;
            do {
                j = atomicLongFieldUpdater.get(wjVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    v31Var.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v31.b;
                        uu0 uu0Var2 = (uu0) atomicReferenceFieldUpdater.get(v31Var);
                        if (uu0Var2 == null || !uu0Var2.e) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(v31Var, uu0Var2, null)) {
                            if (atomicReferenceFieldUpdater.get(v31Var) != uu0Var2) {
                                break;
                            }
                        }
                        uu0Var = uu0Var2;
                        break loop1;
                    }
                    if (uu0Var != null) {
                        return uu0Var;
                    }
                    uu0 uu0Var3 = (uu0) wjVar.i.d();
                    return uu0Var3 == null ? i(1) : uu0Var3;
                }
            } while (!wj.l.compareAndSet(wjVar, j, j - 4398046511104L));
            this.f = vjVar2;
        }
        if (z) {
            boolean z2 = d(wjVar.d * 2) == 0;
            if (z2 && (uu0VarE2 = e()) != null) {
                return uu0VarE2;
            }
            v31Var.getClass();
            uu0 uu0VarB = (uu0) v31.b.getAndSet(v31Var, null);
            if (uu0VarB == null) {
                uu0VarB = v31Var.b();
            }
            if (uu0VarB != null) {
                return uu0VarB;
            }
            if (!z2 && (uu0VarE = e()) != null) {
                return uu0VarE;
            }
        } else {
            uu0 uu0VarE3 = e();
            if (uu0VarE3 != null) {
                return uu0VarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final uu0 e() {
        int iD = d(2);
        wj wjVar = this.k;
        yv yvVar = wjVar.i;
        yv yvVar2 = wjVar.h;
        if (iD == 0) {
            uu0 uu0Var = (uu0) yvVar2.d();
            return uu0Var != null ? uu0Var : (uu0) yvVar.d();
        }
        uu0 uu0Var2 = (uu0) yvVar.d();
        return uu0Var2 != null ? uu0Var2 : (uu0) yvVar2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k.g);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(vj vjVar) {
        vj vjVar2 = this.f;
        boolean z = vjVar2 == vj.d;
        if (z) {
            wj.l.addAndGet(this.k, 4398046511104L);
        }
        if (vjVar2 != vjVar) {
            this.f = vjVar;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uu0 i(int i) {
        long j;
        uu0 uu0VarC;
        long j2;
        long j3;
        uu0 uu0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = wj.l;
        wj wjVar = this.k;
        int i2 = (int) (atomicLongFieldUpdater.get(wjVar) & 2097151);
        uu0 uu0Var2 = null;
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            uj ujVar = (uj) wjVar.j.b(iD);
            if (ujVar != null && ujVar != this) {
                v31 v31Var = ujVar.d;
                if (i != 3) {
                    v31Var.getClass();
                    int i4 = v31.d.get(v31Var);
                    int i5 = v31.c.get(v31Var);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z || v31.e.get(v31Var) != 0) {
                            int i6 = i4 + 1;
                            uu0VarC = v31Var.c(i4, z);
                            if (uu0VarC != null) {
                                break;
                            }
                            i4 = i6;
                        } else {
                            break;
                        }
                    }
                } else {
                    uu0VarC = v31Var.b();
                    j = 0;
                }
                xi0 xi0Var = this.e;
                if (uu0VarC != null) {
                    xi0Var.d = uu0VarC;
                    uu0Var = uu0Var2;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v31.b;
                        uu0 uu0Var3 = (uu0) atomicReferenceFieldUpdater.get(v31Var);
                        if (uu0Var3 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((uu0Var3.e ? 1 : 2) & i) == 0) {
                            break;
                        }
                        wu0.f.getClass();
                        v31 v31Var2 = v31Var;
                        long jNanoTime = System.nanoTime() - uu0Var3.d;
                        long j4 = wu0.b;
                        if (jNanoTime < j4) {
                            j3 = j4 - jNanoTime;
                            uu0Var = null;
                            break;
                        }
                        do {
                            uu0Var = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(v31Var2, uu0Var3, null)) {
                                xi0Var.d = uu0Var3;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(v31Var2) == uu0Var3);
                        v31Var = v31Var2;
                        uu0Var2 = null;
                    }
                }
                if (j3 == j2) {
                    uu0 uu0Var4 = (uu0) xi0Var.d;
                    xi0Var.d = uu0Var;
                    return uu0Var4;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i3++;
            uu0Var2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.h = jMin;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (wj.m.get(this.k) == 0) {
                vj vjVar = this.f;
                vj vjVar2 = vj.h;
                if (vjVar == vjVar2) {
                    break loop0;
                }
                uu0 uu0VarA = a(this.j);
                if (uu0VarA != null) {
                    this.h = 0L;
                    wj wjVar = this.k;
                    this.g = 0L;
                    if (this.f == vj.f) {
                        this.f = vj.e;
                    }
                    if (uu0VarA.e) {
                        if (h(vj.e) && !wjVar.f() && !wjVar.e(wj.l.get(wjVar))) {
                            wjVar.f();
                        }
                        try {
                            uu0VarA.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        wj.l.addAndGet(wjVar, -2097152L);
                        if (this.f != vjVar2) {
                            this.f = vj.g;
                        }
                    } else {
                        try {
                            uu0VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                    }
                } else {
                    this.j = false;
                    if (this.h == 0) {
                        Object obj = this.nextParkedWorker;
                        jq jqVar = wj.n;
                        if (obj != jqVar) {
                            l.set(this, -1);
                            while (this.nextParkedWorker != wj.n) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    wj wjVar2 = this.k;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = wj.m;
                                    if (atomicIntegerFieldUpdater2.get(wjVar2) != 0) {
                                        break;
                                    }
                                    vj vjVar3 = this.f;
                                    vj vjVar4 = vj.h;
                                    if (vjVar3 == vjVar4) {
                                        break;
                                    }
                                    h(vj.f);
                                    Thread.interrupted();
                                    if (this.g == 0) {
                                        j = 2097151;
                                        this.g = System.nanoTime() + this.k.f;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.k.f);
                                    if (System.nanoTime() - this.g >= 0) {
                                        this.g = 0L;
                                        wj wjVar3 = this.k;
                                        synchronized (wjVar3.j) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(wjVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = wj.l;
                                                    if (((int) (atomicLongFieldUpdater.get(wjVar3) & j)) > wjVar3.d) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            f(0);
                                                            wjVar3.d(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(wjVar3) & j);
                                                            if (andDecrement != i) {
                                                                Object objB = wjVar3.j.b(andDecrement);
                                                                objB.getClass();
                                                                uj ujVar = (uj) objB;
                                                                wjVar3.j.c(i, ujVar);
                                                                ujVar.f(i);
                                                                wjVar3.d(ujVar, andDecrement, i);
                                                            }
                                                            wjVar3.j.c(andDecrement, null);
                                                            this.f = vjVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            wj wjVar4 = this.k;
                            if (this.nextParkedWorker == jqVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = wj.k;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(wjVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = wjVar4.j.b((int) (j2 & 2097151));
                                    wj wjVar5 = wjVar4;
                                    if (wj.k.compareAndSet(wjVar5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        wjVar4 = wjVar5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(vj.f);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.h);
                        this.h = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(vj.h);
    }
}

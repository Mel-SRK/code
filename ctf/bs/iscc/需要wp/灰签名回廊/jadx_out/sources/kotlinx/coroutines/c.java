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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ab() {
        /*
            r7 = this;
            z6 r0 = r7.h
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.c.k
            java.lang.Object r0 = r0.get(r7)
            fr r0 = (defpackage.fr) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.wx0.b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.c.j
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof defpackage.z40
            if (r3 == 0) goto L4f
            z40 r0 = (defpackage.z40) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.z40.f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            jq r3 = defpackage.f00.g
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.c.ab():boolean");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o() {
        /*
            r10 = this;
            jq r0 = defpackage.f00.g
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.c.j
            boolean r2 = r10.s()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.y()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof defpackage.z40
            if (r6 == 0) goto L3e
            r6 = r2
            z40 r6 = (defpackage.z40) r6
            java.lang.Object r7 = r6.d()
            jq r8 = defpackage.z40.g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            z40 r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            z6 r2 = r10.h
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof defpackage.z40
            if (r2 == 0) goto L8d
            z40 r1 = (defpackage.z40) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.z40.f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.c.k
            java.lang.Object r0 = r0.get(r10)
            fr r0 = (defpackage.fr) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            er[] r1 = r0.a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.d
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.c.o():long");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.c.j
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.c.l
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof defpackage.z40
            if (r4 == 0) goto L47
            r4 = r1
            z40 r4 = (defpackage.z40) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            z40 r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            jq r4 = defpackage.f00.g
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            z40 r3 = new z40
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.c.z(java.lang.Runnable):boolean");
    }
}

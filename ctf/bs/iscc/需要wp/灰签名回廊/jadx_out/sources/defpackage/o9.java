package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class o9 implements ya {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(o9.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(o9.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(o9.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(o9.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(o9.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(o9.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(o9.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(o9.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(o9.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public o9(int i2) {
        this.d = i2;
        if (i2 < 0) {
            wc.i("Invalid channel capacity: ", i2, ", should be >=0");
            throw null;
        }
        kb kbVar = q9.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = g.get(this);
        kb kbVar2 = new kb(0L, null, this, 3);
        this.sendSegment$volatile = kbVar2;
        this.receiveSegment$volatile = kbVar2;
        if (w()) {
            kbVar2 = q9.a;
            kbVar2.getClass();
        }
        this.bufferEndSegment$volatile = kbVar2;
        this._closeCause$volatile = q9.s;
    }

    public static boolean ab(Object obj) {
        if (!(obj instanceof ja)) {
            wc.f(obj, "Unexpected waiter: ");
            return false;
        }
        ja jaVar = (ja) obj;
        kb kbVar = q9.a;
        jq jqVarL = jaVar.l(wz0.a, null);
        if (jqVarL == null) {
            return false;
        }
        jaVar.y(jqVarL);
        return true;
    }

    public static final kb b(o9 o9Var, long j2, kb kbVar) {
        Object objZ;
        o9 o9Var2;
        kb kbVar2 = q9.a;
        p9 p9Var = p9.l;
        loop0: while (true) {
            objZ = pk.z(kbVar, j2, p9Var);
            if (!wn0.h(objZ)) {
                un0 un0VarE = wn0.e(objZ);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    un0 un0Var = (un0) atomicReferenceFieldUpdater.get(o9Var);
                    if (un0Var.c >= un0VarE.c) {
                        break loop0;
                    }
                    if (!un0VarE.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(o9Var, un0Var, un0VarE)) {
                        if (atomicReferenceFieldUpdater.get(o9Var) != un0Var) {
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
        boolean zH = wn0.h(objZ);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        if (zH) {
            o9Var.i();
            if (kbVar.c * ((long) q9.b) < atomicLongFieldUpdater.get(o9Var)) {
                kbVar.a();
                return null;
            }
        } else {
            kb kbVar3 = (kb) wn0.e(objZ);
            long j3 = kbVar3.c;
            if (j3 <= j2) {
                return kbVar3;
            }
            long j4 = ((long) q9.b) * j3;
            while (true) {
                long j5 = e.get(o9Var);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    o9Var2 = o9Var;
                    break;
                }
                o9Var2 = o9Var;
                if (e.compareAndSet(o9Var2, j5, (((long) ((int) (j5 >> 60))) << 60) + j6)) {
                    break;
                }
                o9Var = o9Var2;
            }
            if (j3 * ((long) q9.b) < atomicLongFieldUpdater.get(o9Var2)) {
                kbVar3.a();
            }
        }
        return null;
    }

    public static final void d(o9 o9Var, Object obj, la laVar) {
        laVar.h(new sj0(o9Var.p()));
    }

    public static final int e(o9 o9Var, kb kbVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        kbVar.m(i2, obj);
        if (z) {
            return o9Var.ad(kbVar, i2, obj, j2, obj2, z);
        }
        Object objK = kbVar.k(i2);
        if (objK == null) {
            if (o9Var.f(j2)) {
                if (kbVar.j(i2, null, q9.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kbVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof w11) {
            kbVar.m(i2, null);
            if (o9Var.aa(objK, obj)) {
                kbVar.n(i2, q9.i);
                return 0;
            }
            jq jqVar = q9.k;
            if (kbVar.f.getAndSet((i2 * 2) + 1, jqVar) == jqVar) {
                return 5;
            }
            kbVar.l(i2, true);
            return 5;
        }
        return o9Var.ad(kbVar, i2, obj, j2, obj2, z);
    }

    public static void r(o9 o9Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        if ((atomicLongFieldUpdater.addAndGet(o9Var, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(o9Var) & 4611686018427387904L) != 0) {
            }
        }
    }

    @Override // defpackage.ya
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    public final boolean aa(Object obj, Object obj2) {
        if (!(obj instanceof n9)) {
            if (!(obj instanceof ja)) {
                wc.f(obj, "Unexpected receiver type: ");
                return false;
            }
            ja jaVar = (ja) obj;
            kb kbVar = q9.a;
            jq jqVarL = jaVar.l(obj2, null);
            if (jqVarL == null) {
                return false;
            }
            jaVar.y(jqVarL);
            return true;
        }
        n9 n9Var = (n9) obj;
        la laVar = n9Var.e;
        laVar.getClass();
        n9Var.e = null;
        n9Var.d = obj2;
        Boolean bool = Boolean.TRUE;
        n9Var.f.getClass();
        kb kbVar2 = q9.a;
        jq jqVarL2 = laVar.l(bool, null);
        if (jqVarL2 == null) {
            return false;
        }
        laVar.y(jqVarL2);
        return true;
    }

    public final Object ac(kb kbVar, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kbVar.f;
        Object objK = kbVar.k(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (objK == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return q9.n;
                }
                if (kbVar.j(i2, objK, obj)) {
                    k();
                    return q9.m;
                }
            }
        } else if (objK == q9.d && kbVar.j(i2, objK, q9.i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            kbVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object objK2 = kbVar.k(i2);
            if (objK2 == null || objK2 == q9.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kbVar.j(i2, objK2, q9.h)) {
                        k();
                        return q9.o;
                    }
                } else {
                    if (obj == null) {
                        return q9.n;
                    }
                    if (kbVar.j(i2, objK2, obj)) {
                        k();
                        return q9.m;
                    }
                }
            } else if (objK2 != q9.d) {
                jq jqVar = q9.j;
                if (objK2 == jqVar) {
                    return q9.o;
                }
                if (objK2 == q9.h) {
                    return q9.o;
                }
                if (objK2 == q9.l) {
                    k();
                    return q9.o;
                }
                if (objK2 != q9.g && kbVar.j(i2, objK2, q9.f)) {
                    boolean z = objK2 instanceof x11;
                    if (z) {
                        objK2 = ((x11) objK2).a;
                    }
                    if (ab(objK2)) {
                        kbVar.n(i2, q9.i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        kbVar.m(i2, null);
                        return obj3;
                    }
                    kbVar.n(i2, jqVar);
                    kbVar.h();
                    if (z) {
                        k();
                    }
                    return q9.o;
                }
            } else if (kbVar.j(i2, objK2, q9.i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                kbVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int ad(kb kbVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objK = kbVar.k(i2);
            if (objK == null) {
                if (!f(j2) || z) {
                    if (z) {
                        if (kbVar.j(i2, null, q9.j)) {
                            kbVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kbVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kbVar.j(i2, null, q9.d)) {
                    break;
                }
            } else {
                if (objK != q9.e) {
                    jq jqVar = q9.k;
                    if (objK == jqVar) {
                        kbVar.m(i2, null);
                        return 5;
                    }
                    if (objK == q9.h) {
                        kbVar.m(i2, null);
                        return 5;
                    }
                    if (objK == q9.l) {
                        kbVar.m(i2, null);
                        i();
                        return 4;
                    }
                    kbVar.m(i2, null);
                    if (objK instanceof x11) {
                        objK = ((x11) objK).a;
                    }
                    if (aa(objK, obj)) {
                        kbVar.n(i2, q9.i);
                        return 0;
                    }
                    if (kbVar.f.getAndSet((i2 * 2) + 1, jqVar) != jqVar) {
                        kbVar.l(i2, true);
                    }
                    return 5;
                }
                if (kbVar.j(i2, objK, q9.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void ae(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        o9 o9Var = this;
        if (o9Var.w()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = g;
            if (atomicLongFieldUpdater.get(o9Var) > j2) {
                break;
            } else {
                o9Var = this;
            }
        }
        int i2 = q9.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = h;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(o9Var);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(o9Var)) && j3 == atomicLongFieldUpdater.get(o9Var)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(o9Var);
                    if (atomicLongFieldUpdater2.compareAndSet(o9Var, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        o9Var = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(o9Var);
                    long j6 = atomicLongFieldUpdater2.get(o9Var);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(o9Var)) {
                        break;
                    }
                    if (z) {
                        o9Var = this;
                    } else {
                        o9Var = this;
                        atomicLongFieldUpdater2.compareAndSet(o9Var, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(o9Var);
                    if (atomicLongFieldUpdater2.compareAndSet(o9Var, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        o9Var = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163 A[RETURN] */
    @Override // defpackage.lp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.ji r23, java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9.c(ji, java.lang.Object):java.lang.Object");
    }

    public final boolean f(long j2) {
        return j2 < g.get(this) || j2 < f.get(this) + ((long) this.d);
    }

    public final boolean g(Throwable th, boolean z) {
        o9 o9Var;
        boolean z2;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (!z) {
            o9Var = this;
            break;
        }
        do {
            j6 = atomicLongFieldUpdater.get(this);
            if (((int) (j6 >> 60)) != 0) {
                o9Var = this;
                break;
            }
            kb kbVar = q9.a;
            o9Var = this;
        } while (!atomicLongFieldUpdater.compareAndSet(o9Var, j6, (j6 & 1152921504606846975L) + (((long) 1) << 60)));
        jq jqVar = q9.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, jqVar, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != jqVar) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(o9Var, j5, (((long) 3) << 60) + (j5 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = j2 & 1152921504606846975L;
                    j4 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j2 & 1152921504606846975L;
                    j4 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(o9Var, j2, (j4 << 60) + j3));
        }
        i();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m;
                obj = atomicReferenceFieldUpdater2.get(this);
                jq jqVar2 = obj == null ? q9.q : q9.r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, jqVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                az0.p(1, obj);
                ((cv) obj).g(m());
                return z2;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (defpackage.kb) ((defpackage.ug) defpackage.ug.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kb h(long r13) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9.h(long):kb");
    }

    public final void i() {
        t(e.get(this), false);
    }

    @Override // defpackage.ya
    public final n9 iterator() {
        return new n9(this);
    }

    public final void j(long j2) {
        kb kbVar = (kb) j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.d) + j3, g.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = q9.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (kbVar.c != j5) {
                    kb kbVarL = l(j5, kbVar);
                    if (kbVarL != null) {
                        kbVar = kbVarL;
                    }
                }
                kb kbVar2 = kbVar;
                if (ac(kbVar2, i2, j3, null) != q9.o || j3 < q()) {
                    kbVar2.a();
                }
                kbVar = kbVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017b, code lost:
    
        r(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x017e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9.k():void");
    }

    public final kb l(long j2, kb kbVar) {
        Object objZ;
        long j3;
        kb kbVar2 = q9.a;
        p9 p9Var = p9.l;
        loop0: while (true) {
            objZ = pk.z(kbVar, j2, p9Var);
            if (!wn0.h(objZ)) {
                un0 un0VarE = wn0.e(objZ);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                    un0 un0Var = (un0) atomicReferenceFieldUpdater.get(this);
                    if (un0Var.c >= un0VarE.c) {
                        break loop0;
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
        if (wn0.h(objZ)) {
            i();
            if (kbVar.c * ((long) q9.b) < q()) {
                kbVar.a();
                return null;
            }
        } else {
            kb kbVar3 = (kb) wn0.e(objZ);
            long j4 = kbVar3.c;
            if (!w() && j2 <= g.get(this) / ((long) q9.b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k;
                    un0 un0Var2 = (un0) atomicReferenceFieldUpdater2.get(this);
                    if (un0Var2.c >= j4 || !kbVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, un0Var2, kbVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != un0Var2) {
                            if (kbVar3.e()) {
                                kbVar3.d();
                            }
                        }
                    }
                    if (un0Var2.e()) {
                        un0Var2.d();
                    }
                }
            }
            if (j4 <= j2) {
                return kbVar3;
            }
            long j5 = j4 * ((long) q9.b);
            do {
                j3 = f.get(this);
                if (j3 >= j5) {
                    break;
                }
            } while (!f.compareAndSet(this, j3, j5));
            if (j4 * ((long) q9.b) < q()) {
                kbVar3.a();
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) l.get(this);
    }

    public final Throwable n() {
        Throwable thM = m();
        return thM == null ? new ic("Channel was closed") : thM;
    }

    @Override // defpackage.ya
    public final Object o(tt0 tt0Var) throws Throwable {
        kb kbVarL;
        o9 o9Var = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        kb kbVar = (kb) atomicReferenceFieldUpdater.get(o9Var);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            boolean z = true;
            if (o9Var.t(atomicLongFieldUpdater.get(o9Var), true)) {
                Throwable thN = n();
                int i2 = gs0.a;
                throw thN;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(o9Var);
            long j2 = q9.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (kbVar.c != j3) {
                kb kbVarL2 = o9Var.l(j3, kbVar);
                if (kbVarL2 == null) {
                    continue;
                } else {
                    kbVar = kbVarL2;
                }
            }
            Object objAc = o9Var.ac(kbVar, i3, andIncrement, null);
            jq jqVar = q9.m;
            if (objAc == jqVar) {
                wc.q("unexpected");
                return null;
            }
            jq jqVar2 = q9.o;
            if (objAc != jqVar2) {
                if (objAc != q9.n) {
                    kbVar.a();
                    return objAc;
                }
                la laVarZ = t1.z(f00.x(tt0Var));
                o9 o9Var2 = this;
                try {
                    Object objAc2 = o9Var2.ac(kbVar, i3, andIncrement, laVarZ);
                    if (objAc2 == jqVar) {
                        laVarZ.a(kbVar, i3);
                    } else if (objAc2 == jqVar2) {
                        if (andIncrement < o9Var2.q()) {
                            kbVar.a();
                        }
                        kb kbVar2 = (kb) atomicReferenceFieldUpdater.get(o9Var2);
                        while (true) {
                            if (o9Var2.t(atomicLongFieldUpdater.get(o9Var2), z)) {
                                laVarZ.h(new sj0(o9Var2.n()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(o9Var2);
                            long j4 = q9.b;
                            long j5 = andIncrement2 / j4;
                            int i4 = (int) (andIncrement2 % j4);
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            if (kbVar2.c != j5) {
                                kbVarL = o9Var2.l(j5, kbVar2);
                                if (kbVarL == null) {
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    z = true;
                                }
                            } else {
                                kbVarL = kbVar2;
                            }
                            Object objAc3 = o9Var2.ac(kbVarL, i4, andIncrement2, laVarZ);
                            if (objAc3 == q9.m) {
                                laVarZ.a(kbVarL, i4);
                                break;
                            }
                            if (objAc3 == q9.o) {
                                if (andIncrement2 < q()) {
                                    kbVarL.a();
                                }
                                z = true;
                                o9Var2 = this;
                                kbVar2 = kbVarL;
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                            } else {
                                if (objAc3 == q9.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kbVarL.a();
                                laVarZ.ac(objAc3, null);
                            }
                        }
                    } else {
                        kbVar.a();
                        laVarZ.ac(objAc2, null);
                    }
                    return laVarZ.s();
                } catch (Throwable th) {
                    laVarZ.ab();
                    throw th;
                }
            }
            if (andIncrement < q()) {
                kbVar.a();
            }
            o9Var = this;
        }
    }

    public final Throwable p() {
        Throwable thM = m();
        return thM == null ? new jc("Channel was closed") : thM;
    }

    public final long q() {
        return e.get(this) & 1152921504606846975L;
    }

    @Override // defpackage.ya
    public final Object s() {
        kb kbVar;
        jb jbVar = i60.d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        long j2 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
        long j3 = atomicLongFieldUpdater2.get(this);
        if (t(j3, true)) {
            return new ib(m());
        }
        if (j2 >= (j3 & 1152921504606846975L)) {
            return jbVar;
        }
        Object obj = q9.k;
        kb kbVar2 = (kb) j.get(this);
        while (!t(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = q9.b;
            long j5 = andIncrement / j4;
            int i2 = (int) (andIncrement % j4);
            if (kbVar2.c != j5) {
                kb kbVarL = l(j5, kbVar2);
                if (kbVarL == null) {
                    continue;
                } else {
                    kbVar = kbVarL;
                }
            } else {
                kbVar = kbVar2;
            }
            Object objAc = ac(kbVar, i2, andIncrement, obj);
            kb kbVar3 = kbVar;
            if (objAc == q9.m) {
                w11 w11Var = obj instanceof w11 ? (w11) obj : null;
                if (w11Var != null) {
                    w11Var.a(kbVar3, i2);
                }
                ae(andIncrement);
                kbVar3.h();
                return jbVar;
            }
            if (objAc != q9.o) {
                if (objAc != q9.n) {
                    kbVar3.a();
                    return objAc;
                }
                wc.q("unexpected");
                return null;
            }
            if (andIncrement < q()) {
                kbVar3.a();
            }
            kbVar2 = kbVar3;
        }
        return new ib(m());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (defpackage.kb) ((defpackage.ug) defpackage.ug.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(long r14, boolean r16) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9.t(long, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
    
        r16 = r7;
        r3 = (defpackage.kb) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9.toString():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd A[SYNTHETIC] */
    @Override // defpackage.lp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(java.lang.Object r16) {
        /*
            r15 = this;
            jb r8 = defpackage.i60.d
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = defpackage.o9.e
            long r1 = r9.get(r15)
            r10 = 0
            boolean r3 = r15.t(r1, r10)
            r11 = 1
            r12 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L17
            r1 = r10
            goto L1d
        L17:
            long r1 = r1 & r12
            boolean r1 = r15.f(r1)
            r1 = r1 ^ r11
        L1d:
            if (r1 == 0) goto L20
            return r8
        L20:
            jq r6 = defpackage.q9.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.o9.i
            java.lang.Object r1 = r1.get(r15)
            kb r1 = (defpackage.kb) r1
        L2a:
            long r2 = r9.getAndIncrement(r15)
            long r4 = r2 & r12
            boolean r7 = r15.t(r2, r10)
            int r14 = defpackage.q9.b
            long r2 = (long) r14
            long r12 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r10 = r1.c
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L5d
            kb r3 = b(r15, r12, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.p()
            ib r2 = new ib
            r2.<init>(r1)
            return r2
        L54:
            r10 = 0
            r11 = 1
        L56:
            r12 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r10 = e(r0, r1, r2, r3, r4, r6, r7)
            wz0 r3 = defpackage.wz0.a
            if (r10 == 0) goto Lbd
            r11 = 1
            if (r10 == r11) goto Lbc
            r3 = 2
            if (r10 == r3) goto L9b
            r2 = 3
            if (r10 == r2) goto L94
            r2 = 4
            if (r10 == r2) goto L7d
            r2 = 5
            if (r10 == r2) goto L78
            goto L7b
        L78:
            r1.a()
        L7b:
            r10 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.o9.f
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.a()
        L8a:
            java.lang.Throwable r1 = r15.p()
            ib r2 = new ib
            r2.<init>(r1)
            return r2
        L94:
            java.lang.String r1 = "unexpected"
            defpackage.wc.q(r1)
            r1 = 0
            return r1
        L9b:
            if (r7 == 0) goto Laa
            r1.h()
            java.lang.Throwable r1 = r15.p()
            ib r2 = new ib
            r2.<init>(r1)
            return r2
        Laa:
            boolean r3 = r6 instanceof defpackage.w11
            if (r3 == 0) goto Lb1
            w11 r6 = (defpackage.w11) r6
            goto Lb2
        Lb1:
            r6 = 0
        Lb2:
            if (r6 == 0) goto Lb8
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb8:
            r1.h()
            return r8
        Lbc:
            return r3
        Lbd:
            r1.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9.u(java.lang.Object):java.lang.Object");
    }

    public boolean v() {
        return false;
    }

    public final boolean w() {
        long j2 = g.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(long r5, defpackage.kb r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            ug r0 = r7.b()
            kb r0 = (defpackage.kb) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            ug r5 = r7.b()
            kb r5 = (defpackage.kb) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.o9.k
            java.lang.Object r6 = r5.get(r4)
            un0 r6 = (defpackage.un0) r6
            long r0 = r6.c
            long r2 = r7.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9.x(long, kb):void");
    }

    public final Object y(ji jiVar, Object obj) {
        la laVar = new la(1, f00.x(jiVar));
        laVar.t();
        laVar.h(new sj0(p()));
        Object objS = laVar.s();
        return objS == yj.d ? objS : wz0.a;
    }

    public final void z(w11 w11Var, boolean z) {
        if (w11Var instanceof ja) {
            ((ji) w11Var).h(new sj0(z ? n() : p()));
            return;
        }
        if (!(w11Var instanceof n9)) {
            wc.f(w11Var, "Unexpected waiter: ");
            return;
        }
        n9 n9Var = (n9) w11Var;
        la laVar = n9Var.e;
        laVar.getClass();
        n9Var.e = null;
        n9Var.d = q9.l;
        Throwable thM = n9Var.f.m();
        if (thM == null) {
            laVar.h(Boolean.FALSE);
        } else {
            laVar.h(new sj0(thM));
        }
    }
}

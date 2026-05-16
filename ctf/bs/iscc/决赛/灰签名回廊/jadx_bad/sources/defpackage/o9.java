package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
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
    */
    public Object c(ji jiVar, Object obj) throws Throwable {
        int iE;
        Object objS;
        Object obj2;
        o9 o9Var;
        kb kbVar;
        int i2;
        o9 o9Var2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        kb kbVar2 = (kb) atomicReferenceFieldUpdater.get(o9Var2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(o9Var2);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zT = o9Var2.t(andIncrement, false);
            int i3 = q9.b;
            long j3 = i3;
            long j4 = j2 / j3;
            int i4 = (int) (j2 % j3);
            long j5 = kbVar2.c;
            yj yjVar = yj.d;
            wz0 wz0Var = wz0.a;
            if (j5 != j4) {
                kb kbVarB = b(o9Var2, j4, kbVar2);
                if (kbVarB != null) {
                    kbVar2 = kbVarB;
                } else if (zT) {
                    Object objY = y(jiVar, obj);
                    if (objY == yjVar) {
                        return objY;
                    }
                }
            }
            int iE2 = e(o9Var2, kbVar2, i4, obj, j2, null, zT);
            if (iE2 == 0) {
                kbVar2.a();
                return wz0Var;
            }
            if (iE2 == 1) {
                break;
            }
            if (iE2 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
                if (iE2 == 3) {
                    la laVarZ = t1.z(f00.x(jiVar));
                    Object obj3 = obj;
                    try {
                        iE = e(o9Var2, kbVar2, i4, obj3, j2, laVarZ, false);
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (iE != 0) {
                        if (iE == 1) {
                            laVarZ.h(wz0Var);
                        } else if (iE != 2) {
                            if (iE != 4) {
                                String str = "unexpected";
                                if (iE != 5) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kbVar2.a();
                                kb kbVar3 = (kb) atomicReferenceFieldUpdater.get(o9Var2);
                                while (true) {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(o9Var2);
                                    long j6 = andIncrement2 & 1152921504606846975L;
                                    boolean zT2 = o9Var2.t(andIncrement2, false);
                                    int i5 = q9.b;
                                    long j7 = i5;
                                    String str2 = str;
                                    long j8 = j6 / j7;
                                    int i6 = (int) (j6 % j7);
                                    if (kbVar3.c != j8) {
                                        kb kbVarB2 = b(o9Var2, j8, kbVar3);
                                        if (kbVarB2 != null) {
                                            i2 = i5;
                                            kbVar = kbVarB2;
                                        } else {
                                            if (zT2) {
                                                break;
                                            }
                                            str = str2;
                                        }
                                    } else {
                                        kbVar = kbVar3;
                                        i2 = i5;
                                    }
                                    int iE3 = e(o9Var2, kbVar, i6, obj3, j6, laVarZ, zT2);
                                    Object obj4 = obj3;
                                    o9Var = o9Var2;
                                    kb kbVar4 = kbVar;
                                    obj2 = obj4;
                                    if (iE3 == 0) {
                                        kbVar4.a();
                                        break;
                                    }
                                    if (iE3 == 1) {
                                        break;
                                    }
                                    if (iE3 != 2) {
                                        if (iE3 == 3) {
                                            throw new IllegalStateException(str2);
                                        }
                                        if (iE3 != 4) {
                                            if (iE3 == 5) {
                                                kbVar4.a();
                                            }
                                            kbVar3 = kbVar4;
                                            o9Var2 = o9Var;
                                            str = str2;
                                            obj3 = obj2;
                                        } else if (j6 < atomicLongFieldUpdater2.get(o9Var)) {
                                            kbVar4.a();
                                        }
                                    } else if (zT2) {
                                        kbVar4.h();
                                    } else {
                                        laVarZ.a(kbVar4, i6 + i2);
                                    }
                                }
                                laVarZ.ab();
                                throw th;
                            }
                            obj2 = obj3;
                            o9Var = o9Var2;
                            if (j2 < atomicLongFieldUpdater2.get(o9Var)) {
                                kbVar2.a();
                            }
                            d(o9Var, obj2, laVarZ);
                        } else {
                            laVarZ.a(kbVar2, i4 + i3);
                        }
                        objS = laVarZ.s();
                        if (objS != yjVar) {
                            objS = wz0Var;
                        }
                        if (objS != yjVar) {
                            return objS;
                        }
                    } else {
                        kbVar2.a();
                    }
                    laVarZ.h(wz0Var);
                    objS = laVarZ.s();
                    if (objS != yjVar) {
                    }
                    if (objS != yjVar) {
                    }
                } else if (iE2 == 4) {
                    if (j2 < atomicLongFieldUpdater2.get(o9Var2)) {
                        kbVar2.a();
                    }
                    Object objY2 = y(jiVar, obj);
                    if (objY2 == yjVar) {
                        return objY2;
                    }
                } else if (iE2 == 5) {
                    kbVar2.a();
                }
            } else if (zT) {
                kbVar2.h();
                Object objY3 = y(jiVar, obj);
                if (objY3 == yjVar) {
                    return objY3;
                }
            }
        }
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
    */
    public final kb h(long j2) {
        Object objAt;
        long j3;
        Object obj = k.get(this);
        kb kbVar = (kb) i.get(this);
        if (kbVar.c > ((kb) obj).c) {
            obj = kbVar;
        }
        kb kbVar2 = (kb) j.get(this);
        if (kbVar2.c > ((kb) obj).c) {
            obj = kbVar2;
        }
        ug ugVar = (ug) obj;
        loop0: while (true) {
            ugVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ug.a;
            Object obj2 = atomicReferenceFieldUpdater.get(ugVar);
            jq jqVar = pk.b;
            objAt = null;
            if (obj2 == jqVar) {
                break;
            }
            ug ugVar2 = (ug) obj2;
            if (ugVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(ugVar, null, jqVar)) {
                    if (atomicReferenceFieldUpdater.get(ugVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            ugVar = ugVar2;
        }
        kb kbVar3 = (kb) ugVar;
        if (v()) {
            kb kbVar4 = kbVar3;
            loop2: do {
                int i2 = q9.b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (kbVar4.c * ((long) q9.b)) + ((long) i2);
                    if (j3 < f.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object objK = kbVar4.k(i2);
                        if (objK != null && objK != q9.e) {
                            if (objK == q9.d) {
                                break loop2;
                            }
                        } else {
                            if (kbVar4.j(i2, objK, q9.l)) {
                                kbVar4.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (kbVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                j(j3);
            }
        }
        loop5: for (kb kbVar5 = kbVar3; kbVar5 != null; kbVar5 = (kb) ((ug) ug.b.get(kbVar5))) {
            for (int i3 = q9.b - 1; -1 < i3; i3--) {
                if ((kbVar5.c * ((long) q9.b)) + ((long) i3) < j2) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = kbVar5.k(i3);
                    if (objK2 != null && objK2 != q9.e) {
                        if (!(objK2 instanceof x11)) {
                            if (!(objK2 instanceof w11)) {
                                break;
                            }
                            if (kbVar5.j(i3, objK2, q9.l)) {
                                objAt = i60.at(objAt, objK2);
                                kbVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (kbVar5.j(i3, objK2, q9.l)) {
                                objAt = i60.at(objAt, ((x11) objK2).a);
                                kbVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (kbVar5.j(i3, objK2, q9.l)) {
                            kbVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objAt != null) {
            if (!(objAt instanceof ArrayList)) {
                z((w11) objAt, true);
                return kbVar3;
            }
            ArrayList arrayList = (ArrayList) objAt;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                z((w11) arrayList.get(size), true);
            }
        }
        return kbVar3;
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
    */
    public final void k() {
        Object objZ;
        if (w()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        kb kbVar = (kb) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = g.getAndIncrement(this);
            long j2 = andIncrement / ((long) q9.b);
            if (q() <= andIncrement) {
                if (kbVar.c < j2 && kbVar.b() != null) {
                    x(j2, kbVar);
                }
                r(this);
                return;
            }
            if (kbVar.c != j2) {
                p9 p9Var = p9.l;
                while (true) {
                    objZ = pk.z(kbVar, j2, p9Var);
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
                kb kbVar2 = null;
                if (wn0.h(objZ)) {
                    i();
                    x(j2, kbVar);
                    r(this);
                } else {
                    kb kbVar3 = (kb) wn0.e(objZ);
                    long j3 = kbVar3.c;
                    if (j3 > j2) {
                        long j4 = j3 * ((long) q9.b);
                        if (g.compareAndSet(this, 1 + andIncrement, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            r(this);
                        }
                    } else {
                        kbVar2 = kbVar3;
                    }
                }
                if (kbVar2 == null) {
                    continue;
                } else {
                    kbVar = kbVar2;
                }
            }
            int i2 = (int) (andIncrement % ((long) q9.b));
            Object objK = kbVar.k(i2);
            boolean z = objK instanceof w11;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !kbVar.j(i2, objK, q9.g)) {
                while (true) {
                    Object objK2 = kbVar.k(i2);
                    if (!(objK2 instanceof w11)) {
                        if (objK2 != q9.j) {
                            if (objK2 != null) {
                                if (objK2 == q9.d || objK2 == q9.h || objK2 == q9.i || objK2 == q9.k || objK2 == q9.l) {
                                    break loop0;
                                } else if (objK2 != q9.f) {
                                    wc.f(objK2, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (kbVar.j(i2, objK2, q9.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kbVar.j(i2, objK2, new x11((w11) objK2))) {
                            break loop0;
                        }
                    } else if (kbVar.j(i2, objK2, q9.g)) {
                        if (ab(objK2)) {
                            kbVar.n(i2, q9.d);
                            break;
                        } else {
                            kbVar.n(i2, q9.j);
                            kbVar.h();
                        }
                    }
                }
            } else if (ab(objK)) {
                kbVar.n(i2, q9.d);
                break;
            } else {
                kbVar.n(i2, q9.j);
                kbVar.h();
                r(this);
            }
        }
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
    */
    public final boolean t(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            if (i2 == 2) {
                h(1152921504606846975L & j2);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                        kb kbVarL = (kb) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (q() <= j3) {
                            break;
                        }
                        long j4 = q9.b;
                        long j5 = j3 / j4;
                        if (kbVarL.c != j5 && (kbVarL = l(j5, kbVarL)) == null) {
                            if (((kb) atomicReferenceFieldUpdater.get(this)).c < j5) {
                                break;
                            }
                        } else {
                            kbVarL.a();
                            int i3 = (int) (j3 % j4);
                            while (true) {
                                Object objK = kbVarL.k(i3);
                                if (objK != null && objK != q9.e) {
                                    if (objK == q9.d || (objK != q9.j && objK != q9.l && objK != q9.i && objK != q9.h && (objK == q9.g || (objK != q9.f && j3 == atomicLongFieldUpdater.get(this))))) {
                                        break;
                                    }
                                } else {
                                    if (kbVarL.j(i3, objK, q9.h)) {
                                        k();
                                        break;
                                    }
                                }
                            }
                            f.compareAndSet(this, j3, j3 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(("unexpected close status: " + i2).toString());
                }
                kb kbVarH = h(1152921504606846975L & j2);
                Object objAt = null;
                loop0: do {
                    int i4 = q9.b - 1;
                    while (true) {
                        if (-1 >= i4) {
                            break;
                        }
                        long j6 = (kbVarH.c * ((long) q9.b)) + ((long) i4);
                        while (true) {
                            Object objK2 = kbVarH.k(i4);
                            if (objK2 == q9.i) {
                                break loop0;
                            }
                            if (objK2 != q9.d) {
                                if (objK2 != q9.e && objK2 != null) {
                                    if (!(objK2 instanceof w11) && !(objK2 instanceof x11)) {
                                        jq jqVar = q9.g;
                                        if (objK2 == jqVar || objK2 == q9.f) {
                                            break loop0;
                                        }
                                        if (objK2 != jqVar) {
                                            break;
                                        }
                                    } else {
                                        if (j6 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        w11 w11Var = objK2 instanceof x11 ? ((x11) objK2).a : (w11) objK2;
                                        if (kbVarH.j(i4, objK2, q9.l)) {
                                            objAt = i60.at(objAt, w11Var);
                                            kbVarH.m(i4, null);
                                            kbVarH.h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (kbVarH.j(i4, objK2, q9.l)) {
                                        kbVarH.h();
                                        break;
                                    }
                                }
                            } else {
                                if (j6 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (kbVarH.j(i4, objK2, q9.l)) {
                                    kbVarH.m(i4, null);
                                    kbVarH.h();
                                    break;
                                }
                            }
                        }
                        i4--;
                    }
                } while (kbVarH != null);
                if (objAt != null) {
                    if (objAt instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objAt;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            z((w11) arrayList.get(size), false);
                        }
                    } else {
                        z((w11) objAt, false);
                    }
                }
            }
            return true;
        }
        return false;
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
    */
    public final String toString() {
        boolean z;
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (e.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.d + ',');
        sb.append("data=[");
        int i3 = 0;
        boolean z2 = true;
        List listZ = f00.z(j.get(this), i.get(this), k.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ) {
            if (((kb) obj) != q9.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            wc.p();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((kb) next).c;
            do {
                Object next2 = it.next();
                long j3 = ((kb) next2).c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        kb kbVar = (kb) next;
        long j4 = f.get(this);
        long jQ = q();
        loop2: while (true) {
            int i4 = q9.b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (kbVar.c * ((long) q9.b)) + ((long) i5);
                if (j5 >= jQ && j5 >= j4) {
                    break loop2;
                }
                Object objK = kbVar.k(i5);
                boolean z3 = z2;
                Object obj2 = kbVar.f.get(i5 * 2);
                if (objK instanceof ja) {
                    string = (j5 >= j4 || j5 < jQ) ? (j5 >= jQ || j5 < j4) ? "cont" : "send" : "receive";
                } else if (objK instanceof x11) {
                    string = "EB(" + objK + ')';
                } else if (f00.h(objK, q9.f) || f00.h(objK, q9.g)) {
                    string = "resuming_sender";
                } else if (objK == null || objK.equals(q9.e) || objK.equals(q9.i) || objK.equals(q9.h) || objK.equals(q9.k) || objK.equals(q9.j) || objK.equals(q9.l)) {
                    i5++;
                    z2 = z3;
                } else {
                    string = objK.toString();
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i5++;
                z2 = z3;
            }
            z2 = z;
            i3 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd A[SYNTHETIC] */
    @Override // defpackage.lp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(Object obj) {
        int iE;
        jb jbVar = i60.d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        boolean z = false;
        long j2 = 1152921504606846975L;
        if (t(atomicLongFieldUpdater.get(this), false) ? false : !f(r1 & 1152921504606846975L)) {
            return jbVar;
        }
        hq hqVar = q9.j;
        kb kbVar = (kb) i.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zT = t(andIncrement, z);
            int i2 = q9.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (kbVar.c == j5) {
                iE = e(this, kbVar, i3, obj, j3, hqVar, zT);
                wz0 wz0Var = wz0.a;
                if (iE != 0) {
                    kbVar.a();
                    return wz0Var;
                }
                if (iE == 1) {
                    return wz0Var;
                }
                if (iE == 2) {
                    if (zT) {
                        kbVar.h();
                        return new ib(p());
                    }
                    w11 w11Var = hqVar instanceof w11 ? (w11) hqVar : null;
                    if (w11Var != null) {
                        w11Var.a(kbVar, i3 + i2);
                    }
                    kbVar.h();
                    return jbVar;
                }
                if (iE == 3) {
                    wc.q("unexpected");
                    return null;
                }
                if (iE == 4) {
                    if (j3 < f.get(this)) {
                        kbVar.a();
                    }
                    return new ib(p());
                }
                if (iE == 5) {
                    kbVar.a();
                }
                z = false;
            } else {
                kb kbVarB = b(this, j5, kbVar);
                if (kbVarB != null) {
                    kbVar = kbVarB;
                    iE = e(this, kbVar, i3, obj, j3, hqVar, zT);
                    wz0 wz0Var2 = wz0.a;
                    if (iE != 0) {
                    }
                } else {
                    if (zT) {
                        return new ib(p());
                    }
                    z = false;
                }
            }
            j2 = 1152921504606846975L;
        }
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
    */
    public final void x(long j2, kb kbVar) {
        kb kbVar2;
        kb kbVar3;
        while (kbVar.c < j2 && (kbVar3 = (kb) kbVar.b()) != null) {
            kbVar = kbVar3;
        }
        while (true) {
            if (!kbVar.c() || (kbVar2 = (kb) kbVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
                    un0 un0Var = (un0) atomicReferenceFieldUpdater.get(this);
                    if (un0Var.c >= kbVar.c) {
                        return;
                    }
                    if (!kbVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, un0Var, kbVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != un0Var) {
                            if (kbVar.e()) {
                                kbVar.d();
                            }
                        }
                    }
                    if (un0Var.e()) {
                        un0Var.d();
                        return;
                    }
                    return;
                }
            }
            kbVar = kbVar2;
        }
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

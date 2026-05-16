package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public class la extends um implements ja, zj, w11 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(la.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(la.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(la.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final ji g;
    public final pj h;

    public la(int i2, ji jiVar) {
        super(i2);
        this.g = jiVar;
        this.h = jiVar.e();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = bk.a;
    }

    public static Object af(oa0 oa0Var, Object obj, int i2, hv hvVar) {
        if (obj instanceof wd) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (hvVar != null || (oa0Var instanceof ga)) {
            return new ud(obj, oa0Var instanceof ga ? (ga) oa0Var : null, hvVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(oa0 oa0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + oa0Var + ", already has " + obj).toString());
    }

    @Override // defpackage.w11
    public final void a(un0 un0Var, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = i;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                wc.q("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        w(un0Var);
    }

    public String aa() {
        return "CancellableContinuation";
    }

    public final void ab() {
        ji jiVar = this.g;
        Throwable th = null;
        sm smVar = jiVar instanceof sm ? (sm) jiVar : null;
        if (smVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sm.k;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(smVar);
                jq jqVar = az0.c;
                if (obj == jqVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(smVar, jqVar, this)) {
                        if (atomicReferenceFieldUpdater.get(smVar) != jqVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        wc.f(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(smVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(smVar) != obj) {
                            wc.n("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            p();
            n(th);
        }
    }

    public final void ac(Object obj, hv hvVar) {
        ad(obj, this.f, hvVar);
    }

    public final void ad(Object obj, int i2, hv hvVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof oa0) {
                Object objAf = af((oa0) obj2, obj, i2, hvVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objAf)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    p();
                }
                q(i2);
                return;
            }
            if (obj2 instanceof ma) {
                ma maVar = (ma) obj2;
                if (ma.c.compareAndSet(maVar, 0, 1)) {
                    if (hvVar != null) {
                        m(hvVar, maVar.a, obj);
                        return;
                    }
                    return;
                }
            }
            wc.f(obj, "Already resumed, but proposed with update ");
            return;
        }
    }

    public final void ae(a aVar) {
        ji jiVar = this.g;
        sm smVar = jiVar instanceof sm ? (sm) jiVar : null;
        ad(wz0.a, (smVar != null ? smVar.g : null) == aVar ? 4 : this.f, null);
    }

    @Override // defpackage.um
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof oa0) {
                wc.q("Not completed");
                return;
            }
            if (obj instanceof wd) {
                return;
            }
            if (!(obj instanceof ud)) {
                cancellationException2 = cancellationException;
                ud udVar = new ud(obj, (ga) null, (hv) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, udVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            ud udVar2 = (ud) obj;
            if (udVar2.e != null) {
                wc.q("Must be called at most once");
                return;
            }
            ud udVarA = ud.a(udVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, udVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            ga gaVar = udVar2.b;
            if (gaVar != null) {
                k(gaVar, cancellationException);
            }
            hv hvVar = udVar2.c;
            if (hvVar != null) {
                m(hvVar, cancellationException, udVar2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // defpackage.um
    public final ji c() {
        return this.g;
    }

    @Override // defpackage.zj
    public final zj d() {
        ji jiVar = this.g;
        if (jiVar instanceof zj) {
            return (zj) jiVar;
        }
        return null;
    }

    @Override // defpackage.ji
    public final pj e() {
        return this.h;
    }

    @Override // defpackage.um
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // defpackage.um
    public final Object g(Object obj) {
        return obj instanceof ud ? ((ud) obj).a : obj;
    }

    @Override // defpackage.ji
    public final void h(Object obj) {
        Throwable thA = tj0.a(obj);
        if (thA != null) {
            obj = new wd(thA, false);
        }
        ad(obj, this.f, null);
    }

    @Override // defpackage.um
    public final Object j() {
        return j.get(this);
    }

    public final void k(ga gaVar, Throwable th) {
        try {
            switch (gaVar.a) {
                case 0:
                    ((cv) gaVar.b).g(th);
                    break;
                default:
                    ((en) gaVar.b).a();
                    break;
            }
        } catch (Throwable th2) {
            m10.ae(this.h, new xd("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.ja
    public final jq l(Object obj, hv hvVar) {
        jq jqVar = m10.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof oa0)) {
                return null;
            }
            Object objAf = af((oa0) obj2, obj, this.f, hvVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objAf)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                p();
            }
            return jqVar;
        }
    }

    public final void m(hv hvVar, Throwable th, Object obj) {
        pj pjVar = this.h;
        try {
            hvVar.c(th, obj, pjVar);
        } catch (Throwable th2) {
            m10.ae(pjVar, new xd("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.ja
    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof oa0)) {
                return false;
            }
            ma maVar = new ma(this, th, (obj instanceof ga) || (obj instanceof un0));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, maVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            oa0 oa0Var = (oa0) obj;
            if (oa0Var instanceof ga) {
                k((ga) obj, th);
            } else if (oa0Var instanceof un0) {
                o((un0) obj, th);
            }
            if (!x()) {
                p();
            }
            q(this.f);
            return true;
        }
    }

    public final void o(un0 un0Var, Throwable th) {
        pj pjVar = this.h;
        int i2 = i.get(this) & 536870911;
        if (i2 == 536870911) {
            wc.q("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            un0Var.g(i2, pjVar);
        } catch (Throwable th2) {
            m10.ae(pjVar, new xd("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        en enVar = (en) atomicReferenceFieldUpdater.get(this);
        if (enVar == null) {
            return;
        }
        enVar.a();
        atomicReferenceFieldUpdater.set(this, ma0.d);
    }

    public final void q(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = i;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    wc.q("Already resumed");
                    return;
                }
                boolean z = i2 == 4;
                ji jiVar = this.g;
                if (!z && (jiVar instanceof sm)) {
                    boolean z2 = i2 == 1 || i2 == 2;
                    int i5 = this.f;
                    if (z2 == (i5 == 1 || i5 == 2)) {
                        sm smVar = (sm) jiVar;
                        a aVar = smVar.g;
                        pj pjVarE = smVar.h.e();
                        if (aVar.e(pjVarE)) {
                            aVar.d(pjVarE, this);
                            return;
                        }
                        cr crVarA = ux0.a();
                        if (crVarA.f >= 4294967296L) {
                            crVarA.l(this);
                            return;
                        }
                        crVarA.n(true);
                        try {
                            f00.ab(this, jiVar, true);
                            do {
                            } while (crVarA.s());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                f00.ab(this, jiVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable r(a10 a10Var) {
        return a10Var.q();
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        t00 t00Var;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = i;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    wc.q("Already suspended");
                    return null;
                }
                if (zX) {
                    ab();
                }
                Object obj = j.get(this);
                if (obj instanceof wd) {
                    throw ((wd) obj).a;
                }
                int i4 = this.f;
                if ((i4 != 1 && i4 != 2) || (t00Var = (t00) this.h.k(bw.ae)) == null || t00Var.b()) {
                    return g(obj);
                }
                CancellationException cancellationExceptionQ = t00Var.q();
                b(cancellationExceptionQ);
                throw cancellationExceptionQ;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((en) k.get(this)) == null) {
            u();
        }
        if (zX) {
            ab();
        }
        return yj.d;
    }

    public final void t() {
        en enVarU = u();
        if (enVarU == null || (j.get(this) instanceof oa0)) {
            return;
        }
        enVarU.a();
        k.set(this, ma0.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(aa());
        sb.append('(');
        sb.append(pk.bi(this.g));
        sb.append("){");
        Object obj = j.get(this);
        sb.append(obj instanceof oa0 ? "Active" : obj instanceof ma ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(pk.ae(this));
        return sb.toString();
    }

    public final en u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        t00 t00Var = (t00) this.h.k(bw.ae);
        if (t00Var == null) {
            return null;
        }
        en enVarAj = i60.aj(t00Var, true, new ob(this, 0));
        do {
            atomicReferenceFieldUpdater = k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, enVarAj)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return enVarAj;
    }

    public final void v(cv cvVar) {
        w(new ga(0, cvVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        z(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(oa0 oa0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof bk) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oa0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof ga) || (obj instanceof un0)) {
                break;
            }
            if (obj instanceof wd) {
                wd wdVar = (wd) obj;
                if (!wd.b.compareAndSet(wdVar, 0, 1)) {
                    z(oa0Var, obj);
                    throw null;
                }
                if (obj instanceof ma) {
                    Throwable th = wdVar.a;
                    if (oa0Var instanceof ga) {
                        k((ga) oa0Var, th);
                        return;
                    } else {
                        o((un0) oa0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof ud)) {
                if (oa0Var instanceof un0) {
                    return;
                }
                ud udVar = new ud(obj, (ga) oa0Var, (hv) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, udVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            ud udVar2 = (ud) obj;
            if (udVar2.b != null) {
                z(oa0Var, obj);
                throw null;
            }
            if (oa0Var instanceof un0) {
                return;
            }
            ga gaVar = (ga) oa0Var;
            Throwable th2 = udVar2.e;
            if (th2 != null) {
                k(gaVar, th2);
                return;
            }
            ud udVarA = ud.a(udVar2, gaVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, udVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean x() {
        if (this.f == 2) {
            return sm.k.get((sm) this.g) != null;
        }
        return false;
    }

    @Override // defpackage.ja
    public final void y(Object obj) {
        q(this.f);
    }
}

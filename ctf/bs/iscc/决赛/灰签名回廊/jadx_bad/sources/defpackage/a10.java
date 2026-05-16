package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.a;

/* JADX INFO: loaded from: classes.dex */
public class a10 implements t00 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(a10.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(a10.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public a10(boolean z) {
        this._state$volatile = z ? az0.j : az0.i;
    }

    public static qb au(a aVar) {
        while (aVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.e;
            a aVarF = aVar.f();
            if (aVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(aVar);
                while (true) {
                    aVar = (a) obj;
                    if (!aVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(aVar);
                }
            } else {
                aVar = aVarF;
            }
        }
        while (true) {
            aVar = aVar.h();
            if (!aVar.i()) {
                if (aVar instanceof qb) {
                    return (qb) aVar;
                }
                if (aVar instanceof ha0) {
                    return null;
                }
            }
        }
    }

    public static String bb(Object obj) {
        if (!(obj instanceof z00)) {
            return obj instanceof iy ? ((iy) obj).b() ? "Active" : "New" : obj instanceof wd ? "Cancelled" : "Completed";
        }
        z00 z00Var = (z00) obj;
        return z00Var.e() ? "Cancelling" : z00.e.get(z00Var) != 0 ? "Completing" : "Active";
    }

    @Override // defpackage.t00
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new u00(ae(), null, this);
        }
        ac(cancellationException);
    }

    public void aa(Object obj) {
        z(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ab(Object obj) {
        jq jqVar;
        Object objBc = az0.d;
        if (al()) {
            do {
                Object obj2 = d.get(this);
                if (obj2 instanceof iy) {
                    if (obj2 instanceof z00) {
                        if (z00.e.get((z00) obj2) != 0) {
                        }
                    }
                    objBc = bc(obj2, new wd(ah(obj), false));
                }
                objBc = az0.d;
                break;
            } while (objBc == az0.f);
            if (objBc != az0.e) {
                if (objBc == az0.d) {
                    Throwable thAh = null;
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                        Object obj3 = atomicReferenceFieldUpdater.get(this);
                        if (!(obj3 instanceof z00)) {
                            if (!(obj3 instanceof iy)) {
                                jqVar = az0.g;
                                break;
                            }
                            if (thAh == null) {
                                thAh = ah(obj);
                            }
                            iy iyVar = (iy) obj3;
                            if (iyVar.b()) {
                                ha0 ha0VarAm = am(iyVar);
                                if (ha0VarAm != null) {
                                    z00 z00Var = new z00(ha0VarAm, thAh);
                                    while (!atomicReferenceFieldUpdater.compareAndSet(this, iyVar, z00Var)) {
                                        if (atomicReferenceFieldUpdater.get(this) != iyVar) {
                                            break;
                                        }
                                    }
                                    av(ha0VarAm, thAh);
                                    jqVar = az0.d;
                                    break loop1;
                                }
                                continue;
                            } else {
                                Object objBc2 = bc(obj3, new wd(thAh, false));
                                if (objBc2 == az0.d) {
                                    wc.f(obj3, "Cannot happen in ");
                                    return false;
                                }
                                if (objBc2 != az0.f) {
                                    objBc = objBc2;
                                    break;
                                }
                            }
                        } else {
                            synchronized (obj3) {
                                if (z00.g.get((z00) obj3) == az0.h) {
                                    jqVar = az0.g;
                                } else {
                                    boolean zE = ((z00) obj3).e();
                                    if (thAh == null) {
                                        thAh = ah(obj);
                                    }
                                    ((z00) obj3).a(thAh);
                                    Throwable thC = zE ? null : ((z00) obj3).c();
                                    if (thC != null) {
                                        av(((z00) obj3).d, thC);
                                    }
                                    jqVar = az0.d;
                                }
                            }
                        }
                    }
                }
                if (objBc != az0.d && objBc != az0.e) {
                    if (objBc == az0.g) {
                        return false;
                    }
                    z(objBc);
                    return true;
                }
            }
        }
        return true;
    }

    public void ac(CancellationException cancellationException) {
        ab(cancellationException);
    }

    public final boolean ad(Throwable th) {
        if (ar()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        pb pbVar = (pb) e.get(this);
        return (pbVar == null || pbVar == ma0.d) ? z : pbVar.c(th) || z;
    }

    public String ae() {
        return "Job was cancelled";
    }

    public boolean af(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return ab(th) && ak();
    }

    public final void ag(iy iyVar, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        pb pbVar = (pb) atomicReferenceFieldUpdater.get(this);
        if (pbVar != null) {
            pbVar.a();
            atomicReferenceFieldUpdater.set(this, ma0.d);
        }
        xd xdVar = null;
        wd wdVar = obj instanceof wd ? (wd) obj : null;
        Throwable th = wdVar != null ? wdVar.a : null;
        if (iyVar instanceof w00) {
            try {
                ((w00) iyVar).l(th);
                return;
            } catch (Throwable th2) {
                ao(new xd("Exception in completion handler " + iyVar + " for " + this, th2));
                return;
            }
        }
        ha0 ha0VarD = iyVar.d();
        if (ha0VarD != null) {
            ha0VarD.e(new o40(1), 1);
            Object obj2 = a.d.get(ha0VarD);
            obj2.getClass();
            for (a aVarH = (a) obj2; !aVarH.equals(ha0VarD); aVarH = aVarH.h()) {
                if (aVarH instanceof w00) {
                    try {
                        ((w00) aVarH).l(th);
                    } catch (Throwable th3) {
                        if (xdVar != null) {
                            t1.g(xdVar, th3);
                        } else {
                            xdVar = new xd("Exception in completion handler " + aVarH + " for " + this, th3);
                        }
                    }
                }
            }
            if (xdVar != null) {
                ao(xdVar);
            }
        }
    }

    public final Throwable ah(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        a10 a10Var = (a10) obj;
        Object obj2 = d.get(a10Var);
        if (obj2 instanceof z00) {
            thC = ((z00) obj2).c();
        } else if (obj2 instanceof wd) {
            thC = ((wd) obj2).a;
        } else {
            if (obj2 instanceof iy) {
                wc.f(obj2, "Cannot be cancelling child in this state: ");
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new u00("Parent job is ".concat(bb(obj2)), thC, a10Var) : cancellationException;
    }

    public final Object ai(z00 z00Var, Object obj) {
        Throwable thAj;
        wd wdVar = obj instanceof wd ? (wd) obj : null;
        Throwable th = wdVar != null ? wdVar.a : null;
        synchronized (z00Var) {
            z00Var.e();
            ArrayList arrayListF = z00Var.f(th);
            thAj = aj(z00Var, arrayListF);
            if (thAj != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                int size = arrayListF.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayListF.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thAj && th2 != thAj && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        t1.g(thAj, th2);
                    }
                }
            }
        }
        if (thAj != null && thAj != th) {
            obj = new wd(thAj, false);
        }
        if (thAj != null && (ad(thAj) || an(thAj))) {
            obj.getClass();
            wd.b.compareAndSet((wd) obj, 0, 1);
        }
        aw(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object jyVar = obj instanceof iy ? new jy((iy) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, z00Var, jyVar) && atomicReferenceFieldUpdater.get(this) == z00Var) {
        }
        ag(z00Var, obj);
        return obj;
    }

    public final Throwable aj(z00 z00Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (z00Var.e()) {
                return new u00(ae(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof ay0) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof ay0)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean ak() {
        return true;
    }

    public boolean al() {
        return this instanceof td;
    }

    public final ha0 am(iy iyVar) {
        ha0 ha0VarD = iyVar.d();
        if (ha0VarD != null) {
            return ha0VarD;
        }
        if (iyVar instanceof mq) {
            return new ha0();
        }
        if (iyVar instanceof w00) {
            az((w00) iyVar);
            return null;
        }
        wc.f(iyVar, "State should have list: ");
        return null;
    }

    public boolean an(Throwable th) {
        return false;
    }

    public final void ap(t00 t00Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        ma0 ma0Var = ma0.d;
        if (t00Var == null) {
            atomicReferenceFieldUpdater.set(this, ma0Var);
            return;
        }
        t00Var.start();
        pb pbVarI = t00Var.i(this);
        atomicReferenceFieldUpdater.set(this, pbVarI);
        if (d.get(this) instanceof iy) {
            return;
        }
        pbVarI.a();
        atomicReferenceFieldUpdater.set(this, ma0Var);
    }

    public final en aq(boolean z, w00 w00Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ma0 ma0Var;
        boolean z2;
        boolean zE;
        w00Var.g = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof mq;
            ma0Var = ma0.d;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof iy)) {
                    z2 = false;
                    break;
                }
                iy iyVar = (iy) obj;
                ha0 ha0VarD = iyVar.d();
                if (ha0VarD == null) {
                    az((w00) obj);
                } else {
                    if (w00Var.k()) {
                        z00 z00Var = iyVar instanceof z00 ? (z00) iyVar : null;
                        Throwable thC = z00Var != null ? z00Var.c() : null;
                        if (thC == null) {
                            zE = ha0VarD.e(w00Var, 5);
                        } else if (z) {
                            w00Var.l(thC);
                            return ma0Var;
                        }
                    } else {
                        zE = ha0VarD.e(w00Var, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                mq mqVar = (mq) obj;
                if (mqVar.d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w00Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                ay(mqVar);
            }
        }
        if (z2) {
            return w00Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            wd wdVar = obj2 instanceof wd ? (wd) obj2 : null;
            w00Var.l(wdVar != null ? wdVar.a : null);
        }
        return ma0Var;
    }

    public boolean ar() {
        return this instanceof e8;
    }

    public final boolean as(Object obj) {
        Object objBc;
        do {
            objBc = bc(d.get(this), obj);
            if (objBc == az0.d) {
                return false;
            }
            if (objBc == az0.e) {
                return true;
            }
        } while (objBc == az0.f);
        z(objBc);
        return true;
    }

    public final Object at(Object obj) {
        Object objBc;
        do {
            objBc = bc(d.get(this), obj);
            if (objBc == az0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                wd wdVar = obj instanceof wd ? (wd) obj : null;
                throw new IllegalStateException(str, wdVar != null ? wdVar.a : null);
            }
        } while (objBc == az0.f);
        return objBc;
    }

    public final void av(ha0 ha0Var, Throwable th) {
        ha0Var.e(new o40(4), 4);
        Object obj = a.d.get(ha0Var);
        obj.getClass();
        xd xdVar = null;
        for (a aVarH = (a) obj; !aVarH.equals(ha0Var); aVarH = aVarH.h()) {
            if ((aVarH instanceof w00) && ((w00) aVarH).k()) {
                try {
                    ((w00) aVarH).l(th);
                } catch (Throwable th2) {
                    if (xdVar != null) {
                        t1.g(xdVar, th2);
                    } else {
                        xdVar = new xd("Exception in completion handler " + aVarH + " for " + this, th2);
                    }
                }
            }
        }
        if (xdVar != null) {
            ao(xdVar);
        }
        ad(th);
    }

    public final void ay(mq mqVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ha0 ha0Var = new ha0();
        Object hyVar = ha0Var;
        if (!mqVar.d) {
            hyVar = new hy(ha0Var);
        }
        do {
            atomicReferenceFieldUpdater = d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, mqVar, hyVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == mqVar);
    }

    public final void az(w00 w00Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ha0 ha0Var = new ha0();
        w00Var.getClass();
        a.e.set(ha0Var, w00Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.d;
        atomicReferenceFieldUpdater2.set(ha0Var, w00Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(w00Var) == w00Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(w00Var, w00Var, ha0Var)) {
                    if (atomicReferenceFieldUpdater2.get(w00Var) != w00Var) {
                        break;
                    }
                }
                ha0Var.g(w00Var);
                break loop0;
            }
            break;
        }
        a aVarH = w00Var.h();
        do {
            atomicReferenceFieldUpdater = d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, w00Var, aVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == w00Var);
    }

    @Override // defpackage.t00
    public boolean b() {
        Object obj = d.get(this);
        return (obj instanceof iy) && ((iy) obj).b();
    }

    public final int ba(Object obj) {
        boolean z = obj instanceof mq;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        if (z) {
            if (((mq) obj).d) {
                return 0;
            }
            mq mqVar = az0.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mqVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            ax();
            return 1;
        }
        if (!(obj instanceof hy)) {
            return 0;
        }
        ha0 ha0Var = ((hy) obj).d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ha0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        ax();
        return 1;
    }

    public final Object bc(Object obj, Object obj2) {
        if (!(obj instanceof iy)) {
            return az0.d;
        }
        if (((obj instanceof mq) || (obj instanceof w00)) && !(obj instanceof qb) && !(obj2 instanceof wd)) {
            iy iyVar = (iy) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object jyVar = obj2 instanceof iy ? new jy((iy) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, iyVar, jyVar)) {
                if (atomicReferenceFieldUpdater.get(this) != iyVar) {
                    return az0.f;
                }
            }
            aw(obj2);
            ag(iyVar, obj2);
            return obj2;
        }
        iy iyVar2 = (iy) obj;
        ha0 ha0VarAm = am(iyVar2);
        if (ha0VarAm == null) {
            return az0.f;
        }
        z00 z00Var = iyVar2 instanceof z00 ? (z00) iyVar2 : null;
        if (z00Var == null) {
            z00Var = new z00(ha0VarAm, null);
        }
        synchronized (z00Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z00.e;
            if (atomicIntegerFieldUpdater.get(z00Var) != 0) {
                return az0.d;
            }
            atomicIntegerFieldUpdater.set(z00Var, 1);
            if (z00Var != iyVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, iyVar2, z00Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != iyVar2) {
                        return az0.f;
                    }
                }
            }
            boolean zE = z00Var.e();
            wd wdVar = obj2 instanceof wd ? (wd) obj2 : null;
            if (wdVar != null) {
                z00Var.a(wdVar.a);
            }
            Throwable thC = zE ? null : z00Var.c();
            if (thC != null) {
                av(ha0VarAm, thC);
            }
            qb qbVarAu = au(ha0VarAm);
            if (qbVarAu != null && bd(z00Var, qbVarAu, obj2)) {
                return az0.e;
            }
            ha0VarAm.e(new o40(2), 2);
            qb qbVarAu2 = au(ha0VarAm);
            return (qbVarAu2 == null || !bd(z00Var, qbVarAu2, obj2)) ? ai(z00Var, obj2) : az0.e;
        }
    }

    public final boolean bd(z00 z00Var, qb qbVar, Object obj) {
        while (i60.aj(qbVar.h, false, new y00(this, z00Var, qbVar, obj)) == ma0.d) {
            qbVar = au(qbVar);
            if (qbVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.t00
    public final en g(boolean z, boolean z2, ft ftVar) {
        return aq(z2, z ? new q00(ftVar) : new r00(0, ftVar));
    }

    @Override // defpackage.nj
    public final oj getKey() {
        return bw.ae;
    }

    @Override // defpackage.t00
    public final pb i(a10 a10Var) {
        qb qbVar = new qb(a10Var);
        qbVar.g = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof mq) {
                mq mqVar = (mq) obj;
                if (mqVar.d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qbVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                ay(mqVar);
            } else {
                boolean z = obj instanceof iy;
                ma0 ma0Var = ma0.d;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    wd wdVar = obj2 instanceof wd ? (wd) obj2 : null;
                    qbVar.l(wdVar != null ? wdVar.a : null);
                    return ma0Var;
                }
                ha0 ha0VarD = ((iy) obj).d();
                if (ha0VarD == null) {
                    az((w00) obj);
                } else if (!ha0VarD.e(qbVar, 7)) {
                    boolean zE = ha0VarD.e(qbVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof z00) {
                        thC = ((z00) obj3).c();
                    } else {
                        wd wdVar2 = obj3 instanceof wd ? (wd) obj3 : null;
                        if (wdVar2 != null) {
                            thC = wdVar2.a;
                        }
                    }
                    qbVar.l(thC);
                    if (zE) {
                        break loop0;
                    }
                    return ma0Var;
                }
            }
        }
        return qbVar;
    }

    @Override // defpackage.pj
    public final pj j(pj pjVar) {
        return pk.an(this, pjVar);
    }

    @Override // defpackage.pj
    public final nj k(oj ojVar) {
        return pk.ab(this, ojVar);
    }

    @Override // defpackage.t00
    public final CancellationException q() {
        CancellationException cancellationException;
        Object obj = d.get(this);
        if (obj instanceof z00) {
            Throwable thC = ((z00) obj).c();
            if (thC == null) {
                wc.f(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
            return cancellationException == null ? new u00(strConcat, thC, this) : cancellationException;
        }
        if (obj instanceof iy) {
            wc.f(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof wd)) {
            return new u00(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((wd) obj).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new u00(ae(), th, this) : cancellationException;
    }

    @Override // defpackage.pj
    public final Object r(gv gvVar, Object obj) {
        return gvVar.f(obj, this);
    }

    @Override // defpackage.t00
    public final boolean start() {
        int iBa;
        do {
            iBa = ba(d.get(this));
            if (iBa == 0) {
                return false;
            }
        } while (iBa != 1);
        return true;
    }

    @Override // defpackage.t00
    public final en t(cv cvVar) {
        return aq(true, new r00(0, cvVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + bb(d.get(this)) + '}');
        sb.append('@');
        sb.append(pk.ae(this));
        return sb.toString();
    }

    @Override // defpackage.pj
    public final pj v(oj ojVar) {
        return pk.am(this, ojVar);
    }

    @Override // defpackage.t00
    public final Object x(ki kiVar) {
        Object obj;
        wz0 wz0Var;
        do {
            obj = d.get(this);
            boolean z = obj instanceof iy;
            wz0Var = wz0.a;
            if (!z) {
                i60.ac(kiVar.e());
                return wz0Var;
            }
        } while (ba(obj) < 0);
        la laVar = new la(1, f00.x(kiVar));
        laVar.t();
        int i = 1;
        laVar.w(new ga(i, i60.aj(this, true, new ob(laVar, i))));
        Object objS = laVar.s();
        yj yjVar = yj.d;
        if (objS != yjVar) {
            objS = wz0Var;
        }
        return objS == yjVar ? objS : wz0Var;
    }

    public void ax() {
    }

    public void ao(xd xdVar) {
        throw xdVar;
    }

    public void aw(Object obj) {
    }

    public void z(Object obj) {
    }
}

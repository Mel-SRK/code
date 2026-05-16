package kotlinx.coroutines.internal;

import defpackage.gj0;
import defpackage.o40;
import defpackage.pk;
import defpackage.w40;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(a aVar, int i) {
        while (true) {
            a aVarF = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (aVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    aVarF = (a) obj;
                    if (!aVarF.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(aVarF);
                }
            }
            if (aVarF instanceof o40) {
                return (((o40) aVarF).g & i) == 0 && aVarF.e(aVar, i);
            }
            atomicReferenceFieldUpdater.set(aVar, aVarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
            atomicReferenceFieldUpdater2.set(aVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(aVarF, this, aVar)) {
                if (atomicReferenceFieldUpdater2.get(aVarF) != this) {
                    break;
                }
            }
            aVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((defpackage.gj0) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a f() {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            a aVar = (a) atomicReferenceFieldUpdater.get(this);
            a aVar2 = aVar;
            while (true) {
                a aVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
                    Object obj = atomicReferenceFieldUpdater2.get(aVar2);
                    if (obj == this) {
                        if (aVar != aVar2) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof gj0)) {
                        obj.getClass();
                        aVar3 = aVar2;
                        aVar2 = (a) obj;
                    } else {
                        if (aVar3 != null) {
                            break;
                        }
                        aVar2 = (a) atomicReferenceFieldUpdater.get(aVar2);
                    }
                }
                aVar2 = aVar3;
            }
        }
    }

    public final void g(a aVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            a aVar2 = (a) atomicReferenceFieldUpdater.get(aVar);
            if (d.get(this) != aVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, aVar2, this)) {
                if (atomicReferenceFieldUpdater.get(aVar) != aVar2) {
                    break;
                }
            }
            if (i()) {
                aVar.f();
                return;
            }
            return;
        }
    }

    public final a h() {
        Object obj = d.get(this);
        gj0 gj0Var = obj instanceof gj0 ? (gj0) obj : null;
        if (gj0Var != null) {
            return gj0Var.a;
        }
        obj.getClass();
        return (a) obj;
    }

    public boolean i() {
        return d.get(this) instanceof gj0;
    }

    public String toString() {
        return new w40(this, pk.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1, 0) + '@' + pk.ae(this);
    }
}

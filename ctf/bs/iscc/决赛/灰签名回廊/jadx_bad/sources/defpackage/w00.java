package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class w00 extends a implements en, iy {
    public a10 g;

    @Override // defpackage.en
    public final void a() {
        a10 a10VarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a10.d;
            Object obj = atomicReferenceFieldUpdater.get(a10VarJ);
            if (obj instanceof w00) {
                if (obj != this) {
                    return;
                }
                mq mqVar = az0.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(a10VarJ, obj, mqVar)) {
                    if (atomicReferenceFieldUpdater.get(a10VarJ) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof iy) || ((iy) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.d;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof gj0) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                a aVar = (a) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = a.f;
                gj0 gj0Var = (gj0) atomicReferenceFieldUpdater3.get(aVar);
                if (gj0Var == null) {
                    gj0Var = new gj0(aVar);
                    atomicReferenceFieldUpdater3.set(aVar, gj0Var);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, gj0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                aVar.f();
                return;
            }
        }
    }

    @Override // defpackage.iy
    public final boolean b() {
        return true;
    }

    @Override // defpackage.iy
    public final ha0 d() {
        return null;
    }

    public t00 getParent() {
        return j();
    }

    public final a10 j() {
        a10 a10Var = this.g;
        if (a10Var != null) {
            return a10Var;
        }
        f00.ag("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // kotlinx.coroutines.internal.a
    public final String toString() {
        return getClass().getSimpleName() + '@' + pk.ae(this) + "[job@" + pk.ae(j()) + ']';
    }
}

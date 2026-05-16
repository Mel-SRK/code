package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class x40 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(x40.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new z40(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            z40 z40Var = (z40) atomicReferenceFieldUpdater.get(this);
            int iA = z40Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                z40 z40VarC = z40Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, z40Var, z40VarC) && atomicReferenceFieldUpdater.get(this) == z40Var) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            z40 z40Var = (z40) atomicReferenceFieldUpdater.get(this);
            if (z40Var.b()) {
                return;
            }
            z40 z40VarC = z40Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, z40Var, z40VarC) && atomicReferenceFieldUpdater.get(this) == z40Var) {
            }
        }
    }

    public final int c() {
        z40 z40Var = (z40) a.get(this);
        z40Var.getClass();
        long j = z40.f.get(z40Var);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            z40 z40Var = (z40) atomicReferenceFieldUpdater.get(this);
            Object objD = z40Var.d();
            if (objD != z40.g) {
                return objD;
            }
            z40 z40VarC = z40Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, z40Var, z40VarC) && atomicReferenceFieldUpdater.get(this) == z40Var) {
            }
        }
    }
}

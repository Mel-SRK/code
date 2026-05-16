package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class ug {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ug.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ug.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public ug(un0 un0Var) {
        this._prev$volatile = un0Var;
    }

    public final void a() {
        b.set(this, null);
    }

    public final ug b() {
        Object obj = a.get(this);
        if (obj == pk.b) {
            return null;
        }
        return (ug) obj;
    }

    public abstract boolean c();

    public final void d() {
        ug ugVarB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            ug ugVar = (ug) atomicReferenceFieldUpdater.get(this);
            while (ugVar != null && ugVar.c()) {
                ugVar = (ug) atomicReferenceFieldUpdater.get(ugVar);
            }
            ug ugVarB2 = b();
            ugVarB2.getClass();
            while (ugVarB2.c() && (ugVarB = ugVarB2.b()) != null) {
                ugVarB2 = ugVarB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(ugVarB2);
                ug ugVar2 = ((ug) obj) == null ? null : ugVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(ugVarB2, obj, ugVar2)) {
                    if (atomicReferenceFieldUpdater.get(ugVarB2) != obj) {
                        break;
                    }
                }
            }
            if (ugVar != null) {
                a.set(ugVar, ugVarB2);
            }
            if (!ugVarB2.c() || ugVarB2.b() == null) {
                if (ugVar == null || !ugVar.c()) {
                    return;
                }
            }
        }
    }
}

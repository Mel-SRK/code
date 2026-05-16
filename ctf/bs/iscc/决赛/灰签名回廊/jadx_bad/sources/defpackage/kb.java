package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class kb extends un0 {
    public final o9 e;
    public final /* synthetic */ AtomicReferenceArray f;

    public kb(long j, kb kbVar, o9 o9Var, int i) {
        super(j, kbVar, i);
        this.e = o9Var;
        this.f = new AtomicReferenceArray(q9.b * 2);
    }

    @Override // defpackage.un0
    public final int f() {
        return q9.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // defpackage.un0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, pj pjVar) {
        int i2 = q9.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f.get(i * 2);
        while (true) {
            Object objK = k(i);
            boolean z2 = objK instanceof w11;
            o9 o9Var = this.e;
            if (z2 || (objK instanceof x11)) {
                if (j(i, objK, z ? q9.j : q9.k)) {
                    m(i, null);
                    l(i, !z);
                    if (z) {
                        o9Var.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objK == q9.j || objK == q9.k) {
                    break;
                }
                if (objK != q9.g && objK != q9.f) {
                    if (objK == q9.i || objK == q9.d || objK == q9.l) {
                        return;
                    }
                    wc.f(objK, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z) {
        if (z) {
            o9 o9Var = this.e;
            o9Var.getClass();
            o9Var.ae((this.c * ((long) q9.b)) + ((long) i));
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void n(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }
}

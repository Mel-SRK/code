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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r5, defpackage.pj r6) {
        /*
            r4 = this;
            int r6 = defpackage.q9.b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.k(r5)
            boolean r1 = r6 instanceof defpackage.w11
            o9 r2 = r4.e
            r3 = 0
            if (r1 != 0) goto L50
            boolean r1 = r6 instanceof defpackage.x11
            if (r1 == 0) goto L21
            goto L50
        L21:
            jq r1 = defpackage.q9.j
            if (r6 == r1) goto L47
            jq r1 = defpackage.q9.k
            if (r6 != r1) goto L2a
            goto L47
        L2a:
            jq r1 = defpackage.q9.g
            if (r6 == r1) goto L11
            jq r1 = defpackage.q9.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            jq r5 = defpackage.q9.i
            if (r6 == r5) goto L6a
            jq r5 = defpackage.q9.d
            if (r6 != r5) goto L3c
            goto L6a
        L3c:
            jq r5 = defpackage.q9.l
            if (r6 != r5) goto L41
            goto L6a
        L41:
            java.lang.String r5 = "unexpected state: "
            defpackage.wc.f(r6, r5)
            return
        L47:
            r4.m(r5, r3)
            if (r0 == 0) goto L6a
            r2.getClass()
            return
        L50:
            if (r0 == 0) goto L55
            jq r1 = defpackage.q9.j
            goto L57
        L55:
            jq r1 = defpackage.q9.k
        L57:
            boolean r6 = r4.j(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.m(r5, r3)
            r6 = r0 ^ 1
            r4.l(r5, r6)
            if (r0 == 0) goto L6a
            r2.getClass()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb.g(int, pj):void");
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

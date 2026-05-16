package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class cb implements sv {
    public final pj d;
    public final int e;
    public final m9 f;
    public final yr g;

    public cb(yr yrVar, pj pjVar, int i, m9 m9Var) {
        this.d = pjVar;
        this.e = i;
        this.f = m9Var;
        this.g = yrVar;
    }

    public abstract cb a(pj pjVar, int i, m9 m9Var);

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    @Override // defpackage.yr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.zr r9, defpackage.ji r10) {
        /*
            r8 = this;
            int r0 = r8.e
            r1 = -3
            yj r2 = defpackage.yj.d
            r3 = 0
            wz0 r4 = defpackage.wz0.a
            if (r0 != r1) goto L73
            pj r0 = r10.e()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            md r5 = new md
            r6 = 8
            r7 = 0
            r5.<init>(r6, r7)
            pj r6 = r8.d
            java.lang.Object r1 = r6.r(r5, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2b
            pj r1 = r0.j(r6)
            goto L30
        L2b:
            r1 = 0
            pj r1 = defpackage.e00.z(r0, r6, r1)
        L30:
            boolean r5 = defpackage.f00.h(r1, r0)
            if (r5 == 0) goto L3f
            ki r10 = (defpackage.ki) r10
            java.lang.Object r9 = r8.e(r9, r10)
            if (r9 != r2) goto L84
            return r9
        L3f:
            bw r5 = defpackage.bw.u
            nj r6 = r1.k(r5)
            nj r0 = r0.k(r5)
            boolean r0 = defpackage.f00.h(r6, r0)
            if (r0 == 0) goto L73
            pj r0 = r10.e()
            boolean r5 = r9 instanceof defpackage.mp0
            if (r5 != 0) goto L62
            boolean r5 = r9 instanceof defpackage.na0
            if (r5 == 0) goto L5c
            goto L62
        L5c:
            es r5 = new es
            r5.<init>(r9, r0)
            r9 = r5
        L62:
            za r0 = new za
            r5 = 1
            r0.<init>(r8, r3, r5)
            java.lang.Object r3 = defpackage.t1.av(r1)
            java.lang.Object r9 = defpackage.m10.ax(r1, r9, r3, r0, r10)
            if (r9 != r2) goto L84
            return r9
        L73:
            w8 r0 = new w8
            r1 = 1
            r0.<init>(r9, r8, r3, r1)
            java.lang.Object r9 = defpackage.i60.y(r0, r10)
            if (r9 != r2) goto L80
            goto L81
        L80:
            r9 = r4
        L81:
            if (r9 != r2) goto L84
            return r9
        L84:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb.b(zr, ji):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // defpackage.sv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yr c(defpackage.pj r5, int r6, defpackage.m9 r7) {
        /*
            r4 = this;
            pj r0 = r4.d
            pj r5 = r5.j(r0)
            m9 r1 = defpackage.m9.d
            m9 r2 = r4.f
            int r3 = r4.e
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = defpackage.f00.h(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            cb r5 = r4.a(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb.c(pj, int, m9):yr");
    }

    public yr d() {
        return null;
    }

    public abstract Object e(zr zrVar, ki kiVar);

    public final String f() {
        ArrayList arrayList = new ArrayList(4);
        pq pqVar = pq.d;
        pj pjVar = this.d;
        if (pjVar != pqVar) {
            arrayList.add("context=" + pjVar);
        }
        int i = this.e;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        m9 m9Var = m9.d;
        m9 m9Var2 = this.f;
        if (m9Var2 != m9Var) {
            arrayList.add("onBufferOverflow=" + m9Var2);
        }
        return getClass().getSimpleName() + '[' + kc.av(arrayList, ", ", null, null, null, 62) + ']';
    }

    public final String toString() {
        return this.g + " -> " + f();
    }
}

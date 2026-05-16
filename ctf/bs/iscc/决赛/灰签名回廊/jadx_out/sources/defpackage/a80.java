package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a80 {
    public final q80 a;

    public static final Object a(q80 q80Var) {
        Object objG = q80Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof m80)) {
            q80Var.j(null);
            return objG;
        }
        m80 m80Var = (m80) objG;
        if (m80Var.g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = m80Var.b - 1;
        Object objE = m80Var.e(i);
        m80Var.j(i);
        objE.getClass();
        if (m80Var.g()) {
            q80Var.j(null);
        }
        if (m80Var.b == 1) {
            q80Var.l(null, m80Var.d());
        }
        return objE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.m80 b(defpackage.q80 r15) {
        /*
            boolean r0 = r15.i()
            if (r0 == 0) goto Lc
            m80 r15 = defpackage.ta0.b
            r15.getClass()
            return r15
        Lc:
            m80 r0 = new m80
            r0.<init>()
            java.lang.Object[] r1 = r15.c
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L84
            r3 = 0
            r4 = r3
        L1c:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L7f
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L36:
            if (r9 >= r7) goto L7d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L79
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof defpackage.m80
            if (r11 == 0) goto L73
            m80 r10 = (defpackage.m80) r10
            boolean r11 = r10.g()
            if (r11 == 0) goto L53
            goto L79
        L53:
            int r11 = r0.b
            int r12 = r10.b
            int r11 = r11 + r12
            java.lang.Object[] r12 = r0.a
            int r13 = r12.length
            if (r13 >= r11) goto L60
            r0.l(r11, r12)
        L60:
            java.lang.Object[] r11 = r0.a
            java.lang.Object[] r12 = r10.a
            int r13 = r0.b
            int r14 = r10.b
            defpackage.h7.au(r12, r11, r13, r3, r14)
            int r11 = r0.b
            int r10 = r10.b
            int r11 = r11 + r10
            r0.b = r11
            goto L79
        L73:
            r10.getClass()
            r0.a(r10)
        L79:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L7d:
            if (r7 != r8) goto L84
        L7f:
            if (r4 == r2) goto L84
            int r4 = r4 + 1
            goto L1c
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a80.b(q80):m80");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a80) {
            return this.a.equals(((a80) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}

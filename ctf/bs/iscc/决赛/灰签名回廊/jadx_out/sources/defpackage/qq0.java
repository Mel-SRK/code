package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qq0 extends i70 implements l20 {
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;

    @Override // defpackage.l20
    public final int aj(j50 j50Var, k60 k60Var, int i) {
        long jBu = bu(j50Var);
        return dh.f(jBu) ? dh.h(jBu) : eh.g(jBu, k60Var.ap(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long bu(defpackage.r60 r8) {
        /*
            r7 = this;
            float r0 = r7.t
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = defpackage.mn.a(r0, r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L18
            float r0 = r7.t
            int r0 = r8.ai(r0)
            if (r0 >= 0) goto L19
            r0 = r3
            goto L19
        L18:
            r0 = r2
        L19:
            float r4 = r7.u
            boolean r4 = defpackage.mn.a(r4, r1)
            if (r4 != 0) goto L2b
            float r4 = r7.u
            int r4 = r8.ai(r4)
            if (r4 >= 0) goto L2c
            r4 = r3
            goto L2c
        L2b:
            r4 = r2
        L2c:
            float r5 = r7.r
            boolean r5 = defpackage.mn.a(r5, r1)
            if (r5 != 0) goto L43
            float r5 = r7.r
            int r5 = r8.ai(r5)
            if (r5 <= r0) goto L3d
            r5 = r0
        L3d:
            if (r5 >= 0) goto L40
            r5 = r3
        L40:
            if (r5 == r2) goto L43
            goto L44
        L43:
            r5 = r3
        L44:
            float r6 = r7.s
            boolean r1 = defpackage.mn.a(r6, r1)
            if (r1 != 0) goto L5b
            float r1 = r7.s
            int r8 = r8.ai(r1)
            if (r8 <= r4) goto L55
            r8 = r4
        L55:
            if (r8 >= 0) goto L58
            r8 = r3
        L58:
            if (r8 == r2) goto L5b
            r3 = r8
        L5b:
            long r0 = defpackage.eh.a(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq0.bu(r60):long");
    }

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jBu = bu(r60Var);
        if (this.v) {
            jA = eh.e(j, jBu);
        } else {
            if (mn.a(this.r, Float.NaN)) {
                iJ = dh.j(j);
                int iH2 = dh.h(jBu);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = dh.j(jBu);
            }
            if (mn.a(this.t, Float.NaN)) {
                iH = dh.h(j);
                int iJ2 = dh.j(jBu);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = dh.h(jBu);
            }
            if (mn.a(this.s, Float.NaN)) {
                i = dh.i(j);
                int iG2 = dh.g(jBu);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = dh.i(jBu);
            }
            if (mn.a(this.u, Float.NaN)) {
                iG = dh.g(j);
                int i2 = dh.i(jBu);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = dh.g(jBu);
            }
            jA = eh.a(iJ, iH, i, iG);
        }
        lf0 lf0VarE = k60Var.e(jA);
        return r60Var.av(lf0VarE.d, lf0VarE.e, sq.d, new d4(lf0VarE, 5));
    }

    @Override // defpackage.l20
    public final int f(j50 j50Var, k60 k60Var, int i) {
        long jBu = bu(j50Var);
        return dh.f(jBu) ? dh.h(jBu) : eh.g(jBu, k60Var.aw(i));
    }

    @Override // defpackage.l20
    public final int n(j50 j50Var, k60 k60Var, int i) {
        long jBu = bu(j50Var);
        return dh.e(jBu) ? dh.g(jBu) : eh.f(jBu, k60Var.f(i));
    }

    @Override // defpackage.l20
    public final int z(j50 j50Var, k60 k60Var, int i) {
        long jBu = bu(j50Var);
        return dh.e(jBu) ? dh.g(jBu) : eh.f(jBu, k60Var.ax(i));
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ks0 extends tt0 implements hv {
    public int h;
    public /* synthetic */ zr i;
    public /* synthetic */ int j;
    public final /* synthetic */ ls0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(ls0 ls0Var, ji jiVar) {
        super(3, jiVar);
        this.k = ls0Var;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        ks0 ks0Var = new ks0(this.k, (ji) obj3);
        ks0Var.i = (zr) obj;
        ks0Var.j = iIntValue;
        return ks0Var.o(wz0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0.i(defpackage.jq0.d, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r0.i(defpackage.jq0.f, r7) != r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[PHI: r0
      0x0061: PHI (r0v3 zr) = (r0v2 zr), (r0v6 zr) binds: [B:25:0x005e, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[PHI: r0
      0x0071: PHI (r0v4 zr) = (r0v3 zr), (r0v7 zr) binds: [B:28:0x006e, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.h
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            yj r6 = defpackage.yj.d
            if (r0 == 0) goto L33
            if (r0 == r5) goto L2f
            if (r0 == r4) goto L29
            if (r0 == r3) goto L23
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L16
            goto L2f
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r8)
            r8 = 0
            return r8
        L1d:
            zr r0 = r7.i
            defpackage.i60.az(r8)
            goto L71
        L23:
            zr r0 = r7.i
            defpackage.i60.az(r8)
            goto L61
        L29:
            zr r0 = r7.i
            defpackage.i60.az(r8)
            goto L54
        L2f:
            defpackage.i60.az(r8)
            goto L7f
        L33:
            defpackage.i60.az(r8)
            zr r0 = r7.i
            int r8 = r7.j
            if (r8 <= 0) goto L47
            r7.h = r5
            jq0 r8 = defpackage.jq0.d
            java.lang.Object r8 = r0.i(r8, r7)
            if (r8 != r6) goto L7f
            goto L7e
        L47:
            r7.i = r0
            r7.h = r4
            r4 = 0
            java.lang.Object r8 = defpackage.t1.l(r4, r7)
            if (r8 != r6) goto L54
            goto L7e
        L54:
            r7.i = r0
            r7.h = r3
            jq0 r8 = defpackage.jq0.e
            java.lang.Object r8 = r0.i(r8, r7)
            if (r8 != r6) goto L61
            goto L7e
        L61:
            r7.i = r0
            r7.h = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = defpackage.t1.l(r2, r7)
            if (r8 != r6) goto L71
            goto L7e
        L71:
            r8 = 0
            r7.i = r8
            r7.h = r1
            jq0 r8 = defpackage.jq0.f
            java.lang.Object r8 = r0.i(r8, r7)
            if (r8 != r6) goto L7f
        L7e:
            return r6
        L7f:
            wz0 r8 = defpackage.wz0.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks0.o(java.lang.Object):java.lang.Object");
    }
}

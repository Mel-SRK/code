package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fs extends tt0 implements hv {
    public int h;
    public /* synthetic */ zr i;
    public /* synthetic */ Object j;
    public final /* synthetic */ j3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(j3 j3Var, ji jiVar) {
        super(3, jiVar);
        this.k = j3Var;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        fs fsVar = new fs(this.k, (ji) obj3);
        fsVar.i = (zr) obj;
        fsVar.j = obj2;
        return fsVar.o(wz0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r0.i(r5, r4) == r3) goto L15;
     */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.h
            r1 = 2
            r2 = 1
            yj r3 = defpackage.yj.d
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.i60.az(r5)
            goto L3d
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r5)
            r5 = 0
            return r5
        L17:
            zr r0 = r4.i
            defpackage.i60.az(r5)
            goto L31
        L1d:
            defpackage.i60.az(r5)
            zr r0 = r4.i
            java.lang.Object r5 = r4.j
            r4.i = r0
            r4.h = r2
            j3 r2 = r4.k
            java.lang.Object r5 = r2.f(r5, r4)
            if (r5 != r3) goto L31
            goto L3c
        L31:
            r2 = 0
            r4.i = r2
            r4.h = r1
            java.lang.Object r5 = r0.i(r5, r4)
            if (r5 != r3) goto L3d
        L3c:
            return r3
        L3d:
            wz0 r5 = defpackage.wz0.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fs.o(java.lang.Object):java.lang.Object");
    }
}

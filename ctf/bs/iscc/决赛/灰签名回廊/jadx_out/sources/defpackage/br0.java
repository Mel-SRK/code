package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class br0 extends rj0 implements gv {
    public long[] f;
    public int g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(cr0 cr0Var, ji jiVar) {
        super(jiVar);
        this.k = cr0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((br0) k((ji) obj2, (op0) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        br0 br0Var = new br0(this.k, jiVar);
        br0Var.j = obj;
        return br0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007f -> B:26:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            cr0 r1 = r0.k
            long r2 = r1.d
            long r4 = r1.f
            long r6 = r1.e
            int r8 = r0.i
            r9 = 0
            r12 = 3
            r13 = 2
            r14 = 64
            r16 = 0
            r18 = 1
            r10 = 1
            yj r11 = defpackage.yj.d
            if (r8 == 0) goto L4c
            if (r8 == r10) goto L3d
            if (r8 == r13) goto L33
            if (r8 != r12) goto L2c
            int r1 = r0.g
            java.lang.Object r6 = r0.j
            op0 r6 = (defpackage.op0) r6
            defpackage.i60.az(r23)
            r7 = r12
            goto Lbe
        L2c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r1)
            r1 = 0
            return r1
        L33:
            int r1 = r0.g
            java.lang.Object r8 = r0.j
            op0 r8 = (defpackage.op0) r8
            defpackage.i60.az(r23)
            goto L94
        L3d:
            int r1 = r0.h
            int r8 = r0.g
            long[] r15 = r0.f
            java.lang.Object r12 = r0.j
            op0 r12 = (defpackage.op0) r12
            defpackage.i60.az(r23)
            int r8 = r8 + r10
            goto L5a
        L4c:
            defpackage.i60.az(r23)
            java.lang.Object r8 = r0.j
            r12 = r8
            op0 r12 = (defpackage.op0) r12
            long[] r15 = r1.g
            if (r15 == 0) goto L71
            int r1 = r15.length
            r8 = 0
        L5a:
            if (r8 >= r1) goto L71
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.j = r12
            r0.f = r15
            r0.g = r8
            r0.h = r1
            r0.i = r10
            r12.b(r4, r0)
            return r11
        L71:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L97
            r8 = r12
            r1 = 0
        L77:
            if (r1 >= r14) goto L96
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r12 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r12 == 0) goto L94
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.j = r8
            r0.f = r9
            r0.g = r1
            r0.i = r13
            r8.b(r2, r0)
            return r11
        L94:
            int r1 = r1 + r10
            goto L77
        L96:
            r12 = r8
        L97:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            r6 = r12
            r15 = 0
        L9d:
            if (r15 >= r14) goto Lc1
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbc
            long r1 = (long) r15
            long r4 = r4 + r1
            long r1 = (long) r14
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.j = r6
            r0.f = r9
            r0.g = r15
            r7 = 3
            r0.i = r7
            r6.b(r1, r0)
            return r11
        Lbc:
            r7 = 3
            r1 = r15
        Lbe:
            int r15 = r1 + 1
            goto L9d
        Lc1:
            wz0 r1 = defpackage.wz0.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br0.o(java.lang.Object):java.lang.Object");
    }
}

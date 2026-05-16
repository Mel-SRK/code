package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qn0 extends tt0 implements gv {
    public long h;
    public int i;
    public /* synthetic */ long j;
    public final /* synthetic */ rn0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn0(rn0 rn0Var, ji jiVar) {
        super(2, jiVar);
        this.k = rn0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        long j = ((o01) obj).a;
        qn0 qn0Var = new qn0(this.k, (ji) obj2);
        qn0Var.j = j;
        return qn0Var.o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        qn0 qn0Var = new qn0(this.k, jiVar);
        qn0Var.j = ((o01) obj).a;
        return qn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.i
            r1 = 3
            r2 = 2
            r3 = 1
            rn0 r4 = r14.k
            yj r5 = defpackage.yj.d
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L28
            if (r0 == r2) goto L20
            if (r0 != r1) goto L19
            long r0 = r14.h
            long r2 = r14.j
            defpackage.i60.az(r15)
            goto L70
        L19:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r15)
            r15 = 0
            return r15
        L20:
            long r2 = r14.h
            long r6 = r14.j
            defpackage.i60.az(r15)
            goto L56
        L28:
            long r6 = r14.j
            defpackage.i60.az(r15)
            goto L40
        L2e:
            defpackage.i60.az(r15)
            long r6 = r14.j
            a0 r15 = r4.f
            r14.j = r6
            r14.i = r3
            java.lang.Object r15 = r15.c(r6, r14)
            if (r15 != r5) goto L40
            goto L6d
        L40:
            o01 r15 = (defpackage.o01) r15
            long r8 = r15.a
            long r8 = defpackage.o01.d(r6, r8)
            r14.j = r6
            r14.h = r8
            r14.i = r2
            java.lang.Object r15 = r4.b(r8, r14)
            if (r15 != r5) goto L55
            goto L6d
        L55:
            r2 = r8
        L56:
            o01 r15 = (defpackage.o01) r15
            long r11 = r15.a
            a0 r8 = r4.f
            long r9 = defpackage.o01.d(r2, r11)
            r14.j = r6
            r14.h = r11
            r14.i = r1
            r13 = r14
            java.lang.Object r15 = r8.b(r9, r11, r13)
            if (r15 != r5) goto L6e
        L6d:
            return r5
        L6e:
            r2 = r6
            r0 = r11
        L70:
            o01 r15 = (defpackage.o01) r15
            long r4 = r15.a
            long r0 = defpackage.o01.d(r0, r4)
            long r0 = defpackage.o01.d(r2, r0)
            o01 r15 = new o01
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn0.o(java.lang.Object):java.lang.Object");
    }
}

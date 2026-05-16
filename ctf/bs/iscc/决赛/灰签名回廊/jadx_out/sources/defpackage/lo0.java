package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lo0 extends tt0 implements gv {
    public final /* synthetic */ int h = 1;
    public int i;
    public final /* synthetic */ long j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(long j, yt0 yt0Var, ji jiVar) {
        super(2, jiVar);
        this.j = j;
        this.k = yt0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
        }
        return ((lo0) k(jiVar, xjVar)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new lo0((j5) this.k, this.j, jiVar);
            default:
                return new lo0(this.j, (yt0) this.k, jiVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.h
            switch(r0) {
                case 0: goto L53;
                default: goto L5;
            }
        L5:
            int r0 = r10.i
            r1 = 8
            long r3 = r10.j
            r5 = 2
            r6 = 1
            yj r7 = defpackage.yj.d
            if (r0 == 0) goto L24
            if (r0 == r6) goto L20
            if (r0 != r5) goto L19
            defpackage.i60.az(r11)
            goto L3b
        L19:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r11)
            r7 = 0
            goto L52
        L20:
            defpackage.i60.az(r11)
            goto L32
        L24:
            defpackage.i60.az(r11)
            long r8 = r3 - r1
            r10.i = r6
            java.lang.Object r11 = defpackage.t1.l(r8, r10)
            if (r11 != r7) goto L32
            goto L52
        L32:
            r10.i = r5
            java.lang.Object r11 = defpackage.t1.l(r1, r10)
            if (r11 != r7) goto L3b
            goto L52
        L3b:
            java.lang.Object r11 = r10.k
            yt0 r11 = (defpackage.yt0) r11
            la r11 = r11.f
            if (r11 == 0) goto L50
            kg0 r0 = new kg0
            r0.<init>(r3)
            sj0 r1 = new sj0
            r1.<init>(r0)
            r11.h(r1)
        L50:
            wz0 r7 = defpackage.wz0.a
        L52:
            return r7
        L53:
            int r0 = r10.i
            r1 = 1
            if (r0 == 0) goto L65
            if (r0 != r1) goto L5e
            defpackage.i60.az(r11)
            goto L81
        L5e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r11)
            r11 = 0
            goto L83
        L65:
            defpackage.i60.az(r11)
            java.lang.Object r11 = r10.k
            j5 r11 = (defpackage.j5) r11
            xa0 r0 = new xa0
            long r2 = r10.j
            r0.<init>(r2)
            es0 r2 = defpackage.mo0.d
            r10.i = r1
            java.lang.Object r11 = defpackage.j5.b(r11, r0, r2, r10)
            yj r0 = defpackage.yj.d
            if (r11 != r0) goto L81
            r11 = r0
            goto L83
        L81:
            wz0 r11 = defpackage.wz0.a
        L83:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(j5 j5Var, long j, ji jiVar) {
        super(2, jiVar);
        this.k = j5Var;
        this.j = j;
    }
}

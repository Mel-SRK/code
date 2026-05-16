package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ho extends tt0 implements gv {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ in0 j;
    public final /* synthetic */ tg0 k;
    public final /* synthetic */ jo l;
    public final /* synthetic */ a2 m;
    public final /* synthetic */ io n;
    public final /* synthetic */ io o;
    public final /* synthetic */ y1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(in0 in0Var, tg0 tg0Var, jo joVar, a2 a2Var, io ioVar, io ioVar2, y1 y1Var, ji jiVar) {
        super(2, jiVar);
        this.j = in0Var;
        this.k = tg0Var;
        this.l = joVar;
        this.m = a2Var;
        this.n = ioVar;
        this.o = ioVar2;
        this.p = y1Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((ho) k((ji) obj2, (xj) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        ho hoVar = new ho(this.j, this.k, this.l, this.m, this.n, this.o, this.p, jiVar);
        hoVar.i = obj;
        return hoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.h
            wz0 r1 = defpackage.wz0.a
            in0 r2 = r12.j
            r3 = 1
            if (r0 == 0) goto L1e
            if (r0 != r3) goto L17
            java.lang.Object r0 = r12.i
            r3 = r0
            xj r3 = (defpackage.xj) r3
            defpackage.i60.az(r13)     // Catch: java.util.concurrent.CancellationException -> L14
            goto L5f
        L14:
            r0 = move-exception
        L15:
            r13 = r0
            goto L50
        L17:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r13)
            r13 = 0
            return r13
        L1e:
            defpackage.i60.az(r13)
            java.lang.Object r13 = r12.i
            xj r13 = (defpackage.xj) r13
            wc0 r6 = r2.t     // Catch: java.util.concurrent.CancellationException -> L4e
            tg0 r0 = r12.k     // Catch: java.util.concurrent.CancellationException -> L4e
            jo r7 = r12.l     // Catch: java.util.concurrent.CancellationException -> L4e
            a2 r10 = r12.m     // Catch: java.util.concurrent.CancellationException -> L4e
            io r9 = r12.n     // Catch: java.util.concurrent.CancellationException -> L4e
            io r5 = r12.o     // Catch: java.util.concurrent.CancellationException -> L4e
            y1 r8 = r12.p     // Catch: java.util.concurrent.CancellationException -> L4e
            r12.i = r13     // Catch: java.util.concurrent.CancellationException -> L4e
            r12.h = r3     // Catch: java.util.concurrent.CancellationException -> L4e
            float r3 = defpackage.go.a     // Catch: java.util.concurrent.CancellationException -> L4e
            eo r4 = new eo     // Catch: java.util.concurrent.CancellationException -> L4e
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L4e
            java.lang.Object r13 = defpackage.f00.k(r0, r4, r12)     // Catch: java.util.concurrent.CancellationException -> L4e
            yj r0 = defpackage.yj.d
            if (r13 != r0) goto L48
            goto L49
        L48:
            r13 = r1
        L49:
            if (r13 != r0) goto L5f
            return r0
        L4c:
            r3 = r13
            goto L15
        L4e:
            r0 = move-exception
            goto L4c
        L50:
            o9 r0 = r2.x
            if (r0 == 0) goto L59
            tn r2 = defpackage.tn.a
            r0.u(r2)
        L59:
            boolean r0 = defpackage.i60.al(r3)
            if (r0 == 0) goto L60
        L5f:
            return r1
        L60:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho.o(java.lang.Object):java.lang.Object");
    }
}

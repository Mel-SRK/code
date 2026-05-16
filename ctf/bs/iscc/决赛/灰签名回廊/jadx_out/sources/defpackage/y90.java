package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y90 extends i70 implements sy0 {
    public final en0 r;
    public final a0 s;
    public y90 t;
    public final String u = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public y90(en0 en0Var, a0 a0Var) {
        this.r = en0Var;
        this.s = a0Var;
    }

    @Override // defpackage.i70
    public final void bm() {
        a0 a0Var = this.s;
        a0Var.a = this;
        a0Var.b = null;
        this.t = null;
        a0Var.c = new b(15, this);
        a0Var.d = bi();
    }

    @Override // defpackage.i70
    public final void bn() {
        xi0 xi0Var = new xi0();
        lI.m(this, new t0(xi0Var, 2));
        y90 y90Var = (y90) ((sy0) xi0Var.d);
        this.t = y90Var;
        a0 a0Var = this.s;
        a0Var.b = y90Var;
        if (((y90) a0Var.a) == this) {
            a0Var.a = null;
        }
    }

    public final xj bu() {
        y90 y90Var = this.q ? (y90) lI.g(this) : null;
        xj xjVarBu = y90Var != null ? y90Var.bu() : null;
        if (xjVarBu != null && i60.al(xjVarBu)) {
            return xjVarBu;
        }
        xj xjVar = (xj) this.s.d;
        if (xjVar != null) {
            return xjVar;
        }
        wc.q("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bv(long r13, long r15, defpackage.ki r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.w90
            if (r1 == 0) goto L16
            r1 = r0
            w90 r1 = (defpackage.w90) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.k = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            w90 r1 = new w90
            r1.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.i
            int r1 = r7.k
            r8 = 2
            r2 = 1
            yj r9 = defpackage.yj.d
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L37
            if (r1 != r8) goto L30
            long r1 = r7.g
            defpackage.i60.az(r0)
            goto L84
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r0)
            r0 = 0
            return r0
        L37:
            long r1 = r7.h
            long r3 = r7.g
            defpackage.i60.az(r0)
            goto L55
        L3f:
            defpackage.i60.az(r0)
            r7.g = r13
            r5 = r15
            r7.h = r5
            r7.k = r2
            en0 r2 = r12.r
            r3 = r13
            java.lang.Object r0 = r2.a(r3, r5, r7)
            if (r0 != r9) goto L53
            goto L82
        L53:
            r3 = r13
            r1 = r15
        L55:
            o01 r0 = (defpackage.o01) r0
            long r10 = r0.a
            boolean r0 = r12.q
            if (r0 == 0) goto L6a
            r5 = 0
            if (r0 == 0) goto L6c
            if (r0 == 0) goto L6c
            sy0 r0 = defpackage.lI.g(r12)
            r5 = r0
            y90 r5 = (defpackage.y90) r5
            goto L6c
        L6a:
            y90 r5 = r12.t
        L6c:
            if (r5 == 0) goto L8a
            long r3 = defpackage.o01.e(r3, r10)
            long r0 = defpackage.o01.d(r1, r10)
            r7.g = r10
            r7.k = r8
            r2 = r5
            r5 = r0
            java.lang.Object r0 = r2.bv(r3, r5, r7)
            if (r0 != r9) goto L83
        L82:
            return r9
        L83:
            r1 = r10
        L84:
            o01 r0 = (defpackage.o01) r0
            long r3 = r0.a
            r10 = r1
            goto L8c
        L8a:
            r3 = 0
        L8c:
            long r0 = defpackage.o01.e(r10, r3)
            o01 r2 = new o01
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y90.bv(long, long, ki):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long bw(long r15, long r17, int r19) {
        /*
            r14 = this;
            r0 = r17
            en0 r2 = r14.r
            boolean r3 = r2.b
            r4 = 0
            if (r3 == 0) goto L2c
            rn0 r2 = r2.a
            jn0 r3 = r2.a
            boolean r3 = r3.b()
            if (r3 == 0) goto L15
            goto L2c
        L15:
            jn0 r3 = r2.a
            float r6 = r2.f(r0)
            float r6 = r2.c(r6)
            float r3 = r3.d(r6)
            float r3 = r2.c(r3)
            long r2 = r2.g(r3)
            goto L2d
        L2c:
            r2 = r4
        L2d:
            boolean r6 = r14.q
            r7 = 0
            if (r6 == 0) goto L3b
            if (r6 == 0) goto L3b
            sy0 r6 = defpackage.lI.g(r14)
            r7 = r6
            y90 r7 = (defpackage.y90) r7
        L3b:
            r8 = r7
            if (r8 == 0) goto L4d
            r6 = r15
            long r9 = defpackage.xa0.g(r6, r2)
            long r11 = defpackage.xa0.f(r0, r2)
            r13 = r19
            long r4 = r8.bw(r9, r11, r13)
        L4d:
            long r0 = defpackage.xa0.g(r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y90.bw(long, long, int):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r14 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r14 != r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bx(long r12, defpackage.ji r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.x90
            if (r0 == 0) goto L13
            r0 = r14
            x90 r0 = (defpackage.x90) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L1a
        L13:
            x90 r0 = new x90
            ki r14 = (defpackage.ki) r14
            r0.<init>(r11, r14)
        L1a:
            java.lang.Object r14 = r0.h
            int r1 = r0.j
            r2 = 0
            r4 = 2
            r5 = 1
            yj r6 = defpackage.yj.d
            if (r1 == 0) goto L3d
            if (r1 == r5) goto L37
            if (r1 != r4) goto L30
            long r12 = r0.g
            defpackage.i60.az(r14)
            goto L74
        L30:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r12)
            r12 = 0
            return r12
        L37:
            long r12 = r0.g
            defpackage.i60.az(r14)
            goto L5b
        L3d:
            defpackage.i60.az(r14)
            boolean r14 = r11.q
            r1 = 0
            if (r14 == 0) goto L4e
            if (r14 == 0) goto L4e
            sy0 r14 = defpackage.lI.g(r11)
            r1 = r14
            y90 r1 = (defpackage.y90) r1
        L4e:
            if (r1 == 0) goto L63
            r0.g = r12
            r0.j = r5
            java.lang.Object r14 = r1.bx(r12, r0)
            if (r14 != r6) goto L5b
            goto L73
        L5b:
            o01 r14 = (defpackage.o01) r14
            long r7 = r14.a
            r9 = r7
            r7 = r12
            r12 = r9
            goto L65
        L63:
            r7 = r12
            r12 = r2
        L65:
            defpackage.o01.d(r7, r12)
            r0.g = r12
            r0.j = r4
            o01 r14 = new o01
            r14.<init>(r2)
            if (r14 != r6) goto L74
        L73:
            return r6
        L74:
            o01 r14 = (defpackage.o01) r14
            long r0 = r14.a
            long r12 = defpackage.o01.e(r12, r0)
            o01 r14 = new o01
            r14.<init>(r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y90.bx(long, ji):java.lang.Object");
    }

    public final long bz(long j, int i) {
        boolean z = this.q;
        y90 y90Var = null;
        if (z && z) {
            y90Var = (y90) lI.g(this);
        }
        long jBz = y90Var != null ? y90Var.bz(j, i) : 0L;
        xa0.f(j, jBz);
        return xa0.g(jBz, 0L);
    }

    @Override // defpackage.sy0
    public final Object p() {
        return this.u;
    }
}

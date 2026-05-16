package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yt0 implements em, ji {
    public final /* synthetic */ zt0 d;
    public final la e;
    public la f;
    public jg0 g = jg0.e;
    public final pq h = pq.d;
    public final /* synthetic */ zt0 i;

    public yt0(zt0 zt0Var, la laVar) {
        this.i = zt0Var;
        this.d = zt0Var;
        this.e = laVar;
    }

    public final Object a(jg0 jg0Var, s7 s7Var) {
        la laVar = new la(1, f00.x(s7Var));
        laVar.t();
        this.g = jg0Var;
        this.f = laVar;
        return laVar.s();
    }

    @Override // defpackage.em
    public final float ae(long j) {
        return this.d.ae(j);
    }

    @Override // defpackage.em
    public final int ai(float f) {
        return this.d.ai(f);
    }

    @Override // defpackage.em
    public final long aq(long j) {
        return this.d.aq(j);
    }

    @Override // defpackage.em
    public final float au(long j) {
        return this.d.au(j);
    }

    @Override // defpackage.em
    public final float b() {
        return this.d.b();
    }

    @Override // defpackage.em
    public final long ba(float f) {
        return this.d.ba(f);
    }

    @Override // defpackage.em
    public final float be(int i) {
        return this.d.be(i);
    }

    @Override // defpackage.em
    public final float bg(float f) {
        return f / this.d.b();
    }

    public final long d() {
        zt0 zt0Var = this.i;
        long jAq = zt0Var.aq(pk.ay(zt0Var).ab.g());
        long j = zt0Var.ab;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jAq >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jAq & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // defpackage.ji
    public final pj e() {
        return this.h;
    }

    public final i11 f() {
        return pk.ay(this.i).ab;
    }

    @Override // defpackage.ji
    public final void h(Object obj) {
        zt0 zt0Var = this.i;
        synchronized (zt0Var.y) {
            zt0Var.x.i(this);
        }
        this.e.h(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [t00] */
    /* JADX WARN: Type inference failed for: r6v4, types: [t00] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [gv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r6, defpackage.gv r8, defpackage.s7 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.xt0
            if (r0 == 0) goto L13
            r0 = r9
            xt0 r0 = (defpackage.xt0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            xt0 r0 = new xt0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.h
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            hs0 r6 = r0.g
            defpackage.i60.az(r9)     // Catch: java.lang.Throwable -> L27
            goto L68
        L27:
            r7 = move-exception
            goto L6e
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r6)
            r6 = 0
            return r6
        L30:
            defpackage.i60.az(r9)
            r3 = 0
            int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r9 > 0) goto L4a
            la r9 = r5.f
            if (r9 == 0) goto L4a
            kg0 r1 = new kg0
            r1.<init>(r6)
            sj0 r3 = new sj0
            r3.<init>(r1)
            r9.h(r3)
        L4a:
            zt0 r9 = r5.i
            xj r9 = r9.bi()
            lo0 r1 = new lo0
            r3 = 0
            r1.<init>(r6, r5, r3)
            r6 = 3
            hs0 r6 = defpackage.i60.an(r9, r3, r1, r6)
            r0.g = r6     // Catch: java.lang.Throwable -> L27
            r0.j = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = r8.f(r5, r0)     // Catch: java.lang.Throwable -> L27
            yj r7 = defpackage.yj.d
            if (r9 != r7) goto L68
            return r7
        L68:
            ia r7 = defpackage.ia.e
            r6.a(r7)
            return r9
        L6e:
            ia r8 = defpackage.ia.e
            r6.a(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt0.i(long, gv, s7):java.lang.Object");
    }

    @Override // defpackage.em
    public final float k() {
        return this.d.k();
    }

    @Override // defpackage.em
    public final long v(float f) {
        return this.d.v(f);
    }

    @Override // defpackage.em
    public final long w(long j) {
        return this.d.w(j);
    }

    @Override // defpackage.em
    public final float x(float f) {
        return this.d.b() * f;
    }
}

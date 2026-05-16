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
    */
    public final Object i(long j, gv gvVar, s7 s7Var) {
        xt0 xt0Var;
        la laVar;
        if (s7Var instanceof xt0) {
            xt0Var = (xt0) s7Var;
            int i = xt0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                xt0Var.j = i - Integer.MIN_VALUE;
            } else {
                xt0Var = new xt0(this, s7Var);
            }
        }
        Object objF = xt0Var.h;
        int i2 = xt0Var.j;
        try {
            if (i2 == 0) {
                i60.az(objF);
                if (j <= 0 && (laVar = this.f) != null) {
                    laVar.h(new sj0(new kg0(j)));
                }
                hs0 hs0VarAn = i60.an(this.i.bi(), null, new lo0((long) j, this, (ji) null), 3);
                xt0Var.g = hs0VarAn;
                xt0Var.j = 1;
                objF = gvVar.f(this, xt0Var);
                yj yjVar = yj.d;
                j = hs0VarAn;
                if (objF == yjVar) {
                    return yjVar;
                }
            } else {
                if (i2 != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hs0 hs0Var = xt0Var.g;
                i60.az(objF);
                j = hs0Var;
            }
            return objF;
        } finally {
            j.a(ia.e);
        }
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

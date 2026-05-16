package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u20 implements xo {
    public final ra d = new ra();
    public wo e;

    public final void a() {
        ra raVar = this.d;
        oa oaVarO = raVar.e.o();
        ql qlVar = this.e;
        if (qlVar == null) {
            throw n5.f("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        i70 i70Var = (i70) qlVar;
        i70 i70VarM = i70Var.d.i;
        if (i70VarM == null || (i70VarM.g & 4) == 0) {
            i70VarM = null;
        } else {
            while (i70VarM != null) {
                int i = i70VarM.f;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    i70VarM = i70VarM.i;
                }
            }
            i70VarM = null;
        }
        if (i70VarM == null) {
            fa0 fa0VarAw = pk.aw(qlVar, 4);
            if (fa0VarAw.D() == i70Var.d) {
                fa0VarAw = fa0VarAw.s;
                fa0VarAw.getClass();
            }
            fa0VarAw.S(oaVarO, (jw) raVar.e.b);
            return;
        }
        a90 a90Var = null;
        while (i70VarM != null) {
            if (i70VarM instanceof wo) {
                wo woVar = (wo) i70VarM;
                jw jwVar = (jw) raVar.e.b;
                fa0 fa0VarAw2 = pk.aw(woVar, 4);
                long jAn = e00.an(fa0VarAw2.f);
                s20 s20Var = fa0VarAw2.r;
                s20Var.getClass();
                t1.as(s20Var).getSharedDrawScope().d(oaVarO, jAn, fa0VarAw2, woVar, jwVar);
            } else if ((i70VarM.f & 4) != 0 && (i70VarM instanceof rl)) {
                int i2 = 0;
                for (i70 i70Var2 = ((rl) i70VarM).s; i70Var2 != null; i70Var2 = i70Var2.i) {
                    if ((i70Var2.f & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            i70VarM = i70Var2;
                        } else {
                            if (a90Var == null) {
                                a90Var = new a90(new i70[16]);
                            }
                            if (i70VarM != null) {
                                a90Var.b(i70VarM);
                                i70VarM = null;
                            }
                            a90Var.b(i70Var2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            i70VarM = pk.m(a90Var);
        }
    }

    @Override // defpackage.xo
    public final o6 aa() {
        return this.d.e;
    }

    @Override // defpackage.em
    public final float ae(long j) {
        return this.d.ae(j);
    }

    @Override // defpackage.xo
    public final void ah(long j, long j2, long j3, int i) {
        this.d.ah(j, j2, j3, i);
    }

    @Override // defpackage.em
    public final int ai(float f) {
        return this.d.ai(f);
    }

    @Override // defpackage.xo
    public final long an() {
        return this.d.an();
    }

    @Override // defpackage.xo
    public final void ao(t3 t3Var, long j, yo yoVar) {
        this.d.ao(t3Var, j, yoVar);
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

    @Override // defpackage.xo
    public final long c() {
        return this.d.c();
    }

    public final void d(oa oaVar, long j, fa0 fa0Var, wo woVar, jw jwVar) {
        wo woVar2 = this.e;
        this.e = woVar;
        e20 e20Var = fa0Var.r.aa;
        ra raVar = this.d;
        o6 o6Var = raVar.e;
        qa qaVar = ((ra) o6Var.c).d;
        em emVar = qaVar.a;
        e20 e20Var2 = qaVar.b;
        oa oaVarO = o6Var.o();
        o6 o6Var2 = raVar.e;
        long jR = o6Var2.r();
        jw jwVar2 = (jw) o6Var2.b;
        o6Var2.z(fa0Var);
        o6Var2.aa(e20Var);
        o6Var2.y(oaVar);
        o6Var2.ab(j);
        o6Var2.b = jwVar;
        oaVar.l();
        try {
            woVar.d(this);
            oaVar.i();
            o6Var2.z(emVar);
            o6Var2.aa(e20Var2);
            o6Var2.y(oaVarO);
            o6Var2.ab(jR);
            o6Var2.b = jwVar2;
            this.e = woVar2;
        } catch (Throwable th) {
            oaVar.i();
            o6Var2.z(emVar);
            o6Var2.aa(e20Var2);
            o6Var2.y(oaVarO);
            o6Var2.ab(jR);
            o6Var2.b = jwVar2;
            throw th;
        }
    }

    @Override // defpackage.xo
    public final void g(t3 t3Var, i9 i9Var, float f, yo yoVar, int i) {
        this.d.g(t3Var, i9Var, f, yoVar, i);
    }

    public final e20 getLayoutDirection() {
        return this.d.d.b;
    }

    @Override // defpackage.em
    public final float k() {
        return this.d.k();
    }

    @Override // defpackage.xo
    public final void q(float f, long j, long j2) {
        this.d.q(f, j, j2);
    }

    @Override // defpackage.xo
    public final void u(long j, long j2, long j3, long j4) {
        this.d.u(j, j2, j3, j4);
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

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m50 implements d20 {
    public final l50 d;

    public m50(l50 l50Var) {
        this.d = l50Var;
    }

    public final long a() {
        l50 l50Var = this.d;
        l50 l50VarAj = pk.aj(l50Var);
        return xa0.f(b(l50VarAj.u, 0L), l50Var.r.M(l50VarAj.r, 0L));
    }

    @Override // defpackage.d20
    public final long ad(long j) {
        return xa0.g(this.d.r.ad(j), a());
    }

    @Override // defpackage.d20
    public final boolean af() {
        return this.d.r.D().q;
    }

    @Override // defpackage.d20
    public final void ag(float[] fArr) {
        this.d.r.ag(fArr);
    }

    @Override // defpackage.d20
    public final void aj(d20 d20Var, float[] fArr) {
        this.d.r.aj(d20Var, fArr);
    }

    @Override // defpackage.d20
    public final ri0 ak(d20 d20Var, boolean z) {
        return this.d.r.ak(d20Var, z);
    }

    @Override // defpackage.d20
    public final long al() {
        l50 l50Var = this.d;
        return (((long) l50Var.d) << 32) | (((long) l50Var.e) & 4294967295L);
    }

    @Override // defpackage.d20
    public final long am(long j) {
        return this.d.r.am(xa0.g(j, a()));
    }

    public final long b(d20 d20Var, long j) {
        boolean z = d20Var instanceof m50;
        l50 l50Var = this.d;
        if (!z) {
            l50 l50VarAj = pk.aj(l50Var);
            fa0 fa0Var = l50VarAj.r;
            long jB = b(l50VarAj.u, j);
            long j2 = l50VarAj.s;
            long jF = xa0.f(jB, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!fa0Var.D().q) {
                sy.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            fa0Var.N();
            fa0 fa0Var2 = fa0Var.t;
            if (fa0Var2 != null) {
                fa0Var = fa0Var2;
            }
            return xa0.g(jF, fa0Var.M(d20Var, 0L));
        }
        l50 l50Var2 = ((m50) d20Var).d;
        fa0 fa0Var3 = l50Var2.r;
        fa0Var3.N();
        l50 l50VarB = l50Var.r.Oo(fa0Var3).B();
        if (l50VarB != null) {
            long jB2 = pz.b(pz.c(l50Var2.I1(l50VarB, false), t1.au(j)), l50Var.I1(l50VarB, false));
            return (((long) Float.floatToRawIntBits((int) (jB2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L);
        }
        l50 l50VarAj2 = pk.aj(l50Var2);
        long jC = pz.c(pz.c(l50Var2.I1(l50VarAj2, false), l50VarAj2.s), t1.au(j));
        l50 l50VarAj3 = pk.aj(l50Var);
        long jB3 = pz.b(jC, pz.c(l50Var.I1(l50VarAj3, false), l50VarAj3.s));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB3 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB3 & 4294967295L))) & 4294967295L;
        fa0 fa0Var4 = l50VarAj3.r.t;
        fa0Var4.getClass();
        fa0 fa0Var5 = l50VarAj2.r.t;
        fa0Var5.getClass();
        return fa0Var4.M(fa0Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // defpackage.d20
    public final long d(long j) {
        return this.d.r.d(xa0.g(0L, a()));
    }

    @Override // defpackage.d20
    public final long h(long j) {
        return xa0.g(this.d.r.h(j), a());
    }

    @Override // defpackage.d20
    public final long i(long j) {
        return this.d.r.i(xa0.g(j, a()));
    }

    @Override // defpackage.d20
    public final d20 l() {
        l50 l50VarB;
        if (!af()) {
            sy.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        fa0 fa0Var = ((fa0) this.d.r.r.ag.h).t;
        if (fa0Var == null || (l50VarB = fa0Var.B()) == null) {
            return null;
        }
        return l50VarB.u;
    }

    @Override // defpackage.d20
    public final long z(d20 d20Var, long j) {
        return b(d20Var, j);
    }
}

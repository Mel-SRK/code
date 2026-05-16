package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n20 extends fa0 {
    public static final l3 at;
    public l20 ar;
    public m20 as;

    static {
        l3 l3VarC = t1.c();
        l3VarC.e(qc.e);
        l3VarC.a.setStrokeWidth(1.0f);
        l3VarC.i(1);
        at = l3VarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n20(s20 s20Var, l20 l20Var) {
        super(s20Var);
        this.ar = l20Var;
        this.as = s20Var.j != null ? new m20(this) : null;
        if ((((i70) l20Var).d.f & 512) == 0) {
            return;
        }
        wc.c();
        throw null;
    }

    @Override // defpackage.fa0
    public final l50 B() {
        return this.as;
    }

    @Override // defpackage.fa0
    public final i70 D() {
        return ((i70) this.ar).d;
    }

    @Override // defpackage.fa0
    public final void S(oa oaVar, jw jwVar) {
        fa0 fa0Var;
        fa0 fa0Var2 = this.s;
        fa0Var2.getClass();
        fa0Var2.Il(oaVar, jwVar);
        if (!t1.as(this.r).getShowLayoutBounds() || (fa0Var = this.s) == null) {
            return;
        }
        if (wz.a(this.f, fa0Var.f) && pz.a(fa0Var.ac, 0L)) {
            return;
        }
        long j = this.f;
        oaVar.o(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, at);
    }

    @Override // defpackage.k60
    public final int ap(int i) {
        l20 l20Var = this.ar;
        fa0 fa0Var = this.s;
        fa0Var.getClass();
        return l20Var.aj(this, fa0Var, i);
    }

    @Override // defpackage.k60
    public final int aw(int i) {
        l20 l20Var = this.ar;
        fa0 fa0Var = this.s;
        fa0Var.getClass();
        return l20Var.f(this, fa0Var, i);
    }

    @Override // defpackage.k60
    public final int ax(int i) {
        l20 l20Var = this.ar;
        fa0 fa0Var = this.s;
        fa0Var.getClass();
        return l20Var.z(this, fa0Var, i);
    }

    @Override // defpackage.lf0
    public final void bc(long j, float f, cv cvVar) {
        T(j, f, cvVar);
        if (this.m) {
            return;
        }
        P();
        br().b();
        this.s.getClass();
    }

    @Override // defpackage.j50
    public final int bj(qx qxVar) {
        m20 m20Var = this.as;
        if (m20Var == null) {
            return az0.h(this, qxVar);
        }
        l80 l80Var = m20Var.w;
        int iD = l80Var.d(qxVar);
        if (iD >= 0) {
            return l80Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.k60
    public final lf0 e(long j) {
        bf(j);
        l20 l20Var = this.ar;
        fa0 fa0Var = this.s;
        fa0Var.getClass();
        W(l20Var.e(this, fa0Var, j));
        O();
        return this;
    }

    @Override // defpackage.k60
    public final int f(int i) {
        l20 l20Var = this.ar;
        fa0 fa0Var = this.s;
        fa0Var.getClass();
        return l20Var.n(this, fa0Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(l20 l20Var) {
        if (l20Var.equals(this.ar) || (((i70) l20Var).d.f & 512) == 0) {
            this.ar = l20Var;
        } else {
            wc.c();
        }
    }

    @Override // defpackage.fa0
    public final void oO() {
        if (this.as == null) {
            this.as = new m20(this);
        }
    }
}

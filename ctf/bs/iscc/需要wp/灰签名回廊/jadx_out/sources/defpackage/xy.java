package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xy extends l50 {
    @Override // defpackage.l50
    public final void O1() {
        q50 q50Var = this.r.r.ah.p;
        q50Var.getClass();
        q50Var.bm();
    }

    @Override // defpackage.k60
    public final int ap(int i) {
        f1 f1VarP = this.r.r.p();
        p60 p60VarQ = f1VarP.q();
        s20 s20Var = (s20) f1VarP.e;
        return p60VarQ.j((fa0) s20Var.ag.h, s20Var.i(), i);
    }

    @Override // defpackage.k60
    public final int aw(int i) {
        f1 f1VarP = this.r.r.p();
        p60 p60VarQ = f1VarP.q();
        s20 s20Var = (s20) f1VarP.e;
        return p60VarQ.d((fa0) s20Var.ag.h, s20Var.i(), i);
    }

    @Override // defpackage.k60
    public final int ax(int i) {
        f1 f1VarP = this.r.r.p();
        p60 p60VarQ = f1VarP.q();
        s20 s20Var = (s20) f1VarP.e;
        return p60VarQ.h((fa0) s20Var.ag.h, s20Var.i(), i);
    }

    @Override // defpackage.j50
    public final int bj(qx qxVar) {
        q50 q50Var = this.r.r.ah.p;
        q50Var.getClass();
        v20 v20Var = q50Var.i;
        p20 p20Var = v20Var.c;
        t20 t20Var = q50Var.t;
        if (p20Var == p20.e) {
            t20Var.d = true;
            if (t20Var.b) {
                v20Var.e = true;
                v20Var.f = true;
            }
        } else {
            t20Var.e = true;
        }
        xy xyVar = q50Var.p().as;
        if (xyVar != null) {
            xyVar.n = true;
        }
        q50Var.s();
        xy xyVar2 = q50Var.p().as;
        if (xyVar2 != null) {
            xyVar2.n = false;
        }
        Integer num = (Integer) t20Var.g.get(qxVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.w.h(iIntValue, qxVar);
        return iIntValue;
    }

    @Override // defpackage.k60
    public final lf0 e(long j) {
        bf(j);
        fa0 fa0Var = this.r;
        a90 a90VarU = fa0Var.r.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            q50 q50Var = ((s20) objArr[i2]).ah.p;
            q50Var.getClass();
            q50Var.m = q20.f;
        }
        s20 s20Var = fa0Var.r;
        l50.O0(this, s20Var.x.g(this, s20Var.i(), j));
        return this;
    }

    @Override // defpackage.k60
    public final int f(int i) {
        f1 f1VarP = this.r.r.p();
        p60 p60VarQ = f1VarP.q();
        s20 s20Var = (s20) f1VarP.e;
        return p60VarQ.b((fa0) s20Var.ag.h, s20Var.i(), i);
    }
}

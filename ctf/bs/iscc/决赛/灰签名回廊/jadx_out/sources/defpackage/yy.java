package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yy extends fa0 {
    public static final l3 at;
    public final hu0 ar;
    public xy as;

    static {
        l3 l3VarC = t1.c();
        l3VarC.e(qc.d);
        l3VarC.a.setStrokeWidth(1.0f);
        l3VarC.i(1);
        at = l3VarC;
    }

    public yy(s20 s20Var) {
        super(s20Var);
        hu0 hu0Var = new hu0();
        hu0Var.g = 0;
        this.ar = hu0Var;
        hu0Var.k = this;
        this.as = s20Var.j != null ? new xy(this) : null;
    }

    @Override // defpackage.fa0
    public final l50 B() {
        return this.as;
    }

    @Override // defpackage.fa0
    public final i70 D() {
        return this.ar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [i70] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [i70] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [a90] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [a90] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // defpackage.fa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(defpackage.n31 r19, long r20, defpackage.px r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy.J(n31, long, px, int, boolean):void");
    }

    @Override // defpackage.fa0
    public final void S(oa oaVar, jw jwVar) {
        s20 s20Var = this.r;
        b1 b1VarAs = t1.as(s20Var);
        a90 a90VarT = s20Var.t();
        Object[] objArr = a90VarT.d;
        int i = a90VarT.f;
        for (int i2 = 0; i2 < i; i2++) {
            s20 s20Var2 = (s20) objArr[i2];
            if (s20Var2.af()) {
                s20Var2.g(oaVar, jwVar);
            }
        }
        if (b1VarAs.getShowLayoutBounds()) {
            long j = this.f;
            oaVar.o(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, at);
        }
    }

    @Override // defpackage.k60
    public final int ap(int i) {
        f1 f1VarP = this.r.p();
        p60 p60VarQ = f1VarP.q();
        s20 s20Var = (s20) f1VarP.e;
        return p60VarQ.j((fa0) s20Var.ag.h, s20Var.j(), i);
    }

    @Override // defpackage.k60
    public final int aw(int i) {
        f1 f1VarP = this.r.p();
        p60 p60VarQ = f1VarP.q();
        s20 s20Var = (s20) f1VarP.e;
        return p60VarQ.d((fa0) s20Var.ag.h, s20Var.j(), i);
    }

    @Override // defpackage.k60
    public final int ax(int i) {
        f1 f1VarP = this.r.p();
        p60 p60VarQ = f1VarP.q();
        s20 s20Var = (s20) f1VarP.e;
        return p60VarQ.h((fa0) s20Var.ag.h, s20Var.j(), i);
    }

    @Override // defpackage.lf0
    public final void bc(long j, float f, cv cvVar) {
        T(j, f, cvVar);
        if (this.m) {
            return;
        }
        this.r.ah.o.bm();
    }

    @Override // defpackage.j50
    public final int bj(qx qxVar) {
        xy xyVar = this.as;
        if (xyVar != null) {
            return xyVar.bj(qxVar);
        }
        o60 o60Var = this.r.ah.o;
        p20 p20Var = o60Var.i.c;
        t20 t20Var = o60Var.z;
        if (p20Var == p20.d) {
            t20Var.d = true;
            if (t20Var.b) {
                o60Var.x = true;
                o60Var.y = true;
            }
        } else {
            t20Var.e = true;
        }
        o60Var.p().n = true;
        o60Var.s();
        o60Var.p().n = false;
        Integer num = (Integer) t20Var.g.get(qxVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.k60
    public final lf0 e(long j) {
        bf(j);
        s20 s20Var = this.r;
        a90 a90VarU = s20Var.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((s20) objArr[i2]).ah.o.o = q20.f;
        }
        W(s20Var.x.g(this, s20Var.j(), j));
        O();
        return this;
    }

    @Override // defpackage.k60
    public final int f(int i) {
        f1 f1VarP = this.r.p();
        p60 p60VarQ = f1VarP.q();
        s20 s20Var = (s20) f1VarP.e;
        return p60VarQ.b((fa0) s20Var.ag.h, s20Var.j(), i);
    }

    @Override // defpackage.fa0
    public final void oO() {
        if (this.as == null) {
            this.as = new xy(this);
        }
    }
}

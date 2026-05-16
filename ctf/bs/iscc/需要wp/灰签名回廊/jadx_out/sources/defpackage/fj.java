package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fj extends x10 implements cv {
    public final /* synthetic */ jy0 e;
    public final /* synthetic */ lw0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ey h;
    public final /* synthetic */ h30 i;
    public final /* synthetic */ ab0 j;
    public final /* synthetic */ cw0 k;
    public final /* synthetic */ ys l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(jy0 jy0Var, lw0 lw0Var, boolean z, ey eyVar, h30 h30Var, ab0 ab0Var, cw0 cw0Var, ys ysVar) {
        super(1);
        this.e = jy0Var;
        this.f = lw0Var;
        this.g = z;
        this.h = eyVar;
        this.i = h30Var;
        this.j = ab0Var;
        this.k = cw0Var;
        this.l = ysVar;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        po0 po0Var = (po0) obj;
        b6 b6Var = this.e.a;
        i10[] i10VarArr = bp0.a;
        cp0 cp0Var = zo0.ad;
        i10[] i10VarArr2 = bp0.a;
        i10 i10Var = i10VarArr2[18];
        po0Var.d(cp0Var, b6Var);
        lw0 lw0Var = this.f;
        long j = lw0Var.b;
        cp0 cp0Var2 = zo0.ae;
        i10 i10Var2 = i10VarArr2[19];
        po0Var.d(cp0Var2, new hx0(j));
        wz0 wz0Var = wz0.a;
        boolean z = this.g;
        if (!z) {
            po0Var.d(zo0.i, wz0Var);
        }
        cp0 cp0Var3 = zo0.ak;
        i10 i10Var3 = i10VarArr2[25];
        po0Var.d(cp0Var3, Boolean.valueOf(z));
        h30 h30Var = this.i;
        bp0.a(po0Var, new wi(h30Var, 2));
        if (z) {
            po0Var.d(oo0.i, new ah(null, new wi(h30Var, po0Var)));
            po0Var.d(oo0.m, new ah(null, new dj(z, h30Var, po0Var, lw0Var)));
        }
        ab0 ab0Var = this.j;
        boolean z2 = this.g;
        cw0 cw0Var = this.k;
        po0Var.d(oo0.h, new ah(null, new ej(ab0Var, z2, lw0Var, cw0Var, h30Var)));
        ey eyVar = this.h;
        int i = eyVar.e;
        s0 s0Var = new s0(5, h30Var, eyVar);
        po0Var.d(zo0.af, new dy(i));
        po0Var.d(oo0.n, new ah(null, s0Var));
        po0Var.d(oo0.b, new ah(null, new s0(6, h30Var, this.l)));
        po0Var.d(oo0.c, new ah(null, new cj(cw0Var, 1)));
        if (!hx0.b(j)) {
            po0Var.d(oo0.o, new ah(null, new cj(cw0Var, 2)));
            if (z) {
                po0Var.d(oo0.p, new ah(null, new cj(cw0Var, 3)));
            }
        }
        if (z) {
            po0Var.d(oo0.q, new ah(null, new cj(cw0Var, 0)));
        }
        return wz0Var;
    }
}

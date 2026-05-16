package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aw0 implements fv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cw0 b;

    public /* synthetic */ aw0(cw0 cw0Var, int i) {
        this.a = i;
        this.b = cw0Var;
    }

    @Override // defpackage.fv0
    public final void a() {
        switch (this.a) {
            case 0:
                cw0 cw0Var = this.b;
                cw0Var.o.setValue(null);
                cw0Var.p.setValue(null);
                break;
            default:
                i();
                break;
        }
    }

    @Override // defpackage.fv0
    public final void b() {
        switch (this.a) {
            case 0:
                cw0 cw0Var = this.b;
                cw0Var.o.setValue(null);
                cw0Var.p.setValue(null);
                break;
        }
    }

    @Override // defpackage.fv0
    public final void c(long j) {
        ax0 ax0VarD;
        long j2;
        ax0 ax0VarD2;
        ax0 ax0VarD3;
        switch (this.a) {
            case 0:
                cw0 cw0Var = this.b;
                long jI = cw0Var.i(true);
                float f = io0.a;
                long jH = d41.h(xa0.d(jI), xa0.e(jI) - 1.0f);
                h30 h30Var = cw0Var.d;
                if (h30Var != null && (ax0VarD = h30Var.d()) != null) {
                    long jE = ax0VarD.e(jH);
                    cw0Var.l = jE;
                    cw0Var.p.setValue(new xa0(jE));
                    cw0Var.n = 0L;
                    cw0Var.o.setValue(vw.d);
                    cw0Var.p(false);
                    break;
                }
                break;
            default:
                cw0 cw0Var2 = this.b;
                me0 me0Var = cw0Var2.o;
                if (cw0Var2.h() && ((vw) me0Var.getValue()) == null) {
                    me0Var.setValue(vw.f);
                    cw0Var2.q = -1;
                    cw0Var2.k();
                    h30 h30Var2 = cw0Var2.d;
                    if (h30Var2 == null || (ax0VarD3 = h30Var2.d()) == null || !ax0VarD3.c(j)) {
                        j2 = j;
                        h30 h30Var3 = cw0Var2.d;
                        if (h30Var3 != null && (ax0VarD2 = h30Var3.d()) != null) {
                            int iB = cw0Var2.b.b(ax0VarD2.b(j2, true));
                            lw0 lw0VarC = cw0.c(cw0Var2.j().a, wo0.b(iB, iB));
                            cw0Var2.f(false);
                            ix ixVar = cw0Var2.h;
                            if (ixVar != null) {
                                ixVar.a();
                            }
                            cw0Var2.c.g(lw0VarC);
                        }
                    } else if (cw0Var2.j().a.e.length() != 0) {
                        cw0Var2.f(false);
                        j2 = j;
                        cw0Var2.m = Integer.valueOf((int) (cw0.a(cw0Var2, lw0.a(cw0Var2.j(), null, hx0.b, 5), j2, true, false, bw.ar, true) >> 32));
                    }
                    cw0Var2.n(xw.d);
                    cw0Var2.l = j2;
                    cw0Var2.p.setValue(new xa0(j2));
                    cw0Var2.n = 0L;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.fv0
    public final void d() {
        int i = this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    @Override // defpackage.fv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j) {
        ax0 ax0VarD;
        ix ixVar;
        ax0 ax0VarD2;
        switch (this.a) {
            case 0:
                cw0 cw0Var = this.b;
                cw0Var.n = xa0.g(cw0Var.n, j);
                h30 h30Var = cw0Var.d;
                if (h30Var != null && (ax0VarD = h30Var.d()) != null) {
                    cw0Var.p.setValue(new xa0(xa0.g(cw0Var.l, cw0Var.n)));
                    ab0 ab0Var = cw0Var.b;
                    xa0 xa0VarG = cw0Var.g();
                    xa0VarG.getClass();
                    int iB = ab0Var.b(ax0VarD.b(xa0VarG.a, true));
                    long jB = wo0.b(iB, iB);
                    if (!hx0.a(jB, cw0Var.j().b)) {
                        h30 h30Var2 = cw0Var.d;
                        if ((h30Var2 == null || ((Boolean) h30Var2.q.getValue()).booleanValue()) && (ixVar = cw0Var.h) != null) {
                            ixVar.a();
                        }
                        cw0Var.c.g(cw0.c(cw0Var.j().a, jB));
                        break;
                    }
                }
                break;
            default:
                wc wcVar = bw.ar;
                cw0 cw0Var2 = this.b;
                if (cw0Var2.h() && cw0Var2.j().a.e.length() != 0) {
                    cw0Var2.n = xa0.g(cw0Var2.n, j);
                    h30 h30Var3 = cw0Var2.d;
                    if (h30Var3 != null && (ax0VarD2 = h30Var3.d()) != null) {
                        cw0Var2.p.setValue(new xa0(xa0.g(cw0Var2.l, cw0Var2.n)));
                        if (cw0Var2.m == null) {
                            xa0 xa0VarG2 = cw0Var2.g();
                            xa0VarG2.getClass();
                            if (ax0VarD2.c(xa0VarG2.a)) {
                                Integer num = cw0Var2.m;
                                int iIntValue = num != null ? num.intValue() : ax0VarD2.b(cw0Var2.l, false);
                                xa0 xa0VarG3 = cw0Var2.g();
                                xa0VarG3.getClass();
                                int iB2 = ax0VarD2.b(xa0VarG3.a, false);
                                if (cw0Var2.m != null || iIntValue != iB2) {
                                    lw0 lw0VarJ = cw0Var2.j();
                                    xa0 xa0VarG4 = cw0Var2.g();
                                    xa0VarG4.getClass();
                                    cw0.a(cw0Var2, lw0VarJ, xa0VarG4.a, false, false, wcVar, true);
                                }
                            } else {
                                int iB3 = cw0Var2.b.b(ax0VarD2.b(cw0Var2.l, true));
                                ab0 ab0Var2 = cw0Var2.b;
                                xa0 xa0VarG5 = cw0Var2.g();
                                xa0VarG5.getClass();
                                if (iB3 == ab0Var2.b(ax0VarD2.b(xa0VarG5.a, true))) {
                                    wcVar = bw.aq;
                                }
                                lw0 lw0VarJ2 = cw0Var2.j();
                                xa0 xa0VarG6 = cw0Var2.g();
                                xa0VarG6.getClass();
                                cw0.a(cw0Var2, lw0VarJ2, xa0VarG6.a, false, false, wcVar, true);
                            }
                            int i = hx0.c;
                        }
                    }
                    cw0Var2.p(false);
                    break;
                }
                break;
        }
    }

    public void i() {
        cw0 cw0Var = this.b;
        cw0Var.o.setValue(null);
        cw0Var.p.setValue(null);
        cw0Var.p(true);
        cw0Var.m = null;
        boolean zB = hx0.b(cw0Var.j().b);
        cw0Var.n(zB ? xw.f : xw.e);
        h30 h30Var = cw0Var.d;
        if (h30Var != null) {
            h30Var.m.setValue(Boolean.valueOf(!zB && lI.l(cw0Var, true)));
        }
        h30 h30Var2 = cw0Var.d;
        if (h30Var2 != null) {
            h30Var2.n.setValue(Boolean.valueOf(!zB && lI.l(cw0Var, false)));
        }
        h30 h30Var3 = cw0Var.d;
        if (h30Var3 == null) {
            return;
        }
        h30Var3.o.setValue(Boolean.valueOf(zB && lI.l(cw0Var, true)));
    }

    @Override // defpackage.fv0
    public final void onCancel() {
        switch (this.a) {
            case 0:
                break;
            default:
                i();
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void j() {
    }
}

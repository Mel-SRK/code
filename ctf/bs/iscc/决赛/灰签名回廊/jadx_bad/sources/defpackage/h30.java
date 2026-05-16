package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h30 {
    public dv0 a;
    public final hi0 b;
    public final sr0 c;
    public final f1 d;
    public uw0 e;
    public final me0 f;
    public final me0 g;
    public d20 h;
    public final me0 i;
    public b6 j;
    public final me0 k;
    public final me0 l;
    public final me0 m;
    public final me0 n;
    public final me0 o;
    public boolean p;
    public final me0 q;
    public final o6 r;
    public cv s;
    public final wi t;
    public final wi u;
    public final l3 v;
    public long w;
    public final me0 x;
    public final me0 y;

    public h30(dv0 dv0Var, hi0 hi0Var, sr0 sr0Var) {
        this.a = dv0Var;
        this.b = hi0Var;
        this.c = sr0Var;
        f1 f1Var = new f1(3);
        b6 b6Var = d6.a;
        long j = hx0.b;
        lw0 lw0Var = new lw0(b6Var, j, (hx0) null);
        f1Var.e = lw0Var;
        f1Var.f = new pp(b6Var, lw0Var.b);
        this.d = f1Var;
        Boolean bool = Boolean.FALSE;
        this.f = bo0.m(bool);
        this.g = bo0.m(new mn(0));
        this.i = bo0.m(null);
        this.k = bo0.m(xw.d);
        this.l = bo0.m(bool);
        this.m = bo0.m(bool);
        this.n = bo0.m(bool);
        this.o = bo0.m(bool);
        this.p = true;
        this.q = bo0.m(Boolean.TRUE);
        o6 o6Var = new o6();
        o6Var.a = sr0Var;
        this.r = o6Var;
        this.s = q0.ag;
        this.t = new wi(this, 5);
        this.u = new wi(this, 4);
        this.v = t1.c();
        this.w = qc.g;
        this.x = bo0.m(new hx0(j));
        this.y = bo0.m(new hx0(j));
    }

    public final xw a() {
        return (xw) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final d20 c() {
        d20 d20Var = this.h;
        if (d20Var == null || !d20Var.af()) {
            return null;
        }
        return d20Var;
    }

    public final ax0 d() {
        return (ax0) this.i.getValue();
    }

    public final void e(long j) {
        this.y.setValue(new hx0(j));
    }

    public final void f(long j) {
        this.x.setValue(new hx0(j));
    }
}

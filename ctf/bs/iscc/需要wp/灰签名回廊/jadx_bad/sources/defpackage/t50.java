package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class t50 extends i70 implements xv, wo, so0, va0 {
    public wz aa;
    public o9 ab;
    public gw0 r;
    public hw0 s;
    public sf0 t;
    public View u;
    public em v;
    public rf0 w;
    public km y;
    public final me0 x = new me0(null, bw.ai);
    public long z = 9205357640488583168L;

    public t50(gw0 gw0Var, hw0 hw0Var, sf0 sf0Var) {
        this.r = gw0Var;
        this.s = hw0Var;
        this.t = sf0Var;
    }

    @Override // defpackage.va0
    public final void af() {
        az0.z(this, new s50(this, 2));
    }

    @Override // defpackage.so0
    public final void ag(po0 po0Var) {
        po0Var.d(u50.a, new s50(this, 1));
    }

    @Override // defpackage.i70
    public final void bm() {
        af();
        this.ab = i60.a(0, 7, null);
        i60.an(bi(), null, new sk(this, null, 2), 3);
    }

    @Override // defpackage.i70
    public final void bn() {
        rf0 rf0Var = this.w;
        if (rf0Var != null) {
            ((tf0) rf0Var).b();
        }
        this.w = null;
    }

    public final long bu() {
        if (this.y == null) {
            this.y = bo0.f(new s50(this, 0));
        }
        km kmVar = this.y;
        if (kmVar != null) {
            return ((xa0) kmVar.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void bv() {
        rf0 rf0Var = this.w;
        if (rf0Var != null) {
            ((tf0) rf0Var).b();
        }
        View viewAg = this.u;
        if (viewAg == null) {
            viewAg = e00.ag(this);
        }
        this.u = viewAg;
        em emVar = this.v;
        if (emVar == null) {
            emVar = pk.ay(this).z;
        }
        this.v = emVar;
        this.w = this.t.b(viewAg, emVar);
        bx();
    }

    public final void bw() {
        em emVar = this.v;
        if (emVar == null) {
            emVar = pk.ay(this).z;
            this.v = emVar;
        }
        long j = ((xa0) this.r.g(emVar)).a;
        if (!d41.ad(j) || !d41.ad(bu())) {
            this.z = 9205357640488583168L;
            rf0 rf0Var = this.w;
            if (rf0Var != null) {
                ((tf0) rf0Var).b();
                return;
            }
            return;
        }
        this.z = xa0.g(bu(), j);
        if (this.w == null) {
            bv();
        }
        rf0 rf0Var2 = this.w;
        if (rf0Var2 != null) {
            rf0Var2.a(this.z, 9205357640488583168L);
        }
        bx();
    }

    public final void bx() {
        em emVar;
        rf0 rf0Var = this.w;
        if (rf0Var == null || (emVar = this.v) == null) {
            return;
        }
        tf0 tf0Var = (tf0) rf0Var;
        long jC = tf0Var.c();
        wz wzVar = this.aa;
        if (wzVar != null && jC == wzVar.a) {
            return;
        }
        this.s.g(new pn(emVar.w(e00.an(tf0Var.c()))));
        this.aa = new wz(tf0Var.c());
    }

    @Override // defpackage.wo
    public final void d(u20 u20Var) {
        u20Var.a();
        o9 o9Var = this.ab;
        if (o9Var != null) {
            o9Var.u(wz0.a);
        }
    }

    @Override // defpackage.xv
    public final void t(fa0 fa0Var) {
        this.x.setValue(fa0Var);
    }
}

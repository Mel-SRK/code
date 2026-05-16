package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class l50 extends j50 implements k60 {
    public final fa0 r;
    public LinkedHashMap t;
    public q60 v;
    public final l80 w;
    public long s = 0;
    public final m50 u = new m50(this);

    public l50(fa0 fa0Var) {
        this.r = fa0Var;
        l80 l80Var = sa0.a;
        this.w = new l80();
    }

    public static final void O0(l50 l50Var, q60 q60Var) {
        LinkedHashMap linkedHashMap;
        if (q60Var != null) {
            l50Var.bd((((long) q60Var.c()) & 4294967295L) | (((long) q60Var.e()) << 32));
        } else {
            l50Var.bd(0L);
        }
        if (!f00.h(l50Var.v, q60Var) && q60Var != null && ((((linkedHashMap = l50Var.t) != null && !linkedHashMap.isEmpty()) || !q60Var.a().isEmpty()) && !f00.h(q60Var.a(), l50Var.t))) {
            q50 q50Var = l50Var.r.r.ah.p;
            q50Var.getClass();
            q50Var.t.f();
            LinkedHashMap linkedHashMap2 = l50Var.t;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                l50Var.t = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(q60Var.a());
        }
        l50Var.v = q60Var;
    }

    public final long I1(l50 l50Var, boolean z) {
        long jC = 0;
        l50 l50VarB = this;
        while (!l50VarB.equals(l50Var)) {
            if (!l50VarB.l || !z) {
                jC = pz.c(jC, l50VarB.s);
            }
            fa0 fa0Var = l50VarB.r.t;
            fa0Var.getClass();
            l50VarB = fa0Var.B();
            l50VarB.getClass();
        }
        return jC;
    }

    public void O1() {
        br().b();
    }

    @Override // defpackage.em
    public final float b() {
        return this.r.b();
    }

    @Override // defpackage.lf0
    public final void bc(long j, float f, cv cvVar) {
        l1(j);
        if (this.m) {
            return;
        }
        O1();
    }

    @Override // defpackage.j50
    public final j50 bn() {
        fa0 fa0Var = this.r.s;
        if (fa0Var != null) {
            return fa0Var.B();
        }
        return null;
    }

    @Override // defpackage.j50
    public final d20 bo() {
        return this.u;
    }

    @Override // defpackage.j50
    public final boolean bp() {
        return this.v != null;
    }

    @Override // defpackage.j50
    public final s20 bq() {
        return this.r.r;
    }

    @Override // defpackage.j50
    public final q60 br() {
        q60 q60Var = this.v;
        if (q60Var != null) {
            return q60Var;
        }
        throw n5.f("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.j50
    public final j50 bs() {
        fa0 fa0Var = this.r.t;
        if (fa0Var != null) {
            return fa0Var.B();
        }
        return null;
    }

    @Override // defpackage.j50
    public final long bt() {
        return this.s;
    }

    @Override // defpackage.j50
    public final boolean bw() {
        return true;
    }

    @Override // defpackage.j50
    public final void bz() {
        bc(this.s, 0.0f, null);
    }

    @Override // defpackage.a00
    public final e20 getLayoutDirection() {
        return this.r.r.aa;
    }

    @Override // defpackage.lf0, defpackage.k60
    public final Object j() {
        return this.r.j();
    }

    @Override // defpackage.em
    public final float k() {
        return this.r.k();
    }

    public final void l1(long j) {
        if (!pz.a(this.s, j)) {
            this.s = j;
            fa0 fa0Var = this.r;
            q50 q50Var = fa0Var.r.ah.p;
            if (q50Var != null) {
                q50Var.bk();
            }
            j50.bv(fa0Var);
        }
        if (this.n) {
            return;
        }
        bl(br());
    }
}

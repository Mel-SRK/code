package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q50 extends lf0 implements k60, I1, t70 {
    public final v20 i;
    public boolean j;
    public boolean n;
    public boolean o;
    public dh p;
    public cv r;
    public boolean w;
    public Object y;
    public boolean z;
    public int k = Integer.MAX_VALUE;
    public int l = Integer.MAX_VALUE;
    public q20 m = q20.f;
    public long q = 0;
    public n50 s = n50.f;
    public final t20 t = new t20(this, 1);
    public final a90 u = new a90(new q50[16]);
    public boolean v = true;
    public boolean x = true;

    public q50(v20 v20Var) {
        this.i = v20Var;
        this.y = v20Var.o.t;
    }

    @Override // defpackage.I1
    public final t20 a() {
        return this.t;
    }

    @Override // defpackage.k60
    public final int ap(int i) {
        bl();
        l50 l50VarB = this.i.a().B();
        l50VarB.getClass();
        return l50VarB.ap(i);
    }

    @Override // defpackage.I1
    public final void as() {
        s20.an(this.i.a, false, 7);
    }

    @Override // defpackage.k60
    public final int aw(int i) {
        bl();
        l50 l50VarB = this.i.a().B();
        l50VarB.getClass();
        return l50VarB.aw(i);
    }

    @Override // defpackage.k60
    public final int ax(int i) {
        bl();
        l50 l50VarB = this.i.a().B();
        l50VarB.getClass();
        return l50VarB.ax(i);
    }

    @Override // defpackage.lf0
    public final void bc(long j, float f, cv cvVar) {
        bn(j, cvVar);
    }

    public final void bi(boolean z) {
        v20 v20Var = this.i;
        if (z && v20Var.b) {
            return;
        }
        if (z || v20Var.b) {
            this.s = n50.f;
            a90 a90VarU = v20Var.a.u();
            Object[] objArr = a90VarU.d;
            int i = a90VarU.f;
            for (int i2 = 0; i2 < i; i2++) {
                q50 q50Var = ((s20) objArr[i2]).ah.p;
                q50Var.getClass();
                q50Var.bi(true);
            }
        }
    }

    public final void bj() {
        n50 n50Var = this.s;
        v20 v20Var = this.i;
        boolean z = v20Var.b;
        s20 s20Var = v20Var.a;
        n50 n50Var2 = n50.d;
        if (z) {
            this.s = n50.e;
        } else {
            this.s = n50Var2;
        }
        if (n50Var != n50Var2 && v20Var.d) {
            s20.an(s20Var, true, 6);
        }
        a90 a90VarU = s20Var.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            s20 s20Var2 = (s20) objArr[i2];
            q50 q50Var = s20Var2.ah.p;
            if (q50Var == null) {
                wc.n("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (q50Var.l != Integer.MAX_VALUE) {
                q50Var.bj();
                s20.aq(s20Var2);
            }
        }
    }

    public final void bk() {
        v20 v20Var = this.i;
        if (v20Var.n > 0) {
            a90 a90VarU = v20Var.a.u();
            Object[] objArr = a90VarU.d;
            int i = a90VarU.f;
            for (int i2 = 0; i2 < i; i2++) {
                s20 s20Var = (s20) objArr[i2];
                v20 v20Var2 = s20Var.ah;
                if ((v20Var2.l || v20Var2.m) && !v20Var2.e) {
                    s20Var.am(false);
                }
                q50 q50Var = v20Var2.p;
                if (q50Var != null) {
                    q50Var.bk();
                }
            }
        }
    }

    public final void bl() {
        v20 v20Var = this.i;
        s20.an(v20Var.a, false, 7);
        s20 s20Var = v20Var.a;
        s20 s20VarQ = s20Var.q();
        if (s20VarQ == null || s20Var.ad != q20.f) {
            return;
        }
        int iOrdinal = s20VarQ.ah.c.ordinal();
        s20Var.ad = iOrdinal != 0 ? iOrdinal != 2 ? s20VarQ.ad : q20.e : q20.d;
    }

    public final void bm() {
        p20 p20Var;
        this.z = true;
        v20 v20Var = this.i;
        s20 s20VarQ = v20Var.a.q();
        n50 n50Var = this.s;
        if ((n50Var != n50.d && !v20Var.b) || (n50Var != n50.e && v20Var.b)) {
            bj();
            if (this.j && s20VarQ != null) {
                s20VarQ.am(false);
            }
        }
        if (s20VarQ != null) {
            v20 v20Var2 = s20VarQ.ah;
            if (!this.j && ((p20Var = v20Var2.c) == p20.f || p20Var == p20.g)) {
                if (this.l != Integer.MAX_VALUE) {
                    sy.b("Place was called on a node which was placed already");
                }
                int i = v20Var2.g;
                this.l = i;
                v20Var2.g = i + 1;
            }
        } else {
            this.l = 0;
        }
        s();
    }

    public final void bn(long j, cv cvVar) {
        v20 v20Var = this.i;
        s20 s20Var = v20Var.a;
        s20 s20Var2 = v20Var.a;
        try {
            s20 s20VarQ = s20Var.q();
            p20 p20Var = s20VarQ != null ? s20VarQ.ah.c : null;
            p20 p20Var2 = p20.g;
            if (p20Var == p20Var2) {
                v20Var.b = false;
            }
            if (s20Var2.ao) {
                sy.a("place is called on a deactivated node");
            }
            v20Var.c = p20Var2;
            this.n = true;
            this.z = false;
            if (!pz.a(j, this.q)) {
                if (v20Var.m || v20Var.l) {
                    v20Var.e = true;
                }
                bk();
            }
            b1 b1VarAs = t1.as(s20Var2);
            if (v20Var.e || !t()) {
                v20Var.h(false);
                this.t.e = false;
                td0 snapshotObserver = b1VarAs.getSnapshotObserver();
                p50 p50Var = new p50(this, b1VarAs, j);
                snapshotObserver.getClass();
                if (s20Var2.j != null) {
                    snapshotObserver.a(s20Var2, snapshotObserver.g, p50Var);
                } else {
                    snapshotObserver.a(s20Var2, snapshotObserver.f, p50Var);
                }
            } else {
                l50 l50VarB = v20Var.a().B();
                l50VarB.getClass();
                l50VarB.l1(pz.c(j, l50VarB.h));
                bm();
            }
            this.q = j;
            this.r = cvVar;
            v20Var.c = p20.h;
        } catch (Throwable th) {
            s20Var.as(th);
            throw null;
        }
    }

    public final boolean bo(long j) {
        long j2;
        v20 v20Var = this.i;
        s20 s20Var = v20Var.a;
        s20 s20Var2 = v20Var.a;
        try {
            if (s20Var.ao) {
                sy.a("measure is called on a deactivated node");
            }
            s20 s20VarQ = s20Var2.q();
            s20Var2.af = s20Var2.af || (s20VarQ != null && s20VarQ.af);
            if (!s20Var2.ah.d) {
                dh dhVar = this.p;
                if (dhVar == null ? false : dh.b(dhVar.a, j)) {
                    b1 b1Var = s20Var2.p;
                    if (b1Var != null) {
                        b1Var.k(s20Var2, true);
                    }
                    s20Var2.ar();
                    return false;
                }
            }
            this.p = new dh(j);
            bf(j);
            this.t.d = false;
            a90 a90VarU = s20Var2.u();
            Object[] objArr = a90VarU.d;
            int i = a90VarU.f;
            for (int i2 = 0; i2 < i; i2++) {
                q50 q50Var = ((s20) objArr[i2]).ah.p;
                q50Var.getClass();
                q50Var.t.getClass();
            }
            if (this.o) {
                j2 = this.f;
            } else {
                long j3 = Integer.MIN_VALUE;
                j2 = (j3 & 4294967295L) | (j3 << 32);
            }
            this.o = true;
            l50 l50VarB = v20Var.a().B();
            if (!(l50VarB != null)) {
                sy.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            v20Var.c(j);
            bd((((long) l50VarB.e) & 4294967295L) | (((long) l50VarB.d) << 32));
            return (((int) (j2 >> 32)) == l50VarB.d && ((int) (j2 & 4294967295L)) == l50VarB.e) ? false : true;
        } catch (Throwable th) {
            s20Var.as(th);
            throw null;
        }
    }

    @Override // defpackage.k60
    public final lf0 e(long j) {
        q20 q20Var;
        v20 v20Var = this.i;
        s20 s20Var = v20Var.a;
        s20 s20Var2 = v20Var.a;
        s20 s20VarQ = s20Var.q();
        if ((s20VarQ != null ? s20VarQ.ah.c : null) != p20.e) {
            s20 s20VarQ2 = s20Var2.q();
            if (s20VarQ2 != null) {
                p20 p20Var = s20VarQ2.ah.c;
            }
            p20 p20Var2 = p20.g;
        }
        s20 s20VarQ3 = s20Var2.q();
        q20 q20Var2 = q20.f;
        if (s20VarQ3 != null) {
            v20 v20Var2 = s20VarQ3.ah;
            if (this.m != q20Var2 && !s20Var2.af) {
                sy.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = v20Var2.c.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                q20Var = q20.d;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    wc.m(v20Var2.c, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                q20Var = q20.e;
            }
            this.m = q20Var;
        } else {
            this.m = q20Var2;
        }
        if (s20Var2.ad == q20Var2) {
            s20Var2.c();
        }
        bo(j);
        return this;
    }

    @Override // defpackage.k60
    public final int f(int i) {
        bl();
        l50 l50VarB = this.i.a().B();
        l50VarB.getClass();
        return l50VarB.f(i);
    }

    @Override // defpackage.lf0, defpackage.k60
    public final Object j() {
        return this.y;
    }

    @Override // defpackage.I1
    public final void n(l1 l1Var) {
        a90 a90VarU = this.i.a.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            q50 q50Var = ((s20) objArr[i2]).ah.p;
            q50Var.getClass();
            l1Var.g(q50Var);
        }
    }

    @Override // defpackage.t70
    public final void o(boolean z) {
        l50 l50VarB;
        v20 v20Var = this.i;
        l50 l50VarB2 = v20Var.a().B();
        if (Boolean.valueOf(z).equals(l50VarB2 != null ? Boolean.valueOf(l50VarB2.l) : null) || (l50VarB = v20Var.a().B()) == null) {
            return;
        }
        l50VarB.l = z;
    }

    @Override // defpackage.I1
    public final yy p() {
        return (yy) this.i.a.ag.g;
    }

    @Override // defpackage.I1
    public final I1 r() {
        v20 v20Var;
        s20 s20VarQ = this.i.a.q();
        if (s20VarQ == null || (v20Var = s20VarQ.ah) == null) {
            return null;
        }
        return v20Var.p;
    }

    @Override // defpackage.I1
    public final void requestLayout() {
        this.i.a.am(false);
    }

    @Override // defpackage.I1
    public final void s() {
        this.w = true;
        t20 t20Var = this.t;
        t20Var.h();
        v20 v20Var = this.i;
        boolean z = v20Var.e;
        s20 s20Var = v20Var.a;
        if (z) {
            a90 a90VarU = s20Var.u();
            Object[] objArr = a90VarU.d;
            int i = a90VarU.f;
            for (int i2 = 0; i2 < i; i2++) {
                s20 s20Var2 = (s20) objArr[i2];
                v20 v20Var2 = s20Var2.ah;
                if (v20Var2.d && s20Var2.o() == q20.d) {
                    q50 q50Var = v20Var2.p;
                    q50Var.getClass();
                    q50 q50Var2 = v20Var2.p;
                    dh dhVar = q50Var2 != null ? q50Var2.p : null;
                    dhVar.getClass();
                    if (q50Var.bo(dhVar.a)) {
                        s20.an(s20Var, false, 7);
                    }
                }
            }
        }
        xy xyVar = p().as;
        xyVar.getClass();
        if (v20Var.f || (!xyVar.n && v20Var.e)) {
            v20Var.e = false;
            p20 p20Var = v20Var.c;
            v20Var.c = p20.g;
            b1 b1VarAs = t1.as(s20Var);
            v20Var.i(false);
            td0 snapshotObserver = b1VarAs.getSnapshotObserver();
            s0 s0Var = new s0(11, this, xyVar);
            snapshotObserver.getClass();
            if (s20Var.j != null) {
                snapshotObserver.a(s20Var, snapshotObserver.h, s0Var);
            } else {
                snapshotObserver.a(s20Var, snapshotObserver.e, s0Var);
            }
            v20Var.c = p20Var;
            if (v20Var.l && xyVar.n) {
                requestLayout();
            }
            v20Var.f = false;
        }
        if (t20Var.b && t20Var.e()) {
            t20Var.g();
        }
        this.w = false;
    }

    @Override // defpackage.I1
    public final boolean t() {
        return this.s != n50.f;
    }
}

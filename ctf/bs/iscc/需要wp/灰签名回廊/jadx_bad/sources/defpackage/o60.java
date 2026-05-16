package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o60 extends lf0 implements k60, I1, t70 {
    public boolean ac;
    public float ag;
    public boolean ah;
    public cv ai;
    public float ak;
    public boolean am;
    public final v20 i;
    public boolean j;
    public boolean m;
    public boolean n;
    public cv q;
    public float r;
    public Object t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int k = Integer.MAX_VALUE;
    public int l = Integer.MAX_VALUE;
    public q20 o = q20.f;
    public long p = 0;
    public boolean s = true;
    public final t20 z = new t20(this, 0);
    public final a90 aa = new a90(new o60[16]);
    public boolean ab = true;
    public long ad = eh.b(0, 0, 15);
    public final n60 ae = new n60(this, 1);
    public final n60 af = new n60(this, 0);
    public long aj = 0;
    public final n60 al = new n60(this, 2);

    public o60(v20 v20Var) {
        this.i = v20Var;
    }

    @Override // defpackage.I1
    public final t20 a() {
        return this.z;
    }

    @Override // defpackage.k60
    public final int ap(int i) {
        v20 v20Var = this.i;
        if (!t1.ai(v20Var.a)) {
            bl();
            return v20Var.a().ap(i);
        }
        q50 q50Var = v20Var.p;
        q50Var.getClass();
        return q50Var.ap(i);
    }

    @Override // defpackage.I1
    public final void as() {
        s20.ap(this.i.a, false, 7);
    }

    @Override // defpackage.k60
    public final int aw(int i) {
        v20 v20Var = this.i;
        if (!t1.ai(v20Var.a)) {
            bl();
            return v20Var.a().aw(i);
        }
        q50 q50Var = v20Var.p;
        q50Var.getClass();
        return q50Var.aw(i);
    }

    @Override // defpackage.k60
    public final int ax(int i) {
        v20 v20Var = this.i;
        if (!t1.ai(v20Var.a)) {
            bl();
            return v20Var.a().ax(i);
        }
        q50 q50Var = v20Var.p;
        q50Var.getClass();
        return q50Var.ax(i);
    }

    @Override // defpackage.lf0
    public final int ay() {
        return this.i.a().ay();
    }

    @Override // defpackage.lf0
    public final int az() {
        return this.i.a().az();
    }

    @Override // defpackage.lf0
    public final void bc(long j, float f, cv cvVar) {
        boolean z;
        kf0 placementScope;
        v20 v20Var = this.i;
        s20 s20Var = v20Var.a;
        boolean z2 = true;
        try {
            this.v = true;
            if (!pz.a(j, this.p) || this.am) {
                if (v20Var.j || v20Var.i || this.am) {
                    this.x = true;
                    this.am = false;
                }
                bk();
            }
            q50 q50Var = v20Var.p;
            if (q50Var != null) {
                v20 v20Var2 = q50Var.i;
                if (t1.ai(v20Var2.a)) {
                    z = true;
                } else {
                    if (q50Var.s == n50.f) {
                        v20Var2.b = true;
                    }
                    z = v20Var2.b;
                }
                if (z) {
                    fa0 fa0Var = v20Var.a().t;
                    if (fa0Var == null || (placementScope = fa0Var.o) == null) {
                        placementScope = t1.as(s20Var).getPlacementScope();
                    }
                    q50 q50Var2 = v20Var.p;
                    q50Var2.getClass();
                    s20 s20VarQ = s20Var.q();
                    if (s20VarQ != null) {
                        s20VarQ.ah.g = 0;
                    }
                    q50Var2.l = Integer.MAX_VALUE;
                    kf0.h(placementScope, q50Var2, (int) (j >> 32), (int) (4294967295L & j));
                }
            }
            q50 q50Var3 = v20Var.p;
            if (q50Var3 == null || q50Var3.n) {
                z2 = false;
            }
            if (z2) {
                sy.b("Error: Placement happened before lookahead.");
            }
            bo(j, f, cvVar);
        } catch (Throwable th) {
            s20Var.as(th);
            throw null;
        }
    }

    public final void bi() {
        boolean z = this.u;
        this.u = true;
        s20 s20Var = this.i.a;
        da0 da0Var = s20Var.ag;
        if (!z) {
            ((yy) da0Var.g).P();
            if (s20Var.m()) {
                s20.ap(s20Var, true, 6);
            } else if (s20Var.ah.d) {
                s20.an(s20Var, true, 6);
            }
        }
        fa0 fa0Var = ((yy) da0Var.g).s;
        for (fa0 fa0Var2 = (fa0) da0Var.h; !f00.h(fa0Var2, fa0Var) && fa0Var2 != null; fa0Var2 = fa0Var2.s) {
            if (fa0Var2.ak) {
                fa0Var2.K();
            }
        }
        a90 a90VarU = s20Var.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            s20 s20Var2 = (s20) objArr[i2];
            if (s20Var2.r() != Integer.MAX_VALUE) {
                s20Var2.ah.o.bi();
                s20.aq(s20Var2);
            }
        }
    }

    public final void bj() {
        if (this.u) {
            this.u = false;
            v20 v20Var = this.i;
            da0 da0Var = v20Var.a.ag;
            fa0 fa0Var = ((yy) da0Var.g).s;
            for (fa0 fa0Var2 = (fa0) da0Var.h; !f00.h(fa0Var2, fa0Var) && fa0Var2 != null; fa0Var2 = fa0Var2.s) {
                i70 i70VarF = fa0Var2.F(ga0.g(1048576));
                if (i70VarF != null && (i70VarF.d.g & 1048576) != 0) {
                    boolean zG = ga0.g(1048576);
                    i70 i70VarD = fa0Var2.D();
                    if (zG || (i70VarD = i70VarD.h) != null) {
                        for (i70 i70VarF2 = fa0Var2.F(zG); i70VarF2 != null && (i70VarF2.g & 1048576) != 0; i70VarF2 = i70VarF2.i) {
                            if ((i70VarF2.f & 1048576) != 0) {
                                i70 i70VarM = i70VarF2;
                                a90 a90Var = null;
                                while (i70VarM != null) {
                                    if ((i70VarM.f & 1048576) != 0 && (i70VarM instanceof rl)) {
                                        int i = 0;
                                        for (i70 i70Var = ((rl) i70VarM).s; i70Var != null; i70Var = i70Var.i) {
                                            if ((i70Var.f & 1048576) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    i70VarM = i70Var;
                                                } else {
                                                    if (a90Var == null) {
                                                        a90Var = new a90(new i70[16]);
                                                    }
                                                    if (i70VarM != null) {
                                                        a90Var.b(i70VarM);
                                                        i70VarM = null;
                                                    }
                                                    a90Var.b(i70Var);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    i70VarM = pk.m(a90Var);
                                }
                            }
                            if (i70VarF2 != i70VarD) {
                            }
                        }
                    }
                }
                fa0Var2.V();
            }
            a90 a90VarU = v20Var.a.u();
            Object[] objArr = a90VarU.d;
            int i2 = a90VarU.f;
            for (int i3 = 0; i3 < i2; i3++) {
                ((s20) objArr[i3]).ah.o.bj();
            }
        }
    }

    public final void bk() {
        v20 v20Var = this.i;
        if (v20Var.k > 0) {
            a90 a90VarU = v20Var.a.u();
            Object[] objArr = a90VarU.d;
            int i = a90VarU.f;
            for (int i2 = 0; i2 < i; i2++) {
                s20 s20Var = (s20) objArr[i2];
                v20 v20Var2 = s20Var.ah;
                boolean z = v20Var2.i;
                o60 o60Var = v20Var2.o;
                if ((z || v20Var2.j) && !o60Var.x) {
                    s20Var.ao(false);
                }
                o60Var.bk();
            }
        }
    }

    public final void bl() {
        v20 v20Var = this.i;
        s20.ap(v20Var.a, false, 7);
        s20 s20Var = v20Var.a;
        s20 s20VarQ = s20Var.q();
        if (s20VarQ == null || s20Var.ad != q20.f) {
            return;
        }
        int iOrdinal = s20VarQ.ah.c.ordinal();
        s20Var.ad = iOrdinal != 0 ? iOrdinal != 2 ? s20VarQ.ad : q20.e : q20.d;
    }

    public final void bm() {
        this.ah = true;
        v20 v20Var = this.i;
        s20 s20VarQ = v20Var.a.q();
        float f = p().ad;
        s20 s20Var = v20Var.a;
        da0 da0Var = s20Var.ag;
        fa0 fa0Var = (fa0) da0Var.h;
        yy yyVar = (yy) da0Var.g;
        while (fa0Var != yyVar) {
            fa0Var.getClass();
            n20 n20Var = (n20) fa0Var;
            f += n20Var.ad;
            fa0Var = n20Var.s;
        }
        if (f != this.ag) {
            this.ag = f;
            if (s20VarQ != null) {
                s20VarQ.ak();
            }
            if (s20VarQ != null) {
                s20VarQ.x();
            }
        }
        if (this.u) {
            ((yy) s20Var.ag.g).P();
        } else {
            if (s20VarQ != null) {
                s20VarQ.x();
            }
            bi();
            if (this.j && s20VarQ != null) {
                s20VarQ.ao(false);
            }
        }
        if (s20VarQ != null) {
            v20 v20Var2 = s20VarQ.ah;
            if (!this.j && v20Var2.c == p20.f) {
                if (this.l != Integer.MAX_VALUE) {
                    sy.b("Place was called on a node which was placed already");
                }
                int i = v20Var2.h;
                this.l = i;
                v20Var2.h = i + 1;
            }
        } else {
            this.l = 0;
        }
        s();
    }

    public final void bn(long j) {
        v20 v20Var = this.i;
        p20 p20Var = v20Var.c;
        s20 s20Var = v20Var.a;
        p20 p20Var2 = p20.h;
        if (p20Var != p20Var2) {
            sy.b("layout state is not idle before measure starts");
        }
        this.ad = j;
        p20 p20Var3 = p20.d;
        v20Var.c = p20Var3;
        this.w = false;
        td0 snapshotObserver = t1.as(s20Var).getSnapshotObserver();
        snapshotObserver.a(s20Var, snapshotObserver.c, this.ae);
        if (v20Var.c == p20Var3) {
            this.x = true;
            this.y = true;
            v20Var.c = p20Var2;
        }
    }

    public final void bo(long j, float f, cv cvVar) {
        v20 v20Var = this.i;
        s20 s20Var = v20Var.a;
        s20 s20Var2 = v20Var.a;
        if (s20Var.ao) {
            sy.a("place is called on a deactivated node");
        }
        v20Var.c = p20.f;
        this.p = j;
        this.r = f;
        this.q = cvVar;
        this.ah = false;
        b1 b1VarAs = t1.as(s20Var2);
        if (this.x || !this.u) {
            this.z.e = false;
            v20Var.f(false);
            this.ai = cvVar;
            this.aj = j;
            this.ak = f;
            td0 snapshotObserver = b1VarAs.getSnapshotObserver();
            snapshotObserver.a(s20Var2, snapshotObserver.f, this.al);
        } else {
            fa0 fa0VarA = v20Var.a();
            fa0VarA.T(pz.c(j, fa0VarA.h), f, cvVar);
            bm();
        }
        v20Var.c = p20.h;
        this.n = true;
    }

    public final boolean bp(long j) {
        v20 v20Var = this.i;
        s20 s20Var = v20Var.a;
        s20 s20Var2 = v20Var.a;
        try {
            if (s20Var.ao) {
                sy.a("measure is called on a deactivated node");
            }
            b1 b1VarAs = t1.as(s20Var2);
            s20 s20VarQ = s20Var2.q();
            boolean z = true;
            s20Var2.af = s20Var2.af || (s20VarQ != null && s20VarQ.af);
            if (!s20Var2.m() && dh.b(this.g, j)) {
                b1VarAs.k(s20Var2, false);
                s20Var2.ar();
                return false;
            }
            this.z.d = false;
            a90 a90VarU = s20Var2.u();
            Object[] objArr = a90VarU.d;
            int i = a90VarU.f;
            for (int i2 = 0; i2 < i; i2++) {
                ((s20) objArr[i2]).ah.o.z.getClass();
            }
            this.m = true;
            long j2 = v20Var.a().f;
            bf(j);
            bn(j);
            if (wz.a(v20Var.a().f, j2) && v20Var.a().d == this.d && v20Var.a().e == this.e) {
                z = false;
            }
            bd((((long) v20Var.a().e) & 4294967295L) | (((long) v20Var.a().d) << 32));
            return z;
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
        q20 q20Var2 = s20Var.ad;
        q20 q20Var3 = q20.f;
        if (q20Var2 == q20Var3) {
            s20Var.c();
        }
        if (t1.ai(s20Var2)) {
            q50 q50Var = v20Var.p;
            q50Var.getClass();
            q50Var.m = q20Var3;
            q50Var.e(j);
        }
        s20 s20VarQ = s20Var2.q();
        if (s20VarQ != null) {
            v20 v20Var2 = s20VarQ.ah;
            if (this.o != q20Var3 && !s20Var2.af) {
                sy.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = v20Var2.c.ordinal();
            if (iOrdinal == 0) {
                q20Var = q20.d;
            } else {
                if (iOrdinal != 2) {
                    wc.m(v20Var2.c, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                q20Var = q20.e;
            }
            this.o = q20Var;
        } else {
            this.o = q20Var3;
        }
        bp(j);
        return this;
    }

    @Override // defpackage.k60
    public final int f(int i) {
        v20 v20Var = this.i;
        if (!t1.ai(v20Var.a)) {
            bl();
            return v20Var.a().f(i);
        }
        q50 q50Var = v20Var.p;
        q50Var.getClass();
        return q50Var.f(i);
    }

    @Override // defpackage.lf0, defpackage.k60
    public final Object j() {
        return this.t;
    }

    @Override // defpackage.I1
    public final void n(l1 l1Var) {
        a90 a90VarU = this.i.a.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            l1Var.g(((s20) objArr[i2]).ah.o);
        }
    }

    @Override // defpackage.t70
    public final void o(boolean z) {
        v20 v20Var = this.i;
        if (z != v20Var.a().l) {
            v20Var.a().l = z;
            this.am = true;
        }
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
        return v20Var.o;
    }

    @Override // defpackage.I1
    public final void requestLayout() {
        this.i.a.ao(false);
    }

    @Override // defpackage.I1
    public final void s() {
        this.ac = true;
        t20 t20Var = this.z;
        t20Var.h();
        boolean z = this.x;
        v20 v20Var = this.i;
        if (z) {
            a90 a90VarU = v20Var.a.u();
            Object[] objArr = a90VarU.d;
            int i = a90VarU.f;
            for (int i2 = 0; i2 < i; i2++) {
                s20 s20Var = (s20) objArr[i2];
                if (s20Var.m() && s20Var.n() == q20.d && s20.al(s20Var)) {
                    s20.ap(v20Var.a, false, 7);
                }
            }
        }
        if (this.y || (!p().n && this.x)) {
            this.x = false;
            p20 p20Var = v20Var.c;
            v20Var.c = p20.f;
            v20Var.g(false);
            s20 s20Var2 = v20Var.a;
            td0 snapshotObserver = t1.as(s20Var2).getSnapshotObserver();
            snapshotObserver.a(s20Var2, snapshotObserver.e, this.af);
            v20Var.c = p20Var;
            if (p().n && v20Var.i) {
                requestLayout();
            }
            this.y = false;
        }
        if (t20Var.b && t20Var.e()) {
            t20Var.g();
        }
        this.ac = false;
    }

    @Override // defpackage.I1
    public final boolean t() {
        return this.u;
    }
}

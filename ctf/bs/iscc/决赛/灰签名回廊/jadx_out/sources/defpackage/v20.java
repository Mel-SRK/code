package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v20 {
    public final s20 a;
    public boolean b;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public q50 p;
    public p20 c = p20.h;
    public final o60 o = new o60(this);

    public v20(s20 s20Var) {
        this.a = s20Var;
    }

    public final fa0 a() {
        return (fa0) this.a.ag.h;
    }

    public final void b() {
        p20 p20Var = this.a.ah.c;
        p20 p20Var2 = p20.f;
        p20 p20Var3 = p20.g;
        if (p20Var == p20Var2 || p20Var == p20Var3) {
            if (this.o.ac) {
                g(true);
            } else {
                f(true);
            }
        }
        if (p20Var == p20Var3) {
            q50 q50Var = this.p;
            if (q50Var == null || !q50Var.w) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        q50 q50Var = this.p;
        if (q50Var != null) {
            v20 v20Var = q50Var.i;
            v20Var.c = p20.e;
            s20 s20Var = v20Var.a;
            v20Var.d = false;
            td0 snapshotObserver = t1.as(s20Var).getSnapshotObserver();
            o50 o50Var = new o50(q50Var, j);
            snapshotObserver.getClass();
            if (s20Var.j != null) {
                snapshotObserver.a(s20Var, snapshotObserver.b, o50Var);
            } else {
                snapshotObserver.a(s20Var, snapshotObserver.c, o50Var);
            }
            v20Var.e = true;
            v20Var.f = true;
            boolean zAi = t1.ai(s20Var);
            o60 o60Var = v20Var.o;
            if (zAi) {
                o60Var.x = true;
                o60Var.y = true;
            } else {
                o60Var.w = true;
            }
            v20Var.c = p20.h;
        }
    }

    public final void d(int i) {
        int i2 = this.k;
        this.k = i;
        if ((i2 == 0) != (i == 0)) {
            s20 s20VarQ = this.a.q();
            v20 v20Var = s20VarQ != null ? s20VarQ.ah : null;
            if (v20Var != null) {
                int i3 = v20Var.k;
                if (i == 0) {
                    v20Var.d(i3 - 1);
                } else {
                    v20Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.n;
        this.n = i;
        if ((i2 == 0) != (i == 0)) {
            s20 s20VarQ = this.a.q();
            v20 v20Var = s20VarQ != null ? s20VarQ.ah : null;
            if (v20Var != null) {
                int i3 = v20Var.n;
                if (i == 0) {
                    v20Var.e(i3 - 1);
                } else {
                    v20Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.i) {
                d(this.k + 1);
            } else {
                if (z || this.i) {
                    return;
                }
                d(this.k - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (z && !this.j) {
                d(this.k + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.k - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.l) {
                e(this.n + 1);
            } else {
                if (z || this.l) {
                    return;
                }
                e(this.n - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (z && !this.m) {
                e(this.n + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.n - 1);
            }
        }
    }

    public final void j() {
        o60 o60Var = this.o;
        v20 v20Var = o60Var.i;
        Object obj = o60Var.t;
        s20 s20Var = this.a;
        if ((obj != null || v20Var.a().j() != null) && o60Var.s) {
            o60Var.s = false;
            o60Var.t = v20Var.a().j();
            s20 s20VarQ = s20Var.q();
            if (s20VarQ != null) {
                s20.ap(s20VarQ, false, 7);
            }
        }
        q50 q50Var = this.p;
        if (q50Var != null) {
            v20 v20Var2 = q50Var.i;
            if (q50Var.y == null) {
                l50 l50VarB = v20Var2.a().B();
                l50VarB.getClass();
                if (l50VarB.r.j() == null) {
                    return;
                }
            }
            if (q50Var.x) {
                q50Var.x = false;
                l50 l50VarB2 = v20Var2.a().B();
                l50VarB2.getClass();
                q50Var.y = l50VarB2.r.j();
                if (t1.ai(s20Var)) {
                    s20 s20VarQ2 = s20Var.q();
                    if (s20VarQ2 != null) {
                        s20.ap(s20VarQ2, false, 7);
                        return;
                    }
                    return;
                }
                s20 s20VarQ3 = s20Var.q();
                if (s20VarQ3 != null) {
                    s20.an(s20VarQ3, false, 7);
                }
            }
        }
    }
}

package defpackage;

import android.graphics.Rect;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class k3 implements gg0 {
    public c30 a;
    public hs0 b;
    public i30 c;
    public hq0 d;

    @Override // defpackage.gg0
    public final void a(lw0 lw0Var, ey eyVar, g5 g5Var, wi wiVar) {
        j(new f3(lw0Var, this, eyVar, g5Var, wiVar, 0));
    }

    @Override // defpackage.gg0
    public final void b() {
        j(null);
    }

    @Override // defpackage.gg0
    public final void c(lw0 lw0Var, lw0 lw0Var2) {
        i30 i30Var = this.c;
        if (i30Var != null) {
            boolean z = (hx0.a(i30Var.h.b, lw0Var2.b) && f00.h(i30Var.h.c, lw0Var2.c)) ? false : true;
            i30Var.h = lw0Var2;
            int size = i30Var.j.size();
            for (int i = 0; i < size; i++) {
                oi0 oi0Var = (oi0) ((WeakReference) i30Var.j.get(i)).get();
                if (oi0Var != null) {
                    oi0Var.g = lw0Var2;
                }
            }
            d30 d30Var = i30Var.m;
            synchronized (d30Var.c) {
                d30Var.j = null;
                d30Var.l = null;
                d30Var.k = null;
                d30Var.m = null;
                d30Var.n = null;
            }
            if (f00.h(lw0Var, lw0Var2)) {
                if (z) {
                    cz czVar = i30Var.b;
                    int iE = hx0.e(lw0Var2.b);
                    int iD = hx0.d(lw0Var2.b);
                    hx0 hx0Var = i30Var.h.c;
                    int iE2 = hx0Var != null ? hx0.e(hx0Var.a) : -1;
                    hx0 hx0Var2 = i30Var.h.c;
                    czVar.a().updateSelection(czVar.b, iE, iD, iE2, hx0Var2 != null ? hx0.d(hx0Var2.a) : -1);
                    return;
                }
                return;
            }
            if (lw0Var != null && (!f00.h(lw0Var.a.e, lw0Var2.a.e) || (hx0.a(lw0Var.b, lw0Var2.b) && !f00.h(lw0Var.c, lw0Var2.c)))) {
                cz czVar2 = i30Var.b;
                czVar2.a().restartInput(czVar2.b);
                return;
            }
            int size2 = i30Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                oi0 oi0Var2 = (oi0) ((WeakReference) i30Var.j.get(i2)).get();
                if (oi0Var2 != null) {
                    lw0 lw0Var3 = i30Var.h;
                    cz czVar3 = i30Var.b;
                    if (oi0Var2.k) {
                        oi0Var2.g = lw0Var3;
                        if (oi0Var2.i) {
                            czVar3.a().updateExtractedText(czVar3.b, oi0Var2.h, t1.f(lw0Var3));
                        }
                        hx0 hx0Var3 = lw0Var3.c;
                        long j = lw0Var3.b;
                        int iE3 = hx0Var3 != null ? hx0.e(hx0Var3.a) : -1;
                        hx0 hx0Var4 = lw0Var3.c;
                        czVar3.a().updateSelection(czVar3.b, hx0.e(j), hx0.d(j), iE3, hx0Var4 != null ? hx0.d(hx0Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.gg0
    public final void d() {
        sr0 sr0Var;
        c30 c30Var = this.a;
        if (c30Var == null || (sr0Var = (sr0) i60.ab(c30Var, og.p)) == null) {
            return;
        }
        ((sl) sr0Var).b();
    }

    @Override // defpackage.gg0
    public final void e() {
        sr0 sr0Var;
        c30 c30Var = this.a;
        if (c30Var == null || (sr0Var = (sr0) i60.ab(c30Var, og.p)) == null) {
            return;
        }
        ((sl) sr0Var).a();
    }

    @Override // defpackage.gg0
    public final void f(lw0 lw0Var, ab0 ab0Var, zw0 zw0Var, l1 l1Var, ri0 ri0Var, ri0 ri0Var2) {
        i30 i30Var = this.c;
        if (i30Var != null) {
            d30 d30Var = i30Var.m;
            synchronized (d30Var.c) {
                try {
                    d30Var.j = lw0Var;
                    d30Var.l = ab0Var;
                    d30Var.k = zw0Var;
                    d30Var.m = ri0Var;
                    d30Var.n = ri0Var2;
                    if (d30Var.e || d30Var.d) {
                        d30Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.gg0
    public final void g() {
        hs0 hs0Var = this.b;
        if (hs0Var != null) {
            hs0Var.a(null);
        }
        this.b = null;
        u80 u80VarI = i();
        if (u80VarI != null) {
            hq0 hq0Var = (hq0) u80VarI;
            synchronized (hq0Var) {
                hq0Var.u(hq0Var.o() + ((long) hq0Var.n), hq0Var.m, hq0Var.o() + ((long) hq0Var.n), hq0Var.o() + ((long) hq0Var.n) + ((long) hq0Var.o));
            }
        }
    }

    @Override // defpackage.gg0
    public final void h(ri0 ri0Var) {
        Rect rect;
        i30 i30Var = this.c;
        if (i30Var != null) {
            i30Var.l = new Rect(i60.ax(ri0Var.a), i60.ax(ri0Var.b), i60.ax(ri0Var.c), i60.ax(ri0Var.d));
            if (!i30Var.j.isEmpty() || (rect = i30Var.l) == null) {
                return;
            }
            i30Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final u80 i() {
        hq0 hq0Var = this.d;
        if (hq0Var != null) {
            return hq0Var;
        }
        if (!it0.a) {
            return null;
        }
        hq0 hq0VarF = pk.f(2, m9.f);
        this.d = hq0VarF;
        return hq0VarF;
    }

    public final void j(f3 f3Var) {
        c30 c30Var = this.a;
        if (c30Var == null) {
            return;
        }
        this.b = c30Var.q ? i60.an(c30Var.bi(), null, new c(c30Var, new j3(f3Var, this, c30Var, hs0Var, 0), hs0Var, 15), 1) : null;
    }

    public final void k(c30 c30Var) {
        if (this.a == c30Var) {
            this.a = null;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected textInputModifierNode to be ");
        sb.append(c30Var);
        c30 c30Var2 = this.a;
        sb.append(" but was ");
        sb.append(c30Var2);
        throw new IllegalStateException(sb.toString().toString());
    }
}

package defpackage;

import android.view.ActionMode;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cw0 {
    public final vz0 a;
    public h30 d;
    public gc f;
    public ox0 g;
    public ix h;
    public ys i;
    public final me0 j;
    public final me0 k;
    public long l;
    public Integer m;
    public long n;
    public final me0 o;
    public final me0 p;
    public int q;
    public lw0 r;
    public nq0 s;
    public final aw0 t;
    public final bu u;
    public ab0 b = pk.h;
    public cv c = yv0.g;
    public final me0 e = bo0.m(new lw0((String) null, 0, 7));

    public cw0(vz0 vz0Var) {
        this.a = vz0Var;
        Boolean bool = Boolean.TRUE;
        this.j = bo0.m(bool);
        this.k = bo0.m(bool);
        this.l = 0L;
        this.n = 0L;
        this.o = bo0.m(null);
        this.p = bo0.m(null);
        this.q = -1;
        this.r = new lw0((String) null, 0L, 7);
        this.t = new aw0(this, 1);
        this.u = new bu(25, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(defpackage.cw0 r22, defpackage.lw0 r23, long r24, boolean r26, boolean r27, defpackage.wc r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw0.a(cw0, lw0, long, boolean, boolean, wc, boolean):long");
    }

    public static lw0 c(b6 b6Var, long j) {
        return new lw0(b6Var, j, (hx0) null);
    }

    public final void b(boolean z) {
        if (hx0.b(j().b)) {
            return;
        }
        gc gcVar = this.f;
        if (gcVar != null) {
            ((h0) gcVar).a(qo0.h(j()));
        }
        if (z) {
            int iD = hx0.d(j().b);
            this.c.g(c(j().a, wo0.b(iD, iD)));
            n(xw.d);
        }
    }

    public final void d() {
        if (hx0.b(j().b)) {
            return;
        }
        gc gcVar = this.f;
        if (gcVar != null) {
            ((h0) gcVar).a(qo0.h(j()));
        }
        b6 b6VarJ = qo0.j(j(), j().a.e.length());
        b6 b6VarI = qo0.i(j(), j().a.e.length());
        z5 z5Var = new z5(b6VarJ);
        z5Var.a(b6VarI);
        b6 b6VarB = z5Var.b();
        int iE = hx0.e(j().b);
        this.c.g(c(b6VarB, wo0.b(iE, iE)));
        n(xw.d);
        this.a.e = true;
    }

    public final void e(xa0 xa0Var) {
        if (!hx0.b(j().b)) {
            h30 h30Var = this.d;
            ax0 ax0VarD = h30Var != null ? h30Var.d() : null;
            int iD = (xa0Var == null || ax0VarD == null) ? hx0.d(j().b) : this.b.b(ax0VarD.b(xa0Var.a, true));
            this.c.g(lw0.a(j(), null, wo0.b(iD, iD), 5));
        }
        n((xa0Var == null || j().a.e.length() <= 0) ? xw.d : xw.f);
        p(false);
    }

    public final void f(boolean z) {
        ys ysVar;
        h30 h30Var = this.d;
        if (h30Var != null && !h30Var.b() && (ysVar = this.i) != null) {
            ysVar.a(new yv0(1, 25));
        }
        this.r = j();
        p(z);
        n(xw.e);
    }

    public final xa0 g() {
        return (xa0) this.p.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final long i(boolean z) {
        ax0 ax0VarD;
        long j;
        h30 h30Var = this.d;
        if (h30Var == null || (ax0VarD = h30Var.d()) == null) {
            return 9205357640488583168L;
        }
        zw0 zw0Var = ax0VarD.a;
        h30 h30Var2 = this.d;
        b6 b6Var = h30Var2 != null ? h30Var2.a.a : null;
        if (b6Var == null) {
            return 9205357640488583168L;
        }
        if (!f00.h(b6Var.e, zw0Var.a.a.e)) {
            return 9205357640488583168L;
        }
        lw0 lw0VarJ = j();
        if (z) {
            long j2 = lw0VarJ.b;
            int i = hx0.c;
            j = j2 >> 32;
        } else {
            long j3 = lw0VarJ.b;
            int i2 = hx0.c;
            j = j3 & 4294967295L;
        }
        int iD = this.b.d((int) j);
        boolean zF = hx0.f(j().b);
        int iE = zw0Var.e(iD);
        long j4 = zw0Var.c;
        y70 y70Var = zw0Var.b;
        if (iE >= y70Var.f) {
            return 9205357640488583168L;
        }
        boolean z2 = zw0Var.a(((!z || zF) && (z || !zF)) ? Math.max(iD + (-1), 0) : iD) == zw0Var.i(iD);
        y70Var.i(iD);
        int length = ((b6) y70Var.a.b).e.length();
        ArrayList arrayList = y70Var.h;
        ce0 ce0Var = (ce0) arrayList.get(iD == length ? f00.v(arrayList) : e00.t(iD, arrayList));
        o3 o3Var = ce0Var.a;
        int iD2 = ce0Var.d(iD);
        xw0 xw0Var = o3Var.d;
        return d41.h(i60.s(z2 ? xw0Var.h(iD2, false) : xw0Var.i(iD2, false), 0.0f, (int) (j4 >> 32)), i60.s(y70Var.b(iE), 0.0f, (int) (4294967295L & j4)));
    }

    public final lw0 j() {
        return (lw0) this.e.getValue();
    }

    public final void k() {
        ox0 ox0Var = this.g;
        if ((ox0Var != null ? ((v4) ox0Var).d : null) != px0.d || ox0Var == null) {
            return;
        }
        v4 v4Var = (v4) ox0Var;
        v4Var.d = px0.e;
        ActionMode actionMode = v4Var.b;
        if (actionMode != null) {
            actionMode.finish();
        }
        v4Var.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw0.l():void");
    }

    public final void m() {
        lw0 lw0VarC = c(j().a, wo0.b(0, j().a.e.length()));
        this.c.g(lw0VarC);
        this.r = lw0.a(this.r, null, lw0VarC.b, 5);
        f(true);
    }

    public final void n(xw xwVar) {
        h30 h30Var = this.d;
        if (h30Var != null) {
            if (h30Var.a() == xwVar) {
                h30Var = null;
            }
            if (h30Var != null) {
                h30Var.k.setValue(xwVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw0.o():void");
    }

    public final void p(boolean z) {
        h30 h30Var = this.d;
        if (h30Var != null) {
            h30Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            o();
        } else {
            k();
        }
    }
}

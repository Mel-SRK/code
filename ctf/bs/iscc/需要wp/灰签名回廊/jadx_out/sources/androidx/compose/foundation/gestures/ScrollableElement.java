package androidx.compose.foundation.gestures;

import defpackage.a0;
import defpackage.f00;
import defpackage.f1;
import defpackage.f50;
import defpackage.g80;
import defpackage.i70;
import defpackage.in0;
import defpackage.jn0;
import defpackage.lh;
import defpackage.n5;
import defpackage.n70;
import defpackage.q6;
import defpackage.qd0;
import defpackage.rn0;
import defpackage.wc0;
import defpackage.zt0;

/* JADX INFO: loaded from: classes.dex */
final class ScrollableElement extends n70 {
    public final jn0 a;
    public final wc0 b;
    public final qd0 c;
    public final boolean d;
    public final boolean e;
    public final g80 f;

    public ScrollableElement(g80 g80Var, wc0 wc0Var, qd0 qd0Var, jn0 jn0Var, boolean z, boolean z2) {
        this.a = jn0Var;
        this.b = wc0Var;
        this.c = qd0Var;
        this.d = z;
        this.e = z2;
        this.f = g80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return f00.h(this.a, scrollableElement.a) && this.b == scrollableElement.b && f00.h(this.c, scrollableElement.c) && this.d == scrollableElement.d && this.e == scrollableElement.e && f00.h(this.f, scrollableElement.f);
    }

    @Override // defpackage.n70
    public final i70 f() {
        return new in0(this.f, this.b, this.c, this.a, this.d, this.e);
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        boolean z;
        zt0 zt0Var;
        in0 in0Var = (in0) i70Var;
        rn0 rn0Var = in0Var.af;
        boolean z2 = in0Var.v;
        boolean z3 = this.d;
        boolean z4 = true;
        boolean z5 = false;
        if (z2 != z3) {
            in0Var.ag.b = z3;
            in0Var.ad.r = z3;
            z = true;
        } else {
            z = false;
        }
        f1 f1Var = in0Var.ae;
        a0 a0Var = in0Var.ac;
        jn0 jn0Var = rn0Var.a;
        jn0 jn0Var2 = this.a;
        if (!f00.h(jn0Var, jn0Var2)) {
            rn0Var.a = jn0Var2;
            z5 = true;
        }
        qd0 qd0Var = this.c;
        rn0Var.b = qd0Var;
        wc0 wc0Var = rn0Var.d;
        wc0 wc0Var2 = this.b;
        if (wc0Var != wc0Var2) {
            rn0Var.d = wc0Var2;
            z5 = true;
        }
        boolean z6 = rn0Var.e;
        boolean z7 = this.e;
        if (z6 != z7) {
            rn0Var.e = z7;
            z5 = true;
        }
        rn0Var.c = f1Var;
        rn0Var.f = a0Var;
        lh lhVar = in0Var.ah;
        lhVar.r = wc0Var2;
        lhVar.t = z7;
        in0Var.ab = qd0Var;
        f50 f50Var = f50.y;
        wc0 wc0Var3 = rn0Var.d;
        wc0 wc0Var4 = wc0.d;
        if (wc0Var3 != wc0Var4) {
            wc0Var4 = wc0.e;
        }
        in0Var.u = f50Var;
        if (in0Var.v != z3) {
            in0Var.v = z3;
            if (!z3) {
                in0Var.O1();
                zt0 zt0Var2 = in0Var.aa;
                if (zt0Var2 != null) {
                    in0Var.bv(zt0Var2);
                }
                in0Var.aa = null;
            }
            z5 = true;
        }
        g80 g80Var = in0Var.w;
        g80 g80Var2 = this.f;
        if (!f00.h(g80Var, g80Var2)) {
            in0Var.O1();
            in0Var.w = g80Var2;
        }
        if (in0Var.t != wc0Var4) {
            in0Var.t = wc0Var4;
        } else {
            z4 = z5;
        }
        if (z4 && (zt0Var = in0Var.aa) != null) {
            zt0Var.bw();
        }
        if (z) {
            in0Var.aj = null;
            in0Var.ak = null;
            q6.j(in0Var);
        }
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        qd0 qd0Var = this.c;
        int iE = n5.e(n5.e((iHashCode + (qd0Var != null ? qd0Var.hashCode() : 0)) * 31, 31, this.d), 961, this.e);
        g80 g80Var = this.f;
        return (iE + (g80Var != null ? g80Var.hashCode() : 0)) * 31;
    }
}

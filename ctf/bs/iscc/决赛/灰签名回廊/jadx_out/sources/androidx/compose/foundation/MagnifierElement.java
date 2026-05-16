package androidx.compose.foundation;

import android.view.View;
import defpackage.cp0;
import defpackage.e00;
import defpackage.em;
import defpackage.f00;
import defpackage.gw0;
import defpackage.hw0;
import defpackage.i70;
import defpackage.mn;
import defpackage.n5;
import defpackage.n70;
import defpackage.pk;
import defpackage.sf0;
import defpackage.t50;
import defpackage.u50;

/* JADX INFO: loaded from: classes.dex */
public final class MagnifierElement extends n70 {
    public final gw0 a;
    public final hw0 b;
    public final sf0 c;

    public MagnifierElement(gw0 gw0Var, hw0 hw0Var, sf0 sf0Var) {
        this.a = gw0Var;
        this.b = hw0Var;
        this.c = sf0Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.n70
    public final i70 f() {
        return new t50(this.a, this.b, this.c);
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        t50 t50Var = (t50) i70Var;
        t50Var.getClass();
        sf0 sf0Var = t50Var.t;
        View view = t50Var.u;
        em emVar = t50Var.v;
        t50Var.r = this.a;
        t50Var.s = this.b;
        sf0 sf0Var2 = this.c;
        t50Var.t = sf0Var2;
        View viewAg = e00.ag(t50Var);
        em emVar2 = pk.ay(t50Var).z;
        if (t50Var.w != null) {
            cp0 cp0Var = u50.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !sf0Var2.a()) || !mn.a(Float.NaN, Float.NaN) || !mn.a(Float.NaN, Float.NaN) || !sf0Var2.equals(sf0Var) || !viewAg.equals(view) || !f00.h(emVar2, emVar)) {
                t50Var.bv();
            }
        }
        t50Var.bw();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + n5.e(n5.b(Float.NaN, n5.b(Float.NaN, n5.d(n5.e(n5.b(Float.NaN, this.a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}

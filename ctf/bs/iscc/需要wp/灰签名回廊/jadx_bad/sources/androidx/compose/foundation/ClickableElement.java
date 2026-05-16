package androidx.compose.foundation;

import defpackage.f00;
import defpackage.g80;
import defpackage.i70;
import defpackage.jt;
import defpackage.lt;
import defpackage.n5;
import defpackage.n70;
import defpackage.pu;
import defpackage.q6;
import defpackage.ql;
import defpackage.qy;
import defpackage.yb;

/* JADX INFO: loaded from: classes.dex */
final class ClickableElement extends n70 {
    public final g80 a;
    public final qy b;
    public final boolean c;
    public final String d;
    public final pu e;

    public ClickableElement(g80 g80Var, qy qyVar, boolean z, String str, pu puVar) {
        this.a = g80Var;
        this.b = qyVar;
        this.c = z;
        this.d = str;
        this.e = puVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return f00.h(this.a, clickableElement.a) && f00.h(this.b, clickableElement.b) && this.c == clickableElement.c && f00.h(this.d, clickableElement.d) && this.e == clickableElement.e;
    }

    @Override // defpackage.n70
    public final i70 f() {
        return new yb(this.a, this.b, this.c, this.d, this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    @Override // defpackage.n70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(i70 i70Var) {
        boolean z;
        ql qlVar;
        yb ybVar = (yb) i70Var;
        lt ltVar = ybVar.z;
        g80 g80Var = ybVar.ag;
        g80 g80Var2 = this.a;
        boolean z2 = true;
        boolean z3 = false;
        if (f00.h(g80Var, g80Var2)) {
            z = false;
        } else {
            ybVar.bx();
            ybVar.ag = g80Var2;
            ybVar.t = g80Var2;
            z = true;
        }
        qy qyVar = ybVar.u;
        qy qyVar2 = this.b;
        if (!f00.h(qyVar, qyVar2)) {
            ybVar.u = qyVar2;
            z = true;
        }
        boolean z4 = ybVar.w;
        boolean z5 = this.c;
        if (z4 != z5) {
            jt jtVar = ybVar.y;
            if (z5) {
                ybVar.bu(jtVar);
                ybVar.bu(ltVar);
            } else {
                ybVar.bv(jtVar);
                ybVar.bv(ltVar);
                ybVar.bx();
            }
            q6.j(ybVar);
            ybVar.w = z5;
        }
        String str = ybVar.v;
        String str2 = this.d;
        if (!f00.h(str, str2)) {
            ybVar.v = str2;
            q6.j(ybVar);
        }
        ybVar.x = this.e;
        boolean z6 = ybVar.ah;
        g80 g80Var3 = ybVar.ag;
        if (z6 == (g80Var3 == null && ybVar.u != null)) {
            z2 = z;
        } else {
            if (g80Var3 == null && ybVar.u != null) {
                z3 = true;
            }
            ybVar.ah = z3;
            if (z3 || ybVar.ab != null) {
            }
        }
        if (z2 && ((qlVar = ybVar.ab) != null || !ybVar.ah)) {
            if (qlVar != null) {
                ybVar.bv(qlVar);
            }
            ybVar.ab = null;
            ybVar.bz();
        }
        ltVar.bx(ybVar.t);
    }

    public final int hashCode() {
        g80 g80Var = this.a;
        int iHashCode = (g80Var != null ? g80Var.hashCode() : 0) * 31;
        qy qyVar = this.b;
        int iE = n5.e((iHashCode + (qyVar != null ? qyVar.hashCode() : 0)) * 31, 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 961);
    }
}

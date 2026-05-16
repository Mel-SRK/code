package androidx.compose.foundation;

import defpackage.f00;
import defpackage.g80;
import defpackage.i70;
import defpackage.n5;
import defpackage.n70;
import defpackage.pu;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.i70 r8) {
        /*
            r7 = this;
            yb r8 = (defpackage.yb) r8
            lt r0 = r8.z
            g80 r1 = r8.ag
            g80 r2 = r7.a
            boolean r1 = defpackage.f00.h(r1, r2)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L19
            r8.bx()
            r8.ag = r2
            r8.t = r2
            r1 = r3
            goto L1a
        L19:
            r1 = r4
        L1a:
            qy r2 = r8.u
            qy r5 = r7.b
            boolean r2 = defpackage.f00.h(r2, r5)
            if (r2 != 0) goto L27
            r8.u = r5
            r1 = r3
        L27:
            boolean r2 = r8.w
            boolean r5 = r7.c
            if (r2 == r5) goto L46
            jt r2 = r8.y
            if (r5 == 0) goto L38
            r8.bu(r2)
            r8.bu(r0)
            goto L41
        L38:
            r8.bv(r2)
            r8.bv(r0)
            r8.bx()
        L41:
            defpackage.q6.j(r8)
            r8.w = r5
        L46:
            java.lang.String r2 = r8.v
            java.lang.String r5 = r7.d
            boolean r2 = defpackage.f00.h(r2, r5)
            if (r2 != 0) goto L55
            r8.v = r5
            defpackage.q6.j(r8)
        L55:
            pu r2 = r7.e
            r8.x = r2
            boolean r2 = r8.ah
            g80 r5 = r8.ag
            if (r5 != 0) goto L65
            qy r6 = r8.u
            if (r6 == 0) goto L65
            r6 = r3
            goto L66
        L65:
            r6 = r4
        L66:
            if (r2 == r6) goto L78
            if (r5 != 0) goto L6f
            qy r2 = r8.u
            if (r2 == 0) goto L6f
            r4 = r3
        L6f:
            r8.ah = r4
            if (r4 != 0) goto L78
            ql r2 = r8.ab
            if (r2 != 0) goto L78
            goto L79
        L78:
            r3 = r1
        L79:
            if (r3 == 0) goto L8e
            ql r1 = r8.ab
            if (r1 != 0) goto L83
            boolean r2 = r8.ah
            if (r2 != 0) goto L8e
        L83:
            if (r1 == 0) goto L88
            r8.bv(r1)
        L88:
            r1 = 0
            r8.ab = r1
            r8.bz()
        L8e:
            g80 r8 = r8.t
            r0.bx(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableElement.g(i70):void");
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

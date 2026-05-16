package androidx.compose.ui.draw;

import defpackage.aq0;
import defpackage.d8;
import defpackage.f00;
import defpackage.fa0;
import defpackage.i70;
import defpackage.l1;
import defpackage.mn;
import defpackage.n5;
import defpackage.n70;
import defpackage.pk;
import defpackage.qc;
import defpackage.vh;

/* JADX INFO: loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends n70 {
    public final aq0 a;
    public final boolean b;
    public final long c;
    public final long d;

    public ShadowGraphicsLayerElement(aq0 aq0Var, boolean z, long j, long j2) {
        float f = vh.a;
        this.a = aq0Var;
        this.b = z;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        float f = vh.d;
        return mn.a(f, f) && f00.h(this.a, shadowGraphicsLayerElement.a) && this.b == shadowGraphicsLayerElement.b && qc.c(this.c, shadowGraphicsLayerElement.c) && qc.c(this.d, shadowGraphicsLayerElement.d);
    }

    @Override // defpackage.n70
    public final i70 f() {
        l1 l1Var = new l1(23, this);
        d8 d8Var = new d8();
        d8Var.r = l1Var;
        return d8Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        d8 d8Var = (d8) i70Var;
        d8Var.r = new l1(23, this);
        fa0 fa0Var = pk.aw(d8Var, 2).s;
        if (fa0Var != null) {
            fa0Var.c0(d8Var.r, true);
        }
    }

    public final int hashCode() {
        int iE = n5.e((this.a.hashCode() + (Float.hashCode(vh.d) * 31)) * 31, 31, this.b);
        int i = qc.h;
        return Long.hashCode(this.d) + n5.d(iE, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) mn.b(vh.d));
        sb.append(", shape=");
        sb.append(this.a);
        sb.append(", clip=");
        sb.append(this.b);
        sb.append(", ambientColor=");
        n5.k(this.c, sb, ", spotColor=");
        sb.append((Object) qc.i(this.d));
        sb.append(')');
        return sb.toString();
    }
}

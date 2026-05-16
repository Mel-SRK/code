package androidx.compose.foundation.layout;

import defpackage.i70;
import defpackage.mn;
import defpackage.n5;
import defpackage.n70;
import defpackage.vd0;
import defpackage.wc;

/* JADX INFO: loaded from: classes.dex */
final class PaddingElement extends n70 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public PaddingElement(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if ((f >= 0.0f || mn.a(f, Float.NaN)) && ((f2 >= 0.0f || mn.a(f2, Float.NaN)) && ((f3 >= 0.0f || mn.a(f3, Float.NaN)) && (f4 >= 0.0f || mn.a(f4, Float.NaN))))) {
            return;
        }
        wc.n("Padding must be non-negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && mn.a(this.a, paddingElement.a) && mn.a(this.b, paddingElement.b) && mn.a(this.c, paddingElement.c) && mn.a(this.d, paddingElement.d);
    }

    @Override // defpackage.n70
    public final i70 f() {
        vd0 vd0Var = new vd0();
        vd0Var.r = this.a;
        vd0Var.s = this.b;
        vd0Var.t = this.c;
        vd0Var.u = this.d;
        vd0Var.v = true;
        return vd0Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        vd0 vd0Var = (vd0) i70Var;
        vd0Var.r = this.a;
        vd0Var.s = this.b;
        vd0Var.t = this.c;
        vd0Var.u = this.d;
        vd0Var.v = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + n5.b(this.d, n5.b(this.c, n5.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}

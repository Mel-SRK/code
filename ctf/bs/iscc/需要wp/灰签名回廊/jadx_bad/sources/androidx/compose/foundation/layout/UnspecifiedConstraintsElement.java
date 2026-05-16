package androidx.compose.foundation.layout;

import defpackage.d01;
import defpackage.i70;
import defpackage.mn;
import defpackage.n70;

/* JADX INFO: loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends n70 {
    public final float a;
    public final float b;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return mn.a(this.a, unspecifiedConstraintsElement.a) && mn.a(this.b, unspecifiedConstraintsElement.b);
    }

    @Override // defpackage.n70
    public final i70 f() {
        d01 d01Var = new d01();
        d01Var.r = this.a;
        d01Var.s = this.b;
        return d01Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        d01 d01Var = (d01) i70Var;
        d01Var.r = this.a;
        d01Var.s = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}

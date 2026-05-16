package androidx.compose.foundation.layout;

import defpackage.i70;
import defpackage.n70;
import defpackage.w20;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutWeightElement extends n70 {
    public final float a;

    public LayoutWeightElement(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.a == layoutWeightElement.a;
    }

    @Override // defpackage.n70
    public final i70 f() {
        w20 w20Var = new w20();
        w20Var.r = this.a;
        w20Var.s = true;
        return w20Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        w20 w20Var = (w20) i70Var;
        w20Var.r = this.a;
        w20Var.s = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Float.hashCode(this.a) * 31);
    }
}

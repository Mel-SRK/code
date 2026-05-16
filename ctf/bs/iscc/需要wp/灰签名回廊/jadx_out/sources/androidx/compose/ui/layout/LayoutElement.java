package androidx.compose.ui.layout;

import defpackage.hv;
import defpackage.i70;
import defpackage.k20;
import defpackage.n70;

/* JADX INFO: loaded from: classes.dex */
final class LayoutElement extends n70 {
    public final hv a;

    public LayoutElement(hv hvVar) {
        this.a = hvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutElement) {
            return this.a == ((LayoutElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.n70
    public final i70 f() {
        k20 k20Var = new k20();
        k20Var.r = this.a;
        return k20Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        ((k20) i70Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

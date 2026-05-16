package androidx.compose.foundation;

import defpackage.f00;
import defpackage.g80;
import defpackage.i70;
import defpackage.lt;
import defpackage.n70;

/* JADX INFO: loaded from: classes.dex */
final class FocusableElement extends n70 {
    public final g80 a;

    public FocusableElement(g80 g80Var) {
        this.a = g80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return f00.h(this.a, ((FocusableElement) obj).a);
        }
        return false;
    }

    @Override // defpackage.n70
    public final i70 f() {
        return new lt(this.a);
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        ((lt) i70Var).bx(this.a);
    }

    public final int hashCode() {
        g80 g80Var = this.a;
        if (g80Var != null) {
            return g80Var.hashCode();
        }
        return 0;
    }
}

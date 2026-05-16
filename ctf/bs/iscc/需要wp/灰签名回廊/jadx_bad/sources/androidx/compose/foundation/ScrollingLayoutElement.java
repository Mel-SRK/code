package androidx.compose.foundation;

import defpackage.f00;
import defpackage.i70;
import defpackage.ln0;
import defpackage.n5;
import defpackage.n70;
import defpackage.ym0;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLayoutElement extends n70 {
    public final ym0 a;

    public ScrollingLayoutElement(ym0 ym0Var) {
        this.a = ym0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            return f00.h(this.a, ((ScrollingLayoutElement) obj).a);
        }
        return false;
    }

    @Override // defpackage.n70
    public final i70 f() {
        ln0 ln0Var = new ln0();
        ln0Var.r = this.a;
        ln0Var.s = true;
        return ln0Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        ln0 ln0Var = (ln0) i70Var;
        ln0Var.r = this.a;
        ln0Var.s = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + n5.e(this.a.hashCode() * 31, 31, false);
    }
}

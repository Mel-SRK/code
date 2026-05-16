package androidx.compose.foundation;

import defpackage.f00;
import defpackage.i70;
import defpackage.n5;
import defpackage.n70;
import defpackage.wm0;
import defpackage.ym0;

/* JADX INFO: loaded from: classes.dex */
final class ScrollSemanticsElement extends n70 {
    public final ym0 a;

    public ScrollSemanticsElement(ym0 ym0Var) {
        this.a = ym0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScrollSemanticsElement) && f00.h(this.a, ((ScrollSemanticsElement) obj).a);
    }

    @Override // defpackage.n70
    public final i70 f() {
        wm0 wm0Var = new wm0();
        wm0Var.r = this.a;
        wm0Var.s = true;
        return wm0Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        wm0 wm0Var = (wm0) i70Var;
        wm0Var.r = this.a;
        wm0Var.s = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + n5.e(n5.e(this.a.hashCode() * 31, 961, false), 31, true);
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.a + ", reverseScrolling=false, flingBehavior=null, isScrollable=true, isVertical=true)";
    }
}

package androidx.compose.ui.focus;

import defpackage.ct;
import defpackage.f00;
import defpackage.i70;
import defpackage.n70;
import defpackage.ys;

/* JADX INFO: loaded from: classes.dex */
final class FocusRequesterElement extends n70 {
    public final ys a;

    public FocusRequesterElement(ys ysVar) {
        this.a = ysVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && f00.h(this.a, ((FocusRequesterElement) obj).a);
    }

    @Override // defpackage.n70
    public final i70 f() {
        ct ctVar = new ct();
        ctVar.r = this.a;
        return ctVar;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        ct ctVar = (ct) i70Var;
        ctVar.r.a.i(ctVar);
        ys ysVar = this.a;
        ctVar.r = ysVar;
        ysVar.a.b(ctVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}

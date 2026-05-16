package androidx.compose.foundation.text.handwriting;

import defpackage.f00;
import defpackage.ht0;
import defpackage.i70;
import defpackage.n70;
import defpackage.pu;

/* JADX INFO: loaded from: classes.dex */
final class StylusHandwritingElementWithNegativePadding extends n70 {
    public final pu a;

    public StylusHandwritingElementWithNegativePadding(pu puVar) {
        this.a = puVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && f00.h(this.a, ((StylusHandwritingElementWithNegativePadding) obj).a);
    }

    @Override // defpackage.n70
    public final i70 f() {
        return new ht0(this.a);
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        ((ht0) i70Var).t = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.a + ')';
    }
}

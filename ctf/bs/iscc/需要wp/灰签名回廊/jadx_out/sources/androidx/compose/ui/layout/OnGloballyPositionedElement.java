package androidx.compose.ui.layout;

import defpackage.cv;
import defpackage.i70;
import defpackage.kb0;
import defpackage.n70;

/* JADX INFO: loaded from: classes.dex */
final class OnGloballyPositionedElement extends n70 {
    public final cv a;

    public OnGloballyPositionedElement(cv cvVar) {
        this.a = cvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.a == ((OnGloballyPositionedElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.n70
    public final i70 f() {
        kb0 kb0Var = new kb0();
        kb0Var.r = this.a;
        return kb0Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        ((kb0) i70Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

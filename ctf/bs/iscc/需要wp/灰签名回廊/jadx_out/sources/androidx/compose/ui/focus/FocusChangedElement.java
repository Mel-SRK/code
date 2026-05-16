package androidx.compose.ui.focus;

import defpackage.cv;
import defpackage.i70;
import defpackage.ks;
import defpackage.n70;

/* JADX INFO: loaded from: classes.dex */
final class FocusChangedElement extends n70 {
    public final cv a;

    public FocusChangedElement(cv cvVar) {
        this.a = cvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusChangedElement) {
            return this.a == ((FocusChangedElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.n70
    public final i70 f() {
        ks ksVar = new ks();
        ksVar.r = this.a;
        return ksVar;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        ((ks) i70Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

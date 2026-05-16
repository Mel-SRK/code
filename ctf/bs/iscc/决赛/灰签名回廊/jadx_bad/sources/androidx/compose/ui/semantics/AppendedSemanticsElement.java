package androidx.compose.ui.semantics;

import defpackage.cv;
import defpackage.i70;
import defpackage.n70;
import defpackage.ni;

/* JADX INFO: loaded from: classes.dex */
public final class AppendedSemanticsElement extends n70 {
    public final boolean a;
    public final cv b;

    public AppendedSemanticsElement(cv cvVar, boolean z) {
        this.a = z;
        this.b = cvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.a == appendedSemanticsElement.a && this.b == appendedSemanticsElement.b;
    }

    @Override // defpackage.n70
    public final i70 f() {
        ni niVar = new ni();
        niVar.r = this.a;
        niVar.s = this.b;
        return niVar;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        ni niVar = (ni) i70Var;
        niVar.r = this.a;
        niVar.s = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}

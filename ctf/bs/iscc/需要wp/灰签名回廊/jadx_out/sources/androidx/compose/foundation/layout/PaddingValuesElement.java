package androidx.compose.foundation.layout;

import defpackage.f00;
import defpackage.i70;
import defpackage.n70;
import defpackage.wd0;
import defpackage.xd0;

/* JADX INFO: loaded from: classes.dex */
final class PaddingValuesElement extends n70 {
    public final wd0 a;

    public PaddingValuesElement(wd0 wd0Var) {
        this.a = wd0Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return f00.h(this.a, paddingValuesElement.a);
    }

    @Override // defpackage.n70
    public final i70 f() {
        xd0 xd0Var = new xd0();
        xd0Var.r = this.a;
        return xd0Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        ((xd0) i70Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

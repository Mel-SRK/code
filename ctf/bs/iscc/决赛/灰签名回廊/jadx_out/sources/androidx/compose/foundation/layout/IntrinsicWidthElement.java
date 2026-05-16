package androidx.compose.foundation.layout;

import defpackage.d00;
import defpackage.i70;
import defpackage.n5;
import defpackage.n70;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicWidthElement extends n70 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) != null;
    }

    @Override // defpackage.n70
    public final i70 f() {
        d00 d00Var = new d00();
        d00Var.r = 2;
        d00Var.s = true;
        return d00Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        d00 d00Var = (d00) i70Var;
        d00Var.r = 2;
        d00Var.s = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (n5.n(2) * 31);
    }
}

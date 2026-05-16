package androidx.compose.ui.layout;

import defpackage.h20;
import defpackage.i70;
import defpackage.n70;

/* JADX INFO: loaded from: classes.dex */
final class LayoutIdElement extends n70 {
    public final String a;

    public LayoutIdElement(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.a.equals(((LayoutIdElement) obj).a);
    }

    @Override // defpackage.n70
    public final i70 f() {
        h20 h20Var = new h20();
        h20Var.r = this.a;
        return h20Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        ((h20) i70Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.a) + ')';
    }
}

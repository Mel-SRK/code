package androidx.compose.ui.layout;

import defpackage.gl0;
import defpackage.i70;
import defpackage.jz;
import defpackage.n70;
import defpackage.pk;
import defpackage.s20;

/* JADX INFO: loaded from: classes.dex */
final class RulerProviderModifierElement extends n70 {
    public final jz a;

    public RulerProviderModifierElement(jz jzVar) {
        this.a = jzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.a : null) == this.a;
    }

    @Override // defpackage.n70
    public final i70 f() {
        return new gl0(this.a);
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        gl0 gl0Var = (gl0) i70Var;
        jz jzVar = gl0Var.r;
        jz jzVar2 = this.a;
        if (jzVar != jzVar2) {
            gl0Var.r = jzVar2;
            s20.ap(pk.ay(gl0Var), false, 7);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

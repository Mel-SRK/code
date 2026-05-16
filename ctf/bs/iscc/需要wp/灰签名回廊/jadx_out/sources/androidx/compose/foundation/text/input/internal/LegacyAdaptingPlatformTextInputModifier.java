package androidx.compose.foundation.text.input.internal;

import defpackage.c30;
import defpackage.cw0;
import defpackage.f00;
import defpackage.h30;
import defpackage.i70;
import defpackage.k3;
import defpackage.n70;
import defpackage.wc;

/* JADX INFO: loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends n70 {
    public final k3 a;
    public final h30 b;
    public final cw0 c;

    public LegacyAdaptingPlatformTextInputModifier(k3 k3Var, h30 h30Var, cw0 cw0Var) {
        this.a = k3Var;
        this.b = h30Var;
        this.c = cw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return f00.h(this.a, legacyAdaptingPlatformTextInputModifier.a) && this.b.equals(legacyAdaptingPlatformTextInputModifier.b) && this.c.equals(legacyAdaptingPlatformTextInputModifier.c);
    }

    @Override // defpackage.n70
    public final i70 f() {
        return new c30(this.a, this.b, this.c);
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        c30 c30Var = (c30) i70Var;
        if (c30Var.q) {
            c30Var.r.g();
            c30Var.r.k(c30Var);
        }
        k3 k3Var = this.a;
        c30Var.r = k3Var;
        if (c30Var.q) {
            if (k3Var.a != null) {
                wc.q("Expected textInputModifierNode to be null");
                return;
            }
            k3Var.a = c30Var;
        }
        c30Var.s = this.b;
        c30Var.t = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}

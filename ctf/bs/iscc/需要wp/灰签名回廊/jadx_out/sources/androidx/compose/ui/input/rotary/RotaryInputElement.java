package androidx.compose.ui.input.rotary;

import defpackage.i70;
import defpackage.n70;
import defpackage.q0;
import defpackage.wk0;

/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends n70 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RotaryInputElement);
    }

    @Override // defpackage.n70
    public final i70 f() {
        q0 q0Var = q0.h;
        wk0 wk0Var = new wk0();
        wk0Var.r = q0Var;
        return wk0Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        ((wk0) i70Var).r = q0.h;
    }

    public final int hashCode() {
        return q0.h.hashCode() * 31;
    }
}

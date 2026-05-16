package androidx.compose.foundation.relocation;

import defpackage.f00;
import defpackage.i70;
import defpackage.n70;
import defpackage.t8;
import defpackage.u8;

/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewRequesterElement extends n70 {
    public final t8 a;

    public BringIntoViewRequesterElement(t8 t8Var) {
        this.a = t8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return f00.h(this.a, ((BringIntoViewRequesterElement) obj).a);
        }
        return false;
    }

    @Override // defpackage.n70
    public final i70 f() {
        u8 u8Var = new u8();
        u8Var.r = this.a;
        return u8Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        u8 u8Var = (u8) i70Var;
        t8 t8Var = u8Var.r;
        if (t8Var != null) {
            t8Var.a.i(u8Var);
        }
        t8 t8Var2 = this.a;
        if (t8Var2 != null) {
            t8Var2.a.b(u8Var);
        }
        u8Var.r = t8Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

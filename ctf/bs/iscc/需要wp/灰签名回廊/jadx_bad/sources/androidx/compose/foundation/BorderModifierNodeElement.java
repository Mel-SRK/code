package androidx.compose.foundation;

import defpackage.aq0;
import defpackage.f00;
import defpackage.i70;
import defpackage.k8;
import defpackage.mn;
import defpackage.n70;
import defpackage.vr0;
import defpackage.x9;

/* JADX INFO: loaded from: classes.dex */
public final class BorderModifierNodeElement extends n70 {
    public final float a;
    public final vr0 b;
    public final aq0 c;

    public BorderModifierNodeElement(float f, vr0 vr0Var, aq0 aq0Var) {
        this.a = f;
        this.b = vr0Var;
        this.c = aq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return mn.a(this.a, borderModifierNodeElement.a) && this.b.equals(borderModifierNodeElement.b) && f00.h(this.c, borderModifierNodeElement.c);
    }

    @Override // defpackage.n70
    public final i70 f() {
        return new k8(this.a, this.b, this.c);
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        k8 k8Var = (k8) i70Var;
        float f = k8Var.u;
        x9 x9Var = k8Var.x;
        float f2 = this.a;
        if (!mn.a(f, f2)) {
            k8Var.u = f2;
            x9Var.bu();
        }
        vr0 vr0Var = k8Var.v;
        vr0 vr0Var2 = this.b;
        if (!f00.h(vr0Var, vr0Var2)) {
            k8Var.v = vr0Var2;
            x9Var.bu();
        }
        aq0 aq0Var = k8Var.w;
        aq0 aq0Var2 = this.c;
        if (f00.h(aq0Var, aq0Var2)) {
            return;
        }
        k8Var.w = aq0Var2;
        x9Var.bu();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) mn.b(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}

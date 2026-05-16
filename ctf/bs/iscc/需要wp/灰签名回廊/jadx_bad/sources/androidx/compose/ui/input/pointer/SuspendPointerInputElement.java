package androidx.compose.ui.input.pointer;

import defpackage.f00;
import defpackage.fv0;
import defpackage.i70;
import defpackage.n70;
import defpackage.ut0;
import defpackage.zt0;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendPointerInputElement extends n70 {
    public final Object a;
    public final Object b;
    public final ut0 c;

    public SuspendPointerInputElement(Object obj, fv0 fv0Var, ut0 ut0Var, int i) {
        fv0Var = (i & 2) != 0 ? null : fv0Var;
        this.a = obj;
        this.b = fv0Var;
        this.c = ut0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return f00.h(this.a, suspendPointerInputElement.a) && f00.h(this.b, suspendPointerInputElement.b) && this.c == suspendPointerInputElement.c;
    }

    @Override // defpackage.n70
    public final i70 f() {
        return new zt0(this.a, this.b, this.c);
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        zt0 zt0Var = (zt0) i70Var;
        Object obj = zt0Var.r;
        Object obj2 = this.a;
        boolean z = !f00.h(obj, obj2);
        zt0Var.r = obj2;
        Object obj3 = zt0Var.s;
        Object obj4 = this.b;
        if (!f00.h(obj3, obj4)) {
            z = true;
        }
        zt0Var.s = obj4;
        if (zt0Var.u.getClass() == ut0.class ? z : true) {
            zt0Var.bw();
        }
        zt0Var.u = this.c;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return this.c.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}

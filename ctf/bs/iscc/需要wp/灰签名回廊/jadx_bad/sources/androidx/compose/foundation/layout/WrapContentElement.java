package androidx.compose.foundation.layout;

import defpackage.gv;
import defpackage.i70;
import defpackage.n5;
import defpackage.n70;
import defpackage.x10;
import defpackage.x31;

/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement extends n70 {
    public final int a;
    public final x10 b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(int i, gv gvVar, Object obj) {
        this.a = i;
        this.b = (x10) gvVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.a == wrapContentElement.a && this.c.equals(wrapContentElement.c);
    }

    @Override // defpackage.n70
    public final i70 f() {
        x31 x31Var = new x31();
        x31Var.r = this.a;
        x31Var.s = this.b;
        return x31Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        x31 x31Var = (x31) i70Var;
        x31Var.r = this.a;
        x31Var.s = this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + n5.e(n5.n(this.a) * 31, 31, false);
    }
}

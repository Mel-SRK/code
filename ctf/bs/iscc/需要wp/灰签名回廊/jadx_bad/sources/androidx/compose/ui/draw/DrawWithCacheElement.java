package androidx.compose.ui.draw;

import defpackage.cv;
import defpackage.i70;
import defpackage.n70;
import defpackage.x9;
import defpackage.y9;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithCacheElement extends n70 {
    public final cv a;

    public DrawWithCacheElement(cv cvVar) {
        this.a = cvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithCacheElement) {
            return this.a == ((DrawWithCacheElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.n70
    public final i70 f() {
        return new x9(new y9(), this.a);
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        x9 x9Var = (x9) i70Var;
        x9Var.t = this.a;
        x9Var.bu();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

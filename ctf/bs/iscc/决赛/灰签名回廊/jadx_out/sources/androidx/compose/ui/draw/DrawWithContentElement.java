package androidx.compose.ui.draw;

import defpackage.cp;
import defpackage.cv;
import defpackage.i70;
import defpackage.n70;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithContentElement extends n70 {
    public final cv a;

    public DrawWithContentElement(cv cvVar) {
        this.a = cvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithContentElement) {
            return this.a == ((DrawWithContentElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.n70
    public final i70 f() {
        cp cpVar = new cp();
        cpVar.r = this.a;
        return cpVar;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        ((cp) i70Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

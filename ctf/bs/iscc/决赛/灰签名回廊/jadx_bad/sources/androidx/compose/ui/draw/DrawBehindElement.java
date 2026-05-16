package androidx.compose.ui.draw;

import defpackage.cv;
import defpackage.i70;
import defpackage.n70;
import defpackage.so;

/* JADX INFO: loaded from: classes.dex */
final class DrawBehindElement extends n70 {
    public final cv a;

    public DrawBehindElement(cv cvVar) {
        this.a = cvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.a == ((DrawBehindElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.n70
    public final i70 f() {
        so soVar = new so();
        soVar.r = this.a;
        return soVar;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        ((so) i70Var).r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package androidx.compose.ui.input.key;

import defpackage.cv;
import defpackage.i70;
import defpackage.n70;
import defpackage.p10;

/* JADX INFO: loaded from: classes.dex */
final class KeyInputElement extends n70 {
    public final cv a;
    public final cv b;

    public KeyInputElement(cv cvVar, cv cvVar2) {
        this.a = cvVar;
        this.b = cvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.a == keyInputElement.a && this.b == keyInputElement.b;
    }

    @Override // defpackage.n70
    public final i70 f() {
        p10 p10Var = new p10();
        p10Var.r = this.a;
        p10Var.s = this.b;
        return p10Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        p10 p10Var = (p10) i70Var;
        p10Var.r = this.a;
        p10Var.s = this.b;
    }

    public final int hashCode() {
        cv cvVar = this.a;
        int iHashCode = (cvVar != null ? cvVar.hashCode() : 0) * 31;
        cv cvVar2 = this.b;
        return iHashCode + (cvVar2 != null ? cvVar2.hashCode() : 0);
    }
}

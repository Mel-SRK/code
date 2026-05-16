package androidx.compose.ui.layout;

import defpackage.cv;
import defpackage.i70;
import defpackage.mb0;
import defpackage.n70;

/* JADX INFO: loaded from: classes.dex */
final class OnSizeChangedModifier extends n70 {
    public final cv a;

    public OnSizeChangedModifier(cv cvVar) {
        this.a = cvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.a == ((OnSizeChangedModifier) obj).a;
        }
        return false;
    }

    @Override // defpackage.n70
    public final i70 f() {
        mb0 mb0Var = new mb0();
        mb0Var.r = this.a;
        long j = Integer.MIN_VALUE;
        mb0Var.s = (j & 4294967295L) | (j << 32);
        return mb0Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        mb0 mb0Var = (mb0) i70Var;
        mb0Var.r = this.a;
        long j = Integer.MIN_VALUE;
        mb0Var.s = (j & 4294967295L) | (j << 32);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

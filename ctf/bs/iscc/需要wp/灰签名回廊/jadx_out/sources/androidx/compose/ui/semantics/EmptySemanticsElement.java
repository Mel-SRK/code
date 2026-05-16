package androidx.compose.ui.semantics;

import defpackage.i70;
import defpackage.n70;
import defpackage.tq;

/* JADX INFO: loaded from: classes.dex */
public final class EmptySemanticsElement extends n70 {
    public final tq a;

    public EmptySemanticsElement(tq tqVar) {
        this.a = tqVar;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.n70
    public final i70 f() {
        return this.a;
    }

    @Override // defpackage.n70
    public final /* bridge */ /* synthetic */ void g(i70 i70Var) {
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}

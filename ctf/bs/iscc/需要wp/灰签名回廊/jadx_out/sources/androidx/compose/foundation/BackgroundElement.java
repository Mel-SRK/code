package androidx.compose.foundation;

import defpackage.aq0;
import defpackage.f00;
import defpackage.i70;
import defpackage.n5;
import defpackage.n70;
import defpackage.q7;
import defpackage.qc;

/* JADX INFO: loaded from: classes.dex */
final class BackgroundElement extends n70 {
    public final long a;
    public final float b = 1.0f;
    public final aq0 c;

    public BackgroundElement(long j, aq0 aq0Var) {
        this.a = j;
        this.c = aq0Var;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && qc.c(this.a, backgroundElement.a) && this.b == backgroundElement.b && f00.h(this.c, backgroundElement.c);
    }

    @Override // defpackage.n70
    public final i70 f() {
        q7 q7Var = new q7();
        q7Var.r = this.a;
        q7Var.s = this.c;
        q7Var.t = 9205357640488583168L;
        return q7Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        q7 q7Var = (q7) i70Var;
        q7Var.r = this.a;
        q7Var.s = this.c;
    }

    public final int hashCode() {
        int i = qc.h;
        return this.c.hashCode() + n5.b(this.b, Long.hashCode(this.a) * 961, 31);
    }
}

package androidx.compose.foundation.layout;

import defpackage.i70;
import defpackage.jr;
import defpackage.n5;
import defpackage.n70;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class FillElement extends n70 {
    public final int a;

    public FillElement(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillElement) {
            return this.a == ((FillElement) obj).a;
        }
        return false;
    }

    @Override // defpackage.n70
    public final i70 f() {
        jr jrVar = new jr();
        jrVar.r = this.a;
        jrVar.s = 1.0f;
        return jrVar;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        jr jrVar = (jr) i70Var;
        jrVar.r = this.a;
        jrVar.s = 1.0f;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (n5.n(this.a) * 31);
    }
}

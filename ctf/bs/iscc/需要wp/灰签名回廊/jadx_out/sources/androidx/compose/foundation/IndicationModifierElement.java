package androidx.compose.foundation;

import defpackage.f00;
import defpackage.g80;
import defpackage.i70;
import defpackage.n70;
import defpackage.py;
import defpackage.ql;
import defpackage.qy;

/* JADX INFO: loaded from: classes.dex */
final class IndicationModifierElement extends n70 {
    public final g80 a;
    public final qy b;

    public IndicationModifierElement(g80 g80Var, qy qyVar) {
        this.a = g80Var;
        this.b = qyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return f00.h(this.a, indicationModifierElement.a) && f00.h(this.b, indicationModifierElement.b);
    }

    @Override // defpackage.n70
    public final i70 f() {
        ql qlVarB = this.b.b(this.a);
        py pyVar = new py();
        pyVar.t = qlVarB;
        pyVar.bu(qlVarB);
        return pyVar;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        py pyVar = (py) i70Var;
        ql qlVarB = this.b.b(this.a);
        pyVar.bv(pyVar.t);
        pyVar.t = qlVarB;
        pyVar.bu(qlVarB);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

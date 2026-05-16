package androidx.compose.ui.input.pointer;

import defpackage.d41;
import defpackage.f00;
import defpackage.i70;
import defpackage.lg0;
import defpackage.n70;
import defpackage.x3;

/* JADX INFO: loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends n70 {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        x3 x3Var = d41.l;
        return x3Var.equals(x3Var);
    }

    @Override // defpackage.n70
    public final i70 f() {
        x3 x3Var = d41.l;
        lg0 lg0Var = new lg0();
        lg0Var.r = x3Var;
        return lg0Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        lg0 lg0Var = (lg0) i70Var;
        x3 x3Var = d41.l;
        if (f00.h(lg0Var.r, x3Var)) {
            return;
        }
        lg0Var.r = x3Var;
        if (lg0Var.s) {
            lg0Var.bw();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (1008 * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + d41.l + ", overrideDescendants=false)";
    }
}

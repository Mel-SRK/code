package androidx.compose.foundation;

import defpackage.aq0;
import defpackage.g70;
import defpackage.g80;
import defpackage.j70;
import defpackage.m10;
import defpackage.my;
import defpackage.pu;
import defpackage.qy;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final j70 a(j70 j70Var, long j, aq0 aq0Var) {
        return j70Var.c(new BackgroundElement(j, aq0Var));
    }

    public static final j70 b(j70 j70Var, g80 g80Var, my myVar, boolean z, String str, pu puVar) {
        j70 j70VarP;
        if (myVar instanceof qy) {
            j70VarP = new ClickableElement(g80Var, (qy) myVar, z, str, puVar);
        } else if (myVar == null) {
            j70VarP = new ClickableElement(g80Var, null, z, str, puVar);
        } else if (g80Var != null) {
            j70VarP = c.a(g80Var, myVar).c(new ClickableElement(g80Var, null, z, str, puVar));
        } else {
            j70VarP = m10.p(g70.a, new b(myVar, z, str, puVar));
        }
        return j70Var.c(j70VarP);
    }

    public static final j70 c(j70 j70Var, boolean z, g80 g80Var) {
        return j70Var.c(z ? new FocusableElement(g80Var) : g70.a);
    }
}

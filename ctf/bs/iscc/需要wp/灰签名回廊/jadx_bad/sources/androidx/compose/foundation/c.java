package androidx.compose.foundation;

import defpackage.ei;
import defpackage.g70;
import defpackage.g80;
import defpackage.j70;
import defpackage.m10;
import defpackage.my;
import defpackage.ng;
import defpackage.qy;
import defpackage.xs0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final xs0 a = new xs0(ng.l);

    public static final j70 a(g80 g80Var, my myVar) {
        g70 g70Var = g70.a;
        return myVar == null ? g70Var : myVar instanceof qy ? new IndicationModifierElement(g80Var, (qy) myVar) : m10.p(g70Var, new ei(1, myVar, g80Var));
    }
}

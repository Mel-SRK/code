package androidx.compose.foundation;

import android.content.Context;
import defpackage.bw;
import defpackage.d2;
import defpackage.ec;
import defpackage.g80;
import defpackage.hv;
import defpackage.j70;
import defpackage.nf;
import defpackage.od0;
import defpackage.pd0;
import defpackage.qd0;
import defpackage.v2;
import defpackage.vf;
import defpackage.wc0;
import defpackage.x10;
import defpackage.ym0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends x10 implements hv {
    public final /* synthetic */ ym0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ym0 ym0Var) {
        super(3);
        this.e = ym0Var;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        qd0 qd0Var;
        vf vfVar = (vf) obj2;
        ((Number) obj3).intValue();
        vfVar.av(1478351300);
        ym0 ym0Var = this.e;
        ScrollSemanticsElement scrollSemanticsElement = new ScrollSemanticsElement(ym0Var);
        g80 g80Var = ym0Var.c;
        Context context = (Context) vfVar.j(d2.b);
        od0 od0Var = (od0) vfVar.j(pd0.a);
        if (od0Var != null) {
            vfVar.av(1586021609);
            boolean zF = vfVar.f(context) | vfVar.f(od0Var);
            Object objAk = vfVar.ak();
            if (zF || objAk == nf.a) {
                objAk = new v2(context, od0Var);
                vfVar.be(objAk);
            }
            qd0Var = (v2) objAk;
            vfVar.q(false);
        } else {
            vfVar.av(1586120933);
            vfVar.q(false);
            qd0Var = bw.ak;
        }
        j70 j70VarC = scrollSemanticsElement.c(ec.b).c(qd0Var.f());
        j70 j70VarC2 = androidx.compose.foundation.gestures.a.b(j70VarC, ym0Var, wc0.d, qd0Var, true, true, g80Var).c(new ScrollingLayoutElement(ym0Var));
        vfVar.q(false);
        return j70VarC2;
    }
}

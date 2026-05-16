package defpackage;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.graphics.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ot0 {
    public static final qg a = new qg(ng.y);

    public static final void a(j70 j70Var, aq0 aq0Var, long j, long j2, float f, te teVar, vf vfVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            aq0Var = f00.i;
        }
        aq0 aq0Var2 = aq0Var;
        long jB = (i2 & 8) != 0 ? cd.b(j, vfVar) : j2;
        float f2 = 0;
        float f3 = (i2 & 32) != 0 ? 0 : f;
        qg qgVar = a;
        float f4 = ((mn) vfVar.j(qgVar)).d + f2;
        az0.b(new ci0[]{jh.a.a(new qc(jB)), qgVar.a(new mn(f4))}, t1.aq(-70914509, new mt0(j70Var, aq0Var2, j, f4, null, f3, teVar), vfVar), vfVar, 56);
    }

    public static final j70 b(j70 j70Var, aq0 aq0Var, long j, l8 l8Var, float f) {
        j70 borderModifierNodeElement = g70.a;
        j70 j70VarC = j70Var.c(f > 0.0f ? a.a(borderModifierNodeElement, f, aq0Var, 124895) : borderModifierNodeElement);
        if (l8Var != null) {
            borderModifierNodeElement = new BorderModifierNodeElement(l8Var.a, l8Var.b, aq0Var);
        }
        return t1.j(androidx.compose.foundation.a.a(j70VarC.c(borderModifierNodeElement), j, aq0Var), aq0Var);
    }

    public static final long c(long j, float f, vf vfVar) {
        zc zcVar = (zc) vfVar.j(cd.a);
        boolean zBooleanValue = ((Boolean) vfVar.j(cd.b)).booleanValue();
        long j2 = zcVar.p;
        if (!qc.c(j, j2) || !zBooleanValue) {
            return j;
        }
        if (mn.a(f, 0)) {
            return j2;
        }
        return m10.q(qc.b(zcVar.t, ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f), j2);
    }
}

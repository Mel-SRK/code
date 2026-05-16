package defpackage;

import androidx.compose.ui.layout.a;

/* JADX INFO: loaded from: classes.dex */
public final class hj extends x10 implements gv {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(j70 j70Var, cw0 cw0Var, te teVar, int i) {
        super(2);
        this.e = 0;
        this.f = j70Var;
        this.g = cw0Var;
        this.h = teVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        int i = this.e;
        wz0 wz0Var = wz0.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                az0.d((j70) obj5, (cw0) obj4, (te) obj3, (vf) obj, d41.ar(385));
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                ui0 ui0Var = (ui0) obj5;
                rn0 rn0Var = (rn0) obj4;
                long jG = rn0Var.g(rn0Var.c(fFloatValue - ui0Var.d));
                rn0 rn0Var2 = ((pn0) obj3).a;
                ui0Var.d += rn0Var.c(rn0Var.f(rn0.a(rn0Var2, rn0Var2.h, jG, 1)));
                break;
            default:
                vf vfVar = (vf) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && vfVar.z()) {
                    vfVar.aq();
                } else {
                    j70 j70VarC = a.c(g70.a, "Container");
                    float f = ld0.a;
                    j70 j70VarC2 = androidx.compose.ui.draw.a.c(j70VarC, new a2(15, new mv0(0, w80.class, (w80) obj5, "value", "getValue()Ljava/lang/Object;"), (wd0) obj4));
                    te teVar = (te) obj3;
                    p60 p60VarD = m8.d(bw.e, true);
                    int iAd = pk.ad(vfVar);
                    androidx.compose.runtime.internal.a aVarL = vfVar.l();
                    j70 j70VarAn = m10.an(vfVar, j70VarC2);
                    kf.b.getClass();
                    ng ngVar = jf.b;
                    vfVar.ax();
                    if (vfVar.aq) {
                        vfVar.k(ngVar);
                    } else {
                        vfVar.bh();
                    }
                    jo0.h(vfVar, jf.e, p60VarD);
                    jo0.h(vfVar, jf.d, aVarL);
                    w6 w6Var = jf.f;
                    if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iAd))) {
                        n5.j(iAd, vfVar, iAd, w6Var);
                    }
                    jo0.h(vfVar, jf.c, j70VarAn);
                    teVar.f(vfVar, 0);
                    vfVar.q(true);
                }
                break;
        }
        return wz0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj(Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}

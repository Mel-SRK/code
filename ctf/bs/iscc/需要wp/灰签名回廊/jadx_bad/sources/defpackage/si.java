package defpackage;

import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class si extends x10 implements gv {
    public final /* synthetic */ cw0 e;
    public final /* synthetic */ h30 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ cv h;
    public final /* synthetic */ lw0 i;
    public final /* synthetic */ ab0 j;
    public final /* synthetic */ em k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(cw0 cw0Var, h30 h30Var, boolean z, cv cvVar, lw0 lw0Var, ab0 ab0Var, em emVar, int i) {
        super(2);
        this.e = cw0Var;
        this.f = h30Var;
        this.g = z;
        this.h = cvVar;
        this.i = lw0Var;
        this.j = ab0Var;
        this.k = emVar;
        this.l = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    @Override // defpackage.gv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2) {
        vf vfVar = (vf) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && vfVar.z()) {
            vfVar.aq();
        } else {
            em emVar = this.k;
            int i = this.l;
            h30 h30Var = this.f;
            ri riVar = new ri(h30Var, this.h, this.i, this.j, emVar, i);
            int iAd = pk.ad(vfVar);
            a aVarL = vfVar.l();
            j70 j70VarAn = m10.an(vfVar, g70.a);
            kf.b.getClass();
            ng ngVar = jf.b;
            vfVar.ax();
            if (vfVar.aq) {
                vfVar.k(ngVar);
            } else {
                vfVar.bh();
            }
            jo0.h(vfVar, jf.e, riVar);
            jo0.h(vfVar, jf.d, aVarL);
            w6 w6Var = jf.f;
            if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iAd))) {
                n5.j(iAd, vfVar, iAd, w6Var);
            }
            jo0.h(vfVar, jf.c, j70VarAn);
            boolean z = true;
            vfVar.q(true);
            xw xwVarA = h30Var.a();
            xw xwVar = xw.d;
            boolean z2 = this.g;
            if (xwVarA == xwVar || h30Var.c() == null) {
                z = false;
                cw0 cw0Var = this.e;
                az0.g(cw0Var, z, vfVar, 0);
                if (h30Var.a() == xw.f || !z2) {
                    vfVar.av(-1955394);
                    vfVar.q(false);
                } else {
                    vfVar.av(-2032274);
                    az0.f(cw0Var, vfVar, 0);
                    vfVar.q(false);
                }
            } else {
                d20 d20VarC = h30Var.c();
                d20VarC.getClass();
                if (!d20VarC.af() || !z2) {
                }
                cw0 cw0Var2 = this.e;
                az0.g(cw0Var2, z, vfVar, 0);
                if (h30Var.a() == xw.f) {
                    vfVar.av(-1955394);
                    vfVar.q(false);
                }
            }
        }
        return wz0.a;
    }
}

package defpackage;

import androidx.compose.ui.draw.a;

/* JADX INFO: loaded from: classes.dex */
public final class hv0 extends x10 implements hv {
    public final /* synthetic */ vr0 e;
    public final /* synthetic */ h30 f;
    public final /* synthetic */ lw0 g;
    public final /* synthetic */ ab0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv0(vr0 vr0Var, h30 h30Var, lw0 lw0Var, ab0 ab0Var) {
        super(3);
        this.e = vr0Var;
        this.f = h30Var;
        this.g = lw0Var;
        this.h = ab0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    @Override // defpackage.hv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, Object obj2, Object obj3) {
        Object objC;
        j70 j70Var = (j70) obj;
        vf vfVar = (vf) obj2;
        ((Number) obj3).intValue();
        lw0 lw0Var = this.g;
        long j = lw0Var.b;
        vfVar.av(-84507373);
        Object objAk = vfVar.ak();
        n31 n31Var = nf.a;
        if (objAk == n31Var) {
            objAk = new kk();
            vfVar.be(objAk);
        }
        kk kkVar = (kk) objAk;
        vr0 vr0Var = this.e;
        boolean z = vr0Var.a != 16;
        if (((Boolean) ((b30) ((b21) vfVar.j(og.t))).a.getValue()).booleanValue()) {
            boolean z2 = z;
            h30 h30Var = this.f;
            if (h30Var.b() && hx0.b(j) && z2) {
                vfVar.av(808320157);
                b6 b6Var = lw0Var.a;
                hx0 hx0Var = new hx0(j);
                boolean zH = vfVar.h(kkVar);
                Object objAk2 = vfVar.ak();
                if (zH || objAk2 == n31Var) {
                    objAk2 = new sk(kkVar, null, 4);
                    vfVar.be(objAk2);
                }
                pk.e(b6Var, hx0Var, (gv) objAk2, vfVar);
                boolean zH2 = vfVar.h(kkVar);
                ab0 ab0Var = this.h;
                boolean zH3 = zH2 | vfVar.h(ab0Var) | vfVar.f(lw0Var) | vfVar.h(h30Var) | vfVar.f(vr0Var);
                Object objAk3 = vfVar.ak();
                if (zH3 || objAk3 == n31Var) {
                    f3 f3Var = new f3(kkVar, ab0Var, lw0Var, h30Var, vr0Var);
                    vfVar.be(f3Var);
                    objAk3 = f3Var;
                }
                objC = a.c(j70Var, (cv) objAk3);
                vfVar.q(false);
            } else {
                vfVar.av(809534830);
                vfVar.q(false);
                objC = g70.a;
            }
        }
        vfVar.q(false);
        return objC;
    }
}

package defpackage;

import androidx.compose.ui.layout.a;
import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends x10 implements gv {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(rh rhVar, a2 a2Var) {
        super(2);
        this.e = 5;
        this.f = rhVar;
        this.g = a2Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        int i = this.e;
        int i2 = 0;
        wz0 wz0Var = wz0.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                d2.a((b1) obj4, (gv) obj3, (vf) obj, d41.ar(1));
                break;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                uo0 uo0Var = (uo0) obj2;
                h2 h2Var = (h2) obj3;
                if (!((vo0) obj4).b.b(uo0Var.g)) {
                    h2Var.l(iIntValue, uo0Var);
                    h2Var.k.u(wz0Var);
                }
                break;
            case 2:
                vf vfVar = (vf) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                zg0 zg0Var = (zg0) obj4;
                if (!vfVar.an(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vfVar.aq();
                } else {
                    Object objAk = vfVar.ak();
                    n31 n31Var = nf.a;
                    if (objAk == n31Var) {
                        objAk = q0.m;
                        vfVar.be(objAk);
                    }
                    j70 j70VarA = ro0.a(g70.a, (cv) objAk);
                    boolean zH = vfVar.h(zg0Var);
                    Object objAk2 = vfVar.ak();
                    if (zH || objAk2 == n31Var) {
                        objAk2 = new a4(zg0Var, 1);
                        vfVar.be(objAk2);
                    }
                    j70 j70VarE = a.e(j70VarA, (cv) objAk2);
                    float f = zg0Var.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f != 1.0f) {
                        j70VarE = androidx.compose.ui.graphics.a.b(j70VarE, f, null, 520187);
                    }
                    gv gvVar = (gv) ((w80) obj3).getValue();
                    Object objAk3 = vfVar.ak();
                    if (objAk3 == n31Var) {
                        objAk3 = f4.b;
                        vfVar.be(objAk3);
                    }
                    p60 p60Var = (p60) objAk3;
                    int iHashCode = Long.hashCode(vfVar.ar);
                    androidx.compose.runtime.internal.a aVarL = vfVar.l();
                    j70 j70VarAn = m10.an(vfVar, j70VarE);
                    kf.b.getClass();
                    ng ngVar = jf.b;
                    vfVar.ax();
                    if (vfVar.aq) {
                        vfVar.k(ngVar);
                    } else {
                        vfVar.bh();
                    }
                    jo0.h(vfVar, jf.e, p60Var);
                    jo0.h(vfVar, jf.d, aVarL);
                    w6 w6Var = jf.f;
                    if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode))) {
                        n5.j(iHashCode, vfVar, iHashCode, w6Var);
                    }
                    jo0.h(vfVar, jf.c, j70VarAn);
                    gvVar.f(vfVar, 0);
                    vfVar.q(true);
                }
                break;
            case 3:
                ((Number) obj2).intValue();
                ((uh) obj4).a((rh) obj3, (vf) obj, d41.ar(1));
                break;
            case 4:
                ((Number) obj2).intValue();
                fi.a((rh) obj4, (te) obj3, (vf) obj, d41.ar(385));
                break;
            case 5:
                vf vfVar2 = (vf) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && vfVar2.z()) {
                    vfVar2.aq();
                } else {
                    rh rhVar = (rh) obj4;
                    fi.a(rhVar, t1.aq(1156688164, new ei(i2, (a2) obj3, rhVar), vfVar2), vfVar2, 384);
                }
                break;
            case 6:
                long j = ((xa0) obj2).a;
                wo0.c((r01) obj4, (pg0) obj);
                o9 o9Var = ((in0) obj3).x;
                if (o9Var != null) {
                    o9Var.u(new un(j));
                }
                break;
            case 7:
                oa oaVar = (oa) obj;
                jw jwVar = (jw) obj2;
                fa0 fa0Var = (fa0) obj4;
                s20 s20Var = fa0Var.r;
                if (!s20Var.af()) {
                    fa0Var.ak = true;
                } else {
                    fa0Var.ah = oaVar;
                    fa0Var.ag = jwVar;
                    td0 snapshotObserver = t1.as(s20Var).getSnapshotObserver();
                    uj0 uj0Var = fa0.am;
                    snapshotObserver.a(fa0Var, f50.h, (ea0) obj3);
                    fa0Var.ak = false;
                }
                break;
            case MainActivity.$stable /* 8 */:
                ((Number) obj2).intValue();
                jo0.a((j70) obj4, (te) obj3, (vf) obj, d41.ar(49));
                break;
            default:
                ((Number) obj2).intValue();
                ((ny0) obj4).a((hz) obj3, (vf) obj, d41.ar(49));
                break;
        }
        return wz0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(int i, Object obj, Object obj2) {
        super(2);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(int i, int i2, Object obj, Object obj2) {
        super(2);
        this.e = i2;
        this.f = obj;
        this.g = obj2;
    }
}

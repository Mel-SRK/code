package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class bg0 implements my {
    public final w80 a;

    public bg0(w80 w80Var) {
        this.a = w80Var;
    }

    @Override // defpackage.my
    public final ny a(g80 g80Var, vf vfVar) {
        long j;
        ck0 ck0Var;
        vfVar.av(988743187);
        sd sdVar = (sd) vfVar.j(qk0.a);
        w80 w80Var = this.a;
        if (((qc) w80Var.getValue()).a != qc.g) {
            vfVar.av(-303571590);
            vfVar.q(false);
            j = ((qc) w80Var.getValue()).a;
        } else {
            vfVar.av(-303521246);
            switch (sdVar.a) {
                case 0:
                    vfVar.av(-1844533201);
                    j = ((qc) vfVar.j(jh.a)).a;
                    vfVar.q(false);
                    break;
                default:
                    vfVar.av(2042140174);
                    j = qc.b;
                    m10.al(j);
                    vfVar.q(false);
                    break;
            }
            vfVar.q(false);
        }
        w80 w80VarP = bo0.p(new qc(j), vfVar);
        switch (sdVar.a) {
            case 0:
                vfVar.av(-290975286);
                ck0Var = m10.e;
                vfVar.q(false);
                break;
            default:
                vfVar.av(-1629816343);
                ck0Var = ((double) m10.al(qc.b)) > 0.5d ? qk0.b : qk0.c;
                vfVar.q(false);
                break;
        }
        w80 w80VarP2 = bo0.p(ck0Var, vfVar);
        vfVar.av(331259447);
        ViewGroup viewGroupB = rk0.b((View) vfVar.j(d2.f));
        boolean zF = vfVar.f(g80Var) | vfVar.f(this) | vfVar.f(viewGroupB);
        Object objAk = vfVar.ak();
        Object obj = nf.a;
        if (zF || objAk == obj) {
            objAk = new h4(w80VarP, w80VarP2, viewGroupB);
            vfVar.be(objAk);
        }
        h4 h4Var = (h4) objAk;
        vfVar.q(false);
        boolean zF2 = vfVar.f(g80Var) | vfVar.h(h4Var);
        Object objAk2 = vfVar.ak();
        if (zF2 || objAk2 == obj) {
            objAk2 = new w8(g80Var, h4Var, (ji) null, 8);
            vfVar.be(objAk2);
        }
        pk.e(h4Var, g80Var, (gv) objAk2, vfVar);
        vfVar.q(false);
        return h4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bg0) {
            return mn.a(Float.NaN, Float.NaN) && this.a.equals(((bg0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + n5.b(Float.NaN, Boolean.hashCode(true) * 31, 31);
    }
}

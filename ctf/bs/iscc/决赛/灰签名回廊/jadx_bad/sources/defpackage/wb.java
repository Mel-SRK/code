package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.c;

/* JADX INFO: loaded from: classes.dex */
public final class wb extends x10 implements hv {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wb(hi hiVar, boolean z, pu puVar) {
        super(3);
        this.g = hiVar;
        this.f = z;
        this.h = (x10) puVar;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [pu, x10] */
    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        g80 g80Var;
        switch (this.e) {
            case 0:
                vf vfVar = (vf) obj2;
                ((Number) obj3).intValue();
                vfVar.av(-756081143);
                my myVar = (my) vfVar.j(c.a);
                if (myVar instanceof qy) {
                    vfVar.av(617140216);
                    vfVar.q(false);
                    g80Var = null;
                } else {
                    vfVar.av(617248189);
                    Object objAk = vfVar.ak();
                    if (objAk == nf.a) {
                        objAk = new g80();
                        vfVar.be(objAk);
                    }
                    g80Var = (g80) objAk;
                    vfVar.q(false);
                }
                j70 j70VarB = a.b(g70.a, g80Var, myVar, this.f, (String) this.g, (pu) this.h);
                vfVar.q(false);
                return j70VarB;
            case 1:
                rh rhVar = (rh) obj;
                vf vfVar2 = (vf) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= vfVar2.f(rhVar) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && vfVar2.z()) {
                    vfVar2.aq();
                } else {
                    String str = (String) ((hi) this.g).f(vfVar2, 0);
                    if (ft0.o(str)) {
                        wc.q("Label must not be blank");
                        return null;
                    }
                    fi.b(str, this.f, rhVar, g70.a, (x10) this.h, vfVar2, (iIntValue << 6) & 896);
                }
                return wz0.a;
            default:
                vf vfVar3 = (vf) obj2;
                ((Number) obj3).intValue();
                zv0 zv0Var = (zv0) this.g;
                vfVar3.av(805428266);
                boolean z = ((wc0) zv0Var.e.getValue()) == wc0.d || !(vfVar3.j(og.n) == e20.e);
                boolean zF = vfVar3.f(zv0Var);
                Object objAk2 = vfVar3.ak();
                n31 n31Var = nf.a;
                if (zF || objAk2 == n31Var) {
                    objAk2 = new l1(29, zv0Var);
                    vfVar3.be(objAk2);
                }
                w80 w80VarP = bo0.p((cv) objAk2, vfVar3);
                Object objAk3 = vfVar3.ak();
                if (objAk3 == n31Var) {
                    nl nlVar = new nl(new v1(w80VarP, 1));
                    vfVar3.be(nlVar);
                    objAk3 = nlVar;
                }
                jn0 jn0Var = (jn0) objAk3;
                boolean zF2 = vfVar3.f(jn0Var) | vfVar3.f(zv0Var);
                Object objAk4 = vfVar3.ak();
                if (zF2 || objAk4 == n31Var) {
                    objAk4 = new xv0(jn0Var, zv0Var);
                    vfVar3.be(objAk4);
                }
                j70 j70VarB2 = androidx.compose.foundation.gestures.a.b(g70.a, (xv0) objAk4, (wc0) zv0Var.e.getValue(), null, this.f && zv0Var.b.g() != 0.0f, z, (g80) this.h);
                vfVar3.q(false);
                return j70VarB2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(zv0 zv0Var, boolean z, g80 g80Var) {
        super(3);
        this.g = zv0Var;
        this.f = z;
        this.h = g80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(boolean z, String str, pu puVar) {
        super(3);
        this.f = z;
        this.g = str;
        this.h = puVar;
    }
}

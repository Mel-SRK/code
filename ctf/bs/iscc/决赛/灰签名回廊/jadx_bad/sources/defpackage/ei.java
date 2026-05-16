package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: loaded from: classes.dex */
public final class ei extends x10 implements hv {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei(int i, Object obj, Object obj2) {
        super(3);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                vf vfVar = (vf) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && vfVar.z()) {
                    vfVar.aq();
                } else {
                    Object objAk = vfVar.ak();
                    if (objAk == nf.a) {
                        objAk = new uh();
                        vfVar.be(objAk);
                    }
                    uh uhVar = (uh) objAk;
                    a2 a2Var = (a2) this.f;
                    rh rhVar = (rh) this.g;
                    uhVar.a.clear();
                    a2Var.g(uhVar);
                    uhVar.a(rhVar, vfVar, 0);
                }
                return wz0.a;
            case 1:
                vf vfVar2 = (vf) obj2;
                ((Number) obj3).intValue();
                vfVar2.av(-353972293);
                ny nyVarA = ((my) this.f).a((g80) this.g, vfVar2);
                boolean zF = vfVar2.f(nyVarA);
                Object objAk2 = vfVar2.ak();
                if (zF || objAk2 == nf.a) {
                    objAk2 = new oy(nyVarA);
                    vfVar2.be(objAk2);
                }
                oy oyVar = (oy) objAk2;
                vfVar2.q(false);
                return oyVar;
            case 2:
                vf vfVar3 = (vf) obj2;
                ((Number) obj3).intValue();
                vfVar3.av(759876635);
                pu puVar = (pu) this.f;
                Object objAk3 = vfVar3.ak();
                n31 n31Var = nf.a;
                if (objAk3 == n31Var) {
                    objAk3 = bo0.f(puVar);
                    vfVar3.be(objAk3);
                }
                ms0 ms0Var = (ms0) objAk3;
                Object objAk4 = vfVar3.ak();
                if (objAk4 == n31Var) {
                    objAk4 = new j5(new xa0(((xa0) ms0Var.getValue()).a), mo0.b, new xa0(mo0.c), 8);
                    vfVar3.be(objAk4);
                }
                j5 j5Var = (j5) objAk4;
                boolean zH = vfVar3.h(j5Var);
                Object objAk5 = vfVar3.ak();
                if (zH || objAk5 == n31Var) {
                    objAk5 = new w8(ms0Var, j5Var, (ji) null, 12);
                    vfVar3.be(objAk5);
                }
                pk.d(vfVar3, (gv) objAk5, wz0.a);
                r5 r5Var = j5Var.c;
                cv cvVar = (cv) this.g;
                boolean zF2 = vfVar3.f(r5Var);
                Object objAk6 = vfVar3.ak();
                if (zF2 || objAk6 == n31Var) {
                    objAk6 = new ko0(r5Var, 0);
                    vfVar3.be(objAk6);
                }
                j70 j70Var = (j70) cvVar.g((pu) objAk6);
                vfVar3.q(false);
                return j70Var;
            default:
                vf vfVar4 = (vf) obj2;
                ((Number) obj3).intValue();
                g80 g80Var = (g80) this.g;
                vfVar4.av(-102778667);
                Object objAk7 = vfVar4.ak();
                n31 n31Var2 = nf.a;
                if (objAk7 == n31Var2) {
                    pg pgVar = new pg(pk.q(vfVar4));
                    vfVar4.be(pgVar);
                    objAk7 = pgVar;
                }
                xj xjVar = ((pg) objAk7).d;
                Object objAk8 = vfVar4.ak();
                if (objAk8 == n31Var2) {
                    objAk8 = bo0.m(null);
                    vfVar4.be(objAk8);
                }
                w80 w80Var = (w80) objAk8;
                w80 w80VarP = bo0.p((cv) this.f, vfVar4);
                boolean zF3 = vfVar4.f(g80Var);
                Object objAk9 = vfVar4.ak();
                if (zF3 || objAk9 == n31Var2) {
                    objAk9 = new a2(23, w80Var, g80Var);
                    vfVar4.be(objAk9);
                }
                pk.b(g80Var, (cv) objAk9, vfVar4);
                boolean zH2 = vfVar4.h(xjVar) | vfVar4.f(g80Var) | vfVar4.f(w80VarP);
                g80 g80Var2 = (g80) this.g;
                Object objAk10 = vfVar4.ak();
                if (zH2 || objAk10 == n31Var2) {
                    objAk10 = new i3(xjVar, w80Var, g80Var2, w80VarP, null, 6);
                    vfVar4.be(objAk10);
                }
                j70 j70VarC = g70.a.c(new SuspendPointerInputElement(g80Var, null, new ut0((gv) objAk10), 6));
                vfVar4.q(false);
                return j70VarC;
        }
    }
}

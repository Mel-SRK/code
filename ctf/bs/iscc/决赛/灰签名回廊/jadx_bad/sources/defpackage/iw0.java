package defpackage;

import androidx.compose.ui.layout.a;

/* JADX INFO: loaded from: classes.dex */
public final class iw0 extends x10 implements hv {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iw0(int i, Object obj) {
        super(3);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        int i2 = 1;
        n31 n31Var = nf.a;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                j70 j70Var = (j70) obj;
                vf vfVar = (vf) obj2;
                ((Number) obj3).intValue();
                cw0 cw0Var = (cw0) obj4;
                vfVar.av(1980580247);
                em emVar = (em) vfVar.j(og.h);
                Object objAk = vfVar.ak();
                if (objAk == n31Var) {
                    objAk = bo0.m(new wz(0L));
                    vfVar.be(objAk);
                }
                w80 w80Var = (w80) objAk;
                boolean zH = vfVar.h(cw0Var);
                Object objAk2 = vfVar.ak();
                if (zH || objAk2 == n31Var) {
                    objAk2 = new s0(13, cw0Var, w80Var);
                    vfVar.be(objAk2);
                }
                pu puVar = (pu) objAk2;
                boolean zF = vfVar.f(emVar);
                Object objAk3 = vfVar.ak();
                if (zF || objAk3 == n31Var) {
                    objAk3 = new hw0(emVar, w80Var, 1);
                    vfVar.be(objAk3);
                }
                t5 t5Var = mo0.a;
                j70 j70VarP = m10.p(j70Var, new ei(2, puVar, (cv) objAk3));
                vfVar.q(false);
                return j70VarP;
            case 1:
                long j = ((dh) obj3).a;
                long j2 = ((jw0) obj4).f;
                lf0 lf0VarE = ((k60) obj2).e(dh.a(j, i60.t((int) (j2 >> 32), dh.j(j), dh.h(j)), 0, i60.t((int) (j2 & 4294967295L), dh.i(j), dh.g(j)), 0, 10));
                return ((r60) obj).av(lf0VarE.d, lf0VarE.e, sq.d, new d4(lf0VarE, 6));
            default:
                vf vfVar2 = (vf) obj2;
                ((Number) obj3).intValue();
                vfVar2.av(1582736677);
                em emVar2 = (em) vfVar2.j(og.h);
                qt qtVar = (qt) vfVar2.j(og.k);
                e20 e20Var = (e20) vfVar2.j(og.n);
                nx0 nx0Var = (nx0) obj4;
                boolean zF2 = vfVar2.f(nx0Var) | vfVar2.f(e20Var);
                Object objAk4 = vfVar2.ak();
                if (zF2 || objAk4 == n31Var) {
                    objAk4 = wn0.k(nx0Var, e20Var);
                    vfVar2.be(objAk4);
                }
                nx0 nx0Var2 = (nx0) objAk4;
                boolean zF3 = vfVar2.f(qtVar) | vfVar2.f(nx0Var2);
                Object objAk5 = vfVar2.ak();
                if (zF3 || objAk5 == n31Var) {
                    yr0 yr0Var = nx0Var2.a;
                    fu0 fu0Var = yr0Var.f;
                    iu iuVar = yr0Var.c;
                    if (iuVar == null) {
                        iuVar = iu.f;
                    }
                    gu guVar = yr0Var.d;
                    int i3 = guVar != null ? guVar.a : 0;
                    hu huVar = yr0Var.e;
                    objAk5 = ((rt) qtVar).b(fu0Var, iuVar, i3, huVar != null ? huVar.a : 65535);
                    vfVar2.be(objAk5);
                }
                ms0 ms0Var = (ms0) objAk5;
                Object objAk6 = vfVar2.ak();
                Object obj5 = objAk6;
                if (objAk6 == n31Var) {
                    Object value = ms0Var.getValue();
                    jw0 jw0Var = new jw0();
                    jw0Var.a = e20Var;
                    jw0Var.b = emVar2;
                    jw0Var.c = qtVar;
                    jw0Var.d = nx0Var;
                    jw0Var.e = value;
                    jw0Var.f = kv0.a(nx0Var, emVar2, qtVar, kv0.a, 1);
                    vfVar2.be(jw0Var);
                    obj5 = jw0Var;
                }
                jw0 jw0Var2 = (jw0) obj5;
                Object value2 = ms0Var.getValue();
                if (e20Var != jw0Var2.a || !f00.h(emVar2, jw0Var2.b) || !f00.h(qtVar, jw0Var2.c) || !f00.h(nx0Var2, jw0Var2.d) || !f00.h(value2, jw0Var2.e)) {
                    jw0Var2.a = e20Var;
                    jw0Var2.b = emVar2;
                    jw0Var2.c = qtVar;
                    jw0Var2.d = nx0Var2;
                    jw0Var2.e = value2;
                    jw0Var2.f = kv0.a(nx0Var2, emVar2, qtVar, kv0.a, 1);
                }
                boolean zH2 = vfVar2.h(jw0Var2);
                Object objAk7 = vfVar2.ak();
                if (zH2 || objAk7 == n31Var) {
                    objAk7 = new iw0(i2, jw0Var2);
                    vfVar2.be(objAk7);
                }
                j70 j70VarB = a.b((hv) objAk7);
                vfVar2.q(false);
                return j70VarB;
        }
    }
}

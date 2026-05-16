package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class l5 {
    public static final /* synthetic */ int a = 0;

    static {
        Object obj = v11.a;
        lI.a(0.5f, 0.5f);
        d41.h(0.5f, 0.5f);
    }

    public static final ms0 a(Object obj, zy0 zy0Var, q5 q5Var, String str, vf vfVar, int i) {
        Object objAk = vfVar.ak();
        Object obj2 = nf.a;
        if (objAk == obj2) {
            objAk = bo0.m(null);
            vfVar.be(objAk);
        }
        w80 w80Var = (w80) objAk;
        Object objAk2 = vfVar.ak();
        if (objAk2 == obj2) {
            objAk2 = new j5(obj, zy0Var, null);
            vfVar.be(objAk2);
        }
        j5 j5Var = (j5) objAk2;
        w80 w80VarP = bo0.p(null, vfVar);
        w80 w80VarP2 = bo0.p(q5Var, vfVar);
        Object objAk3 = vfVar.ak();
        if (objAk3 == obj2) {
            objAk3 = i60.a(-1, 6, null);
            vfVar.be(objAk3);
        }
        ya yaVar = (ya) objAk3;
        boolean zH = vfVar.h(yaVar) | vfVar.h(obj);
        Object objAk4 = vfVar.ak();
        if (zH || objAk4 == obj2) {
            objAk4 = new s0(2, yaVar, obj);
            vfVar.be(objAk4);
        }
        pk.i((pu) objAk4, vfVar);
        boolean zH2 = vfVar.h(yaVar) | vfVar.h(j5Var) | vfVar.f(w80VarP2) | vfVar.f(w80VarP);
        Object objAk5 = vfVar.ak();
        if (zH2 || objAk5 == obj2) {
            Object k5Var = new k5(yaVar, j5Var, w80VarP2, w80VarP, null);
            vfVar.be(k5Var);
            objAk5 = k5Var;
        }
        pk.d(vfVar, (gv) objAk5, yaVar);
        ms0 ms0Var = (ms0) w80Var.getValue();
        return ms0Var == null ? j5Var.c : ms0Var;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mk0 {
    public static final xs0 a = new xs0(ng.u);
    public static final qg b = new qg(ng.t);
    public static final pk0 c;

    static {
        long j = qc.g;
        c = new pk0(j, true);
        new pk0(j, false);
    }

    public static final my a(vf vfVar) {
        my pk0Var;
        long j = qc.g;
        vfVar.av(-1280632857);
        if (((Boolean) vfVar.j(a)).booleanValue()) {
            yy0 yy0Var = nk0.a;
            w80 w80VarP = bo0.p(new qc(j), vfVar);
            boolean zG = vfVar.g(true) | vfVar.c(Float.NaN);
            Object objAk = vfVar.ak();
            if (zG || objAk == nf.a) {
                objAk = new bg0(w80VarP);
                vfVar.be(objAk);
            }
            pk0Var = (bg0) objAk;
        } else {
            pk0Var = (mn.a(Float.NaN, Float.NaN) && qc.c(j, j)) ? c : new pk0(j, true);
        }
        vfVar.q(false);
        return pk0Var;
    }
}

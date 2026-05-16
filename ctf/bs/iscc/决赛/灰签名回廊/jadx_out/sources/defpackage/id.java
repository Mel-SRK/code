package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class id {
    public static final kd a = new kd(x6.b, bw.p);

    public static final kd a(v6 v6Var, z7 z7Var, vf vfVar, int i) {
        if (f00.h(v6Var, x6.b) && z7Var.equals(bw.p)) {
            vfVar.av(345884104);
            vfVar.q(false);
            return a;
        }
        vfVar.av(345937951);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && vfVar.f(v6Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !vfVar.f(z7Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objAk = vfVar.ak();
        if (z3 || objAk == nf.a) {
            objAk = new kd(v6Var, z7Var);
            vfVar.be(objAk);
        }
        kd kdVar = (kd) objAk;
        vfVar.q(false);
        return kdVar;
    }
}

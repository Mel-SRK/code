package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class dl0 {
    public static final el0 a = new el0(x6.a, bw.n);

    public static final el0 a(s6 s6Var, a8 a8Var, vf vfVar, int i) {
        if (f00.h(s6Var, x6.a) && f00.h(a8Var, bw.n)) {
            vfVar.av(-849160037);
            vfVar.q(false);
            return a;
        }
        vfVar.av(-849109166);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && vfVar.f(s6Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !vfVar.f(a8Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objAk = vfVar.ak();
        if (z3 || objAk == nf.a) {
            objAk = new el0(s6Var, a8Var);
            vfVar.be(objAk);
        }
        el0 el0Var = (el0) objAk;
        vfVar.q(false);
        return el0Var;
    }
}

package defpackage;

import androidx.compose.foundation.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class h60 {
    static {
        new a30(ng.p);
    }

    public static final void a(zc zcVar, dq0 dq0Var, pz0 pz0Var, vf vfVar, int i) {
        int i2;
        te teVar = d41.b;
        vfVar.aw(-2127166334);
        if ((i & 6) == 0) {
            i2 = (vfVar.f(zcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= vfVar.f(pz0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= vfVar.h(teVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && vfVar.z()) {
            vfVar.aq();
        } else {
            vfVar.as();
            if ((i & 1) == 0 || vfVar.x()) {
                dq0Var = (dq0) vfVar.j(eq0.a);
            } else {
                vfVar.aq();
            }
            vfVar.r();
            my myVarA = mk0.a(vfVar);
            long j = zcVar.a;
            boolean zE = vfVar.e(j);
            Object objAk = vfVar.ak();
            if (zE || objAk == nf.a) {
                objAk = new ix0(j, qc.b(j, 0.4f));
                vfVar.be(objAk);
            }
            az0.b(new ci0[]{cd.a.a(zcVar), c.a.a(myVarA), qk0.a.a(sd.b), eq0.a.a(dq0Var), jx0.a.a((ix0) objAk), qz0.a.a(pz0Var)}, t1.aq(-1066563262, new j(9, pz0Var), vfVar), vfVar, 56);
        }
        dq0 dq0Var2 = dq0Var;
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new j4(zcVar, dq0Var2, pz0Var, i, 3);
        }
    }
}

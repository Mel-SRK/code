package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class l4 extends x10 implements gv {
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ j70 g;
    public final /* synthetic */ bb0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(long j, boolean z, j70 j70Var, bb0 bb0Var) {
        super(2);
        this.e = j;
        this.f = z;
        this.g = j70Var;
        this.h = bb0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        vf vfVar = (vf) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && vfVar.z()) {
            vfVar.aq();
        } else {
            long j = this.e;
            n31 n31Var = nf.a;
            bb0 bb0Var = this.h;
            boolean z = this.f;
            if (j != 9205357640488583168L) {
                vfVar.av(-837727128);
                n31 n31Var2 = z ? f00.b : f00.a;
                j70 j70VarD = b.d(this.g, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), 0.0f, 0.0f, 12);
                el0 el0VarA = dl0.a(n31Var2, bw.n, vfVar, 0);
                int iHashCode = Long.hashCode(vfVar.ar);
                a aVarL = vfVar.l();
                j70 j70VarAn = m10.an(vfVar, j70VarD);
                kf.b.getClass();
                ng ngVar = jf.b;
                vfVar.ax();
                if (vfVar.aq) {
                    vfVar.k(ngVar);
                } else {
                    vfVar.bh();
                }
                jo0.h(vfVar, jf.e, el0VarA);
                jo0.h(vfVar, jf.d, aVarL);
                w6 w6Var = jf.f;
                if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode))) {
                    n5.j(iHashCode, vfVar, iHashCode, w6Var);
                }
                jo0.h(vfVar, jf.c, j70VarAn);
                boolean zH = vfVar.h(bb0Var);
                Object objAk = vfVar.ak();
                if (zH || objAk == n31Var) {
                    objAk = new k4(bb0Var, 0);
                    vfVar.be(objAk);
                }
                pk.h(g70.a, (pu) objAk, z, vfVar, 6);
                vfVar.q(true);
                vfVar.q(false);
            } else {
                vfVar.av(-836867312);
                boolean zH2 = vfVar.h(bb0Var);
                Object objAk2 = vfVar.ak();
                if (zH2 || objAk2 == n31Var) {
                    objAk2 = new k4(bb0Var, 1);
                    vfVar.be(objAk2);
                }
                pk.h(this.g, (pu) objAk2, z, vfVar, 0);
                vfVar.q(false);
            }
        }
        return wz0.a;
    }
}

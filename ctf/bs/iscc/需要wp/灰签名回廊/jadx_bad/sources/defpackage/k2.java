package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends x10 implements gv {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(long j, Object obj, int i) {
        super(2);
        this.e = i;
        this.f = j;
        this.g = obj;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                vf vfVar = (vf) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && vfVar.z()) {
                    vfVar.aq();
                } else {
                    long j = this.f;
                    if (j != 9205357640488583168L) {
                        vfVar.av(1828881000);
                        j70 j70VarD = b.d((j70) this.g, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), 0.0f, 0.0f, 12);
                        p60 p60VarD = m8.d(bw.f, false);
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
                        jo0.h(vfVar, jf.e, p60VarD);
                        jo0.h(vfVar, jf.d, aVarL);
                        w6 w6Var = jf.f;
                        if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode))) {
                            n5.j(iHashCode, vfVar, iHashCode, w6Var);
                        }
                        jo0.h(vfVar, jf.c, j70VarAn);
                        q2.b(null, vfVar, 0, 1);
                        vfVar.q(true);
                        vfVar.q(false);
                    } else {
                        vfVar.av(1829217412);
                        q2.b((j70) this.g, vfVar, 0, 0);
                        vfVar.q(false);
                    }
                }
                break;
            default:
                vf vfVar2 = (vf) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && vfVar2.z()) {
                    vfVar2.aq();
                } else {
                    m10.f(this.f, ((pz0) vfVar2.j(qz0.a)).m, t1.aq(1327513942, new j(2, (wd0) this.g), vfVar2), vfVar2, 384);
                }
                break;
        }
        return wz0.a;
    }
}

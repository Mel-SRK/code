package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.material3.MinimumInteractiveModifier;

/* JADX INFO: loaded from: classes.dex */
public final class nt0 extends x10 implements gv {
    public final /* synthetic */ j70 e;
    public final /* synthetic */ aq0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ g80 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ pu k;
    public final /* synthetic */ float l;
    public final /* synthetic */ te m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt0(j70 j70Var, aq0 aq0Var, long j, float f, g80 g80Var, boolean z, pu puVar, float f2, te teVar) {
        super(2);
        this.e = j70Var;
        this.f = aq0Var;
        this.g = j;
        this.h = f;
        this.i = g80Var;
        this.j = z;
        this.k = puVar;
        this.l = f2;
        this.m = teVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        vf vfVar = (vf) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && vfVar.z()) {
            vfVar.aq();
        } else {
            xs0 xs0Var = zz.a;
            j70 j70VarB = a.b(ot0.b(this.e.c(MinimumInteractiveModifier.a), this.f, ot0.c(this.g, this.h, vfVar), null, ((em) vfVar.j(og.h)).x(this.l)), this.i, mk0.a(vfVar), this.j, null, this.k);
            p60 p60VarD = m8.d(bw.e, true);
            int iHashCode = Long.hashCode(vfVar.ar);
            androidx.compose.runtime.internal.a aVarL = vfVar.l();
            j70 j70VarAn = m10.an(vfVar, j70VarB);
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
            this.m.f(vfVar, 0);
            vfVar.q(true);
        }
        return wz0.a;
    }
}

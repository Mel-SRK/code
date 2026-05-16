package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class mt0 extends x10 implements gv {
    public final /* synthetic */ j70 e;
    public final /* synthetic */ aq0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ l8 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ te k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt0(j70 j70Var, aq0 aq0Var, long j, float f, l8 l8Var, float f2, te teVar) {
        super(2);
        this.e = j70Var;
        this.f = aq0Var;
        this.g = j;
        this.h = f;
        this.i = l8Var;
        this.j = f2;
        this.k = teVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        vf vfVar = (vf) obj;
        int iIntValue = ((Number) obj2).intValue() & 3;
        wz0 wz0Var = wz0.a;
        if (iIntValue == 2 && vfVar.z()) {
            vfVar.aq();
            return wz0Var;
        }
        j70 j70VarB = ot0.b(this.e, this.f, ot0.c(this.g, this.h, vfVar), this.i, ((em) vfVar.j(og.h)).x(this.j));
        f50 f50Var = f50.ac;
        AtomicInteger atomicInteger = ro0.a;
        j70 j70VarC = j70VarB.c(new AppendedSemanticsElement(f50Var, false)).c(new SuspendPointerInputElement(wz0Var, null, new ut0(new w4(2, null, 1)), 6));
        p60 p60VarD = m8.d(bw.e, true);
        int iHashCode = Long.hashCode(vfVar.ar);
        a aVarL = vfVar.l();
        j70 j70VarAn = m10.an(vfVar, j70VarC);
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
        this.k.f(vfVar, 0);
        vfVar.q(true);
        return wz0Var;
    }
}

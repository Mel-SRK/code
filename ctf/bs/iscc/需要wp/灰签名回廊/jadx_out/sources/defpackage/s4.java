package defpackage;

import androidx.compose.ui.draw.a;

/* JADX INFO: loaded from: classes.dex */
public final class s4 extends x10 implements hv {
    public final /* synthetic */ pu e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(pu puVar, boolean z) {
        super(3);
        this.e = puVar;
        this.f = z;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        j70 j70Var = (j70) obj;
        vf vfVar = (vf) obj2;
        ((Number) obj3).intValue();
        vfVar.av(-196777734);
        long j = ((ix0) vfVar.j(jx0.a)).a;
        boolean zE = vfVar.e(j);
        pu puVar = this.e;
        boolean zF = zE | vfVar.f(puVar);
        boolean z = this.f;
        boolean zG = zF | vfVar.g(z);
        Object objAk = vfVar.ak();
        if (zG || objAk == nf.a) {
            objAk = new r4(j, puVar, z);
            vfVar.be(objAk);
        }
        j70 j70VarB = a.b(j70Var, (cv) objAk);
        vfVar.q(false);
        return j70VarB;
    }
}

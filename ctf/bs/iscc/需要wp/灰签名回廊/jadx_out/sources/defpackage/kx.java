package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes.dex */
public final class kx extends x10 implements hv {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ nx0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(int i, int i2, nx0 nx0Var) {
        super(3);
        this.e = i;
        this.f = i2;
        this.g = nx0Var;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        vf vfVar = (vf) obj2;
        ((Number) obj3).intValue();
        vfVar.av(408240218);
        int i = this.e;
        int i2 = this.f;
        pk.bk(i, i2);
        g70 g70Var = g70.a;
        if (i == 1 && i2 == Integer.MAX_VALUE) {
            vfVar.q(false);
            return g70Var;
        }
        em emVar = (em) vfVar.j(og.h);
        qt qtVar = (qt) vfVar.j(og.k);
        e20 e20Var = (e20) vfVar.j(og.n);
        nx0 nx0Var = this.g;
        boolean zF = vfVar.f(nx0Var) | vfVar.f(e20Var);
        Object objAk = vfVar.ak();
        n31 n31Var = nf.a;
        if (zF || objAk == n31Var) {
            objAk = wn0.k(nx0Var, e20Var);
            vfVar.be(objAk);
        }
        nx0 nx0Var2 = (nx0) objAk;
        boolean zF2 = vfVar.f(qtVar) | vfVar.f(nx0Var2);
        Object objAk2 = vfVar.ak();
        if (zF2 || objAk2 == n31Var) {
            yr0 yr0Var = nx0Var2.a;
            fu0 fu0Var = yr0Var.f;
            iu iuVar = yr0Var.c;
            if (iuVar == null) {
                iuVar = iu.f;
            }
            gu guVar = yr0Var.d;
            int i3 = guVar != null ? guVar.a : 0;
            hu huVar = yr0Var.e;
            objAk2 = ((rt) qtVar).b(fu0Var, iuVar, i3, huVar != null ? huVar.a : 65535);
            vfVar.be(objAk2);
        }
        ms0 ms0Var = (ms0) objAk2;
        boolean zF3 = vfVar.f(ms0Var.getValue()) | vfVar.f(emVar) | vfVar.f(qtVar) | vfVar.f(nx0Var) | vfVar.f(e20Var);
        Object objAk3 = vfVar.ak();
        if (zF3 || objAk3 == n31Var) {
            objAk3 = Integer.valueOf((int) (kv0.a(nx0Var2, emVar, qtVar, kv0.a, 1) & 4294967295L));
            vfVar.be(objAk3);
        }
        int iIntValue = ((Number) objAk3).intValue();
        boolean zF4 = vfVar.f(ms0Var.getValue()) | vfVar.f(emVar) | vfVar.f(qtVar) | vfVar.f(nx0Var) | vfVar.f(e20Var);
        Object objAk4 = vfVar.ak();
        if (zF4 || objAk4 == n31Var) {
            StringBuilder sb = new StringBuilder();
            String str = kv0.a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objAk4 = Integer.valueOf((int) (kv0.a(nx0Var2, emVar, qtVar, sb.toString(), 2) & 4294967295L));
            vfVar.be(objAk4);
        }
        int iIntValue2 = ((Number) objAk4).intValue() - iIntValue;
        Integer numValueOf = i == 1 ? null : Integer.valueOf(((i - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i2 != Integer.MAX_VALUE ? Integer.valueOf(((i2 - 1) * iIntValue2) + iIntValue) : null;
        j70 j70VarC = b.c(g70Var, numValueOf != null ? emVar.be(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? emVar.be(numValueOf2.intValue()) : Float.NaN);
        vfVar.q(false);
        return j70VarC;
    }
}

package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class j extends x10 implements gv {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, int i2, Object obj) {
        super(2);
        this.e = i2;
        this.f = obj;
    }

    /* JADX WARN: Type inference failed for: r8v34, types: [hv, java.lang.Object, x10] */
    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                vf vfVar = (vf) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (vfVar.an(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((k) this.f).a(0, vfVar);
                } else {
                    vfVar.aq();
                }
                return wz0.a;
            case 1:
                ((Number) obj2).intValue();
                m8.a((j70) this.f, (vf) obj, d41.ar(1));
                return wz0.a;
            case 2:
                vf vfVar2 = (vf) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && vfVar2.z()) {
                    vfVar2.aq();
                } else {
                    j70 j70VarB = a.b(b.a(g70.a, t9.b, t9.c), (wd0) this.f);
                    r6 r6Var = x6.c;
                    a8 a8Var = bw.o;
                    te teVar = d41.e;
                    el0 el0VarA = dl0.a(r6Var, a8Var, vfVar2, 54);
                    int iAd = pk.ad(vfVar2);
                    androidx.compose.runtime.internal.a aVarL = vfVar2.l();
                    j70 j70VarAn = m10.an(vfVar2, j70VarB);
                    kf.b.getClass();
                    ng ngVar = jf.b;
                    vfVar2.ax();
                    if (vfVar2.aq) {
                        vfVar2.k(ngVar);
                    } else {
                        vfVar2.bh();
                    }
                    jo0.h(vfVar2, jf.e, el0VarA);
                    jo0.h(vfVar2, jf.d, aVarL);
                    w6 w6Var = jf.f;
                    if (vfVar2.aq || !f00.h(vfVar2.ak(), Integer.valueOf(iAd))) {
                        n5.j(iAd, vfVar2, iAd, w6Var);
                    }
                    jo0.h(vfVar2, jf.c, j70VarAn);
                    teVar.c(fl0.a, vfVar2, 6);
                    vfVar2.q(true);
                }
                return wz0.a;
            case 3:
                vf vfVar3 = (vf) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && vfVar3.z()) {
                    vfVar3.aq();
                } else {
                    te teVar2 = (te) this.f;
                    kd kdVarA = id.a(x6.b, bw.p, vfVar3, 0);
                    int iAd2 = pk.ad(vfVar3);
                    androidx.compose.runtime.internal.a aVarL2 = vfVar3.l();
                    j70 j70VarAn2 = m10.an(vfVar3, g70.a);
                    kf.b.getClass();
                    ng ngVar2 = jf.b;
                    vfVar3.ax();
                    if (vfVar3.aq) {
                        vfVar3.k(ngVar2);
                    } else {
                        vfVar3.bh();
                    }
                    jo0.h(vfVar3, jf.e, kdVarA);
                    jo0.h(vfVar3, jf.d, aVarL2);
                    w6 w6Var2 = jf.f;
                    if (vfVar3.aq || !f00.h(vfVar3.ak(), Integer.valueOf(iAd2))) {
                        n5.j(iAd2, vfVar3, iAd2, w6Var2);
                    }
                    jo0.h(vfVar3, jf.c, j70VarAn2);
                    teVar2.c(ld.a, vfVar3, 6);
                    vfVar3.q(true);
                }
                return wz0.a;
            case 4:
                ((Number) obj2).intValue();
                ((lf) this.f).a(d41.ar(1), (vf) obj);
                return wz0.a;
            case 5:
                j70 j70Var = (j70) obj;
                j70 j70VarAm = (h70) obj2;
                vf vfVar4 = (vf) this.f;
                if (j70VarAm instanceof mf) {
                    ?? r8 = ((mf) j70VarAm).m;
                    az0.p(3, r8);
                    j70VarAm = m10.am(vfVar4, (j70) r8.c(g70.a, vfVar4, 0));
                }
                return j70Var.c(j70VarAm);
            case 6:
                ((Number) obj2).intValue();
                az0.f((cw0) this.f, (vf) obj, d41.ar(1));
                return wz0.a;
            case 7:
                long j = ((xa0) obj2).a;
                ((b50) this.f).f.c(((pg0) obj).c);
                return wz0.a;
            case MainActivity.$stable /* 8 */:
                ((fv0) this.f).e(((xa0) obj2).a);
                return wz0.a;
            case 9:
                vf vfVar5 = (vf) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && vfVar5.z()) {
                    vfVar5.aq();
                } else {
                    ww0.a(((pz0) this.f).j, vfVar5, 0);
                }
                return wz0.a;
            case 10:
                ((Number) obj2).intValue();
                ((zg0) this.f).a(d41.ar(1), (vf) obj);
                return wz0.a;
            case 11:
                ((Number) obj2).intValue();
                ww0.a((nx0) this.f, (vf) obj, d41.ar(1));
                return wz0.a;
            default:
                return new pz(t1.b(0, Math.round((1 + ((a8) this.f).a) * (((int) (((wz) obj).a & 4294967295L)) / 2.0f))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Object obj) {
        super(2);
        this.e = i;
        this.f = obj;
    }
}

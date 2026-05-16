package defpackage;

import androidx.compose.ui.draw.a;

/* JADX INFO: loaded from: classes.dex */
public final class p2 extends x10 implements hv {
    public static final p2 f;
    public static final p2 g;
    public final /* synthetic */ int e;

    static {
        int i = 3;
        f = new p2(i, 0);
        g = new p2(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(int i, int i2) {
        super(i);
        this.e = i2;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                j70 j70Var = (j70) obj;
                vf vfVar = (vf) obj2;
                ((Number) obj3).intValue();
                vfVar.av(-2126899193);
                long j = ((ix0) vfVar.j(jx0.a)).a;
                boolean zE = vfVar.e(j);
                Object objAk = vfVar.ak();
                if (zE || objAk == nf.a) {
                    objAk = new o2(j, 0);
                    vfVar.be(objAk);
                }
                j70 j70VarC = j70Var.c(a.b(g70.a, (cv) objAk));
                vfVar.q(false);
                return j70VarC;
            default:
                ly0 ly0Var = (ly0) obj;
                vf vfVar2 = (vf) obj2;
                ((Number) obj3).intValue();
                vfVar2.av(-1154662212);
                hz hzVar = hz.d;
                hz hzVar2 = hz.e;
                Object objAk2 = ly0Var.a(hzVar, hzVar2) ? f00.ak(67, 2, fp.b) : (ly0Var.a(hzVar2, hzVar) || ly0Var.a(hz.f, hzVar2)) ? new yy0(83, 67, fp.b) : f00.ad(7, null);
                vfVar2.q(false);
                return objAk2;
        }
    }
}

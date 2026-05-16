package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lx0 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ mx0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lx0(mx0 mx0Var, int i) {
        super(1);
        this.e = i;
        this.f = mx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    @Override // defpackage.cv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        em emVar;
        zw0 zw0Var;
        switch (this.e) {
            case 0:
                List list = (List) obj;
                mx0 mx0Var = this.f;
                fe0 fe0VarBu = mx0Var.bu();
                nx0 nx0VarE = nx0.e(mx0Var.s, qc.g, 0L, 0L, 0, 0L, 16777214);
                e20 e20Var = fe0VarBu.o;
                zw0 zw0Var2 = null;
                if (e20Var != null && (emVar = fe0VarBu.i) != null) {
                    b6 b6Var = new b6(fe0VarBu.a, null, 6);
                    if (fe0VarBu.j == null || fe0VarBu.n == null) {
                        zw0Var = null;
                    } else {
                        long jA = dh.a(fe0VarBu.p, 0, 0, 0, 0, 10);
                        int i = fe0VarBu.f;
                        boolean z = fe0VarBu.e;
                        int i2 = fe0VarBu.d;
                        qt qtVar = fe0VarBu.c;
                        rq rqVar = rq.d;
                        zw0Var = new zw0(new yw0(b6Var, nx0VarE, rqVar, i, z, i2, emVar, e20Var, qtVar, jA), new y70(new g20(b6Var, nx0VarE, rqVar, emVar, qtVar), jA, fe0VarBu.f, fe0VarBu.d == 2), fe0VarBu.l);
                    }
                }
                if (zw0Var != null) {
                    list.add(zw0Var);
                    zw0Var2 = zw0Var;
                }
                break;
            case 1:
                String str = ((b6) obj).e;
                mx0 mx0Var2 = this.f;
                kx0 kx0Var = mx0Var2.ab;
                if (kx0Var == null) {
                    kx0 kx0Var2 = new kx0(mx0Var2.r, str);
                    fe0 fe0Var = new fe0(str, mx0Var2.s, mx0Var2.t, mx0Var2.u, mx0Var2.v, mx0Var2.w, mx0Var2.x);
                    fe0Var.d(mx0Var2.bu().i);
                    kx0Var2.d = fe0Var;
                    mx0Var2.ab = kx0Var2;
                } else if (!f00.h(str, kx0Var.b)) {
                    kx0Var.b = str;
                    fe0 fe0Var2 = kx0Var.d;
                    if (fe0Var2 != null) {
                        nx0 nx0Var = mx0Var2.s;
                        qt qtVar2 = mx0Var2.t;
                        int i3 = mx0Var2.u;
                        boolean z2 = mx0Var2.v;
                        int i4 = mx0Var2.w;
                        int i5 = mx0Var2.x;
                        fe0Var2.a = str;
                        fe0Var2.b = nx0Var;
                        fe0Var2.c = qtVar2;
                        fe0Var2.d = i3;
                        fe0Var2.e = z2;
                        fe0Var2.f = i4;
                        fe0Var2.g = i5;
                        fe0Var2.c();
                    }
                }
                q6.j(mx0Var2);
                d41.aa(mx0Var2);
                t1.ae(mx0Var2);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                mx0 mx0Var3 = this.f;
                kx0 kx0Var3 = mx0Var3.ab;
                if (kx0Var3 != null) {
                    kx0Var3.c = zBooleanValue;
                    q6.j(mx0Var3);
                    d41.aa(mx0Var3);
                    t1.ae(mx0Var3);
                }
                break;
        }
        return Boolean.TRUE;
    }
}

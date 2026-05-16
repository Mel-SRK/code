package defpackage;

import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class im0 implements gv {
    public final /* synthetic */ int d;

    public /* synthetic */ im0(int i) {
        this.d = i;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((s01) obj2).a;
            case 1:
                return ((g01) obj2).a;
            case 2:
                ql0 ql0Var = (ql0) obj;
                ge0 ge0Var = (ge0) obj2;
                yu0 yu0Var = new yu0(ge0Var.a);
                ev0 ev0Var = new ev0(ge0Var.b);
                Object objA = lm0.a(new qx0(ge0Var.c), lm0.q, ql0Var);
                pw0 pw0Var = ge0Var.d;
                pw0 pw0Var2 = pw0.c;
                Object objA2 = lm0.a(pw0Var, lm0.l, ql0Var);
                Object objA3 = lm0.a(ge0Var.e, d41.i, ql0Var);
                e40 e40Var = ge0Var.f;
                e40 e40Var2 = e40.c;
                return f00.i(yu0Var, ev0Var, objA, objA2, objA3, lm0.a(e40Var, lm0.u, ql0Var), lm0.a(new z30(ge0Var.g), d41.j, ql0Var), new yx(ge0Var.h), lm0.a(ge0Var.i, d41.k, ql0Var));
            case 3:
                ql0 ql0Var2 = (ql0) obj;
                yr0 yr0Var = (yr0) obj2;
                qc qcVar = new qc(yr0Var.a.b());
                km0 km0Var = lm0.p;
                Object objA4 = lm0.a(qcVar, km0Var, ql0Var2);
                qx0 qx0Var = new qx0(yr0Var.b);
                km0 km0Var2 = lm0.q;
                Object objA5 = lm0.a(qx0Var, km0Var2, ql0Var2);
                iu iuVar = yr0Var.c;
                iu iuVar2 = iu.e;
                Object objA6 = lm0.a(iuVar, lm0.m, ql0Var2);
                gu guVar = yr0Var.d;
                hu huVar = yr0Var.e;
                String str = yr0Var.g;
                Object objA7 = lm0.a(new qx0(yr0Var.h), km0Var2, ql0Var2);
                Object objA8 = lm0.a(yr0Var.i, lm0.n, ql0Var2);
                Object objA9 = lm0.a(yr0Var.j, lm0.k, ql0Var2);
                t40 t40Var = yr0Var.k;
                t40 t40Var2 = t40.f;
                Object objA10 = lm0.a(t40Var, lm0.s, ql0Var2);
                Object objA11 = lm0.a(new qc(yr0Var.l), km0Var, ql0Var2);
                Object objA12 = lm0.a(yr0Var.m, lm0.j, ql0Var2);
                yp0 yp0Var = yr0Var.n;
                yp0 yp0Var2 = yp0.d;
                return f00.i(objA4, objA5, objA6, guVar, huVar, -1, str, objA7, objA8, objA9, objA10, objA11, objA12, lm0.a(yp0Var, lm0.o, ql0Var2));
            case 4:
                ql0 ql0Var3 = (ql0) obj;
                dx0 dx0Var = (dx0) obj2;
                yr0 yr0Var2 = dx0Var.a;
                f1 f1Var = lm0.h;
                return f00.i(lm0.a(yr0Var2, f1Var, ql0Var3), lm0.a(dx0Var.b, f1Var, ql0Var3), lm0.a(dx0Var.c, f1Var, ql0Var3), lm0.a(dx0Var.d, f1Var, ql0Var3));
            case 5:
                Boolean boolValueOf = Boolean.valueOf(((xf0) obj2).a);
                f1 f1Var2 = lm0.a;
                return f00.i(boolValueOf, new lq());
            case 6:
                return Integer.valueOf(((z30) obj2).a);
            case 7:
                fx0 fx0Var = (fx0) obj2;
                ex0 ex0Var = new ex0(fx0Var.a);
                f1 f1Var3 = lm0.a;
                return f00.i(ex0Var, Boolean.valueOf(fx0Var.b));
            case MainActivity.$stable /* 8 */:
                return obj;
            case 9:
                if (obj == null) {
                    return null;
                }
                wc.c();
                return null;
            default:
                return (xx0) obj;
        }
    }
}

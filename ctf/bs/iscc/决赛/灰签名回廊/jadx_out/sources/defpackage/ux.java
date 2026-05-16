package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ux extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(lf0[] lf0VarArr, el0 el0Var, int i, int[] iArr) {
        super(1);
        this.e = 1;
        this.g = lf0VarArr;
        this.h = el0Var;
        this.f = i;
        this.i = iArr;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                kf0 kf0Var = (kf0) obj;
                lf0 lf0Var = (lf0) this.i;
                r60 r60Var = (r60) this.g;
                vx vxVar = (vx) this.h;
                int i = vxVar.b;
                zv0 zv0Var = vxVar.a;
                jy0 jy0Var = vxVar.c;
                ax0 ax0Var = (ax0) vxVar.d.a();
                zv0Var.a(wc0.e, jo0.b(r60Var, i, jy0Var, ax0Var != null ? ax0Var.a : null, r60Var.getLayoutDirection() == e20.e, lf0Var.d), this.f, lf0Var.d);
                kf0.j(kf0Var, lf0Var, Math.round(-zv0Var.a.g()), 0);
                break;
            case 1:
                kf0 kf0Var2 = (kf0) obj;
                lf0[] lf0VarArr = (lf0[]) this.g;
                el0 el0Var = (el0) this.h;
                int[] iArr = (int[]) this.i;
                int length = lf0VarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    lf0 lf0Var2 = lf0VarArr[i2];
                    lf0Var2.getClass();
                    lf0Var2.j();
                    kf0.h(kf0Var2, lf0Var2, iArr[i3], Math.round((1 + el0Var.b.a) * ((this.f - lf0Var2.e) / 2.0f)));
                    i2++;
                    i3++;
                }
                break;
            default:
                kf0 kf0Var3 = (kf0) obj;
                lf0 lf0Var3 = (lf0) this.i;
                r60 r60Var2 = (r60) this.g;
                x01 x01Var = (x01) this.h;
                int i4 = x01Var.b;
                zv0 zv0Var2 = x01Var.a;
                jy0 jy0Var2 = x01Var.c;
                ax0 ax0Var2 = (ax0) x01Var.d.a();
                zv0Var2.a(wc0.d, jo0.b(r60Var2, i4, jy0Var2, ax0Var2 != null ? ax0Var2.a : null, false, lf0Var3.d), this.f, lf0Var3.e);
                kf0.j(kf0Var3, lf0Var3, 0, Math.round(-zv0Var2.a.g()));
                break;
        }
        return wz0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux(r60 r60Var, j20 j20Var, lf0 lf0Var, int i, int i2) {
        super(1);
        this.e = i2;
        this.g = r60Var;
        this.h = j20Var;
        this.i = lf0Var;
        this.f = i;
    }
}

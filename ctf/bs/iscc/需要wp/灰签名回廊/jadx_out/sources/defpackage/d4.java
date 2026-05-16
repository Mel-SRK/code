package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d4 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ lf0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(lf0 lf0Var, int i) {
        super(1);
        this.e = i;
        this.f = lf0Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                kf0.j((kf0) obj, this.f, 0, 0);
                break;
            case 1:
                kf0.j((kf0) obj, this.f, 0, 0);
                break;
            case 2:
                kf0 kf0Var = (kf0) obj;
                e20 e20VarE = kf0Var.e();
                e20 e20Var = e20.d;
                lf0 lf0Var = this.f;
                if (e20VarE == e20Var || kf0Var.f() == 0) {
                    kf0.a(kf0Var, lf0Var);
                    lf0Var.bc(pz.c(0L, lf0Var.h), 0.0f, null);
                } else {
                    int i = (int) 0;
                    long jF = ((long) ((kf0Var.f() - lf0Var.d) - i)) << 32;
                    kf0.a(kf0Var, lf0Var);
                    lf0Var.bc(pz.c((((long) i) & 4294967295L) | jF, lf0Var.h), 0.0f, null);
                }
                break;
            case 3:
                kf0.l((kf0) obj, this.f, 0, 0);
                break;
            case 4:
                kf0.h((kf0) obj, this.f, 0, 0);
                break;
            case 5:
                kf0.j((kf0) obj, this.f, 0, 0);
                break;
            case 6:
                kf0.j((kf0) obj, this.f, 0, 0);
                break;
            case 7:
                kf0.h((kf0) obj, this.f, 0, 0);
                break;
            default:
                kf0.j((kf0) obj, this.f, 0, 0);
                break;
        }
        return wz0.a;
    }
}

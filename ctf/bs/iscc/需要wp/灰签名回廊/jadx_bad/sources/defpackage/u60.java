package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u60 implements s30 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u60(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.s30
    public final void d(u30 u30Var, n30 n30Var) {
        switch (this.d) {
            case 0:
                w60 w60Var = (w60) this.e;
                w60Var.getClass();
                if (n30Var == n30.ON_DESTROY) {
                    w60Var.a();
                }
                break;
            default:
                dm0 dm0Var = (dm0) this.e;
                if (n30Var == n30.ON_START) {
                    dm0Var.h = true;
                } else if (n30Var == n30.ON_STOP) {
                    dm0Var.h = false;
                }
                break;
        }
    }
}

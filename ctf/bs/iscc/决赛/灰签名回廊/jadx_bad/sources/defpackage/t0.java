package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ xi0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(xi0 xi0Var, int i) {
        super(1);
        this.e = i;
        this.f = xi0Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        boolean z;
        switch (this.e) {
            case 0:
                this.f.d = (gt) obj;
                return Boolean.TRUE;
            case 1:
                lg0 lg0Var = (lg0) obj;
                xi0 xi0Var = this.f;
                Object obj2 = xi0Var.d;
                if (obj2 == null && lg0Var.s) {
                    xi0Var.d = lg0Var;
                } else if (obj2 != null) {
                    lg0Var.getClass();
                }
                return Boolean.TRUE;
            default:
                Object obj3 = (sy0) obj;
                if (((i70) obj3).d.q) {
                    this.f.d = obj3;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}

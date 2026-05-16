package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class io extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ in0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ io(in0 in0Var, int i) {
        super(0);
        this.e = i;
        this.f = in0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    @Override // defpackage.pu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        boolean z;
        switch (this.e) {
            case 0:
                o9 o9Var = this.f.x;
                if (o9Var != null) {
                    o9Var.u(tn.a);
                }
                return wz0.a;
            case 1:
                rn0 rn0Var = this.f.af;
                if (!rn0Var.a.b()) {
                    qd0 qd0Var = rn0Var.b;
                    z = qd0Var != null ? qd0Var.d() : false;
                }
                return Boolean.valueOf(!z);
            default:
                xs0 xs0Var = og.h;
                in0 in0Var = this.f;
                in0Var.ae.e = new bu(3, new bu((em) i60.ab(in0Var, xs0Var)));
                return wz0.a;
        }
    }
}

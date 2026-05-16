package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jo extends x10 implements gv {
    public final /* synthetic */ int e;
    public final /* synthetic */ in0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jo(in0 in0Var, int i) {
        super(2);
        this.e = i;
        this.f = in0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                pg0 pg0Var = (pg0) obj;
                long j = ((xa0) obj2).a;
                in0 in0Var = this.f;
                if (((Boolean) in0Var.u.g(pg0Var)).booleanValue()) {
                    if (!in0Var.z) {
                        if (in0Var.x == null) {
                            in0Var.x = i60.a(Integer.MAX_VALUE, 6, null);
                        }
                        in0Var.z = true;
                        i60.an(in0Var.bi(), null, new no(in0Var, null), 3);
                    }
                    long j2 = pg0Var.c;
                    long jF = xa0.f(j2, d41.h(xa0.d(j) * Math.signum(xa0.d(j2)), xa0.e(j) * Math.signum(xa0.e(j2))));
                    o9 o9Var = in0Var.x;
                    if (o9Var != null) {
                        o9Var.u(new vn(jF));
                    }
                }
                return wz0.a;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                in0 in0Var2 = this.f;
                i60.an(in0Var2.bi(), null, new hn0(in0Var2, fFloatValue, fFloatValue2, null), 3);
                return Boolean.TRUE;
        }
    }
}

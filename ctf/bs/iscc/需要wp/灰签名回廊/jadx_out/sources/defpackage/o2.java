package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o2 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(long j, int i) {
        super(1);
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                y9 y9Var = (y9) obj;
                float fD = pq0.d(y9Var.d.c()) / 2.0f;
                return y9Var.a(new n2(fD, pk.t(y9Var, fD), new c8(this.f, 5)));
            default:
                ((po0) obj).d(io0.c, new ho0(vw.d, this.f, 2, true));
                return wz0.a;
        }
    }
}

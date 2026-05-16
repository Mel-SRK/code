package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xj0 implements kn {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk0 b;

    public /* synthetic */ xj0(bk0 bk0Var, int i) {
        this.a = i;
        this.b = bk0Var;
    }

    @Override // defpackage.kn
    public final double b(double d) {
        switch (this.a) {
            case 0:
                return i60.r(this.b.k.b(d), r10.e, r10.f);
            default:
                return this.b.n.b(i60.r(d, r0.e, r0.f));
        }
    }
}

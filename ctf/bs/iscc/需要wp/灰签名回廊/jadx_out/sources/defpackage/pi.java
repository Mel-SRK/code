package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pi extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ cw0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi(cw0 cw0Var, int i) {
        super(1);
        this.e = i;
        this.f = cw0Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                return new w1(2, this.f);
            default:
                long j = ((xa0) obj).a;
                this.f.o();
                return wz0.a;
        }
    }
}

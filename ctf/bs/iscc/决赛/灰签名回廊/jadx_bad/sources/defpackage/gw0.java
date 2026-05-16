package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gw0 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw0(int i, Object obj) {
        super(1);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                return new xa0(((xa0) ((pu) this.f).a()).a);
            default:
                return new w1(3, (ny0) this.f);
        }
    }
}

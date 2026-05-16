package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b50 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ fv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b50(fv0 fv0Var, int i) {
        super(1);
        this.e = i;
        this.f = fv0Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                this.f.c(((xa0) obj).a);
                break;
            default:
                pg0 pg0Var = (pg0) obj;
                this.f.e(d41.ai(pg0Var, false));
                pg0Var.a();
                break;
        }
        return wz0.a;
    }
}

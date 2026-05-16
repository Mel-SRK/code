package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g00 extends qj0 {
    public int e;
    public final /* synthetic */ gv f;
    public final /* synthetic */ ji g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g00(ji jiVar, ji jiVar2, gv gvVar) {
        super(jiVar);
        this.f = gvVar;
        this.g = jiVar2;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                wc.q("This coroutine had already completed");
                return null;
            }
            this.e = 2;
            i60.az(obj);
            return obj;
        }
        this.e = 1;
        i60.az(obj);
        gv gvVar = this.f;
        gvVar.getClass();
        az0.p(2, gvVar);
        return gvVar.f(this.g, this);
    }
}

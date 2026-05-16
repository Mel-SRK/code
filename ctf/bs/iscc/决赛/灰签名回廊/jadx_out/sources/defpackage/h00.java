package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h00 extends ki {
    public int g;
    public final /* synthetic */ gv h;
    public final /* synthetic */ ji i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(ji jiVar, pj pjVar, gv gvVar, ji jiVar2) {
        super(jiVar, pjVar);
        this.h = gvVar;
        this.i = jiVar2;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                wc.q("This coroutine had already completed");
                return null;
            }
            this.g = 2;
            i60.az(obj);
            return obj;
        }
        this.g = 1;
        i60.az(obj);
        gv gvVar = this.h;
        gvVar.getClass();
        az0.p(2, gvVar);
        return gvVar.f(this.i, this);
    }
}

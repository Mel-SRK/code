package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ph extends x10 implements gv {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ pu f;
    public final /* synthetic */ a2 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(zh zhVar, pu puVar, j70 j70Var, a2 a2Var, int i) {
        super(2);
        this.i = zhVar;
        this.f = puVar;
        this.j = j70Var;
        this.g = a2Var;
        this.h = i;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Number) obj2).intValue();
                zh zhVar = (zh) this.i;
                j70 j70Var = (j70) this.j;
                e00.b(zhVar, this.f, j70Var, this.g, (vf) obj, d41.ar(this.h | 1));
                break;
            default:
                ((Number) obj2).intValue();
                bh0 bh0Var = (bh0) this.i;
                rh rhVar = (rh) this.j;
                fi.d(bh0Var, this.f, rhVar, this.g, (vf) obj, d41.ar(this.h | 1));
                break;
        }
        return wz0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(bh0 bh0Var, pu puVar, rh rhVar, a2 a2Var, int i) {
        super(2);
        this.i = bh0Var;
        this.f = puVar;
        this.j = rhVar;
        this.g = a2Var;
        this.h = i;
    }
}

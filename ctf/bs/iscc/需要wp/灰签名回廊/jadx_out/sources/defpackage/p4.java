package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p4 extends x10 implements gv {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(j70 j70Var, pu puVar, boolean z, int i) {
        super(2);
        this.h = j70Var;
        this.i = puVar;
        this.f = z;
        this.g = i;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        int i = this.e;
        vf vfVar = (vf) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                pk.h((j70) this.h, (pu) this.i, this.f, vfVar, d41.ar(this.g | 1));
                break;
            default:
                lI.b(this.f, (oj0) this.h, (cw0) this.i, vfVar, d41.ar(this.g | 1));
                break;
        }
        return wz0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(boolean z, oj0 oj0Var, cw0 cw0Var, int i) {
        super(2);
        this.f = z;
        this.h = oj0Var;
        this.i = cw0Var;
        this.g = i;
    }
}

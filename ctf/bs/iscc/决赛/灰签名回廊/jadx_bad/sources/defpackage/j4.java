package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends x10 implements gv {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(zh zhVar, pu puVar, a2 a2Var, int i) {
        super(2);
        this.e = 1;
        this.g = zhVar;
        this.h = puVar;
        this.i = a2Var;
        this.f = i;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Number) obj2).intValue();
                pk.c((bb0) this.g, (bx) this.h, (te) this.i, (vf) obj, d41.ar(this.f | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                zh zhVar = (zh) this.g;
                pu puVar = (pu) this.h;
                a2 a2Var = (a2) this.i;
                e00.b(zhVar, puVar, g70.a, a2Var, (vf) obj, d41.ar(this.f | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                fi.c((bh0) this.g, (pu) this.h, (a2) this.i, (vf) obj, d41.ar(this.f | 1));
                break;
            default:
                ((Number) obj2).intValue();
                h60.a((zc) this.g, (dq0) this.h, (pz0) this.i, (vf) obj, d41.ar(this.f | 1));
                break;
        }
        return wz0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(bh0 bh0Var, pu puVar, a2 a2Var, int i) {
        super(2);
        this.e = 2;
        this.g = bh0Var;
        this.h = puVar;
        this.i = a2Var;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4(Object obj, Object obj2, Object obj3, int i, int i2) {
        super(2);
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.f = i;
    }
}

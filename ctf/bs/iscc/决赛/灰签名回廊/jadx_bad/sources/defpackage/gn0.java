package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gn0 extends tt0 implements gv {
    public final /* synthetic */ int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn0(long j, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = j;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        pn0 pn0Var = (pn0) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
            case 0:
                gn0 gn0Var = (gn0) k(jiVar, pn0Var);
                wz0 wz0Var = wz0.a;
                gn0Var.o(wz0Var);
                return wz0Var;
            default:
                gn0 gn0Var2 = (gn0) k(jiVar, pn0Var);
                wz0 wz0Var2 = wz0.a;
                gn0Var2.o(wz0Var2);
                return wz0Var2;
        }
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                gn0 gn0Var = new gn0(this.j, jiVar, 0);
                gn0Var.i = obj;
                return gn0Var;
            default:
                gn0 gn0Var2 = new gn0(this.j, jiVar, 1);
                gn0Var2.i = obj;
                return gn0Var2;
        }
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        switch (this.h) {
            case 0:
                i60.az(obj);
                rn0 rn0Var = ((pn0) this.i).a;
                rn0.a(rn0Var, rn0Var.h, this.j, 1);
                break;
            default:
                i60.az(obj);
                rn0 rn0Var2 = ((pn0) this.i).a;
                rn0.a(rn0Var2, rn0Var2.h, this.j, 1);
                break;
        }
        return wz0.a;
    }
}

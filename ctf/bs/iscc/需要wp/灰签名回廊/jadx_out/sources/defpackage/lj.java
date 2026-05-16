package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lj extends tt0 implements gv {
    public /* synthetic */ Object h;
    public final /* synthetic */ tg0 i;
    public final /* synthetic */ fv0 j;
    public final /* synthetic */ cw0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(tg0 tg0Var, fv0 fv0Var, cw0 cw0Var, ji jiVar) {
        super(2, jiVar);
        this.i = tg0Var;
        this.j = fv0Var;
        this.k = cw0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        lj ljVar = (lj) k((ji) obj2, (xj) obj);
        wz0 wz0Var = wz0.a;
        ljVar.o(wz0Var);
        return wz0Var;
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        lj ljVar = new lj(this.i, this.j, this.k, jiVar);
        ljVar.h = obj;
        return ljVar;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        i60.az(obj);
        xj xjVar = (xj) this.h;
        tg0 tg0Var = this.i;
        ji jiVar = null;
        i60.an(xjVar, null, new kj(tg0Var, this.j, jiVar, 0), 1);
        i60.an(xjVar, null, new c(tg0Var, this.k, jiVar, 11), 1);
        return wz0.a;
    }
}

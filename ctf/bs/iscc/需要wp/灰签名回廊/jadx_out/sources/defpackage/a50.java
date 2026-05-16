package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a50 extends tt0 implements gv {
    public /* synthetic */ Object h;
    public final /* synthetic */ tg0 i;
    public final /* synthetic */ fv0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a50(tg0 tg0Var, fv0 fv0Var, ji jiVar) {
        super(2, jiVar);
        this.i = tg0Var;
        this.j = fv0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((a50) k((ji) obj2, (xj) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        a50 a50Var = new a50(this.i, this.j, jiVar);
        a50Var.h = obj;
        return a50Var;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        i60.az(obj);
        xj xjVar = (xj) this.h;
        tg0 tg0Var = this.i;
        fv0 fv0Var = this.j;
        i60.an(xjVar, null, new kj(tg0Var, fv0Var, null, 1), 1);
        return i60.an(xjVar, null, new kj(tg0Var, fv0Var, null, 2), 1);
    }
}

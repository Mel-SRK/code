package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pu0 extends rj0 implements gv {
    public int f;
    public /* synthetic */ Object g;

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((pu0) k((ji) obj2, (yt0) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        pu0 pu0Var = new pu0(jiVar);
        pu0Var.g = obj;
        return pu0Var;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                i60.az(obj);
                return obj;
            }
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i60.az(obj);
        yt0 yt0Var = (yt0) this.g;
        this.f = 1;
        Object objD = su0.d(yt0Var, jg0.e, this);
        yj yjVar = yj.d;
        return objD == yjVar ? yjVar : objD;
    }
}

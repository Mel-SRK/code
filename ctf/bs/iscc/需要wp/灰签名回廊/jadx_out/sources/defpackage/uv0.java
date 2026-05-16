package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uv0 extends tt0 implements gv {
    public w80 h;
    public int i;
    public final /* synthetic */ w80 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ g80 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv0(w80 w80Var, boolean z, g80 g80Var, ji jiVar) {
        super(2, jiVar);
        this.j = w80Var;
        this.k = z;
        this.l = g80Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((uv0) k((ji) obj2, (xj) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        return new uv0(this.j, this.k, this.l, jiVar);
    }

    @Override // defpackage.s7
    public final Object o(Object obj) throws Throwable {
        w80 w80Var;
        int i = this.i;
        if (i == 0) {
            i60.az(obj);
            w80Var = this.j;
            jh0 jh0Var = (jh0) w80Var.getValue();
            if (jh0Var != null) {
                yz kh0Var = this.k ? new kh0(jh0Var) : new ih0(jh0Var);
                g80 g80Var = this.l;
                if (g80Var != null) {
                    this.h = w80Var;
                    this.i = 1;
                    Object objA = g80Var.a(kh0Var, this);
                    yj yjVar = yj.d;
                    if (objA == yjVar) {
                        return yjVar;
                    }
                }
            }
            return wz0.a;
        }
        if (i != 1) {
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w80Var = this.h;
        i60.az(obj);
        w80Var.setValue(null);
        return wz0.a;
    }
}

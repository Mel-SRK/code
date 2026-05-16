package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ll extends tt0 implements gv {
    public int h;
    public final /* synthetic */ nl i;
    public final /* synthetic */ int j;
    public final /* synthetic */ w8 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(nl nlVar, int i, w8 w8Var, ji jiVar) {
        super(2, jiVar);
        this.i = nlVar;
        this.j = i;
        this.k = w8Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((ll) k((ji) obj2, (xj) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        return new ll(this.i, this.j, this.k, jiVar);
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        int i = this.h;
        if (i == 0) {
            i60.az(obj);
            nl nlVar = this.i;
            f90 f90Var = nlVar.c;
            ml mlVar = nlVar.b;
            w8 w8Var = new w8(nlVar, this.k, (ji) null, 4);
            this.h = 1;
            f90Var.getClass();
            Object objY = i60.y(new e90(this.j, f90Var, w8Var, mlVar, null), this);
            yj yjVar = yj.d;
            if (objY == yjVar) {
                return yjVar;
            }
        } else {
            if (i != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i60.az(obj);
        }
        return wz0.a;
    }
}

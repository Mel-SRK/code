package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y31 extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ a41 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y31(a41 a41Var, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = a41Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
        }
        return ((y31) k(jiVar, xjVar)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new y31(this.j, jiVar, 0);
            default:
                return new y31(this.j, jiVar, 1);
        }
    }

    @Override // defpackage.s7
    public final Object o(Object obj) throws Throwable {
        switch (this.h) {
            case 0:
                int i = this.i;
                wz0 wz0Var = wz0.a;
                if (i != 0) {
                    if (i == 1) {
                        i60.az(obj);
                        return wz0Var;
                    }
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i60.az(obj);
                b1 b1Var = this.j.d;
                this.i = 1;
                Object objD = b1Var.v.d(this);
                yj yjVar = yj.d;
                if (objD != yjVar) {
                    objD = wz0Var;
                }
                return objD == yjVar ? yjVar : wz0Var;
            default:
                int i2 = this.i;
                wz0 wz0Var2 = wz0.a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        i60.az(obj);
                        return wz0Var2;
                    }
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i60.az(obj);
                b1 b1Var2 = this.j.d;
                this.i = 1;
                Object objE = b1Var2.w.e(this);
                yj yjVar2 = yj.d;
                if (objE != yjVar2) {
                    objE = wz0Var2;
                }
                return objE == yjVar2 ? yjVar2 : wz0Var2;
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ yb j;
    public final /* synthetic */ jh0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(yb ybVar, jh0 jh0Var, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = ybVar;
        this.k = jh0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
        }
        return ((f) k(jiVar, xjVar)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new f(this.j, this.k, jiVar, 0);
            default:
                return new f(this.j, this.k, jiVar, 1);
        }
    }

    @Override // defpackage.s7
    public final Object o(Object obj) throws Throwable {
        switch (this.h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    i60.az(obj);
                    g80 g80Var = this.j.t;
                    if (g80Var != null) {
                        this.i = 1;
                        Object objA = g80Var.a(this.k, this);
                        yj yjVar = yj.d;
                        if (objA == yjVar) {
                        }
                    }
                } else if (i != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i60.az(obj);
                }
                break;
            default:
                int i2 = this.i;
                if (i2 == 0) {
                    i60.az(obj);
                    g80 g80Var2 = this.j.t;
                    if (g80Var2 != null) {
                        kh0 kh0Var = new kh0(this.k);
                        this.i = 1;
                        Object objA2 = g80Var2.a(kh0Var, this);
                        yj yjVar2 = yj.d;
                        if (objA2 == yjVar2) {
                        }
                    }
                } else if (i2 != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i60.az(obj);
                }
                break;
        }
        return wz0.a;
    }
}

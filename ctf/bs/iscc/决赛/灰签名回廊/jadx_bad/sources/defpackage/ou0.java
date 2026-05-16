package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ou0 extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ hv j;
    public final /* synthetic */ hh0 k;
    public final /* synthetic */ pg0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou0(hv hvVar, hh0 hh0Var, pg0 pg0Var, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = hvVar;
        this.k = hh0Var;
        this.l = pg0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
        }
        return ((ou0) k(jiVar, xjVar)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new ou0(this.j, this.k, this.l, jiVar, 0);
            default:
                return new ou0(this.j, this.k, this.l, jiVar, 1);
        }
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        switch (this.h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    i60.az(obj);
                    xa0 xa0Var = new xa0(this.l.c);
                    this.i = 1;
                    Object objC = this.j.c(this.k, xa0Var, this);
                    yj yjVar = yj.d;
                    if (objC == yjVar) {
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
                    xa0 xa0Var2 = new xa0(this.l.c);
                    this.i = 1;
                    Object objC2 = this.j.c(this.k, xa0Var2, this);
                    yj yjVar2 = yj.d;
                    if (objC2 == yjVar2) {
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

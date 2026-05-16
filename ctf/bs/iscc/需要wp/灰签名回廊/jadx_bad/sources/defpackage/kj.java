package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kj extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ tg0 j;
    public final /* synthetic */ fv0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj(tg0 tg0Var, fv0 fv0Var, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = tg0Var;
        this.k = fv0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
        }
        return ((kj) k(jiVar, xjVar)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new kj(this.j, this.k, jiVar, 0);
            case 1:
                return new kj(this.j, this.k, jiVar, 1);
            default:
                return new kj(this.j, this.k, jiVar, 2);
        }
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        int i = this.h;
        fv0 fv0Var = this.k;
        tg0 tg0Var = this.j;
        yj yjVar = yj.d;
        wz0 wz0Var = wz0.a;
        switch (i) {
            case 0:
                int i2 = this.i;
                if (i2 != 0) {
                    if (i2 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        i60.az(obj);
                    }
                    break;
                } else {
                    i60.az(obj);
                    this.i = 1;
                    Object objY = i60.y(new a50(tg0Var, fv0Var, null), this);
                    if (objY != yjVar) {
                        objY = wz0Var;
                    }
                    if (objY == yjVar) {
                    }
                }
                break;
            case 1:
                int i3 = this.i;
                if (i3 != 0) {
                    if (i3 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        i60.az(obj);
                    }
                    break;
                } else {
                    i60.az(obj);
                    this.i = 1;
                    Object objK = f00.k(tg0Var, new mu(fv0Var, null), this);
                    if (objK != yjVar) {
                        objK = wz0Var;
                    }
                    if (objK == yjVar) {
                    }
                }
                break;
            default:
                int i4 = this.i;
                if (i4 != 0) {
                    if (i4 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        i60.az(obj);
                    }
                    break;
                } else {
                    i60.az(obj);
                    this.i = 1;
                    b50 b50Var = new b50(fv0Var, 0);
                    c50 c50Var = new c50(fv0Var, 0);
                    c50 c50Var2 = new c50(fv0Var, 1);
                    j jVar = new j(8, fv0Var);
                    float f = go.a;
                    Object objK2 = f00.k(tg0Var, new eo(ng.j, null, new j(7, b50Var), jVar, c50Var2, new l1(12, c50Var), null), this);
                    if (objK2 != yjVar) {
                        objK2 = wz0Var;
                    }
                    if (objK2 != yjVar) {
                        objK2 = wz0Var;
                    }
                    if (objK2 != yjVar) {
                        objK2 = wz0Var;
                    }
                    if (objK2 == yjVar) {
                    }
                }
                break;
        }
        return wz0Var;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eb extends tt0 implements gv {
    public final /* synthetic */ int h = 0;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hb k;
    public final /* synthetic */ zr l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(hb hbVar, zr zrVar, Object obj, ji jiVar) {
        super(2, jiVar);
        this.k = hbVar;
        this.l = zrVar;
        this.j = obj;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
        }
        return ((eb) k(jiVar, xjVar)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new eb(this.k, this.l, this.j, jiVar);
            default:
                eb ebVar = new eb(this.k, this.l, jiVar);
                ebVar.j = obj;
                return ebVar;
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [hv, tt0] */
    @Override // defpackage.s7
    public final Object o(Object obj) {
        switch (this.h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    i60.az(obj);
                    ?? r9 = this.k.h;
                    Object obj2 = this.j;
                    this.i = 1;
                    Object objC = r9.c(this.l, obj2, this);
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
                    xj xjVar = (xj) this.j;
                    xi0 xi0Var = new xi0();
                    hb hbVar = this.k;
                    yr yrVar = hbVar.g;
                    gb gbVar = new gb(xi0Var, xjVar, hbVar, this.l, 0);
                    this.i = 1;
                    Object objB = yrVar.b(gbVar, this);
                    yj yjVar2 = yj.d;
                    if (objB == yjVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(hb hbVar, zr zrVar, ji jiVar) {
        super(2, jiVar);
        this.k = hbVar;
        this.l = zrVar;
    }
}

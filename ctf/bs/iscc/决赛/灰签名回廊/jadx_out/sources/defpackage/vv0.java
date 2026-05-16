package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vv0 extends tt0 implements hv {
    public int h;
    public /* synthetic */ hh0 i;
    public /* synthetic */ long j;
    public final /* synthetic */ xj k;
    public final /* synthetic */ w80 l;
    public final /* synthetic */ g80 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv0(xj xjVar, w80 w80Var, g80 g80Var, ji jiVar) {
        super(3, jiVar);
        this.k = xjVar;
        this.l = w80Var;
        this.m = g80Var;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j = ((xa0) obj2).a;
        w80 w80Var = this.l;
        g80 g80Var = this.m;
        vv0 vv0Var = new vv0(this.k, w80Var, g80Var, (ji) obj3);
        vv0Var.i = (hh0) obj;
        vv0Var.j = j;
        return vv0Var.o(wz0.a);
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        int i = this.h;
        xj xjVar = this.k;
        if (i == 0) {
            i60.az(obj);
            hh0 hh0Var = this.i;
            i60.an(xjVar, null, new d(this.l, this.j, this.m, null, 2), 3);
            this.h = 1;
            obj = hh0Var.d(this);
            yj yjVar = yj.d;
            if (obj == yjVar) {
                return yjVar;
            }
        } else {
            if (i != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i60.az(obj);
        }
        i60.an(xjVar, null, new uv0(this.l, ((Boolean) obj).booleanValue(), this.m, null), 3);
        return wz0.a;
    }
}

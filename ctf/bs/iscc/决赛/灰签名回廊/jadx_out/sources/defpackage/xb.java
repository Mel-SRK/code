package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xb extends tt0 implements hv {
    public int h;
    public /* synthetic */ hh0 i;
    public /* synthetic */ long j;
    public final /* synthetic */ yb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(yb ybVar, ji jiVar) {
        super(3, jiVar);
        this.k = ybVar;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j = ((xa0) obj2).a;
        xb xbVar = new xb(this.k, (ji) obj3);
        xbVar.i = (hh0) obj;
        xbVar.j = j;
        return xbVar.o(wz0.a);
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        Object objY;
        int i = this.h;
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
        hh0 hh0Var = this.i;
        long j = this.j;
        yb ybVar = this.k;
        if (ybVar.w) {
            this.h = 1;
            g80 g80Var = ybVar.t;
            yj yjVar = yj.d;
            if (g80Var == null || (objY = i60.y(new e(hh0Var, j, g80Var, ybVar, null), this)) != yjVar) {
                objY = wz0Var;
            }
            if (objY == yjVar) {
                return yjVar;
            }
        }
        return wz0Var;
    }
}

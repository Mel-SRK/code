package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class on0 extends tt0 implements gv {
    public rn0 h;
    public wi0 i;
    public long j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rn0 m;
    public final /* synthetic */ wi0 n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on0(rn0 rn0Var, wi0 wi0Var, long j, ji jiVar) {
        super(2, jiVar);
        this.m = rn0Var;
        this.n = wi0Var;
        this.o = j;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((on0) k((ji) obj2, (pn0) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        on0 on0Var = new on0(this.m, this.n, this.o, jiVar);
        on0Var.l = obj;
        return on0Var;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) throws Throwable {
        rn0 rn0Var;
        wi0 wi0Var;
        long j;
        rn0 rn0Var2;
        int i = this.k;
        wc0 wc0Var = wc0.e;
        if (i == 0) {
            i60.az(obj);
            pn0 pn0Var = (pn0) this.l;
            rn0Var = this.m;
            nn0 nn0Var = new nn0(rn0Var, pn0Var);
            f1 f1Var = rn0Var.c;
            wi0 wi0Var2 = this.n;
            long j2 = wi0Var2.d;
            wc0 wc0Var2 = rn0Var.d;
            long j3 = this.o;
            float fC = rn0Var.c(wc0Var2 == wc0Var ? o01.b(j3) : o01.c(j3));
            this.l = rn0Var;
            this.h = rn0Var;
            this.i = wi0Var2;
            this.j = j2;
            this.k = 1;
            f1Var.getClass();
            obj = i60.bc((rm) f1Var.f, new xk(fC, f1Var, nn0Var, null), this);
            yj yjVar = yj.d;
            if (obj == yjVar) {
                return yjVar;
            }
            wi0Var = wi0Var2;
            j = j2;
            rn0Var2 = rn0Var;
        } else {
            if (i != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.j;
            wi0Var = this.i;
            rn0Var = this.h;
            rn0Var2 = (rn0) this.l;
            i60.az(obj);
        }
        float fC2 = rn0Var2.c(((Number) obj).floatValue());
        wi0Var.d = rn0Var.d == wc0Var ? o01.a(j, fC2, 0.0f, 2) : o01.a(j, 0.0f, fC2, 1);
        return wz0.a;
    }
}

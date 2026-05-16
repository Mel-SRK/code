package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qn0 extends tt0 implements gv {
    public long h;
    public int i;
    public /* synthetic */ long j;
    public final /* synthetic */ rn0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn0(rn0 rn0Var, ji jiVar) {
        super(2, jiVar);
        this.k = rn0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        long j = ((o01) obj).a;
        qn0 qn0Var = new qn0(this.k, (ji) obj2);
        qn0Var.j = j;
        return qn0Var.o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        qn0 qn0Var = new qn0(this.k, jiVar);
        qn0Var.j = ((o01) obj).a;
        return qn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.i;
        rn0 rn0Var = this.k;
        yj yjVar = yj.d;
        if (i == 0) {
            i60.az(obj);
            j = this.j;
            a0 a0Var = rn0Var.f;
            this.j = j;
            this.i = 1;
            obj = a0Var.c(j, this);
            if (obj != yjVar) {
            }
            return yjVar;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = this.h;
                j3 = this.j;
                i60.az(obj);
                return new o01(o01.d(j3, o01.d(j4, ((o01) obj).a)));
            }
            j2 = this.h;
            j = this.j;
            i60.az(obj);
            long j5 = ((o01) obj).a;
            a0 a0Var2 = rn0Var.f;
            long jD = o01.d(j2, j5);
            this.j = j;
            this.h = j5;
            this.i = 3;
            obj = a0Var2.b(jD, j5, this);
            if (obj != yjVar) {
                j3 = j;
                j4 = j5;
                return new o01(o01.d(j3, o01.d(j4, ((o01) obj).a)));
            }
            return yjVar;
        }
        j = this.j;
        i60.az(obj);
        long jD2 = o01.d(j, ((o01) obj).a);
        this.j = j;
        this.h = jD2;
        this.i = 2;
        obj = rn0Var.b(jD2, this);
        if (obj != yjVar) {
            j2 = jD2;
            long j52 = ((o01) obj).a;
            a0 a0Var22 = rn0Var.f;
            long jD3 = o01.d(j2, j52);
            this.j = j;
            this.h = j52;
            this.i = 3;
            obj = a0Var22.b(jD3, j52, this);
            if (obj != yjVar) {
            }
        }
        return yjVar;
    }
}

package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class h5 extends tt0 implements cv {
    public r5 h;
    public ti0 i;
    public int j;
    public final /* synthetic */ j5 k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ tu0 m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(j5 j5Var, Object obj, tu0 tu0Var, long j, ji jiVar) {
        super(1, jiVar);
        this.k = j5Var;
        this.l = obj;
        this.m = tu0Var;
        this.n = j;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        tu0 tu0Var = this.m;
        long j = this.n;
        return new h5(this.k, this.l, tu0Var, j, (ji) obj).o(wz0.a);
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        r5 r5Var;
        ti0 ti0Var;
        tu0 tu0Var = this.m;
        int i = this.j;
        int i2 = 1;
        j5 j5Var = this.k;
        try {
            if (i == 0) {
                i60.az(obj);
                j5Var.c.f = (w5) j5Var.a.a.g(this.l);
                j5Var.e.setValue(tu0Var.c);
                j5Var.d.setValue(Boolean.TRUE);
                r5 r5Var2 = j5Var.c;
                r5 r5Var3 = new r5(r5Var2.d, r5Var2.e.getValue(), m10.r(r5Var2.f), r5Var2.g, Long.MIN_VALUE, r5Var2.i);
                ti0 ti0Var2 = new ti0();
                long j = this.n;
                g5 g5Var = new g5(j5Var, r5Var3, ti0Var2, 0);
                this.h = r5Var3;
                this.i = ti0Var2;
                this.j = 1;
                Object objC = lI.c(r5Var3, tu0Var, j, g5Var, this);
                yj yjVar = yj.d;
                if (objC == yjVar) {
                    return yjVar;
                }
                r5Var = r5Var3;
                ti0Var = ti0Var2;
            } else {
                if (i != 1) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ti0Var = this.i;
                r5Var = this.h;
                i60.az(obj);
            }
            if (!ti0Var.d) {
                i2 = 2;
            }
            r5 r5Var4 = j5Var.c;
            r5Var4.f.d();
            r5Var4.g = Long.MIN_VALUE;
            j5Var.d.setValue(Boolean.FALSE);
            return new o5(i2, 0, r5Var);
        } catch (CancellationException e) {
            r5 r5Var5 = j5Var.c;
            r5Var5.f.d();
            r5Var5.g = Long.MIN_VALUE;
            j5Var.d.setValue(Boolean.FALSE);
            throw e;
        }
    }
}

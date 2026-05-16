package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ho extends tt0 implements gv {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ in0 j;
    public final /* synthetic */ tg0 k;
    public final /* synthetic */ jo l;
    public final /* synthetic */ a2 m;
    public final /* synthetic */ io n;
    public final /* synthetic */ io o;
    public final /* synthetic */ y1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(in0 in0Var, tg0 tg0Var, jo joVar, a2 a2Var, io ioVar, io ioVar2, y1 y1Var, ji jiVar) {
        super(2, jiVar);
        this.j = in0Var;
        this.k = tg0Var;
        this.l = joVar;
        this.m = a2Var;
        this.n = ioVar;
        this.o = ioVar2;
        this.p = y1Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((ho) k((ji) obj2, (xj) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        ho hoVar = new ho(this.j, this.k, this.l, this.m, this.n, this.o, this.p, jiVar);
        hoVar.i = obj;
        return hoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        xj xjVar;
        o9 o9Var;
        int i = this.h;
        wz0 wz0Var = wz0.a;
        in0 in0Var = this.j;
        if (i == 0) {
            i60.az(obj);
            xj xjVar2 = (xj) this.i;
            try {
                wc0 wc0Var = in0Var.t;
                tg0 tg0Var = this.k;
                jo joVar = this.l;
                a2 a2Var = this.m;
                io ioVar = this.n;
                io ioVar2 = this.o;
                y1 y1Var = this.p;
                this.i = xjVar2;
                this.h = 1;
                float f = go.a;
                Object objK = f00.k(tg0Var, new eo(ioVar2, wc0Var, joVar, y1Var, ioVar, a2Var, null), this);
                yj yjVar = yj.d;
                if (objK != yjVar) {
                    objK = wz0Var;
                }
                if (objK == yjVar) {
                    return yjVar;
                }
            } catch (CancellationException e) {
                e = e;
                xjVar = xjVar2;
                CancellationException cancellationException = e;
                o9Var = in0Var.x;
                if (o9Var != null) {
                    o9Var.u(tn.a);
                }
                if (!i60.al(xjVar)) {
                    throw cancellationException;
                }
            }
        } else {
            if (i != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xjVar = (xj) this.i;
            try {
                i60.az(obj);
            } catch (CancellationException e2) {
                e = e2;
                CancellationException cancellationException2 = e;
                o9Var = in0Var.x;
                if (o9Var != null) {
                }
                if (!i60.al(xjVar)) {
                }
            }
        }
        return wz0Var;
    }
}

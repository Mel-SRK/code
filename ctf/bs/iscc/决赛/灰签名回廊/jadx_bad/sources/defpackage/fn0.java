package defpackage;

import androidx.compose.foundation.gestures.a;

/* JADX INFO: loaded from: classes.dex */
public final class fn0 extends tt0 implements gv {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ in0 j;
    public /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fn0(in0 in0Var, long j, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = in0Var;
        this.k = j;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                return ((fn0) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 1:
                return ((fn0) k((ji) obj2, (xj) obj)).o(wz0.a);
            case 2:
                return ((fn0) k((ji) obj2, (xj) obj)).o(wz0.a);
            default:
                long j = ((xa0) obj).a;
                fn0 fn0Var = new fn0(this.j, (ji) obj2);
                fn0Var.k = j;
                return fn0Var.o(wz0.a);
        }
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new fn0(this.j, this.k, jiVar, 0);
            case 1:
                return new fn0(this.j, this.k, jiVar, 1);
            case 2:
                return new fn0(this.j, this.k, jiVar, 2);
            default:
                fn0 fn0Var = new fn0(this.j, jiVar);
                fn0Var.k = ((xa0) obj).a;
                return fn0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        Object objO;
        switch (this.h) {
            case 0:
                int i = this.i;
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
                rn0 rn0Var = this.j.af;
                long j = this.k;
                this.i = 1;
                long jA = rn0Var.d == wc0.e ? o01.a(j, 0.0f, 0.0f, 1) : o01.a(j, 0.0f, 0.0f, 2);
                qn0 qn0Var = new qn0(rn0Var, null);
                qd0 qd0Var = rn0Var.b;
                yj yjVar = yj.d;
                if (qd0Var == null || !(rn0Var.a.c() || rn0Var.a.a())) {
                    qn0 qn0Var2 = new qn0(qn0Var.k, this);
                    qn0Var2.j = jA;
                    objO = qn0Var2.o(wz0Var);
                    if (objO != yjVar) {
                        objO = wz0Var;
                    }
                } else {
                    objO = qd0Var.g(jA, qn0Var, this);
                    if (objO != yjVar) {
                    }
                }
                return objO == yjVar ? yjVar : wz0Var;
            case 1:
                int i2 = this.i;
                if (i2 == 0) {
                    i60.az(obj);
                    rn0 rn0Var2 = this.j.af;
                    gn0 gn0Var = new gn0(this.k, null, 0);
                    this.i = 1;
                    Object objE = rn0Var2.e(2, gn0Var, this);
                    yj yjVar2 = yj.d;
                    if (objE == yjVar2) {
                        return yjVar2;
                    }
                } else {
                    if (i2 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i60.az(obj);
                }
                return wz0.a;
            case 2:
                int i3 = this.i;
                if (i3 == 0) {
                    i60.az(obj);
                    rn0 rn0Var3 = this.j.af;
                    gn0 gn0Var2 = new gn0(this.k, null, 1);
                    this.i = 1;
                    Object objE2 = rn0Var3.e(2, gn0Var2, this);
                    yj yjVar3 = yj.d;
                    if (objE2 == yjVar3) {
                        return yjVar3;
                    }
                } else {
                    if (i3 != 1) {
                        wc.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i60.az(obj);
                }
                return wz0.a;
            default:
                int i4 = this.i;
                if (i4 != 0) {
                    if (i4 == 1) {
                        i60.az(obj);
                        return obj;
                    }
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i60.az(obj);
                long j2 = this.k;
                rn0 rn0Var4 = this.j.af;
                this.i = 1;
                Object objA = a.a(rn0Var4, j2, this);
                yj yjVar4 = yj.d;
                return objA == yjVar4 ? yjVar4 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn0(in0 in0Var, ji jiVar) {
        super(2, jiVar);
        this.h = 3;
        this.j = in0Var;
    }
}

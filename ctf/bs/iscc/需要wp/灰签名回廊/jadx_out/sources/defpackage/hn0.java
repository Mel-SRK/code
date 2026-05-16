package defpackage;

import androidx.compose.foundation.gestures.a;

/* JADX INFO: loaded from: classes.dex */
public final class hn0 extends tt0 implements gv {
    public int h;
    public final /* synthetic */ in0 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn0(in0 in0Var, float f, float f2, ji jiVar) {
        super(2, jiVar);
        this.i = in0Var;
        this.j = f;
        this.k = f2;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((hn0) k((ji) obj2, (xj) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        return new hn0(this.i, this.j, this.k, jiVar);
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        int i = this.h;
        if (i == 0) {
            i60.az(obj);
            rn0 rn0Var = this.i.af;
            long jH = d41.h(this.j, this.k);
            this.h = 1;
            Object objA = a.a(rn0Var, jH, this);
            yj yjVar = yj.d;
            if (objA == yjVar) {
                return yjVar;
            }
        } else {
            if (i != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i60.az(obj);
        }
        return wz0.a;
    }
}

package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class xk extends tt0 implements gv {
    public ui0 h;
    public r5 i;
    public int j;
    public final /* synthetic */ float k;
    public final /* synthetic */ f1 l;
    public final /* synthetic */ nn0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk(float f, f1 f1Var, nn0 nn0Var, ji jiVar) {
        super(2, jiVar);
        this.k = f;
        this.l = f1Var;
        this.m = nn0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        return ((xk) k((ji) obj2, (xj) obj)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        return new xk(this.k, this.l, this.m, jiVar);
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        float f;
        r5 r5Var;
        ui0 ui0Var;
        Object objC;
        Object obj2;
        int i = this.j;
        if (i == 0) {
            i60.az(obj);
            f = this.k;
            if (Math.abs(f) > 1.0f) {
                ui0 ui0Var2 = new ui0();
                ui0Var2.d = f;
                ui0 ui0Var3 = new ui0();
                zy0 zy0Var = k01.a;
                r5Var = new r5(zy0Var, Float.valueOf(0.0f), new s5(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                try {
                    f1 f1Var = this.l;
                    bu buVar = (bu) f1Var.e;
                    qi qiVar = new qi(ui0Var3, this.m, ui0Var2, f1Var, 1);
                    this.h = ui0Var2;
                    this.i = r5Var;
                    this.j = 1;
                    objC = lI.c(r5Var, new qk(buVar, zy0Var, r5Var.e.getValue(), r5Var.f), Long.MIN_VALUE, qiVar, this);
                    obj2 = yj.d;
                    if (objC != obj2) {
                        objC = wz0.a;
                    }
                } catch (CancellationException unused) {
                    ui0Var = ui0Var2;
                    ui0Var.d = ((Number) r5Var.d.b.g(r5Var.f)).floatValue();
                }
                if (objC == obj2) {
                    return obj2;
                }
                ui0Var = ui0Var2;
                f = ui0Var.d;
            }
        } else {
            if (i != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r5Var = this.i;
            ui0Var = this.h;
            try {
                i60.az(obj);
            } catch (CancellationException unused2) {
                ui0Var.d = ((Number) r5Var.d.b.g(r5Var.f)).floatValue();
            }
            f = ui0Var.d;
        }
        return new Float(f);
    }
}

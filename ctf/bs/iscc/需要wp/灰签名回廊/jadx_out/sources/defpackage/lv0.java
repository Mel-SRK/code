package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lv0 extends x10 implements cv {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv0(float f, w80 w80Var) {
        super(1);
        this.f = f;
        this.g = w80Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                long j = ((pq0) obj).a;
                float fD = pq0.d(j);
                float f = this.f;
                float f2 = fD * f;
                float fB = pq0.b(j) * f;
                w80 w80Var = (w80) this.g;
                if (pq0.d(((pq0) w80Var.getValue()).a) != f2 || pq0.b(((pq0) w80Var.getValue()).a) != fB) {
                    w80Var.setValue(new pq0(lI.a(f2, fB)));
                }
                break;
            default:
                long jLongValue = ((Number) obj).longValue();
                ny0 ny0Var = (ny0) this.g;
                me0 me0Var = ny0Var.i;
                ke0 ke0Var = ny0Var.e;
                if (!((Boolean) me0Var.getValue()).booleanValue()) {
                    if (ke0Var.g() == Long.MIN_VALUE) {
                        ke0Var.h(jLongValue);
                        ((me0) ny0Var.a.e).setValue(Boolean.TRUE);
                    }
                    long jG = jLongValue - ke0Var.g();
                    float f3 = this.f;
                    if (f3 != 0.0f) {
                        double d = jG / ((double) f3);
                        if (Double.isNaN(d)) {
                            wc.n("Cannot round NaN value.");
                        } else {
                            jG = Math.round(d);
                        }
                    }
                    ny0Var.d.h(jG);
                    ny0Var.d(jG, f3 == 0.0f);
                }
                break;
        }
        return wz0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv0(ny0 ny0Var, float f) {
        super(1);
        this.g = ny0Var;
        this.f = f;
    }
}

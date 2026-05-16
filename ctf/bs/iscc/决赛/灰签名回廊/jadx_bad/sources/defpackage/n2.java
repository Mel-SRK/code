package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends x10 implements cv {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(float f, c3 c3Var, c8 c8Var) {
        super(1);
        this.f = f;
        this.g = c3Var;
        this.h = c8Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        long jRound;
        switch (this.e) {
            case 0:
                u20 u20Var = (u20) obj;
                u20Var.a();
                float f = this.f;
                c3 c3Var = (c3) this.g;
                c8 c8Var = (c8) this.h;
                ra raVar = u20Var.d;
                o6 o6Var = raVar.e;
                long jR = o6Var.r();
                o6Var.o().l();
                try {
                    bu buVar = (bu) o6Var.a;
                    buVar.q(f, 0.0f);
                    oa oaVarO = ((o6) buVar.e).o();
                    int i = (int) 0;
                    oaVarO.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i));
                    oaVarO.h();
                    oaVarO.f(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i));
                    raVar.e(c3Var, c8Var);
                    o6Var.o().i();
                    o6Var.ab(jR);
                    return wz0.a;
                } catch (Throwable th) {
                    o6Var.o().i();
                    o6Var.ab(jR);
                    throw th;
                }
            default:
                long jLongValue = ((Number) obj).longValue();
                f01 f01Var = (f01) this.g;
                if (f01Var.b == Long.MIN_VALUE) {
                    f01Var.b = jLongValue;
                }
                float f2 = f01Var.e;
                s5 s5Var = new s5(f2);
                float f3 = this.f;
                s5 s5Var2 = f01.f;
                if (f3 == 0.0f) {
                    jRound = f01Var.a.n(new s5(f2), s5Var2, f01Var.c);
                } else {
                    double d = (jLongValue - f01Var.b) / f3;
                    if (Double.isNaN(d)) {
                        wc.n("Cannot round NaN value.");
                        return null;
                    }
                    jRound = Math.round(d);
                }
                long j = jRound;
                float f4 = ((s5) f01Var.a.k(j, s5Var, s5Var2, f01Var.c)).a;
                f01Var.c = (s5) f01Var.a.i(j, s5Var, s5Var2, f01Var.c);
                f01Var.b = jLongValue;
                float f5 = f01Var.e - f4;
                f01Var.e = f4;
                ((cv) this.h).g(Float.valueOf(f5));
                return wz0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(f01 f01Var, float f, cv cvVar) {
        super(1);
        this.g = f01Var;
        this.f = f;
        this.h = cvVar;
    }
}

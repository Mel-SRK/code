package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qk implements m5 {
    public final a0 a;
    public final zy0 b;
    public final Object c;
    public final w5 d;
    public final w5 e;
    public final w5 f;
    public final Object g;
    public final long h;

    public qk(bu buVar, zy0 zy0Var, Object obj, w5 w5Var) {
        a0 a0Var = new a0((bu) buVar.e);
        this.a = a0Var;
        this.b = zy0Var;
        this.c = obj;
        w5 w5Var2 = (w5) zy0Var.a.g(obj);
        this.d = w5Var2;
        this.e = m10.r(w5Var);
        cv cvVar = zy0Var.b;
        if (((w5) a0Var.d) == null) {
            a0Var.d = w5Var2.c();
        }
        w5 w5Var3 = (w5) a0Var.d;
        if (w5Var3 == null) {
            f00.ag("targetVector");
            throw null;
        }
        int iB = w5Var3.b();
        int i = 0;
        while (true) {
            w5 w5Var4 = (w5) a0Var.d;
            if (i >= iB) {
                if (w5Var4 == null) {
                    f00.ag("targetVector");
                    throw null;
                }
                this.g = cvVar.g(w5Var4);
                a0 a0Var2 = this.a;
                w5 w5Var5 = this.d;
                if (((w5) a0Var2.c) == null) {
                    a0Var2.c = w5Var5.c();
                }
                w5 w5Var6 = (w5) a0Var2.c;
                if (w5Var6 == null) {
                    f00.ag("velocityVector");
                    throw null;
                }
                int iB2 = w5Var6.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    bu buVar2 = (bu) a0Var2.a;
                    w5Var5.getClass();
                    jMax = Math.max(jMax, ((long) (Math.exp(((rr) buVar2.e).b(w5Var.a(i2)) / (((double) sr.a) - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.h = jMax;
                w5 w5VarR = m10.r(this.a.d(jMax, this.d, w5Var));
                this.f = w5VarR;
                int iB3 = w5VarR.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    w5 w5Var7 = this.f;
                    float fA = w5Var7.a(i3);
                    this.a.getClass();
                    this.a.getClass();
                    w5Var7.e(i60.s(fA, -0.0f, 0.0f), i3);
                }
                return;
            }
            if (w5Var4 == null) {
                f00.ag("targetVector");
                throw null;
            }
            bu buVar3 = (bu) a0Var.a;
            float fA2 = w5Var2.a(i);
            float fA3 = w5Var.a(i);
            rr rrVar = (rr) buVar3.e;
            double dB = rrVar.b(fA3);
            double d = sr.a;
            int i4 = i;
            w5Var4.e((Math.signum(fA3) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (rrVar.a * rrVar.b))))) + fA2, i4);
            i = i4 + 1;
        }
    }

    @Override // defpackage.m5
    public final boolean a() {
        return false;
    }

    @Override // defpackage.m5
    public final Object b(long j) {
        if (g(j)) {
            return this.g;
        }
        cv cvVar = this.b.b;
        a0 a0Var = this.a;
        w5 w5Var = (w5) a0Var.b;
        w5 w5Var2 = this.d;
        if (w5Var == null) {
            a0Var.b = w5Var2.c();
        }
        w5 w5Var3 = (w5) a0Var.b;
        if (w5Var3 == null) {
            f00.ag("valueVector");
            throw null;
        }
        int iB = w5Var3.b();
        int i = 0;
        while (true) {
            w5 w5Var4 = (w5) a0Var.b;
            if (i >= iB) {
                if (w5Var4 != null) {
                    return cvVar.g(w5Var4);
                }
                f00.ag("valueVector");
                throw null;
            }
            if (w5Var4 == null) {
                f00.ag("valueVector");
                throw null;
            }
            bu buVar = (bu) a0Var.a;
            float fA = w5Var2.a(i);
            long j2 = j / 1000000;
            qr qrVarA = ((rr) buVar.e).a(this.e.a(i));
            long j3 = qrVarA.c;
            w5Var4.e((Math.signum(qrVarA.a) * qrVarA.b * y2.a(j3 > 0 ? j2 / j3 : 1.0f).a) + fA, i);
            i++;
        }
    }

    @Override // defpackage.m5
    public final long c() {
        return this.h;
    }

    @Override // defpackage.m5
    public final zy0 d() {
        return this.b;
    }

    @Override // defpackage.m5
    public final Object e() {
        return this.g;
    }

    @Override // defpackage.m5
    public final w5 f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.a.d(j, this.d, this.e);
    }
}

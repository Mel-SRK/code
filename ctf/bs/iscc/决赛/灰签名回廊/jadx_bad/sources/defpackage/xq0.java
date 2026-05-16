package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xq0 {
    public cr0 a;
    public long b;
    public boolean c;
    public int d;

    public xq0(long j, cr0 cr0Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = cr0Var;
        this.b = j;
        dr0 dr0Var = fr0.a;
        if (j != 0) {
            cr0 cr0VarD = d();
            long j2 = cr0VarD.f;
            long[] jArr = cr0VarD.g;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = cr0VarD.e;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = cr0VarD.d;
                    if (j4 != 0) {
                        j2 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (fr0.c) {
                iA = fr0.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(xq0 xq0Var) {
        fr0.b.x(xq0Var);
    }

    public final void a() {
        synchronized (fr0.c) {
            b();
            p();
        }
    }

    public void b() {
        fr0.d = fr0.d.b(g());
    }

    public abstract void c();

    public cr0 d() {
        return this.a;
    }

    public abstract cv e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract cv i();

    public final xq0 j() {
        o6 o6Var = fr0.b;
        xq0 xq0Var = (xq0) o6Var.n();
        o6Var.x(this);
        return xq0Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(ts0 ts0Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            fr0.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(cr0 cr0Var) {
        this.a = cr0Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract xq0 u(cv cvVar);
}

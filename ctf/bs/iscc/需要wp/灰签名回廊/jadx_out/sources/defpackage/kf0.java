package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class kf0 implements em {
    public boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(kf0 kf0Var, lf0 lf0Var) {
        kf0Var.getClass();
        if (lf0Var instanceof t70) {
            ((t70) lf0Var).o(kf0Var.d);
        }
    }

    public static void h(kf0 kf0Var, lf0 lf0Var, int i, int i2) {
        kf0Var.getClass();
        a(kf0Var, lf0Var);
        lf0Var.bc(pz.c((((long) i2) & 4294967295L) | (((long) i) << 32), lf0Var.h), 0.0f, null);
    }

    public static void i(kf0 kf0Var, lf0 lf0Var, long j) {
        kf0Var.getClass();
        a(kf0Var, lf0Var);
        lf0Var.bc(pz.c(j, lf0Var.h), 0.0f, null);
    }

    public static void j(kf0 kf0Var, lf0 lf0Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (kf0Var.e() == e20.d || kf0Var.f() == 0) {
            a(kf0Var, lf0Var);
            lf0Var.bc(pz.c(j, lf0Var.h), 0.0f, null);
        } else {
            int iF = (kf0Var.f() - lf0Var.d) - ((int) (j >> 32));
            a(kf0Var, lf0Var);
            lf0Var.bc(pz.c((((long) iF) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), lf0Var.h), 0.0f, null);
        }
    }

    public static void l(kf0 kf0Var, lf0 lf0Var, int i, int i2) {
        int i3 = mf0.b;
        f50 f50Var = f50.s;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (kf0Var.e() == e20.d || kf0Var.f() == 0) {
            a(kf0Var, lf0Var);
            lf0Var.bc(pz.c(j, lf0Var.h), 0.0f, f50Var);
        } else {
            int iF = (kf0Var.f() - lf0Var.d) - ((int) (j >> 32));
            a(kf0Var, lf0Var);
            lf0Var.bc(pz.c((((long) iF) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), lf0Var.h), 0.0f, f50Var);
        }
    }

    public static void n(kf0 kf0Var, lf0 lf0Var, cv cvVar) {
        kf0Var.getClass();
        long j = 0;
        a(kf0Var, lf0Var);
        lf0Var.bc(pz.c((j & 4294967295L) | (j << 32), lf0Var.h), 0.0f, cvVar);
    }

    public float d(tx txVar) {
        return Float.NaN;
    }

    public abstract e20 e();

    public abstract int f();
}

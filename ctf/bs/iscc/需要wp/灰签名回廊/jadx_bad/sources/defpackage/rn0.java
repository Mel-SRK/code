package defpackage;

import androidx.compose.foundation.gestures.a;

/* JADX INFO: loaded from: classes.dex */
public final class rn0 {
    public jn0 a;
    public qd0 b;
    public f1 c;
    public wc0 d;
    public boolean e;
    public a0 f;
    public int g = 1;
    public um0 h = a.a;
    public final pn0 i = new pn0(this);
    public final l1 j = new l1(21, this);

    public rn0(jn0 jn0Var, qd0 qd0Var, f1 f1Var, wc0 wc0Var, boolean z, a0 a0Var) {
        this.a = jn0Var;
        this.b = qd0Var;
        this.c = f1Var;
        this.d = wc0Var;
        this.e = z;
        this.f = a0Var;
    }

    public static final long a(rn0 rn0Var, um0 um0Var, long j, int i) {
        y90 y90Var = (y90) rn0Var.f.a;
        y90 y90Var2 = null;
        y90 y90Var3 = (y90Var == null || !y90Var.q) ? null : (y90) lI.g(y90Var);
        long jBz = y90Var3 != null ? y90Var3.bz(j, i) : 0L;
        long jF = xa0.f(j, jBz);
        long jD = rn0Var.d(rn0Var.g(um0Var.a(rn0Var.f(rn0Var.d(xa0.a(jF, 0.0f, rn0Var.d == wc0.e ? 1 : 2))))));
        long jF2 = xa0.f(jF, jD);
        y90 y90Var4 = (y90) rn0Var.f.a;
        if (y90Var4 != null && y90Var4.q) {
            y90Var2 = (y90) lI.g(y90Var4);
        }
        y90 y90Var5 = y90Var2;
        return xa0.g(xa0.g(jBz, jD), y90Var5 != null ? y90Var5.bw(jD, jF2, i) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, ki kiVar) {
        mn0 mn0Var;
        wi0 wi0Var;
        if (kiVar instanceof mn0) {
            mn0Var = (mn0) kiVar;
            int i = mn0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                mn0Var.j = i - Integer.MIN_VALUE;
            } else {
                mn0Var = new mn0(this, kiVar);
            }
        }
        Object obj = mn0Var.h;
        int i2 = mn0Var.j;
        if (i2 == 0) {
            i60.az(obj);
            wi0 wi0Var2 = new wi0();
            wi0Var2.d = j;
            gv on0Var = new on0(this, wi0Var2, j, null);
            mn0Var.g = wi0Var2;
            mn0Var.j = 1;
            Object objE = e(1, on0Var, mn0Var);
            Object obj2 = yj.d;
            if (objE == obj2) {
                return obj2;
            }
            wi0Var = wi0Var2;
        } else {
            if (i2 != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wi0Var = mn0Var.g;
            i60.az(obj);
        }
        return new o01(wi0Var.d);
    }

    public final float c(float f) {
        return this.e ? f * (-1) : f;
    }

    public final long d(long j) {
        return this.e ? xa0.h(j, -1.0f) : j;
    }

    public final Object e(int i, gv gvVar, ki kiVar) {
        Object objE = this.a.e(i, new w8(this, gvVar, null), kiVar);
        return objE == yj.d ? objE : wz0.a;
    }

    public final float f(long j) {
        return this.d == wc0.e ? xa0.d(j) : xa0.e(j);
    }

    public final long g(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        return this.d == wc0.e ? d41.h(f, 0.0f) : d41.h(0.0f, f);
    }
}

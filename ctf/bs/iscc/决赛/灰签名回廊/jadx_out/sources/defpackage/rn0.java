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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r10, defpackage.ki r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.mn0
            if (r0 == 0) goto L13
            r0 = r12
            mn0 r0 = (defpackage.mn0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            mn0 r0 = new mn0
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.h
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            wi0 r10 = r0.g
            defpackage.i60.az(r12)
            r4 = r9
            goto L4f
        L28:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.wc.q(r10)
            r10 = 0
            return r10
        L2f:
            defpackage.i60.az(r12)
            wi0 r5 = new wi0
            r5.<init>()
            r5.d = r10
            on0 r3 = new on0
            r8 = 0
            r4 = r9
            r6 = r10
            r3.<init>(r4, r5, r6, r8)
            r0.g = r5
            r0.j = r2
            java.lang.Object r10 = r9.e(r2, r3, r0)
            yj r11 = defpackage.yj.d
            if (r10 != r11) goto L4e
            return r11
        L4e:
            r10 = r5
        L4f:
            long r10 = r10.d
            o01 r12 = new o01
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn0.b(long, ki):java.lang.Object");
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

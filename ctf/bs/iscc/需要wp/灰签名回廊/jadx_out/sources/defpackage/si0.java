package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class si0 {
    public final cc a;
    public final zx0 b;
    public final m80 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public bs g;
    public long h;
    public final b i;
    public final p80 j;

    public si0() {
        cc ccVar = new cc();
        ccVar.b = new long[192];
        ccVar.c = new long[192];
        this.a = ccVar;
        this.b = new zx0();
        this.c = new m80();
        this.h = -1L;
        this.i = new b(18, this);
        this.j = new p80();
    }

    public static long a(fa0 fa0Var, long j) {
        float[] fArrB;
        int iD;
        rd0 rd0Var = fa0Var.al;
        if (rd0Var == null || (iD = f00.d((fArrB = ((lw) rd0Var).b()))) == 3) {
            return j;
        }
        if ((iD & 2) == 0) {
            return 9223372034707292159L;
        }
        return t1.au(j60.b((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), fArrB));
    }

    public static long h(s20 s20Var) {
        da0 da0Var = s20Var.ag;
        fa0 fa0Var = (fa0) da0Var.h;
        long jC = 0;
        for (fa0 fa0Var2 = (yy) da0Var.g; fa0Var2 != null && fa0Var2 != fa0Var; fa0Var2 = fa0Var2.t) {
            long jA = a(fa0Var2, jC);
            if (pz.a(jA, 9223372034707292159L)) {
                return 9223372034707292159L;
            }
            jC = pz.c(jA, fa0Var2.ac);
        }
        return jC;
    }

    public static void i(s20 s20Var) {
        long jH;
        fa0 fa0Var = (fa0) s20Var.ag.h;
        long jA = a(fa0Var, 0L);
        long jC = 9223372034707292159L;
        if (!f00.f(jA)) {
            s20Var.f = 9223372034707292159L;
            return;
        }
        long jC2 = pz.c(jA, fa0Var.ac);
        s20 s20VarQ = s20Var.q();
        if (s20VarQ != null) {
            if (!f00.f(s20VarQ.f)) {
                i(s20VarQ);
            }
            long j = s20VarQ.f;
            if (f00.f(j)) {
                if (s20VarQ.i) {
                    jH = h(s20VarQ);
                    s20VarQ.h = jH;
                    s20VarQ.i = false;
                } else {
                    jH = s20VarQ.h;
                }
                if (f00.f(jH)) {
                    jC = pz.c(pz.c(j, jH), jC2);
                }
            }
        } else {
            jC = jC2;
        }
        s20Var.f = jC;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si0.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.s20 r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si0.c(s20, boolean):void");
    }

    public final void d(s20 s20Var) {
        a90 a90VarU = s20Var.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            s20 s20Var2 = (s20) objArr[i2];
            c(s20Var2, false);
            d(s20Var2);
        }
    }

    public final void e(s20 s20Var) {
        this.d = true;
        int i = s20Var.e & 67108863;
        cc ccVar = this.a;
        long[] jArr = (long[]) ccVar.b;
        int i2 = ccVar.a;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
            i3 += 3;
        }
        bs bsVar = this.g;
        boolean z = bsVar != null;
        long j2 = this.b.b;
        if (j2 >= 0 || !z) {
            if (this.h == j2 && z) {
                return;
            }
            if (bsVar != null) {
                Handler handler = bt.a;
                bt.a.removeCallbacks(bsVar);
            }
            Handler handler2 = bt.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j2, ((long) 16) + jCurrentTimeMillis);
            this.h = jMax;
            bs bsVar2 = new bs(this.i, 0);
            bt.a.postDelayed(bsVar2, jMax - jCurrentTimeMillis);
            this.g = bsVar2;
        }
    }

    public final void f(s20 s20Var) {
        long jH = h(s20Var);
        if (!f00.f(jH)) {
            d(s20Var);
            return;
        }
        s20Var.h = jH;
        s20Var.i = false;
        a90 a90VarU = s20Var.u();
        Object[] objArr = a90VarU.d;
        int i = a90VarU.f;
        for (int i2 = 0; i2 < i; i2++) {
            g((s20) objArr[i2], false);
        }
        e(s20Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.s20 r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si0.g(s20, boolean):void");
    }

    public final void j(s20 s20Var) {
        int i = s20Var.e & 67108863;
        cc ccVar = this.a;
        long[] jArr = (long[]) ccVar.b;
        int i2 = ccVar.a;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
            i3 += 3;
        }
        this.d = true;
        this.f = true;
    }
}

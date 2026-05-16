package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: loaded from: classes.dex */
public final class v2 implements qd0 {
    public xa0 d;
    public final gp e;
    public final me0 f;
    public final boolean g;
    public boolean h;
    public long i;
    public og0 j;
    public final j70 k;

    public v2(Context context, od0 od0Var) {
        gp gpVar = new gp(context, m10.av(od0Var.a));
        this.e = gpVar;
        bw bwVar = bw.ai;
        wz0 wz0Var = wz0.a;
        this.f = new me0(wz0Var, bwVar);
        this.g = true;
        this.i = 0L;
        this.k = g70.a.c(new SuspendPointerInputElement(wz0Var, null, new ut0(new c(this, null, 3)), 6)).c(Build.VERSION.SDK_INT >= 31 ? new uo(this, gpVar) : new uo(this, gpVar, od0Var));
    }

    public final void a() {
        boolean zIsFinished;
        gp gpVar = this.e;
        EdgeEffect edgeEffect = gpVar.d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = gpVar.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect3 = gpVar.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished = edgeEffect3.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect4 = gpVar.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished = edgeEffect4.isFinished() || zIsFinished;
        }
        if (zIsFinished) {
            c();
        }
    }

    public final long b() {
        xa0 xa0Var = this.d;
        long jI = xa0Var != null ? xa0Var.a : lI.i(this.i);
        return d41.h(xa0.d(jI) / pq0.d(this.i), xa0.e(jI) / pq0.b(this.i));
    }

    public final void c() {
        if (this.g) {
            this.f.setValue(wz0.a);
        }
    }

    @Override // defpackage.qd0
    public final boolean d() {
        gp gpVar = this.e;
        EdgeEffect edgeEffect = gpVar.d;
        h6 h6Var = h6.a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? h6Var.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = gpVar.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? h6Var.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = gpVar.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? h6Var.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = gpVar.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? h6Var.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    @Override // defpackage.qd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(long r18, int r20, defpackage.l1 r21) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v2.e(long, int, l1):long");
    }

    @Override // defpackage.qd0
    public final j70 f() {
        return this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r12, defpackage.qn0 r14, defpackage.ji r15) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v2.g(long, qn0, ji):java.lang.Object");
    }

    public final float h(long j) {
        float fD = xa0.d(b());
        float fE = xa0.e(j) / pq0.b(this.i);
        EdgeEffect edgeEffectB = this.e.b();
        float fC = -fE;
        float f = 1 - fD;
        int i = Build.VERSION.SDK_INT;
        h6 h6Var = h6.a;
        if (i >= 31) {
            fC = h6Var.c(edgeEffectB, fC, f);
        } else {
            edgeEffectB.onPull(fC, f);
        }
        return (i >= 31 ? h6Var.b(edgeEffectB) : 0.0f) == 0.0f ? pq0.b(this.i) * (-fC) : xa0.e(j);
    }

    public final float i(long j) {
        float fE = xa0.e(b());
        float fD = xa0.d(j) / pq0.d(this.i);
        EdgeEffect edgeEffectC = this.e.c();
        float f = 1 - fE;
        int i = Build.VERSION.SDK_INT;
        h6 h6Var = h6.a;
        if (i >= 31) {
            fD = h6Var.c(edgeEffectC, fD, f);
        } else {
            edgeEffectC.onPull(fD, f);
        }
        return (i >= 31 ? h6Var.b(edgeEffectC) : 0.0f) == 0.0f ? pq0.d(this.i) * fD : xa0.d(j);
    }

    public final float j(long j) {
        float fE = xa0.e(b());
        float fD = xa0.d(j) / pq0.d(this.i);
        EdgeEffect edgeEffectD = this.e.d();
        float fC = -fD;
        int i = Build.VERSION.SDK_INT;
        h6 h6Var = h6.a;
        if (i >= 31) {
            fC = h6Var.c(edgeEffectD, fC, fE);
        } else {
            edgeEffectD.onPull(fC, fE);
        }
        return (i >= 31 ? h6Var.b(edgeEffectD) : 0.0f) == 0.0f ? pq0.d(this.i) * (-fC) : xa0.d(j);
    }

    public final float k(long j) {
        float fD = xa0.d(b());
        float fE = xa0.e(j) / pq0.b(this.i);
        EdgeEffect edgeEffectE = this.e.e();
        int i = Build.VERSION.SDK_INT;
        h6 h6Var = h6.a;
        if (i >= 31) {
            fE = h6Var.c(edgeEffectE, fE, fD);
        } else {
            edgeEffectE.onPull(fE, fD);
        }
        return (i >= 31 ? h6Var.b(edgeEffectE) : 0.0f) == 0.0f ? pq0.b(this.i) * fE : xa0.e(j);
    }

    public final void l(long j) {
        boolean zA = pq0.a(this.i, 0L);
        boolean zA2 = pq0.a(j, this.i);
        this.i = j;
        if (!zA2) {
            long jF = e00.f(i60.ax(pq0.d(j)), i60.ax(pq0.b(j)));
            gp gpVar = this.e;
            gpVar.c = jF;
            EdgeEffect edgeEffect = gpVar.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jF >> 32), (int) (jF & 4294967295L));
            }
            EdgeEffect edgeEffect2 = gpVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jF >> 32), (int) (jF & 4294967295L));
            }
            EdgeEffect edgeEffect3 = gpVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jF & 4294967295L), (int) (jF >> 32));
            }
            EdgeEffect edgeEffect4 = gpVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jF & 4294967295L), (int) (jF >> 32));
            }
            EdgeEffect edgeEffect5 = gpVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jF >> 32), (int) (jF & 4294967295L));
            }
            EdgeEffect edgeEffect6 = gpVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jF >> 32), (int) (jF & 4294967295L));
            }
            EdgeEffect edgeEffect7 = gpVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jF & 4294967295L), (int) (jF >> 32));
            }
            EdgeEffect edgeEffect8 = gpVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (jF & 4294967295L), (int) (jF >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        c();
        a();
    }
}

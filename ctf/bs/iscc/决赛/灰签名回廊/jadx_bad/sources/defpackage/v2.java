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
    */
    public final long e(long j, int i, l1 l1Var) {
        float fH;
        float fJ;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (pq0.e(this.i)) {
            l1Var.getClass();
            rn0 rn0Var = (rn0) l1Var.f;
            return new xa0(rn0.a(rn0Var, rn0Var.h, j, rn0Var.g)).a;
        }
        boolean z5 = this.h;
        boolean z6 = true;
        gp gpVar = this.e;
        if (!z5) {
            if (gp.g(gpVar.f)) {
                i(0L);
            }
            if (gp.g(gpVar.g)) {
                j(0L);
            }
            if (gp.g(gpVar.d)) {
                k(0L);
            }
            if (gp.g(gpVar.e)) {
                h(0L);
            }
            this.h = true;
        }
        if (xa0.e(j) != 0.0f) {
            if (gp.g(gpVar.d)) {
                fH = k(j);
                if (!gp.g(gpVar.d)) {
                    gpVar.e().onRelease();
                }
            } else if (gp.g(gpVar.e)) {
                fH = h(j);
                if (!gp.g(gpVar.e)) {
                    gpVar.b().onRelease();
                }
            } else {
                fH = 0.0f;
            }
        }
        if (xa0.d(j) != 0.0f) {
            if (gp.g(gpVar.f)) {
                fJ = i(j);
                if (!gp.g(gpVar.f)) {
                    gpVar.c().onRelease();
                }
            } else if (gp.g(gpVar.g)) {
                fJ = j(j);
                if (!gp.g(gpVar.g)) {
                    gpVar.d().onRelease();
                }
            } else {
                fJ = 0.0f;
            }
        }
        long jH = d41.h(fJ, fH);
        if (!xa0.b(jH, 0L)) {
            c();
        }
        long jF = xa0.f(j, jH);
        l1Var.getClass();
        rn0 rn0Var2 = (rn0) l1Var.f;
        long j2 = new xa0(rn0.a(rn0Var2, rn0Var2.h, jF, rn0Var2.g)).a;
        long jF2 = xa0.f(jF, j2);
        if (i != 1) {
            z = false;
        } else {
            if (xa0.d(jF2) > 0.5f) {
                i(jF2);
            } else if (xa0.d(jF2) < -0.5f) {
                j(jF2);
            } else {
                z3 = false;
                if (xa0.e(jF2) <= 0.5f) {
                    k(jF2);
                } else if (xa0.e(jF2) < -0.5f) {
                    h(jF2);
                } else {
                    z4 = false;
                    if (!z3 || z4) {
                        z = true;
                    }
                }
                z4 = true;
                if (!z3) {
                }
                z = true;
            }
            z3 = true;
            if (xa0.e(jF2) <= 0.5f) {
            }
            z4 = true;
            if (!z3) {
            }
            z = true;
        }
        if (!gp.f(gpVar.f) || xa0.d(j) >= 0.0f) {
            z2 = false;
        } else {
            EdgeEffect edgeEffectC = gpVar.c();
            float fD = xa0.d(j);
            if (edgeEffectC instanceof fw) {
                fw fwVar = (fw) edgeEffectC;
                float f = fwVar.b + fD;
                fwVar.b = f;
                if (Math.abs(f) > fwVar.a) {
                    fwVar.onRelease();
                }
            } else {
                edgeEffectC.onRelease();
            }
            z2 = !gp.f(gpVar.f);
        }
        if (gp.f(gpVar.g) && xa0.d(j) > 0.0f) {
            EdgeEffect edgeEffectD = gpVar.d();
            float fD2 = xa0.d(j);
            if (edgeEffectD instanceof fw) {
                fw fwVar2 = (fw) edgeEffectD;
                float f2 = fwVar2.b + fD2;
                fwVar2.b = f2;
                if (Math.abs(f2) > fwVar2.a) {
                    fwVar2.onRelease();
                }
            } else {
                edgeEffectD.onRelease();
            }
            z2 = z2 || !gp.f(gpVar.g);
        }
        if (gp.f(gpVar.d) && xa0.e(j) < 0.0f) {
            EdgeEffect edgeEffectE = gpVar.e();
            float fE = xa0.e(j);
            if (edgeEffectE instanceof fw) {
                fw fwVar3 = (fw) edgeEffectE;
                float f3 = fwVar3.b + fE;
                fwVar3.b = f3;
                if (Math.abs(f3) > fwVar3.a) {
                    fwVar3.onRelease();
                }
            } else {
                edgeEffectE.onRelease();
            }
            z2 = z2 || !gp.f(gpVar.d);
        }
        if (gp.f(gpVar.e) && xa0.e(j) > 0.0f) {
            EdgeEffect edgeEffectB = gpVar.b();
            float fE2 = xa0.e(j);
            if (edgeEffectB instanceof fw) {
                fw fwVar4 = (fw) edgeEffectB;
                float f4 = fwVar4.b + fE2;
                fwVar4.b = f4;
                if (Math.abs(f4) > fwVar4.a) {
                    fwVar4.onRelease();
                }
            } else {
                edgeEffectB.onRelease();
            }
            z2 = z2 || !gp.f(gpVar.e);
        }
        if (!z2 && !z) {
            z6 = false;
        }
        if (z6) {
            c();
        }
        return xa0.g(jH, j2);
    }

    @Override // defpackage.qd0
    public final j70 f() {
        return this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j, qn0 qn0Var, ji jiVar) {
        t2 t2Var;
        float fB;
        float fC;
        long jD;
        v2 v2Var;
        if (jiVar instanceof t2) {
            t2Var = (t2) jiVar;
            int i = t2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                t2Var.k = i - Integer.MIN_VALUE;
            } else {
                t2Var = new t2(this, (ki) jiVar);
            }
        }
        Object objO = t2Var.i;
        int i2 = t2Var.k;
        wz0 wz0Var = wz0.a;
        if (i2 == 0) {
            i60.az(objO);
            boolean zE = pq0.e(this.i);
            yj yjVar = yj.d;
            if (zE) {
                t2Var.k = 1;
                qn0Var.getClass();
                qn0 qn0Var2 = new qn0(qn0Var.k, t2Var);
                qn0Var2.j = j;
                if (qn0Var2.o(wz0Var) != yjVar) {
                    return wz0Var;
                }
            } else {
                float fB2 = o01.b(j);
                gp gpVar = this.e;
                if (fB2 > 0.0f && gp.g(gpVar.f)) {
                    EdgeEffect edgeEffectC = gpVar.c();
                    int iAx = i60.ax(o01.b(j));
                    if (Build.VERSION.SDK_INT >= 31 || edgeEffectC.isFinished()) {
                        edgeEffectC.onAbsorb(iAx);
                    }
                    fB = o01.b(j);
                } else if (o01.b(j) >= 0.0f || !gp.g(gpVar.g)) {
                    fB = 0.0f;
                } else {
                    EdgeEffect edgeEffectD = gpVar.d();
                    int i3 = -i60.ax(o01.b(j));
                    if (Build.VERSION.SDK_INT >= 31 || edgeEffectD.isFinished()) {
                        edgeEffectD.onAbsorb(i3);
                    }
                    fB = o01.b(j);
                }
                if (o01.c(j) > 0.0f && gp.g(gpVar.d)) {
                    EdgeEffect edgeEffectE = gpVar.e();
                    int iAx2 = i60.ax(o01.c(j));
                    if (Build.VERSION.SDK_INT >= 31 || edgeEffectE.isFinished()) {
                        edgeEffectE.onAbsorb(iAx2);
                    }
                    fC = o01.c(j);
                } else if (o01.c(j) >= 0.0f || !gp.g(gpVar.e)) {
                    fC = 0.0f;
                } else {
                    EdgeEffect edgeEffectB = gpVar.b();
                    int i4 = -i60.ax(o01.c(j));
                    if (Build.VERSION.SDK_INT >= 31 || edgeEffectB.isFinished()) {
                        edgeEffectB.onAbsorb(i4);
                    }
                    fC = o01.c(j);
                }
                long jA = q6.a(fB, fC);
                if (jA != 0) {
                    c();
                }
                jD = o01.d(j, jA);
                t2Var.g = this;
                t2Var.h = jD;
                t2Var.k = 2;
                qn0Var.getClass();
                qn0 qn0Var3 = new qn0(qn0Var.k, t2Var);
                qn0Var3.j = jD;
                objO = qn0Var3.o(wz0Var);
                if (objO != yjVar) {
                    v2Var = this;
                }
            }
            return yjVar;
        }
        if (i2 == 1) {
            i60.az(objO);
            return wz0Var;
        }
        if (i2 != 2) {
            wc.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jD = t2Var.h;
        v2Var = t2Var.g;
        i60.az(objO);
        long jD2 = o01.d(jD, ((o01) objO).a);
        v2Var.h = false;
        gp gpVar2 = v2Var.e;
        if (o01.b(jD2) > 0.0f) {
            EdgeEffect edgeEffectC2 = gpVar2.c();
            int iAx3 = i60.ax(o01.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectC2.isFinished()) {
                edgeEffectC2.onAbsorb(iAx3);
            }
        } else if (o01.b(jD2) < 0.0f) {
            EdgeEffect edgeEffectD2 = gpVar2.d();
            int i5 = -i60.ax(o01.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectD2.isFinished()) {
                edgeEffectD2.onAbsorb(i5);
            }
        }
        if (o01.c(jD2) > 0.0f) {
            EdgeEffect edgeEffectE2 = gpVar2.e();
            int iAx4 = i60.ax(o01.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectE2.isFinished()) {
                edgeEffectE2.onAbsorb(iAx4);
            }
        } else if (o01.c(jD2) < 0.0f) {
            EdgeEffect edgeEffectB2 = gpVar2.b();
            int i6 = -i60.ax(o01.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectB2.isFinished()) {
                edgeEffectB2.onAbsorb(i6);
            }
        }
        if (jD2 != 0) {
            v2Var.c();
        }
        v2Var.a();
        return wz0Var;
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

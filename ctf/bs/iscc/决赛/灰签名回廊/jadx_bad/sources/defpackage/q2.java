package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class q2 {
    public static final float a;
    public static final float b;

    static {
        float f = 25;
        a = f;
        b = (f * 2.0f) / 2.4142137f;
    }

    public static final void a(bb0 bb0Var, j70 j70Var, long j, vf vfVar, int i) {
        int i2;
        vfVar.aw(1776202187);
        int i3 = (vfVar.f(bb0Var) ? 4 : 2) | i | (vfVar.f(j70Var) ? 32 : 16) | 128;
        if ((i3 & 147) == 146 && vfVar.z()) {
            vfVar.aq();
        } else {
            vfVar.as();
            if ((i & 1) == 0 || vfVar.x()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                vfVar.aq();
                i2 = i3 & (-897);
            }
            vfVar.r();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objAk = vfVar.ak();
            if (z || objAk == nf.a) {
                objAk = new l1(4, bb0Var);
                vfVar.be(objAk);
            }
            pk.c(bb0Var, bw.f, t1.aq(-1653527038, new k2(j, ro0.a(j70Var, (cv) objAk), 0), vfVar), vfVar, i4 | 432);
        }
        long j2 = j;
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new l2(bb0Var, j70Var, j2, i);
        }
    }

    public static final void b(j70 j70Var, vf vfVar, int i, int i2) {
        int i3;
        vfVar.aw(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (vfVar.f(j70Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && vfVar.z()) {
            vfVar.aq();
        } else {
            if (i4 != 0) {
                j70Var = g70.a;
            }
            qo0.a(vfVar, m10.p(b.e(j70Var, b, a), p2.f));
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new m2(j70Var, i, i2);
        }
    }
}

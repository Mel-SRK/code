package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.CancellationSignal;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import com.example.gnd.MainActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(hj hjVar) {
        super(1);
        this.e = 25;
        zy0 zy0Var = k01.a;
        this.f = hjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0502  */
    /* JADX WARN: Type inference failed for: r1v8, types: [I1, lf0] */
    /* JADX WARN: Type inference failed for: r9v32, types: [cv, x10] */
    @Override // defpackage.cv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        int i;
        c8 c8Var;
        long j;
        zx zxVar;
        boolean z;
        int i2 = this.e;
        wz0 wz0Var = wz0.a;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                I1 i1 = (I1) obj;
                t20 t20Var = (t20) obj2;
                if (i1.t()) {
                    if (i1.a().b) {
                        i1.s();
                    }
                    for (Map.Entry entry : i1.a().g.entrySet()) {
                        t20.a(t20Var, (qx) entry.getKey(), ((Number) entry.getValue()).intValue(), i1.p());
                    }
                    fa0 fa0Var = i1.p().t;
                    fa0Var.getClass();
                    while (!fa0Var.equals(t20Var.a.p())) {
                        for (qx qxVar : t20Var.b(fa0Var).keySet()) {
                            t20.a(t20Var, qxVar, t20Var.c(fa0Var, qxVar), fa0Var);
                        }
                        fa0Var = fa0Var.t;
                        fa0Var.getClass();
                    }
                }
                return wz0Var;
            case 1:
                return Boolean.valueOf(((nz) obj2).a(((uo0) obj).g));
            case 2:
                return Boolean.valueOf(pk.l((uo0) obj, (Resources) obj2));
            case 3:
                return new w1(0, (fn) obj2);
            case 4:
                ((po0) obj).d(io0.c, new ho0(vw.d, ((bb0) obj2).a(), 2, true));
                return wz0Var;
            case 5:
                y9 y9Var = (y9) obj;
                k8 k8Var = (k8) obj2;
                if (y9Var.b() * k8Var.u < 0.0f || pq0.c(y9Var.d.c()) <= 0.0f) {
                    return y9Var.a(q0.p);
                }
                float f = 2;
                float fMin = Math.min(mn.a(k8Var.u, 0.0f) ? 1.0f : (float) Math.ceil(y9Var.b() * k8Var.u), (float) Math.ceil(pq0.c(y9Var.d.c()) / f));
                float f2 = fMin / f;
                long jH = d41.h(f2, f2);
                long jA = lI.a(pq0.d(y9Var.d.c()) - fMin, pq0.b(y9Var.d.c()) - fMin);
                float f3 = f * fMin;
                boolean z2 = f3 > pq0.c(y9Var.d.c());
                bd0 bd0VarA = k8Var.w.a(y9Var.d.c(), y9Var.d.getLayoutDirection(), y9Var);
                if (!(bd0VarA instanceof yc0)) {
                    if (!(bd0VarA instanceof ad0)) {
                        boolean z3 = z2;
                        if (!(bd0VarA instanceof zc0)) {
                            wc.l();
                            return null;
                        }
                        vr0 vr0Var = k8Var.v;
                        if (z3) {
                            jH = 0;
                        }
                        long j2 = jH;
                        if (z3) {
                            jA = y9Var.d.c();
                        }
                        return y9Var.a(new h8(vr0Var, j2, jA, z3 ? ir.a : new gt0(fMin)));
                    }
                    vr0 vr0Var2 = k8Var.v;
                    yk0 yk0Var = ((ad0) bd0VarA).a;
                    if (d41.ac(yk0Var)) {
                        return y9Var.a(new j8(z2, vr0Var2, yk0Var.e, f2, fMin, jH, jA, new gt0(fMin)));
                    }
                    boolean z4 = z2;
                    if (k8Var.t == null) {
                        k8Var.t = new g8();
                    }
                    g8 g8Var = k8Var.t;
                    g8Var.getClass();
                    t3 t3VarA = g8Var.d;
                    if (t3VarA == null) {
                        t3VarA = u3.a();
                        g8Var.d = t3VarA;
                    }
                    t3VarA.a.reset();
                    t3.a(t3VarA, yk0Var);
                    if (!z4) {
                        t3 t3VarA2 = u3.a();
                        t3.a(t3VarA2, new yk0(fMin, fMin, (yk0Var.c - yk0Var.a) - fMin, (yk0Var.d - yk0Var.b) - fMin, m10.au(yk0Var.e, fMin), m10.au(yk0Var.f, fMin), m10.au(yk0Var.g, fMin), m10.au(yk0Var.h, fMin)));
                        t3VarA.c(t3VarA, t3VarA2, 0);
                    }
                    return y9Var.a(new a2(9, t3VarA, vr0Var2));
                }
                vr0 vr0Var3 = k8Var.v;
                yc0 yc0Var = (yc0) bd0VarA;
                t3 t3Var = yc0Var.a;
                if (z2) {
                    return y9Var.a(new a2(8, yc0Var, vr0Var3));
                }
                if (vr0Var3 != null) {
                    c8Var = new c8(vr0Var3.a, 5);
                    i = 1;
                } else {
                    i = 0;
                    c8Var = null;
                }
                ri0 ri0VarB = t3Var.b();
                float f4 = ri0VarB.b;
                float f5 = ri0VarB.a;
                if (k8Var.t == null) {
                    k8Var.t = new g8();
                }
                g8 g8Var2 = k8Var.t;
                g8Var2.getClass();
                t3 t3VarA3 = g8Var2.d;
                if (t3VarA3 == null) {
                    t3VarA3 = u3.a();
                    g8Var2.d = t3VarA3;
                }
                t3VarA3.a.reset();
                float f6 = ri0VarB.a;
                float f7 = ri0VarB.d;
                float f8 = ri0VarB.c;
                float f9 = ri0VarB.b;
                if (Float.isNaN(f6) || Float.isNaN(f9) || Float.isNaN(f8) || Float.isNaN(f7)) {
                    u3.b("Invalid rectangle, make sure no value is NaN");
                }
                if (t3VarA3.b == null) {
                    t3VarA3.b = new RectF();
                }
                RectF rectF = t3VarA3.b;
                rectF.getClass();
                rectF.set(f6, f9, f8, f7);
                Path path = t3VarA3.a;
                RectF rectF2 = t3VarA3.b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                t3VarA3.c(t3VarA3, t3Var, 0);
                xi0 xi0Var = new xi0();
                long jF = e00.f((int) Math.ceil(ri0VarB.c - f5), (int) Math.ceil(ri0VarB.d - f4));
                g8 g8Var3 = k8Var.t;
                g8Var3.getClass();
                c3 c3VarC = g8Var3.a;
                e0 e0Var = g8Var3.b;
                if (c3VarC != null) {
                    j = jF;
                    zxVar = new zx(c3VarC.a());
                } else {
                    j = jF;
                    zxVar = null;
                }
                if (zxVar != null && zxVar.a == 0) {
                    z = true;
                } else {
                    zx zxVar2 = c3VarC != null ? new zx(c3VarC.a()) : null;
                    if (zxVar2 == null || i != zxVar2.a) {
                        z = false;
                    }
                }
                if (c3VarC != null) {
                    Bitmap bitmap = c3VarC.a;
                    if (e0Var == null || pq0.d(y9Var.d.c()) > bitmap.getWidth() || pq0.b(y9Var.d.c()) > bitmap.getHeight() || !z) {
                        c3VarC = f00.c((int) (j >> 32), (int) (j & 4294967295L), i);
                        g8Var3.a = c3VarC;
                        Canvas canvas = f0.a;
                        e0Var = new e0();
                        e0Var.a = new Canvas(c3VarC.a);
                        g8Var3.b = e0Var;
                    }
                }
                ra raVar = g8Var3.c;
                if (raVar == null) {
                    raVar = new ra();
                    g8Var3.c = raVar;
                }
                o6 o6Var = raVar.e;
                qa qaVar = raVar.d;
                long jAn = e00.an(j);
                ra raVar2 = raVar;
                e20 layoutDirection = y9Var.d.getLayoutDirection();
                em emVar = qaVar.a;
                e20 e20Var = qaVar.b;
                c3 c3Var = c3VarC;
                oa oaVar = qaVar.c;
                long j3 = qaVar.d;
                qaVar.a = y9Var;
                qaVar.b = layoutDirection;
                qaVar.c = e0Var;
                qaVar.d = jAn;
                e0Var.l();
                xo.ab(raVar2, qc.b, jAn, 58);
                float f10 = -f5;
                float f11 = -f4;
                ((bu) o6Var.a).q(f10, f11);
                try {
                    xo.ar(raVar2, t3Var, vr0Var3, new gt0(f3), 52);
                    float f12 = 1;
                    float fD = (pq0.d(raVar2.c()) + f12) / pq0.d(raVar2.c());
                    float fB = (pq0.b(raVar2.c()) + f12) / pq0.b(raVar2.c());
                    e0 e0Var2 = e0Var;
                    long jAn2 = raVar2.an();
                    long jR = o6Var.r();
                    o6Var.o().l();
                    try {
                        ((bu) o6Var.a).o(fD, fB, jAn2);
                        xo.ar(raVar2, t3VarA3, vr0Var3, null, 28);
                        ((bu) o6Var.a).q(-f10, -f11);
                        e0Var2.i();
                        qaVar.a = emVar;
                        qaVar.b = e20Var;
                        qaVar.c = oaVar;
                        qaVar.d = j3;
                        c3Var.a.prepareToDraw();
                        xi0Var.d = c3Var;
                        return y9Var.a(new i8(ri0VarB, xi0Var, j, c8Var));
                    } finally {
                        o6Var.o().i();
                        o6Var.ab(jR);
                    }
                } catch (Throwable th) {
                    ((bu) o6Var.a).q(-f10, -f11);
                    throw th;
                }
            case 6:
                u20 u20Var = (u20) obj;
                ((a2) obj2).g(u20Var);
                u20Var.a();
                return wz0Var;
            case 7:
                long j4 = ((xa0) obj).a;
                yb ybVar = (yb) obj2;
                if (ybVar.w) {
                    ybVar.x.a();
                }
                return wz0Var;
            case MainActivity.$stable /* 8 */:
                v5 v5Var = (v5) obj;
                float f13 = v5Var.b;
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                float f14 = v5Var.c;
                if (f14 < -0.5f) {
                    f14 = -0.5f;
                }
                if (f14 > 0.5f) {
                    f14 = 0.5f;
                }
                float f15 = v5Var.d;
                float f16 = f15 >= -0.5f ? f15 : -0.5f;
                float f17 = f16 <= 0.5f ? f16 : 0.5f;
                float f18 = v5Var.a;
                float f19 = f18 >= 0.0f ? f18 : 0.0f;
                return new qc(qc.a(m10.a(f13, f14, f17, f19 <= 1.0f ? f19 : 1.0f, gd.x), (dd) obj2));
            case 9:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return wz0Var;
            case 10:
                ((zh) obj2).a.setValue(new xh(((xa0) obj).a));
                return wz0Var;
            case 11:
                sn snVar = (sn) obj;
                if (!snVar.d.q) {
                    return ry0.e;
                }
                sn snVar2 = snVar.s;
                ry0 ry0Var = ry0.d;
                if (snVar2 != null) {
                    l1 l1Var = new l1(11, (bu) obj2);
                    if (l1Var.g(snVar2) == ry0Var) {
                        lI.n(snVar2, l1Var);
                    }
                }
                snVar.s = null;
                snVar.r = null;
                return ry0Var;
            case 12:
                ((c50) obj2).a();
                return wz0Var;
            case 13:
                if (ew.b.compareAndSet(false, true)) {
                    ((o9) obj2).u(wz0Var);
                }
                return wz0Var;
            case 14:
                xo xoVar = (xo) obj;
                jw jwVar = (jw) obj2;
                t3 t3Var2 = jwVar.l;
                if (jwVar.n && jwVar.w && t3Var2 != null) {
                    o6 o6VarAa = xoVar.aa();
                    long jR2 = o6VarAa.r();
                    o6VarAa.o().l();
                    try {
                        ((o6) ((bu) o6VarAa.a).e).o().q(t3Var2);
                        jwVar.c(xoVar);
                    } finally {
                        o6VarAa.o().i();
                        o6VarAa.ab(jR2);
                    }
                } else {
                    jwVar.c(xoVar);
                }
                return wz0Var;
            case 15:
                xo xoVar2 = (xo) obj;
                oa oaVarO = xoVar2.aa().o();
                gv gvVar = ((lw) obj2).g;
                if (gvVar != null) {
                    gvVar.f(oaVarO, (jw) xoVar2.aa().b);
                }
                return wz0Var;
            case 16:
                pa0 pa0Var = (pa0) obj;
                oi0 oi0Var = pa0Var.b;
                if (oi0Var != null) {
                    oi0Var.closeConnection();
                    pa0Var.b = null;
                }
                dz dzVar = (dz) obj2;
                a90 a90Var = dzVar.d;
                Object[] objArr = a90Var.d;
                int i3 = a90Var.f;
                while (true) {
                    if (i >= i3) {
                        i = -1;
                    } else if (!f00.h((y11) objArr[i], pa0Var)) {
                        i++;
                    }
                }
                if (i >= 0) {
                    a90Var.j(i);
                }
                if (a90Var.f == 0) {
                    dzVar.b.a();
                }
                return wz0Var;
            case 17:
                ((a90) obj2).b((h70) obj);
                return Boolean.TRUE;
            case 18:
                ((oi0) obj2).a((op) obj);
                return wz0Var;
            case 19:
                float fFloatValue = ((Number) obj).floatValue();
                ym0 ym0Var = (ym0) obj2;
                je0 je0Var = ym0Var.a;
                float fG = je0Var.g() + fFloatValue + ym0Var.e;
                float fS = i60.s(fG, 0.0f, ym0Var.d.g());
                i = fG == fS ? 1 : 0;
                float fG2 = fS - je0Var.g();
                int iRound = Math.round(fG2);
                je0Var.h(je0Var.g() + iRound);
                ym0Var.e = fG2 - iRound;
                if (i == 0) {
                    fFloatValue = fG2;
                }
                return Float.valueOf(fFloatValue);
            case 20:
                ((in0) obj2).ah.v = (d20) obj;
                return wz0Var;
            case 21:
                rn0 rn0Var = (rn0) obj2;
                return new xa0(rn0.a(rn0Var, rn0Var.h, ((xa0) obj).a, rn0Var.g));
            case 22:
                i10[] i10VarArr = bp0.a;
                ((po0) obj).d(zo0.a, f00.y((String) obj2));
                return wz0Var;
            case 23:
                uj0 uj0Var = (uj0) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj2;
                uj0Var.e(uj0Var.p.b() * vh.d);
                uj0Var.f(shadowGraphicsLayerElement.a);
                boolean z5 = shadowGraphicsLayerElement.b;
                if (uj0Var.n != z5) {
                    uj0Var.d |= 16384;
                    uj0Var.n = z5;
                }
                uj0Var.d(shadowGraphicsLayerElement.c);
                uj0Var.h(shadowGraphicsLayerElement.d);
                return wz0Var;
            case 24:
                uj0 uj0Var2 = (uj0) obj;
                mq0 mq0Var = (mq0) obj2;
                float f20 = mq0Var.r;
                if (uj0Var2.e != f20) {
                    uj0Var2.d |= 1;
                    uj0Var2.e = f20;
                }
                float f21 = mq0Var.s;
                if (uj0Var2.f != f21) {
                    uj0Var2.d = 2 | uj0Var2.d;
                    uj0Var2.f = f21;
                }
                uj0Var2.a(mq0Var.t);
                uj0Var2.e(mq0Var.u);
                float f22 = mq0Var.v;
                if (uj0Var2.k != f22) {
                    uj0Var2.d |= 2048;
                    uj0Var2.k = f22;
                }
                long j5 = mq0Var.w;
                long j6 = uj0Var2.l;
                int i4 = iy0.b;
                if (j6 != j5) {
                    uj0Var2.d |= 4096;
                    uj0Var2.l = j5;
                }
                uj0Var2.f(mq0Var.x);
                boolean z6 = mq0Var.y;
                if (uj0Var2.n != z6) {
                    uj0Var2.d |= 16384;
                    uj0Var2.n = z6;
                }
                uj0Var2.d(mq0Var.z);
                uj0Var2.h(mq0Var.aa);
                int i5 = mq0Var.ab;
                if (uj0Var2.r != i5) {
                    uj0Var2.d |= 524288;
                    uj0Var2.r = i5;
                }
                return wz0Var;
            case 25:
                p5 p5Var = (p5) obj;
                Object value = p5Var.e.getValue();
                zy0 zy0Var = k01.a;
                ((hj) obj2).f(value, Float.valueOf(((s5) p5Var.f).a));
                return wz0Var;
            case 26:
                return ((x10) obj2).g(Long.valueOf(((Number) obj).longValue()));
            case 27:
                Throwable th2 = (Throwable) obj;
                yt0 yt0Var = (yt0) obj2;
                la laVar = yt0Var.f;
                if (laVar != null) {
                    laVar.n(th2);
                }
                yt0Var.f = null;
                return wz0Var;
            case 28:
                float[] fArr = ((j60) obj).a;
                d20 d20Var = (d20) obj2;
                if (d20Var.af()) {
                    i60.ad(d20Var).aj(d20Var, fArr);
                }
                return wz0Var;
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                zv0 zv0Var = (zv0) obj2;
                ie0 ie0Var = zv0Var.a;
                float fG3 = ie0Var.g() + fFloatValue2;
                ie0 ie0Var2 = zv0Var.b;
                if (fG3 > ie0Var2.g()) {
                    fFloatValue2 = ie0Var2.g() - ie0Var.g();
                } else if (fG3 < 0.0f) {
                    fFloatValue2 = -ie0Var.g();
                }
                zv0Var.a.h(ie0Var.g() + fFloatValue2);
                return Float.valueOf(fFloatValue2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(int i, Object obj) {
        super(1);
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l1(cv cvVar) {
        super(1);
        this.e = 26;
        this.f = (x10) cvVar;
    }
}

package defpackage;

import android.os.Build;
import android.view.ViewParent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lw implements rd0 {
    public jw d;
    public final iw e;
    public final b1 f;
    public gv g;
    public pu h;
    public long i;
    public boolean j;
    public float[] l;
    public boolean m;
    public int q;
    public bd0 s;
    public boolean t;
    public boolean u;
    public boolean w;
    public final float[] k = j60.a();
    public em n = new fm(1.0f, 1.0f);
    public e20 o = e20.d;
    public final ra p = new ra();
    public long r = iy0.a;
    public boolean v = true;
    public final l1 x = new l1(15, this);

    public lw(jw jwVar, iw iwVar, b1 b1Var, gv gvVar, pu puVar) {
        this.d = jwVar;
        this.e = iwVar;
        this.f = b1Var;
        this.g = gvVar;
        this.h = puVar;
        long j = Integer.MAX_VALUE;
        this.i = (j & 4294967295L) | (j << 32);
    }

    public final float[] a() {
        float[] fArrA = this.l;
        if (fArrA == null) {
            fArrA = j60.a();
            this.l = fArrA;
        }
        if (this.u) {
            this.u = false;
            float[] fArrB = b();
            if (this.v) {
                return fArrB;
            }
            if (!m10.af(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.t;
        float[] fArr = this.k;
        if (z) {
            jw jwVar = this.d;
            long jI = jwVar.v;
            kw kwVar = jwVar.a;
            if ((9223372034707292159L & jI) == 9205357640488583168L) {
                jI = lI.i(e00.an(this.i));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI & 4294967295L));
            float fQ = kwVar.q();
            float f = kwVar.f();
            float fV = kwVar.v();
            float fAe = kwVar.ae();
            float fAj = kwVar.aj();
            float fD = kwVar.d();
            float fAi = kwVar.ai();
            double d = ((double) fV) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f2 = -fSin;
            float f3 = (f * fCos) - (1.0f * fSin);
            float f4 = (1.0f * fCos) + (f * fSin);
            double d2 = ((double) fAe) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f5 = -fSin2;
            float f6 = fSin * fSin2;
            float f7 = fSin * fCos2;
            float f8 = fCos * fSin2;
            float f9 = fCos * fCos2;
            float f10 = (f4 * fSin2) + (fQ * fCos2);
            float f11 = (f4 * fCos2) + ((-fQ) * fSin2);
            double d3 = ((double) fAj) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f12 = -fSin3;
            float f13 = (fCos3 * f6) + (f12 * fCos2);
            float f14 = (f6 * fSin3) + (fCos2 * fCos3);
            float f15 = fSin3 * fCos;
            float f16 = f14 * fD;
            float f17 = f15 * fD;
            float f18 = ((fSin3 * f7) + (fCos3 * f5)) * fD;
            float f19 = f13 * fAi;
            float f20 = fCos * fCos3 * fAi;
            float f21 = ((fCos3 * f7) + (f12 * f5)) * fAi;
            float f22 = f8 * 1.0f;
            float f23 = f2 * 1.0f;
            float f24 = f9 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f16;
                fArr[1] = f17;
                fArr[2] = f18;
                fArr[3] = 0.0f;
                fArr[4] = f19;
                fArr[5] = f20;
                fArr[6] = f21;
                fArr[7] = 0.0f;
                fArr[8] = f22;
                fArr[9] = f23;
                fArr[10] = f24;
                fArr[11] = 0.0f;
                float f25 = -fIntBitsToFloat;
                fArr[12] = ((f16 * f25) - (fIntBitsToFloat2 * f19)) + f10 + fIntBitsToFloat;
                fArr[13] = ((f17 * f25) - (fIntBitsToFloat2 * f20)) + f3 + fIntBitsToFloat2;
                fArr[14] = ((f25 * f18) - (fIntBitsToFloat2 * f21)) + f11;
                fArr[15] = 1.0f;
            }
            this.t = false;
            this.v = i60.am(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.m || this.j) {
            return;
        }
        this.f.invalidate();
        f(true);
    }

    public final void d(long j) {
        b1 b1Var = this.f;
        if (b1Var.i) {
            b1Var.ai(-4.0f);
        }
        jw jwVar = this.d;
        if (!pz.a(jwVar.t, j)) {
            jwVar.t = j;
            jwVar.a.ad((int) (j >> 32), (int) (j & 4294967295L), jwVar.u);
        }
        if (Build.VERSION.SDK_INT < 26) {
            b1Var.invalidate();
            return;
        }
        ViewParent parent = b1Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(b1Var, b1Var);
        }
    }

    public final void e(long j) {
        if (wz.a(j, this.i)) {
            return;
        }
        b1 b1Var = this.f;
        if (b1Var.i) {
            b1Var.ai(-4.0f);
        }
        this.i = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.m) {
            this.m = z;
            b1 b1Var = this.f;
            ArrayList arrayList = b1Var.aa;
            boolean z2 = b1Var.ac;
            if (!z) {
                if (z2) {
                    return;
                }
                arrayList.remove(this);
                ArrayList arrayList2 = b1Var.ab;
                if (arrayList2 != null) {
                    arrayList2.remove(this);
                    return;
                }
                return;
            }
            if (!z2) {
                arrayList.add(this);
                return;
            }
            ArrayList arrayList3 = b1Var.ab;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                b1Var.ab = arrayList3;
            }
            arrayList3.add(this);
        }
    }

    public final void g() {
        if (this.m) {
            if (this.r != iy0.a && !wz.a(this.d.u, this.i)) {
                jw jwVar = this.d;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.r >> 32)) * ((int) (this.i >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.r & 4294967295L)) * ((int) (this.i & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!xa0.b(jwVar.v, jFloatToRawIntBits)) {
                    jwVar.v = jFloatToRawIntBits;
                    jwVar.a.al(jFloatToRawIntBits);
                }
            }
            jw jwVar2 = this.d;
            em emVar = this.n;
            e20 e20Var = this.o;
            long j = this.i;
            long j2 = jwVar2.u;
            kw kwVar = jwVar2.a;
            if (!wz.a(j2, j)) {
                jwVar2.u = j;
                long j3 = jwVar2.t;
                kwVar.ad((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (jwVar2.i == 9205357640488583168L) {
                    jwVar2.g = true;
                    jwVar2.a();
                }
            }
            jwVar2.b = emVar;
            jwVar2.c = e20Var;
            jwVar2.d = this.x;
            kwVar.w(emVar, e20Var, jwVar2, jwVar2.e);
            f(false);
        }
    }
}

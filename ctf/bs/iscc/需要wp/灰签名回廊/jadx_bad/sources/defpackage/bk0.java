package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bk0 extends dd {
    public static final wc r = new wc(19);
    public final a21 d;
    public final float e;
    public final float f;
    public final hy0 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final kn k;
    public final ak0 l;
    public final xj0 m;
    public final kn n;
    public final ak0 o;
    public final xj0 p;
    public final boolean q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bk0(String str, float[] fArr, a21 a21Var, float[] fArr2, kn knVar, kn knVar2, float f, float f2, hy0 hy0Var, int i) {
        int i2;
        int i3;
        float f3;
        boolean z;
        float f4;
        boolean z2;
        double d;
        super(str, uc.a, i);
        this.d = a21Var;
        this.e = f;
        this.f = f2;
        this.g = hy0Var;
        this.k = knVar;
        int i4 = 1;
        this.l = new ak0(this, i4);
        int i5 = 0;
        this.m = new xj0(this, i5);
        this.n = knVar2;
        this.o = new ak0(this, i5);
        this.p = new xj0(this, i4);
        if (fArr.length != 6 && fArr.length != 9) {
            wc.n("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr3[0] = f5 / f7;
            fArr3[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr3[2] = f8 / f10;
            fArr3[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr3[4] = f11 / f13;
            fArr3[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.h = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            f3 = 1.0f;
            float f20 = a21Var.a;
            i2 = 0;
            float f21 = a21Var.b;
            i3 = 6;
            float f22 = 1;
            float f23 = (f22 - f14) / f15;
            float f24 = (f22 - f16) / f17;
            float f25 = (f22 - f18) / f19;
            float f26 = (f22 - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = f24 - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / (((f25 - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.i = new float[]{f35 * f14, f34, ((1.0f - f14) - f15) * f35, f36 * f16, f33, ((1.0f - f16) - f17) * f36, f37 * f18, f32, ((1.0f - f18) - f19) * f37};
        } else {
            i2 = 0;
            i3 = 6;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                wc.o("Transform must have 9 entries! Has ", fArr2.length);
                throw null;
            }
            this.i = fArr2;
        }
        this.j = i60.ai(this.i);
        float fN = az0.n(fArr3);
        float[] fArr4 = gd.a;
        if (fN / az0.n(gd.b) > 0.9f) {
            float[] fArr5 = gd.a;
            float f38 = fArr3[i2];
            float f39 = fArr5[i2];
            float f40 = fArr3[1];
            float f41 = fArr5[1];
            float f42 = fArr3[2];
            float f43 = fArr5[2];
            float f44 = fArr3[3];
            float f45 = fArr5[3];
            float f46 = fArr3[4];
            float f47 = fArr5[4];
            float f48 = fArr3[5];
            float f49 = fArr5[5];
            z = true;
            f4 = 0.0f;
            float[] fArr6 = new float[i3];
            fArr6[i2] = f38 - f39;
            fArr6[1] = f40 - f41;
            fArr6[2] = f42 - f43;
            fArr6[3] = f44 - f45;
            fArr6[4] = f46 - f47;
            fArr6[5] = f48 - f49;
            float f50 = fArr6[i2];
            float f51 = fArr6[1];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr6[2];
                float f53 = fArr6[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr6[4];
                    float f55 = fArr6[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                float[] fArr7 = gd.a;
                if (fArr3 != fArr7) {
                    for (int i6 = i2; i6 < 6; i6++) {
                        if (Float.compare(fArr3[i6], fArr7[i6]) != 0 && Math.abs(fArr3[i6] - fArr7[i6]) > 0.001f) {
                            break;
                        }
                    }
                    if (i60.w(a21Var, i60.i)) {
                        float[] fArr8 = gd.a;
                        bk0 bk0Var = gd.e;
                        while (d <= 1.0d) {
                        }
                        z2 = z;
                    }
                    z2 = i2;
                    break;
                }
                if (i60.w(a21Var, i60.i) && f == f4 && f2 == f3) {
                    float[] fArr82 = gd.a;
                    bk0 bk0Var2 = gd.e;
                    for (d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                        if (Math.abs(knVar.b(d) - bk0Var2.k.b(d)) <= 0.001d && Math.abs(knVar2.b(d) - bk0Var2.n.b(d)) <= 0.001d) {
                        }
                    }
                    z2 = z;
                }
                z2 = i2;
                break;
            }
            z2 = z;
            this.q = z2;
        }
        z = true;
        f4 = 0.0f;
        int i7 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
        }
        this.q = z2;
    }

    @Override // defpackage.dd
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.dd
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.dd
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.dd
    public final long d(float f, float f2, float f3) {
        double d = f;
        xj0 xj0Var = this.p;
        float fB = (float) xj0Var.b(d);
        float fB2 = (float) xj0Var.b(f2);
        float fB3 = (float) xj0Var.b(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        return (((long) Float.floatToRawIntBits((fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB))) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    @Override // defpackage.dd
    public final float e(float f, float f2, float f3) {
        double d = f;
        xj0 xj0Var = this.p;
        float fB = (float) xj0Var.b(d);
        float fB2 = (float) xj0Var.b(f2);
        float fB3 = (float) xj0Var.b(f3);
        float[] fArr = this.i;
        return (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
    }

    @Override // defpackage.dd
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bk0.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        bk0 bk0Var = (bk0) obj;
        if (Float.compare(bk0Var.e, this.e) != 0 || Float.compare(bk0Var.f, this.f) != 0 || !f00.h(this.d, bk0Var.d) || !Arrays.equals(this.h, bk0Var.h)) {
            return false;
        }
        hy0 hy0Var = bk0Var.g;
        hy0 hy0Var2 = this.g;
        if (hy0Var2 != null) {
            return f00.h(hy0Var2, hy0Var);
        }
        if (hy0Var == null) {
            return true;
        }
        if (f00.h(this.k, bk0Var.k)) {
            return f00.h(this.n, bk0Var.n);
        }
        return false;
    }

    @Override // defpackage.dd
    public final long f(float f, float f2, float f3, float f4, dd ddVar) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        xj0 xj0Var = this.m;
        return m10.a((float) xj0Var.b(f5), (float) xj0Var.b(f6), (float) xj0Var.b(f7), f4, ddVar);
    }

    @Override // defpackage.dd
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        hy0 hy0Var = this.g;
        int iHashCode2 = iFloatToIntBits2 + (hy0Var != null ? hy0Var.hashCode() : 0);
        if (hy0Var == null) {
            return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    public bk0(String str, float[] fArr, a21 a21Var, final hy0 hy0Var, int i) {
        kn knVar;
        kn knVar2;
        double d = hy0Var.a;
        boolean z = d == -3.0d;
        double d2 = hy0Var.g;
        double d3 = hy0Var.f;
        if (z) {
            final int i2 = 4;
            knVar = new kn() { // from class: zj0
                @Override // defpackage.kn
                public final double b(double d4) {
                    int i3 = i2;
                    hy0 hy0Var2 = hy0Var;
                    switch (i3) {
                        case 0:
                            float[] fArr2 = gd.a;
                            return gd.a(hy0Var2, d4);
                        case 1:
                            float[] fArr3 = gd.a;
                            return gd.c(hy0Var2, d4);
                        case 2:
                            double d5 = hy0Var2.b;
                            return d4 >= hy0Var2.e ? Math.pow((d5 * d4) + hy0Var2.c, hy0Var2.a) : d4 * hy0Var2.d;
                        case 3:
                            double d6 = hy0Var2.b;
                            double d7 = hy0Var2.c;
                            double d8 = hy0Var2.d;
                            return d4 >= hy0Var2.e ? Math.pow((d6 * d4) + d7, hy0Var2.a) + hy0Var2.f : (d8 * d4) + hy0Var2.g;
                        case 4:
                            float[] fArr4 = gd.a;
                            return gd.b(hy0Var2, d4);
                        case 5:
                            float[] fArr5 = gd.a;
                            return gd.d(hy0Var2, d4);
                        case 6:
                            double d9 = hy0Var2.b;
                            double d10 = hy0Var2.c;
                            double d11 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d11 ? (Math.pow(d4, 1.0d / hy0Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = hy0Var2.b;
                            double d13 = hy0Var2.c;
                            double d14 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d14 ? (Math.pow(d4 - hy0Var2.f, 1.0d / hy0Var2.a) - d13) / d12 : (d4 - hy0Var2.g) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i3 = 5;
            knVar = new kn() { // from class: zj0
                @Override // defpackage.kn
                public final double b(double d4) {
                    int i32 = i3;
                    hy0 hy0Var2 = hy0Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = gd.a;
                            return gd.a(hy0Var2, d4);
                        case 1:
                            float[] fArr3 = gd.a;
                            return gd.c(hy0Var2, d4);
                        case 2:
                            double d5 = hy0Var2.b;
                            return d4 >= hy0Var2.e ? Math.pow((d5 * d4) + hy0Var2.c, hy0Var2.a) : d4 * hy0Var2.d;
                        case 3:
                            double d6 = hy0Var2.b;
                            double d7 = hy0Var2.c;
                            double d8 = hy0Var2.d;
                            return d4 >= hy0Var2.e ? Math.pow((d6 * d4) + d7, hy0Var2.a) + hy0Var2.f : (d8 * d4) + hy0Var2.g;
                        case 4:
                            float[] fArr4 = gd.a;
                            return gd.b(hy0Var2, d4);
                        case 5:
                            float[] fArr5 = gd.a;
                            return gd.d(hy0Var2, d4);
                        case 6:
                            double d9 = hy0Var2.b;
                            double d10 = hy0Var2.c;
                            double d11 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d11 ? (Math.pow(d4, 1.0d / hy0Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = hy0Var2.b;
                            double d13 = hy0Var2.c;
                            double d14 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d14 ? (Math.pow(d4 - hy0Var2.f, 1.0d / hy0Var2.a) - d13) / d12 : (d4 - hy0Var2.g) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i4 = 6;
            knVar = new kn() { // from class: zj0
                @Override // defpackage.kn
                public final double b(double d4) {
                    int i32 = i4;
                    hy0 hy0Var2 = hy0Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = gd.a;
                            return gd.a(hy0Var2, d4);
                        case 1:
                            float[] fArr3 = gd.a;
                            return gd.c(hy0Var2, d4);
                        case 2:
                            double d5 = hy0Var2.b;
                            return d4 >= hy0Var2.e ? Math.pow((d5 * d4) + hy0Var2.c, hy0Var2.a) : d4 * hy0Var2.d;
                        case 3:
                            double d6 = hy0Var2.b;
                            double d7 = hy0Var2.c;
                            double d8 = hy0Var2.d;
                            return d4 >= hy0Var2.e ? Math.pow((d6 * d4) + d7, hy0Var2.a) + hy0Var2.f : (d8 * d4) + hy0Var2.g;
                        case 4:
                            float[] fArr4 = gd.a;
                            return gd.b(hy0Var2, d4);
                        case 5:
                            float[] fArr5 = gd.a;
                            return gd.d(hy0Var2, d4);
                        case 6:
                            double d9 = hy0Var2.b;
                            double d10 = hy0Var2.c;
                            double d11 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d11 ? (Math.pow(d4, 1.0d / hy0Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = hy0Var2.b;
                            double d13 = hy0Var2.c;
                            double d14 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d14 ? (Math.pow(d4 - hy0Var2.f, 1.0d / hy0Var2.a) - d13) / d12 : (d4 - hy0Var2.g) / d14;
                    }
                }
            };
        } else {
            final int i5 = 7;
            knVar = new kn() { // from class: zj0
                @Override // defpackage.kn
                public final double b(double d4) {
                    int i32 = i5;
                    hy0 hy0Var2 = hy0Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = gd.a;
                            return gd.a(hy0Var2, d4);
                        case 1:
                            float[] fArr3 = gd.a;
                            return gd.c(hy0Var2, d4);
                        case 2:
                            double d5 = hy0Var2.b;
                            return d4 >= hy0Var2.e ? Math.pow((d5 * d4) + hy0Var2.c, hy0Var2.a) : d4 * hy0Var2.d;
                        case 3:
                            double d6 = hy0Var2.b;
                            double d7 = hy0Var2.c;
                            double d8 = hy0Var2.d;
                            return d4 >= hy0Var2.e ? Math.pow((d6 * d4) + d7, hy0Var2.a) + hy0Var2.f : (d8 * d4) + hy0Var2.g;
                        case 4:
                            float[] fArr4 = gd.a;
                            return gd.b(hy0Var2, d4);
                        case 5:
                            float[] fArr5 = gd.a;
                            return gd.d(hy0Var2, d4);
                        case 6:
                            double d9 = hy0Var2.b;
                            double d10 = hy0Var2.c;
                            double d11 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d11 ? (Math.pow(d4, 1.0d / hy0Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = hy0Var2.b;
                            double d13 = hy0Var2.c;
                            double d14 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d14 ? (Math.pow(d4 - hy0Var2.f, 1.0d / hy0Var2.a) - d13) / d12 : (d4 - hy0Var2.g) / d14;
                    }
                }
            };
        }
        if (d == -3.0d) {
            final int i6 = 0;
            knVar2 = new kn() { // from class: zj0
                @Override // defpackage.kn
                public final double b(double d4) {
                    int i32 = i6;
                    hy0 hy0Var2 = hy0Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = gd.a;
                            return gd.a(hy0Var2, d4);
                        case 1:
                            float[] fArr3 = gd.a;
                            return gd.c(hy0Var2, d4);
                        case 2:
                            double d5 = hy0Var2.b;
                            return d4 >= hy0Var2.e ? Math.pow((d5 * d4) + hy0Var2.c, hy0Var2.a) : d4 * hy0Var2.d;
                        case 3:
                            double d6 = hy0Var2.b;
                            double d7 = hy0Var2.c;
                            double d8 = hy0Var2.d;
                            return d4 >= hy0Var2.e ? Math.pow((d6 * d4) + d7, hy0Var2.a) + hy0Var2.f : (d8 * d4) + hy0Var2.g;
                        case 4:
                            float[] fArr4 = gd.a;
                            return gd.b(hy0Var2, d4);
                        case 5:
                            float[] fArr5 = gd.a;
                            return gd.d(hy0Var2, d4);
                        case 6:
                            double d9 = hy0Var2.b;
                            double d10 = hy0Var2.c;
                            double d11 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d11 ? (Math.pow(d4, 1.0d / hy0Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = hy0Var2.b;
                            double d13 = hy0Var2.c;
                            double d14 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d14 ? (Math.pow(d4 - hy0Var2.f, 1.0d / hy0Var2.a) - d13) / d12 : (d4 - hy0Var2.g) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i7 = 1;
            knVar2 = new kn() { // from class: zj0
                @Override // defpackage.kn
                public final double b(double d4) {
                    int i32 = i7;
                    hy0 hy0Var2 = hy0Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = gd.a;
                            return gd.a(hy0Var2, d4);
                        case 1:
                            float[] fArr3 = gd.a;
                            return gd.c(hy0Var2, d4);
                        case 2:
                            double d5 = hy0Var2.b;
                            return d4 >= hy0Var2.e ? Math.pow((d5 * d4) + hy0Var2.c, hy0Var2.a) : d4 * hy0Var2.d;
                        case 3:
                            double d6 = hy0Var2.b;
                            double d7 = hy0Var2.c;
                            double d8 = hy0Var2.d;
                            return d4 >= hy0Var2.e ? Math.pow((d6 * d4) + d7, hy0Var2.a) + hy0Var2.f : (d8 * d4) + hy0Var2.g;
                        case 4:
                            float[] fArr4 = gd.a;
                            return gd.b(hy0Var2, d4);
                        case 5:
                            float[] fArr5 = gd.a;
                            return gd.d(hy0Var2, d4);
                        case 6:
                            double d9 = hy0Var2.b;
                            double d10 = hy0Var2.c;
                            double d11 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d11 ? (Math.pow(d4, 1.0d / hy0Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = hy0Var2.b;
                            double d13 = hy0Var2.c;
                            double d14 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d14 ? (Math.pow(d4 - hy0Var2.f, 1.0d / hy0Var2.a) - d13) / d12 : (d4 - hy0Var2.g) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i8 = 2;
            knVar2 = new kn() { // from class: zj0
                @Override // defpackage.kn
                public final double b(double d4) {
                    int i32 = i8;
                    hy0 hy0Var2 = hy0Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = gd.a;
                            return gd.a(hy0Var2, d4);
                        case 1:
                            float[] fArr3 = gd.a;
                            return gd.c(hy0Var2, d4);
                        case 2:
                            double d5 = hy0Var2.b;
                            return d4 >= hy0Var2.e ? Math.pow((d5 * d4) + hy0Var2.c, hy0Var2.a) : d4 * hy0Var2.d;
                        case 3:
                            double d6 = hy0Var2.b;
                            double d7 = hy0Var2.c;
                            double d8 = hy0Var2.d;
                            return d4 >= hy0Var2.e ? Math.pow((d6 * d4) + d7, hy0Var2.a) + hy0Var2.f : (d8 * d4) + hy0Var2.g;
                        case 4:
                            float[] fArr4 = gd.a;
                            return gd.b(hy0Var2, d4);
                        case 5:
                            float[] fArr5 = gd.a;
                            return gd.d(hy0Var2, d4);
                        case 6:
                            double d9 = hy0Var2.b;
                            double d10 = hy0Var2.c;
                            double d11 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d11 ? (Math.pow(d4, 1.0d / hy0Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = hy0Var2.b;
                            double d13 = hy0Var2.c;
                            double d14 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d14 ? (Math.pow(d4 - hy0Var2.f, 1.0d / hy0Var2.a) - d13) / d12 : (d4 - hy0Var2.g) / d14;
                    }
                }
            };
        } else {
            final int i9 = 3;
            knVar2 = new kn() { // from class: zj0
                @Override // defpackage.kn
                public final double b(double d4) {
                    int i32 = i9;
                    hy0 hy0Var2 = hy0Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = gd.a;
                            return gd.a(hy0Var2, d4);
                        case 1:
                            float[] fArr3 = gd.a;
                            return gd.c(hy0Var2, d4);
                        case 2:
                            double d5 = hy0Var2.b;
                            return d4 >= hy0Var2.e ? Math.pow((d5 * d4) + hy0Var2.c, hy0Var2.a) : d4 * hy0Var2.d;
                        case 3:
                            double d6 = hy0Var2.b;
                            double d7 = hy0Var2.c;
                            double d8 = hy0Var2.d;
                            return d4 >= hy0Var2.e ? Math.pow((d6 * d4) + d7, hy0Var2.a) + hy0Var2.f : (d8 * d4) + hy0Var2.g;
                        case 4:
                            float[] fArr4 = gd.a;
                            return gd.b(hy0Var2, d4);
                        case 5:
                            float[] fArr5 = gd.a;
                            return gd.d(hy0Var2, d4);
                        case 6:
                            double d9 = hy0Var2.b;
                            double d10 = hy0Var2.c;
                            double d11 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d11 ? (Math.pow(d4, 1.0d / hy0Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = hy0Var2.b;
                            double d13 = hy0Var2.c;
                            double d14 = hy0Var2.d;
                            return d4 >= hy0Var2.e * d14 ? (Math.pow(d4 - hy0Var2.f, 1.0d / hy0Var2.a) - d13) / d12 : (d4 - hy0Var2.g) / d14;
                    }
                }
            };
        }
        this(str, fArr, a21Var, null, knVar, knVar2, 0.0f, 1.0f, hy0Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bk0(String str, float[] fArr, a21 a21Var, final double d, float f, float f2, int i) {
        kn knVar;
        kn knVar2 = r;
        if (d == 1.0d) {
            knVar = knVar2;
        } else {
            final int i2 = 0;
            knVar = new kn() { // from class: yj0
                @Override // defpackage.kn
                public final double b(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            knVar2 = new kn() { // from class: yj0
                @Override // defpackage.kn
                public final double b(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        this(str, fArr, a21Var, null, knVar, knVar2, f, f2, new hy0(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}

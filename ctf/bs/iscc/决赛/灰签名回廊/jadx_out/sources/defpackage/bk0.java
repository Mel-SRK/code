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
        To view partially-correct add '--show-bad-code' argument
    */
    public bk0(java.lang.String r33, float[] r34, defpackage.a21 r35, float[] r36, defpackage.kn r37, defpackage.kn r38, float r39, float r40, defpackage.hy0 r41, int r42) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk0.<init>(java.lang.String, float[], a21, float[], kn, kn, float, float, hy0, int):void");
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

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gk implements ep {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public gk(float f, float f2, float f3) {
        int iAq;
        this.a = f;
        this.b = f2;
        this.c = f3;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(1.0f)) {
            eh0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", 1.0.");
        }
        float[] fArr = new float[5];
        float f4 = (f2 - 0.0f) * 3.0f;
        float f5 = (1.0f - f2) * 3.0f;
        double d = f4;
        double d2 = f5;
        double d3 = 0.0f;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            iAq = d2 == d3 ? 0 : e00.aq((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int iAq2 = e00.aq((float) ((-(d6 + d7)) / d5), fArr, 0);
            iAq = e00.aq((float) ((d6 - d7) / d5), fArr, iAq2) + iAq2;
            if (iAq > 1) {
                float f6 = fArr[0];
                float f7 = fArr[1];
                if (f6 > f7) {
                    fArr[0] = f7;
                    fArr[1] = f6;
                } else if (f6 == f7) {
                    iAq--;
                }
            }
        }
        float f8 = (f5 - f4) * 2.0f;
        int iAq3 = e00.aq((-f8) / (((0.0f - f5) * 2.0f) - f8), fArr, iAq) + iAq;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i = 0; i < iAq3; i++) {
            float f9 = fArr[i];
            float f10 = (((((((((f2 - 1.0f) * 3.0f) + 1.0f) - 0.0f) * f9) + (((1.0f - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f9) + f4) * f9) + 0.0f;
            fMin = Math.min(fMin, f10);
            fMax = Math.max(fMax, f10);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.d = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.e = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[PHI: r16
      0x0089: PHI (r16v13 float) = (r16v2 float), (r16v6 float), (r16v10 float), (r16v15 float), (r16v19 float) binds: [B:123:0x0222, B:113:0x01f5, B:89:0x01ad, B:45:0x00da, B:21:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157 A[PHI: r12
      0x0157: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:66:0x0155, B:79:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float f2 = 0.0f - f;
        float f3 = this.a;
        float f4 = f3 - f;
        float f5 = this.c;
        float f6 = f5 - f;
        double d = f2;
        float f7 = 0.0f;
        double d2 = ((d - (((double) f4) * 2.0d)) + ((double) f6)) * 3.0d;
        double d3 = ((double) (f4 - f2)) * 3.0d;
        double d4 = (((double) (f4 - f6)) * 3.0d) + ((double) (-f2)) + ((double) (1.0f - f));
        float f8 = Float.NaN;
        if (Math.abs(d4 - 0.0d) >= 1.0E-7d) {
            double d5 = d2 / d4;
            double d6 = d3 / d4;
            double d7 = d / d4;
            double d8 = ((d6 * 3.0d) - (d5 * d5)) / 9.0d;
            double d9 = ((d7 * 27.0d) + ((((2.0d * d5) * d5) * d5) - ((9.0d * d5) * d6))) / 54.0d;
            double d10 = d8 * d8 * d8;
            double d11 = (d9 * d9) + d10;
            double d12 = d5 / 3.0d;
            if (d11 < 0.0d) {
                double dSqrt = Math.sqrt(-d10);
                double d13 = (-d9) / dSqrt;
                if (d13 < -1.0d) {
                    d13 = -1.0d;
                }
                if (d13 > 1.0d) {
                    d13 = 1.0d;
                }
                double dAcos = Math.acos(d13);
                double dT = m10.t((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dT) - d12);
                float f9 = fCos < 0.0f ? 0.0f : fCos;
                if (f9 > 1.0f) {
                    f9 = 1.0f;
                }
                if (Math.abs(f9 - fCos) > 1.05E-6f) {
                    f9 = Float.NaN;
                }
                if (Float.isNaN(f9)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dT) - d12);
                    f9 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f9 > 1.0f) {
                        f9 = 1.0f;
                    }
                    if (Math.abs(f9 - fCos2) > 1.05E-6f) {
                        f9 = Float.NaN;
                    }
                    if (Float.isNaN(f9)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dT) - d12);
                        if (fCos3 >= 0.0f) {
                            f7 = fCos3;
                        }
                        if (f7 > 1.0f) {
                            f7 = 1.0f;
                        }
                        if (Math.abs(f7 - fCos3) <= 1.05E-6f) {
                        }
                    }
                } else {
                    f8 = f9;
                }
            } else if (d11 == 0.0d) {
                float f10 = -m10.t((float) d9);
                float f11 = (float) d12;
                float f12 = (f10 * 2.0f) - f11;
                float f13 = f12 < 0.0f ? 0.0f : f12;
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                if (Math.abs(f13 - f12) > 1.05E-6f) {
                    f13 = Float.NaN;
                }
                if (Float.isNaN(f13)) {
                    float f14 = (-f10) - f11;
                    if (f14 >= 0.0f) {
                        f7 = f14;
                    }
                    if (f7 > 1.0f) {
                        f7 = 1.0f;
                    }
                    if (Math.abs(f7 - f14) <= 1.05E-6f) {
                    }
                } else {
                    f8 = f13;
                }
            } else {
                double dSqrt2 = Math.sqrt(d11);
                float fT = (float) (((double) (m10.t((float) ((-d9) + dSqrt2)) - m10.t((float) (d9 + dSqrt2)))) - d12);
                if (fT >= 0.0f) {
                    f7 = fT;
                }
                if (f7 > 1.0f) {
                    f7 = 1.0f;
                }
                if (Math.abs(f7 - fT) <= 1.05E-6f) {
                }
            }
        } else if (Math.abs(d2 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d14 = d2 * 2.0d;
            float f15 = (float) ((dSqrt3 - d3) / d14);
            float f16 = f15 < 0.0f ? 0.0f : f15;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            if (Math.abs(f16 - f15) > 1.05E-6f) {
                f16 = Float.NaN;
            }
            if (Float.isNaN(f16)) {
                float f17 = (float) (((-d3) - dSqrt3) / d14);
                if (f17 >= 0.0f) {
                    f7 = f17;
                }
                if (f7 > 1.0f) {
                    f7 = 1.0f;
                }
                if (Math.abs(f7 - f17) <= 1.05E-6f) {
                }
            } else {
                f8 = f16;
            }
        } else if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
            float f18 = (float) ((-d) / d3);
            if (f18 >= 0.0f) {
                f7 = f18;
            }
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            if (Math.abs(f7 - f18) <= 1.05E-6f) {
                f8 = f7;
            }
        }
        boolean zIsNaN = Float.isNaN(f8);
        float f19 = this.b;
        if (!zIsNaN) {
            float f20 = ((((((f19 - 1.0f) + 0.33333334f) * f8) + (1.0f - (2.0f * f19))) * f8) + f19) * 3.0f * f8;
            float f21 = this.d;
            if (f20 < f21) {
                f20 = f21;
            }
            float f22 = this.e;
            return f20 > f22 ? f22 : f20;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f3 + ", " + f19 + ", " + f5 + ", 1.0) has no solution at " + f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gk)) {
            return false;
        }
        gk gkVar = (gk) obj;
        return this.a == gkVar.a && this.b == gkVar.b && this.c == gkVar.c;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + n5.b(this.c, n5.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=1.0)";
    }
}

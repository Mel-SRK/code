package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vr implements ur {
    public final float a;
    public final ds0 b;

    public vr(float f, float f2, float f3) {
        this.a = f3;
        ds0 ds0Var = new ds0();
        ds0Var.a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        ds0Var.b = dSqrt;
        ds0Var.g = 1.0f;
        if (f < 0.0f) {
            wc.n("Damping ratio must be non-negative");
            throw null;
        }
        ds0Var.g = f;
        ds0Var.c = false;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            wc.n("Spring stiffness constant must be positive.");
            throw null;
        }
        ds0Var.b = Math.sqrt(f2);
        ds0Var.c = false;
        this.b = ds0Var;
    }

    @Override // defpackage.ur
    public final float b(long j, float f, float f2, float f3) {
        ds0 ds0Var = this.b;
        ds0Var.a = f2;
        return Float.intBitsToFloat((int) (ds0Var.a(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.ur
    public final float c(long j, float f, float f2, float f3) {
        ds0 ds0Var = this.b;
        ds0Var.a = f2;
        return Float.intBitsToFloat((int) (ds0Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025f  */
    @Override // defpackage.ur
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(float f, float f2, float f3) {
        double d;
        double d2;
        yd ydVar;
        int i;
        double dLog;
        long j;
        double d3;
        ds0 ds0Var = this.b;
        double d4 = ds0Var.b;
        float f4 = (float) (d4 * d4);
        float f5 = ds0Var.g;
        float f6 = this.a;
        float f7 = (f - f2) / f6;
        float f8 = f3 / f6;
        if (f5 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d5 = f4;
            double d6 = f5;
            double d7 = f8;
            double d8 = f7;
            double d9 = 1.0f;
            double dSqrt = d6 * 2.0d * Math.sqrt(d5);
            double d10 = (dSqrt * dSqrt) - (d5 * 4.0d);
            double d11 = -dSqrt;
            if (d10 < 0.0d) {
                d2 = 2.0d;
                d = d6;
                ydVar = new yd(0.0d, Math.sqrt(Math.abs(d10)));
            } else {
                d = d6;
                d2 = 2.0d;
                ydVar = new yd(Math.sqrt(d10), 0.0d);
            }
            ydVar.a = (ydVar.a + d11) * 0.5d;
            ydVar.b *= 0.5d;
            yd ydVar2 = d10 < 0.0d ? new yd(0.0d, Math.sqrt(Math.abs(d10))) : new yd(Math.sqrt(d10), 0.0d);
            double d12 = -1;
            double d13 = ydVar2.a * d12;
            double d14 = ydVar2.b * d12;
            ydVar2.a = (d13 + d11) * 0.5d;
            ydVar2.b = d14 * 0.5d;
            if (d8 == 0.0d && d7 == 0.0d) {
                j = 0;
            } else {
                if (d8 < 0.0d) {
                    d7 = -d7;
                }
                double dAbs = Math.abs(d8);
                double d15 = ydVar.a;
                double dAbs2 = Double.MAX_VALUE;
                if (d > 1.0d) {
                    double d16 = ydVar2.a;
                    double d17 = (d15 * dAbs) - d7;
                    double d18 = d15 - d16;
                    double d19 = d17 / d18;
                    double d20 = dAbs - d19;
                    dLog = Math.log(Math.abs(d9 / d20)) / d15;
                    double dLog2 = Math.log(Math.abs(d9 / d19)) / d16;
                    if (Double.isInfinite(dLog) || Double.isNaN(dLog)) {
                        dLog = dLog2;
                    } else if (!Double.isInfinite(dLog2) && !Double.isNaN(dLog2)) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d21 = d20 * d15;
                    double dLog3 = Math.log(d21 / ((-d19) * d16)) / (d16 - d15);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d9 = -d9;
                        d3 = d19 * d16;
                        if (Math.abs((Math.exp(d16 * dLog) * d3) + (Math.exp(d15 * dLog) * d21)) >= 1.0E-4d) {
                            int i2 = 0;
                            while (dAbs2 > 0.001d && i2 < 100) {
                                i2++;
                                double d22 = d15 * dLog;
                                double d23 = d16 * dLog;
                                double dExp = dLog - ((((Math.exp(d23) * d19) + (Math.exp(d22) * d20)) + d9) / ((Math.exp(d23) * d3) + (Math.exp(d22) * d21)));
                                dAbs2 = Math.abs(dLog - dExp);
                                dLog = dExp;
                            }
                        }
                    } else {
                        if (dLog3 > 0.0d) {
                            if ((-((Math.exp(dLog3 * d16) * d19) + (Math.exp(d15 * dLog3) * d20))) < d9) {
                                if (d19 > 0.0d && d20 < 0.0d) {
                                    dLog = 0.0d;
                                }
                                d9 = -d9;
                                d3 = d19 * d16;
                                if (Math.abs((Math.exp(d16 * dLog) * d3) + (Math.exp(d15 * dLog) * d21)) >= 1.0E-4d) {
                                }
                            }
                        }
                        dLog = Math.log((-((d19 * d16) * d16)) / (d21 * d15)) / d18;
                        d3 = d19 * d16;
                        if (Math.abs((Math.exp(d16 * dLog) * d3) + (Math.exp(d15 * dLog) * d21)) >= 1.0E-4d) {
                        }
                    }
                } else if (d < 1.0d) {
                    double d24 = (d7 - (d15 * dAbs)) / ydVar.b;
                    dLog = Math.log(d9 / Math.sqrt((d24 * d24) + (dAbs * dAbs))) / d15;
                } else {
                    double d25 = d15 * dAbs;
                    double d26 = d7 - d25;
                    double dLog4 = Math.log(Math.abs(d9 / dAbs)) / d15;
                    double dLog5 = Math.log(Math.abs(d9 / d26));
                    double dLog6 = dLog5;
                    for (int i3 = 0; i3 < 6; i3++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d15));
                    }
                    double d27 = dLog6 / d15;
                    if (Double.isInfinite(dLog4) || Double.isNaN(dLog4)) {
                        dLog4 = d27;
                    } else if (!Double.isInfinite(d27) && !Double.isNaN(d27)) {
                        dLog4 = Math.max(dLog4, d27);
                    }
                    double d28 = (-(d25 + d26)) / (d15 * d26);
                    double d29 = d15 * d28;
                    double dExp2 = (Math.exp(d29) * d26 * d28) + (Math.exp(d29) * dAbs);
                    if (Double.isNaN(d28) || d28 <= 0.0d) {
                        d9 = -d9;
                        i = 0;
                        while (dAbs2 > 0.001d && i < 100) {
                            i++;
                            double d30 = d15 * dLog4;
                            double dExp3 = dLog4 - (((Math.exp(d30) * ((d26 * dLog4) + dAbs)) + d9) / (Math.exp(d30) * (((((double) 1) + d30) * d26) + d25)));
                            dAbs2 = Math.abs(dLog4 - dExp3);
                            dLog4 = dExp3;
                        }
                        dLog = dLog4;
                    } else if (d28 <= 0.0d || (-dExp2) >= d9) {
                        dLog4 = (-(d2 / d15)) - (dAbs / d26);
                        i = 0;
                        while (dAbs2 > 0.001d) {
                            i++;
                            double d302 = d15 * dLog4;
                            double dExp32 = dLog4 - (((Math.exp(d302) * ((d26 * dLog4) + dAbs)) + d9) / (Math.exp(d302) * (((((double) 1) + d302) * d26) + d25)));
                            dAbs2 = Math.abs(dLog4 - dExp32);
                            dLog4 = dExp32;
                        }
                        dLog = dLog4;
                    } else {
                        if (d26 < 0.0d && dAbs > 0.0d) {
                            dLog4 = 0.0d;
                        }
                        d9 = -d9;
                        i = 0;
                        while (dAbs2 > 0.001d) {
                        }
                        dLog = dLog4;
                    }
                }
                j = (long) (dLog * 1000.0d);
            }
        }
        return j * 1000000;
    }

    @Override // defpackage.ur
    public final float e(float f, float f2, float f3) {
        return 0.0f;
    }
}

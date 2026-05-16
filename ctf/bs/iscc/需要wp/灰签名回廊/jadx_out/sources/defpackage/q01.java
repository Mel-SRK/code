package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q01 {
    public final p01 a;
    public final int b;
    public final mk[] c;
    public int d;
    public final float[] e;
    public final float[] f;
    public final float[] g;

    public q01() {
        int i;
        p01 p01Var = p01.d;
        this.a = p01Var;
        int iOrdinal = p01Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                wc.l();
                throw null;
            }
            i = 2;
        }
        this.b = i;
        this.c = new mk[20];
        this.e = new float[20];
        this.f = new float[20];
        this.g = new float[3];
    }

    public final void a(long j, float f) {
        int i = (this.d + 1) % 20;
        this.d = i;
        mk[] mkVarArr = this.c;
        mk mkVar = mkVarArr[i];
        if (mkVar != null) {
            mkVar.a = j;
            mkVar.b = f;
        } else {
            mk mkVar2 = new mk();
            mkVar2.a = j;
            mkVar2.b = f;
            mkVarArr[i] = mkVar2;
        }
    }

    public final float b(float f) {
        float[] fArr;
        float[] fArr2;
        float f2;
        p01 p01Var;
        int i;
        float fSignum;
        float f3 = f;
        float f4 = 0.0f;
        if (f3 <= 0.0f) {
            sy.b("maximumVelocity should be a positive value. You specified=" + f3);
        }
        int i2 = this.d;
        mk[] mkVarArr = this.c;
        mk mkVar = mkVarArr[i2];
        if (mkVar == null) {
            f2 = 0.0f;
        } else {
            int i3 = 0;
            mk mkVar2 = mkVar;
            while (true) {
                mk mkVar3 = mkVarArr[i2];
                p01 p01Var2 = this.a;
                fArr = this.e;
                fArr2 = this.f;
                if (mkVar3 == null) {
                    f2 = f4;
                    p01Var = p01Var2;
                    i = 1;
                    break;
                }
                long j = mkVar.a;
                f2 = f4;
                int i4 = i2;
                long j2 = mkVar3.a;
                float f5 = j - j2;
                i = 1;
                float fAbs = Math.abs(j2 - mkVar2.a);
                p01Var = p01Var2;
                mk mkVar4 = p01Var != p01.d ? mkVar : mkVar3;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = mkVar3.b;
                fArr2[i3] = -f5;
                if (i4 == 0) {
                    i4 = 20;
                }
                int i5 = i4 - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                mkVar2 = mkVar4;
                i2 = i5;
                f4 = f2;
            }
            if (i3 >= this.b) {
                int iOrdinal = p01Var.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.g;
                        wo0.k(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iOrdinal != i) {
                        wc.l();
                        return 0.0f;
                    }
                    int i6 = i3 - i;
                    float f6 = fArr2[i6];
                    int i7 = i6;
                    float fAbs2 = f2;
                    while (i7 > 0) {
                        int i8 = i7 - 1;
                        float f7 = fArr2[i8];
                        if (f6 != f7) {
                            float f8 = (fArr[i7] - fArr[i8]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i7 == i6) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i7--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f4 = fSignum * 1000;
            } else {
                f4 = f2;
            }
        }
        if (f4 == f2 || Float.isNaN(f4)) {
            return f2;
        }
        if (f4 <= f2) {
            f3 = -f3;
            if (f4 >= f3) {
                return f4;
            }
        } else if (f4 <= f3) {
            f3 = f4;
        }
        return f3;
    }
}

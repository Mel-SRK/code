package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qc {
    public static final long b = m10.c(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        m10.c(4282664004L);
        m10.c(4287137928L);
        m10.c(4291611852L);
        c = m10.c(4294967295L);
        d = m10.c(4294901760L);
        m10.c(4278255360L);
        e = m10.c(4278190335L);
        m10.c(4294967040L);
        m10.c(4278255615L);
        m10.c(4294902015L);
        f = m10.b(0);
        g = m10.a(0.0f, 0.0f, 0.0f, 0.0f, gd.u);
    }

    public /* synthetic */ qc(long j) {
        this.a = j;
    }

    public static final long a(long j, dd ddVar) {
        yg ygVarZ;
        dd ddVarF = f(j);
        int i = ddVarF.c;
        int i2 = ddVar.c;
        if ((i | i2) < 0) {
            ygVarZ = i60.z(ddVarF, ddVar);
        } else {
            e80 e80Var = zg.a;
            int i3 = i | (i2 << 6);
            Object objB = e80Var.b(i3);
            if (objB == null) {
                objB = i60.z(ddVarF, ddVar);
                e80Var.g(i3, objB);
            }
            ygVarZ = (yg) objB;
        }
        return ygVarZ.a(j);
    }

    public static long b(long j, float f2) {
        return m10.a(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final float d(long j) {
        float fL;
        float f2;
        if ((63 & j) == 0) {
            fL = (float) go0.l((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fL = (float) go0.l((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fL / f2;
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) go0.l((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - tr.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final dd f(long j) {
        float[] fArr = gd.a;
        return gd.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) go0.l((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - tr.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float h(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) go0.l((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - tr.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String i(long j) {
        return "Color(" + h(j) + ", " + g(j) + ", " + e(j) + ", " + d(j) + ", " + f(j).a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qc) {
            return this.a == ((qc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}

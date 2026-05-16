package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface em {
    default float ae(long j) {
        float fC;
        float fK;
        if (!rx0.a(qx0.b(j), 4294967296L)) {
            uy.b("Only Sp can convert to Px");
        }
        float[] fArr = eu.a;
        if (k() >= 1.03f) {
            du duVarA = eu.a(k());
            fC = qx0.c(j);
            if (duVarA != null) {
                return duVarA.b(fC);
            }
            fK = k();
        } else {
            fC = qx0.c(j);
            fK = k();
        }
        return fK * fC;
    }

    default int ai(float f) {
        float fX = x(f);
        if (Float.isInfinite(fX)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fX);
    }

    default long aq(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fX = x(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Float.floatToRawIntBits(x(Float.intBitsToFloat((int) (j & 4294967295L))))) & 4294967295L) | (Float.floatToRawIntBits(fX) << 32);
    }

    default float au(long j) {
        if (!rx0.a(qx0.b(j), 4294967296L)) {
            uy.b("Only Sp can convert to Px");
        }
        return x(ae(j));
    }

    float b();

    default long ba(float f) {
        return v(bg(f));
    }

    default float be(int i) {
        return i / b();
    }

    default float bg(float f) {
        return f / b();
    }

    float k();

    default long v(float f) {
        float[] fArr = eu.a;
        if (k() < 1.03f) {
            return bo0.o(4294967296L, f / k());
        }
        du duVarA = eu.a(k());
        return bo0.o(4294967296L, duVarA != null ? duVarA.a(f) : f / k());
    }

    default long w(long j) {
        if (j != 9205357640488583168L) {
            return i60.d(bg(Float.intBitsToFloat((int) (j >> 32))), bg(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float x(float f) {
        return b() * f;
    }
}

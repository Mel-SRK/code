package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qx0 {
    public static final rx0[] b = {new rx0(0), new rx0(4294967296L), new rx0(8589934592L)};
    public static final long c = bo0.o(0, Float.NaN);
    public final long a;

    public /* synthetic */ qx0(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long jB = b(j);
        if (rx0.a(jB, 0L)) {
            return "Unspecified";
        }
        if (rx0.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!rx0.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qx0) {
            return this.a == ((qx0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}

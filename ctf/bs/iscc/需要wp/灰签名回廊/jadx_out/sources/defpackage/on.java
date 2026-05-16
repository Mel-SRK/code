package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class on {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof on) {
            return this.a == ((on) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) mn.b(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) mn.b(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }
}

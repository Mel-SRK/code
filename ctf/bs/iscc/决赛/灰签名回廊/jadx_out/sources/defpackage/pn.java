package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pn {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof pn) {
            return this.a == ((pn) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) mn.b(Float.intBitsToFloat((int) (j >> 32)))) + " x " + ((Object) mn.b(Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}

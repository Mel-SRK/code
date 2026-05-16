package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mn implements Comparable {
    public final float d;

    public static final boolean a(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String b(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.d, ((mn) obj).d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mn) {
            return Float.compare(this.d, ((mn) obj).d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d);
    }

    public final String toString() {
        return b(this.d);
    }
}

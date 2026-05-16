package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ik0 {
    public final long a = qc.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ik0) {
            return qc.c(this.a, ((ik0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = qc.h;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) qc.i(this.a)) + ", rippleAlpha=null)";
    }
}

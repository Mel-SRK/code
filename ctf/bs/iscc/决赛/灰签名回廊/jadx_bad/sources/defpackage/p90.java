package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p90 extends f00 {
    public final j90 k;

    public p90(j90 j90Var) {
        j90Var.getClass();
        this.k = j90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p90.class == obj.getClass() && f00.h(this.k, ((p90) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.k + ", direction=-1)";
    }
}

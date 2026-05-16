package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vh0 {
    public static final vh0 b = new vh0(new hc());
    public final hc a;

    public vh0(hc hcVar) {
        this.a = hcVar;
        if (Float.isNaN(0.0f)) {
            wc.n("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vh0) && this.a.equals(((vh0) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() + (Float.hashCode(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.a + ", steps=0)";
    }
}

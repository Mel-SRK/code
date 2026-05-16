package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xh extends yh {
    public final long a;

    public xh(long j) {
        this.a = j;
        if (d41.ad(j)) {
            return;
        }
        wc.q("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xh)) {
            return false;
        }
        return xa0.b(this.a, ((xh) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) xa0.i(this.a)) + ')';
    }
}

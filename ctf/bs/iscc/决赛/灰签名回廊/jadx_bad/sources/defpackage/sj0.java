package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class sj0 implements Serializable {
    public final Throwable d;

    public sj0(Throwable th) {
        th.getClass();
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sj0) {
            return f00.h(this.d, ((sj0) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.d + ')';
    }
}

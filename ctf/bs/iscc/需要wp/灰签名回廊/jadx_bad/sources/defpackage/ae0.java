package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ae0 implements Serializable {
    public final Object d;
    public final Object e;

    public ae0(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae0)) {
            return false;
        }
        ae0 ae0Var = (ae0) obj;
        return f00.h(this.d, ae0Var.d) && f00.h(this.e, ae0Var.e);
    }

    public final int hashCode() {
        Object obj = this.d;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.e;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.d + ", " + this.e + ')';
    }
}

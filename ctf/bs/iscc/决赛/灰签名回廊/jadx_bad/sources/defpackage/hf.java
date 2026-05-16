package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hf {
    public final Integer a;

    public hf(jo0 jo0Var, Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hf) {
            return f00.h(null, null) && f00.h(this.a, ((hf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + ((Object) null) + ", groupOffset=" + this.a + ')';
    }
}

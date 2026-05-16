package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ob0 {
    public final String a;

    public ob0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob0) && this.a.equals(((ob0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.a + ')';
    }
}

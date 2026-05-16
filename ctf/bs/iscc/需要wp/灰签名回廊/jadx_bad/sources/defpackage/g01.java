package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g01 implements x5 {
    public final String a;

    public g01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g01) {
            return this.a.equals(((g01) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UrlAnnotation(url=" + this.a + ')';
    }
}

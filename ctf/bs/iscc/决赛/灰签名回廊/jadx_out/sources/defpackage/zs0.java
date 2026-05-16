package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zs0 implements x5 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof zs0) {
            return this.a.equals(((zs0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.a + ')';
    }
}

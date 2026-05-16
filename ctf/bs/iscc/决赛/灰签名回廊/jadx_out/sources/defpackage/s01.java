package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s01 implements x5 {
    public final String a;

    public s01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s01) {
            return this.a.equals(((s01) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.a + ')';
    }
}

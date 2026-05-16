package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ud0 implements rb {
    public final Class a;

    public ud0(Class cls) {
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ud0) {
            return this.a.equals(((ud0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}

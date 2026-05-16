package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ez {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof ez) {
            return this.a == ((ez) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}

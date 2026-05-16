package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof ug0) {
            return this.a == ((ug0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}

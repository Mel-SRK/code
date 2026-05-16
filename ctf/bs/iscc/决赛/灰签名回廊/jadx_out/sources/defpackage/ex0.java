package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ex0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof ex0) {
            return this.a == ((ex0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}

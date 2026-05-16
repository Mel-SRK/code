package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fx0 {
    public static final fx0 c = new fx0(2, false);
    public static final fx0 d = new fx0(1, true);
    public final int a;
    public final boolean b;

    public fx0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx0)) {
            return false;
        }
        fx0 fx0Var = (fx0) obj;
        return this.a == fx0Var.a && this.b == fx0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jy0 {
    public final b6 a;
    public final ab0 b;

    public jy0(b6 b6Var, ab0 ab0Var) {
        this.a = b6Var;
        this.b = ab0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy0)) {
            return false;
        }
        jy0 jy0Var = (jy0) obj;
        return f00.h(this.a, jy0Var.a) && this.b.equals(jy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}

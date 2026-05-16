package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l8 {
    public final float a;
    public final vr0 b;

    public l8(float f, vr0 vr0Var) {
        this.a = f;
        this.b = vr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        return mn.a(this.a, l8Var.a) && this.b.equals(l8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) mn.b(this.a)) + ", brush=" + this.b + ')';
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y5 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public y5(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        return f00.h(this.a, y5Var.a) && this.b == y5Var.b && this.c == y5Var.c && f00.h(this.d, y5Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + n5.c(this.c, n5.c(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }
}

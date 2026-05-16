package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a6 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public a6(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        ty.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        return f00.h(this.a, a6Var.a) && this.b == a6Var.b && this.c == a6Var.c && f00.h(this.d, a6Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + n5.c(this.c, n5.c(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }

    public a6(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}

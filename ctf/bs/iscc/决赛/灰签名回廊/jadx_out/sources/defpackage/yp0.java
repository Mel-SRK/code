package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yp0 {
    public static final yp0 d = new yp0();
    public final long a;
    public final long b;
    public final float c;

    public /* synthetic */ yp0() {
        this(0.0f, m10.c(4278190080L), 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp0)) {
            return false;
        }
        yp0 yp0Var = (yp0) obj;
        return qc.c(this.a, yp0Var.a) && xa0.b(this.b, yp0Var.b) && this.c == yp0Var.c;
    }

    public final int hashCode() {
        int i = qc.h;
        return Float.hashCode(this.c) + n5.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        n5.k(this.a, sb, ", offset=");
        sb.append((Object) xa0.i(this.b));
        sb.append(", blurRadius=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }

    public yp0(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }
}

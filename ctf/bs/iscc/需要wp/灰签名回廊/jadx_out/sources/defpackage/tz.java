package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tz {
    public static final tz e = new tz(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public tz(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz)) {
            return false;
        }
        tz tzVar = (tz) obj;
        return this.a == tzVar.a && this.b == tzVar.b && this.c == tzVar.c && this.d == tzVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + n5.c(this.c, n5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return n5.h(sb, this.d, ')');
    }
}

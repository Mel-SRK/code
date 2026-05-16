package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class iz {
    public static final iz e = new iz(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public iz(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static iz a(iz izVar, iz izVar2) {
        return c(Math.max(izVar.a, izVar2.a), Math.max(izVar.b, izVar2.b), Math.max(izVar.c, izVar2.c), Math.max(izVar.d, izVar2.d));
    }

    public static iz b(iz izVar, iz izVar2) {
        return c(Math.min(izVar.a, izVar2.a), Math.min(izVar.b, izVar2.b), Math.min(izVar.c, izVar2.c), Math.min(izVar.d, izVar2.d));
    }

    public static iz c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new iz(i, i2, i3, i4);
    }

    public static iz d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return ih.h(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iz.class != obj.getClass()) {
            return false;
        }
        iz izVar = (iz) obj;
        return this.d == izVar.d && this.a == izVar.a && this.c == izVar.c && this.b == izVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return n5.h(sb, this.d, '}');
    }
}

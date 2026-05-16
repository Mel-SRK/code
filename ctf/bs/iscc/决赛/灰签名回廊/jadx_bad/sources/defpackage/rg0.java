package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rg0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public rg0(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg0)) {
            return false;
        }
        rg0 rg0Var = (rg0) obj;
        return og0.a(this.a, rg0Var.a) && this.b == rg0Var.b && xa0.b(this.c, rg0Var.c) && xa0.b(this.d, rg0Var.d) && this.e == rg0Var.e && Float.compare(this.f, rg0Var.f) == 0 && this.g == rg0Var.g && this.h == rg0Var.h && this.i.equals(rg0Var.i) && xa0.b(this.j, rg0Var.j) && xa0.b(this.k, rg0Var.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + n5.d((this.i.hashCode() + n5.e(n5.c(this.g, n5.b(this.f, n5.e(n5.d(n5.d(n5.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) og0.b(this.a));
        sb.append(", uptime=");
        sb.append(this.b);
        sb.append(", positionOnScreen=");
        sb.append((Object) xa0.i(this.c));
        sb.append(", position=");
        sb.append((Object) xa0.i(this.d));
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        int i = this.g;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append((Object) xa0.i(this.j));
        sb.append(", originalEventPosition=");
        sb.append((Object) xa0.i(this.k));
        sb.append(')');
        return sb.toString();
    }
}

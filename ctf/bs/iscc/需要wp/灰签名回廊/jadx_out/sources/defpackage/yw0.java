package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yw0 {
    public final b6 a;
    public final nx0 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final em g;
    public final e20 h;
    public final qt i;
    public final long j;

    public yw0(b6 b6Var, nx0 nx0Var, List list, int i, boolean z, int i2, em emVar, e20 e20Var, qt qtVar, long j) {
        this.a = b6Var;
        this.b = nx0Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = emVar;
        this.h = e20Var;
        this.i = qtVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw0)) {
            return false;
        }
        yw0 yw0Var = (yw0) obj;
        return f00.h(this.a, yw0Var.a) && f00.h(this.b, yw0Var.b) && f00.h(this.c, yw0Var.c) && this.d == yw0Var.d && this.e == yw0Var.e && this.f == yw0Var.f && f00.h(this.g, yw0Var.g) && this.h == yw0Var.h && f00.h(this.i, yw0Var.i) && dh.b(this.j, yw0Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + n5.c(this.f, n5.e((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) dh.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pz0 {
    public final nx0 a;
    public final nx0 b;
    public final nx0 c;
    public final nx0 d;
    public final nx0 e;
    public final nx0 f;
    public final nx0 g;
    public final nx0 h;
    public final nx0 i;
    public final nx0 j;
    public final nx0 k;
    public final nx0 l;
    public final nx0 m;
    public final nx0 n;
    public final nx0 o;

    public pz0(nx0 nx0Var, int i) {
        nx0 nx0Var2 = rz0.d;
        nx0 nx0Var3 = rz0.e;
        nx0 nx0Var4 = rz0.f;
        nx0 nx0Var5 = rz0.g;
        nx0 nx0Var6 = rz0.h;
        nx0 nx0Var7 = rz0.i;
        nx0 nx0Var8 = rz0.m;
        nx0 nx0Var9 = rz0.n;
        nx0 nx0Var10 = rz0.o;
        nx0Var = (i & 512) != 0 ? rz0.a : nx0Var;
        nx0 nx0Var11 = rz0.b;
        nx0 nx0Var12 = rz0.c;
        nx0 nx0Var13 = rz0.j;
        nx0 nx0Var14 = rz0.k;
        nx0 nx0Var15 = rz0.l;
        this.a = nx0Var2;
        this.b = nx0Var3;
        this.c = nx0Var4;
        this.d = nx0Var5;
        this.e = nx0Var6;
        this.f = nx0Var7;
        this.g = nx0Var8;
        this.h = nx0Var9;
        this.i = nx0Var10;
        this.j = nx0Var;
        this.k = nx0Var11;
        this.l = nx0Var12;
        this.m = nx0Var13;
        this.n = nx0Var14;
        this.o = nx0Var15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz0)) {
            return false;
        }
        pz0 pz0Var = (pz0) obj;
        return f00.h(this.a, pz0Var.a) && f00.h(this.b, pz0Var.b) && f00.h(this.c, pz0Var.c) && f00.h(this.d, pz0Var.d) && f00.h(this.e, pz0Var.e) && f00.h(this.f, pz0Var.f) && f00.h(this.g, pz0Var.g) && f00.h(this.h, pz0Var.h) && f00.h(this.i, pz0Var.i) && f00.h(this.j, pz0Var.j) && f00.h(this.k, pz0Var.k) && f00.h(this.l, pz0Var.l) && f00.h(this.m, pz0Var.m) && f00.h(this.n, pz0Var.n) && f00.h(this.o, pz0Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.a + ", displayMedium=" + this.b + ",displaySmall=" + this.c + ", headlineLarge=" + this.d + ", headlineMedium=" + this.e + ", headlineSmall=" + this.f + ", titleLarge=" + this.g + ", titleMedium=" + this.h + ", titleSmall=" + this.i + ", bodyLarge=" + this.j + ", bodyMedium=" + this.k + ", bodySmall=" + this.l + ", labelLarge=" + this.m + ", labelMedium=" + this.n + ", labelSmall=" + this.o + ')';
    }
}

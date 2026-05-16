package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yr0 implements x5 {
    public final nw0 a;
    public final long b;
    public final iu c;
    public final gu d;
    public final hu e;
    public final fu0 f;
    public final String g;
    public final long h;
    public final t7 i;
    public final ow0 j;
    public final t40 k;
    public final long l;
    public final bv0 m;
    public final yp0 n;
    public final cg0 o;
    public final yo p;

    public yr0(long j, long j2, iu iuVar, gu guVar, hu huVar, fu0 fu0Var, String str, long j3, t7 t7Var, ow0 ow0Var, t40 t40Var, long j4, bv0 bv0Var, yp0 yp0Var, int i) {
        this((i & 1) != 0 ? qc.g : j, (i & 2) != 0 ? qx0.c : j2, (i & 4) != 0 ? null : iuVar, (i & 8) != 0 ? null : guVar, (i & 16) != 0 ? null : huVar, (i & 32) != 0 ? null : fu0Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? qx0.c : j3, (i & 256) != 0 ? null : t7Var, (i & 512) != 0 ? null : ow0Var, (i & 1024) != 0 ? null : t40Var, (i & 2048) != 0 ? qc.g : j4, (i & 4096) != 0 ? null : bv0Var, (i & 8192) != 0 ? null : yp0Var, (cg0) null);
    }

    public final boolean a(yr0 yr0Var) {
        if (this == yr0Var) {
            return true;
        }
        return qx0.a(this.b, yr0Var.b) && f00.h(this.c, yr0Var.c) && f00.h(this.d, yr0Var.d) && f00.h(this.e, yr0Var.e) && f00.h(this.f, yr0Var.f) && f00.h(this.g, yr0Var.g) && qx0.a(this.h, yr0Var.h) && f00.h(this.i, yr0Var.i) && f00.h(this.j, yr0Var.j) && f00.h(this.k, yr0Var.k) && qc.c(this.l, yr0Var.l) && f00.h(this.o, yr0Var.o);
    }

    public final boolean b(yr0 yr0Var) {
        return f00.h(this.a, yr0Var.a) && f00.h(this.m, yr0Var.m) && f00.h(this.n, yr0Var.n) && f00.h(this.p, yr0Var.p);
    }

    public final yr0 c(yr0 yr0Var) {
        if (yr0Var == null) {
            return this;
        }
        nw0 nw0Var = yr0Var.a;
        return zr0.a(this, nw0Var.b(), nw0Var.c(), nw0Var.a(), yr0Var.b, yr0Var.c, yr0Var.d, yr0Var.e, yr0Var.f, yr0Var.g, yr0Var.h, yr0Var.i, yr0Var.j, yr0Var.k, yr0Var.l, yr0Var.m, yr0Var.n, yr0Var.o, yr0Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr0)) {
            return false;
        }
        yr0 yr0Var = (yr0) obj;
        return a(yr0Var) && b(yr0Var);
    }

    public final int hashCode() {
        nw0 nw0Var = this.a;
        long jB = nw0Var.b();
        int i = qc.h;
        int iHashCode = Long.hashCode(jB) * 31;
        i9 i9VarC = nw0Var.c();
        int iHashCode2 = (Float.hashCode(nw0Var.a()) + ((iHashCode + (i9VarC != null ? i9VarC.hashCode() : 0)) * 31)) * 31;
        rx0[] rx0VarArr = qx0.b;
        int iD = n5.d(iHashCode2, 31, this.b);
        iu iuVar = this.c;
        int i2 = (iD + (iuVar != null ? iuVar.d : 0)) * 31;
        gu guVar = this.d;
        int iHashCode3 = (i2 + (guVar != null ? Integer.hashCode(guVar.a) : 0)) * 31;
        hu huVar = this.e;
        int iHashCode4 = (iHashCode3 + (huVar != null ? Integer.hashCode(huVar.a) : 0)) * 31;
        fu0 fu0Var = this.f;
        int iHashCode5 = (iHashCode4 + (fu0Var != null ? fu0Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iD2 = n5.d((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        t7 t7Var = this.i;
        int iHashCode6 = (iD2 + (t7Var != null ? Float.hashCode(t7Var.a) : 0)) * 31;
        ow0 ow0Var = this.j;
        int iHashCode7 = (iHashCode6 + (ow0Var != null ? ow0Var.hashCode() : 0)) * 31;
        t40 t40Var = this.k;
        int iD3 = n5.d((iHashCode7 + (t40Var != null ? t40Var.d.hashCode() : 0)) * 31, 31, this.l);
        bv0 bv0Var = this.m;
        int i3 = (iD3 + (bv0Var != null ? bv0Var.a : 0)) * 31;
        yp0 yp0Var = this.n;
        int iHashCode8 = (i3 + (yp0Var != null ? yp0Var.hashCode() : 0)) * 31;
        cg0 cg0Var = this.o;
        int iHashCode9 = (iHashCode8 + (cg0Var != null ? cg0Var.hashCode() : 0)) * 31;
        yo yoVar = this.p;
        return iHashCode9 + (yoVar != null ? yoVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        nw0 nw0Var = this.a;
        sb.append((Object) qc.i(nw0Var.b()));
        sb.append(", brush=");
        sb.append(nw0Var.c());
        sb.append(", alpha=");
        sb.append(nw0Var.a());
        sb.append(", fontSize=");
        sb.append((Object) qx0.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) qx0.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        n5.k(this.l, sb, ", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public yr0(nw0 nw0Var, long j, iu iuVar, gu guVar, hu huVar, fu0 fu0Var, String str, long j2, t7 t7Var, ow0 ow0Var, t40 t40Var, long j3, bv0 bv0Var, yp0 yp0Var, cg0 cg0Var, yo yoVar) {
        this.a = nw0Var;
        this.b = j;
        this.c = iuVar;
        this.d = guVar;
        this.e = huVar;
        this.f = fu0Var;
        this.g = str;
        this.h = j2;
        this.i = t7Var;
        this.j = ow0Var;
        this.k = t40Var;
        this.l = j3;
        this.m = bv0Var;
        this.n = yp0Var;
        this.o = cg0Var;
        this.p = yoVar;
    }

    public yr0(long j, long j2, iu iuVar, gu guVar, hu huVar, fu0 fu0Var, String str, long j3, t7 t7Var, ow0 ow0Var, t40 t40Var, long j4, bv0 bv0Var, yp0 yp0Var, cg0 cg0Var) {
        this(j != 16 ? new hd(j) : mw0.a, j2, iuVar, guVar, huVar, fu0Var, str, j3, t7Var, ow0Var, t40Var, j4, bv0Var, yp0Var, cg0Var, null);
    }
}

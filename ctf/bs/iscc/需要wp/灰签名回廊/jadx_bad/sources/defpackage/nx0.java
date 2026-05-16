package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nx0 {
    public static final nx0 d = new nx0(0, 0, null, 0, 0, 0, 16777215);
    public final yr0 a;
    public final ge0 b;
    public final hg0 c;

    public nx0(long j, long j2, iu iuVar, long j3, int i, long j4, int i2) {
        this(new yr0((i2 & 1) != 0 ? qc.g : j, (i2 & 2) != 0 ? qx0.c : j2, (i2 & 4) != 0 ? null : iuVar, (gu) null, (hu) null, (i2 & 32) != 0 ? null : fu0.a, (String) null, (i2 & 128) != 0 ? qx0.c : j3, (t7) null, (ow0) null, (t40) null, qc.g, (bv0) null, (yp0) null, (cg0) null), new ge0((32768 & i2) != 0 ? Integer.MIN_VALUE : i, Integer.MIN_VALUE, (i2 & 131072) != 0 ? qx0.c : j4, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    public static nx0 a(nx0 nx0Var, long j, long j2, iu iuVar, fu0 fu0Var, long j3, long j4, e40 e40Var, int i) {
        t7 t7Var;
        ow0 ow0Var;
        long j5;
        hg0 hg0Var = m10.b;
        long jB = (i & 1) != 0 ? nx0Var.a.a.b() : j;
        long j6 = (i & 2) != 0 ? nx0Var.a.b : j2;
        iu iuVar2 = (i & 4) != 0 ? nx0Var.a.c : iuVar;
        yr0 yr0Var = nx0Var.a;
        gu guVar = yr0Var.d;
        hu huVar = yr0Var.e;
        fu0 fu0Var2 = (i & 32) != 0 ? yr0Var.f : fu0Var;
        String str = yr0Var.g;
        long j7 = (i & 128) != 0 ? yr0Var.h : j3;
        t7 t7Var2 = yr0Var.i;
        ow0 ow0Var2 = yr0Var.j;
        t40 t40Var = yr0Var.k;
        long j8 = yr0Var.l;
        bv0 bv0Var = yr0Var.m;
        yp0 yp0Var = yr0Var.n;
        yo yoVar = yr0Var.p;
        ge0 ge0Var = nx0Var.b;
        int i2 = ge0Var.a;
        int i3 = ge0Var.b;
        if ((i & 131072) != 0) {
            t7Var = t7Var2;
            ow0Var = ow0Var2;
            j5 = ge0Var.c;
        } else {
            t7Var = t7Var2;
            ow0Var = ow0Var2;
            j5 = j4;
        }
        pw0 pw0Var = ge0Var.d;
        hg0 hg0Var2 = (i & 524288) != 0 ? nx0Var.c : hg0Var;
        return new nx0(new yr0(qc.c(jB, yr0Var.a.b()) ? yr0Var.a : jB != 16 ? new hd(jB) : mw0.a, j6, iuVar2, guVar, huVar, fu0Var2, str, j7, t7Var, ow0Var, t40Var, j8, bv0Var, yp0Var, hg0Var2 != null ? hg0Var2.a : null, yoVar), new ge0(i2, i3, j5, pw0Var, hg0Var2 != null ? hg0Var2.b : null, (i & 1048576) != 0 ? ge0Var.f : e40Var, ge0Var.g, ge0Var.h, ge0Var.i), hg0Var2);
    }

    public static nx0 e(nx0 nx0Var, long j, long j2, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? qx0.c : j2;
        long j6 = (i2 & 128) != 0 ? qx0.c : j3;
        long j7 = qc.g;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        long j8 = (i2 & 131072) != 0 ? qx0.c : j4;
        yr0 yr0VarA = zr0.a(nx0Var.a, j, null, Float.NaN, j5, null, null, null, null, null, j6, null, null, null, j7, null, null, null, null);
        ge0 ge0VarA = he0.a(nx0Var.b, i3, Integer.MIN_VALUE, j8, null, null, null, 0, Integer.MIN_VALUE, null);
        return (nx0Var.a == yr0VarA && nx0Var.b == ge0VarA) ? nx0Var : new nx0(yr0VarA, ge0VarA);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final boolean c(nx0 nx0Var) {
        if (this != nx0Var) {
            return f00.h(this.b, nx0Var.b) && this.a.a(nx0Var.a);
        }
        return true;
    }

    public final nx0 d(nx0 nx0Var) {
        return (nx0Var == null || nx0Var.equals(d)) ? this : new nx0(this.a.c(nx0Var.a), this.b.a(nx0Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx0)) {
            return false;
        }
        nx0 nx0Var = (nx0) obj;
        return f00.h(this.a, nx0Var.a) && f00.h(this.b, nx0Var.b) && f00.h(this.c, nx0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        hg0 hg0Var = this.c;
        return iHashCode + (hg0Var != null ? hg0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) qc.i(b()));
        sb.append(", brush=");
        yr0 yr0Var = this.a;
        sb.append(yr0Var.a.c());
        sb.append(", alpha=");
        sb.append(yr0Var.a.a());
        sb.append(", fontSize=");
        sb.append((Object) qx0.d(yr0Var.b));
        sb.append(", fontWeight=");
        sb.append(yr0Var.c);
        sb.append(", fontStyle=");
        sb.append(yr0Var.d);
        sb.append(", fontSynthesis=");
        sb.append(yr0Var.e);
        sb.append(", fontFamily=");
        sb.append(yr0Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(yr0Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) qx0.d(yr0Var.h));
        sb.append(", baselineShift=");
        sb.append(yr0Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(yr0Var.j);
        sb.append(", localeList=");
        sb.append(yr0Var.k);
        sb.append(", background=");
        n5.k(yr0Var.l, sb, ", textDecoration=");
        sb.append(yr0Var.m);
        sb.append(", shadow=");
        sb.append(yr0Var.n);
        sb.append(", drawStyle=");
        sb.append(yr0Var.p);
        sb.append(", textAlign=");
        ge0 ge0Var = this.b;
        sb.append((Object) yu0.a(ge0Var.a));
        sb.append(", textDirection=");
        sb.append((Object) ev0.a(ge0Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) qx0.d(ge0Var.c));
        sb.append(", textIndent=");
        sb.append(ge0Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(ge0Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) z30.a(ge0Var.g));
        sb.append(", hyphens=");
        sb.append((Object) yx.a(ge0Var.h));
        sb.append(", textMotion=");
        sb.append(ge0Var.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nx0(yr0 yr0Var, ge0 ge0Var) {
        cg0 cg0Var = yr0Var.o;
        xf0 xf0Var = ge0Var.e;
        this(yr0Var, ge0Var, (cg0Var == null && xf0Var == null) ? null : new hg0(cg0Var, xf0Var));
    }

    public nx0(yr0 yr0Var, ge0 ge0Var, hg0 hg0Var) {
        this.a = yr0Var;
        this.b = ge0Var;
        this.c = hg0Var;
    }
}

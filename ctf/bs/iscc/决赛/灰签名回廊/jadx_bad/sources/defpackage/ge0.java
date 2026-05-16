package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ge0 implements x5 {
    public final int a;
    public final int b;
    public final long c;
    public final pw0 d;
    public final xf0 e;
    public final e40 f;
    public final int g;
    public final int h;
    public final fx0 i;

    public ge0(int i, int i2, long j, pw0 pw0Var, xf0 xf0Var, e40 e40Var, int i3, int i4, fx0 fx0Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = pw0Var;
        this.e = xf0Var;
        this.f = e40Var;
        this.g = i3;
        this.h = i4;
        this.i = fx0Var;
        if (qx0.a(j, qx0.c) || qx0.c(j) >= 0.0f) {
            return;
        }
        ty.b("lineHeight can't be negative (" + qx0.c(j) + ')');
    }

    public final ge0 a(ge0 ge0Var) {
        return ge0Var == null ? this : he0.a(this, ge0Var.a, ge0Var.b, ge0Var.c, ge0Var.d, ge0Var.e, ge0Var.f, ge0Var.g, ge0Var.h, ge0Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge0)) {
            return false;
        }
        ge0 ge0Var = (ge0) obj;
        return this.a == ge0Var.a && this.b == ge0Var.b && qx0.a(this.c, ge0Var.c) && f00.h(this.d, ge0Var.d) && f00.h(this.e, ge0Var.e) && f00.h(this.f, ge0Var.f) && this.g == ge0Var.g && this.h == ge0Var.h && f00.h(this.i, ge0Var.i);
    }

    public final int hashCode() {
        int iC = n5.c(this.b, Integer.hashCode(this.a) * 31, 31);
        rx0[] rx0VarArr = qx0.b;
        int iD = n5.d(iC, 31, this.c);
        pw0 pw0Var = this.d;
        int iHashCode = (iD + (pw0Var != null ? pw0Var.hashCode() : 0)) * 31;
        xf0 xf0Var = this.e;
        int iHashCode2 = (iHashCode + (xf0Var != null ? xf0Var.hashCode() : 0)) * 31;
        e40 e40Var = this.f;
        int iC2 = n5.c(this.h, n5.c(this.g, (iHashCode2 + (e40Var != null ? e40Var.hashCode() : 0)) * 31, 31), 31);
        fx0 fx0Var = this.i;
        return iC2 + (fx0Var != null ? fx0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) yu0.a(this.a)) + ", textDirection=" + ((Object) ev0.a(this.b)) + ", lineHeight=" + ((Object) qx0.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) z30.a(this.g)) + ", hyphens=" + ((Object) yx.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}

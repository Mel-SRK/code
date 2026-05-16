package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x01 implements j20 {
    public final zv0 a;
    public final int b;
    public final jy0 c;
    public final pu d;

    public x01(zv0 zv0Var, int i, jy0 jy0Var, pu puVar) {
        this.a = zv0Var;
        this.b = i;
        this.c = jy0Var;
        this.d = puVar;
    }

    @Override // defpackage.j20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        lf0 lf0VarE = k60Var.e(dh.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(lf0VarE.e, dh.g(j));
        return r60Var.av(lf0VarE.d, iMin, sq.d, new ux(r60Var, this, lf0VarE, iMin, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x01)) {
            return false;
        }
        x01 x01Var = (x01) obj;
        return f00.h(this.a, x01Var.a) && this.b == x01Var.b && this.c.equals(x01Var.c) && f00.h(this.d, x01Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + n5.c(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}

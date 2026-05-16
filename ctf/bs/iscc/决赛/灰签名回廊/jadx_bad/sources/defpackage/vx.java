package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vx implements j20 {
    public final zv0 a;
    public final int b;
    public final jy0 c;
    public final pu d;

    public vx(zv0 zv0Var, int i, jy0 jy0Var, pu puVar) {
        this.a = zv0Var;
        this.b = i;
        this.c = jy0Var;
        this.d = puVar;
    }

    @Override // defpackage.j20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        long j2;
        if (k60Var.aw(dh.g(j)) < dh.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = dh.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        lf0 lf0VarE = k60Var.e(j);
        int iMin = Math.min(lf0VarE.d, dh.h(j2));
        return r60Var.av(iMin, lf0VarE.e, sq.d, new ux(r60Var, this, lf0VarE, iMin, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx)) {
            return false;
        }
        vx vxVar = (vx) obj;
        return f00.h(this.a, vxVar.a) && this.b == vxVar.b && this.c.equals(vxVar.c) && f00.h(this.d, vxVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + n5.c(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}

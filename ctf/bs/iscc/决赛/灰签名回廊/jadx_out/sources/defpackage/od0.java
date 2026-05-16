package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class od0 {
    public final long a;
    public final wd0 b;

    public od0() {
        long jC = m10.c(4284900966L);
        float f = 0;
        wd0 wd0Var = new wd0(f, f, f, f);
        this.a = jC;
        this.b = wd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!od0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        od0 od0Var = (od0) obj;
        return qc.c(this.a, od0Var.a) && f00.h(this.b, od0Var.b);
    }

    public final int hashCode() {
        int i = qc.h;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        n5.k(this.a, sb, ", drawPadding=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}

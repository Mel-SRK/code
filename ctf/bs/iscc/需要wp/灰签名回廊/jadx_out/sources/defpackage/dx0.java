package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dx0 {
    public final yr0 a;
    public final yr0 b;
    public final yr0 c;
    public final yr0 d;

    public dx0(yr0 yr0Var, yr0 yr0Var2, yr0 yr0Var3, yr0 yr0Var4) {
        this.a = yr0Var;
        this.b = yr0Var2;
        this.c = yr0Var3;
        this.d = yr0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dx0)) {
            return false;
        }
        dx0 dx0Var = (dx0) obj;
        return f00.h(this.a, dx0Var.a) && f00.h(this.b, dx0Var.b) && f00.h(this.c, dx0Var.c) && f00.h(this.d, dx0Var.d);
    }

    public final int hashCode() {
        yr0 yr0Var = this.a;
        int iHashCode = (yr0Var != null ? yr0Var.hashCode() : 0) * 31;
        yr0 yr0Var2 = this.b;
        int iHashCode2 = (iHashCode + (yr0Var2 != null ? yr0Var2.hashCode() : 0)) * 31;
        yr0 yr0Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (yr0Var3 != null ? yr0Var3.hashCode() : 0)) * 31;
        yr0 yr0Var4 = this.d;
        return iHashCode3 + (yr0Var4 != null ? yr0Var4.hashCode() : 0);
    }
}

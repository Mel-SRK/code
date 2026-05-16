package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i40 extends k40 {
    public final String a;
    public final dx0 b;

    public i40(String str, dx0 dx0Var) {
        this.a = str;
        this.b = dx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i40)) {
            return false;
        }
        i40 i40Var = (i40) obj;
        return this.a.equals(i40Var.a) && f00.h(this.b, i40Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dx0 dx0Var = this.b;
        return (iHashCode + (dx0Var != null ? dx0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.a + ')';
    }
}

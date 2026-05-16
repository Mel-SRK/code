package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cl0 {
    public float a;
    public boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl0)) {
            return false;
        }
        cl0 cl0Var = (cl0) obj;
        return Float.compare(this.a, cl0Var.a) == 0 && this.b == cl0Var.b;
    }

    public final int hashCode() {
        return n5.e(Float.hashCode(this.a) * 31, 961, this.b);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}

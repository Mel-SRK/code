package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f20 {
    public final int a;
    public final int b;
    public final boolean c;

    public f20(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f20)) {
            return false;
        }
        f20 f20Var = (f20) obj;
        return this.a == f20Var.a && this.b == f20Var.b && this.c == f20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + n5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
    }
}

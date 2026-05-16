package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class de0 {
    public final s3 a;
    public final int b;
    public final int c;

    public de0(s3 s3Var, int i, int i2) {
        this.a = s3Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de0)) {
            return false;
        }
        de0 de0Var = (de0) obj;
        return this.a.equals(de0Var.a) && this.b == de0Var.b && this.c == de0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + n5.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return n5.h(sb, this.c, ')');
    }
}

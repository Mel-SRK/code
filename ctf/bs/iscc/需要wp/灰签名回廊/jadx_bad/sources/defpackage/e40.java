package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e40 {
    public static final e40 c = new e40(b40.c, 17);
    public final float a;
    public final int b;

    public e40(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e40)) {
            return false;
        }
        e40 e40Var = (e40) obj;
        float f = e40Var.a;
        float f2 = b40.b;
        return Float.compare(this.a, f) == 0 && this.b == e40Var.b;
    }

    public final int hashCode() {
        float f = b40.b;
        return Integer.hashCode(0) + n5.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) b40.b(this.a));
        sb.append(", trim=");
        int i = this.b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ce0 {
    public final o3 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public ce0(o3 o3Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = o3Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final ri0 a(ri0 ri0Var) {
        return ri0Var.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = hx0.b;
            if (hx0.a(j, j2)) {
                return j2;
            }
        }
        int i = hx0.c;
        int i2 = (int) (j >> 32);
        int i3 = this.b;
        return wo0.b(i2 + i3, ((int) (j & 4294967295L)) + i3);
    }

    public final ri0 c(ri0 ri0Var) {
        float f = -this.f;
        return ri0Var.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i60.t(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce0)) {
            return false;
        }
        ce0 ce0Var = (ce0) obj;
        return this.a.equals(ce0Var.a) && this.b == ce0Var.b && this.c == ce0Var.c && this.d == ce0Var.d && this.e == ce0Var.e && Float.compare(this.f, ce0Var.f) == 0 && Float.compare(this.g, ce0Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + n5.b(this.f, n5.c(this.e, n5.c(this.d, n5.c(this.c, n5.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ')';
    }
}

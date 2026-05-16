package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ri0 {
    public static final ri0 e = new ri0(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ri0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final long a() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long b() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final ri0 c(ri0 ri0Var) {
        return new ri0(Math.max(this.a, ri0Var.a), Math.max(this.b, ri0Var.b), Math.min(this.c, ri0Var.c), Math.min(this.d, ri0Var.d));
    }

    public final boolean d() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean e(ri0 ri0Var) {
        return (this.a < ri0Var.c) & (ri0Var.a < this.c) & (this.b < ri0Var.d) & (ri0Var.b < this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri0)) {
            return false;
        }
        ri0 ri0Var = (ri0) obj;
        return Float.compare(this.a, ri0Var.a) == 0 && Float.compare(this.b, ri0Var.b) == 0 && Float.compare(this.c, ri0Var.c) == 0 && Float.compare(this.d, ri0Var.d) == 0;
    }

    public final ri0 f(float f, float f2) {
        return new ri0(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final ri0 g(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new ri0(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + n5.b(this.c, n5.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + m10.aw(this.a) + ", " + m10.aw(this.b) + ", " + m10.aw(this.c) + ", " + m10.aw(this.d) + ')';
    }
}

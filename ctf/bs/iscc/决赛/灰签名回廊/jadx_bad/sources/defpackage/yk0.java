package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yk0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        d41.i(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public yk0(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk0)) {
            return false;
        }
        yk0 yk0Var = (yk0) obj;
        return Float.compare(this.a, yk0Var.a) == 0 && Float.compare(this.b, yk0Var.b) == 0 && Float.compare(this.c, yk0Var.c) == 0 && Float.compare(this.d, yk0Var.d) == 0 && d41.v(this.e, yk0Var.e) && d41.v(this.f, yk0Var.f) && d41.v(this.g, yk0Var.g) && d41.v(this.h, yk0Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + n5.d(n5.d(n5.d(n5.b(this.d, n5.b(this.c, n5.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = m10.aw(this.a) + ", " + m10.aw(this.b) + ", " + m10.aw(this.c) + ", " + m10.aw(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zV = d41.v(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zV || !d41.v(j2, j3) || !d41.v(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) d41.aq(j)) + ", topRight=" + ((Object) d41.aq(j2)) + ", bottomRight=" + ((Object) d41.aq(j3)) + ", bottomLeft=" + ((Object) d41.aq(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + m10.aw(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + m10.aw(Float.intBitsToFloat(i)) + ", y=" + m10.aw(Float.intBitsToFloat(i2)) + ')';
    }
}

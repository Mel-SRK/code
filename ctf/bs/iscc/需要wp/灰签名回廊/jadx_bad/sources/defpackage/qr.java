package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qr {
    public final float a;
    public final float b;
    public final long c;

    public qr(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr)) {
            return false;
        }
        qr qrVar = (qr) obj;
        return Float.compare(this.a, qrVar.a) == 0 && Float.compare(this.b, qrVar.b) == 0 && this.c == qrVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + n5.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}

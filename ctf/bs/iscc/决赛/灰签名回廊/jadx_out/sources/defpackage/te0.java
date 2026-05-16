package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class te0 implements mj {
    public final float a;

    public te0(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            wc.n("The percent should be in the range of [0, 100]");
            throw null;
        }
    }

    @Override // defpackage.mj
    public final float a(long j, em emVar) {
        return (this.a / 100.0f) * pq0.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te0) && Float.compare(this.a, ((te0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}

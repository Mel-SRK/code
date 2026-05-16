package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nn implements mj {
    public final float a;

    public nn(float f) {
        this.a = f;
    }

    @Override // defpackage.mj
    public final float a(long j, em emVar) {
        return emVar.x(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nn) && mn.a(this.a, ((nn) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}

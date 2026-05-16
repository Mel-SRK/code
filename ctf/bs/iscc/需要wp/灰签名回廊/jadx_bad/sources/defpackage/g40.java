package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g40 implements du {
    public final float a;

    public g40(float f) {
        this.a = f;
    }

    @Override // defpackage.du
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.du
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g40) && Float.compare(this.a, ((g40) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ')';
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a8 {
    public final float a;

    public a8(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8) && Float.compare(this.a, ((a8) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Vertical(bias=" + this.a + ')';
    }
}

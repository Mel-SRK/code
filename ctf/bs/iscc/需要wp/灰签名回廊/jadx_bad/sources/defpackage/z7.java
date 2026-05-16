package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z7 {
    public final float a;

    public z7(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7) && Float.compare(this.a, ((z7) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ')';
    }
}

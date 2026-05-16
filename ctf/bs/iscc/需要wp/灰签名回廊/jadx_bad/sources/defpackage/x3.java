package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x3 implements mg0 {
    public final int b;

    public x3(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((x3) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return n5.h(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}

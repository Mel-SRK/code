package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dm {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dm) && this.a == ((dm) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return n5.h(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z2 implements ag0 {
    public final int d;

    public z2(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z2) && this.d == ((z2) obj).d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }

    public final String toString() {
        return n5.h(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.d, ')');
    }
}

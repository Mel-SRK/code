package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hd implements nw0 {
    public final long a;

    public hd(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        ty.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.nw0
    public final float a() {
        return qc.d(this.a);
    }

    @Override // defpackage.nw0
    public final long b() {
        return this.a;
    }

    @Override // defpackage.nw0
    public final i9 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd) && qc.c(this.a, ((hd) obj).a);
    }

    public final int hashCode() {
        int i = qc.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) qc.i(this.a)) + ')';
    }
}

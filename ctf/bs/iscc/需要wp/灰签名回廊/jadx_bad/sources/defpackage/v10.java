package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v10 {
    public final Float a;
    public final ep b;

    public v10(Float f, ep epVar) {
        this.a = f;
        this.b = epVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v10)) {
            return false;
        }
        v10 v10Var = (v10) obj;
        return v10Var.a.equals(this.a) && f00.h(v10Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + n5.c(0, this.a.hashCode() * 31, 31);
    }
}

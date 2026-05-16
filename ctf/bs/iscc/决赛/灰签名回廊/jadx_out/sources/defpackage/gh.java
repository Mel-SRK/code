package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gh {
    public final int a;
    public final long b;
    public final hh c;
    public final n01 d;

    public gh(int i, long j, hh hhVar, n01 n01Var) {
        this.a = i;
        this.b = j;
        this.c = hhVar;
        this.d = n01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh)) {
            return false;
        }
        gh ghVar = (gh) obj;
        return this.a == ghVar.a && this.b == ghVar.b && this.c == ghVar.c && f00.h(this.d, ghVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + n5.d(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        n01 n01Var = this.d;
        return iHashCode + (n01Var == null ? 0 : n01Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}

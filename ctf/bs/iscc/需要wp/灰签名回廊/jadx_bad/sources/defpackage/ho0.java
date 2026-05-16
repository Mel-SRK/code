package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ho0 {
    public final vw a;
    public final long b;
    public final int c;
    public final boolean d;

    public ho0(vw vwVar, long j, int i, boolean z) {
        this.a = vwVar;
        this.b = j;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho0)) {
            return false;
        }
        ho0 ho0Var = (ho0) obj;
        return this.a == ho0Var.a && xa0.b(this.b, ho0Var.b) && this.c == ho0Var.c && this.d == ho0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((n5.n(this.c) + n5.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) xa0.i(this.b));
        sb.append(", anchor=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "Right" : "Middle" : "Left");
        sb.append(", visible=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}

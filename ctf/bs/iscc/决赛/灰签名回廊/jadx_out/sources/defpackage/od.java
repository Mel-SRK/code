package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class od implements j70 {
    public final j70 a;
    public final j70 b;

    public od(j70 j70Var, j70 j70Var2) {
        this.a = j70Var;
        this.b = j70Var2;
    }

    @Override // defpackage.j70
    public final Object a(gv gvVar, Object obj) {
        return this.b.a(gvVar, this.a.a(gvVar, obj));
    }

    @Override // defpackage.j70
    public final boolean b(cv cvVar) {
        return this.a.b(cvVar) && this.b.b(cvVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        return this.a.equals(odVar.a) && f00.h(this.b, odVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) a(w6.g, "")) + ']';
    }
}

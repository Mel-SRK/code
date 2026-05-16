package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qa {
    public em a;
    public e20 b;
    public oa c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        return f00.h(this.a, qaVar.a) && this.b == qaVar.b && f00.h(this.c, qaVar.c) && pq0.a(this.d, qaVar.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) pq0.f(this.d)) + ')';
    }
}

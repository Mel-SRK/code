package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g8 {
    public c3 a = null;
    public e0 b = null;
    public ra c = null;
    public t3 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8)) {
            return false;
        }
        g8 g8Var = (g8) obj;
        return f00.h(this.a, g8Var.a) && f00.h(this.b, g8Var.b) && f00.h(this.c, g8Var.c) && f00.h(this.d, g8Var.d);
    }

    public final int hashCode() {
        c3 c3Var = this.a;
        int iHashCode = (c3Var == null ? 0 : c3Var.hashCode()) * 31;
        e0 e0Var = this.b;
        int iHashCode2 = (iHashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        ra raVar = this.c;
        int iHashCode3 = (iHashCode2 + (raVar == null ? 0 : raVar.hashCode())) * 31;
        t3 t3Var = this.d;
        return iHashCode3 + (t3Var != null ? t3Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}

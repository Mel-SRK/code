package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kh {
    public final v8 a;
    public final la b;

    public kh(v8 v8Var, la laVar) {
        this.a = v8Var;
        this.b = laVar;
    }

    public final String toString() {
        la laVar = this.b;
        if (laVar.h.k(tj.e) != null) {
            wc.c();
            return null;
        }
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        az0.s(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append("(currentBounds()=");
        sb.append(this.a.a());
        sb.append(", continuation=");
        sb.append(laVar);
        sb.append(')');
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mz0 {
    public final fu0 a;
    public final iu b;
    public final int c;
    public final int d;
    public final Object e;

    public mz0(fu0 fu0Var, iu iuVar, int i, int i2, Object obj) {
        this.a = fu0Var;
        this.b = iuVar;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz0)) {
            return false;
        }
        mz0 mz0Var = (mz0) obj;
        return f00.h(this.a, mz0Var.a) && f00.h(this.b, mz0Var.b) && this.c == mz0Var.c && this.d == mz0Var.d && f00.h(this.e, mz0Var.e);
    }

    public final int hashCode() {
        fu0 fu0Var = this.a;
        int iC = n5.c(this.d, n5.c(this.c, (((fu0Var == null ? 0 : fu0Var.hashCode()) * 31) + this.b.d) * 31, 31), 31);
        Object obj = this.e;
        return iC + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}

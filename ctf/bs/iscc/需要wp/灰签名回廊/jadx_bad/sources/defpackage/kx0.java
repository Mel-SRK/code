package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kx0 {
    public final String a;
    public String b;
    public boolean c = false;
    public fe0 d = null;

    public kx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx0)) {
            return false;
        }
        kx0 kx0Var = (kx0) obj;
        return f00.h(this.a, kx0Var.a) && f00.h(this.b, kx0Var.b) && this.c == kx0Var.c && f00.h(this.d, kx0Var.d);
    }

    public final int hashCode() {
        int iE = n5.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        fe0 fe0Var = this.d;
        return iE + (fe0Var == null ? 0 : fe0Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ')';
    }
}

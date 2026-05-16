package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ch0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ch0(boolean z, tn0 tn0Var, boolean z2) {
        qg qgVar = g4.a;
        int i = !z ? 262152 : 262144;
        i = tn0Var == tn0.e ? i | 8192 : i;
        i = z2 ? i : i | 512;
        boolean z3 = tn0Var == tn0.d;
        this.a = i;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch0)) {
            return false;
        }
        ch0 ch0Var = (ch0) obj;
        return this.a == ch0Var.a && this.b == ch0Var.b && this.c == ch0Var.c && this.d == ch0Var.d && this.e == ch0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + n5.e(n5.e(n5.e(n5.e(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}

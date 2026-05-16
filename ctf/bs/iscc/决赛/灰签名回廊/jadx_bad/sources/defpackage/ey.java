package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ey {
    public static final ey g = new ey(false, 0, true, 1, 1, t40.f);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final t40 f;

    public ey(boolean z, int i, boolean z2, int i2, int i3, t40 t40Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = t40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey)) {
            return false;
        }
        ey eyVar = (ey) obj;
        return this.a == eyVar.a && this.b == eyVar.b && this.c == eyVar.c && this.d == eyVar.d && this.e == eyVar.e && f00.h(this.f, eyVar.f);
    }

    public final int hashCode() {
        return this.f.d.hashCode() + n5.c(this.e, n5.c(this.d, n5.e(n5.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) f00.ai(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) u10.a(this.d)) + ", imeAction=" + ((Object) dy.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}

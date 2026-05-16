package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pp {
    public final oe0 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public pp(b6 b6Var, long j) {
        String str = b6Var.e;
        oe0 oe0Var = new oe0();
        oe0Var.d = str;
        oe0Var.b = -1;
        oe0Var.c = -1;
        this.a = oe0Var;
        this.b = hx0.e(j);
        this.c = hx0.d(j);
        this.d = -1;
        this.e = -1;
        int iE = hx0.e(j);
        int iD = hx0.d(j);
        if (iE < 0 || iE > str.length()) {
            wc.e(iE, str.length(), "start (");
            throw null;
        }
        if (iD < 0 || iD > str.length()) {
            wc.e(iD, str.length(), "end (");
            throw null;
        }
        if (iE <= iD) {
            return;
        }
        wc.n(n5.g("Do not set reversed range: ", iE, " > ", iD));
        throw null;
    }

    public final void a(int i, int i2) {
        long jB = wo0.b(i, i2);
        this.a.k(i, i2, "");
        long jAl = f00.al(wo0.b(this.b, this.c), jB);
        h(hx0.e(jAl));
        g(hx0.d(jAl));
        int i3 = this.d;
        if (i3 != -1) {
            long jAl2 = f00.al(wo0.b(i3, this.e), jB);
            if (hx0.b(jAl2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = hx0.e(jAl2);
                this.e = hx0.d(jAl2);
            }
        }
    }

    public final char b(int i) {
        oe0 oe0Var = this.a;
        tv tvVar = (tv) oe0Var.e;
        if (tvVar == null) {
            return ((String) oe0Var.d).charAt(i);
        }
        if (i < oe0Var.b) {
            return ((String) oe0Var.d).charAt(i);
        }
        int iB = tvVar.b - tvVar.b();
        int i2 = oe0Var.b;
        if (i >= iB + i2) {
            return ((String) oe0Var.d).charAt(i - ((iB - oe0Var.c) + i2));
        }
        int i3 = i - i2;
        int i4 = tvVar.c;
        char[] cArr = (char[]) tvVar.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + tvVar.d];
    }

    public final hx0 c() {
        int i = this.d;
        if (i != -1) {
            return new hx0(wo0.b(i, this.e));
        }
        return null;
    }

    public final void d(int i, int i2, String str) {
        oe0 oe0Var = this.a;
        if (i < 0 || i > oe0Var.b()) {
            wc.e(i, oe0Var.b(), "start (");
            return;
        }
        if (i2 < 0 || i2 > oe0Var.b()) {
            wc.e(i2, oe0Var.b(), "end (");
            return;
        }
        if (i > i2) {
            wc.n(n5.g("Do not set reversed range: ", i, " > ", i2));
            return;
        }
        oe0Var.k(i, i2, str);
        h(str.length() + i);
        g(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public final void e(int i, int i2) {
        oe0 oe0Var = this.a;
        if (i < 0 || i > oe0Var.b()) {
            wc.e(i, oe0Var.b(), "start (");
            return;
        }
        if (i2 < 0 || i2 > oe0Var.b()) {
            wc.e(i2, oe0Var.b(), "end (");
        } else if (i >= i2) {
            wc.n(n5.g("Do not set reversed or empty range: ", i, " > ", i2));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void f(int i, int i2) {
        oe0 oe0Var = this.a;
        if (i < 0 || i > oe0Var.b()) {
            wc.e(i, oe0Var.b(), "start (");
            return;
        }
        if (i2 < 0 || i2 > oe0Var.b()) {
            wc.e(i2, oe0Var.b(), "end (");
        } else if (i > i2) {
            wc.n(n5.g("Do not set reversed range: ", i, " > ", i2));
        } else {
            h(i);
            g(i2);
        }
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            ty.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            ty.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}

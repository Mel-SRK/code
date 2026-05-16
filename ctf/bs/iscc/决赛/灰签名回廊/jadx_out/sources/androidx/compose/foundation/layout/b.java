package androidx.compose.foundation.layout;

import defpackage.a8;
import defpackage.bw;
import defpackage.f00;
import defpackage.j;
import defpackage.j70;
import defpackage.vh;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final FillElement a = new FillElement(2);
    public static final FillElement b = new FillElement(3);
    public static final WrapContentElement c;
    public static final WrapContentElement d;

    static {
        a8 a8Var = bw.o;
        c = new WrapContentElement(1, new j(12, a8Var), a8Var);
        a8 a8Var2 = bw.n;
        d = new WrapContentElement(1, new j(12, a8Var2), a8Var2);
    }

    public static final j70 a(j70 j70Var, float f, float f2) {
        return j70Var.c(new UnspecifiedConstraintsElement(f, f2));
    }

    public static final j70 b(j70 j70Var, float f) {
        return j70Var.c(new SizeElement(f, f));
    }

    public static final j70 c(j70 j70Var, float f, float f2) {
        return j70Var.c(new SizeElement(f, f2));
    }

    public static j70 d(j70 j70Var, float f, float f2, float f3, float f4, int i) {
        return j70Var.c(new SizeElement(f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, false));
    }

    public static final j70 e(j70 j70Var, float f, float f2) {
        return j70Var.c(new SizeElement(f, f2, f, f2, true));
    }

    public static final j70 f(j70 j70Var) {
        float f = vh.a;
        float f2 = vh.c;
        return j70Var.c(new SizeElement(f, f2, vh.b, f2, true));
    }

    public static j70 g(j70 j70Var) {
        a8 a8Var = bw.o;
        return j70Var.c(f00.h(a8Var, a8Var) ? c : f00.h(a8Var, bw.n) ? d : new WrapContentElement(1, new j(12, a8Var), a8Var));
    }
}

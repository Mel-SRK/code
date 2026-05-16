package androidx.compose.foundation.layout;

import defpackage.j70;
import defpackage.wd0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final wd0 a(float f, float f2, float f3, float f4) {
        return new wd0(f, f2, f3, f4);
    }

    public static final j70 b(j70 j70Var, wd0 wd0Var) {
        return j70Var.c(new PaddingValuesElement(wd0Var));
    }

    public static final j70 c(j70 j70Var, float f) {
        return j70Var.c(new PaddingElement(f, f, f, f));
    }

    public static final j70 d(j70 j70Var, float f, float f2) {
        return j70Var.c(new PaddingElement(f, f2, f, f2));
    }

    public static j70 e(j70 j70Var, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        return j70Var.c(new PaddingElement(f, f2, f3, 0));
    }

    public static final j70 f(j70 j70Var) {
        return j70Var.c(new IntrinsicWidthElement());
    }
}

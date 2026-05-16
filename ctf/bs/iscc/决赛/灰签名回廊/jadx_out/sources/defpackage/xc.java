package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class xc {
    public final int a;
    public final xh0 b;
    public iz c;
    public iz d;
    public yh0 e;
    public final ColorDrawable f;
    public final boolean g;
    public int h;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public xc(int i, int i2) {
        xh0 xh0Var = new xh0();
        xh0Var.a = -1;
        xh0Var.b = -1;
        iz izVar = iz.e;
        xh0Var.c = izVar;
        xh0Var.d = false;
        xh0Var.e = null;
        xh0Var.f = 0.0f;
        xh0Var.g = 0.0f;
        xh0Var.h = 1.0f;
        this.b = xh0Var;
        this.c = izVar;
        this.d = izVar;
        this.e = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            wc.h("Unexpected side: ", i);
            throw null;
        }
        this.a = i;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f = colorDrawable;
        this.h = 0;
        this.g = true;
        if (i2 != 0) {
            this.h = i2;
            colorDrawable.setColor(i2);
            xh0Var.e = colorDrawable;
            f1 f1Var = xh0Var.i;
            if (f1Var != null) {
                ((View) f1Var.f).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f) {
        float f2 = f * 1.0f;
        xh0 xh0Var = this.b;
        if (xh0Var.h != f2) {
            xh0Var.h = f2;
            f1 f1Var = xh0Var.i;
            if (f1Var != null) {
                ((View) f1Var.f).setAlpha(f2);
            }
        }
    }

    public final void b(float f) {
        float f2 = f * 1.0f;
        xh0 xh0Var = this.b;
        int i = this.a;
        if (i == 1) {
            float f3 = (-(1.0f - f2)) * xh0Var.a;
            if (xh0Var.f != f3) {
                xh0Var.f = f3;
                f1 f1Var = xh0Var.i;
                if (f1Var != null) {
                    ((View) f1Var.f).setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f4 = (-(1.0f - f2)) * xh0Var.b;
            if (xh0Var.g != f4) {
                xh0Var.g = f4;
                f1 f1Var2 = xh0Var.i;
                if (f1Var2 != null) {
                    ((View) f1Var2.f).setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f5 = (1.0f - f2) * xh0Var.a;
            if (xh0Var.f != f5) {
                xh0Var.f = f5;
                f1 f1Var3 = xh0Var.i;
                if (f1Var3 != null) {
                    ((View) f1Var3.f).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f6 = (1.0f - f2) * xh0Var.b;
        if (xh0Var.g != f6) {
            xh0Var.g = f6;
            f1 f1Var4 = xh0Var.i;
            if (f1Var4 != null) {
                ((View) f1Var4.f).setTranslationY(f6);
            }
        }
    }
}

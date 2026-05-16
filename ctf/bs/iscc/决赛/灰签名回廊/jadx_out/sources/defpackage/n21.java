package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class n21 extends s21 {
    public static Field d = null;
    public static boolean e = false;
    public static Constructor f = null;
    public static boolean g = false;
    public WindowInsets c;

    public n21() {
        this.c = h();
    }

    private static WindowInsets h() {
        if (!e) {
            try {
                d = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            e = true;
        }
        Field field = d;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!g) {
            try {
                f = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            g = true;
        }
        Constructor constructor = f;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // defpackage.s21
    public e31 b() {
        a();
        e31 e31VarB = e31.b(this.c, null);
        iz[] izVarArr = this.b;
        b31 b31Var = e31VarB.a;
        b31Var.p(izVarArr);
        b31Var.r(null);
        return e31VarB;
    }

    @Override // defpackage.s21
    public void f(iz izVar) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(izVar.a, izVar.b, izVar.c, izVar.d);
        }
    }

    public n21(e31 e31Var) {
        super(e31Var);
        this.c = e31Var.a();
    }
}

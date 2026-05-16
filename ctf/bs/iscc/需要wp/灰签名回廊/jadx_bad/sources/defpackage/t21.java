package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class t21 extends b31 {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public iz[] d;
    public iz e;
    public e31 f;
    public iz g;
    public int h;

    public t21(e31 e31Var, WindowInsets windowInsets) {
        super(e31Var);
        this.e = null;
        this.c = windowInsets;
    }

    public static boolean aa(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private iz t(int i2, boolean z) {
        iz izVarA = iz.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                izVarA = iz.a(izVarA, u(i3, z));
            }
        }
        return izVarA;
    }

    private iz v() {
        e31 e31Var = this.f;
        return e31Var != null ? e31Var.a.i() : iz.e;
    }

    private iz w(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!i) {
            y();
        }
        Method method = j;
        if (method != null && k != null && l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(objInvoke));
                if (rect != null) {
                    return iz.c(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void y() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    @Override // defpackage.b31
    public void d(View view) {
        iz izVarW = w(view);
        if (izVarW == null) {
            izVarW = iz.e;
        }
        z(izVarW);
    }

    @Override // defpackage.b31
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        t21 t21Var = (t21) obj;
        return Objects.equals(this.g, t21Var.g) && aa(this.h, t21Var.h);
    }

    @Override // defpackage.b31
    public iz f(int i2) {
        return t(i2, false);
    }

    @Override // defpackage.b31
    public iz g(int i2) {
        return t(i2, true);
    }

    @Override // defpackage.b31
    public final iz k() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = iz.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.b31
    public boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.b31
    public boolean o(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !x(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.b31
    public void p(iz[] izVarArr) {
        this.d = izVarArr;
    }

    @Override // defpackage.b31
    public void q(e31 e31Var) {
        this.f = e31Var;
    }

    @Override // defpackage.b31
    public void s(int i2) {
        this.h = i2;
    }

    public iz u(int i2, boolean z) {
        iz izVarI;
        int i3;
        iz izVar = iz.e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    iz[] izVarArr = this.d;
                    izVarI = izVarArr != null ? izVarArr[wo0.j(8)] : null;
                    if (izVarI != null) {
                        return izVarI;
                    }
                    iz izVarK = k();
                    iz izVarV = v();
                    int i4 = izVarK.d;
                    if (i4 > izVarV.d) {
                        return iz.c(0, 0, 0, i4);
                    }
                    iz izVar2 = this.g;
                    if (izVar2 != null && !izVar2.equals(izVar) && (i3 = this.g.d) > izVarV.d) {
                        return iz.c(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return j();
                    }
                    if (i2 == 32) {
                        return h();
                    }
                    if (i2 == 64) {
                        return l();
                    }
                    if (i2 == 128) {
                        e31 e31Var = this.f;
                        ym ymVarE = e31Var != null ? e31Var.a.e() : e();
                        if (ymVarE != null) {
                            int i5 = Build.VERSION.SDK_INT;
                            return iz.c(i5 >= 28 ? xm.e(ymVarE.a) : 0, i5 >= 28 ? xm.g(ymVarE.a) : 0, i5 >= 28 ? xm.f(ymVarE.a) : 0, i5 >= 28 ? xm.d(ymVarE.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    iz izVarV2 = v();
                    iz izVarI2 = i();
                    return iz.c(Math.max(izVarV2.a, izVarI2.a), 0, Math.max(izVarV2.c, izVarI2.c), Math.max(izVarV2.d, izVarI2.d));
                }
                if ((this.h & 2) == 0) {
                    iz izVarK2 = k();
                    e31 e31Var2 = this.f;
                    izVarI = e31Var2 != null ? e31Var2.a.i() : null;
                    int iMin = izVarK2.d;
                    if (izVarI != null) {
                        iMin = Math.min(iMin, izVarI.d);
                    }
                    return iz.c(izVarK2.a, 0, izVarK2.c, iMin);
                }
            }
        } else {
            if (z) {
                return iz.c(0, Math.max(v().b, k().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return iz.c(0, k().b, 0, 0);
            }
        }
        return izVar;
    }

    public boolean x(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !u(i2, false).equals(iz.e);
    }

    public void z(iz izVar) {
        this.g = izVar;
    }
}

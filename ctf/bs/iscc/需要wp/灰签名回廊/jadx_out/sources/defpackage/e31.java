package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e31 {
    public final b31 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            int i2 = a31.s;
        } else if (i >= 30) {
            int i3 = y21.r;
        } else {
            int i4 = b31.b;
        }
    }

    public e31(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new a31(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new z21(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new y21(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new w21(this, windowInsets);
        } else if (i >= 28) {
            this.a = new v21(this, windowInsets);
        } else {
            this.a = new u21(this, windowInsets);
        }
    }

    public static e31 b(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        e31 e31Var = new e31(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = f11.a;
            e31 e31VarA = b11.a(view);
            b31 b31Var = e31Var.a;
            b31Var.q(e31VarA);
            b31Var.d(view.getRootView());
            b31Var.s(view.getWindowSystemUiVisibility());
        }
        return e31Var;
    }

    public final WindowInsets a() {
        b31 b31Var = this.a;
        if (b31Var instanceof t21) {
            return ((t21) b31Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e31) {
            return Objects.equals(this.a, ((e31) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        b31 b31Var = this.a;
        if (b31Var == null) {
            return 0;
        }
        return b31Var.hashCode();
    }

    public e31() {
        this.a = new b31(this);
    }
}

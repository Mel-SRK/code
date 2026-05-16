package defpackage;

import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class ik {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, zw0 zw0Var, ri0 ri0Var) {
        if (!ri0Var.d()) {
            float f = ri0Var.b;
            y70 y70Var = zw0Var.b;
            int iC = y70Var.c(f);
            int iC2 = y70Var.c(ri0Var.d);
            if (iC <= iC2) {
                while (true) {
                    builder.addVisibleLineBounds(zw0Var.f(iC), y70Var.d(iC), zw0Var.g(iC), y70Var.b(iC));
                    if (iC == iC2) {
                        break;
                    }
                    iC++;
                }
            }
        }
        return builder;
    }
}

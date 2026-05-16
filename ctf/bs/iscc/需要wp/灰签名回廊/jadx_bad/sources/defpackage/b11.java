package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class b11 {
    public static e31 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        e31 e31VarB = e31.b(rootWindowInsets, null);
        b31 b31Var = e31VarB.a;
        b31Var.q(e31VarB);
        b31Var.d(view.getRootView());
        return e31VarB;
    }
}

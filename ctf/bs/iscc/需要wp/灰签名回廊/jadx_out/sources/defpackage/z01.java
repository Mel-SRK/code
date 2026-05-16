package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class z01 implements View.OnApplyWindowInsetsListener {
    public e31 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ db0 c;

    public z01(View view, db0 db0Var) {
        this.b = view;
        this.c = db0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        e31 e31VarB = e31.b(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        db0 db0Var = this.c;
        if (i < 30) {
            a11.a(windowInsets, this.b);
            if (e31VarB.equals(this.a)) {
                return db0Var.a(view, e31VarB).a();
            }
        }
        this.a = e31VarB;
        e31 e31VarA = db0Var.a(view, e31VarB);
        if (i >= 30) {
            return e31VarA.a();
        }
        int i2 = f11.a;
        y01.a(view);
        return e31VarA.a();
    }
}

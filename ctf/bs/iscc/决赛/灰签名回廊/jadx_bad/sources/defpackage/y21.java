package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class y21 extends w21 {
    public static final /* synthetic */ int r = 0;

    static {
        e31.b(WindowInsets.CONSUMED, null);
    }

    public y21(e31 e31Var, WindowInsets windowInsets) {
        super(e31Var, windowInsets);
    }

    @Override // defpackage.t21, defpackage.b31
    public iz f(int i) {
        return iz.d(this.c.getInsets(c31.a(i)));
    }

    @Override // defpackage.t21, defpackage.b31
    public iz g(int i) {
        return iz.d(this.c.getInsetsIgnoringVisibility(c31.a(i)));
    }

    @Override // defpackage.t21, defpackage.b31
    public boolean o(int i) {
        return this.c.isVisible(c31.a(i));
    }

    @Override // defpackage.t21, defpackage.b31
    public final void d(View view) {
    }
}

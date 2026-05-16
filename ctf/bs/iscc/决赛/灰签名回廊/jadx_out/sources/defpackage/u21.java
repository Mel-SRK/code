package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class u21 extends t21 {
    public iz n;

    public u21(e31 e31Var, WindowInsets windowInsets) {
        super(e31Var, windowInsets);
        this.n = null;
    }

    @Override // defpackage.b31
    public e31 b() {
        return e31.b(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.b31
    public e31 c() {
        return e31.b(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.b31
    public final iz i() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = iz.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // defpackage.b31
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // defpackage.b31
    public void r(iz izVar) {
        this.n = izVar;
    }
}

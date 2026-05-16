package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class a31 extends z21 {
    public static final /* synthetic */ int s = 0;

    static {
        e31.b(WindowInsets.CONSUMED, null);
    }

    public a31(e31 e31Var, WindowInsets windowInsets) {
        super(e31Var, windowInsets);
    }

    @Override // defpackage.y21, defpackage.t21, defpackage.b31
    public iz f(int i) {
        return iz.d(this.c.getInsets(d31.a(i)));
    }

    @Override // defpackage.y21, defpackage.t21, defpackage.b31
    public iz g(int i) {
        return iz.d(this.c.getInsetsIgnoringVisibility(d31.a(i)));
    }

    @Override // defpackage.y21, defpackage.t21, defpackage.b31
    public boolean o(int i) {
        return this.c.isVisible(d31.a(i));
    }
}

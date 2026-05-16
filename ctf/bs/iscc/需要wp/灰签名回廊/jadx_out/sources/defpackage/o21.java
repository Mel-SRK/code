package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class o21 extends s21 {
    public final WindowInsets.Builder c;

    public o21(e31 e31Var) {
        super(e31Var);
        WindowInsets windowInsetsA = e31Var.a();
        this.c = windowInsetsA != null ? yd0.c(windowInsetsA) : yd0.b();
    }

    @Override // defpackage.s21
    public e31 b() {
        a();
        e31 e31VarB = e31.b(this.c.build(), null);
        e31VarB.a.p(this.b);
        return e31VarB;
    }

    @Override // defpackage.s21
    public void d(iz izVar) {
        this.c.setMandatorySystemGestureInsets(izVar.e());
    }

    @Override // defpackage.s21
    public void e(iz izVar) {
        this.c.setSystemGestureInsets(izVar.e());
    }

    @Override // defpackage.s21
    public void f(iz izVar) {
        this.c.setSystemWindowInsets(izVar.e());
    }

    @Override // defpackage.s21
    public void g(iz izVar) {
        this.c.setTappableElementInsets(izVar.e());
    }

    public o21() {
        this.c = yd0.b();
    }
}

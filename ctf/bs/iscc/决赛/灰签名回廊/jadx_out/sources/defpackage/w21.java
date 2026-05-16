package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class w21 extends v21 {
    public iz o;
    public iz p;
    public iz q;

    public w21(e31 e31Var, WindowInsets windowInsets) {
        super(e31Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.b31
    public iz h() {
        if (this.p == null) {
            this.p = iz.d(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // defpackage.b31
    public iz j() {
        if (this.o == null) {
            this.o = iz.d(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.b31
    public iz l() {
        if (this.q == null) {
            this.q = iz.d(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // defpackage.u21, defpackage.b31
    public void r(iz izVar) {
    }
}

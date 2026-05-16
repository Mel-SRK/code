package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lg0 extends i70 implements sy0, sg0, kg {
    public x3 r;
    public boolean s;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.sg0
    public final void ad(ig0 ig0Var, jg0 jg0Var, long j) {
        if (jg0Var == jg0.e) {
            ?? r4 = ig0Var.a;
            int size = r4.size();
            for (int i = 0; i < size; i++) {
                int i2 = ((pg0) r4.get(i)).i;
                if (i2 != 3 && i2 != 4) {
                    int i3 = ig0Var.c;
                    if (i3 == 4) {
                        this.s = true;
                        bw();
                        return;
                    } else {
                        if (i3 == 5) {
                            bx();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.sg0
    public final void aw() {
        bx();
    }

    @Override // defpackage.i70
    public final void bn() {
        bx();
    }

    public final void bu() {
        x3 x3Var;
        xi0 xi0Var = new xi0();
        lI.m(this, new yv0(26, xi0Var));
        lg0 lg0Var = (lg0) xi0Var.d;
        if (lg0Var == null || (x3Var = lg0Var.r) == null) {
            x3Var = this.r;
        }
        bv(x3Var);
    }

    public final void bv(mg0 mg0Var) {
        ng0 ng0Var = (ng0) i60.ab(this, og.u);
        if (ng0Var != null) {
            w0 w0Var = (w0) ng0Var;
            if (mg0Var == null) {
                mg0.a.getClass();
                mg0Var = d41.h;
            }
            r1.a.a(w0Var.a, mg0Var);
        }
    }

    public final void bw() {
        ti0 ti0Var = new ti0();
        ti0Var.d = true;
        lI.n(this, new rn(ti0Var));
        if (ti0Var.d) {
            bu();
        }
    }

    public final void bx() {
        if (this.s) {
            this.s = false;
            if (this.q) {
                xi0 xi0Var = new xi0();
                lI.m(this, new t0(xi0Var, 1));
                lg0 lg0Var = (lg0) xi0Var.d;
                if (lg0Var != null) {
                    lg0Var.bu();
                } else {
                    bv(null);
                }
            }
        }
    }

    @Override // defpackage.sy0
    public final /* bridge */ /* synthetic */ Object p() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // defpackage.sg0
    public final long r() {
        int i = dy0.b;
        return dy0.a;
    }
}

package defpackage;

import com.example.gnd.R;

/* JADX INFO: loaded from: classes.dex */
public final class a41 implements zf, s30 {
    public final b1 d;
    public final jg e;
    public boolean f;
    public p30 g;
    public gv h = ye.a;

    public a41(b1 b1Var, jg jgVar) {
        this.d = b1Var;
        this.e = jgVar;
    }

    @Override // defpackage.s30
    public final void d(u30 u30Var, n30 n30Var) {
        if (n30Var == n30.ON_DESTROY) {
            e();
        } else {
            if (n30Var != n30.ON_CREATE || this.f) {
                return;
            }
            f(this.h);
        }
    }

    public final void e() {
        if (!this.f) {
            this.f = true;
            this.d.getView().setTag(R.id.wrapped_composition_tag, null);
            p30 p30Var = this.g;
            if (p30Var != null) {
                p30Var.b(this);
            }
        }
        jg jgVar = this.e;
        synchronized (jgVar.g) {
            try {
                if (jgVar.w.ae) {
                    dh0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (jgVar.x != 3) {
                    jgVar.x = 3;
                    te teVar = we.b;
                    wa waVar = jgVar.w.ak;
                    if (waVar != null) {
                        jgVar.e(waVar);
                    }
                    boolean z = jgVar.i.e > 0;
                    if (z || !jgVar.h.d.g()) {
                        da0 da0Var = jgVar.v;
                        try {
                            da0Var.i(jgVar.h, jgVar.w.y());
                            if (z) {
                                vq0 vq0VarD = jgVar.i.d();
                                try {
                                    xf.f(vq0VarD, jgVar.v);
                                    vq0VarD.e(true);
                                    jgVar.e.i();
                                    jgVar.e.v();
                                    da0Var.f();
                                } catch (Throwable th) {
                                    vq0VarD.e(false);
                                    throw th;
                                }
                            }
                            da0Var.e();
                            da0Var.b();
                        } catch (Throwable th2) {
                            da0Var.b();
                            throw th2;
                        }
                    }
                    jgVar.w.n();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        jgVar.d.q(jgVar);
    }

    public final void f(gv gvVar) {
        this.d.setOnViewTreeOwnersAvailable(new a2(28, this, gvVar));
    }
}

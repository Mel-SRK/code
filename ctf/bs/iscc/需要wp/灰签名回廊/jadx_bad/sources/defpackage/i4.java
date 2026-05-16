package defpackage;

import android.view.View;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i4 extends ok0 implements kk0 {
    public jk0 ab;
    public lk0 ac;

    @Override // defpackage.kk0
    public final void ay() {
        this.ac = null;
        t1.ae(this);
    }

    @Override // defpackage.i70
    public final void bn() {
        jk0 jk0Var = this.ab;
        if (jk0Var != null) {
            ay();
            f1 f1Var = jk0Var.g;
            lk0 lk0Var = (lk0) ((LinkedHashMap) f1Var.e).get(this);
            if (lk0Var != null) {
                lk0Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) f1Var.e;
                lk0 lk0Var2 = (lk0) linkedHashMap.get(this);
                if (lk0Var2 != null) {
                }
                linkedHashMap.remove(this);
                jk0Var.f.add(lk0Var);
            }
        }
    }

    @Override // defpackage.ok0
    public final void bu(jh0 jh0Var, long j, float f) {
        jk0 jk0VarA = this.ab;
        if (jk0VarA == null) {
            jk0VarA = rk0.a(rk0.b((View) i60.ab(this, d2.f)));
            this.ab = jk0VarA;
        }
        lk0 lk0VarA = jk0VarA.a(this);
        int iAx = i60.ax(f);
        long jA = this.u.a();
        this.v.a();
        lk0VarA.b(jh0Var, this.s, j, iAx, jA, 0.1f, new b(3, this));
        this.ac = lk0VarA;
        t1.ae(this);
    }

    @Override // defpackage.ok0
    public final void bv(u20 u20Var) {
        oa oaVarO = u20Var.d.e.o();
        lk0 lk0Var = this.ac;
        if (lk0Var != null) {
            long j = this.y;
            long jA = this.u.a();
            this.v.a();
            lk0Var.e(0.1f, j, jA);
            lk0Var.draw(f0.a(oaVarO));
        }
    }

    @Override // defpackage.ok0
    public final void bx(jh0 jh0Var) {
        lk0 lk0Var = this.ac;
        if (lk0Var != null) {
            lk0Var.d();
        }
    }
}

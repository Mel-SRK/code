package defpackage;

import android.view.ViewGroup;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h4 implements bj0, kk0, ny {
    public final b3 d;
    public final w80 g;
    public final w80 h;
    public final ViewGroup i;
    public jk0 j;
    public final boolean e = true;
    public final float f = Float.NaN;
    public final me0 k = bo0.m(null);
    public final me0 l = bo0.m(Boolean.TRUE);
    public long m = 0;
    public int n = -1;
    public final b o = new b(2, this);

    public h4(w80 w80Var, w80 w80Var2, ViewGroup viewGroup) {
        this.d = new b3(new oi(w80Var2, 1), true);
        this.g = w80Var;
        this.h = w80Var2;
        this.i = viewGroup;
    }

    @Override // defpackage.ny
    public final void a(u20 u20Var) {
        ra raVar = u20Var.d;
        this.m = raVar.c();
        float f = this.f;
        this.n = Float.isNaN(f) ? i60.ax(hk0.a(u20Var, this.e, raVar.c())) : raVar.ai(f);
        long j = ((qc) this.g.getValue()).a;
        float f2 = ((ck0) this.h.getValue()).d;
        u20Var.a();
        this.d.c(u20Var, Float.isNaN(f) ? hk0.a(u20Var, true, raVar.c()) : u20Var.x(f), j);
        oa oaVarO = raVar.e.o();
        ((Boolean) this.l.getValue()).booleanValue();
        lk0 lk0Var = (lk0) this.k.getValue();
        if (lk0Var != null) {
            lk0Var.e(f2, raVar.c(), j);
            lk0Var.draw(f0.a(oaVarO));
        }
    }

    @Override // defpackage.kk0
    public final void ay() {
        this.k.setValue(null);
    }

    @Override // defpackage.bj0
    public final void d() {
        jk0 jk0Var = this.j;
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

    @Override // defpackage.bj0
    public final void e() {
        jk0 jk0Var = this.j;
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

    @Override // defpackage.bj0
    public final void c() {
    }
}

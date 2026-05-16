package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dv0 {
    public final b6 a;
    public final nx0 b;
    public final boolean e;
    public final em g;
    public final qt h;
    public g20 j;
    public e20 k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List i = rq.d;

    public dv0(b6 b6Var, nx0 nx0Var, boolean z, em emVar, qt qtVar, int i) {
        this.a = b6Var;
        this.b = nx0Var;
        this.e = z;
        this.g = emVar;
        this.h = qtVar;
    }

    public final void a(e20 e20Var) {
        g20 g20Var = this.j;
        if (g20Var == null || e20Var != this.k || g20Var.b()) {
            this.k = e20Var;
            g20Var = new g20(this.a, wn0.k(this.b, e20Var), this.i, this.g, this.h);
        }
        this.j = g20Var;
    }
}

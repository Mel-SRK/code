package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.relocation.a;

/* JADX INFO: loaded from: classes.dex */
public final class ti extends x10 implements gv {
    public final /* synthetic */ h30 e;
    public final /* synthetic */ nx0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ zv0 i;
    public final /* synthetic */ lw0 j;
    public final /* synthetic */ g11 k;
    public final /* synthetic */ j70 l;
    public final /* synthetic */ j70 m;
    public final /* synthetic */ j70 n;
    public final /* synthetic */ j70 o;
    public final /* synthetic */ t8 p;
    public final /* synthetic */ cw0 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ cv s;
    public final /* synthetic */ ab0 t;
    public final /* synthetic */ em u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(h30 h30Var, nx0 nx0Var, int i, int i2, zv0 zv0Var, lw0 lw0Var, g11 g11Var, j70 j70Var, j70 j70Var2, j70 j70Var3, j70 j70Var4, t8 t8Var, cw0 cw0Var, boolean z, cv cvVar, ab0 ab0Var, em emVar) {
        super(2);
        this.e = h30Var;
        this.f = nx0Var;
        this.g = i;
        this.h = i2;
        this.i = zv0Var;
        this.j = lw0Var;
        this.k = g11Var;
        this.l = j70Var;
        this.m = j70Var2;
        this.n = j70Var3;
        this.o = j70Var4;
        this.p = t8Var;
        this.q = cw0Var;
        this.r = z;
        this.s = cvVar;
        this.t = ab0Var;
        this.u = emVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        j70 x01Var;
        vf vfVar = (vf) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && vfVar.z()) {
            vfVar.aq();
        } else {
            h30 h30Var = this.e;
            j70 j70VarC = b.c(g70.a, ((mn) h30Var.g.getValue()).d, Float.NaN);
            int i = this.g;
            int i2 = this.h;
            nx0 nx0Var = this.f;
            j70 j70VarP = m10.p(j70VarC, new kx(i, i2, nx0Var));
            lw0 lw0Var = this.j;
            long j = lw0Var.b;
            boolean zH = vfVar.h(h30Var);
            Object objAk = vfVar.ak();
            if (zH || objAk == nf.a) {
                objAk = new b(6, h30Var);
                vfVar.be(objAk);
            }
            pu puVar = (pu) objAk;
            zv0 zv0Var = this.i;
            wc0 wc0Var = (wc0) zv0Var.e.getValue();
            int i3 = hx0.c;
            int iE = (int) (j >> 32);
            long j2 = zv0Var.d;
            if (iE == ((int) (j2 >> 32)) && (iE = (int) (j & 4294967295L)) == ((int) (4294967295L & j2))) {
                iE = hx0.e(j);
            }
            zv0Var.d = j;
            jy0 jy0VarX = pk.x(this.k, lw0Var.a);
            int iOrdinal = wc0Var.ordinal();
            if (iOrdinal == 0) {
                x01Var = new x01(zv0Var, iE, jy0VarX, puVar);
            } else {
                if (iOrdinal != 1) {
                    wc.l();
                    return null;
                }
                x01Var = new vx(zv0Var, iE, jy0VarX, puVar);
            }
            jo0.a(a.a(m10.p(androidx.compose.ui.graphics.a.b(j70VarP, 0.0f, null, 520191).c(x01Var).c(this.l).c(this.m), new iw0(2, nx0Var)).c(this.n).c(this.o), this.p), t1.aq(-363167407, new si(this.q, h30Var, this.r, this.s, lw0Var, this.t, this.u, this.h), vfVar), vfVar, 48);
        }
        return wz0.a;
    }
}

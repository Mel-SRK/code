package defpackage;

import androidx.compose.ui.input.key.a;

/* JADX INFO: loaded from: classes.dex */
public final class sv0 extends x10 implements hv {
    public final /* synthetic */ h30 e;
    public final /* synthetic */ cw0 f;
    public final /* synthetic */ lw0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ab0 j;
    public final /* synthetic */ vz0 k;
    public final /* synthetic */ cv l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(h30 h30Var, cw0 cw0Var, lw0 lw0Var, boolean z, boolean z2, ab0 ab0Var, vz0 vz0Var, cv cvVar, int i) {
        super(3);
        this.e = h30Var;
        this.f = cw0Var;
        this.g = lw0Var;
        this.h = z;
        this.i = z2;
        this.j = ab0Var;
        this.k = vz0Var;
        this.l = cvVar;
        this.m = i;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        vf vfVar = (vf) obj2;
        ((Number) obj3).intValue();
        vfVar.av(851809892);
        Object objAk = vfVar.ak();
        n31 n31Var = nf.a;
        if (objAk == n31Var) {
            objAk = new gx0();
            vfVar.be(objAk);
        }
        gx0 gx0Var = (gx0) objAk;
        Object objAk2 = vfVar.ak();
        if (objAk2 == n31Var) {
            objAk2 = new nk();
            vfVar.be(objAk2);
        }
        cv cvVar = this.l;
        int i = this.m;
        rv0 rv0Var = new rv0(this.e, this.f, this.g, this.h, this.i, gx0Var, this.j, this.k, (nk) objAk2, cvVar, i);
        boolean zH = vfVar.h(rv0Var);
        Object objAk3 = vfVar.ak();
        if (zH || objAk3 == n31Var) {
            ft ftVar = new ft(1, rv0Var, rv0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 2);
            vfVar.be(ftVar);
            objAk3 = ftVar;
        }
        j70 j70VarA = a.a((cv) ((rv) objAk3));
        vfVar.q(false);
        return j70VarA;
    }
}

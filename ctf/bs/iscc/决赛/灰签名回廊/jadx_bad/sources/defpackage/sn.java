package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sn extends i70 implements sy0, b20 {
    public sn r;
    public sn s;
    public long t;

    @Override // defpackage.i70
    public final void bn() {
        this.s = null;
        this.r = null;
    }

    public final boolean bu() {
        sn snVar = this.r;
        if (snVar != null) {
            return snVar.bu();
        }
        sn snVar2 = this.s;
        if (snVar2 != null) {
            return snVar2.bu();
        }
        return false;
    }

    public final void bv() {
        sn snVar = this.s;
        if (snVar != null) {
            snVar.bv();
            return;
        }
        sn snVar2 = this.r;
        if (snVar2 != null) {
            snVar2.bv();
        }
    }

    public final void bw() {
        sn snVar = this.s;
        if (snVar != null) {
            snVar.bw();
        }
        sn snVar2 = this.r;
        if (snVar2 != null) {
            snVar2.bw();
        }
        this.r = null;
    }

    public final void bx(bu buVar) {
        sy0 sy0Var;
        sn snVar;
        sn snVar2 = this.r;
        if (snVar2 == null || !az0.i(snVar2, d41.z(buVar))) {
            if (this.d.q) {
                xi0 xi0Var = new xi0();
                lI.n(this, new g5(xi0Var, this, buVar, 4));
                sy0Var = (sy0) xi0Var.d;
            } else {
                sy0Var = null;
            }
            snVar = (sn) sy0Var;
        } else {
            snVar = snVar2;
        }
        if (snVar != null && snVar2 == null) {
            snVar.bv();
            snVar.bx(buVar);
            sn snVar3 = this.s;
            if (snVar3 != null) {
                snVar3.bw();
            }
        } else if (snVar == null && snVar2 != null) {
            sn snVar4 = this.s;
            if (snVar4 != null) {
                snVar4.bv();
                snVar4.bx(buVar);
            }
            snVar2.bw();
        } else if (!f00.h(snVar, snVar2)) {
            if (snVar != null) {
                snVar.bv();
                snVar.bx(buVar);
            }
            if (snVar2 != null) {
                snVar2.bw();
            }
        } else if (snVar != null) {
            snVar.bx(buVar);
        } else {
            sn snVar5 = this.s;
            if (snVar5 != null) {
                snVar5.bx(buVar);
            }
        }
        this.r = snVar;
    }

    public final void bz() {
        sn snVar = this.s;
        if (snVar != null) {
            snVar.bz();
            return;
        }
        sn snVar2 = this.r;
        if (snVar2 != null) {
            snVar2.bz();
        }
    }

    @Override // defpackage.sy0
    public final Object p() {
        return bw.w;
    }

    @Override // defpackage.b20
    public final void s(long j) {
        this.t = j;
    }
}

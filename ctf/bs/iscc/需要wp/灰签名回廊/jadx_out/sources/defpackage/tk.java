package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tk extends i70 implements wo {
    public final g80 r;
    public boolean s;
    public boolean t;
    public boolean u;

    public tk(g80 g80Var) {
        this.r = g80Var;
    }

    @Override // defpackage.i70
    public final void bm() {
        i60.an(bi(), null, new sk(this, null, 0), 3);
    }

    @Override // defpackage.wo
    public final void d(u20 u20Var) {
        u20Var.a();
        ra raVar = u20Var.d;
        if (this.s) {
            xo.ab(u20Var, qc.b(qc.b, 0.3f), raVar.c(), 122);
        } else if (this.t || this.u) {
            xo.ab(u20Var, qc.b(qc.b, 0.1f), raVar.c(), 122);
        }
    }
}

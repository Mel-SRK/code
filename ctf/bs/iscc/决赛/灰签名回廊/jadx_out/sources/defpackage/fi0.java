package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fi0 implements ns0, yr, sv {
    public final /* synthetic */ ps0 d;

    public fi0(ps0 ps0Var) {
        this.d = ps0Var;
    }

    @Override // defpackage.yr
    public final Object b(zr zrVar, ji jiVar) {
        this.d.b(zrVar, jiVar);
        return yj.d;
    }

    @Override // defpackage.sv
    public final yr c(pj pjVar, int i, m9 m9Var) {
        return ((((i < 0 || i >= 2) && i != -2) || m9Var != m9.e) && !((i == 0 || i == -3) && m9Var == m9.d)) ? new db(this, pjVar, i, m9Var) : this;
    }

    @Override // defpackage.ns0
    public final Object getValue() {
        return this.d.getValue();
    }
}

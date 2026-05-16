package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hb extends cb {
    public final tt0 h;

    /* JADX WARN: Multi-variable type inference failed */
    public hb(hv hvVar, yr yrVar, pj pjVar, int i, m9 m9Var) {
        super(yrVar, pjVar, i, m9Var);
        this.h = (tt0) hvVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [hv, tt0] */
    @Override // defpackage.cb
    public final cb a(pj pjVar, int i, m9 m9Var) {
        return new hb(this.h, this.g, pjVar, i, m9Var);
    }

    @Override // defpackage.cb
    public final Object e(zr zrVar, ki kiVar) {
        Object objY = i60.y(new eb(this, zrVar, null), kiVar);
        return objY == yj.d ? objY : wz0.a;
    }
}

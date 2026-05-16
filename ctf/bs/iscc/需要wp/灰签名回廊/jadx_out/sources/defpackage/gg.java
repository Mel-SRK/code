package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gg implements uc0, nj {
    public static final n31 e = new n31(11);
    public final vf d;

    public gg(vf vfVar) {
        this.d = vfVar;
    }

    @Override // defpackage.uc0
    public final List e(Integer num) {
        return this.d.ad();
    }

    @Override // defpackage.nj
    public final oj getKey() {
        return e;
    }

    @Override // defpackage.pj
    public final pj j(pj pjVar) {
        return pk.an(this, pjVar);
    }

    @Override // defpackage.pj
    public final nj k(oj ojVar) {
        return pk.ab(this, ojVar);
    }

    @Override // defpackage.pj
    public final Object r(gv gvVar, Object obj) {
        return gvVar.f(obj, this);
    }

    @Override // defpackage.pj
    public final pj v(oj ojVar) {
        return pk.am(this, ojVar);
    }
}

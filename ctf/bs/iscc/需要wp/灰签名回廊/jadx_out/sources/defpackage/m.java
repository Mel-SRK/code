package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements nj {
    public final oj d;

    public m(oj ojVar) {
        this.d = ojVar;
    }

    @Override // defpackage.nj
    public final oj getKey() {
        return this.d;
    }

    @Override // defpackage.pj
    public final pj j(pj pjVar) {
        return pk.an(this, pjVar);
    }

    @Override // defpackage.pj
    public nj k(oj ojVar) {
        return pk.ab(this, ojVar);
    }

    @Override // defpackage.pj
    public final Object r(gv gvVar, Object obj) {
        return gvVar.f(obj, this);
    }

    @Override // defpackage.pj
    public pj v(oj ojVar) {
        return pk.am(this, ojVar);
    }
}

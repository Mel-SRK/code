package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class na implements nj, oj {
    public static final n31 e = new n31(9);
    public static final na f = new na(1);
    public final /* synthetic */ int d;

    public /* synthetic */ na(int i) {
        this.d = i;
    }

    @Override // defpackage.nj
    public final oj getKey() {
        switch (this.d) {
            case 0:
                return e;
            default:
                return this;
        }
    }

    @Override // defpackage.pj
    public final pj j(pj pjVar) {
        switch (this.d) {
        }
        return pk.an(this, pjVar);
    }

    @Override // defpackage.pj
    public final nj k(oj ojVar) {
        switch (this.d) {
        }
        return pk.ab(this, ojVar);
    }

    @Override // defpackage.pj
    public final Object r(gv gvVar, Object obj) {
        switch (this.d) {
        }
        return gvVar.f(obj, this);
    }

    @Override // defpackage.pj
    public final pj v(oj ojVar) {
        switch (this.d) {
        }
        return pk.am(this, ojVar);
    }
}

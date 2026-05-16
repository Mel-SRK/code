package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class km extends us0 implements ms0 {
    public final pu e;
    public final bw f;
    public jm g = new jm(fr0.k().g());

    public km(pu puVar, bw bwVar) {
        this.e = puVar;
        this.f = bwVar;
    }

    @Override // defpackage.ts0
    public final vs0 a() {
        return this.g;
    }

    @Override // defpackage.ts0
    public final void c(vs0 vs0Var) {
        vs0Var.getClass();
        this.g = (jm) vs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jm g(defpackage.jm r22, defpackage.xq0 r23, boolean r24, defpackage.pu r25) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km.g(jm, xq0, boolean, pu):jm");
    }

    @Override // defpackage.ms0
    public final Object getValue() {
        cv cvVarE = fr0.k().e();
        if (cvVarE != null) {
            cvVarE.g(this);
        }
        xq0 xq0VarK = fr0.k();
        return g((jm) fr0.j(this.g, xq0VarK), xq0VarK, true, this.e).f;
    }

    public final jm h() {
        xq0 xq0VarK = fr0.k();
        return g((jm) fr0.j(this.g, xq0VarK), xq0VarK, false, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        jm jmVar = (jm) fr0.i(this.g);
        sb.append(jmVar.c(this, fr0.k()) ? String.valueOf(jmVar.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}

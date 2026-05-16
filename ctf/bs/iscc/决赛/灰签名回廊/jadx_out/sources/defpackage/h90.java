package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h90 implements ja, w11 {
    public final la d;
    public final /* synthetic */ i90 e;

    public h90(i90 i90Var, la laVar) {
        this.e = i90Var;
        this.d = laVar;
    }

    @Override // defpackage.w11
    public final void a(un0 un0Var, int i) {
        this.d.a(un0Var, i);
    }

    @Override // defpackage.ji
    public final pj e() {
        return this.d.h;
    }

    @Override // defpackage.ji
    public final void h(Object obj) {
        this.d.h(obj);
    }

    @Override // defpackage.ja
    public final jq l(Object obj, hv hvVar) {
        i90 i90Var = this.e;
        ka kaVar = new ka(i90Var, this);
        jq jqVarL = this.d.l((wz0) obj, kaVar);
        if (jqVarL != null) {
            i90.g.set(i90Var, null);
        }
        return jqVarL;
    }

    @Override // defpackage.ja
    public final boolean n(Throwable th) {
        return this.d.n(th);
    }

    @Override // defpackage.ja
    public final void y(Object obj) {
        this.d.y(obj);
    }
}

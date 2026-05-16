package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x9 extends i70 implements va0, r9, wo {
    public final y9 r;
    public boolean s;
    public cv t;

    public x9(y9 y9Var, cv cvVar) {
        this.r = y9Var;
        this.t = cvVar;
        y9Var.d = this;
    }

    @Override // defpackage.ql, defpackage.sg0
    public final void a() {
        bu();
    }

    @Override // defpackage.va0
    public final void af() {
        bu();
    }

    @Override // defpackage.r9
    public final em b() {
        return pk.ay(this).z;
    }

    @Override // defpackage.wo
    public final void bc() {
        bu();
    }

    @Override // defpackage.ql
    public final void bf() {
        bu();
    }

    @Override // defpackage.i70
    public final void bo() {
        bu();
    }

    public final void bu() {
        this.s = false;
        this.r.e = null;
        t1.ae(this);
    }

    @Override // defpackage.r9
    public final long c() {
        return e00.an(pk.aw(this, 128).f);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cv, x10] */
    @Override // defpackage.wo
    public final void d(u20 u20Var) {
        boolean z = this.s;
        y9 y9Var = this.r;
        if (!z) {
            y9Var.e = null;
            az0.z(this, new s0(4, this, y9Var));
            if (y9Var.e == null) {
                throw n5.f("DrawResult not defined, did you forget to call onDraw?");
            }
            this.s = true;
        }
        bu buVar = y9Var.e;
        buVar.getClass();
        ((x10) buVar.e).g(u20Var);
    }

    @Override // defpackage.r9
    public final e20 getLayoutDirection() {
        return pk.ay(this).aa;
    }

    @Override // defpackage.i70
    public final void bn() {
    }
}

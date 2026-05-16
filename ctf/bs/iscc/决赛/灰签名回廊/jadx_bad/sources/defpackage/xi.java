package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xi extends x10 implements cv {
    public final /* synthetic */ h30 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ qw0 g;
    public final /* synthetic */ lw0 h;
    public final /* synthetic */ ey i;
    public final /* synthetic */ ab0 j;
    public final /* synthetic */ cw0 k;
    public final /* synthetic */ xj l;
    public final /* synthetic */ t8 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(h30 h30Var, boolean z, qw0 qw0Var, lw0 lw0Var, ey eyVar, ab0 ab0Var, cw0 cw0Var, xj xjVar, t8 t8Var) {
        super(1);
        this.e = h30Var;
        this.f = z;
        this.g = qw0Var;
        this.h = lw0Var;
        this.i = eyVar;
        this.j = ab0Var;
        this.k = cw0Var;
        this.l = xjVar;
        this.m = t8Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        ax0 ax0VarD;
        et etVar = (et) obj;
        h30 h30Var = this.e;
        if (h30Var.b() != etVar.a()) {
            h30Var.f.setValue(Boolean.valueOf(etVar.a()));
            boolean zB = h30Var.b();
            ab0 ab0Var = this.j;
            lw0 lw0Var = this.h;
            if (zB && this.f) {
                az0.k(this.g, h30Var, lw0Var, this.i, ab0Var);
            } else {
                az0.j(h30Var);
            }
            if (etVar.a() && (ax0VarD = h30Var.d()) != null) {
                i60.an(this.l, null, new i3(this.m, lw0Var, h30Var, ax0VarD, ab0Var, null, 3), 3);
            }
            if (!etVar.a()) {
                this.k.e(null);
            }
        }
        return wz0.a;
    }
}

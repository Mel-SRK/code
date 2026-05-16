package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h50 extends x10 implements pu {
    public final /* synthetic */ j50 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ nf0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(j50 j50Var, long j, long j2, nf0 nf0Var) {
        super(0);
        this.e = j50Var;
        this.f = j;
        this.g = j2;
        this.h = nf0Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        j50 j50Var = this.e;
        j50Var.bu().d = false;
        j50Var.bu().e = this.f;
        j50Var.bu().f = this.g;
        cv cvVarD = this.h.d.d();
        if (cvVarD != null) {
            cvVarD.g(j50Var.bu());
        }
        return wz0.a;
    }
}

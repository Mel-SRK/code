package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s50 extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ t50 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s50(t50 t50Var, int i) {
        super(0);
        this.e = i;
        this.f = t50Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        switch (this.e) {
            case 0:
                d20 d20Var = (d20) this.f.x.getValue();
                return new xa0(d20Var != null ? d20Var.am(0L) : 9205357640488583168L);
            case 1:
                return new xa0(this.f.z);
            default:
                this.f.bw();
                return wz0.a;
        }
    }
}

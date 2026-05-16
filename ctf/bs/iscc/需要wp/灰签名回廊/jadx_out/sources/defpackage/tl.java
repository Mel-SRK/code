package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tl implements vc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tl(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vc
    public final long a() {
        switch (this.a) {
            case 0:
                vl vlVar = (vl) this.b;
                long jA = vlVar.w.a();
                if (jA != 16) {
                    return jA;
                }
                ik0 ik0Var = (ik0) i60.ab(vlVar, mk0.b);
                if (ik0Var != null) {
                    long j = ik0Var.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((qc) i60.ab(vlVar, jh.a)).a;
            default:
                return ((pk0) this.b).b;
        }
    }
}

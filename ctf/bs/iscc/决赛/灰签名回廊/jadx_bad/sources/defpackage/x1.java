package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends x10 implements gv {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ b1 f;
    public final /* synthetic */ c5 g;
    public final /* synthetic */ gv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(b1 b1Var, c5 c5Var, gv gvVar) {
        super(2);
        this.f = b1Var;
        this.g = c5Var;
        this.h = gvVar;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                vf vfVar = (vf) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (vfVar.an(iIntValue & 1, (iIntValue & 3) != 2)) {
                    og.a(this.f, this.g, this.h, vfVar, 0);
                } else {
                    vfVar.aq();
                }
                break;
            default:
                ((Number) obj2).intValue();
                og.a(this.f, this.g, this.h, (vf) obj, d41.ar(1));
                break;
        }
        return wz0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(b1 b1Var, c5 c5Var, gv gvVar, int i) {
        super(2);
        this.f = b1Var;
        this.g = c5Var;
        this.h = gvVar;
    }
}

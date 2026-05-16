package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gd0 extends x10 implements hv {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ g11 h;
    public final /* synthetic */ g80 i;
    public final /* synthetic */ gv j;
    public final /* synthetic */ gv0 k;
    public final /* synthetic */ aq0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd0(String str, boolean z, boolean z2, g11 g11Var, g80 g80Var, gv gvVar, gv0 gv0Var, aq0 aq0Var) {
        super(3);
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = g11Var;
        this.i = g80Var;
        this.j = gvVar;
        this.k = gv0Var;
        this.l = aq0Var;
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        gv gvVar = (gv) obj;
        vf vfVar = (vf) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= vfVar.h(gvVar) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && vfVar.z()) {
            vfVar.aq();
        } else {
            ed0 ed0Var = ed0.a;
            aq0 aq0Var = this.l;
            boolean z = this.f;
            g80 g80Var = this.i;
            gv0 gv0Var = this.k;
            ed0Var.b(this.e, gvVar, z, this.g, this.h, g80Var, this.j, gv0Var, null, t1.aq(2108828640, new fd0(z, g80Var, gv0Var, aq0Var), vfVar), vfVar, (iIntValue << 3) & 112);
        }
        return wz0.a;
    }
}

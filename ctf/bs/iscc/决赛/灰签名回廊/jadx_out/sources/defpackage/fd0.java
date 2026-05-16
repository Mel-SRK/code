package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fd0 extends x10 implements gv {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ g80 f;
    public final /* synthetic */ gv0 g;
    public final /* synthetic */ aq0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd0(boolean z, g80 g80Var, gv0 gv0Var, aq0 aq0Var) {
        super(2);
        this.e = z;
        this.f = g80Var;
        this.g = gv0Var;
        this.h = aq0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        vf vfVar = (vf) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && vfVar.z()) {
            vfVar.aq();
        } else {
            ed0.a.a(this.e, this.f, null, this.g, this.h, 0.0f, 0.0f, vfVar, 100663296, 200);
        }
        return wz0.a;
    }
}

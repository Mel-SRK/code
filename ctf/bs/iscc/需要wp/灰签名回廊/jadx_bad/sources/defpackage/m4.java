package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m4 extends x10 implements gv {
    public final /* synthetic */ i11 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ j70 h;
    public final /* synthetic */ bb0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(i11 i11Var, long j, boolean z, j70 j70Var, bb0 bb0Var) {
        super(2);
        this.e = i11Var;
        this.f = j;
        this.g = z;
        this.h = j70Var;
        this.i = bb0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        vf vfVar = (vf) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && vfVar.z()) {
            vfVar.aq();
        } else {
            az0.a(og.s.a(this.e), t1.aq(-1426434671, new l4(this.f, this.g, this.h, this.i), vfVar), vfVar, 56);
        }
        return wz0.a;
    }
}

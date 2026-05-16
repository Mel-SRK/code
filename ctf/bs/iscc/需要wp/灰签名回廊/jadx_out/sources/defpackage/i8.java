package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i8 extends x10 implements cv {
    public final /* synthetic */ ri0 e;
    public final /* synthetic */ xi0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ c8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(ri0 ri0Var, xi0 xi0Var, long j, c8 c8Var) {
        super(1);
        this.e = ri0Var;
        this.f = xi0Var;
        this.g = j;
        this.h = c8Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) throws Throwable {
        ra raVar;
        u20 u20Var = (u20) obj;
        u20Var.a();
        ri0 ri0Var = this.e;
        float f = ri0Var.a;
        float f2 = ri0Var.b;
        xi0 xi0Var = this.f;
        long j = this.g;
        c8 c8Var = this.h;
        ra raVar2 = u20Var.d;
        ((bu) raVar2.e.a).q(f, f2);
        try {
            raVar = raVar2;
            try {
                raVar2.d.c.d((c3) xi0Var.d, j, j, raVar2.d(null, ir.a, 1.0f, c8Var, 3));
                ((bu) raVar.e.a).q(-f, -f2);
                return wz0.a;
            } catch (Throwable th) {
                th = th;
                ((bu) raVar.e.a).q(-f, -f2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            raVar = raVar2;
        }
    }
}

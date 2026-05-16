package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q4 extends x10 implements cv {
    public final /* synthetic */ pu e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ c3 g;
    public final /* synthetic */ c8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(pu puVar, boolean z, c3 c3Var, c8 c8Var) {
        super(1);
        this.e = puVar;
        this.f = z;
        this.g = c3Var;
        this.h = c8Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        u20 u20Var = (u20) obj;
        u20Var.a();
        ra raVar = u20Var.d;
        if (((Boolean) this.e.a()).booleanValue()) {
            boolean z = this.f;
            c3 c3Var = this.g;
            c8 c8Var = this.h;
            if (z) {
                long jAn = raVar.an();
                o6 o6Var = raVar.e;
                long jR = o6Var.r();
                o6Var.o().l();
                try {
                    ((bu) o6Var.a).o(-1.0f, 1.0f, jAn);
                    raVar.e(c3Var, c8Var);
                } finally {
                    o6Var.o().i();
                    o6Var.ab(jR);
                }
            } else {
                raVar.e(c3Var, c8Var);
            }
        }
        return wz0.a;
    }
}

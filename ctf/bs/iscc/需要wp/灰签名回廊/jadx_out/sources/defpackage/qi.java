package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qi extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [pu, x10] */
    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                h30 h30Var = (h30) this.f;
                if (h30Var.b()) {
                    qw0 qw0Var = (qw0) this.g;
                    lw0 lw0Var = (lw0) this.h;
                    f1 f1Var = h30Var.d;
                    ey eyVar = (ey) this.i;
                    wi wiVar = h30Var.t;
                    wi wiVar2 = h30Var.u;
                    xi0 xi0Var = new xi0();
                    g5 g5Var = new g5(f1Var, wiVar, xi0Var, 8);
                    gg0 gg0Var = qw0Var.a;
                    gg0Var.a(lw0Var, eyVar, g5Var, wiVar2);
                    uw0 uw0Var = new uw0(qw0Var, gg0Var);
                    qw0Var.b.set(uw0Var);
                    xi0Var.d = uw0Var;
                    h30Var.e = uw0Var;
                }
                return new z3(1);
            default:
                p5 p5Var = (p5) obj;
                float fFloatValue = ((Number) p5Var.e.getValue()).floatValue();
                ui0 ui0Var = (ui0) this.f;
                float f = fFloatValue - ui0Var.d;
                float fA = ((nn0) this.g).a(f);
                ui0Var.d = ((Number) p5Var.e.getValue()).floatValue();
                ((ui0) this.h).d = ((Number) p5Var.a.b.g(p5Var.f)).floatValue();
                if (Math.abs(f - fA) > 0.5f) {
                    p5Var.i.setValue(Boolean.FALSE);
                    p5Var.d.a();
                }
                ((f1) this.i).getClass();
                return wz0.a;
        }
    }
}

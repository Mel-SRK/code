package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j8 extends x10 implements cv {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ i9 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ gt0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(boolean z, vr0 vr0Var, long j, float f, float f2, long j2, long j3, gt0 gt0Var) {
        super(1);
        this.e = z;
        this.f = vr0Var;
        this.g = j;
        this.h = f;
        this.i = f2;
        this.j = j2;
        this.k = j3;
        this.l = gt0Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        u20 u20Var = (u20) obj;
        u20Var.a();
        ra raVar = u20Var.d;
        if (this.e) {
            xo.ac(u20Var, this.f, 0L, 0L, this.g, null, 246);
        } else {
            long j = this.g;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float f = this.h;
            if (fIntBitsToFloat < f) {
                float f2 = this.i;
                float fD = pq0.d(raVar.c());
                float f3 = this.i;
                float f4 = fD - f3;
                float fB = pq0.b(raVar.c()) - f3;
                i9 i9Var = this.f;
                long j2 = this.g;
                o6 o6Var = raVar.e;
                long jR = o6Var.r();
                o6Var.o().l();
                try {
                    ((o6) ((bu) o6Var.a).e).o().e(f2, f2, f4, fB, 0);
                    xo.ac(u20Var, i9Var, 0L, 0L, j2, null, 246);
                } finally {
                    o6Var.o().i();
                    o6Var.ab(jR);
                }
            } else {
                xo.ac(u20Var, this.f, this.j, this.k, m10.au(j, f), this.l, 208);
            }
        }
        return wz0.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h8 extends x10 implements cv {
    public final /* synthetic */ i9 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ yo h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(vr0 vr0Var, long j, long j2, yo yoVar) {
        super(1);
        this.e = vr0Var;
        this.f = j;
        this.g = j2;
        this.h = yoVar;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        u20 u20Var = (u20) obj;
        u20Var.a();
        long j = (104 & 2) != 0 ? 0L : this.f;
        long jBh = (104 & 4) != 0 ? xo.bh(u20Var.d.c(), j) : this.g;
        float f = (104 & 8) != 0 ? 1.0f : 0.0f;
        yo yoVar = (104 & 16) != 0 ? ir.a : this.h;
        ra raVar = u20Var.d;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        raVar.d.c.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jBh >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (jBh & 4294967295L)) + Float.intBitsToFloat(i2), raVar.d(this.e, yoVar, f, null, 3));
        return wz0.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zn0 extends x10 implements pu {
    public final /* synthetic */ tv e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ nq0 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(tv tvVar, int i, int i2, nq0 nq0Var, x20 x20Var) {
        super(0);
        this.e = tvVar;
        this.f = i;
        this.g = i2;
        this.h = nq0Var;
        this.i = x20Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, x20] */
    @Override // defpackage.pu
    public final Object a() {
        tv tvVar = this.e;
        zw0 zw0Var = (zw0) tvVar.e;
        int iIntValue = ((Number) this.i.getValue()).intValue();
        nq0 nq0Var = this.h;
        boolean z = nq0Var.a;
        boolean z2 = nq0Var.a() == 1;
        int i = this.f;
        long jK = zw0Var.k(i);
        int i2 = hx0.c;
        int iH = (int) (jK >> 32);
        int iE = zw0Var.e(iH);
        int i3 = zw0Var.b.f;
        if (iE != iIntValue) {
            iH = iIntValue >= i3 ? zw0Var.h(i3 - 1) : zw0Var.h(iIntValue);
        }
        int iD = (int) (jK & 4294967295L);
        if (zw0Var.e(iD) != iIntValue) {
            iD = iIntValue >= i3 ? zw0Var.d(i3 - 1, false) : zw0Var.d(iIntValue, false);
        }
        int i4 = this.g;
        if (iH == i4) {
            return tvVar.a(iD);
        }
        if (iD == i4) {
            return tvVar.a(iH);
        }
        if (!(z ^ z2) ? i >= iH : i > iD) {
            iH = iD;
        }
        return tvVar.a(iH);
    }
}

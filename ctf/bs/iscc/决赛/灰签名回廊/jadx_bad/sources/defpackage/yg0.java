package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yg0 extends x10 implements pu {
    public final /* synthetic */ wi0 e;
    public final /* synthetic */ zg0 f;
    public final /* synthetic */ tz g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg0(wi0 wi0Var, zg0 zg0Var, tz tzVar, long j, long j2) {
        super(0);
        this.e = wi0Var;
        this.f = zg0Var;
        this.g = tzVar;
        this.h = j;
        this.i = j2;
    }

    @Override // defpackage.pu
    public final Object a() {
        zg0 zg0Var = this.f;
        this.e.d = zg0Var.getPositionProvider().a(this.g, this.h, zg0Var.getParentLayoutDirection(), this.i);
        return wz0.a;
    }
}

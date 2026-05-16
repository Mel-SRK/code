package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wv0 extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ zv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv0(zv0 zv0Var, int i) {
        super(0);
        this.e = i;
        this.f = zv0Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(this.f.a.g() > 0.0f);
            default:
                zv0 zv0Var = this.f;
                return Boolean.valueOf(zv0Var.a.g() < zv0Var.b.g());
        }
    }
}

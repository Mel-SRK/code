package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vm0 extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ wm0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vm0(wm0 wm0Var, int i) {
        super(0);
        this.e = i;
        this.f = wm0Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        switch (this.e) {
            case 0:
                return Float.valueOf(this.f.r.a.g());
            default:
                return Float.valueOf(this.f.r.d.g());
        }
    }
}

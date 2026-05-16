package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ao0 extends x10 implements pu {
    public final /* synthetic */ tv e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao0(tv tvVar, int i) {
        super(0);
        this.e = tvVar;
        this.f = i;
    }

    @Override // defpackage.pu
    public final Object a() {
        return Integer.valueOf(((zw0) this.e.e).e(this.f));
    }
}

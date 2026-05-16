package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gn extends x10 implements pu {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ bm0 f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(boolean z, bm0 bm0Var, String str) {
        super(0);
        this.e = z;
        this.f = bm0Var;
        this.g = str;
    }

    @Override // defpackage.pu
    public final Object a() {
        if (this.e) {
            bm0 bm0Var = this.f;
            String str = this.g;
            dm0 dm0Var = bm0Var.a;
            synchronized (dm0Var.c) {
            }
        }
        return wz0.a;
    }
}

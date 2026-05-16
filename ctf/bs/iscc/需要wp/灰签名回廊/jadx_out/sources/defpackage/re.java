package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class re implements gv {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ re(int i, int i2, Object obj, Object obj2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.e = i;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iAr = d41.ar(this.e) | 1;
                ((te) this.f).e(this.g, (vf) obj, iAr);
                break;
            case 1:
                ((Integer) obj2).getClass();
                az0.a((ci0) this.f, (gv) this.g, (vf) obj, d41.ar(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                az0.b((ci0[]) this.f, (gv) this.g, (vf) obj, d41.ar(this.e | 1));
                break;
        }
        return wz0.a;
    }
}

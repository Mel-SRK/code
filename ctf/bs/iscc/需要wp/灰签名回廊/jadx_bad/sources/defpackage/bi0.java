package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bi0 extends x10 implements gv {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ nx0 g;
    public final /* synthetic */ gv h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi0(long j, nx0 nx0Var, gv gvVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.f = j;
        this.g = nx0Var;
        this.h = gvVar;
        this.i = i;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Number) obj2).intValue();
                m10.f(this.f, this.g, this.h, (vf) obj, d41.ar(this.i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                qv0.b(this.f, this.g, this.h, (vf) obj, d41.ar(this.i | 1));
                break;
        }
        return wz0.a;
    }
}

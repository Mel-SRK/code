package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class di extends x10 implements gv {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ rh g;
    public final /* synthetic */ j70 h;
    public final /* synthetic */ x10 i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public di(String str, boolean z, rh rhVar, j70 j70Var, pu puVar, int i) {
        super(2);
        this.e = str;
        this.f = z;
        this.g = rhVar;
        this.h = j70Var;
        this.i = (x10) puVar;
        this.j = i;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [pu, x10] */
    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fi.b(this.e, this.f, this.g, this.h, this.i, (vf) obj, d41.ar(this.j | 1));
        return wz0.a;
    }
}

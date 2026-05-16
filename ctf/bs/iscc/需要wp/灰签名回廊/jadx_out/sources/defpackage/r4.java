package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r4 extends x10 implements cv {
    public final /* synthetic */ long e;
    public final /* synthetic */ pu f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(long j, pu puVar, boolean z) {
        super(1);
        this.e = j;
        this.f = puVar;
        this.g = z;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        y9 y9Var = (y9) obj;
        return y9Var.a(new q4(this.f, this.g, pk.t(y9Var, pq0.d(y9Var.d.c()) / 2.0f), new c8(this.e, 5)));
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends ki {
    public v2 g;
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ v2 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(v2 v2Var, ki kiVar) {
        super(kiVar);
        this.j = v2Var;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(0L, null, this);
    }
}

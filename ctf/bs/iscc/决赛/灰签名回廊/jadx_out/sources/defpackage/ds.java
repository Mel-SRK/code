package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ds extends ki {
    public es g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ es j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(es esVar, ji jiVar) {
        super(jiVar);
        this.j = esVar;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.i(null, this);
    }
}

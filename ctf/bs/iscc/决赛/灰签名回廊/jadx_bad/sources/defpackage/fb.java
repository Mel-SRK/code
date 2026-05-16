package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fb extends ki {
    public gb g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ gb j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(gb gbVar, ji jiVar) {
        super(jiVar);
        this.j = gbVar;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.i(null, this);
    }
}

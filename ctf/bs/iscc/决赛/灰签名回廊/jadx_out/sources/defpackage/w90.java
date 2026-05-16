package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w90 extends ki {
    public long g;
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ y90 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(y90 y90Var, ki kiVar) {
        super(kiVar);
        this.j = y90Var;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.bv(0L, 0L, this);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends ki {
    public /* synthetic */ Object g;
    public final /* synthetic */ b1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, ki kiVar) {
        super(kiVar);
        this.h = b1Var;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        this.h.ag(null, this);
        return yj.d;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ko extends ki {
    public in0 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ in0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(in0 in0Var, ki kiVar) {
        super(kiVar);
        this.i = in0Var;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return in0.bx(this.i, this);
    }
}

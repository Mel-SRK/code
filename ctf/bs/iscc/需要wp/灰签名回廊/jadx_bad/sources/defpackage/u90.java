package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u90 extends ki {
    public /* synthetic */ Object g;
    public final /* synthetic */ a0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(a0 a0Var, ki kiVar) {
        super(kiVar);
        this.h = a0Var;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(0L, 0L, this);
    }
}

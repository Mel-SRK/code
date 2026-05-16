package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aj0 extends ki {
    public /* synthetic */ Object g;
    public final /* synthetic */ rx h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj0(rx rxVar, ki kiVar) {
        super(kiVar);
        this.h = rxVar;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(0.0f, this);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hn extends ki {
    public /* synthetic */ Object g;
    public final /* synthetic */ in h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(in inVar, ji jiVar) {
        super(jiVar);
        this.h = inVar;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.i(null, this);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dn0 extends ki {
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ en0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn0(en0 en0Var, ki kiVar) {
        super(kiVar);
        this.i = en0Var;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(0L, 0L, this);
    }
}

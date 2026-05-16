package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x90 extends ki {
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ y90 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x90(y90 y90Var, ki kiVar) {
        super(kiVar);
        this.i = y90Var;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.bx(0L, this);
    }
}

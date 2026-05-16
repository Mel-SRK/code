package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class df extends ki {
    public Object g;
    public tz h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ff l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(ff ffVar, ki kiVar) {
        super(kiVar);
        this.l = ffVar;
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return ff.a(this.l, null, null, this);
    }
}

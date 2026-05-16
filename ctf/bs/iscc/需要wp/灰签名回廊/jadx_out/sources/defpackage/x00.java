package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x00 extends la {
    public final a10 l;

    public x00(ji jiVar, td tdVar) {
        super(1, jiVar);
        this.l = tdVar;
    }

    @Override // defpackage.la
    public final String aa() {
        return "AwaitContinuation";
    }

    @Override // defpackage.la
    public final Throwable r(a10 a10Var) {
        Throwable thC;
        a10 a10Var2 = this.l;
        a10Var2.getClass();
        Object obj = a10.d.get(a10Var2);
        return (!(obj instanceof z00) || (thC = ((z00) obj).c()) == null) ? obj instanceof wd ? ((wd) obj).a : a10Var.q() : thC;
    }
}

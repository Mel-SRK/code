package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cw implements cv {
    public final /* synthetic */ int d;
    public final /* synthetic */ ov e;

    /* JADX WARN: Multi-variable type inference failed */
    public cw(cv cvVar, int i) {
        this.d = i;
        switch (i) {
            case 1:
                this.e = (x10) cvVar;
                break;
            default:
                this.e = cvVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [cv, x10] */
    @Override // defpackage.cv
    public final Object g(Object obj) {
        long j;
        switch (this.d) {
            case 0:
                cr0 cr0Var = (cr0) obj;
                synchronized (fr0.c) {
                    j = fr0.e;
                    fr0.e = ((long) 1) + j;
                }
                return new ei0(j, cr0Var, (cv) this.e);
            default:
                return ((x10) this.e).g(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}

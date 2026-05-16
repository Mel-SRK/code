package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zv implements cv {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zv(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

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
                return new v80(j, cr0Var, (cv) this.e, (cv) this.f);
            default:
                y10 y10Var = (y10) this.e;
                Object obj2 = y10Var.a;
                la laVar = (la) this.f;
                synchronized (obj2) {
                    y10Var.b.remove(laVar);
                }
                return wz0.a;
        }
    }
}

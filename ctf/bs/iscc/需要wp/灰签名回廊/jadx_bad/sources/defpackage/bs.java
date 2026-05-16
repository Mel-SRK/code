package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bs implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ pu e;

    public /* synthetic */ bs(pu puVar, int i) {
        this.d = i;
        this.e = puVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.a();
                break;
            case 1:
                this.e.a();
                break;
            default:
                this.e.a();
                break;
        }
    }
}

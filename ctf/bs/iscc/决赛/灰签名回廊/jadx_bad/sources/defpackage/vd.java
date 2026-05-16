package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vd implements ji {
    public static final vd e = new vd(0);
    public static final vd f = new vd(1);
    public final /* synthetic */ int d;

    public /* synthetic */ vd(int i) {
        this.d = i;
    }

    @Override // defpackage.ji
    public final pj e() {
        switch (this.d) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return pq.d;
        }
    }

    @Override // defpackage.ji
    public final void h(Object obj) {
        switch (this.d) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.d) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}

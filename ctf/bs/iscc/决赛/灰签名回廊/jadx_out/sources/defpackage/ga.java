package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ga implements oa0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ga(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((cv) this.b).getClass().getSimpleName() + '@' + pk.ae(this) + ']';
            default:
                return "DisposeOnCancel[" + ((en) this.b) + ']';
        }
    }
}

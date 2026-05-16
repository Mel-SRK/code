package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg implements pu {
    public final /* synthetic */ int d;

    @Override // defpackage.pu
    public final Object a() {
        switch (this.d) {
            case 0:
                xs0 xs0Var = ig.a;
                return null;
            case 1:
                xf.d("Unexpected call to default provider");
                throw new xd();
            case 2:
                xs0 xs0Var2 = kz.a;
                return null;
            case 3:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 4:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            default:
                xs0 xs0Var3 = tl0.a;
                return null;
        }
    }
}

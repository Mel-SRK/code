package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oi extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ w80 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi(w80 w80Var, int i) {
        super(0);
        this.e = i;
        this.f = w80Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) this.f.getValue();
                bool.booleanValue();
                return bool;
            default:
                return (ck0) this.f.getValue();
        }
    }
}

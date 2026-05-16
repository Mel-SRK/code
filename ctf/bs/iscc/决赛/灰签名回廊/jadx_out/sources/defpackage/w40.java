package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w40 extends wh0 implements h10 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w40(Object obj, Class cls, String str, String str2, int i, int i2) {
        super(i, cls, obj, str, str2);
        this.k = i2;
    }

    @Override // defpackage.pu
    public final Object a() {
        return get();
    }

    @Override // defpackage.ea
    public final c10 d() {
        yi0.a.getClass();
        return this;
    }

    @Override // defpackage.h10
    public final Object get() {
        switch (this.k) {
            case 0:
                return this.e.getClass().getSimpleName();
            default:
                return ((ms0) this.e).getValue();
        }
    }
}

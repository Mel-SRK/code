package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w01 extends x10 implements gv {
    public final /* synthetic */ int e;
    public final /* synthetic */ tx[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w01(tx[] txVarArr, int i) {
        super(2);
        this.e = i;
        this.f = txVarArr;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return Float.valueOf(e00.i((kf0) obj, true, this.f, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(e00.i((kf0) obj, false, this.f, ((Number) obj2).floatValue()));
        }
    }
}

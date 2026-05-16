package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dp0 extends x10 implements gv {
    public static final dp0 f;
    public static final dp0 g;
    public final /* synthetic */ int e;

    static {
        int i = 2;
        f = new dp0(i, 0);
        g = new dp0(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp0(int i, int i2) {
        super(i);
        this.e = i2;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                uo0 uo0Var = (uo0) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                po0 po0Var = ((uo0) obj).d;
                cp0 cp0Var = zo0.s;
                Object objG = po0Var.d.g(cp0Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = uo0Var.d.d.g(cp0Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            default:
                return obj == null ? obj2 : obj;
        }
    }
}

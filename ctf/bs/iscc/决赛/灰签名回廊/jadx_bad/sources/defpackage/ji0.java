package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ji0 extends tt0 implements gv {
    public final /* synthetic */ int h;
    public /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji0(int i, ji jiVar, int i2) {
        super(i, jiVar);
        this.h = i2;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                return ((ji0) k((ji) obj2, (ii0) obj)).o(wz0.a);
            default:
                return ((ji0) k((ji) obj2, (jq0) obj)).o(wz0.a);
        }
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                ji0 ji0Var = new ji0(2, jiVar, 0);
                ji0Var.i = obj;
                return ji0Var;
            default:
                ji0 ji0Var2 = new ji0(2, jiVar, 1);
                ji0Var2.i = obj;
                return ji0Var2;
        }
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        switch (this.h) {
            case 0:
                i60.az(obj);
                return Boolean.valueOf(((ii0) this.i) == ii0.d);
            default:
                i60.az(obj);
                return Boolean.valueOf(((jq0) this.i) != jq0.d);
        }
    }
}

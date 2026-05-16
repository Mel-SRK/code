package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class w4 extends tt0 implements gv {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4(int i, ji jiVar, int i2) {
        super(i, jiVar);
        this.h = i2;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                return ((w4) k((ji) obj2, (xj) obj)).o(wz0.a);
            default:
                w4 w4Var = (w4) k((ji) obj2, (tg0) obj);
                wz0 wz0Var = wz0.a;
                w4Var.o(wz0Var);
                return wz0Var;
        }
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                return new w4(2, jiVar, 0);
            default:
                return new w4(2, jiVar, 1);
        }
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        switch (this.h) {
            case 0:
                i60.az(obj);
                return Choreographer.getInstance();
            default:
                i60.az(obj);
                return wz0.a;
        }
    }
}

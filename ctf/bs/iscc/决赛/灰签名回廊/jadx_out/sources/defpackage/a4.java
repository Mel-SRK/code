package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class a4 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ zg0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4(zg0 zg0Var, int i) {
        super(1);
        this.e = i;
        this.f = zg0Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                d20 d20VarL = ((d20) obj).l();
                d20VarL.getClass();
                this.f.k(d20VarL);
                break;
            case 1:
                wz wzVar = new wz(((wz) obj).a);
                zg0 zg0Var = this.f;
                zg0Var.m7setPopupContentSizefhxjrPA(wzVar);
                zg0Var.l();
                break;
            default:
                pu puVar = (pu) obj;
                zg0 zg0Var2 = this.f;
                Handler handler = zg0Var2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    puVar.a();
                } else {
                    Handler handler2 = zg0Var2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new bs(puVar, 2));
                    }
                }
                break;
        }
        return wz0.a;
    }
}

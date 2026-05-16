package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ b1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(b1 b1Var, int i) {
        super(0);
        this.e = i;
        this.f = b1Var;
    }

    @Override // defpackage.pu
    public final Object a() {
        int actionMasked;
        switch (this.e) {
            case 0:
                b1 b1Var = this.f;
                MotionEvent motionEvent = b1Var.br;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    b1Var.bs = SystemClock.uptimeMillis();
                    b1Var.post(b1Var.bx);
                }
                return wz0.a;
            default:
                return this.f.get_viewTreeOwners();
        }
    }
}

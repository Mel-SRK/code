package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements Runnable {
    public final /* synthetic */ b1 d;

    public z0(b1 b1Var) {
        this.d = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b1 b1Var = this.d;
        b1Var.removeCallbacks(this);
        MotionEvent motionEvent = b1Var.br;
        if (motionEvent != null) {
            boolean z = motionEvent.getToolType(0) == 3;
            int actionMasked = motionEvent.getActionMasked();
            if (z) {
                if (actionMasked == 10 || actionMasked == 1) {
                    return;
                }
            } else if (actionMasked == 1) {
                return;
            }
            int i = 7;
            if (actionMasked != 7 && actionMasked != 9) {
                i = 2;
            }
            b1Var.af(motionEvent, i, b1Var.bs, false);
        }
    }
}

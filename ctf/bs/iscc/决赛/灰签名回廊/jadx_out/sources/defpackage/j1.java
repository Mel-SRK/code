package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ k1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(k1 k1Var, int i) {
        super(1);
        this.e = i;
        this.f = k1Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                View view = this.f.d;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                tm0 tm0Var = (tm0) obj;
                if (tm0Var.e.contains(tm0Var)) {
                    k1 k1Var = this.f;
                    k1Var.d.getSnapshotObserver().a(tm0Var, k1Var.ap, new s0(1, tm0Var, k1Var));
                }
                return wz0.a;
        }
    }
}

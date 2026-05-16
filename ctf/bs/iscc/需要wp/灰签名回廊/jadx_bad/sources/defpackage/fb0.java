package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class fb0 implements OnBackAnimationCallback {
    public final /* synthetic */ eb0 a;

    public fb0(eb0 eb0Var) {
        this.a = eb0Var;
    }

    public final void onBackCancelled() {
        eb0 eb0Var = this.a;
        k90 k90Var = eb0Var.a;
        if (k90Var == null) {
            wc.q("This input is not added to any dispatcher.");
            return;
        }
        if (!eb0Var.b) {
            k90Var.b(eb0Var, null);
        }
        n90 n90Var = k90Var.b;
        n90Var.getClass();
        if (eb0Var.equals(n90Var.f) && -1 == n90Var.e) {
            n90Var.b();
            n90Var.e = 0;
            n90Var.f = null;
            ps0 ps0Var = n90Var.a;
            o90 o90Var = o90.k;
            ps0Var.getClass();
            ps0Var.h(null, o90Var);
        }
        eb0Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        j90 j90VarE = m10.e(backEvent);
        eb0 eb0Var = this.a;
        k90 k90Var = eb0Var.a;
        if (k90Var == null) {
            wc.q("This input is not added to any dispatcher.");
            return;
        }
        if (eb0Var.b) {
            n90 n90Var = k90Var.b;
            n90Var.getClass();
            if (eb0Var.equals(n90Var.f) && -1 == n90Var.e) {
                n90Var.b();
                ps0 ps0Var = n90Var.a;
                p90 p90Var = new p90(j90VarE);
                ps0Var.getClass();
                ps0Var.h(null, p90Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        j90 j90VarE = m10.e(backEvent);
        eb0 eb0Var = this.a;
        k90 k90Var = eb0Var.a;
        if (k90Var == null) {
            wc.q("This input is not added to any dispatcher.");
        } else {
            if (eb0Var.b) {
                return;
            }
            k90Var.b(eb0Var, j90VarE);
            eb0Var.b = true;
        }
    }
}

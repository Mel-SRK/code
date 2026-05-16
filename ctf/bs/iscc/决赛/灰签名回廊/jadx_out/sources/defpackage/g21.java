package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g21 implements Runnable {
    public final /* synthetic */ View d;
    public final /* synthetic */ m21 e;
    public final /* synthetic */ f1 f;
    public final /* synthetic */ ValueAnimator g;

    public g21(View view, m21 m21Var, f1 f1Var, ValueAnimator valueAnimator) {
        this.d = view;
        this.e = m21Var;
        this.f = f1Var;
        this.g = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i21.i(this.d, this.e, this.f);
        this.g.start();
    }
}

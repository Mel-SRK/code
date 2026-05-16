package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class f21 extends AnimatorListenerAdapter {
    public final /* synthetic */ m21 a;
    public final /* synthetic */ View b;

    public f21(m21 m21Var, View view) {
        this.a = m21Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m21 m21Var = this.a;
        m21Var.a.e(1.0f);
        i21.f(m21Var, this.b);
    }
}

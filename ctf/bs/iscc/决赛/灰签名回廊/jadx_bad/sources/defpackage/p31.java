package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class p31 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View d;
    public final /* synthetic */ mi0 e;

    public p31(View view, mi0 mi0Var) {
        this.d = view;
        this.e = mi0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.d.removeOnAttachStateChangeListener(this);
        this.e.u();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

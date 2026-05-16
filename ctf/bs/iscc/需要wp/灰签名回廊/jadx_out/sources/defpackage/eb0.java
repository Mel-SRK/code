package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class eb0 extends m90 {
    public final OnBackInvokedDispatcher c;
    public final OnBackInvokedCallback d;
    public boolean e;

    public eb0(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.c = onBackInvokedDispatcher;
        this.d = Build.VERSION.SDK_INT == 33 ? new i6(1, this) : new fb0(this);
    }

    @Override // defpackage.m90
    public final void b() {
        if (this.e) {
            this.c.unregisterOnBackInvokedCallback(this.d);
            this.e = false;
        }
    }
}

package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class c2 implements ComponentCallbacks2 {
    public final /* synthetic */ pj0 d;

    public c2(pj0 pj0Var) {
        this.d = pj0Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        pj0 pj0Var = this.d;
        synchronized (pj0Var) {
            pj0Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        pj0 pj0Var = this.d;
        synchronized (pj0Var) {
            pj0Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        pj0 pj0Var = this.d;
        synchronized (pj0Var) {
            pj0Var.a.c();
        }
    }
}

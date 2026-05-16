package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class lp extends kp {
    @Override // defpackage.jp, defpackage.e00
    public void al(eu0 eu0Var, eu0 eu0Var2, Window window, View view, boolean z, boolean z2) {
        eu0Var.getClass();
        eu0Var2.getClass();
        window.getClass();
        view.getClass();
        q6.t(window);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i = Build.VERSION.SDK_INT;
        wn0 i31Var = i >= 35 ? new i31(window) : i >= 30 ? new h31(window) : i >= 26 ? new g31(window) : new f31(window);
        i31Var.n(!z);
        i31Var.m(!z2);
    }
}

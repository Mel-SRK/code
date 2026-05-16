package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class np extends mp {
    @Override // defpackage.lp, defpackage.jp, defpackage.e00
    public void al(eu0 eu0Var, eu0 eu0Var2, Window window, View view, boolean z, boolean z2) {
        eu0Var.getClass();
        eu0Var2.getClass();
        window.getClass();
        view.getClass();
        q6.t(window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) != 0 || attributes.width != -2 || attributes.height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(new zh0(viewGroup.getContext(), f00.z(new xc(2, 0), new xc(1, 0), new xc(4, 0), new xc(8, 0))));
        }
        window.setNavigationBarContrastEnforced(true);
        int i = Build.VERSION.SDK_INT;
        wn0 i31Var = i >= 35 ? new i31(window) : i >= 30 ? new h31(window) : i >= 26 ? new g31(window) : new f31(window);
        i31Var.n(!z);
        i31Var.m(!z2);
    }
}

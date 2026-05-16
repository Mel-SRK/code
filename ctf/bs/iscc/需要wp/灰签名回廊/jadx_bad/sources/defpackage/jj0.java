package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.lj0;

/* JADX INFO: loaded from: classes.dex */
public abstract class jj0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, n30 n30Var) {
        n30Var.getClass();
        if (activity instanceof u30) {
            p30 lifecycle = ((u30) activity).getLifecycle();
            if (lifecycle instanceof w30) {
                ((w30) lifecycle).e(n30Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            lj0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new lj0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new lj0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}

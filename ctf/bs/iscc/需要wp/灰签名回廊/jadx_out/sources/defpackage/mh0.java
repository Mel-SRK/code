package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class mh0 extends nq {
    final /* synthetic */ nh0 this$0;

    public static final class a extends nq {
        final /* synthetic */ nh0 this$0;

        public a(nh0 nh0Var) {
            this.this$0 = nh0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            nh0 nh0Var = this.this$0;
            int i = nh0Var.d + 1;
            nh0Var.d = i;
            if (i == 1 && nh0Var.g) {
                nh0Var.i.e(n30.ON_START);
                nh0Var.g = false;
            }
        }
    }

    public mh0(nh0 nh0Var) {
        this.this$0 = nh0Var;
    }

    @Override // defpackage.nq, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = lj0.e;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((lj0) fragmentFindFragmentByTag).d = this.this$0.k;
        }
    }

    @Override // defpackage.nq, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        nh0 nh0Var = this.this$0;
        int i = nh0Var.e - 1;
        nh0Var.e = i;
        if (i == 0) {
            Handler handler = nh0Var.h;
            handler.getClass();
            handler.postDelayed(nh0Var.j, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        ih.i(activity, new a(this.this$0));
    }

    @Override // defpackage.nq, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        nh0 nh0Var = this.this$0;
        int i = nh0Var.d - 1;
        nh0Var.d = i;
        if (i == 0 && nh0Var.f) {
            nh0Var.i.e(n30.ON_STOP);
            nh0Var.g = true;
        }
    }
}

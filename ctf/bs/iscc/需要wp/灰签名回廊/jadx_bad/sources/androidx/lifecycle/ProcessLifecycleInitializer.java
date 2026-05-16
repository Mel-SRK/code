package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.mh0;
import defpackage.n30;
import defpackage.nh0;
import defpackage.o6;
import defpackage.q30;
import defpackage.r30;
import defpackage.rq;
import defpackage.ry;
import defpackage.wc;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements ry {
    @Override // defpackage.ry
    public final List a() {
        return rq.d;
    }

    @Override // defpackage.ry
    public final Object b(Context context) {
        context.getClass();
        o6 o6VarP = o6.p(context);
        o6VarP.getClass();
        if (!((HashSet) o6VarP.b).contains(ProcessLifecycleInitializer.class)) {
            wc.q("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!r30.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new q30());
        }
        nh0 nh0Var = nh0.l;
        nh0Var.getClass();
        nh0Var.h = new Handler();
        nh0Var.i.e(n30.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new mh0(nh0Var));
        return nh0Var;
    }
}

package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zd implements pu {
    public final /* synthetic */ int d;
    public final /* synthetic */ MainActivity e;

    public /* synthetic */ zd(MainActivity mainActivity, int i) {
        this.d = i;
        this.e = mainActivity;
    }

    @Override // defpackage.pu
    public final Object a() {
        switch (this.d) {
            case 0:
                MainActivity mainActivity = this.e;
                ib0 ib0Var = new ib0(new ce(mainActivity, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (f00.h(Looper.myLooper(), Looper.getMainLooper())) {
                        mainActivity.getLifecycle().a(new de(0, ib0Var, mainActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new f2(1, mainActivity, ib0Var));
                    }
                }
                return ib0Var;
            case 1:
                this.e.reportFullyDrawn();
                return wz0.a;
            case 2:
                return oe.b(this.e);
            case 3:
                qm qmVar = new qm();
                k90 navigationEventDispatcher = this.e.getNavigationEventDispatcher();
                if (navigationEventDispatcher.c.add(qmVar)) {
                    navigationEventDispatcher.b.a(navigationEventDispatcher, qmVar, -1);
                }
                return qmVar;
            case 4:
                MainActivity mainActivity2 = this.e;
                return new fm0(mainActivity2.getApplication(), mainActivity2, mainActivity2.getIntent() != null ? mainActivity2.getIntent().getExtras() : null);
            case 5:
                return i60.ag(this.e);
            default:
                MainActivity mainActivity3 = this.e;
                mainActivity3.getLifecycle().a(new qi0(mainActivity3, 0));
                return wz0.a;
        }
    }
}

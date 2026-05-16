package defpackage;

import android.app.Application;
import android.os.Bundle;
import com.example.gnd.MainActivity;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class fm0 implements r11 {
    public final Application a;
    public final q11 b;
    public final Bundle c;
    public final p30 d;
    public final bm0 e;

    public fm0(Application application, MainActivity mainActivity, Bundle bundle) {
        q11 q11Var;
        this.e = mainActivity.getSavedStateRegistry();
        this.d = mainActivity.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (q11.c == null) {
                q11.c = new q11(application);
            }
            q11Var = q11.c;
            q11Var.getClass();
        } else {
            q11Var = new q11(null);
        }
        this.b = q11Var;
    }

    @Override // defpackage.r11
    public final o11 a(Class cls) {
        AutoCloseable autoCloseable;
        Application application;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            wc.n("Local and anonymous classes can not be ViewModels");
            return null;
        }
        p30 p30Var = this.d;
        if (p30Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = e5.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.a == null) ? gm0.a(cls, gm0.b) : gm0.a(cls, gm0.a);
        if (constructorA == null) {
            if (this.a != null) {
                return this.b.a(cls);
            }
            if (s11.a == null) {
                s11.a = new s11();
            }
            s11.a.getClass();
            return t1.k(cls);
        }
        bm0 bm0Var = this.e;
        bm0Var.getClass();
        ul0 ul0VarQ = f00.q(bm0Var.a(canonicalName), this.c);
        vl0 vl0Var = new vl0(canonicalName, ul0VarQ);
        vl0Var.e(p30Var, bm0Var);
        o30 o30Var = ((w30) p30Var).c;
        if (o30Var == o30.e || o30Var.compareTo(o30.g) >= 0) {
            bm0Var.c();
        } else {
            p30Var.a(new jl(p30Var, bm0Var));
        }
        o11 o11VarB = (!zIsAssignableFrom || (application = this.a) == null) ? gm0.b(cls, constructorA, ul0VarQ) : gm0.b(cls, constructorA, application, ul0VarQ);
        o11VarB.getClass();
        p11 p11Var = o11VarB.a;
        if (p11Var == null) {
            return o11VarB;
        }
        if (p11Var.d) {
            p11.a(vl0Var);
            return o11VarB;
        }
        synchronized (p11Var.a) {
            autoCloseable = (AutoCloseable) p11Var.b.put("androidx.lifecycle.savedstate.vm.tag", vl0Var);
        }
        p11.a(autoCloseable);
        return o11VarB;
    }
}

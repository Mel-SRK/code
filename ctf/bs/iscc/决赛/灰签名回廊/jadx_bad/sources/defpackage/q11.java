package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class q11 extends s11 {
    public static q11 c;
    public static final yf0 d = new yf0(22);
    public final Application b;

    public q11(Application application) {
        this.b = application;
    }

    @Override // defpackage.s11, defpackage.r11
    public final o11 a(Class cls) {
        Application application = this.b;
        if (application == null) {
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
        if (!e5.class.isAssignableFrom(cls)) {
            return t1.k(cls);
        }
        try {
            o11 o11Var = (o11) cls.getConstructor(Application.class).newInstance(application);
            o11Var.getClass();
            return o11Var;
        } catch (IllegalAccessException e) {
            wc.k("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            wc.k("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            wc.k("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            wc.k("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}

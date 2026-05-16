package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ux0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static cr a() {
        ThreadLocal threadLocal = a;
        cr crVar = (cr) threadLocal.get();
        if (crVar != null) {
            return crVar;
        }
        f8 f8Var = new f8(Thread.currentThread());
        threadLocal.set(f8Var);
        return f8Var;
    }
}

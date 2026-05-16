package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gs0 {
    public static final /* synthetic */ int a = 0;

    static {
        Object sj0Var;
        Object sj0Var2;
        Exception exc = new Exception();
        String simpleName = d41.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            sj0Var = s7.class.getCanonicalName();
        } catch (Throwable th) {
            sj0Var = new sj0(th);
        }
        if (tj0.a(sj0Var) != null) {
            sj0Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            sj0Var2 = gs0.class.getCanonicalName();
        } catch (Throwable th2) {
            sj0Var2 = new sj0(th2);
        }
        if (tj0.a(sj0Var2) != null) {
            sj0Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

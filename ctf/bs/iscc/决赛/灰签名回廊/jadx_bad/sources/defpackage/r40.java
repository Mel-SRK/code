package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class r40 {
    public static final ai0 a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r1 instanceof defpackage.ai0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r1 = (defpackage.ai0) r1;
     */
    static {
        Object sj0Var;
        try {
            ClassLoader classLoader = em0.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof hm) {
                    break;
                } else {
                    i++;
                }
            }
            sj0Var = null;
        } catch (Throwable th) {
            sj0Var = new sj0(th);
        }
        ai0 xs0Var = (ai0) (sj0Var instanceof sj0 ? null : sj0Var);
        if (xs0Var == null) {
            xs0Var = new xs0(new hg(4));
        }
        a = xs0Var;
    }
}

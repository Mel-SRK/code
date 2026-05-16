package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public abstract class sj {
    public static final List a;

    static {
        try {
            Iterator it = Arrays.asList(new w2()).iterator();
            it.getClass();
            a = pp0.r(new ch(new rp0(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}

package defpackage;

import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class wk {
    public static final pl a;

    static {
        String property;
        pl plVar;
        int i = gu0.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            kl klVar = wm.a;
            cx cxVar = x50.a;
            cx cxVar2 = cxVar.i;
            plVar = cxVar;
            if (cxVar == null) {
                plVar = b.m;
            }
        } else {
            plVar = b.m;
        }
        a = plVar;
    }
}

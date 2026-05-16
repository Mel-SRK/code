package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class o11 {
    public final p11 a = new p11();

    public final void a() {
        p11 p11Var = this.a;
        if (p11Var == null || p11Var.d) {
            return;
        }
        p11Var.d = true;
        synchronized (p11Var.a) {
            try {
                Iterator it = p11Var.b.values().iterator();
                while (it.hasNext()) {
                    p11.a((AutoCloseable) it.next());
                }
                Iterator it2 = p11Var.c.iterator();
                while (it2.hasNext()) {
                    p11.a((AutoCloseable) it2.next());
                }
                p11Var.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

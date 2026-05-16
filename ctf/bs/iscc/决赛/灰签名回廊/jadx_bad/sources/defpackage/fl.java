package defpackage;

import java.util.concurrent.Executor;
import kotlinx.coroutines.a;
import kotlinx.coroutines.d;

/* JADX INFO: loaded from: classes.dex */
public final class fl extends d implements Executor {
    public static final fl f = new fl();
    public static final a g;

    static {
        xz0 xz0Var = xz0.f;
        int i = gu0.a;
        if (64 >= i) {
            i = 64;
        }
        g = xz0Var.f(qo0.n(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.a
    public final void d(pj pjVar, Runnable runnable) {
        g.d(pjVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(pq.d, runnable);
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        return "Dispatchers.IO";
    }
}

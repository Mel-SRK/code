package defpackage;

import kotlinx.coroutines.d;

/* JADX INFO: loaded from: classes.dex */
public final class kl extends d {
    public static final kl g;
    public wj f;

    static {
        int i = wu0.c;
        int i2 = wu0.d;
        long j = wu0.e;
        String str = wu0.a;
        kl klVar = new kl();
        klVar.f = new wj(i, i2, j, str);
        g = klVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.a
    public final void d(pj pjVar, Runnable runnable) {
        wj.c(this.f, runnable, 6);
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        return "Dispatchers.Default";
    }
}

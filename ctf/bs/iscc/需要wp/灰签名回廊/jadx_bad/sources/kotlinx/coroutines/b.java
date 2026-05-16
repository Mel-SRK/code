package kotlinx.coroutines;

import defpackage.er;
import defpackage.ux0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final b m;
    public static final long n;

    static {
        Long l;
        b bVar = new b();
        m = bVar;
        bVar.n(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        n = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // kotlinx.coroutines.c
    public final Thread aa() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(m.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.c
    public final void ac(long j, er erVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void ae() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            c.j.set(this, null);
            c.k.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zAb;
        ux0.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zAb) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jO = o();
                    if (jO == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = n + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            ae();
                            if (ab()) {
                                return;
                            }
                            aa();
                            return;
                        }
                        if (jO > j2) {
                            jO = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jO > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            ae();
                            if (ab()) {
                                return;
                            }
                            aa();
                            return;
                        }
                        LockSupport.parkNanos(this, jO);
                    }
                }
            }
        } finally {
            _thread = null;
            ae();
            if (!ab()) {
                aa();
            }
        }
    }

    @Override // kotlinx.coroutines.c, defpackage.cr
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // kotlinx.coroutines.c
    public final void u(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.u(runnable);
    }
}

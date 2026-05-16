package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class ad implements Future {
    public static final boolean g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger h = Logger.getLogger(ad.class.getName());
    public static final m10 i;
    public static final Object j;
    public volatile Object d;
    public volatile z e;
    public volatile ac f;

    static {
        m10 abVar;
        try {
            abVar = new aa(AtomicReferenceFieldUpdater.newUpdater(ac.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(ac.class, ac.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ad.class, ac.class, "f"), AtomicReferenceFieldUpdater.newUpdater(ad.class, z.class, "e"), AtomicReferenceFieldUpdater.newUpdater(ad.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            abVar = new ab();
        }
        i = abVar;
        if (th != null) {
            h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        j = new Object();
    }

    public static void b(ad adVar) {
        ac acVar;
        z zVar;
        do {
            acVar = adVar.f;
        } while (!i.n(adVar, acVar, ac.c));
        while (acVar != null) {
            Thread thread = acVar.a;
            if (thread != null) {
                acVar.a = null;
                LockSupport.unpark(thread);
            }
            acVar = acVar.b;
        }
        do {
            zVar = adVar.e;
        } while (!i.l(adVar, zVar));
        z zVar2 = null;
        while (zVar != null) {
            z zVar3 = zVar.a;
            zVar.a = zVar2;
            zVar2 = zVar;
            zVar = zVar3;
        }
        while (zVar2 != null) {
            zVar2 = zVar2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                h.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof x) {
            Throwable th = ((x) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof y) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == j) {
            return null;
        }
        return obj;
    }

    public static Object d(ad adVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = adVar.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objD == this ? "this future" : String.valueOf(objD));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.d;
        if (obj != null) {
            return false;
        }
        if (!i.m(this, obj, g ? new x(new CancellationException("Future.cancel() was called."), z) : z ? x.b : x.c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(ac acVar) {
        acVar.a = null;
        while (true) {
            ac acVar2 = this.f;
            if (acVar2 == ac.c) {
                return;
            }
            ac acVar3 = null;
            while (acVar2 != null) {
                ac acVar4 = acVar2.b;
                if (acVar2.a != null) {
                    acVar3 = acVar2;
                } else if (acVar3 != null) {
                    acVar3.b = acVar4;
                    if (acVar3.a == null) {
                        break;
                    }
                } else if (!i.n(this, acVar2, acVar4)) {
                    break;
                }
                acVar2 = acVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        ac acVar = ac.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.d;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            ac acVar2 = this.f;
            if (acVar2 != acVar) {
                ac acVar3 = new ac();
                do {
                    m10 m10Var = i;
                    m10Var.ao(acVar3, acVar2);
                    if (m10Var.n(this, acVar2, acVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(acVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.d;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(acVar3);
                    } else {
                        acVar2 = this.f;
                    }
                } while (acVar2 != acVar);
            }
            return c(this.d);
        }
        while (nanos > 0) {
            Object obj3 = this.d;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof x;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.d instanceof x) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        ac acVar = ac.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.d;
            if (obj2 != null) {
                return c(obj2);
            }
            ac acVar2 = this.f;
            if (acVar2 != acVar) {
                ac acVar3 = new ac();
                do {
                    m10 m10Var = i;
                    m10Var.ao(acVar3, acVar2);
                    if (m10Var.n(this, acVar2, acVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.d;
                            } else {
                                e(acVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    acVar2 = this.f;
                } while (acVar2 != acVar);
            }
            return c(this.d);
        }
        throw new InterruptedException();
    }
}

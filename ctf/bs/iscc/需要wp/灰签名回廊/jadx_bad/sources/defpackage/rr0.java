package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class rr0 {
    public final x10 a;
    public boolean c;
    public gb0 h;
    public qr0 i;
    public final AtomicReference b = new AtomicReference(null);
    public final n3 d = new n3(5, this);
    public final h e = new h(10, this);
    public final a90 f = new a90(new qr0[16]);
    public final Object g = new Object();
    public long j = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public rr0(cv cvVar) {
        this.a = (x10) cvVar;
    }

    public final void a() {
        synchronized (this.g) {
            a90 a90Var = this.f;
            Object[] objArr = a90Var.d;
            int i = a90Var.f;
            for (int i2 = 0; i2 < i; i2++) {
                qr0 qr0Var = (qr0) objArr[i2];
                qr0Var.e.a();
                qr0Var.f.a();
                qr0Var.k.a();
                qr0Var.l.clear();
            }
        }
    }

    public final boolean b() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        xf.d("Unexpected notification");
                        throw new xd();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                a90 a90Var = this.f;
                Object[] objArr = a90Var.d;
                int i = a90Var.f;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((qr0) objArr[i2]).b(set) || z2;
                }
            }
        }
    }

    public final void c(Object obj, cv cvVar, pu puVar) {
        Object obj2;
        qr0 qr0Var;
        synchronized (this.g) {
            a90 a90Var = this.f;
            Object[] objArr = a90Var.d;
            int i = a90Var.f;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i2];
                if (((qr0) obj2).a == cvVar) {
                    break;
                } else {
                    i2++;
                }
            }
            qr0Var = (qr0) obj2;
            if (qr0Var == null) {
                cvVar.getClass();
                az0.p(1, cvVar);
                qr0Var = new qr0(cvVar);
                a90Var.b(qr0Var);
            }
        }
        qr0 qr0Var2 = this.i;
        long j = this.j;
        if (j != -1 && j != go0.e()) {
            dh0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + go0.e() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.i = qr0Var;
            this.j = go0.e();
            qr0Var.a(obj, this.e, puVar);
        } finally {
            this.i = qr0Var2;
            this.j = j;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void d() {
        n3 n3Var = this.d;
        fr0.f(fr0.a);
        synchronized (fr0.c) {
            fr0.h = kc.ay(fr0.h, n3Var);
        }
        this.h = new gb0(n3Var);
    }
}

package defpackage;

import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public final class zw implements Runnable {
    public final /* synthetic */ int d = 0;
    public Runnable e;
    public final /* synthetic */ a f;

    public zw(la laVar, cx cxVar) {
        this.e = laVar;
        this.f = cxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((la) this.e).ae((cx) this.f);
                break;
            default:
                y30 y30Var = (y30) this.f;
                a aVar = y30Var.g;
                int i = 0;
                while (true) {
                    try {
                        this.e.run();
                    } catch (Throwable th) {
                        m10.ae(pq.d, th);
                    }
                    Runnable runnableH = y30Var.h();
                    if (runnableH == null) {
                        break;
                    } else {
                        this.e = runnableH;
                        i++;
                        if (i >= 16 && aVar.e(y30Var)) {
                            aVar.d(y30Var, this);
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public zw(y30 y30Var, Runnable runnable) {
        this.f = y30Var;
        this.e = runnable;
    }
}

package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public final class cx extends a implements pl {
    public final Handler f;
    public final String g;
    public final boolean h;
    public final cx i;

    public cx(Handler handler, String str, boolean z) {
        this.f = handler;
        this.g = str;
        this.h = z;
        this.i = z ? this : new cx(handler, str, true);
    }

    @Override // defpackage.pl
    public final void c(long j, la laVar) {
        zw zwVar = new zw(laVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f.postDelayed(zwVar, j)) {
            laVar.v(new yw(0, this, zwVar));
        } else {
            h(laVar.h, zwVar);
        }
    }

    @Override // kotlinx.coroutines.a
    public final void d(pj pjVar, Runnable runnable) {
        if (this.f.post(runnable)) {
            return;
        }
        h(pjVar, runnable);
    }

    @Override // kotlinx.coroutines.a
    public final boolean e(pj pjVar) {
        return (this.h && f00.h(Looper.myLooper(), this.f.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cx)) {
            return false;
        }
        cx cxVar = (cx) obj;
        return cxVar.f == this.f && cxVar.h == this.h;
    }

    public final void h(pj pjVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        t00 t00Var = (t00) pjVar.k(bw.ae);
        if (t00Var != null) {
            t00Var.a(cancellationException);
        }
        kl klVar = wm.a;
        fl.f.d(pjVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f) ^ (this.h ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        cx cxVar;
        String str;
        kl klVar = wm.a;
        cx cxVar2 = x50.a;
        if (this == cxVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cxVar = cxVar2.i;
            } catch (UnsupportedOperationException unused) {
                cxVar = null;
            }
            str = this == cxVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.g;
        if (string == null) {
            string = this.f.toString();
        }
        if (!this.h) {
            return string;
        }
        return string + ".immediate";
    }

    public cx(Handler handler) {
        this(handler, null, false);
    }
}

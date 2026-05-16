package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yw implements cv {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yw(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        switch (this.d) {
            case 0:
                ((cx) this.e).f.removeCallbacks((zw) this.f);
                break;
            case 1:
                jg jgVar = (jg) this.e;
                r80 r80Var = (r80) this.f;
                jgVar.v(obj);
                if (r80Var != null) {
                    r80Var.a(obj);
                }
                return wz0.a;
            default:
                mi0 mi0Var = (mi0) this.e;
                Throwable th = (Throwable) this.f;
                Throwable th2 = (Throwable) obj;
                synchronized (mi0Var.b) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                t1.g(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    mi0Var.d = th;
                    ps0 ps0Var = mi0Var.t;
                    ii0 ii0Var = ii0.d;
                    ps0Var.getClass();
                    ps0Var.h(null, ii0Var);
                    break;
                }
                break;
        }
        return wz0.a;
    }
}

package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class um extends uu0 {
    public int f;

    public um(int i) {
        super(0L, false);
        this.f = i;
    }

    public abstract ji c();

    public Throwable f(Object obj) {
        wd wdVar = obj instanceof wd ? (wd) obj : null;
        if (wdVar != null) {
            return wdVar.a;
        }
        return null;
    }

    public final void i(Throwable th) {
        m10.ae(c().e(), new dk("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ji jiVarC = c();
            jiVarC.getClass();
            sm smVar = (sm) jiVarC;
            ki kiVar = smVar.h;
            Object obj = smVar.j;
            pj pjVarE = kiVar.e();
            Object objAw = t1.aw(pjVarE, obj);
            t00 t00Var = null;
            uz0 uz0VarAp = objAw != t1.h ? e00.ap(kiVar, pjVarE, objAw) : null;
            try {
                pj pjVarE2 = kiVar.e();
                Object objJ = j();
                Throwable thF = f(objJ);
                if (thF == null) {
                    int i = this.f;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        t00Var = (t00) pjVarE2.k(bw.ae);
                    }
                }
                if (t00Var != null && !t00Var.b()) {
                    CancellationException cancellationExceptionQ = t00Var.q();
                    b(cancellationExceptionQ);
                    kiVar.h(i60.aa(cancellationExceptionQ));
                } else if (thF != null) {
                    kiVar.h(new sj0(thF));
                } else {
                    kiVar.h(g(objJ));
                }
                if (uz0VarAp != null && !uz0VarAp.bh()) {
                    return;
                }
                t1.at(pjVarE, objAw);
            } catch (Throwable th) {
                if (uz0VarAp == null || uz0VarAp.bh()) {
                    t1.at(pjVarE, objAw);
                }
                throw th;
            }
        } catch (Throwable th2) {
            i(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}

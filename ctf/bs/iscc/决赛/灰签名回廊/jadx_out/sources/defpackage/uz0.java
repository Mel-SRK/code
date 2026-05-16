package defpackage;

import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public final class uz0 extends pm0 {
    public final ThreadLocal h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public uz0(pj pjVar, tt0 tt0Var) {
        na naVar = na.f;
        super(tt0Var, pjVar.k(naVar) == null ? pjVar.j(naVar) : pjVar);
        this.h = new ThreadLocal();
        pj pjVar2 = tt0Var.e;
        pjVar2.getClass();
        if (pjVar2.k(bw.u) instanceof a) {
            return;
        }
        Object objAw = t1.aw(pjVar, null);
        t1.at(pjVar, objAw);
        bi(pjVar, objAw);
    }

    @Override // defpackage.pm0, defpackage.a10
    public final void aa(Object obj) {
        if (this.threadLocalIsSet) {
            ae0 ae0Var = (ae0) this.h.get();
            if (ae0Var != null) {
                t1.at((pj) ae0Var.d, ae0Var.e);
            }
            this.h.remove();
        }
        Object objAn = d41.an(obj);
        ji jiVar = this.g;
        pj pjVarE = jiVar.e();
        Object objAw = t1.aw(pjVarE, null);
        uz0 uz0VarAp = objAw != t1.h ? e00.ap(jiVar, pjVarE, objAw) : null;
        try {
            this.g.h(objAn);
            if (uz0VarAp == null || uz0VarAp.bh()) {
                t1.at(pjVarE, objAw);
            }
        } catch (Throwable th) {
            if (uz0VarAp == null || uz0VarAp.bh()) {
                t1.at(pjVarE, objAw);
            }
            throw th;
        }
    }

    public final boolean bh() {
        boolean z = this.threadLocalIsSet && this.h.get() == null;
        this.h.remove();
        return !z;
    }

    public final void bi(pj pjVar, Object obj) {
        this.threadLocalIsSet = true;
        this.h.set(new ae0(pjVar, obj));
    }
}

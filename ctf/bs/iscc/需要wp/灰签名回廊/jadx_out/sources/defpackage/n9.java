package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class n9 implements w11 {
    public Object d = q9.p;
    public la e;
    public final /* synthetic */ o9 f;

    public n9(o9 o9Var) {
        this.f = o9Var;
    }

    @Override // defpackage.w11
    public final void a(un0 un0Var, int i) {
        la laVar = this.e;
        if (laVar != null) {
            laVar.a(un0Var, i);
        }
    }

    public final Object b(ki kiVar) {
        kb kbVarL;
        Object obj = this.d;
        boolean z = true;
        if (obj == q9.p || obj == q9.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o9.j;
            o9 o9Var = this.f;
            kb kbVar = (kb) atomicReferenceFieldUpdater.get(o9Var);
            while (true) {
                o9Var.getClass();
                if (o9Var.t(o9.e.get(o9Var), true)) {
                    this.d = q9.l;
                    Throwable thM = o9Var.m();
                    if (thM != null) {
                        int i = gs0.a;
                        throw thM;
                    }
                    z = false;
                } else {
                    long andIncrement = o9.f.getAndIncrement(o9Var);
                    long j = q9.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (kbVar.c != j2) {
                        kbVarL = o9Var.l(j2, kbVar);
                        if (kbVarL == null) {
                            continue;
                        }
                    } else {
                        kbVarL = kbVar;
                    }
                    Object objAc = o9Var.ac(kbVarL, i2, andIncrement, null);
                    jq jqVar = q9.m;
                    if (objAc == jqVar) {
                        wc.q("unreachable");
                        return null;
                    }
                    jq jqVar2 = q9.o;
                    if (objAc == jqVar2) {
                        if (andIncrement < o9Var.q()) {
                            kbVarL.a();
                        }
                        kbVar = kbVarL;
                    } else {
                        if (objAc == q9.n) {
                            o9 o9Var2 = this.f;
                            la laVarZ = t1.z(f00.x(kiVar));
                            try {
                                this.e = laVarZ;
                                Object objAc2 = o9Var2.ac(kbVarL, i2, andIncrement, this);
                                if (objAc2 == jqVar) {
                                    a(kbVarL, i2);
                                } else {
                                    if (objAc2 == jqVar2) {
                                        if (andIncrement < o9Var2.q()) {
                                            kbVarL.a();
                                        }
                                        kb kbVar2 = (kb) o9.j.get(o9Var2);
                                        while (true) {
                                            if (o9Var2.t(o9.e.get(o9Var2), true)) {
                                                la laVar = this.e;
                                                laVar.getClass();
                                                this.e = null;
                                                this.d = q9.l;
                                                Throwable thM2 = o9Var.m();
                                                if (thM2 == null) {
                                                    laVar.h(Boolean.FALSE);
                                                } else {
                                                    laVar.h(new sj0(thM2));
                                                }
                                            } else {
                                                long andIncrement2 = o9.f.getAndIncrement(o9Var2);
                                                long j3 = q9.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (kbVar2.c != j4) {
                                                    kb kbVarL2 = o9Var2.l(j4, kbVar2);
                                                    if (kbVarL2 != null) {
                                                        kbVar2 = kbVarL2;
                                                    }
                                                }
                                                Object objAc3 = o9Var2.ac(kbVar2, i3, andIncrement2, this);
                                                if (objAc3 == q9.m) {
                                                    a(kbVar2, i3);
                                                    break;
                                                }
                                                if (objAc3 == q9.o) {
                                                    if (andIncrement2 < o9Var2.q()) {
                                                        kbVar2.a();
                                                    }
                                                } else {
                                                    if (objAc3 == q9.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kbVar2.a();
                                                    this.d = objAc3;
                                                    this.e = null;
                                                }
                                            }
                                        }
                                    } else {
                                        kbVarL.a();
                                        this.d = objAc2;
                                        this.e = null;
                                    }
                                    laVarZ.ac(Boolean.TRUE, null);
                                }
                                return laVarZ.s();
                            } catch (Throwable th) {
                                laVarZ.ab();
                                throw th;
                            }
                        }
                        kbVarL.a();
                        this.d = objAc;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.d;
        jq jqVar = q9.p;
        if (obj == jqVar) {
            wc.q("`hasNext()` has not been invoked");
            return null;
        }
        this.d = jqVar;
        if (obj != q9.l) {
            return obj;
        }
        Throwable thN = this.f.n();
        int i = gs0.a;
        throw thN;
    }
}

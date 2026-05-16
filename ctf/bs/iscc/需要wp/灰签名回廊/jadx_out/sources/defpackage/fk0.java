package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class fk0 extends tt0 implements gv {
    public final /* synthetic */ int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk0(Object obj, ji jiVar, int i) {
        super(2, jiVar);
        this.h = i;
        this.j = obj;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        xj xjVar = (xj) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
        }
        return ((fk0) k(jiVar, xjVar)).o(wz0.a);
    }

    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                fk0 fk0Var = new fk0((gk0) this.j, jiVar, 0);
                fk0Var.i = obj;
                return fk0Var;
            case 1:
                fk0 fk0Var2 = new fk0((gk0) this.j, jiVar, 1);
                fk0Var2.i = obj;
                return fk0Var2;
            default:
                fk0 fk0Var3 = new fk0((kk) this.j, jiVar, 2);
                fk0Var3.i = obj;
                return fk0Var3;
        }
    }

    @Override // defpackage.s7
    public final Object o(Object obj) {
        boolean z;
        switch (this.h) {
            case 0:
                i60.az(obj);
                xj xjVar = (xj) this.i;
                gk0 gk0Var = (gk0) this.j;
                ji jiVar = null;
                i60.an(xjVar, null, new ek0(gk0Var, jiVar, 0), 3);
                i60.an(xjVar, null, new ek0(gk0Var, jiVar, 1), 3);
                return i60.an(xjVar, null, new ek0(gk0Var, jiVar, 2), 3);
            case 1:
                i60.az(obj);
                return i60.an((xj) this.i, null, new ek0((gk0) this.j, null, 3), 3);
            default:
                i60.az(obj);
                xj xjVar2 = (xj) this.i;
                kk kkVar = (kk) this.j;
                t00 t00Var = (t00) kkVar.a.getAndSet(null);
                AtomicReference atomicReference = kkVar.a;
                hs0 hs0VarAn = i60.an(xjVar2, null, new c(t00Var, kkVar, null, 12), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, hs0VarAn)) {
                        z = true;
                    } else if (atomicReference.get() != null) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}

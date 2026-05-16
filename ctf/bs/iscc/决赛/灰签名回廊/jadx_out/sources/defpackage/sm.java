package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public final class sm extends um implements zj, ji {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(sm.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final a g;
    public final ki h;
    public Object i;
    public final Object j;

    public sm(a aVar, ki kiVar) {
        super(-1);
        this.g = aVar;
        this.h = kiVar;
        this.i = az0.b;
        this.j = t1.av(kiVar.e());
    }

    @Override // defpackage.zj
    public final zj d() {
        return this.h;
    }

    @Override // defpackage.ji
    public final pj e() {
        return this.h.e();
    }

    @Override // defpackage.ji
    public final void h(Object obj) {
        Throwable thA = tj0.a(obj);
        Object wdVar = thA == null ? obj : new wd(thA, false);
        ki kiVar = this.h;
        pj pjVarE = kiVar.e();
        a aVar = this.g;
        if (aVar.e(pjVarE)) {
            this.i = wdVar;
            this.f = 0;
            aVar.d(kiVar.e(), this);
            return;
        }
        cr crVarA = ux0.a();
        if (crVarA.f >= 4294967296L) {
            this.i = wdVar;
            this.f = 0;
            crVarA.l(this);
            return;
        }
        crVarA.n(true);
        try {
            pj pjVarE2 = kiVar.e();
            Object objAw = t1.aw(pjVarE2, this.j);
            try {
                kiVar.h(obj);
                while (crVarA.s()) {
                }
            } finally {
                t1.at(pjVarE2, objAw);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // defpackage.um
    public final Object j() {
        Object obj = this.i;
        this.i = az0.b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.g + ", " + pk.bi(this.h) + ']';
    }

    @Override // defpackage.um
    public final ji c() {
        return this;
    }
}

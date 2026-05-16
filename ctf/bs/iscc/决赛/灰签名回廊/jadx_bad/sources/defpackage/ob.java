package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ob extends w00 {
    public final /* synthetic */ int h;
    public final la i;

    public /* synthetic */ ob(la laVar, int i) {
        this.h = i;
        this.i = laVar;
    }

    @Override // defpackage.w00
    public final boolean k() {
        switch (this.h) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.w00
    public final void l(Throwable th) {
        switch (this.h) {
            case 0:
                a10 a10VarJ = j();
                la laVar = this.i;
                Throwable thR = laVar.r(a10VarJ);
                if (laVar.x()) {
                    sm smVar = (sm) laVar.g;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sm.k;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(smVar);
                        jq jqVar = az0.c;
                        if (f00.h(obj, jqVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(smVar, jqVar, thR)) {
                                if (atomicReferenceFieldUpdater.get(smVar) != jqVar) {
                                }
                                break;
                            }
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(smVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(smVar) != obj) {
                                }
                            }
                        }
                    }
                }
                laVar.n(thR);
                if (!laVar.x()) {
                    laVar.p();
                }
                break;
            default:
                this.i.h(wz0.a);
                break;
        }
    }
}

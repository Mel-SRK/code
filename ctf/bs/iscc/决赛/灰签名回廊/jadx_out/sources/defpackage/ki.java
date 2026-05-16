package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class ki extends s7 {
    public final pj e;
    public transient ji f;

    public ki(ji jiVar) {
        this(jiVar, jiVar != null ? jiVar.e() : null);
    }

    @Override // defpackage.ji
    public pj e() {
        pj pjVar = this.e;
        pjVar.getClass();
        return pjVar;
    }

    @Override // defpackage.s7
    public void p() {
        ji jiVar = this.f;
        if (jiVar != null && jiVar != this) {
            nj njVarK = e().k(bw.u);
            njVarK.getClass();
            sm smVar = (sm) jiVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sm.k;
            while (atomicReferenceFieldUpdater.get(smVar) == az0.c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(smVar);
            la laVar = obj instanceof la ? (la) obj : null;
            if (laVar != null) {
                laVar.p();
            }
        }
        this.f = vd.e;
    }

    public ki(ji jiVar, pj pjVar) {
        super(jiVar);
        this.e = pjVar;
    }
}

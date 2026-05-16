package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class v00 extends a10 {
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v00(t00 t00Var) {
        super(true);
        boolean z = true;
        ap(t00Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a10.e;
        pb pbVar = (pb) atomicReferenceFieldUpdater.get(this);
        qb qbVar = pbVar instanceof qb ? (qb) pbVar : null;
        if (qbVar == null) {
            z = false;
            break;
        }
        a10 a10VarJ = qbVar.j();
        while (!a10VarJ.ak()) {
            pb pbVar2 = (pb) atomicReferenceFieldUpdater.get(a10VarJ);
            qb qbVar2 = pbVar2 instanceof qb ? (qb) pbVar2 : null;
            if (qbVar2 == null) {
                z = false;
                break;
            }
            a10VarJ = qbVar2.j();
        }
        this.f = z;
    }

    @Override // defpackage.a10
    public final boolean ak() {
        return this.f;
    }

    @Override // defpackage.a10
    public final boolean al() {
        return true;
    }
}

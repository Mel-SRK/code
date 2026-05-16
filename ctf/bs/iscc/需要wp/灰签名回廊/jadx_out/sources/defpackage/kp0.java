package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class kp0 extends un0 {
    public final /* synthetic */ AtomicReferenceArray e;

    public kp0(long j, kp0 kp0Var, int i) {
        super(j, kp0Var, i);
        this.e = new AtomicReferenceArray(jp0.f);
    }

    @Override // defpackage.un0
    public final int f() {
        return jp0.f;
    }

    @Override // defpackage.un0
    public final void g(int i, pj pjVar) {
        this.e.set(i, jp0.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
